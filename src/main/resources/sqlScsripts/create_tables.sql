CREATE TABLE supply_storages
(
    id   serial primary key,
    food int
);
CREATE TABLE bank_accounts
(
    id    serial primary key,
    money int
);

CREATE TABLE zoos
(
    id                SERIAL PRIMARY KEY,
    average_purity    int DEFAULT 100 CHECK ( average_purity >= 0 and average_purity <= 100 ),
    supply_storage_id integer references supply_storages (id),
    bank_account_id   integer references bank_accounts (id)
);

CREATE TABLE cells
(
    id       SERIAL PRIMARY KEY,
    capacity int default 1 check ( capacity > 0 ),
    purity   int default 100,
    food     int default 0,
    zoo_id   INTEGER REFERENCES zoos (id)
);

CREATE table service_staffs
(
    id                     serial primary key,
    max_daily_purity       int,
    remaining_daily_purity int,
    salary                 int,
    employment_date        timestamp(2) with time zone,
    age                    int,
    name                   text,
    zoo_id                 INTEGER REFERENCES zoos (id)
);
create table animal_specialists
(
    id                    serial primary key,
    age                   int,
    name                  text,
    salary                int,
    employment_date       timestamp(2) with time zone,
    remaining_food_perDay int,
    max_food_perDay       int,
    zoo_id                INTEGER REFERENCES zoos (id)
);

create table accountants
(
    id              serial primary key,
    age             int,
    name            varchar(255),
    salary          int,
    employment_date timestamp with time zone,
    max_food_order  int,
    zoo_id          INTEGER REFERENCES zoos (id)
);

create table zoo_logs
(
    cell_count            varchar(255),
    empty_cells_count     varchar(255),
    existing_animal_types varchar(255),
    food_count            int,
    purity_percentage     int,
    food_per_day          int,
    dirt_per_day          int,
    zoo_money             int,
    zoo_id                int references zoos (id)
);

create table animals
(
    id               serial primary key,
    nickname         varchar(255),
    weight           int,
    eat_food_per_day int,
    do_dirt_per_day  int,
    cell_id          INTEGER REFERENCES cells (id)
);
