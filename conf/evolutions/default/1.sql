# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table computador (
  id                        bigint,
  barcode                   varchar(255),
  status                    varchar(255))
;

create table doacao (
  id                        bigint not null,
  origem                    varchar(255),
  comentarios               varchar(255),
  qtt_placa_mae             integer,
  qtt_placa_video           integer,
  qtt_placa_rede            integer,
  qtt_memoria               integer,
  qtt_monitor               integer,
  qtt_gabinete              integer,
  qtt_hd                    integer,
  qtt_drive_cd              integer,
  qtt_teclado               integer,
  qtt_mouse                 integer,
  qtt_impressora            integer,
  constraint pk_doacao primary key (id))
;

create table funcionario (
  id                        bigint,
  email                     varchar(255),
  password                  varchar(255),
  nome                      varchar(255),
  funcao                    varchar(255))
;

create table peca (
  id                        bigint not null,
  tipo                      varchar(255),
  marca                     varchar(255),
  modelo                    varchar(255),
  estado                    varchar(255),
  constraint pk_peca primary key (id))
;

create table solicitacao (
  id                        bigint,
  status                    varchar(255))
;

create sequence doacao_seq;

create sequence peca_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists computador;

drop table if exists doacao;

drop table if exists funcionario;

drop table if exists peca;

drop table if exists solicitacao;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists doacao_seq;

drop sequence if exists peca_seq;

