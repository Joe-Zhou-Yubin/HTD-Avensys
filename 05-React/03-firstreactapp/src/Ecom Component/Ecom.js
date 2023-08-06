import React from 'react'
import get from "axios"
import { useEffect, useState } from 'react'
// fakestore API to show fake details of a ecom store
function Ecom() {
    const [productData,setproductData] = useState([])

    //write logic to connect to fakestore api using useEffect() function (API CALLER)
    //useeffect auto call, no need to care about calling in return
    useEffect(function(){
        get("https://fakestoreapi.com/products")
        .then(function(result){//collect product details
            // console.log(result.data)
            setproductData(result.data)
        })
        .catch(function(error){//catch error message
            console.log(error)
        })
    })

  return (
    <div>
        <h1>Ecom</h1>
        {
            productData.map(function(i){
                return(
                    <div>
                        <h2>{i.title}</h2>
                        <img src={i.image} width={50} height={50}/>
                    </div>
                )
            })
        }
    </div>
  )
}

export default Ecom