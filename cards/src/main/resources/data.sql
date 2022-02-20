DROP TABLE IF EXISTS cards;

CREATE TABLE cards(
 card_id int NOT NULL AUTO_INCREMENT,
 customer_id int NOT NULL,
 card_number varchar(100) NOT NULL,
 card_type varchar(100) NOT NULL,
 total_limit int NOT NULL,
 amount_used int NOT NULL,
 available_amount int NOT NULL,
 create_dt date DEFAULT NULL,
 PRIMARY KEY(card_id)
);

INSERT INTO cards(card_number, customer_id, card_type, total_limit, amount_used, available_amount, create_dt)
VALUES('456500004656', 1, 'Credit', 10000, 500, 9500, CURDATE());

INSERT INTO cards(card_number, customer_id, card_type, total_limit, amount_used, available_amount, create_dt)
VALUES('345500008673', 1, 'Credit', 7500, 600, 6900, CURDATE());

INSERT INTO cards(card_number, customer_id, card_type, total_limit, amount_used, available_amount, create_dt)
VALUES('235900009346', 1, 'Credit', 20000, 4000, 16000, CURDATE());