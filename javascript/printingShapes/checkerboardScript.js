let width = prompt("Enter the width of the checkerboard");
let height = prompt("Enter the height of the checkerboard");

for (let i = 0; i < height; i++) {
  for (let j = 0; j < width; j++) {
    if ((i + j) % 2 === 0) {
      document.write("*");
    } else {
      document.write("&nbsp;");
    }
  }
  document.write("<br/>");
}
