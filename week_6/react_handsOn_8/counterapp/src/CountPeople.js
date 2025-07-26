// src/CountPeople.js
import React, { Component } from 'react';

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0
    };
  }

  updateEntry = () => {
    this.setState(prevState => ({
      entryCount: prevState.entryCount + 1
    }));
  };

  updateExit = () => {
    this.setState(prevState => ({
      exitCount: prevState.exitCount + 1
    }));
  };

  render() {
    return (
      <div style={{ textAlign: 'center', marginTop: '50px' }}>
        <h1>People Counter</h1>
        <p>Number of People Entered: {this.state.entryCount}</p>
        <p>Number of People Exited: {this.state.exitCount}</p>
        <button onClick={this.updateEntry} style={{ marginRight: '10px' }}>Login</button>
        <button onClick={this.updateExit}>Exit</button>
      </div>
    );
  }
}

export default CountPeople;
