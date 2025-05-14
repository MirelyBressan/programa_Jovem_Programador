/**Crie a tabela cliente com os seguintes campos:
idCliente: SERIAL, chave primária
nomeCliente: VARCHAR(100)
telefoneCliente: VARCHAR(20)
emailCliente: VARCHAR(100), único
dataCadastroCliente: DATE
ativoCliente: varchar(5)*/

CREATE TABLE cliente (
    idCliente SERIAL PRIMARY KEY,
    nomeCliente VARCHAR(100),
    telefoneCliente VARCHAR(20),
    emailCliente VARCHAR(100) UNIQUE,
    dataCadastroCliente DATE,
    ativoCliente VARCHAR(5)
);

/**Crie a tabela produto com os campos:
idProduto: SERIAL, chave primária
nomeProduto: VARCHAR(100)
precoProduto: NUMERIC(6,2)
estoqueProduto: INTEGER
dataCadastroProduto: DATE */

CREATE TABLE categoriaProduto (
    idCategoria SERIAL PRIMARY KEY,
    nomeCategoria VARCHAR(50)
);

/**Crie a tabela categoriaProduto com os campos:
idCategoria: SERIAL, chave primária
nomeCategoria: VARCHAR(50)*/

CREATE TABLE produto (
    idProduto SERIAL PRIMARY KEY,
    nomeProduto VARCHAR(100),
    precoProduto NUMERIC(6,2),
    estoqueProduto INTEGER,
    dataCadastroProduto DATE,
    categoriaId INTEGER REFERENCES categoriaProduto(idCategoria)
);

/**Insira dados fictícios:
3 clientes na tabela cliente
3 categorias na tabela categoriaProduto
5 produtos na tabela produto, cada um vinculado a uma categoria*/

INSERT INTO cliente (nomeCliente, telefoneCliente, emailCliente, dataCadastroCliente, ativoCliente)
VALUES 
('Maria Silva', '99999-0001', 'maria@email.com', CURRENT_DATE, 'sim'),
('João Souza', '99999-0002', 'joao@email.com', CURRENT_DATE, 'sim'),
('Ana Lima', '99999-0003', 'ana@email.com', CURRENT_DATE, 'não');

INSERT INTO categoriaProduto (nomeCategoria)
VALUES 
('Pães'),
('Bolos'),
('Bebidas');

INSERT INTO produto (nomeProduto, precoProduto, estoqueProduto, dataCadastroProduto, categoriaId)
VALUES 
('Pão Francês', 0.50, 100, CURRENT_DATE, 1),
('Bolo de Chocolate', 20.00, 10, CURRENT_DATE, 2),
('Refrigerante Lata', 4.50, 30, CURRENT_DATE, 3),
('Pão Integral', 1.00, 50, CURRENT_DATE, 1),
('Bolo de Cenoura', 18.00, 5, CURRENT_DATE, 2);

/**Crie a tabela venda com os seguintes campos:
idVenda: SERIAL, chave primária
clienteId: INTEGER, chave estrangeira
dataVenda: TIMESTAMP
valorTotalVenda: NUMERIC(8,2)*/

CREATE TABLE venda (
    idVenda SERIAL PRIMARY KEY,
    clienteId INTEGER REFERENCES cliente(idCliente),
    dataVenda TIMESTAMP,
    valorTotalVenda NUMERIC(8,2)
);

/**Crie a tabela itemVenda com os seguintes campos:
idItemVenda: SERIAL, chave primária
vendaId: INTEGER, chave estrangeira
produtoId: INTEGER, chave estrangeira
quantidadeVendida: INTEGER
precoUnitario: NUMERIC(6,2)*/

CREATE TABLE itemVenda (
    idItemVenda SERIAL PRIMARY KEY,
    vendaId INTEGER REFERENCES venda(idVenda),
    produtoId INTEGER REFERENCES produto(idProduto),
    quantidadeVendida INTEGER,
    precoUnitario NUMERIC(6,2)
);

/**Insira pelo menos 2 registros na tabela venda e 5 registros na tabela itemVenda, relacionando corretamente clientes, produtos e preços.*/

INSERT INTO venda (clienteId, dataVenda, valorTotalVenda)
VALUES 
(1, NOW(), 9.00),
(2, NOW(), 25.00);

INSERT INTO itemVenda (vendaId, produtoId, quantidadeVendida, precoUnitario)
VALUES 
(1, 1, 10, 0.50),  
(1, 3, 1, 4.50),   
(2, 2, 1, 20.00),  
(2, 1, 5, 0.50),   
(2, 4, 1, 1.00);   

/**Altere a tabela produto, adicionando um campo chamado descricaoProduto (tipo TEXT). Depois, renomeie o campo estoqueProduto para quantidadeEstoqueProduto.*/

ALTER TABLE produto
ADD COLUMN descricaoProduto TEXT;

ALTER TABLE produto
RENAME COLUMN estoqueProduto TO quantidadeEstoqueProduto;
