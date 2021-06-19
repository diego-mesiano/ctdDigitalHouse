

let gerarAleatorio=(n)=> {
    var num = 0;
    for (let i=0;i<1000;i++) Math.floor(Math.random() * n + 1);
    num =  Math.floor(Math.random() * n + 1);
    return console.log(num)
}
gerarAleatorio(3);
