const listadeFelinos = [
    {
      title: 'O tigre',
      imgUrl: 'https://s2.glbimg.com/9vpo_9DwmlxXDQvA-EKAcFVTz1U=/e.glbimg.com/og/ed/f/original/2019/07/31/aggressive-disposition-big-cat-carnivore-2649841.jpg',
      description: 'O Tigre (Panthera tigris) é uma das espécies da subfamília dos panterinos (família Felidae) pertencente ao gênero Panthera. Só é encontrado no continente asiático; É um predador carnívoro e é a maior espécie de felino do mundo, junto com o leão, podendo ambos atingir um tamanho comparável ao dos maiores fósseis de felinos.',
      createdAt: '2021-06-01T23:12:11.837Z'
    },
    {
      title: 'O leão',
      imgUrl: 'https://exame.com/wp-content/uploads/2019/07/rei-leao.jpg',
      description: 'O leão (Panthera leo) é um mamífero carnívoro da família dos felídeos que é uma das cinco espécies do gênero Panthera. Leões selvagens vivem em populações cada vez mais dispersas e fragmentadas na África Subsaariana (com exceção das regiões de selva da costa atlântica e da Bacia do Congo) e em uma pequena área do noroeste da Índia',
      createdAt: '2021-05-05T23:12:11.837Z'
    },
    {
      title: 'O leopardo',
      imgUrl: 'https://static.mundoeducacao.uol.com.br/mundoeducacao/2021/03/1-panthera-pardus.jpg',
      description: 'O leopardo (Panthera pardus) é um mamífero carnívoro da família dos felídeos. Como três dos outros gatos do gênero Panthera: o leão, o tigre e a onça, eles se caracterizam por uma modificação no osso hióide que lhes permite rugir. É também conhecida como pantera marrom e, quando tem a pelagem totalmente escura, como pantera negra (melânica).',
      createdAt: '2021-05-05T23:12:11.837Z'
    },
    {
      title: 'A pantera negra',
      imgUrl: 'https://img.vixdata.io/pd/webp-large/pt/sites/default/files/p/pantera-negra-02-19-1400-800.jpg',
      description: 'A pantera negra é uma variação negra (melanismo) de várias espécies de grandes felinos, principalmente o leopardo (Panthera pardus) e a onça pintada (Panthera onca). Mas deve-se ressaltar que não é uma espécie nova, nem mesmo uma subespécie, é simplesmente uma variação negra desses animais.',
      createdAt: '2021-04-09T23:12:11.837Z'
    },
    {
      title: 'O jaguar',
      imgUrl: 'https://segredosdomundo.r7.com/wp-content/uploads/2021/04/jaguar-o-que-e-origem-caracteristicas-e-curiosidades-2.jpg',
      description: 'O jaguar, jaguar ou yaguareté (Panthera onca) é um felino carnívoro da subfamília dos Panterinos e gênero Panthera. É a única das cinco espécies atuais desse gênero encontradas na América. É também o maior felino da América e o terceiro maior do mundo, depois do tigre (Panthera tigris) e do leão (Panthera leo).',
      createdAt: '2021-05-18T23:12:11.837Z'
    },
    {
      title: 'O guepardo',
      imgUrl: 'https://cdn.britannica.com/s:575x450/98/152298-004-FE1345ED.jpg',
      description: 'A chita (Acinonyx jubatus) 1 é um membro atípico da família dos felídeos. É o único representante vivo do gênero Acinonyx. Ele caça graças à sua visão e grande velocidade. É o animal terrestre mais rápido, atingindo velocidade máxima de 115 km / h em corridas de até quatrocentos ou quinhentos metros.',
      createdAt: '2021-05-22T23:12:11.837Z'
    },
  ];

  for (let i = 0;i<listadeFelinos.length;i++){
      let title = listadeFelinos[i].title;
      let imgUrl = listadeFelinos[i].imgUrl;
      let description = listadeFelinos[i].description;
      let createdAt = listadeFelinos[i].createdAt;
      document.querySelector('body').innerHTML += `<h1>${title}</h1>`;
      document.querySelector('body').innerHTML += `<img src="${imgUrl}" width="30%"></img>`;
      document.querySelector('body').innerHTML += `<p>${description}</p>`;
      document.querySelector('body').innerHTML += `<p>${createdAt}</p>`;
  }