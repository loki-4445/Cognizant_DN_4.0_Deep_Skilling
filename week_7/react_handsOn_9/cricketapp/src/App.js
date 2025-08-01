// src/App.js
import React from 'react';
import './App.css';
import ListofPlayers from './components/ListOfPlayers'
import IndianPlayers from './components/IndianPlayers'

function App() {
  const flag = false;

  return (
    <div className="App">
      <h1> Cricket Player Portal</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
