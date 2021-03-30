/* Roles */
INSERT INTO role(description,role) VALUES
("The customer account entitles you to manage your account and book a specific seat at the cinema.","CLIENT"),
("The employee account entitles you to manage reservation, events, films and films detail.","EMPLOYEE"),
("The admin account has the same privileges as employee. In addition admin can manage cinema hall, seats and employee accounts.","ADMIN");
/* Cinema halls */
INSERT INTO cinema_hall(screen_type) VALUE (1),(0),(0),(0),(1);
/* Seats*/
/* Cinema hall 1 */
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,1,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,2,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,3,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,4,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,5,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,6,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,7,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,8,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,9,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,10,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,11,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,12,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,13,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,14,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,15,0,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,16,0,1);

INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,1,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,2,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,3,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,4,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,5,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,6,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,7,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,8,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,9,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,10,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,11,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,12,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,13,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,14,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,15,1,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,16,1,1);

INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,1,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,2,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,3,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,4,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,5,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,6,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,7,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,8,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,9,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,10,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,11,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,12,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,13,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,14,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,15,2,1);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,16,2,1);

/* Cinema hall 2 */
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,1,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,2,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,3,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,4,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,5,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,6,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,7,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,8,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,9,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,10,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,11,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,12,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,13,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,14,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,15,0,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,16,0,2);

INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,1,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,2,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,3,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,4,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,5,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,6,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,7,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,8,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,9,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,10,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,11,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,12,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,13,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,14,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,15,1,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,16,1,2);

INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,1,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,2,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,3,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,4,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,5,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,6,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,7,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,8,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,9,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,10,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,11,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,12,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,13,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,14,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,15,2,2);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,16,2,2);

/* Cinema hall 3 */
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,1,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,2,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,3,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,4,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,5,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,6,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,7,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,8,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,9,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,10,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,11,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,12,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,13,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,14,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,15,0,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,16,0,3);

INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,1,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,2,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,3,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,4,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,5,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,6,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,7,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,8,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,9,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,10,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,11,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,12,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,13,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,14,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,15,1,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,16,1,3);

INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,1,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,2,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,3,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,4,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,5,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,6,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,7,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,8,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,9,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,10,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,11,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,12,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,13,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,14,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,15,2,3);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,16,2,3);

/* Cinema hall 4 */
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,1,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,2,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,3,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,4,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,5,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,6,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,7,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,8,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,9,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,10,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,11,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,12,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,13,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,14,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,15,0,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,16,0,4);

INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,1,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,2,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,3,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,4,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,5,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,6,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,7,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,8,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,9,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,10,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,11,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,12,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,13,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,14,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,15,1,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,16,1,4);

INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,1,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,2,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,3,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,4,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,5,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,6,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,7,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,8,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,9,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,10,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,11,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,12,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,13,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,14,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,15,2,4);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,16,2,4);

/* Cinema hall 5 */
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,1,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,2,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,3,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,4,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,5,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,6,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,7,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,8,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,9,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,10,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,11,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,12,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,13,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,14,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,15,0,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (0,16,0,5);

INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,1,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,2,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,3,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,4,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,5,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,6,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,7,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,8,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,9,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,10,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,11,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,12,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,13,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,14,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,15,1,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (1,16,1,5);

INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,1,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,2,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,3,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,4,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,5,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,6,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,7,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,8,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,9,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,10,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,11,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,12,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,13,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,14,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,15,2,5);
INSERT INTO seat(line,number,type,cinema_hall_id) VALUES (2,16,2,5);

/* Directors */
INSERT INTO director(date_of_birth,firstname, lastname) VALUES
('1963-03-27',"Quentin","Tarantino"),('1970-07-30',"Christopher","Nolan"),('1961-10-31',"Peter","Jackson");

/* Producers */
INSERT INTO producer(name) VALUE ("Columbia Pictures"),("Universal Pictures"),
("Warner Bros. Pictures"),("Paramount Pictures"),("New Line Cinema");

/* Genres */
INSERT INTO genre(name) VALUE
("Western"),("Thriller"),("Action"),("Drama"),("Comedy"),("Black comedy"),("War film"),("Fantasy"),("Science fiction");

