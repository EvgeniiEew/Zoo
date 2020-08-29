CREATE TABLE zoo
(
    id                SERIAL PRIMARY KEY,
    average_purity    int DEFAULT 100 CHECK ( average_purity >= 0 and average_purity <= 100 ),
    supply_storage_id integer references supply_storage (id),
    bank_account_id   integer references bank_account (id)
);

CREATE TABLE Cell
(
    id          SERIAL PRIMARY KEY,
    capacity    int default 1 check ( capacity > 0 ),
    purity      int default 100,
    food        int default 0,
    animal_list text,
    zoo_id      INTEGER REFERENCES zoo (id)
);
CREATE TABLE supply_storage
(
    id   serial primary key,
    food int
);
CREATE TABLE bank_account
(
    id    serial primary key,
    money int
);
-- create  table service_staff
-- (
--     id    serial primary key,
--     money int
-- );
CREATE table service_staff
(
    id                     serial primary key,
    max_daily_purity       int,
    remaining_daily_purity int,
    salary                 int,
    employment_date        timestamp(2) with time zone,
    age                    int,
    name                   text,
    zoo_id                 INTEGER REFERENCES zoo (id),
    cell_id                INTEGER REFERENCES cell (id)
);
create table animal_specialist
(
    id                               serial primary key,
    remaining_food_to_animals_perDay int,
    age                              int,
    name                             text,
    salary                           int,
    employment_date                  timestamp(2) with time zone,
    max_food_to_animals_perDay       int,
    cell_id                          INTEGER REFERENCES cell (id),
    supply_storage_id                integer references supply_storage (id)
);

CREATE table service_staff
(
    id                     serial primary key,
    max_daily_purity       int,
    remaining_daily_purity int,
    salary                 int,
    employment_date        timestamp with time zone,
    age                    int,
    name                   text,
    zoo_id                 INTEGER REFERENCES zoo (id)
);

create table animal_specialist
(
    id                                serial primary key,
    remaining_food_to_animals_per_day int,
    age                               int,
    name                              text,
    salary                            int,
    employment_date                   timestamp with time zone,
    max_food_to_animals_per_day       int,
    zoo_id                            INTEGER REFERENCES zoo (id)
);
create table accountants
(
    id              serial primary key,
    max_food_order  int,
    salary          int,
    date_employment timestamp with time zone,
    age             int,
    name            text,
    zoo_id          INTEGER REFERENCES zoo (id)
);
create table service_staff_cells
(
    cell_id          integer references Cell (id),
    service_staff_id integer references service_staff (id)
);

create table animal_specialist_cells
(
    cell_id              integer references Cell (id),
    animal_specialist_id integer references animal_specialist (id)
);
Create table zoo_log
(
    cell_count            text,
    empty_cells_count     text,
    existing_animal_types text,
    food_count            int,
    purity_percentage     int,
    zoo_id                int references zoo (id)
);