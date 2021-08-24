//função responsavel por:
//Atribui na variavel maoUsuario a escolha de acordo com o botão que ele clicar
//muda os estilos de cor do botões de acordo com a escolha
//ativa o botão jogar ao escolher a mão
let maoUsuario1 = 0;
let atribuirPedra =_=>{
    maoUsuario1 = 1;
    document.getElementById("btnPedra").style.backgroundColor = "green";
    document.getElementById("btnPapel").style.backgroundColor = "black";
    document.getElementById("btnTesoura").style.backgroundColor = "black";
    document.getElementById("btnJogar").disabled = false;
    document.getElementById("btnJogar").style.backgroundColor = "red";

} 
let atribuirPapel =_=>{
    maoUsuario1 = 2;
    document.getElementById("btnPedra").style.backgroundColor = "black";
    document.getElementById("btnPapel").style.backgroundColor = "green";
    document.getElementById("btnTesoura").style.backgroundColor = "black";
    document.getElementById("btnJogar").disabled = false;
    document.getElementById("btnJogar").style.backgroundColor = "red";
} 
let atribuirTesoura =_=>{
    maoUsuario1 = 3;
    document.getElementById("btnPedra").style.backgroundColor = "black";
    document.getElementById("btnPapel").style.backgroundColor = "black";
    document.getElementById("btnTesoura").style.backgroundColor = "green";
    document.getElementById("btnJogar").disabled = false;
    document.getElementById("btnJogar").style.backgroundColor = "red";
} 

//Atribui a variavel maoMaquina uma escolha aleatoria de mão
let maoMaquina = parseInt(Math.random() * 3 + 1); //gera numeros 1,2 ou 3

//função para dar nome a mão
let darNomeMao=(mao)=>{
    if (mao == 1) return "Pedra";
    if (mao == 2) return "Papel";
    if (mao == 3) return "Tesoura";
}

//Função para checar vencedor, retorna:
//1 = vencedor jogador 1, 
//2 = vencedor jogador 2,  
//3 = empate
let definirVencedorJogada = (mao1,mao2) =>{
    if(mao1==1){ //pedra
        if(mao2==1) return 3; //pedra
        if(mao2==2) return 2; //papel
        if(mao2==3) return 1; //tesoura
    }
    if(mao1==2){ //papel
        if(mao2==1) return 1; //pedra
        if(mao2==2) return 3; //papel
        if(mao2==3) return 2; //tesoura
    }
    if(mao1==3){ //tesoura
        if(mao2==1) return 2; //pedra
        if(mao2==2) return 1; //papel
        if(mao2==3) return 3; //tesoura
    }
}

//função para dar nome ao vencedor
let definirNomeVencedor = (n) =>{
    if(n==1) return "Jogador";
    if(n==2) return "Maquina";
    if(n==3) return "Empatou";
}


//Função que incrementa pontos na variavel utilizada no placar
let pontosUsuario = 0;
let pontosUsuario2 = 0;
let definirPlacar = (vencedor) =>{
   if (vencedor==1) pontosUsuario++;
   if (vencedor==2) pontosUsuario2++
}

//Função para gerar os eventos do jogo
let rodada = 1;
let gerarLog = _ =>{
    document.getElementById("log").innerHTML +=
        `<p>Rodada: ${rodada} | Jogador: ${darNomeMao(maoUsuario1)} | 
        Maquina: ${darNomeMao(maoMaquina)} | Vencedor: ${definirNomeVencedor(vencedorJogada)}</p>`;
    rodada++;
}

//Função principal
var vencedorJogada = 0;
let iniciarJogada = _ =>{
    vencedorJogada = definirVencedorJogada(maoUsuario1,maoMaquina);
    document.getElementById("jogadas").innerHTML = "";
    document.getElementById("jogadas").innerHTML += "<h1>Maquina: <button id='btnMaquina'>" + darNomeMao(maoMaquina) + "</button></h1>";
    document.getElementById("btnMaquina").style.backgroundColor = "green";
    if(vencedorJogada == 1) document.getElementById("jogadas").innerHTML += "<h1>Jogador Venceu</h1>";
    if(vencedorJogada == 2)document.getElementById("jogadas").innerHTML += "<h1>Maquina Venceu</h1>";
    if(vencedorJogada == 3)document.getElementById("jogadas").innerHTML += "<h1>Empatou</h1>";
    gerarLog();
    maoMaquina = parseInt(Math.random() * 3 + 1);
    definirPlacar(vencedorJogada);
    document.getElementById("placar").innerHTML = "<h1>Placar: Jogador "+pontosUsuario+" x "+pontosUsuario2+" Maquina"
    document.querySelector("h1").innerText= `Rodada ${rodada} | Escolha sua Jogada`;
}