/* Films */
INSERT INTO film(age_limit,duration,title,director_id,producer_id) VALUES
(18,9900,"Django",1,1),(18,9180,"Inglourious Basterds",1,2),
(16,8460,"Batman Begins",2,3),(16,9120,"The Dark Knight",2,3),
(16,9900,"The Dark Knight Rises",2,3),(12,10140,"Interstellar",2,4),
(16,10680,"The Lord of the Rings: The Fellowship of the Ring",3,5),
(16,10740,"The Lord of the Rings: The Two Towers",3,5),
(16,12060,"The Lord of the Rings: The Return of the King",3,5);

 /* Film-genre */
INSERT INTO film_genre(id_film,id_genre) VALUES
(1,1),(1,3),(1,6),(2,3),(2,6),(2,7),(3,2),(3,3),(3,9),(4,2),
(4,3),(4,9),(5,2),(5,3),(5,9),(6,3),(6,4),(6,9),(7,3),(7,8),
(8,3),(8,8),(9,3),(9,8);

/* Events */
INSERT INTO event(screening_date_time,cinema_hall_id) VALUES
('2021-04-30 10:30:00',1),('2021-04-30 10:30:00',2),('2021-04-30 10:30:00',3),
('2021-04-30 10:30:00',4),('2021-04-30 10:30:00',5),('2021-04-30 13:30:00',1),
('2021-04-30 13:30:00',2),('2021-04-30 13:30:00',3),('2021-04-30 13:30:00',4),
('2021-04-30 13:30:00',5),('2021-04-30 16:30:00',1),('2021-04-30 16:30:00',2),
('2021-04-30 16:30:00',3),('2021-04-30 16:30:00',4),('2021-04-30 16:30:00',5),
('2021-04-30 19:30:00',1),('2021-04-30 19:30:00',2),('2021-04-30 19:30:00',3),
('2021-04-30 19:30:00',4),('2021-04-30 19:30:00',5);

/* Event-film */
INSERT INTO event_film(id_event,id_film) VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,1),
(11,2),(12,3),(13,4),(14,5),(15,6),(16,7),(17,8),(18,3),(18,4),(18,5),(19,1),(19,2),(20,7),(20,8),(20,9);

/* Users */
INSERT INTO user(client_card_id,date_of_birth,email,expiration_date,firstname,lastname,password,telephone_number)
VALUES ("V12345678",'1999-05-25',"email1@email.com",'2021-09-26',"John","Trump",
'{bcrypt}$2y$12$znPrlGoOgdwR0AjxszPgFe7xZ1D4obY4g4NfrknPBQ0xFN3kZn7Fu',"+48123456789"),
("P12345678",'2004-11-13',"email2@email.pl",'2021-09-26',"Gary","Johnson",
'{bcrypt}$2y$12$XqHq0JY/ripbJwaD6mHMoOQncp9BX7MSsZccmnzRDOQIkQzrjOpOi',"+48-987-654-321"),
("S12345678",'2008-02-15',"email3@email.pl",'2021-09-26',"Jessica","Brown",
'{bcrypt}$2y$12$GEjgpskDuolYMdjzZxcRR.VNCz6klbBfAuxij60JmMZB.nznT4pEy',"+48 111 456 999");

/* User-role */
INSERT INTO user_role(id_user,id_role) VALUES (3,1),(2,1),(2,2),(1,1),(1,2),(1,3);

/* Reservation */
INSERT INTO reservation(expiration_date_time,event_id,user_id) VALUES
('2021-04-30 10:00:00',1,1),('2021-04-30 10:00:00',2,2),('2021-04-30 10:00:00',3,3),
('2021-04-30 13:00:00',6,1),('2021-04-30 13:00:00',7,2),('2021-04-30 13:00:00',8,3),
('2021-04-30 16:00:00',11,1),('2021-04-30 16:00:00',12,2),('2021-04-30 16:00:00',13,3),
('2021-04-30 19:00:00',18,1),('2021-04-30 19:00:00',19,2),('2021-04-30 19:00:00',20,3);

/* Reservation Seat */
INSERT INTO reservation_seat(event_id,reservation_id,seat_id) VALUES
(1,1,17),(2,2,38),(3,3,7),(6,4,17),(6,4,18),(7,5,1),(8,6,41),(11,7,16),(11,7,17),(11,7,39),
(12,8,41),(13,9,4),(18,10,10),(19,11,40),(19,11,41),(20,12,7),(20,12,8),(20,12,9),(20,12,10);