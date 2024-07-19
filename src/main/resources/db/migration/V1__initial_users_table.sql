create or replace table users
(
    id                 bigint auto_increment,
    username           varchar(128)                          not null,
    preferred_username bigint                                not null,
    email              varchar(128)                          not null,
    full_name          varchar(255)                          null,
    password           varchar(80)                           not null,
    status             tinyint   default 1                   not null,
    roles              json                                  null,
    created_at         timestamp default current_timestamp() null,
    created_by         mediumtext                            null,
    updated_at         timestamp default current_timestamp() null,
    updated_by         int                                   null,
    constraint `PRIMARY`
        primary key (id),
    constraint users_email_uk
        unique (email),
    constraint users_preferred_username_uk
        unique (preferred_username),
    constraint users_username_key_uk
        unique (username)
);

