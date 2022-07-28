select 'Consulta 1';
select fabricante from fabricantes order by fabricante;
select 'Consulta 2';
select fabricante, precio, año from bicicletas where año >=2019 order by fabricante;
select 'Consulta 3';
select fabricante from motocicletas where id_prov = 101;
select 'Consulta 4';
select fabricante from compras where alias = 'lucky' order by fabricante;
select 'Consulta 5';
select c.alias, c.nombre, c.apellido from clientes c, compras p where p.alias = c.alias and p.fabricante = 'Yeti' order by nombre;
select 'Consulta 6';
select count(fabricante) from bicicletas where año >= 2019;

