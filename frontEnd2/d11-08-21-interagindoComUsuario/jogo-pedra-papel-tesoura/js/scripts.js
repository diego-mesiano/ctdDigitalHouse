/*Após termos as regras e o sistema com uma partida do jogo, ficará ao encargo das mesas de trabalho:

-Refatorar o código, utilizando funções e a estrutura de decisão switch;

-Implementar uma regra de que só é declarado o ganhador do jogo após 3 rodadas, 
para auxiliar use uma variável para armazenar o vencedor de cada partida;

-Comentar o código e utilizar de qualquer outro recurso para deixá-lo melhor formatado.
*/
let pontosMaquina = 0;
let pontosUsuario = 0;


for (let i = 0; i < 3; i++) {
    let maoUsuario = prompt("Rodada" +i+": Digite (1) pedra, (2) papel e (3) tesoura:");
    let maoMaquina = parseInt(Math.random() * 3 + 1);
    console.log("Rodada:", i);
    console.log("Usuario:", maoUsuario);
    console.log("Maquina:", maoMaquina);
    switch (maoUsuario) {
        case '1':
            if (maoMaquina === maoUsuario) {
                console.log("empate");
            } else if (maoMaquina == 2) {
                console.log("perdeu");
                pontosMaquina++;
            } else if (maoMaquina == 3) {
                console.log("ganhou");
                pontosUsuario++;
            }

            break;
        case '2':
            if (maoMaquina == 1) {
                console.log("ganhou");
                pontosUsuario++;
            } else if (maoMaquina == 2) {
                console.log("empate");
            } else if (maoMaquina == 3) {
                console.log("perdeu");
                pontosMaquina++;
            }
            break;
        case '3':
            if (maoMaquina == 1) {
                console.log("perdeu")
                pontosMaquina++;
            } else if (maoMaquina == 2) {
                console.log("ganhou");
                pontosUsuario++;
            } else if (maoMaquina == 3) {
                console.log("empate");
                
            }
            break;
        default: alert('Digite valores entre 1 e 3');
    }
    
}

if (pontosMaquina==pontosUsuario){
    alert("Empate, Ninguem Ganhou");}
else{
    if(pontosUsuario>pontosMaquina) alert("Usuario Ganhou");
    else alert("Maquina Ganhou");
}