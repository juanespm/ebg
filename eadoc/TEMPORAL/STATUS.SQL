DROP TABLE IF EXISTS STATUS
;
CREATE TABLE STATUS
(
	ID BIGINT NOT NULL,
	NAME BIGINT NOT NULL,
	DESCRIPTION VARCHAR(50),
	PRIMARY KEY (ID),
	UNIQUE UQ_STATUS_ID(ID),
	UNIQUE UQ_STATUS_NAME(NAME)
) 
;


