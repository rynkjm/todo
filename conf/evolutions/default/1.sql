# Todo SCHEMA

# --- !Ups

CREATE TABLE todo (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL ,
  is_done BOOLEAN NOT NULL
);

# --- !Downs
DROP TABLE todo;