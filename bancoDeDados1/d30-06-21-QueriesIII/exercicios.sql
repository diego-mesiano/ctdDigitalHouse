-- 1. Liste os clientes que fizeram compras durante 1996.
-- A lista deve conter as seguintes colunas:
-- Nome e inicial do sobrenome. Por exemplo, em vez de 'Mario Pontes' você deveria dizer 'Mario P'.
-- O título é todo maiúsculo.

SELECT 																				-- SELECIONE:
	UPPER(CONCAT(`Nombre`, " ",SUBSTRING(`Apellido`, 1, 1))) AS `NOME+SOBRENOME`	-- A JUNÇÃO DOS CAMPOS "NOME" E "SOBRENOME" (MOSTRANDO SOMENTE A PRIMEIRA LETRA DO SOBRENOME) TUDO EM MAIUSCULO CRIANDO UMA NOVA COLUNA NOMEADA COMO "NOME+SOBRENOME"
FROM `empleados`;																	-- DA TABELA "EMPLEADOS"

SELECT *											-- SELECIONE:
FROM `facturas`										-- TODAS AS COLUNAS DA TABELA "FACTURAS"
WHERE EXTRACT(YEAR FROM `FechaFactura`) = 1996;		-- QUANDO A DATA (EXTRAIDO APENAS O ANO) FOR IGUAL A 1996	

-- 2.Liste as faturas para as quais a remessa foi para uma cidade diferente da cidade 
-- do cliente. Considere apenas os clientes do Reino Unido.
-- A listagem deve incluir:
-- O número da fatura completando com zeros principais 8 itens. Por exemplo, 00001234
-- A data da fatura no formato YYYY-MM-DD. Por exemplo, 1996-12-01
-- Lpara a cidade do cliente
-- A cidade de destino
SELECT 																	-- SELECIONE:
	LPAD(`FacturaID`,8,'0') AS "Id_Fatura_formatado", 					-- A COLUNA "FACTURAID" COM 8 CARACTERES INSERINDO ZEROS A ESQUERDA CHAMANDO A COLUNA DE "Id_Fatura_formatado"
    DATE_FORMAT(`FechaFactura`,"%Y-%m-%d") AS "Data de Fechamento",     -- A COLUNA "FechaFactura" FORMATADA EM YYYY-MM-DD CHAMANDO A COLUNA DE "Data de Fechamento"
    `clientes`.`Ciudad`,												-- A COLUNA "CIDADE" DA TABELA "clientes"
    `CiudadEnvio`,														-- A COLUNA "CiudadEnvio" 
    `PaisEnvio`															-- A COLUNA "PaisEnvio"
FROM `facturas`															-- DA TABELA "facturas"
INNER JOIN `clientes` 													-- JUNTANDO COM A TABELA "clientes"
	ON `clientes`.`ClienteID` = `facturas`.`ClienteID`					-- QUANDO AS CHAVES PRIMARIAS E SECUNDARIAS SÃO IGUAIS
WHERE `PaisEnvio` = "UK" 												-- QUANDO PAIS DE ENVIO FOR = "UK"
	AND `clientes`.`Ciudad` != `CiudadEnvio` ;							-- E CIDADE DO CLIENTES DIFERENTE DA CIDADE DE ENVIO
    
-- 3. Liste as categorias e seus produtos, incluindo as categorias para as quais não há produtos no banco de dados.
-- Para nomes de produtos, onde mix ou Chef diz, substituí-lo por MIX ou CHEF, respectivamente. Por exemplo: Em vez de Filo Mix, coloque Mix Edge.

SELECT 																			-- SELECIONE:
	`categorias`.`CategoriaID`, 												-- A COLUNA
    `categorias`.`CategoriaNombre`, 											-- A COLUNA
    REPLACE(REPLACE(`productos`.`ProductoNombre`,"Chef", "CHEF"),"Mix", "MIX")	-- A COLUNA SUBSTITUINDO CONFORME A REGRA
FROM `productos`																-- DA TABELA
RIGHT JOIN `categorias`															-- JUNTANDO COM A TABELA DANDO PREFERENCIA A TABELA A DIREITA (MOSTRA AS CATEGORIAS SEM PRODUTOS CADASTRADOS)
	ON `categorias`.`CategoriaID` = `productos`.`CategoriaID`					-- QUANDO PK = FK
ORDER BY `CategoriaID`;															-- ORDENADO PELA CATEGORIA ID

-- 1. Para cada empresa de correio, calcule o transporte total. Inclua todas as empresas de correio, mesmo que não tenham realizado nenhuma operação.

SELECT 														-- SELECIONE:
	`correos`.`CorreoID`,									-- A COLUNA
    `correos`.`Compania`,									-- A COLUNA
    SUM(`facturas`.`EnvioVia`) AS "Valor Total"				-- A SOMA DA COLUNA RENOMEANDO 
FROM `correos`												-- DA TABELA
LEFT JOIN `facturas`										-- JUNTANDO COM A TABELA "FACTURAS" E DANDO PREFERENCIA PARA A TABELA "CORREOS"
	ON `correos`.`CorreoID` = `facturas`.`EnvioVia`			-- QUANDO PK = FK
GROUP BY `correos`.`CorreoID`;								-- ORDENADO PELO GRUPO DE ID CORREO

-- 2. Liste as informações de contato (ou, endereço, etc.) dos clientes que não fizeram compras. 
-- Exiba as informações no formato considerado mais adequado. Por exemplo: <endereço> (CP: < CEP>) 
SELECT * FROM `facturas`;

SELECT
	`clientes`.`ClienteID` AS "ID CLIENTE",
    `clientes`.`Contacto` AS "NOME",
    CONCAT("RUA: ",`clientes`.`Direccion`, " CIDADE: ",`clientes`.`Ciudad`, " UF: ", `clientes`.`Regiones`, " CEP: ",`clientes`.`CodigoPostal`, " Pais: ", `Pais`) AS "ENDEREÇO COMPLETO"
FROM `clientes`
INNER JOIN `facturas`
	-- ON `facturas`.`ClienteID` = `clientes`.`ClienteID`
-- GROUP BY `facturas`.`ClienteID`
WHERE `facturas`.`ClienteID` != `clientes`.`ClienteID`;


    
    


