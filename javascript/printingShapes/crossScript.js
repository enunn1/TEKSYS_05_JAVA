let size = prompt("Enter the size of the cross");

for (let i = 0; i < size; i++) {
  for (let j = 0; j < size; j++) {
    if (i === j || (size - i - 1) === j) {
        document.write("*");
      } else {
        document.write("&nbsp;");
      }
  }
  document.write("<br/>");
}
