CREATE TABLE watch (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    price INTEGER     NOT NULL,
    discount_quantity INTEGER,
    discount_value INTEGER,
    PRIMARY KEY (id)
);