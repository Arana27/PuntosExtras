
CREATE DATABASE Concesionario;
USE Concesionario;

-- Crear la tabla "Autos"
CREATE TABLE Autos (
    ID INT NOT NULL PRIMARY KEY auto_increment,
    Marca VARCHAR(50) not null,
    Modelo VARCHAR(50) not null,
    Precio DECIMAL(10, 2) not null
);

insert into Autos(Marca, modelo, precio) values
("Mercedez", "AMG", "25000");

insert into Autos(Marca, Modelo, Color) values
("Toyota", "Yaris", "Camaleon");

select * from Autos;