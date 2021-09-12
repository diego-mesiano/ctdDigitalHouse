//window.onload = function (load) {
    //load.preventDefault();
    //O local Storage armazena apenas numeros e string, não é possivel armazenar objetos ou arrays.
    //Para gravar um objeto ou array no Local ou SessionStorage é necessário "stringficar" o objeto e
    //podemos fazer isso através de JSON!

    //Vejamos o Exemplo:

    //considere o seguinte json
    var heroiJson = {
        nome: "Goku",
        podeVoar: true
    };


    console.log("Imprimindo a variavel heroi, veremos que imprimiu um objeto: " + heroiJson);

    //imprimindo diretamente mostra o objeto com as {}
    console.log(heroiJson);

    //Agora vamos stringficar o Json, dessa forma:
    var heroiStringficado = JSON.stringify(heroiJson);

    console.log("Imprimindo a variavel stringficada: " + heroiStringficado);

    //Agora vamos voltar a ser um Json
    var heroiJson2 = JSON.parse(heroiStringficado);

    console.log(heroiJson2);

    //agora vamos gravar o Json no LocalStorage
    localStorage.setItem('heroiJson', JSON.stringify(heroiJson));

    //agora vamos recuperar o arquivo e armazenar em um novo objeto
    var goku = JSON.parse(localStorage.getItem('heroiJson'));
    console.log(goku);

    //agora vamos criar um novo heroi
    var objVegeta = {
        nome: "Vegeta",
        podeVoar: false
    }

    //vamos stringfica-lo primeiro
    var strVegeta = JSON.stringify(objVegeta);
    console.log(objVegeta); //JSON puro
    console.log(strVegeta); //JSON em formato string

    //vamos gravar o vegeta na localStorage
    localStorage.setItem('vegeta', strVegeta);

    //vegeta ja esta salvo no localStorage, mas tem algo errado
    //pois vegeta sabe voar esta false no objeto então vamos alterar 
    //essa informação na LocalStorage

    //primeiro eu preciso trazer o LocalStorage para o JS
    objVegeta = JSON.parse(localStorage.getItem('vegeta'));
    console.log(objVegeta);

    //agora altero
    objVegeta.podeVoar = true;
    console.log("Agora vegeta pode voar:");
    console.log(objVegeta)

    //agora devo stringficar
    strVegeta = JSON.stringify(objVegeta);

    //agora mandar o Json stringficado para o LocalStorage
    localStorage.setItem('vegeta', strVegeta);

    //agora vou criar um array de objetos e mandar pro localStorage

    var objHerois = {
        nome: ["Goku", "Vegeta"],
        podeVoar: [true, true]
    }

    var strHerois = JSON.stringify(objHerois);
    localStorage.setItem('herois', strHerois);

    //adicionando mais herois
    objHerois.nome.push("Batman");
    objHerois.podeVoar.push(false);

    //funcão que adiciona novos herois
    var AddHerois = (nome, podeVoar) => {
        objHerois.nome.push(nome);
        objHerois.podeVoar.push(podeVoar);
    }

    AddHerois("Mulher Maravilha", false);
    AddHerois("Mestre Kame", false);
    AddHerois("Homem Aranha", false);
    console.log(objHerois);

    //agora vamos adicionar os herois na localStorage
    strHerois = JSON.stringify(objHerois);
    localStorage.setItem('herois', strHerois);

    //agora vamos criar uma função que adiciona os herois diretamente na local storage

    var inserirHeroisLocalStorage = (nome1, podeVoar1) => {
        strHerois = localStorage.getItem('herois');
        objHerois = JSON.parse(strHerois);
        objHerois.nome.push(nome1);
        objHerois.podeVoar.push(podeVoar1);
        strHerois = JSON.stringify(objHerois);
        localStorage.setItem('herois', strHerois);
    }

    inserirHeroisLocalStorage("Chapolim", false);

    inserirHeroisLocalStorage("Hulk", false);

    inserirHeroisLocalStorage("Thor", true);

    inserirHeroisLocalStorage("Super-Man", true)

    console.log(strHerois);
    console.log(objHerois);

    //agora o usuario vai poder inserir herois

    var criarForm = () => {
        var formulario = document.createElement("form");
        var txtNome = document.createElement("input");
        var radioVoa = document.createElement("input");
        var lblVoa = document.createElement("label");
        var radioNaoVoa = document.createElement("input");
        var lblNaoVoa = document.createElement("label");
        var btnCadastrar = document.createElement("button");

        document.body.appendChild(formulario);
        formulario.appendChild(txtNome);
        formulario.appendChild(radioVoa);
        formulario.appendChild(lblVoa);
        formulario.appendChild(radioNaoVoa);
        formulario.appendChild(lblNaoVoa);
        formulario.appendChild(btnCadastrar);

        radioVoa.setAttribute("type", "radio");
        radioVoa.setAttribute("id", "voa");
        radioVoa.setAttribute("name", "voa");
        lblVoa.setAttribute("for", "voa");
        lblVoa.innerText = "Voa"

        radioNaoVoa.setAttribute("type", "radio");
        radioNaoVoa.setAttribute("id", "naoVoa");
        radioNaoVoa.setAttribute("name", "voa");
        lblNaoVoa.setAttribute("for", "naoVoa");
        lblNaoVoa.innerText = "Não Voa"

        btnCadastrar.setAttribute("type", "button");
        btnCadastrar.setAttribute("id","butao")
        btnCadastrar.setAttribute("onclick","comecar();")
        btnCadastrar.innerHTML = "Cadastrar"
    }
    inserirHeroisLocalStorage("Kratos", false);
    var nome = '';
    var voaSim = false;
    var voaNao = false;
    criarForm();
    butao = document.getElementById("butao");
    formu = document.querySelector("form");
    let comecar = () =>{
        //a.preventDefault();
        console.log("entrei");
        nome = document.querySelector("input").value;
        voaSim = document.getElementById("voa").checked;
        voaNao = document.getElementById("naoVoa").checked;
        if (voaSim) {
            inserirHeroisLocalStorage(nome, true);
        } else {
            inserirHeroisLocalStorage(nome, false);
        }

        document.body.innerHTML += "<h5>Herois Cadastrados</h5>"
    strHerois = localStorage.getItem('herois');
    objHerois = JSON.parse(strHerois);
    console.log(objHerois);
    
    var voa = "";
    for (var i = 0; i < objHerois.nome.length; i++) {
        if (objHerois.podeVoar[i]) {
            voa = "VOA"
        } else {
            voa = "NÃO VOA"
        }
        document.body.innerHTML += `<p>${i}-${objHerois.nome[i]}-${voa}</p>`;
    }
    strHerois = JSON.stringify(objHerois);
    localStorage.setItem('herois', strHerois);

    }

    

    
//}












