var api = fetch('https://dog.ceo/api/breeds/image/random')

let i = 0;

while (i == 0) {
    setTimeout(() => {
        api.then((response) => {
            return response.json().then((info) => {
                document.querySelector("body").innerHTML += `<img src="${info.message}">`
            })
            console.log(response)
        }).catch((erro) => {
            console.log(erro)
        })

    }, 2500)
}
