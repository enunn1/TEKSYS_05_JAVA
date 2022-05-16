// var nameOne = "String";
// var number = 12345;
// var booleanType = true;

// let nameTwo = "string";
// let numberTwo = 3.14159;
// let booleanType2 = false;

// const does not change...
// const nameThree = "string";

// nameThree = 'Ethan'

// console.log(" let type ", nameThree);
// console.log(" var type ", number);
// console.log(" var type ", booleanType);

// function newMessage(num, msg) {
//   for (let i = 0; i < num; i++) {
//     console.log(i, msg);
//   }
// }

// newMessage(5, "Hello");

// function add(numOne, numTwo) {
//   let result = numOne + numTwo;
//   return result
// }

// let result = add(3,5);
// console.log(result);

// let person = {
//   first_name:'Luke',
//   last_name: 'Skywalker',
//   job: 'Jack of all Trades'
// }

// function printSomething(p) {
//   for(let i in p) {
//     console.log(i + ": " + p[i]);
//   }
// }

// printSomething(person);

// var name = "global";
// console.log(name);

// function check() {
//   console.log(name);
//   name = "local";
//   myScope = "new scope";
//   return [name, myScope];
// }

// let result = check();
// console.log(myScope);
// console.log(name);
// console.log(result);

// Comparison operator
// ==: looks if the value is the same
// ===: data type and value is meant to be the same

// console.log(3 == 3);
// console.log(3 == "3");

// // === most used
// console.log(7 === 7);
// console.log(7 === "7");

// // logical operators
// console.log(56 < 70);
// console.log(56 <= 70);
// console.log(56 !== 70);

// let score = 85;

// if (score < 90 && score > 80) {
//   console.log("B");
// }

// var x = 10;
// var y = 4;

// let operand = "*";

// switch (operand) {
//   case "+":
//     console.log(x + y);
//     break;
//   case "-":
//     console.log(x - y);
//     break;

//   case "*":
//     console.log(x * y);
//     break;
//   case "/":
//     console.log(x / y);
//     break;
//   case "%":
//     console.log(x % y);
//     break;
//   default:
//     console.log("I don't know what this is");
//     break;
// }

// let x = 10;
// while (x < 20) {
//     console.log(x);
//     x++;
// }

// do {
//   console.log("print");
// } while (10 < 9);

// userInput = prompt("Enter your name");
// prompt(userInput);
// console.log(userInput);

let myLuckyNumber = 7;
if (myLuckyNumber === 0) {
  console.log("not my number");
} else if (myLuckyNumber > 0) {
  console.log("yes");
} else if (myLuckyNumber < 0) {
  console.log("no");
} else {
  console.log("try again"); 
}
