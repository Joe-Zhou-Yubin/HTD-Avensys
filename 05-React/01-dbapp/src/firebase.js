// Import the functions you need from the SDKs you need
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries
import firebase from "firebase/compat/app";
import "firebase/compat/firestore"
// Your web app's Firebase configuration
const firebaseConfig = {
    apiKey: "AIzaSyCAT5zXvpleekuKTsuhCwuFl_8kdsGstCA",
    authDomain: "dbapp-3a218.firebaseapp.com",
    projectId: "dbapp-3a218",
    storageBucket: "dbapp-3a218.appspot.com",
    messagingSenderId: "369538549254",
    appId: "1:369538549254:web:c8e249b5e82e1b07c02587"
  };

// Initialize Firebase
const app = firebase.initializeApp(firebaseConfig);
export const db = firebase.firestore();