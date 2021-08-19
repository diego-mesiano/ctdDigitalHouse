let doc1 = document.querySelector("h5").innerHTML;
console.log(doc1);

//innerText tem mais performance, mas nem sempre será util. 
//innerHTML interpreta tags, innerText interpreta tudo como texto.
document.querySelector("h5").innerHTML = "<strong>Inseri novo valor</strong>";
document.querySelector("h5").innerText = "<strong>Com innerText aparece as tags pois ele interpreta só texto</strong>"
document.querySelector("h5").innerHTML += "Acrescentei isso";