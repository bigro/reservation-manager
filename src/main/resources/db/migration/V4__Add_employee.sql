INSERT INTO reservation.employee
(id, password, role)
 VALUES
('yamaoka', 1234, 'admin'), ('ooguro', 1234, 'affairs'), ('kikuti', 1234, 'common');

INSERT INTO reservation.employee_profile
(employee_id, name)
VALUES
('yamaoka', 'やまおか'), ('ooguro', 'おおぐろ'), ('kikuti', 'きくち');