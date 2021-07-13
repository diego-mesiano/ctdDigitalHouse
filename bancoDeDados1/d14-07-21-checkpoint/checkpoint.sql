-- CRIANDO A BASE
CREATE SCHEMA restaurante;

-- SELECIONA A BASE COMO PADRÃO
USE restaurante;

 /*-------------------------------------------------------------------------------------*\
|**************************CRIANDO AS TABELAS E RELACIONAMENTOS***************************|
 \*-------------------------------------------------------------------------------------*/

-- TABELA clientes
CREATE TABLE IF NOT EXISTS clientes (
ID INT AUTO_INCREMENT PRIMARY KEY,
Nome VARCHAR(80) NOT NULL,
Cpf VARCHAR(14),
Endereco VARCHAR(100) NOT NULL,
Bairro VARCHAR(30),
Cidade VARCHAR(50),
Cep INT,
Telefone VARCHAR(15)
);

-- TABELA fornecedores
CREATE TABLE IF NOT EXISTS fornecedores (
ID INT AUTO_INCREMENT PRIMARY KEY,
Nome VARCHAR(50),
CNPJ VARCHAR(20),
Endereco VARCHAR(100),
Telefone VARCHAR(15)
);

-- TABELA produtos
CREATE TABLE IF NOT EXISTS produtos (
ID INT AUTO_INCREMENT PRIMARY KEY,
ID_fornecedor INT,
Produto VARCHAR(100),
Qtd_estoque INT,
Preco_custo DECIMAL (10,2),
Preco_venda DECIMAL (10,2),
CONSTRAINT ID_fornecedor         
	FOREIGN KEY (ID_fornecedor)
    REFERENCES fornecedores(ID)
    ON DELETE CASCADE
	ON UPDATE CASCADE
);

-- TABELA entregadores
CREATE TABLE IF NOT EXISTS entregadores (
ID INT AUTO_INCREMENT PRIMARY KEY,
Nome VARCHAR(80),
Telefone VARCHAR(15)
);

-- TABELA pedidos
CREATE TABLE IF NOT EXISTS pedidos (
ID INT AUTO_INCREMENT PRIMARY KEY,
ID_cliente INT, 
ID_produto INT,
ID_entregadores INT,
Quantidade INT,
Valor_total DECIMAL(10,2),
Data_hora DATETIME,
CONSTRAINT ID_cliente         
	FOREIGN KEY (ID_cliente)
    REFERENCES clientes(ID)
    ON DELETE CASCADE
	ON UPDATE CASCADE,
CONSTRAINT ID_produto         
	FOREIGN KEY (ID_produto)
    REFERENCES produtos(ID)
    ON DELETE CASCADE
	ON UPDATE CASCADE,
CONSTRAINT ID_entregadores         
	FOREIGN KEY (ID_entregadores)
    REFERENCES entregadores(ID)
    ON DELETE CASCADE
	ON UPDATE CASCADE
);

-- TABELA formas_pagamento
CREATE TABLE IF NOT EXISTS formas_pagamento (
ID INT AUTO_INCREMENT PRIMARY KEY,
Nome VARCHAR(50),
Tipo VARCHAR(30),
Taxa DECIMAL (10,2)
);

-- TABELA contas
CREATE TABLE IF NOT EXISTS contas (
ID INT AUTO_INCREMENT PRIMARY KEY,
ID_pedido INT,
ID_forma_pagamento INT,
Valor DECIMAL(10,2),
Conta_status TINYINT,
CONSTRAINT ID_pedido         
	FOREIGN KEY (ID_pedido)
    REFERENCES pedidos(ID)
    ON DELETE CASCADE
	ON UPDATE CASCADE,
CONSTRAINT ID_forma_pagamento         
	FOREIGN KEY (ID_forma_pagamento)
    REFERENCES formas_pagamento(ID)
    ON DELETE CASCADE
	ON UPDATE CASCADE
);

 /*-------------------------------------------------------------------------------------*\
|***************************INSERINDO REGISTROS NAS TABELAS*******************************|
 \*-------------------------------------------------------------------------------------*/
 
 -- CADASTRANDO CLIENTES
