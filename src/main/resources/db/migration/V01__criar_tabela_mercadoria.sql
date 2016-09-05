CREATE TABLE mercadoria (

	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	tipo VARCHAR(50) NOT NULL,
	nome VARCHAR(100) NOT NULL,
	quantidade INT NOT NULL,
	preco DECIMAL(10, 2) NOT NULL,
	Negocio VARCHAR(20) NOT NULL

) ENGINE=InnoDB DEFAULT CHARSET=utf8;