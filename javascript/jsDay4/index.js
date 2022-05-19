// select the elements
let input = document.querySelector("#email");
let btn = document.querySelector("#btn");
let message = document.querySelector("#successMsg");
let tag = document.querySelector("#text");
let remove = document.querySelectorAll('.remove');
console.log("input", input);
console.log("button", btn);

let arrList = [];

// appending a close button to each element
function createXButton(listItem) {
  let sp = document.createElement("span");
  let txt = document.createTextNode(" \u00D7");
  sp.className = "remove";
  sp.appendChild(txt);
  listItem.appendChild(sp);
  sp.addEventListener('click', function() {
    let div = this.parentElement;
    div.style.display = "none";
  })
}

let myList = document.querySelectorAll("li");
for (let i = 0; i < myList.length; i++) {
  createXButton(myList[i]);
}

// add function
// later on add a class or id selector to li tag
// btn.addEventListener("click", function (event) {
function add(event) {
  event.preventDefault();
  let li = document.createElement("li");
  let inputVal = input.value;
  let text = document.createTextNode(inputVal);
  li.appendChild(text);

  if (inputVal === "") {
    alert("Must add an email");
    message.innerHTML = "failure";
  } else {
    tag.appendChild(li);
    input.value = "";
    message.innerHTML = "success";
  }
  createXButton(li);
  //   console.log(event.type); //click event
};

console.log("Array list ", arrList);
