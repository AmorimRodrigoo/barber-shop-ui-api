CREATE TABLE CLIENTS (
                         id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(150) NOT NULL,
                         email VARCHAR(150) NOT NULL,
                         phone CHAR(11) NOT NULL,
                         CONSTRAINT UK_EMAIL UNIQUE (email),
                         CONSTRAINT UK_PHONE UNIQUE (phone)
);