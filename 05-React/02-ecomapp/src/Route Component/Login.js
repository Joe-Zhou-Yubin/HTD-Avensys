import React from 'react'
import {signInWithPopup} from 'firebase/auth'
import {authconnect, googleprovider} from './firebase'
import {useNavigate} from 'react-router-dom'
import {useContext} from 'react'
import { MyContext } from '../index';

function Login() {

  const navigate = useNavigate()
  const {isLoggedIn, setIsLoggedIn} = useContext(MyContext)
  
  function pleaseSignin() {
    //Logic to display signin popup
    signInWithPopup(authconnect, googleprovider)
      .then(function(result) {
        const user = result.user;
        console.log(user.displayName, user.email);
        alert("Login successful");
        navigate("/mobile");
        console.log(isLoggedIn.value)
        setIsLoggedIn(true);
      })
      .catch(function(error) {
        console.error("Login not successful", error);
        alert("Login not successful");
      });
  }

  return (
    <button onClick={pleaseSignin}>Login</button>
  );
  
}

export default Login