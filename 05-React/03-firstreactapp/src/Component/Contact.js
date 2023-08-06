import React from 'react'

function Contact(data) {
  return (
    <div class="card" style={{width: "18rem"}}>
        <img src={data.image} alt="..."/>
    <div class="card-body">
        <h3 class="card-title">{data.name}</h3>
        <p class="card-text">{data.message}</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
    </div>
    </div>
    // anything to evaluate, use { }
  )
}

export default Contact