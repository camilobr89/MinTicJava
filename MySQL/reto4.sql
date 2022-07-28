




-- -----------------------------------------------------
-- Table motocicletas
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reto4`.`motocicletas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fabricante` CHAR(20) NOT NULL,
  `id_prov` INT NOT NULL,
  `precio` INT NOT NULL,
  `autonomia` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `Proveedor_idx` (`id_prov` ASC) VISIBLE,
  INDEX `fabricante_idx` (`fabricante` ASC) VISIBLE,
  CONSTRAINT `proveedor`
    FOREIGN KEY (`id_prov`)
    REFERENCES `reto4`.`proveedor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_prov`
    FOREIGN KEY (`fabricante`)
    REFERENCES `reto4`.`fabricantes` (`fabricantes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
insert into motocicletas
		values
			(2001, 'Starker', 4200000, 18, 101),
            (2002, 'Lucky Lion', 5600000, 14, 102),
            (2003, 'Be Electric', 4600000, 26, 101),
            (2004, 'Aima', 8000000, 36, 103),
            (2005, 'Mec de Colombia', 5900000, 20, 104),
            (2006, 'Atom Electric', 4500000, 12, 105);




-- -----------------------------------------------------
-- Table intension_compra
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reto4`.`intension_compra` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `alias` CHAR(20) NOT NULL,
  `fabricante` CHAR(20) NOT NULL,
  `fecha_hora` TIMESTAMP NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `alias_idx` (`alias` ASC) VISIBLE,
  INDEX `fabricante_idx` (`fabricante` ASC) VISIBLE,
  CONSTRAINT `alias`
    FOREIGN KEY (`alias`)
    REFERENCES `mydb`.`clientes` (`alias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fabricante`
    FOREIGN KEY (`fabricante`)
    REFERENCES `mydb`.`fabricantes` (`fabricantes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


