# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table computador (
  id                        bigint,
  barcode                   varchar(255),
  status                    varchar(255))
;

create table doacao (
  id                        bigint,
  origem                    varchar(255))
;

create table funcionario (
  id                        bigint,
  email                     varchar(255),
  password                  varchar(255),
  nome                      varchar(255),
  funcao                    varchar(255))
;

create table peca (
  id                        bigint,
  tipo                      varchar(255),
  marca                     varchar(255),
  modelo                    varchar(255),
  estado                    varchar(255))
;

create table solicitacao (
  id                        bigint,
  status                    varchar(255))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists computador;

drop table if exists doacao;

drop table if exists funcionario;

drop table if exists peca;

drop table if exists solicitacao;

SET REFERENTIAL_INTEGRITY TRUE;

