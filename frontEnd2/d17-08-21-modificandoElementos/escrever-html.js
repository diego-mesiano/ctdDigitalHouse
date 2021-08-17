function escreverHTML(titulo, texto){
    const body = document.getElementById('body');
    const meuTemplate = `
        <h1>${titulo}</h1>
        <p>${texto}</p>
    `;
    body.innerHTML += meuTemplate;
}

escreverHTML('Titulo',"o que escrever aqui aparecerá no HTML");
escreverHTML('Titulo2',"Mais um aqui");
escreverHTML('Titulo3',"e mais 1")