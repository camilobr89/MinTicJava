CREATE TABLE compras (
  id INT primary key,
  alias CHAR(20),
  fabricante CHAR(20),
  fecha_hora TIMESTAMP,
  foreign key (alias) references clientes (alias),
  foreign key (fabricante) references fabricantes (fabricante)
  );
  
  insert into compras
		value 
			(101,'lucky', 'Cannondale', '2017-10-25 20:00:00'),
            (102, 'lucky', 'Trek', '2019-03-15 18:30:00'),
            (103, 'lucky', 'Starker', '2019-05-20 20:30:00'),
            (104, 'malopez', 'Cannondale', '2018-05-20 20:30:00'),
            (105, 'malopez', 'Starker', '2020-01-20 20:30:00'),
            (106, 'diva', 'Yeti', '2019-05-20 20:30:00'),
            (107, 'diva', 'Fuji', '2018-06-22 21:30:00'),
            (108, 'diva', 'Lucky Lion', '2020-03-17 15:30:20'),
            (109, 'dreamer', 'Lucky Lion', '2020-03-17 15:30:20'),
            (110, 'dreamer', 'Be Electric', '2020-04-10 18:30:20'),
            (111, 'ninja', 'Aima', '2020-02-17 20:30:20'),
            (112, 'ninja', 'Starker', '2020-02-20 16:30:20'),
            (113, 'ninja', 'Mec de Colombia', '2020-03-27 18:30:20'),
            (114, 'rose', 'Atom Electric', '2020-03-20 21:30:20'),
            (115, 'green', 'Yeti', '2020-01-10 17:30:20'),
            (116, 'green', 'Trek', '2020-02-15 20:30:20'),
            (117, 'green', 'Bmc', '2020-03-17 18:30:20');
            
	
            