function calculate() {
  let input = document.getElementById("input");
  let arr = input.ariaValueMax.split(" ");
  let total = 0;
  for (item of arr) {
    console.log(item);
  }

  let result = document.getElementById("result");
  result.textContent = mep;
}

let btnOne = document.getElementById("btnOne");
btnOne.addEventListener("click", calculate);
