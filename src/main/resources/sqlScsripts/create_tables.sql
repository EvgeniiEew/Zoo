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
    name text,
    zoo_id                 INTEGER REFERENCES zoo (id),
    cell_id                 INTEGER REFERENCES cell (id)
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