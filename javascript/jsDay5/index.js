// for loop
let arr = [1, 2, 3];

// for (let i = 0; i < arr.length; i++) {
//   console.log(arr[i]);
// }

// forEach is a function, and it takes a param callBackFunction
// arr.forEach(function (idx) {
//   console.log(idx);
// });

// arr.forEach((idx)=>{
//   console.log(idx);
// });

// let newMap = arr.map(function(val) {
//   return val * 2;
// });

//let newMap = arr.map((val) => {
//   return val * 2;
// });
// console.log(arr);
// console.log(newMap);

let filterArray = ["spray", "can", "limit", "apple", "eye", "me"];

// let result = filterArray
//   .map((idx) => {
//     return idx;
//   })
//   .filter((val) => {
//     return val.length < 4;
//   });

// console.log(result);

// es6
const add = (a, b) => {
  let c = "8";
  let cn = Number(c);

  // return a + b + Number(c)
  // return a + b + parseInt(c);
  return a + b + +c;
  // return a + b + cn;
};

let sum = add(5, 5);

// console.log(sum);

// console.log(eval('5+5'));

let arrTwo = [2, 5, NaN, 12, "30"];
// const nanNumber = (n) => {
//     for (let index = 0; index < arrTwo.length; index++) {
//         if(isNaN(n[index])) {
//             return NaN
//         }
//         return n;
//     }
// };

// let result = nanNumber(arrTwo);
// console.log(typeof '5');
// console.log(result);

// console.log(arrTwo.indexOf(NaN));

let arrThree = [1, 2, 3, 5, 7, 8, 9, 0, 3];
let spArr = [];

// let a = arrThree.splice(5);

// let fe = a.forEach((idx) => {
//   spArr.push(idx);
// });

// console.log(spArr)
// console.log(arrThree);

let myArr = [1, 2, 3];

// for (let i = 0; i < myArr.length; i++) {
//   try {
//     console.log(eval('fhsdekfhsedjfs'));
//   } catch {
//     console.log("Error on line 5");
//   }
// }

// JavaScript Closures


function outerFunction(x) {
  // returning the outer
  return function innerFunction(y) {
    // returning the innterfunction
    return x + y;
  };
}

let ADDFIVE = outerFunction(5);

console.log(ADDFIVE(2));
