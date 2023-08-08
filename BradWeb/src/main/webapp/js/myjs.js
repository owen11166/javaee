window.onload = function() {
	let initBlock = document.getElementById("init");
	let mesgBlock = document.getElementById("mesgBlock");
	let connect = document.getElementById("connect");
	let userName = document.getElementById("userName");
	let send = document.getElementById("send");
	let mesg = document.getElementById("mesg");
	let log = document.getElementById("log");

	let webSocket;

	connect.addEventListener("click", function() {
		console.log("connecting...")
		webSocket = new webSocket("ws://localhost:8080/Web5/myserver");
		webSocket.onopen = function(event) {
			console.log("open");
			initBlock.style.display = "none";
			mesgBlock.style.display = "black";
			var sendMesg = {
				mode: 1,
				user: userName.value,
			}
			webSocket.send(JSON.stringify(mesg))
		}
		webSocket.onclose = function(event) {
			console.log("close");
			initBlock.style.display = "block";
			mesgBlock.style.display = "none";
		}
		webSocket.onerror = function(event) {
			console.log("error");
			initBlock.style.display = "block";
			mesgBlock.style.display = "none";

		}
		webSocket.onmessage = function(event) {
			console.log("message..");
			var obj = JSON.parse(event.data);
			log.innerHTML += obj.user + ":" + obj.message + "<br/>"
		}

	})

	send.addEventListener("click", function() {
		console.log("send....")
		var sendMesg = {
			mode: 2,
			messaage: mesg.value,


		}
		webSocket.send(JSON.stringify(mesg))
	})


	initBlock.style.display = "block";
	mesgBlock.style.display = "none";
}