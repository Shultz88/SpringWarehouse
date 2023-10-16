CREATE database IF NOT EXISTS warehouse;

use warehouse;

CREATE TABLE IF NOT EXISTS products(
	id int primary key auto_increment,
    count int not null,
    product_name varchar(40) not null,
    date_of_production date not null,
	storage_life date
);

CREATE TABLE IF NOT EXISTS product(
	id int primary key auto_increment,
    date_of_receipt date not null,
    product_id int not null,
    rack_number int not null,
    
    foreign key (product_id) references products(id)
);


