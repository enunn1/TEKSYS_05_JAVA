// select the elements 
let input = document.querySelector('#email')
let btn = document.querySelector('#btn')
let message = document.querySelector('#successMsg')
let tag = document.querySelector('#text')
let remove = document.getElementsByClassName('remove')
console.log("input", input)
console.log("button", btn)

let arrList = [];

// appending a close button to each element
let myList = document.querySelectorAll('LI')
console.log(myList)
for(let i = 0; i < myList.length; i++ ){
    // if(myList[i] === null){
        let sp = document.createElement("SPAN")
        let txt = document.createTextNode('X') 
        sp.className = "remove"
        sp.appendChild(txt)
        myList[i].appendChild(sp)
    // } 
}


// remove
for(let i = 0; i < remove.length; i++ ){
    remove[i].onclick = function(){
        let div = this.parentElement;
        div.style.display = "none"
        console.log(remove, "remove runction")
    }
}

// add function 
// later on add a class or id selector to the li tag
// btn.addEventListener('click',function(event)
function add(event){
    // event.preventDefault();
    let li = document.createElement('li')
    let inputVal = document.getElementById('email').value;
    let tex = document.createTextNode(inputVal)
    // let text = input.textContent
    li.appendChild(tex)
    if(inputVal === ''){
        alert("Must add a Email")
    }else{
        document.getElementById("text").appendChild(li)
        input.value = '';
        message.innerHTML = "success";
    }

    // document.querySelector("inputVal").value =""

    let sp = document.createElement("SPAN")
    let txt = document.createTextNode('X') 
    sp.className = "remove"
    sp.appendChild(txt)
    li.appendChild(sp)
    
    for(let i = 0; i < remove.length; i++ ){
        remove[i].onclick = function(){
            let div = this.parentElement;
            div.style.display = "none"
        }
    }
   
// console.log(event) //click event
}

console.log("Array list ", arrList)