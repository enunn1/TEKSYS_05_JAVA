let size = prompt("Enter the size of the triangle");

for (let i = 0; i < size; i++) {
  for (let j = 0; j <= i; j++) {
    document.write("*");
  }
  document.write("<br/>");
}
