function calculate() {
  let input = document.getElementById("input");
  let arr = input.value.split(/[\n, ]+/);
  let total = Number(arr[0]);
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] === '+') {
      total += Number(arr[i+1]);
    } else if (arr[i] === '-') {
      total -= Number(arr[i+1]);
    }
  }

  let result = document.getElementById("result");
  result.textContent = total;
}

let btnOne = document.getElementById("btnOne");
btnOne.addEventListener("click", calculate);
