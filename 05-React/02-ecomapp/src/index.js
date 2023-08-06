import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import {useState, createContext} from "react";

// import App from './App';
import Login from './Route Component/Login';
import Mobile from './Route Component/Mobile';
import Book from './Route Component/Book'
import Laptop from './Route Component/Laptop';


export const MyContext = createContext();
// keep in object format


function LoginStatus() {
  // when user first logs in
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  return (
    <div>
      <div style={{ display: 'flex' }}>
        <Link to="/book">Book</Link>
        <Link to="/mobile">Mobile</Link>
        <Link to="/laptop">Laptop</Link>
        {isLoggedIn? <button>Logout</button>: <Link to="/login">Login</Link>}
        
      </div>
      {/* Display the isLoggedIn state */}
      <p>User is {isLoggedIn ? 'logged in' : 'logged out'}</p>
      
      <Routes>
        <Route path="/book" element={<Book/>} />
        <Route path="/mobile" element={<Mobile />} />
        <Route path="/laptop" element={<Laptop />} />
        

        <Route path="/login" element={<MyContext.Provider value={ {isLoggedIn : setIsLoggedIn} }>
          <Login />
        </MyContext.Provider>}></Route>
      </Routes>
    </div>
  );
}


ReactDOM.render(
  <React.StrictMode>
    <BrowserRouter>
      <LoginStatus/>
    </BrowserRouter>
  </React.StrictMode>,
  document.getElementById('root')
);



reportWebVitals();
