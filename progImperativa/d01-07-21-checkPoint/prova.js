/*Olá, você foi contratado para executar este projeto. É importante que você analise, entenda o pedido do cliente e 
desenvolva conforme solicitado. Veja abaixo os requisitos do projeto:

- Precisamos desenvolver um menu para um microondas super veloz, onde teremos 5 opções de comida com seus respectivos tempos pré-definidos. 

      1 - Pipoca – 10 segundos (padrão);
      2 - Macarrão – 8 segundos (padrão);
      3 - Carne – 15 segundos (padrão);
      4 - Feijão – 12 segundos (padrão);
      5 - Brigadeiro – 8 segundos (padrão); 

- O usuário poderá alterar o tempo padrão, aumentando ou diminuindo de acordo com sua vontade. 
Se o tempo informado for maior que 2x o necessário, exibir 
mensagem que a comida queimou.
- Se o tempo for menor que o padrão, exibir a mensagem: "tempo insuficiente"; 
- Opções não listadas no menu, devem exibir uma mensagem de erro: "Prato inexistente";
- Se o tempo for 3x maior que o necessário para o prato, o microondas deve exibir a mensagem: “kabumm”;
- No final de cada tarefa, o microondas deverá exibir a mensagem: "Prato pronto, bom apetite!!!".*/

let microondas=(tipo_prato,tempo)=>{ //função microondas
    let nome_prato;                 //variavel para armazenar os nome do prato
    let tempo_padrao;               // variavel que armazaena os tempos padroes
    let queimou=false;              // variavel que diz se queimou
    let kabum=false;               //variavel que diz se kabum
    let insuficiente=false;         //variavel para tempo insuficiente
    let prato_valido=false;         //variavel para validar o prato
    let tempo_valido=true;          // variavel para validar o tempo
    
    let checa_tempo =_=>{           //função para checar se o tempo inserido esta dentro dos padroes
        if(tempo>=tempo_padrao*2){ 
            kabum = false;
            insuficiente = false;   //se o tempo inserido for 2 vezes maior habilita somente o queimou
            queimou=true;}

        if (tempo>=tempo_padrao*3) {
            queimou = false;            //se o tempo inserido for 3 vezes maior habilita somente o kabum
            insuficiente=false;
            kabum=true;}

        if (tempo<tempo_padrao) {
            queimou=false;
            kabum=false;                // se o tempo for insuficiente habilita somente o insuficiente
            insuficiente=true;}
    }
    if (tempo >=0 & Number.isInteger(tempo) == true) { //verifica se o tempo é maior que 0 e se é um inteiro
        tempo_valido=true;                          //se o if for true habilita a variavel de validação de tempo
         switch(tipo_prato){                       //switch para selecionar o tipo de prato
            case 0: nome_prato ='Nenhum';           //nomear o prato, tempo padrão e validar o prato 
                    tempo_padrao=0;                   
                    prato_valido=true;
                    break;
            case 1: nome_prato ='Pipoca'; 
                    tempo_padrao=10;
                    prato_valido=true;
                    checa_tempo();
                    break;
                    
            case 2: nome_prato ='Macarrão';
                    tempo_padrao=8; 
                    prato_valido=true;
                    checa_tempo();
                    break;

            case 3: nome_prato ='Carne';
                    tempo_padrao=15;
                    prato_valido=true;
                    checa_tempo();
                    break;

            case 4: nome_prato ='Feijão'; 
                    tempo_padrao=12;
                    prato_valido=true;
                    checa_tempo();
                    break;

            case 5: nome_prato ='Brigadeiro'; 
                    tempo_padrao=8;
                    prato_valido=true;
                    checa_tempo();
                    break;
            
            default: prato_valido=false; // se nenhuma opção de case desvalida o prato
                     
        }
    } else {tempo_valido=false;} // se o tempo informado for um numero invalido desvalida o tempo
    
    console.log('\n********************************\n****BEM VINDO AO MICROONDAS*****\n********************************');
    console.log('********************************\n*************0.LIVRE************\n********************************');
    console.log('********************************\n*************1.PIPOCA***********\n********************************');       //menu
    console.log('********************************\n************2.MACARRÃO**********\n********************************');
    console.log('********************************\n**************3.CARNE***********\n********************************');
    console.log('********************************\n*************4.FEIJÃO***********\n********************************');
    console.log('********************************\n***********5.BRIGADEIRO*********\n********************************');
    
    if (prato_valido==true & tempo_valido==true){ //se o prato e tempo forem validos executa
        console.log('Prato Selecionado:',nome_prato+'\nO tempo padrão desse prato é:',tempo_padrao,'segundos');
        console.log('O tempo escolhido foi:',tempo,'segundos');
        if (queimou==true) {console.log('Foi selecionado mais que duas vezes o tempo padrao: Queimou!!!');} // verifica se queimou
        if (kabum==true) {console.log('Foi selecionado mais que tres vezes o tempo padrao: Kabumm!!!');}    //ou kabum
        if (insuficiente==true) {console.log('Foi selecionado tempo menor do que o padrão do prato: Tempo Insuficiente');} // ou insuficiente
        console.log('\n**********************************\n****PRATO PRONTO, BOM APETITE!****\n**********************************');//mensagem final
    }
    if (prato_valido == false){
        console.log('ERRO: Selecione um prato válido de 0 a 5'); //se prato for um numero invalido
    }
    if (tempo_valido == false){
        console.log("ERRO: Insira um tempo válido (em segundos, numero inteiro)"); //se tempo for um numero invalido
    }
}

microondas(3,20); //executando a função = microondas(prato,tempo)