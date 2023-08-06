// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import {getAuth, GoogleAuthProvider} from "firebase/auth";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyCG4ZakdKUyLL-A9iwb5U8nbUC7lOG4Psg",
  authDomain: "authapp-e78ca.firebaseapp.com",
  projectId: "authapp-e78ca",
  storageBucket: "authapp-e78ca.appspot.com",
  messagingSenderId: "162877204770",
  appId: "1:162877204770:web:e7defa58469c2e5d5d1d7b"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);

//Connect to auth (google auth)
const authconnect = getAuth(app);//auth only
const googleprovider = new GoogleAuthProvider()//google auth

export{authconnect, googleprovider};