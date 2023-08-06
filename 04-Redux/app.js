// Customer --> BUY_CHOC --> shopkeeper --> Bakery (20 Choc)
// need to install redux program
// npm install redux

//2. import createstore function
const {createStore} = require("redux")

//1. State
const initialData ={
    noOfChoc: 20
}


//5. Action
function buy() {
    return {
      type: "BUY_CHOCOLATE",
    };
  }

//4. create a reducer where he takes initial data and keeps it inside redux store(bakery)
const chocolateReducer = (state = initialData, action) => {
    if (action.type === "BUY_CHOCOLATE") {
      return {
        noOfChoc: state.noOfChoc - 1,
      };
    }
  
    return state;
};

//3. redux store --createStore is deprecated but still can use
const bakery = createStore(chocolateReducer)

//6. called by customer
bakery.subscribe(function() {
    console.log(bakery.getState())
})

bakery.dispatch(buy());
bakery.dispatch(buy());
bakery.dispatch(buy());

// use node to run
//node app.js