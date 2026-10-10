create database DAO_atvd

use DAO_atvd




CREATE TABLE tb_CadastroUsuario (
    id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    nome VARCHAR(100),
    senha VARCHAR(100)
);

select * from tb_CadastroUsuario