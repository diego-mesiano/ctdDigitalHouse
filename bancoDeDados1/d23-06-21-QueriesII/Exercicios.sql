-- Apresente uma lista de todas as categorias.
SELECT *
FROM `categorias`;

-- Como as categorias não possuem imagens, obtenha uma lista de CategoriaNom e Descrição.
SELECT `CategoriaNombre`,`Descripcion`
FROM `categorias`;

-- Obtenha uma lista de produtos.
SELECT * FROM `productos`;

-- Existem produtos descontinuados? 
SELECT `Discontinuado` 
FROM `productos`;

-- Você deve se encontrar com o Fornecedor 8. Quais produtos você fornece?
SELECT * 
FROM `proveedores` WHERE `ProveedorID`=8;
SELECT * 
FROM `productos` WHERE `ProveedorID`=8;

-- Apresente todos os produtos cujo preço unitário está entre 10 e 22.
SELECT * 
FROM `productos` 
WHERE `PrecioUnitario`>10 AND `PrecioUnitario`<22;

-- Defina que um produto deve ser encomendado ao fornecedor, se suas unidades em estoque forem inferiores ao Nível de Reordenação
SELECT  * 
FROM `productos` 
WHERE `UnidadesStock` < `NivelReorden`;

-- Detalhe todos os produtos listados acima, considerando que há Unidades Encomendadas iguais a zero.
SELECT  * 
FROM `productos` 
WHERE `UnidadesStock` < `NivelReorden` AND `UnidadesPedidas` = 0;

-- Obtenha uma lista de todos os clientes com Contato, Empresa,Título, País. Classifique a listagem por País.
SELECT  `Contacto`,`Compania`,`Titulo`,`Pais` 
FROM `clientes` 
ORDER BY `Pais` ASC;

-- Apresente todos os clientes que têm o título "Proprietário".  
SELECT  * 
FROM `clientes` 
WHERE `Titulo` = "Owner";

-- A secretária que atendia um cliente não se lembra do nome dele. Ela só sabe que começa com "C". 
-- Como podemos ajudá-la a obter uma lista de todos os contatos que começam com C?
SELECT  * 
FROM `clientes` 
WHERE `contacto` LIKE 'C%' 
ORDER BY `contacto`;

-- Obtenha uma lista de todas as faturas, classificadas pela data da fatura upstream.
SELECT * 
FROM `facturas` 
ORDER BY `FechaFactura` DESC;

-- Uma lista de faturas com o país de transporte "EUA" agora é necessária, 
-- e seu e-mail (Envio) é diferente de 3. Como você pode FacturaIDapresentá-la?
SELECT * 
FROM `facturas` 
WHERE `PaisEnvio` = "USA" 
	AND `EnvioVia` != 3;

-- O cliente 'GOURL' fez um pedido?
-- SELECT * FROM `clientes` WHERE `Contacto`LIKE 'GOURL%';
SELECT * 
FROM `clientes` 
WHERE `Contacto` = "GOURL%";

-- Exiba todas as faturas dos FUNCIONARIOS 2, 3, 5, 8 e 9
SELECT * 
FROM `facturas` 
WHERE `EmpleadoID` = 2 
	OR `EmpleadoID` = 3 
    OR `EmpleadoID` = 5 
    OR `EmpleadoID` = 8 
    OR `EmpleadoID` = 9 
ORDER BY `EmpleadoID` ;

-- Obtenha a lista de todos os produtos classificados em ordem decrescente por Preço Unitário
SELECT * 
FROM `productos` 
ORDER BY `PrecioUnitario` DESC;

-- Obtenha a lista top 5 de produtos cujo preço unitário é o mais "caro".
SELECT * 
FROM `productos` 
ORDER BY `PrecioUnitario` DESC LIMIT 5;

-- Obtenha um top 10 dos produtos com mais unidades em Stock.
SELECT * 
FROM `productos` 
ORDER BY `UnidadesStock` 
DESC LIMIT 10;

-- Obtenha uma lista de InvoiceID, Produto, Quantidade. ?????????????????
SELECT `FacturaID`, `ProductoID`, `Cantidad` 
FROM `facturadetalle`;

-- Classifique a lista acima por Quantidade descendente.
SELECT `FacturaID`, `ProductoID`, `Cantidad` 
FROM `facturadetalle` 
ORDER BY `Cantidad` DESC;

-- Filtre a lista apenas para os produtos no qual a quantidade está entre 50 e 100.
SELECT `FacturaID`, `ProductoID`, `Cantidad` 
FROM `facturadetalle` 
WHERE `Cantidad`>=50 
	AND `Cantidad`<=100 
ORDER BY `Cantidad` DESC;

-- Em outra nova listagem, obtenha uma lista com os seguintes nomes de coluna: InvoiceID, Product (ProductID),Total (UnitPrice*Quantity)
SELECT `FacturaID`, `ProductoID`, `PrecioUnitario` 
FROM `facturadetalle`;

-- Obtenha uma lista de todos os clientes que moram no "Brasil" ou no “México”, ou que tenham um título que comece com "Vendas". 
SELECT *
FROM `clientes`
WHERE `Pais` LIKE 'Bra_il' 
	OR `Pais` LIKE 'M_xico'
    OR `Titulo` LIKE 'Sales%'
ORDER BY `Titulo`;

-- Obtenha uma lista de todos os clientes que pertencem a uma empresa que inicia com "A".
SELECT *
FROM `clientes`
WHERE `Compania` LIKE 'A%'; 

-- Obtenha uma lista com os seguintes dados: Cidade, contato e renomeie-o como Sobrenome e Nome.
SELECT `Ciudad` AS 'Sobrenome' , `Contacto` AS 'Nome'
FROM `clientes`;

-- Obtenha uma lista de todas as faturas com 10000 e 10500
SELECT *
FROM `facturadetalle`
WHERE `FacturaID` >= 10000
	AND `FacturaID` <= 10500;

-- Obtenha uma lista de todas as faturas com IDs entre 10000 e 10500, ou clientes com IDs começando com "B". ?????
SELECT *
FROM `facturadetalle`
WHERE `FacturaID` >= 10000
	AND `FacturaID` <= 10500
    OR `FacturaID` LIKE 'B%';
    
-- Existem faturas em que a cidade envia "Vancouver" ou que usam o correio 3?
SELECT *
FROM `facturas`
WHERE `CiudadEnvio` = 'Vancouver'
	OR `EnvioVia` = 3;
    
-- Qual é a ID do empregado de "Buchanan"?????
SELECT *
FROM `empleados`
WHERE `Notas` LIKE '%Buchanan%';

-- Existem “Faturas employ” e ID para o empregado do item anterior? (Não é necessário relacioná-los, mas verifique se existem notas 
SELECT *
FROM `facturas`
WHERE `EmpleadoID` = 5;









