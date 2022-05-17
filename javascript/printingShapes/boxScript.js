let width = prompt("Enter the width of the box");
let height = prompt("Enter the height of the box");

for (let i = 0; i < height; i++) {
  for (let j = 0; j < width; j++) {
    document.write("*");
  }
  document.write("<br/>");
}
