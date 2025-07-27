````md
# React Components - Complete Notes

## ✅ React Components
React components are reusable, self-contained building blocks of UI in a React application. Each component returns JSX and represents a part of the UI.

---

## ✅ Differences Between Components and JavaScript Functions

| Feature                | React Component                          | JavaScript Function                      |
|------------------------|------------------------------------------|------------------------------------------|
| Purpose                | Renders UI in a React app                | General logic execution                  |
| Return type            | Returns JSX (HTML-like)                  | Returns any data type                    |
| Lifecycle support      | Yes (in class components)                | No lifecycle methods                     |
| Can use hooks          | Yes (in function components)             | No                                       |
| Recognized by React    | Yes (rendered in virtual DOM)            | No (unless wrapped in a component)       |

---

## ✅ Types of Components
1. **Class Components** - ES6 classes that extend `React.Component`
2. **Function Components** - Simple JavaScript functions using hooks

---

## ✅ Class Component

Defined using a class, supports lifecycle methods and state.

```jsx
import React, { Component } from 'react';

class Welcome extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }

  render() {
    return <h1>Hello, {this.props.name}</h1>;
  }
}
````

---

## ✅ Function Component

Defined using a JavaScript function, supports hooks like `useState`.

```jsx
import React from 'react';

function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}
```

---

## ✅ Component Constructor

The constructor is used in **class components** to:

* Initialize the internal `state`
* Bind methods if needed

```jsx
constructor(props) {
  super(props);
  this.state = {
    count: 0
  };
}
```

---

## ✅ render() Function

The `render()` function is **mandatory in class components**. It returns JSX that describes the UI output.

```jsx
render() {
  return (
    <div>
      <h1>Welcome to React</h1>
    </div>
  );
}


```
```
