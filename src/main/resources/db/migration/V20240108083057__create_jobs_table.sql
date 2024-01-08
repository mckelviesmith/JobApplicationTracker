CREATE TABLE jobs
(
    uuid     UUID         NOT NULL,
    company  varchar(256) NOT NULL,
    position varchar(256) NOT NULL,
    location varchar(256) NOT NULL,
    remote   boolean,
    date     DATE,
    PRIMARY KEY (uuid)
);