INSERT INTO clientes 
    VALUES 
		(1,'Diego Mesiano', '123.456.789-12', 'Rua João Tonoli, 258', 'Jd. Noruega', 'Campinas', 13057125, '19-3298-6635'),
        (2,'Joaquim da Silva', '987.654.321-98', 'Rua Santo Antonio, 798', 'Jd. do Sul', 'Campinas', 13023546, '19-98745-3655'),
        (3,'Monique de Oliveira', '963.852.741-96', 'Rua Martinho Lutero, 1247', 'Morro do Dende', 'Sumaré', 13587123, '19-4788-7744'),
        (4,'Marcos Noronha', '741.852.963-74', 'Av Monte Castelo, 2456', 'Cambui', 'Campinas', 13063258, '19-98463-5287'),
        (5,'Ana Marcondes', '789.456.123-78', 'Rua São Sebastião, 24', 'Jd Moreira', 'Campinas', 13087412, '19-99987-5474'),
        (6,'Maria', '987.654.321-98', 'Rua Santo Antonio, 798', 'Jd. do Sul', 'Campinas', 13023546, '19-98745-3655'),
        (7,'Miguel Felipe', '713.987.654-12', 'Av Brasil, 1589 AP 22', 'Cruzeiro Paulista', 'Hortolandia', 13457123, '19-96544-7744'),
        (8,'Tereza Martins', '546.987.411-54', 'Rua dos Lirios, 471', 'Jd Amanda', 'Campinas', 13021321, '19-94587-4112'),
        (9,'Giovana dos Santos', '457.411.444-55', 'Rua João Batista, 68', 'Jd. de Deus', 'Campinas', 13028546, '19-98745-3655'),
        (10,'Gabi', '123.456.789-10', 'Rua das Lindas, 10', 'Jd das Melhores', 'Campinas', 13010-010, '19-99999-1000');
	
-- CADASTRANDO FORNECEDORES
INSERT INTO fornecedores
	VALUES
			(1, 'Atacadão','99.123.654/0001-20', 'Rod. Anhanguera KM547', '19-98745-8577'),
            (2, 'Tenda','54.365.444/0052-01', 'Rua B 28', '19-5544-8547'),
            (3, 'Ceasa','47.655.874/0001-12', 'Rod. Anhanguera KM12', '19-9887-7885'),
            (4, 'Banca do Zé','44.223.123/0001-10', 'Mercadão, BOX 72', '19-97448-1239'),
            (5, 'Casa de Carnes Boi Bravo','987.413.547/0001-29', 'Rua Tamanduá, 45', '19-5544-8577');
            
-- CADASTRANDO PRODUTOS
INSERT INTO produtos
	VALUES
		(1, 5, 'Picanha', 25, 69.90, 99.90),
        (2,4,'Banana', 10, 2.98, 9.99),
        (3,2,'Arroz', 5, 22.90, 39.90),
        (4,2,'Feijão', 5, 7.99, 12.99),
        (5,3,'Beringela', 20, 1.99, 9.99),
        (6, 5, 'Contra-Filé', 50, 49.90, 79.90);
        
-- CADASTRANDO ENTREGADORES
INSERT INTO entregadores
	VALUES
		(1, 'Robson', '19-9998-8877'),
        (2, 'Matheus', '19-98878-9072'),
        (3, 'Nicole', '19-99228-4579'),
        (4, 'Humberto', '19-97412-2100'),
        (5, 'Natan', '19-98744-4173');
        
-- CADASTRANDO FORMAS DE PAGAMENTO
INSERT INTO formas_pagamento
	VALUES
		(1, 'Dinheiro', 'A vista', 0),
        (2, 'Debito', 'Cartão', 1.98),
        (3, 'Crédito', 'Cartão', 3.98),
        (4, 'Pix', 'Transferencia', 0),
        (5, 'Barras de Ouro', 'A vista', 0),
        (6, 'Ticket', 'A vista',6.99); 

