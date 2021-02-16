--  Создание БД
CREATE DATABASE fedoslibrary1 WITH ENCODING = 'UTF8';
CREATE USER postgres WITH PASSWORD 'password';
GRANT ALL ON DATABASE fedoslibrary1 TO postgres;