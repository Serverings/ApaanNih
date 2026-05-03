const noBtn = document.getElementById("btn-no");
const askScreen = document.getElementById("screen-ask");
const yesScreen = document.getElementById("screen-yes");

function moveNoBtn() {
    fetch("/api/no", { method: "POST" });

    const x = Math.random() * 200 - 100;
    const y = Math.random() * 200 - 100;

    noBtn.style.transform = `translate(${x}px, ${y}px)`;
}

function handleYes() {
    fetch("/api/yes", { method: "POST" });

    askScreen.classList.add("hide");

    setTimeout(() => {
        askScreen.style.display = "none";

        yesScreen.style.display = "flex";
        setTimeout(() => {
            yesScreen.classList.add("show");
        }, 50);

        startHearts();
    }, 600);
}