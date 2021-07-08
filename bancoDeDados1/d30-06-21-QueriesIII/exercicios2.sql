-- Utilizando o banco de dados musmundos_v2 execute:
USE musimundos_v2;

-- 1) Liste a quantidade de canções existem para cada gênero musical,
-- agrupando a consulta por gênero e ordenando da maior quantidade para a
-- menor.

CREATE VIEW teste AS
SELECT g.nome, COUNT(c.id) AS qtd_cancoes
FROM `generos`AS g INNER JOIN `cancoes`AS c
ON g.id = c.id_genero
GROUP BY g.nome
ORDER BY qtd_cancoes DESC;

-- 2) Liste a quantidade de canções existentes para gênero musical, agrupando
-- por gênero. Exiba apenas os genêros que tem mais de 10 canções.

SELECT a.id, a.nome, COUNT(b.id) AS qtd_cancoes
FROM `generos` AS a INNER JOIN `cancoes` AS b
ON a.id = b.id_genero
GROUP BY a.nome
HAVING qtd_cancoes > 10; 