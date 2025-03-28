create table if not exists car(
    id serial primary key,
    brand varchar not null,
    model varchar not null
);

create unique index brand_model_udx
    on car (brand, model);