--Script de criação do banco usuário;
CREATE DATABASE Usuarios;
use Usuarios;

--Script de criação da tabela usuario;
CREATE Table usuario (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nome_completo VARCHAR(200) NOT NULL,
    username VARCHAR(100) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE,
    senha TEXT NOT NULL
);

--Script de inserção na tabela;
INSERT into usuario VALUES (NULL, 'Daniel', 'danieldev', 'daniel0@user.com','123456');