let size = prompt("Enter the size of the triangle");

for (let i = 0; i < size; i++) {
  for (let j = 0; j < size; j++) {
    if (j >= i) {
      document.write("*");
    } else {
      document.write("&nbsp;");
    }
  }
  document.write("<br/>");
}
