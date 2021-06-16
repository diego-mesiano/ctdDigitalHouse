
CREATE SCHEMA`playground`;
CREATE TABLE `usuarios`(
	`idUsuario` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`nome` VARCHAR(100),
    `sobrenome` VARCHAR(100),
    `email` VARCHAR(100));
    
CREATE TABLE `usuarios_curso`(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`inscricao` VARCHAR(100));
    
    CREATE TABLE `curso`(
	`idCurso` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`titulo` VARCHAR(100),
    `descricao` TEXT);
    
    CREATE TABLE `categoria`(
	`idCategoria` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`nome` VARCHAR(100));