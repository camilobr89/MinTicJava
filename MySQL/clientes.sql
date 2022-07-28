-- -----------------------------------------------------
-- Table clientes
-- -----------------------------------------------------
CREATE TABLE clientes (
  alias CHAR(20) primary key,
  nombre CHAR(20),
  apellido CHAR(20),
  email VARCHAR(50),
  celular CHAR(20),
  contraseña INT,
  f_nacimiento DATE
  );
  
insert into clientes
values('lucky', 'Pedro', 'Perez', 'lucky@mail.com', '3152503378', 26548976, '1989-04-29'),
('malopez', 'Maria', 'Lopez', 'malopez@mail.com', '3112963378', 36486549, '1990-05-29'),
('diva', 'Ana', 'Diaz', 'diva@mail.com', '3112503378', 36865964, '1990-04-29'),
('dreamer', 'Luis', 'Rojas', 'dreamer@mail.com', '3112369378', 85679425, '1985-04-29'),
('ninja', 'Andres', 'Cruz', 'ninja@mail.com', '3206982278', 96853456, '1986-06-15'),
('neon', 'Nelson', 'Ruiz', 'neon@mail.com', '3132653398', 97856458, '1989-09-13'),
('rose', 'Claudia', 'Mendez', 'rose@mail.com', '3256545588', 96387458, '1990-04-29'),
('green', 'Jorge', 'Rodriguez', 'green@mail.com', '3653339874', 55644897, '1990-04-29');


