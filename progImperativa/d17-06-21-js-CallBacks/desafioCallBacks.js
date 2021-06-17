/*Crie uma função acaoCarro(), que receberá uma callback como parâmetro. Após isso, crie duas funções: 
andar() – deve exibir uma mensagem dizendo que o carro está andando – e parar() – deve exibir uma mensagem 
dizendo que o carro parou.

Execute ambas as ações utilizando a função acaoCarro(), passando suas ações como callbacks.*/

let andar=()=>'Carro em movimento!'; //Arrow Function que poderá servir como callback para a função 'acaoCarro'

let parar=()=>'Carro parou!'; //outra opção de callback para 'acaoCarro'

let acaoCarro=(callback)=>console.log(callback(andar,parar)); //Arrow Function que recebe como parametro um callback (outra função)

acaoCarro(andar);
acaoCarro(parar);