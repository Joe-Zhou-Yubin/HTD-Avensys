import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { render } from 'react-dom';

import Shoe from './Clothes Component/shoe';
import Shirt from './Clothes Component/shirt';
import Pants from './Clothes Component/pants';
// import Ecom from './Ecom Component/Ecom';
// import { useState } from 'react';
// import TrialForm from './TrialForm Component/TrialForm';
//stores data in react
// import Todo from './Todo Component/Todo';
// import { Display } from './Demo Component/Display';
// import { Launch } from './Demo Component/Launch';
// import Contact from './Component/Contact';
import {BrowserRouter, Link, Route} from "react-router-dom"

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
    <Welcome/>
  </React.StrictMode>
);


function Welcome(){
  return (
    <div style={{ display: 'flex' }}>
      
      
      <BrowserRouter>
        <Link to="/shoe">Shoe</Link>
        <Link to="/shirt">Shirt</Link>
        <Link to="/pants">Pants</Link>

        <Route path="/shoe" element={<Shoe/>}></Route>
        <Route path="/shirt" element={<Shirt/>}></Route>
        <Route path="/pants" element={<Pants/>}></Route>
      </BrowserRouter>



      {/* <h1>Hi im from Index.js</h1> */}
      {/* <Contact
        image="https://picsum.photos/id/237/200/300"
        name="joe"
        message="hi"
      />
      <Contact
        image="https://picsum.photos/id/237/200/300"
        name="goe"
        message="bye"
      /> */}
      
      
      
    </div>
  )
}

render(<App/>,document.getElementById("root"))

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
