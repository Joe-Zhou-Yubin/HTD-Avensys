import React from 'react'
import {useFormik} from "formik"

function RegistrationForm() {
    
    const formik = useFormik({//input as a js object -- holds initial value and holds updated value after input
        initialValues:{
            username: "",
            password: "",
            email: ""
        },
        validate: function(data){
            //console.log(data)
            let errors = {}
            if (!data.username){
                errors.username = "Username cannot be empty"
            }
            if (!data.password){
                errors.password = "Password cannot be empty"
            }else if(data.password.length<6||data.password.length>20){
                errors.passwordVal="Password should be between 6 to 20 characters"
            }


            if (!data.email){
                errors.email = "E-mail cannot be empty"
            } else if (!/^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i.test(data.email)) {
                errors.email = 'Invalid email address';
              }

            // if (data.password){
            //     if(data.password.length<6||data.password.length>20){
            //         errors.passwordVal="Password should be between 6 to 20 characters"
            //     }
                
            // }
            return errors
        }
    })

  return (
    <div>
        <form>
            Enter username: <input onChange={formik.handleChange} type="text" name="username" 
            placeholder="Username" value={formik.values.username}/><br/><br/>
            {formik.errors.username ? formik.errors.username:null }<br/><br/>


            Enter password: <input onChange={formik.handleChange} type="password" name="password" 
            placeholder='Password' value={formik.values.password}/><br/><br/>
            {formik.errors.password || formik.errors.passwordVal ? 
            (<span style={{color:'red'}}> {formik.errors.password ||
             formik.errors.passwordVal}</span>) : null}<br/><br/>


            Enter Email: <input onChange={formik.handleChange} type="text" name="email" 
            placeholder='E-mail' value={formik.values.email}/><br/><br/>
            {formik.errors.email ? formik.errors.email:null }<br/><br/>

            <button>Submit</button>

        </form>
    </div>
  )
}

export default RegistrationForm