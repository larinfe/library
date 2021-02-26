--  Создание БД
CREATE DATABASE library_db WITH ENCODING = 'UTF8';
CREATE USER postgres WITH PASSWORD 'password';
GRANT ALL ON DATABASE library_db TO postgres;