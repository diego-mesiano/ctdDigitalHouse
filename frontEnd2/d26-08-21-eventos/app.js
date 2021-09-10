let criarInput=(id)=>{
    let a = document.createElement("input");
    document.body.appendChild(a);
    a.setAttribute("id",id);

}


    var pai = document.createElement("div");
    document.body.appendChild(pai);
    var input1 = document.createElement("input");
    pai.appendChild(input1);
    input1.setAttribute("disabled",true);
    
    var label1 = document.createElement("label");
    var textoLabel1 = document.createTextNode("texto");
    label1.appendChild(textoLabel1);
    pai.appendChild(label1);
    input1.setAttribute("id","input1");
    label1.setAttribute("for","input1");

    input1=document.getElementById("input1");
   
  window.onload = (function(){
  input1.addEventListener("click",function(event){
        console.log("oii");
        event.target.input1.removeAttribute("disabled");
    })
})

    document.

    criarInput("imput2");









