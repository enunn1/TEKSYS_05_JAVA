let body = document.querySelector("body");

let box1 = document.createElement("div");
box1.id = "box1";
box1.className = "chatWindow";
box1.style =
  "min-height: 500px; width: 300px; float: left; background-color: skyblue;";

let box2 = document.createElement("div");
box2.id = "box2";
box2.className = "chatWindow";
box2.style =
  "min-height: 500px; width: 300px; float: right; background-color: springgreen;";

let messages1 = document.createElement("textarea");
messages1.name = "messages1";
messages1.id = "messages1";
messages1.style = "min-height: 400px; width: 280px; margin: 5px;";
messages1.readOnly = true;

let messages2 = document.createElement("textarea");
messages2.name = "messages2";
messages2.id = "messages2";
messages2.style = "min-height: 400px; width: 280px; margin: 5px;";
messages2.readOnly = true;

let nameInput = document.createElement("input");
nameInput.type = "text";
nameInput.name = "name";
nameInput.id = "name";
nameInput.placeholder = "Enter a name";

let nameInput2 = document.createElement("input");
nameInput2.type = "text";
nameInput2.name = "name";
nameInput2.id = "name";
nameInput2.placeholder = "Enter a name";

let messageInput = document.createElement("input");
messageInput.type = "text";
messageInput.name = "message";
messageInput.id = "message";
messageInput.placeholder = "Enter a message";

let messageInput2 = document.createElement("input");
messageInput2.type = "text";
messageInput2.name = "message";
messageInput2.id = "message";
messageInput2.placeholder = "Enter a message";

let submitButton = document.createElement("button");
submitButton.id = "submit";
submitButton.name = "submit";
submitButton.textContent = "Submit";

let submitButton2 = document.createElement("button");
submitButton2.id = "submit";
submitButton2.name = "submit";
submitButton2.textContent = "Submit";

body.appendChild(box1);
body.appendChild(box2);

box1.appendChild(messages1);
box1.appendChild(nameInput);
box1.appendChild(document.createElement("br"));
box1.appendChild(messageInput);
box1.appendChild(document.createElement("br"));
box1.appendChild(submitButton);

box2.appendChild(messages2);
box2.appendChild(nameInput2);
box2.appendChild(document.createElement("br"));
box2.appendChild(messageInput2);
box2.appendChild(document.createElement("br"));
box2.appendChild(submitButton2);

function sendMessageToBox1() {
  nameValue = nameInput2.value;
  messageValue = messageInput2.value;
  if (messageValue !== "" && nameValue !== "") {
    messages1.value += `${nameValue}: ${messageValue}\n`;
  }
}

function sendMessageToBox2() {
  nameValue = nameInput.value;
  messageValue = messageInput.value;
  if (messageValue !== "" && nameValue !== "") {
    messages2.value += `${nameValue}: ${messageValue}\n`;
  }
}

submitButton.addEventListener("click", sendMessageToBox2);
submitButton2.addEventListener("click", sendMessageToBox1);

messages1.addEventListener("keypress", function (e) {
  if (e.key === "Enter") {
    sendMessageToBox2();
  }
});

messages2.addEventListener("keypress", function (e) {
  if (e.key === "Enter") {
    sendMessageToBox1();
  }
});
