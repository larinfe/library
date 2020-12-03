create table if not exists users
(
    id       integer not null
        constraint users_pkey
            primary key,
    name     varchar not null,
    password varchar not null
);

create table if not exists book
(
    "ISBN" varchar(13) not null
        constraint book_pkey
            primary key,
    name   varchar(60) not null,
    author varchar(60) not null,
    "user" integer     not null
        references users,
    constraint user_id

);