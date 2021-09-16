const api = fetch('https://fakestoreapi.com/products/');

api.then(res => res.json()).then(json => {
  const body = document.querySelector("body");
  json.map(produto => {
    let card = `
      <div class="card">
        <h3>${produto.title}</h3>
        <strong>${produto.category}</strong>
        <img src="${produto.image}" alt="${produto.title}">
        <p>${produto.description}</p>
      </div>
    `;

    body.innerHTML += card;
  });
});
