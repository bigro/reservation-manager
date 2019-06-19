CREATE TABLE reservation.base (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE reservation.facility (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    base_id INTEGER NOT NULL,
    FOREIGN KEY (base_id) REFERENCES reservation.base (id)
);