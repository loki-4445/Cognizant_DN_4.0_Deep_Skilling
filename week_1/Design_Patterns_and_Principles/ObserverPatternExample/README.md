# 👁️ ObserverPatternExample

## 💼 Exercise 7: Implementing the Observer Pattern

---

### 📘 Scenario

You are developing a **Stock Market Monitoring Application** where multiple clients (e.g., mobile apps, web apps) must be **notified automatically** when stock prices change. The **Observer Pattern** helps in broadcasting updates to all registered observers.

---

### ✅ Implementation Steps

1. **Created Java Project**
   - Project name: `ObserverPatternExample`

2. **Defined Subject Interface**
   - `Stock.java` interface with methods:
     - `registerObserver(Observer o)`
     - `removeObserver(Observer o)`
     - `notifyObservers()`

3. **Implemented Concrete Subject**
   - `StockMarket.java` implements `Stock`
   - Maintains a list of registered observers
   - Calls `update()` on observers when stock price changes

4. **Defined Observer Interface**
   - `Observer.java` with method `update(double price)`

5. **Implemented Concrete Observers**
   - `MobileApp.java` and `WebApp.java` implement `Observer`
   - Print the new stock price when notified

6. **Tested the Pattern**
   - `ObserverPatternDemo.java` demonstrates observer registration, stock updates, and notifications

---

### 📁 Project Structure

ObserverPatternExample/  
├── Stock.java  
├── StockMarket.java  
├── Observer.java  
├── MobileApp.java  
├── WebApp.java  
├── ObserverPatternDemo.java  
├── *.class files  
├── output.png  
└── README.md  


🖼️ ![Sample Output](./output.png)

---

### 🧠 Pattern Insight

- **Observer Pattern** is used when a change in one object (subject) needs to notify a list of dependents (observers).
- Promotes **loose coupling** between the subject and its observers.
- Frequently used in **event-driven systems**, **GUIs**, and **real-time monitoring** apps.

---

### ▶️ How to Run

1. Compile:
   ```bash
   javac *.java
2. Run:
   ```bash
   java ObserverPatternDemo

