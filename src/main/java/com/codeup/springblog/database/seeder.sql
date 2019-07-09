USE jpa_db;


# Seed Users
insert into user (username, email, password) values ('bob123', 'bob@email.com', 'pass');
insert into user (username, email, password) values ('karen123', 'karen@email.com', 'pass');
insert into user (username, email, password) values ('cathy123', 'cathy@email.com', 'pass');
insert into user (username, email, password) values ('fred123', 'fred@email.com', 'pass');
insert into user (username, email, password) values ('john123', 'john@email.com', 'pass');


# Seed Posts
insert into posts (title, body, author_id) values ('orchestrate innovative markets', 'Sed ante. Vivamus tortor. Duis mattis egestas metus.', 1);
insert into posts (title, body, author_id) values ('expedite customized mindshare', 'Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.', 1);
insert into posts (title, body, author_id) values ('engineer world-class communities', 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.', 1);
insert into posts (title, body, author_id) values ('optimize intuitive solutions', 'Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.', 1);
insert into posts (title, body, author_id) values ('unleash global partnerships', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus.', 1);
