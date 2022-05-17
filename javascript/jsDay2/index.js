let name = "Bob";
let hasJob = true;
let age = 22;

let person = {
  first_name: "Ethan",
  last_name: "Nunn",
  is_working: false,
  hasJob: true,
  jobTitle: "Software Dev",
  fullName: function () {
    return this.first_name + " " + this.last_name;
  },
};

let obj = {}; // object with nothing
// console.log(person.fullName());

// let names = ["Alice", "Bob", "Carl", "Dana", 123, true, 456.789];

// console.log(names[2]);

// attached to one class
// var obj1 = new Object();
// var str = new String();
// var num = new Number();
// var bool = new Boolean();
// var arr = new Array();
// var date = new Date();

// math obj are global
Math.random();
Math.floor();

class Person {
  constructor(firstName, lastName, age, hasHair) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.hasHair = hasHair;
    this.changeName = function (name) {
      this.lastName = name;
    };
  }
}

var newPerson = new Person("John", "Doe", 68, true);
// console.log(newPerson.lastName);

let nameChange = newPerson.changeName("Smith");
let result = newPerson;
// console.log(result);

Person.prototype.age = 54;
Person.prototype.firstName = "Jim";

// console.log(result);
// console.log(nameChange)

let names = ["Alice", "Bob", "Carl", "Dana", 123, true, 456.789];

// let arr = [
//     {firstName,"me"},
//     {jobTitle:"dev"},
//     {laptop:"msi"}
// ]

// pop removes the last item
let lastItem = names.pop();
// console.log(lastItem);

// shift removes the first item
let firstItem = names.shift();
// console.log(firstItem);

// push adds an item to the end of array
let addItemEnd = names.push("Jane");

// unshift adds an item to the front of array
let addItemFront = names.unshift("Ethan");

// console.log(names);

function revWord(word) {
  return word.split("").reverse().join("");
}

// console.log(revWord("porcupine"))

let str = "buzzsaw";

// console.log(str.split(''));

// console.log(str.slice(0,4))
// console.log(str);

// console.log(names);
// console.log(names.splice(0, 1, "Apple", "Kiwi"))
// console.log(names);

var date = new Date();

// console.log(date.getMonth());

let arr = [22, 11, , 30, 33];

// let newLoop = arr.forEach((value, index) => {
//     console.log("the value at index " + index + " is " + value);
// });

// newLoop;

let newArr = [];

// for (let i = 0; i < arr.length; i++) {
//     newArr.push(arr[i]);
//     // newArr += arr[i];
// }

// loop through array using for of
// for (let i of arr) {
//   if (i < 40) {
//     newArr.push(i);
//   }
// }

// console.log(newArr);

const addOne = (a) => {
  return a + 1;
};

// console.log(addOne(2));

let input = prompt("Enter a range from (10-30)");
let range = input.split(" ");
let guessNumber = Math.floor(Math.random() * (Number(range[1] - Number(range[0]))) + Number(range[0]));
console.log(guessNumber);

let stop = 0;

let userGuess = prompt(`Guess a number between ${range[0]} and ${range[1]}`);
while (stop <= 10) {
    if (guessNumber == userGuess) {
        alert("You guessed right!")
        break;
    }
    userGuess = prompt(`Keep guessing a number between ${range[0]} and ${range[1]}`);
    stop++;
}
if (guessNumber != userGuess) {
    alert(`Sorry, the answer was ${guessNumber}`);
}