DROP TABLE IF EXISTS person;

CREATE TABLE person  (
    personId INTEGER NOT NULL PRIMARY KEY,
    firstName VARCHAR(40),
    lastName VARCHAR(40),
    email VARCHAR(100),
    age INTEGER(100)
);