--liquibase formatted sql
--changeset Nilesh:DDL-Initial-User-Table labels:initial-ddl

create table users(
id bigint primary key auto_increment,
username varchar(64) unique not null,
password_hash varchar(255) not null,
roles varchar(128) not null,
created_at timestamp not null default current_timestamp
);

--rollback drop table users;

--Roles will be comma-separated for now but will change to normalized in future