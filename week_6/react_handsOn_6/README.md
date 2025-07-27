### 1. **Need and Benefits of React Router**

* **Need**: React is a single-page application (SPA) library, meaning it doesn't reload pages. React Router enables navigation between views without refreshing the page, giving the user a native-like experience.

* **Benefits**:

  * **Dynamic Navigation**: Enables routing between different components/screens without full-page reloads.
  * **URL Mapping**: Maps URLs to specific components.
  * **Stateful URLs**: Allows sharing and bookmarking specific views, passing dynamic parameters via URL.
  * **Declarative Routing**: Simple and flexible configuration for complex routing needs.

### 2. **Components in React Router**

* **Router**: The core container that keeps track of the current location and renders the appropriate UI.
* **Route**: Defines a mapping between a URL path and a component to render when that path is matched.
* **Switch**: Ensures that only the first `Route` that matches the URL is rendered.
* **Link**: Allows navigation to different routes without a full-page reload, like `<a>` tags but for React apps.
* **NavLink**: Similar to `Link`, but with added styling features based on whether the link is active or not.
* **Redirect**: Programmatically redirects the user to another route.

### 3. **Types of Router Components**

* **BrowserRouter**: Uses the HTML5 history API to keep your UI in sync with the URL. Best for modern browsers.
* **HashRouter**: Uses the URL hash (`#`) to simulate a full URL. Useful for older browsers or when server-side routing is not possible.
* **MemoryRouter**: Stores the history in memory (not the URL). Great for tests or non-browser environments.
* **StaticRouter**: Used on the server side for server-side rendering (SSR).

### 4. **Parameter Passing via URL**

React Router allows you to pass parameters in URLs and access them within components.

* **URL Parameter**:
  Use `:param` in the `Route` path to define a parameter.

  Example:

  ```jsx
  <Route path="/profile/:userId" component={Profile} />
  ```

  Access the parameter using `useParams` hook in a function component:

  ```javascript
  import { useParams } from 'react-router-dom';

  const Profile = () => {
    const { userId } = useParams();
    return <h1>Profile of user {userId}</h1>;
  };
  ```

* **Query Parameters**:
  You can also pass parameters via the query string (e.g., `/search?query=abc`).

  Example:

  ```javascript
  const Search = () => {
    const query = new URLSearchParams(window.location.search).get('query');
    return <h1>Search results for: {query}</h1>;
  };
  ```
