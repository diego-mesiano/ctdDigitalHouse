//classList.add()
//Adiciona uma nova classe ao elemento selecionado.

//minha class 'pComClass1' passará a se chamar 'pComClass AdicioneiIsso'
let citacao = document.querySelector('.pComClass1');
citacao.classList.add('AdicioneiIsso');
//---------------------------------------------------------
//classList.remove()
//Remove uma classe existente do elemento selecionado.

//minha class "pComClass2" passará a se chamar ""
let citacao2 = document.querySelector('.pComClass2');
citacao2.classList.remove('pComClass2');
//---------------------------------------------------------
//classList.toggle()
//Checa se existe uma classe no elemento selecionado. Caso exista, remove a classe do elemento. 
//Caso não, adiciona a classe ao elemento.

//Minha li não tinha uma class com esse comando ela passou a se chamar "GanheiUmaClass"
let citacao3 = document.querySelector('li');
citacao3.classList.toggle('GanheiUmaClass');
//----------------------------------------------------------
//classList.contains()
//Permite perguntar se um elemento possui determinada classe. 
//Retorna um valor booleano.

let citacao4 = document.querySelector('.pComClass1');
citacao4.classList.contains('pComId1'); //false

let citacao5 = document.querySelector('.pComClass1');
citacao5.classList.contains('pComClass1'); //true
