create table city
(
    id     int auto_increment,
    name   varchar(50) not null,
    year   int        null,
    square int         null,
    constraint city_pk
        primary key (id)
);

create table type
(
    id       int auto_increment,
    name     varchar(50) not null,
    language varchar(50) not null,
    constraint type_pk
        primary key (id)
);

create table city_type
(
    city_id int not null,
    type_id int not null,
    value int,
    constraint city_type_pk
        primary key (city_id, type_id),
    constraint city_type_city_id_fk
        foreign key (city_id) references city (id),
    constraint city_type_type_id_fk
        foreign key (type_id) references type (id)
);