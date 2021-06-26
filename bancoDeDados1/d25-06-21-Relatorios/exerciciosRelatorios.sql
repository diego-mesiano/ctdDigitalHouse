 -- Na tabela faturas:
   SELECT * FROM `faturas`;

 -- O valor da fatura mais alta cujo a cidade de cobrança é 
 -- “Oslo”. (MAX)
SELECT MAX(`total`) 
FROM `faturas`
wHERE `ciudad_de_facturacion` = 'Oslo';

-- O valor da fatura mais baixa de todas. (MIN)
SELECT MIN(`total`)
FROM `faturas`;

-- O valor médio das faturas que o país de cobrança é “Canada”.(AVG)
SELECT AVG(`total`)
FROM `faturas`
WHERE `pais_de_facturacion` = 'Canada'; 

-- A quantidade de faturas que o país de cobrança é “Canada”. (COUNT)
SELECT COUNT(`total`)
FROM `faturas`
WHERE `pais_de_facturacion` = 'Canada'; 

-- O valor total somado de todas as faturas. (SUM)
SELECT SUM(`total`)
FROM `faturas`;

--  Selecione o id, a data e valor das faturas com valor abaixo da média. 
-- (Subqueries e AVG)
SELECT `id`, `fecha_factura`, `total`
FROM `faturas`
WHERE `total` < (SELECT AVG(`total`) FROM `faturas`);  

-- Na tabela empregados:
SELECT * FROM `empregados`;

-- A data de nascimento do funcionário mais jovem da empresa (MAX)
SELECT `id`,`nombre`,`fecha_nacimiento` 
FROM `empregados`
WHERE `fecha_nacimiento` = (SELECT MAX(`fecha_nacimiento`) FROM `empregados`);

-- A data de nascimento do funcionário mais velho da empresa (MIN)
SELECT `id`,`nombre`,`fecha_nacimiento` 
FROM `empregados`
WHERE `fecha_nacimiento` = (SELECT MIN(`fecha_nacimiento`) FROM `empregados`);

-- Formate a data do nascimento dos funcionários no formato ex: "02 May 2020"(DATE_FORMAT)
SELECT DATE_FORMAT(`fecha_nacimiento`, '%d %M %y')
FROM `empregados`;

-- Na tabela cancoes
SELECT * FROM `cancoes`;

--  O numero de cancoes que tem como compositor “AC/DC”. (COUNT)
SELECT COUNT(`compositor`)
FROM `cancoes`
WHERE `compositor` = 'AC/DC';

-- A duração média das músicas em milisegundos (AVG)
SELECT AVG(`milisegundos`)
FROM `cancoes`;

-- O tamanho médio em bytes das músicas que como compositor “AC/DC”. (AVG)
SELECT AVG(`bytes`)
FROM `cancoes`;

-- Na tabela clientes:
SELECT * FROM `clientes`;

--  Quantidade de clientes que moram na cidade de “São Paulo”(COUNT)
SELECT COUNT(`ciudad`)
FROM `clientes`
WHERE `ciudad` = 'sao paulo';

-- Quantidade de clientes que moram na cidade “Paris” (COUNT)
SELECT COUNT(`ciudad`)
FROM `clientes`
WHERE `ciudad` = 'paris';

-- Quantidade de clientes que tenham email do “yahoo” (COUNT e LIKE)
SELECT COUNT(`email`)
FROM `clientes`
WHERE `email`LIKE '%yahoo%';





