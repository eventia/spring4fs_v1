-- DROP TABLE IF EXISTS
DROP TABLE IF EXISTS spring4fs.MEMBER;

create table spring4fs.MEMBER (
	ID int auto_increment primary key,
	EMAIL varchar(255),
	PASSWORD varchar(100),
	NAME varchar(100),
	REGDATE datetime,
	unique key (EMAIL) 
) engine=InnoDB character set = utf8;

-- truncate table spring4fs.MEMBER;

insert into spring4fs.MEMBER values (1, 'madvirus@madvirus.net', '1234', '최범균', '2014-12-01 13:01:02');
insert into spring4fs.MEMBER values (2, 'bkchoi@bkchio.com', '5678', '최BK', '2014-12-03 18:31:49');
insert into spring4fs.MEMBER values (3, 'gildong@some.com', '1234', '홍길동', '2014-11-19 00:21:02');
insert into spring4fs.MEMBER values (4, 'kingsejon@chosunking.org', '1234', '세종대왕', '2014-12-08 19:00:00');
