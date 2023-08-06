// Customer -- BUY_ICECREAM, BUY_CAKE --shopkeeper -- cakeWorld(20 icecream, 30 cake)

const {createStore} = require("redux")

//1. state
const initialData = {
    noOfIcecream: 20,
    noOfCake:30
}



//4. actions
function buyIcecream() {
    return {
      type: "BUY_ICECREAM",
    };
}

function buyCake() {
    return {
      type: "BUY_CAKE",
    };
  }

//3. reducer
const cakeWorldReducer = (state = initialData, action)=>{
    if (action.type === "BUY_ICECREAM") {
        return {
          ...state, noOfIcecream: state.noOfIcecream - 1,
        };
    }
    if (action.type === "BUY_CAKE"){
        return {
            ...state, noOfCake: state.noOfCake - 1
          };
    }
    return state;
}

//2. redux store

const cakeWorld = createStore(cakeWorldReducer)

//5. customer input
cakeWorld.subscribe(function() {
    console.log(cakeWorld.getState())
})

cakeWorld.dispatch(buyIcecream());
cakeWorld.dispatch(buyCake());