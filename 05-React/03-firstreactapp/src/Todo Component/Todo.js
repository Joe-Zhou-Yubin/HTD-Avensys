import React from 'react'
import { useState } from 'react'


function Todo() {

    const [myData, setmyData] = useState(["task 1","task 2","task 3"])

    const[task,settask] = useState("")

    function collectTask(event){//console data inside input box
        // console.log(event.target.value)
        settask(event.target.value)
        console.log(task)
    }

    function clicked(){//update task input to myData array
        setmyData([...myData, task])//updating array present in myData

    }

  return (
    <div>
        Enter Task:<input type="text" onChange={collectTask}/>
        <button onClick={clicked}>Submit</button>
        <hr></hr>

        {/* {
            myData.map(function(i){
                return <li>{i}</li>
            })
        } */}
        {myData.map((item, index) => (
        <li key={index}>{item}</li>
        ))}


    </div>
  )
}

export default Todo