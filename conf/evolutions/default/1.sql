# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table area (
  id                            bigserial not null,
  constraint pk_area primary key (id)
);

create table beneficio (
  id                            bigserial not null,
  constraint pk_beneficio primary key (id)
);

create table cargo (
  id                            bigserial not null,
  constraint pk_cargo primary key (id)
);

create table colaborador (
  id                            bigserial not null,
  nome                          varchar(255),
  data_admissao                 timestamp,
  cargo                         varchar(255),
  email                         varchar(255),
  constraint pk_colaborador primary key (id)
);

create table escolaridade (
  id                            bigserial not null,
  constraint pk_escolaridade primary key (id)
);


# --- !Downs

drop table if exists area cascade;

drop table if exists beneficio cascade;

drop table if exists cargo cascade;

drop table if exists colaborador cascade;

drop table if exists escolaridade cascade;

