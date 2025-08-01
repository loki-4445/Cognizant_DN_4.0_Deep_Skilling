###  **1. Define JSX**

**JSX (JavaScript XML)** is a **syntax extension** for JavaScript used in React. It allows you to **write HTML-like code directly inside your JavaScript files**. This makes it easier to design user interfaces because the code structure looks very similar to how elements appear in the browser.

Instead of writing complex JavaScript code to describe UI, JSX lets you do this:

```jsx
const element = <h1>Hello, world!</h1>;
```

JSX is **not understood by browsers directly**, so tools like **Babel** are used to convert JSX into regular JavaScript that React can process.

🔹 **Behind the scenes**, the above code is transformed into:

```js
React.createElement('h1', null, 'Hello, world!');
```

---

###  **2. Explain about ECMAScript**

**ECMAScript (ES)** is the **official standard** that defines how scripting languages like **JavaScript** should work. It includes rules about how variables, functions, loops, objects, and classes should behave.

Each version of ECMAScript introduces new features. For example:

* **ES5 (2009)** – `Array.forEach()`, `Object.keys()`, strict mode
* **ES6 / ES2015** – `let`, `const`, arrow functions, classes, promises, template strings
* **ES7 and beyond** – `async/await`, spread operator, optional chaining, etc.

React apps commonly use **modern ECMAScript (ES6+)** for better performance and cleaner code.

Example:

```js
const name = "Lokesh";
console.log(`Hello, ${name}`); // Template string (ES6)
```

---

###  **3. Explain `React.createElement()`**

`React.createElement()` is a **core React function** that builds a virtual DOM node.

**Syntax:**

```js
React.createElement(type, props, children);
```

* `type`: The type of element (e.g., `'div'` or a React component)
* `props`: An object of properties or attributes (e.g., `{ className: "myDiv" }`)
* `children`: What goes inside the element (text or other elements)

**Example:**

```js
React.createElement('h1', { className: 'title' }, 'Hello World!');
```

JSX is just **syntactic sugar** for `React.createElement()`. The JSX:

```jsx
<h1 className="title">Hello World!</h1>
```

Is compiled into the above function call.

---

###  **4. How to Create React Nodes with JSX**

A **React node** is anything that can be rendered to the UI—this includes elements, components, strings, numbers, arrays, etc.

Using JSX, you can create these nodes by writing familiar HTML-style tags:

```jsx
<div>
  <h1>Hello, User!</h1>
  <p>Welcome to React.</p>
</div>
```

You can also **nest elements** and use **JavaScript expressions** inside `{}` to dynamically generate parts of the UI:

```jsx
const name = "Lokesh";
return <h1>Hello, {name}!</h1>;
```

This will render as:

```html
<h1>Hello, Lokesh!</h1>
```

---

###  **5. Define How to Render JSX to the DOM**

To display JSX on the browser screen, you use the **ReactDOM.render()** method.

**Syntax:**

```js
ReactDOM.render(whatToRender, whereToRender);
```

* `whatToRender`: A React element (JSX or `React.createElement()`)
* `whereToRender`: A real DOM node in your HTML (e.g., a `div` with id="root")

**Example:**

```jsx
const element = <h1>Hello, React!</h1>;
ReactDOM.render(element, document.getElementById('root'));
```

React will render the `element` inside the DOM node with id `"root"`.

---

###  **6. How to Use JavaScript Expressions in JSX**

JSX allows you to insert **JavaScript expressions** inside your HTML-like code using **curly braces `{}`**.

**What’s allowed:**

* Variables
* Function calls
* Math operations
* Conditional (ternary) expressions

**Example:**

```jsx
const user = { name: "Lokesh", age: 25 };
<h1>Welcome, {user.name}!</h1>
```

You can also write expressions:

```jsx
<p>Age next year: {user.age + 1}</p>
```

🔴 **Not allowed:** Full statements like `if`, `for`, `while`—use expressions like ternary or map inside JSX.

---

###  **7. How to Use Inline CSS in JSX**

You can apply styles directly to JSX elements using the `style` attribute.
But unlike HTML where it's a string, in JSX it must be a **JavaScript object**.

**Key points:**

* Use **camelCase** for property names (e.g., `backgroundColor`, not `background-color`)
* Pass an **object**, not a string
* Values should be strings or numbers

**Example:**

```jsx
const styleObj = {
  backgroundColor: 'lightblue',
  fontSize: '20px',
  padding: '10px'
};

<div style={styleObj}>Styled Div</div>
```

Or inline directly:

```jsx
<div style={{ color: 'red', marginTop: '15px' }}>Hello, World!</div>
```

This method is useful for **dynamic styling** based on props or state.

---
