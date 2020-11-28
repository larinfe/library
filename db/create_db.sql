--  Создание БД
CREATE DATABASE fedosLibrary WITH ENCODING = 'UTF8';
CREATE USER fedos_db_user WITH PASSWORD 'password';
GRANT ALL ON DATABASE fedosLibrary TO fedos_db_user;