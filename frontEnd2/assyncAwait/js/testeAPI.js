//forma com promisse
const promise = fetch("https://dog.ceo/api/breeds/image/random")
promise.then((resolve) => {
    resolve.json().then((mensagem) =>
        document.querySelector('body').innerHTML += `<img src = "${mensagem.message}">`
    )
})


//Forma com assinc await
async function showDogs(){
    const response = await fetch ("https://dog.ceo/api/breeds/image/random")
    const dogImage = await response.json();
    document.body.innerHTML +=`<img src = "${dog.image.message}">`
}

showDogs();