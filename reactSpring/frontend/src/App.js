import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState('app');

  useEffect(() => {
    fetch('/api/hello')
      .then(res => res.text())
      .then(message => {
        setMessage(message);
      });
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1>{ message }</h1>
        <p>
          Edit <code>src/App.js</code> and save to reload. 와 안되노
        </p>
      </header>
    </div>
  );
}

export default App;
