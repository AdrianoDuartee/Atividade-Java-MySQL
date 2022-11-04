CREATE DATABASE Biblioteca;
USE Biblioteca;

-- Comando de Drop
DROP TABLE cliente;
DROP TABLE livros;
DROP TABLE emprestimo;
DROP TABLE funcionario;

-- Tabelas

CREATE TABLE funcionario(
idFuncionario INTEGER PRIMARY KEY AUTO_INCREMENT,
nomeCompletoFuncionario VARCHAR(45) NOT NULL,
email VARCHAR(50) NOT NULL,
dataNasc DATE NOT NULL
);

CREATE TABLE livro(
idLivro INTEGER PRIMARY KEY AUTO_INCREMENT,
titulo VARCHAR (40) NOT NULL,
autor VARCHAR(40) NOT NULL
);

CREATE TABLE cliente (
idCliente INTEGER PRIMARY KEY AUTO_INCREMENT,
nomeCompletoCliente VARCHAR(45) NOT NULL,
email VARCHAR(50) NOT NULL,
cpf VARCHAR(15) NOT NULL
);

CREATE TABLE emprestimo(
	idEmprestimo INTEGER PRIMARY KEY AUTO_INCREMENT,
    idFuncionario INTEGER NOT NULL,
    idCliente INTEGER NOT NULL,
    dataEmprestimo DATE NOT NULL,
    dataDevolucao DATE NOT NULL,
    idLivro INTEGER NOT NULL,
    FOREIGN KEY (idfuncionario) REFERENCES funcionario(idFuncionario),
    FOREIGN KEY (idCliente) REFERENCES cliente(idCliente),
    FOREIGN KEY (idLivro) REFERENCES livro(idLivro)
);

-- Enserindo os dados

INSERT INTO funcionario(nomeCompletoFuncionario, email, dataNasc) VALUE ("João Phelipe", "joaophelipe@gmail.com","1996-05-07");
INSERT INTO funcionario(nomeCompletoFuncionario, email, dataNasc) VALUE ("José Almeida", "josealmeida@gmail.com","1985-11-29");
INSERT INTO funcionario(nomeCompletoFuncionario, email, dataNasc) VALUE ("Paula Alencar", "paulaalencar@gmail.com","1995-01-15");

INSERT INTO livro(titulo, autor) VALUE ("O Silmarillion", " J.R.R. Tolkien");
INSERT INTO livro(titulo, autor) VALUE ("Harry Potter e a Pedra Filosofal", "J.K. Rowling");
INSERT INTO livro(titulo, autor) VALUE ("O Senhor dos Anéis", "J. R. R. Tolkien");
INSERT INTO livro(titulo, autor) VALUE ("A Guerra dos Tronos", " R. R. Martin");

INSERT INTO cliente(nomeCompletoCliente, email, cpf) VALUE ("Adriano Duarte", "adrianoduarte@gmail.com", "32165432178");
INSERT INTO cliente(nomeCompletoCliente, email, cpf) VALUE ("Maria josé", "mariajose@gmail.com"," 75213295432");
INSERT INTO cliente(nomeCompletoCliente, email, cpf) VALUE ("Ana Paula", "anapaula@gmail.com", "78965412332");

INSERT INTO emprestimo(idFuncionario, idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUE (2, 1 , "2022-10-25", "2022-11-03", 1);
INSERT INTO emprestimo(idFuncionario, idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUE (2, 1 , "2022-10-25", "2022-11-03", 3);
INSERT INTO emprestimo(idFuncionario, idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUE (1, 2 , "2022-11-01", "2022-11-15", 4);
INSERT INTO emprestimo(idFuncionario, idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUE (3, 3 , "2022-10-28", "2022-11-10", 2);

-- Exiber tabelas

SELECT * FROM funcionario;
SELECT * FROM cliente;
SELECT * FROM livro;
SELECT * FROM emprestimo;

-- Exibição dos dados

SELECT cliente.nomeCompletoCliente AS nomeDoCliente, dataEmprestimo, dataDevolucao FROM emprestimo
INNER JOIN cliente
ON emprestimo.idCliente = cliente.idCliente
INNER JOIN funcionario
ON emprestimo.idFuncionario = funcionario.idFuncionario;

-- Filtro
SELECT * FROM vendedor WHERE email LIKE "%@gmail.com";
SELECT * FROM livro WHERE titulo LIKE "O Silma%";
SELECT * FROM cliente WHERE cpf LIKE "321654%";

-- Atualização de dados

UPDATE cliente
SET email = "adriano123@gmail.com"
WHERE idCliente = 1;

-- Deletando dados

DELETE FROM livro
WHERE idLivro = 2;









