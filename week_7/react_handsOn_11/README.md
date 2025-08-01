## 📌 React Events

React events are JavaScript events handled using React’s own wrapper called a **Synthetic Event**. They provide a consistent interface across all browsers.

Just like in HTML, React lets you respond to user interactions such as clicks, form inputs, key presses, etc., but with some syntactic and functional improvements.

**Example:**
```jsx
<button onClick={handleClick}>Click Me</button>
````

---

## 🧠 Event Handlers in React

Event handlers are functions that get executed when a specific event occurs (e.g., click, change, submit). You can define them separately or inline.

### ✅ Defining a Handler Function

```jsx
function handleClick() {
  alert("Button clicked!");
}
```

### ✅ Inline Handler

```jsx
<button onClick={() => alert("Inline Click!")}>Click</button>
```

These functions are passed as props to React components to respond to events.
    
---

## ⚙️ Synthetic Event

React uses a **SyntheticEvent** object to handle events. It is a cross-browser wrapper around the native event object provided by the browser.

This makes your code more consistent and reliable across different environments.

```jsx
function handleClick(e) {
  console.log("Synthetic event:", e);
  console.log("Native event:", e.nativeEvent);
}
```

React may **reuse** synthetic events in its internal optimization (event pooling), so accessing the event asynchronously may require `e.persist()` in older versions.

---

## ✍️ React Event Naming Convention

React uses **camelCase** for all event handler names (unlike lowercase in HTML).

| HTML Event  | React Event |
| ----------- | ----------- |
| onclick     | onClick     |
| onchange    | onChange    |
| onsubmit    | onSubmit    |
| onkeydown   | onKeyDown   |
| onmouseover | onMouseOver |

**Example:**

```jsx
<input type="text" onChange={handleInputChange} />
```

---

## ✅ Example Component

```jsx
import React from 'react';

function EventDemo() {
  const handleClick = (e) => {
    alert("Button clicked!");
    console.log("Synthetic event:", e);
    console.log("Native event:", e.nativeEvent);
  };

  return (
    <div>
      <h2>React Event Example</h2>
      <button onClick={handleClick}>Click Me</button>
    </div>
  );
}

export default EventDemo;
```

---

## 📚 Summary

* React wraps browser events in a `SyntheticEvent`.
* Use **camelCase** event names (e.g., `onClick`, `onChange`).
* Event handlers are simple functions.
* You can access the native event using `e.nativeEvent`.

---