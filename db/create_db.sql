--  Создание БД
CREATE DATABASE fedosLibrary1 WITH ENCODING = 'UTF8';
CREATE USER fedos_db_user1 WITH PASSWORD 'password';
GRANT ALL ON DATABASE fedosLibrary1 TO fedos_db_user1;