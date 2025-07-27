### 1. **Define Props**

* **Props** (short for "properties") are **inputs** to a React component. They are passed from a parent component to a child component to share data or functions.
* Props are **immutable**—they cannot be changed inside the child component.

**Example**:

```javascript
function Greeting(props) {
  return <h1>Hello, {props.name}!</h1>;
}

<Greeting name="Alice" />
```

### 2. **Explain Default Props**

* **Default Props** are used to provide default values to props if no value is passed from the parent.
* This is useful when you want to ensure a prop always has a value, even if the parent component doesn't pass it.

**Example**:

```javascript
function Greeting(props) {
  return <h1>Hello, {props.name}!</h1>;
}

Greeting.defaultProps = {
  name: "Guest", // Default value for name
};

<Greeting />  // Will render: "Hello, Guest!"
```

### 3. **Identify the Differences Between State and Props**

| **State**                                               | **Props**                                                       |
| ------------------------------------------------------- | --------------------------------------------------------------- |
| Managed inside the **component**.                       | Passed **from parent to child** components.                     |
| **Mutable**—can be changed by the component.            | **Immutable**—cannot be changed by the child component.         |
| Used for **dynamic data** that changes over time.       | Used to **pass data** from parent to child, often static.       |
| Changes in state trigger re-rendering of the component. | Props don't cause re-rendering unless they change (via parent). |

**Example**:

```javascript
function Counter() {
  const [count, setCount] = useState(0);  // State

  return (
    <div>
      <p>{count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}

function Parent() {
  return <Counter />;  // Passing no props to Counter
}
```

### 4. **Explain `reactDOM.render()`**

* `reactDOM.render()` is used to **render** a React component to the DOM (usually in the root div of the HTML page).
* It is called once at the entry point of the app to render the root component.

**Syntax**:

```javascript
ReactDOM.render(
  <App />,  // Component to render
  document.getElementById('root')  // DOM element to render it into
);
```

* **`<App />`** is the React component you want to render.
* **`document.getElementById('root')`** refers to the DOM element where the app will be rendered (commonly a `<div id="root"></div>` in `index.html`).

**Note**: `reactDOM.render()` is mainly used in **React 17 and below**. Starting from **React 18**, `ReactDOM.render()` has been replaced by `ReactDOM.createRoot()` for better performance.
