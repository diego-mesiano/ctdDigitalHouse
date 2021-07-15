/*1 -- Na tabela clientes selecione os campos nome e sobrenome e concatene(função concat) 
eles para que formarem o nome completo do cliente. Relacione cada cliente com a 
cidade de cobrança que consta na tabela faturas. Precisamos apenas uma ocorrência
 distinta de cada cliente.*/
SELECT DISTINCT -- DISTINCT retorna apenas 1 valor da tabela
	concat(c.nome, " ", c.sobrenome) AS cliente,
    f.cidade_cobranca
FROM clientes c
INNER JOIN faturas f 
		ON c.id = f.id_cliente
ORDER BY cliente ASC;

-- outra forma

SELECT 
	concat(c.nome, " ", c.sobrenome) AS cliente,
    f.cidade_cobranca
FROM clientes c
INNER JOIN faturas f 
		ON c.id = f.id_cliente
GROUP BY cliente
ORDER BY cliente ASC;

/*2 -- Na tabela cancoes selecione o nome da canção e relacionado com a tabela 
tipos_de_arquivos, selecione também o nome do tipo do arquivo. Inclua na sua seleção 
também as canções que não tem tipo de arquivo.
Ordene pelo id da canção de forma decrescente limitado a 4000 registros.*/

SELECT 
	c.nome,
    t. nome
FROM cancoes c
LEFT JOIN tipos_de_arquivo t
ON t.id = c.id_tipo_de_arquivo
ORDER BY c.id
DESC LIMIT 4;



/*3 -- Em nosso banco de dados, cada fatura é composta por várias músicas adquiridas 
pelos clientes. Selecione da tabela faturas o id do cliente e a data da fatura. Usando 
também a tabela intermediária itens_da_faturas selecione também o nome de cada musica 
adquirida ou seja, na tabela canções o campo nome. Ordene tudo pelo id do cliente de 
forma decrescente.*/

SELECT
	f.id_cliente,
    f.data_fatura,
    c.nome
FROM faturas f
INNER JOIN itens_da_faturas i ON f.id = i.id_fatura
INNER JOIN cancoes c ON i.id_cancao = c.id
ORDER BY f.id_cliente DESC;

/*4 -- Um artista tem albuns, que por sua vez tem cancões. Selecione o nome do artista
 da tabela artistas, selecione os nomes dos albuns deste artista (tabela intermediária albuns)
 e também o nome das canções deste artista contidas nos albuns (tabela cancoes). 
 Ordene os resultados pelo nome do artista de forma decrescente.*/
 
SELECT
	ar.id AS 'ID do artista',
    ar.nome AS 'Artista',
    al.id AS 'ID do Album',
    al.titulo AS 'Album',
    c.nome AS 'Musica'
FROM artistas ar
INNER JOIN albuns al ON ar.id = al.id_artista
INNER JOIN cancoes c ON c.id_album = al.id
ORDER BY ar.nome DESC LIMIT 4000;
 
 /*5 -- Selecione o nome dos gêneros(table generos), o nome das canções deste gênero 
 (table cancoes) e o tipo de arquivo de cada canção (tipos_de_arquivo). Selecione inclusive 
 as musicas que o tipo de arquivo é nulo. Ordene tudo isso pelo nome do gênero de forma 
 decrescente. */
 
SELECT 
	g.id as IDgenero,
    g.nome as Genero,
    c.nome as 'Nome da Musica',
    t.id as 'ID Tipo arquivo',
    t.nome as 'Tipo de Arquivo'
FROM generos g
RIGHT JOIN cancoes c ON g.id = c.id_genero
LEFT JOIN tipos_de_arquivo t ON c.id_tipo_de_arquivo = t.id
ORDER BY g.nome LIMIT 4000;









