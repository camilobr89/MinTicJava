CREATE TABLE motocicletas (
  id INT primary key,
  fabricante CHAR(20),
  precio INT,
  autonomia INT,
  id_prov INT,
  foreign key (fabricante) references fabricantes (fabricante),
  foreign key (id_prov) references proveedor (prov_id)
);
    
insert into motocicletas
		values
			(2001, 'Starker', 4200000, 18, 101),
            (2002, 'Lucky Lion', 5600000, 14, 102),
            (2003, 'Be Electric', 4600000, 26, 101),
            (2004, 'Aima', 8000000, 36, 103),
            (2005, 'Mec de Colombia', 5900000, 20, 104),
            (2006, 'Atom Electric', 4500000, 12, 105);
            
