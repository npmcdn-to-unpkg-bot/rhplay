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
  cpf                           varchar(255),
  pis                           varchar(255),
  local_nascimento              varchar(255),
  uf_nascimento                 varchar(255),
  estado_civil                  varchar(255),
  nome_conjugue                 varchar(255),
  nome_pai                      varchar(255),
  nome_mae                      varchar(255),
  genero                        varchar(255),
  rg                            varchar(255),
  orgao_rg                      varchar(255),
  uf_rg                         varchar(255),
  data_nascimento               timestamp,
  data_rg_emissao               timestamp,
  data_admissão                 timestamp,
  data_desligamento             timestamp,
  cargo                         varchar(255),
  area                          varchar(255),
  endereco                      varchar(255),
  bairro                        varchar(255),
  cidade                        varchar(255),
  uf                            varchar(255),
  cep                           varchar(255),
  ddd                           varchar(255),
  email                         varchar(255),
  escolaridade                  varchar(255),
  salario                       float,
  conta_banco                   varchar(255),
  conta_agencia                 varchar(255),
  conta_numero                  varchar(255),
  conta_digito                  varchar(255),
  beneficios                    varchar(255),
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

