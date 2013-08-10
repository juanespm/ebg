﻿DROP TABLE IF EXISTS USERS;
DROP TABLE IF EXISTS ROLE;
DROP TABLE IF EXISTS STATUS;


CREATE TABLE ROLE(
	ID BIGINT NOT NULL,
	NAME VARCHAR(50) NOT NULL,
	DESCRIPTION VARCHAR(50),
	PRIMARY KEY (ID)
);

CREATE TABLE STATUS(
	ID BIGINT NOT NULL,
	NAME VARCHAR(50) NOT NULL,
	DESCRIPTION VARCHAR(50),
	PRIMARY KEY (ID)
) ;

CREATE TABLE USERS(
	ID BIGINT NOT NULL,
	USER_NAME VARCHAR(50) NOT NULL,
	PASSWORD VARCHAR(50) NOT NULL,
	EMAIL VARCHAR(50),
	ROLE_ID BIGINT NOT NULL,
	STATUS_ID BIGINT NOT NULL,
	PRIMARY KEY (ID),
	KEY (ROLE_ID),
	KEY (STATUS_ID)
);
ALTER TABLE USERS ADD CONSTRAINT FK_USERS_ROLE FOREIGN KEY (ROLE_ID) REFERENCES ROLE (ID);
ALTER TABLE USERS ADD CONSTRAINT FK_USERS_STATUS FOREIGN KEY (STATUS_ID) REFERENCES STATUS (ID);