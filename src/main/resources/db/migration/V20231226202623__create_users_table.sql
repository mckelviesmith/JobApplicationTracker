CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE SCHEMA IF NOT EXISTS jobapplicationtracker;

CREATE TABLE users(
    uuid UUID NOT NULL,
    name varchar(100) NOT NULL,
    username varchar(100) NOT NULL,
    password varchar(256) NOT NULL,
    PRIMARY KEY (uuid)
);