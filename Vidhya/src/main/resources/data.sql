select 1 from dual;
INSERT INTO preference (controlLevel,controlId) VALUES ('U',1);
INSERT INTO preference (controlLevel,controlId) VALUES ('PG',2);
INSERT INTO preference (controlLevel,controlId) VALUES ('12',3);
INSERT INTO preference (controlLevel,controlId) VALUES ('15',4);
INSERT INTO preference (controlLevel,controlId) VALUES ('18',5);

INSERT INTO parentalcontrol (movieId,controlLevel,controlId) VALUES ('HARRYPOTTER', 'U', 1);
INSERT INTO parentalcontrol (movieId,controlLevel,controlId) VALUES ('HOMEALONE', 'PG', 2);
INSERT INTO parentalcontrol (movieId,controlLevel,controlId) VALUES ('TITANIC', '15', 4);
