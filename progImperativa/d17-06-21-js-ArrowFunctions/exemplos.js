const exibir = () => {
console.log('Arrow Function!!!!!');}; //dessa forma funciona, mas não é a ideal
exibir();

const exibir2 = () => console.log('\nArrow Function mais enxuta!!!!!'); //ta melhorando
exibir2();    //^sem parametros | 1 linha dispensa ()

const exibir3 = (num1,num2) => console.log('\nOpa, Recebi 2 numeros:', num1, 'e', num2); 
             //^com parametros
exibir3(100,200);

const somar = (num1,num2) => { //mais de uma linha tem q usar {}
    console.log('\nSomei:', num1 + num2); 
    return num1+num2;}
let soma = somar(100,50);    
somar(100,200);
console.log('\nValor da variavel atribuida com a função:', soma);