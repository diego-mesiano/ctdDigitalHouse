const darkMode=_=>{
    let checado = document.getElementById("chkDark").checked;
    if (checado){
        document.querySelector("body").style.backgroundColor = "black";
        document.querySelector("body").style.color = "white";
        document.querySelector("h1").style.color = "white";
        let listas = document.querySelectorAll("li");
        for (let i = 0; i<listas.length; i++){
            listas[i].style.backgroundColor = "black";
            listas[i].style.color = "white";
        }
    }
    else{
        document.querySelector("body").style.backgroundColor = "rgb(219, 219, 219)";
        document.querySelector("body").style.color = "black";
        document.querySelector("h1").style.color = "rgb(156, 156, 156)";
        let listas = document.querySelectorAll("li");
        for (let i = 0; i<listas.length; i++){
            listas[i].style.backgroundColor = "white";
            listas[i].style.color = "rgb(71, 71, 71)";
        }
    }
}