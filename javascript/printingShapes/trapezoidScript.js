let width = prompt("Enter the width of the width");
let height = prompt("Enter the height of the height");

let spaces = 0;
let stars = width;

if (height > width / 2) {
  document.write("Impossible shape!");
} else {
  for (let i = 0; i < height; i++) {
    for (let front = 0; front < spaces; front++) {
      document.write("&nbsp;");
    }

    for (let star = 0; star < stars; star++) {
      document.write("*");
    }

    for (let back = 0; back < spaces; back++) {
      document.write("&nbsp;");
    }
    document.write("<br/>");
    spaces += 1;
    stars -= 2;
  }
}
