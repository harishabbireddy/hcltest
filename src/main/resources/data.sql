DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  firstname VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  password VARCHAR(250) DEFAULT NULL,
  role VARCHAR(250) DEFAULT NULL
);

INSERT INTO user (firstname, lastname, password, role) VALUES
  ('user1', 'user1', 'user1', 'user'),
  ('user2', 'user2', 'user2', 'user'),
  ('user3', 'user3', 'user3', 'admin');
  
  
DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS book;

CREATE TABLE book (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  uuid VARCHAR(250) NOT NULL,
  title VARCHAR(250) NOT NULL,
  catagory VARCHAR(250) DEFAULT NULL,
  rackno VARCHAR(250) DEFAULT NULL,
  author VARCHAR(250) DEFAULT NULL
  
);

INSERT INTO book (uuid, title, catagory, rackno, author) VALUES
  ('a123', 'Maths 123', 'math','1', 'Harish'),
  ('b123', 'Physics abc', 'physics','2', 'Rani'),
  ('c123', 'Physics def', 'physics','3', 'Raju'),
  ('d123', 'Maths 456', 'math','4', 'Shiva'),
  ('e123', 'Software 123', 'it','5', 'Shankar'),
  ('f123', 'Software 456', 'it','6', 'Vani');
  
  
  
  
  
  
  
  