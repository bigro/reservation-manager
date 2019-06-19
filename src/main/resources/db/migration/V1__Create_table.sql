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

CREATE TABLE reservation.employee (
    id VARCHAR(100) PRIMARY KEY,
    password VARCHAR(100) NOT NULL,
    role VARCHAR(10) NOT NULL
);

CREATE TABLE reservation.employee_profile (
    employee_id VARCHAR(100) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES reservation.employee (id)
);