--1.set the server output 
SET SERVEROUTPUT ON;
-- 2. Create CUSTOMERS table
CREATE TABLE customers (
    customerID INT PRIMARY KEY,
    customerName VARCHAR(20),
    age INT,
    loanInterest FLOAT,
    isVip CHAR(1) CHECK (isVip IN ('Y', 'N')),
    balance FLOAT
);

-- 3. Create LOANS table
CREATE TABLE loans (
    loanID INT PRIMARY KEY,
    customerID INT,
    dueDate DATE,
    FOREIGN KEY (customerID) REFERENCES customers(customerID)
);

-- 4. Insert sample data into CUSTOMERS
INSERT INTO customers VALUES (1, 'Alice', 65, 10.0, 'N', 5000);
INSERT INTO customers VALUES (2, 'Bob', 45, 9.5, 'N', 15000);
INSERT INTO customers VALUES (3, 'Charlie', 70, 11.0, 'N', 12000);
INSERT INTO customers VALUES (4, 'David', 55, 8.5, 'N', 8000);
INSERT INTO customers VALUES (5, 'Eva', 61, 10.5, 'N', 9500);
INSERT INTO customers VALUES (6, 'Frank', 35, 12.0, 'N', 18000);
COMMIT;

-- 5. Insert sample data into LOANS
INSERT INTO loans VALUES (101, 1, SYSDATE + 10); -- Alice, due in 10 days
INSERT INTO loans VALUES (102, 2, SYSDATE + 40); -- Bob, due in 40 days
INSERT INTO loans VALUES (103, 3, SYSDATE + 5);  -- Charlie, due in 5 days
COMMIT;

-- 6. SCENARIO 1: Discount interest rate for customers age > 60
BEGIN
  FOR cust IN (SELECT customerID, age, loanInterest FROM customers) LOOP
    IF cust.age > 60 THEN
      UPDATE customers
      SET loanInterest = loanInterest - 1
      WHERE customerID = cust.customerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/
--for output
select * from customers;
-- 7. SCENARIO 2: Promote to VIP if balance > 10,000
BEGIN
  FOR cust IN (SELECT customerID, balance FROM customers) LOOP
    IF cust.balance > 10000 THEN
      UPDATE customers
      SET isVip = 'Y'
      WHERE customerID = cust.customerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/
--for output
select * from customers;
-- 8. SCENARIO 3: Print reminders for loans due within next 30 days
BEGIN
  FOR rec IN (
    SELECT c.customerName, l.dueDate
    FROM loans l
    JOIN customers c ON l.customerID = c.customerID
    WHERE l.dueDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: ' || rec.customerName || ' has a loan due on ' || TO_CHAR(rec.dueDate, 'DD-Mon-YYYY'));
  END LOOP;
END;
/
