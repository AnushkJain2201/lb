CREATE TABLE gender (
  gender_id INT PRIMARY KEY,
  name VARCHAR(10) UNIQUE NOT NULL
);

-- Example values
INSERT INTO gender (gender_id, name) VALUES (1, 'Male'), (2, 'Female'), (3, 'Other');
