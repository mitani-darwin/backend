--ユーザーの作成
CREATE ROLE plan WITH LOGIN PASSWORD 'plan';
--DBの作成
CREATE DATABASE plan;
--ユーザーにDBの権限をまとめて付与
GRANT ALL PRIVILEGES ON DATABASE plan TO plan;