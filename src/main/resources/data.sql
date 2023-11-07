INSERT INTO roles(name) VALUES('ROLE_DOCTOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
INSERT INTO roles(name) VALUES('ROLE_SUPERADMIN');

INSERT INTO vaccination_center(address, city, name, postal_code) VALUES('2 bis Place Thiers', 'Nancy', 'Centre des Congrès Prouvé', '54000');

INSERT INTO users(email, first_name, last_name, password, phone, username, dtype) VALUES ('doctor@mail.com', 'Michel', 'LeDocteur', '$2a$10$G6Ls1GJ2jO5haXcNxokGnOV/aklGUP9BNd6FxoV.NUGSbR3XVCqkW', '0777777777', 'doctor', 'User');