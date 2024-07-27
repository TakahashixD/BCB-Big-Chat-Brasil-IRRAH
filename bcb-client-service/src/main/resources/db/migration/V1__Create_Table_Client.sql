CREATE TABLE client (
	id BIGSERIAL PRIMARY KEY,
	name VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	phoneNumber VARCHAR(255) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	cnpj VARCHAR(14) NOT NULL, 
	companyName VARCHAR(255) NOT NULL,
	plan VARCHAR(255) NOT NULL,
	credits BIGINT NOT NULL
);