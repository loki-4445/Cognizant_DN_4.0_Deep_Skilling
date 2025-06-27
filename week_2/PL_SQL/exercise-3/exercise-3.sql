create table savings_acc (
accId int primary key ,
customerID int,
balance float,
foreign key (customerID) references customers(customerID)

);
--inserting the dummy data
INSERT INTO savings_acc VALUES (1, 1, 12020);
INSERT INTO savings_acc VALUES (2, 1, 19922);
INSERT INTO savings_acc VALUES (3, 2, 29292.29);
INSERT INTO savings_acc VALUES (4, 3, 9.92);
INSERT INTO savings_acc VALUES (5, 4, 839983);
INSERT INTO savings_acc VALUES (6, 5, 99494.44);
INSERT INTO savings_acc VALUES (7, 6, 100);
--scenarios-1:The bank needs to process monthly interest for all savings accounts.

create or replace procedure ProcessMonthlyInterest
as 
begin
for acc in(select accId,balance from savings_acc)  loop
update savings_acc set 
balance=acc.balance+(acc.balance*0.01)
where accId=acc.accId;
end loop;
commit;
end;
/
--calling the procedure
call ProcessMonthlyInterest();
--for output
select * from savings_acc;




--scenario-2:
CREATE TABLE employees (
  empID INT PRIMARY KEY,
  empName VARCHAR2(30),
  department VARCHAR2(20),
  salary FLOAT
);

-- Sample data
INSERT INTO employees VALUES (1, 'Alice', 'HR', 40000);
INSERT INTO employees VALUES (2, 'Bob', 'IT', 50000);
INSERT INTO employees VALUES (3, 'Charlie', 'IT', 60000);
INSERT INTO employees VALUES (4, 'David', 'Finance', 45000);
COMMIT;

--creating a procedure
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  deptName IN VARCHAR2,
  bonusPercent IN FLOAT
) AS
BEGIN
  UPDATE employees
  SET salary = salary + (salary * (bonusPercent / 100))
  WHERE department = deptName;
  COMMIT;
END;
/
-- before call 
select * from employees;
--calling the procedure
BEGIN
  UpdateEmployeeBonus('IT', 10); -- 10% bonus for IT department
END;
/
-- after call 
select * from employees;


--scenario-3
CREATE OR REPLACE PROCEDURE TransferFunds (
  fromAccId IN INT,
  toAccId IN INT,
  amount IN FLOAT
) AS
  insufficient_balance EXCEPTION;
BEGIN
  -- Check if balance is enough
  DECLARE
    from_balance FLOAT;
  BEGIN
    SELECT balance INTO from_balance FROM savings_acc WHERE accId = fromAccId;

    IF from_balance < amount THEN
      RAISE insufficient_balance;
    END IF;

    -- Deduct from sender
    UPDATE savings_acc
    SET balance = balance - amount
    WHERE accId = fromAccId;

    -- Add to receiver
    UPDATE savings_acc
    SET balance = balance + amount
    WHERE accId = toAccId;

    COMMIT;
  END;

EXCEPTION
  WHEN insufficient_balance THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance in source account.');
END;
/
--intial balacne 
-- before call 
select * from savings_acc;
--calling 
BEGIN
  TransferFunds(2, 4, 5000); -- Transfer ₹5000 from accId 2 to accId 4
END;
/
--after call 
select * from savings_acc;