SELECT *FROM `categorias`;

SELECT `CategoriaNombre`,`Descripcion`FROM `categorias`;

SELECT * FROM `productos`;

SELECT `Discontinuado` FROM `productos`;

SELECT * FROM `proveedores` WHERE `ProveedorID`=8;
SELECT * FROM `productos` WHERE `ProveedorID`=8;

SELECT * FROM `productos` WHERE `PrecioUnitario`>10 AND `PrecioUnitario`<22;

SELECT  * FROM `productos` WHERE `UnidadesStock` < `NivelReorden`;

SELECT  * FROM `productos` WHERE `UnidadesStock` < `NivelReorden` AND `UnidadesPedidas` = 0;

SELECT  `Contacto`,`Compania`,`Titulo`,`Pais` FROM `clientes` ORDER BY `Pais` ASC;

SELECT  * FROM `clientes` WHERE `Titulo` = "Owner";

SELECT  * FROM `clientes` ORDER BY `Contacto` ASC;
