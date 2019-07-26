DROP KEYSPACE IF EXISTS person;

CREATE KEYSPACE person WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

use person;


CREATE TABLE employee (
id text,
firstName text,
lastName text,
email text,
roles set<text>,
departments list<text>,
contact map<text,text>,
PRIMARY KEY (id)
);


/*
 * TTL example 
 */

DROP KEYSPACE IF EXISTS sample;

CREATE KEYSPACE sample WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

use sample;



