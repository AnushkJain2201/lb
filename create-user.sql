-- Drop user first if they exist
DROP USER if exists 'legalbreezeadm'@'localhost' ;

-- Now create user with prop privileges
CREATE USER 'legalbreezeadm'@'localhost' IDENTIFIED BY 'legalbreezepwd';

GRANT ALL PRIVILEGES ON * . * TO 'legalbreezeadm'@'localhost';

