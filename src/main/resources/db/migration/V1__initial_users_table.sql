create or replace table users
(
    id                 bigint auto_increment,
    username           varchar(128)      not null,
    preferred_username bigint            null,
    email              varchar(128)      null,
    full_name          varchar(255)      null,
    password           varchar(80)       null,
    status             tinyint default 1 not null,
    constraint `PRIMARY`
        primary key (id),
    constraint users_email_uk
        unique (email),
    constraint users_preferred_username_uk
        unique (preferred_username),
    constraint users_username_key_uk
        unique (username)
);

