-- -----------------------------------------------------
-- Table bicicletas
-- -----------------------------------------------------
CREATE TABLE bicicletas (
  id INT primary key,
  fabricante CHAR(20),
  precio INT,
  año INT,
  foreign key (fabricante) references fabricantes (fabricante)
  );

insert into bicicletas
		values
			(1001, 'Cannondale', 1200000, 2020),
            (1002, 'Trek', 1450000, 2019),
            (1003, 'Yeti', 2000000, 2020),
            (1004, 'Fuji', 950000, 2021),
            (1005, 'Bmc', 1950000, 1018);
            
