insert into supply_storages(food)
values (100);

insert into bank_accounts(money)
values (65000);

insert into zoos(average_purity, supply_storage_id, bank_account_id)
VALUES (100, 1, 1);

insert into cells(capacity, purity, food, zoo_id)
values (3, 100, 100, 1),
       (3, 100, 100, 1);

insert into service_staffs(max_daily_purity, remaining_daily_purity, salary, age, name, zoo_id)
values (80, 10, 500, 23, 'Samuel', 1),
       (30, 20, 500, 22, 'Harry', 1),
       (20, 10, 500, 29, 'Connor', 1);

insert into animal_specialists(age, name, salary, remaining_food_perday, max_food_perday, zoo_id)
values (34, 'Ethan', 500, 20, 80, 1),
       (19, 'Thomas', 500, 10, 60, 1),
       (31, 'Leo', 500, 12, 70, 1);

insert into accountants(age, name, salary, max_food_order, zoo_id)
values (18, 'Oliver', 500, 120, 1);

insert into animals(nickname, weight, eat_food_per_day, do_dirt_per_day, cell_id)
values ('pes', 12, 12, 8, 1),
       ('Albert', 19, 22, 12, 1),
       ('cat', 9, 6, 3, 1),
       ('dog', 16, 14, 12, 2);
