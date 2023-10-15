var num = 9 // global variable that can be changed/redelcared/Reassinged (like python varibals) CAN be assested outside of its block

// const MAX = 200 // Can't be changed like let and var. Can't be assested outside of it's block


let num1 = 10 // Can't be assested outside of it's block can be changed.

console.log(typeof num1)

if(num1>9){
    console.log("The value is greater then 9")
    let num2 = 10
    var num3 = 10
    console.log(num2)
    const MAX = 200
    
}else if(num1 >= 1 && num1 <= 9){ 
    console.log("the number is between 1 and 9")
}else{
    console.log("the number is less then 1")
}

// console.log(num2)not possible
console.log(num3)


