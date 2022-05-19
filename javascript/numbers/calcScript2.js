function calculate() {
  let input = document.getElementById("input");
  let result = document.getElementById("result");
  result.textContent = "";
  let lines = input.value.split(/[;\n]+/);
  lines.pop();

  for (let line of lines) {
    let arr = line.split(' ');
    let total = Number(arr[0]);
    for (let i = 1; i < arr.length; i++) {
      if (arr[i] === "+") {
        total += Number(arr[i + 1]);
      } else if (arr[i] === "-") {
        total -= Number(arr[i + 1]);
      }
    }
    result.innerHTML += total + '<br/>';
  }
}

let btnOne = document.getElementById("btnOne");
btnOne.addEventListener("click", calculate);
