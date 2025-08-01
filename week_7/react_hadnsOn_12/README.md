# Hands-on: 12. ReactJS HOL
### Explain about conditional Rendering in react
Conditional rendering in React allows you to render different UI elements based on certain conditions. This is typically done using JavaScript expressions within JSX. You can use conditional statements like `if`, `else`, or the ternary operator to determine what should be displayed.

### Define Element Variables in React
In React, you can define variables that hold JSX elements. This allows you to create reusable components or store UI elements in variables for conditional rendering. For example:
```javascript
const element = <h1>Hello, World!</h1>;
```

### Explain how to prevent components from rendering
To prevent components from rendering in React, you can use conditional statements to control whether a component should be displayed. This can be achieved by returning `null` or using logical operators. For example:
```javascript
{isLoggedIn ? <UserGreeting /> : <GuestGreeting />}
```
```javascript
return isLoggedIn ? <UserGreeting /> : null;
```