-- CADASTRANDO PEDIDOS
INSERT INTO pedidos
	VALUES
		(1, 1, 1, 1, 2, 199.98, '2021-07-12 22:52'),
        (2, 1, 5, 1, 1, 99.99, '2021-07-12 23:22'),
        (3, 1, 3, 1, 1, 39.90, '2021-07-12 23:29'),
        (4, 10, 1, NULL, 1, 99.99, '2021-07-13 00:45');

-- CADASTRANDO CONTAS
INSERT INTO contas
	VALUES
		(1,1,1,199.98,1),
        (2,2,1,99.99,1),
        (3,3,1,39.90,1),
        (4,4,3,99.99,1);
        
 /*-------------------------------------------------------------------------------------*\
|****************************ATUALIZANDO DADOS NAS TABELAS********************************|
 \*-------------------------------------------------------------------------------------*/
 
 -- ATUALIZANDO TELEFONE DO CLIENTE ID = 1
 UPDATE clientes
	SET telefone = '19-98705-8090'
	WHERE ID = 1;
 
-- ATUALIZANDO O ENTREGADOR DO PEDIDO ID = 4
UPDATE pedidos
	SET ID_entregadores = 3
    WHERE ID = 4;
    
-- ATUALIZANDO TIPO DE FORMA DE PAGAMENTO CADASTRADO ERRADO
UPDATE formas_pagamento
	SET Tipo = 'Cartão'
    WHERE ID = 6;
  
 
 /*-------------------------------------------------------------------------------------*\
|***********************************EXCLUINDO DADOS***************************************|
 \*-------------------------------------------------------------------------------------*/
 
 -- DELETANDO O CLIENTE DE ID = 3
 DELETE
	FROM clientes
    WHERE ID = 3;
    
-- DELETANDO FORMA DE PAGAMENTO NÃO ACEITA (BARRAS DE OURO)
SET SQL_SAFE_UPDATES=0;
DELETE
	FROM formas_pagamento
    WHERE Nome = 'Barras de Ouro';
SET SQL_SAFE_UPDATES=1;
    
-- DELETANDO CLIENTES QUE NÃO SÃO DE CAMPINAS
SET SQL_SAFE_UPDATES=0;
DELETE
	FROM clientes
    WHERE Cidade <> 'Campinas';
SET SQL_SAFE_UPDATES=1;

 /*-------------------------------------------------------------------------------------*\
|***************************************SELECTS*******************************************|
 \*-------------------------------------------------------------------------------------*/
 
 -- LISTANDO TODOS OS PRODUTOS QUE CUSTAM MAIS DE R$50 (PREÇO DE VENDA)
SELECT
	ID,
    Produto,
	Preco_venda AS 'Preço de Venda'
FROM produtos
WHERE Preco_venda > 50; 

-- FORMAS DE PAGAMENTO DO TIPO CARTÃO
SELECT 
	*
FROM formas_pagamento
WHERE tipo = "Cartão";

-- LISTANDO ENTREGADORES DO PEDIDO 1
UPDATE pedidos -- PRIMEIRO MODIFIQUEI UM ENTREGADOR PARA TESTES
	SET ID_entregadores = 5
    WHERE ID = 1;

SELECT
	P.ID as IDpedido,
    p.ID_cliente as IDcliente,
    c.Nome as Nome,
    p.ID_produto as IDproduct,
    p.Id_entregadores as IDeentregadores,
    e.Nome as Entregador
FROM pedidos as p
LEFT JOIN clientes AS c ON p.ID_cliente = c.ID
LEFT JOIN entregadores AS e on e.ID = p.ID_entregadores
WHERE p.ID_cliente = 1;  
    
    
    


    
	







