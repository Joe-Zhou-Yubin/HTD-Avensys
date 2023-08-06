import React, {useState, useMemo} from 'react'

function Launch() {

    const [count, setCount] = useState(0);
    const [enteredName, setEnteredname] = useState("")

    console.log("Rendered")

    const cube = (n) => {
        let i = 0;
        while (i < 1000000000) {//called automatically
          i++;
        }
        return n * n * n;
      };
    

    const handleChange = (e) => {
        setEnteredname(e.target.value) 
    };
    
    const cubeResult = useMemo(() => cube(count),[count]);
    //cube function keeps rendering if we run name input
    // useMemo allow us to call function before

  return (
    <div>
     <h1 style={{textAlign:"center"}}>Use Memo Example</h1>
      <hr />
      <div>
        <h1>
          The number is :{count} and its cube is : {cubeResult}
        </h1>
        <button onClick={() => setCount(count + 1)}>Increase</button>
        <button onClick={() => setCount(count - 1)}>Decrease</button>
      </div>
      <hr />

      <h2>The Name is: {enteredName}</h2>
      Enter Name: <input type="text" onChange={handleChange} />        
    </div>
  )
}

export default Launch