import React from 'react'

function TrialForm() {

    var username = "joe";
    var password = "123";

    function clicked(){
        const enteredusername = document.getElementById("usernameInput").value;
        const enteredpassword = document.getElementById("passwordInput").value;

        if (enteredusername === username && enteredpassword === password){
            alert("Login successful")
        }else{
            alert("Login failed")
        }
    }

  return (
    <div>
        Username: <input type="text" id="usernameInput"/>
        <br></br>
        Password: <input type="password" id="passwordInput"/>
        <br></br>
        <button onClick={clicked}>Login</button>
    </div>
  )
}

export default TrialForm