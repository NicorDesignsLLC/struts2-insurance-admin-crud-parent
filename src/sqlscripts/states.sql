ALTER TABLE INSURANCE_ADMIN.`STATES` DROP INDEX `IDX_STATE`;

DROP TABLE INSURANCE_ADMIN.`STATES`;

CREATE TABLE INSURANCE_ADMIN.`STATES` (
		`STATE_ID` DECIMAL(22 , 0) NOT NULL,
		`STATE_NAME` VARCHAR(50),
		`STATE_TAXRATE` VARCHAR(10),
		`STATE_CODE` VARCHAR(2),
		CONSTRAINT `STATE_PK` PRIMARY KEY (`STATE_ID`)
	);

CREATE UNIQUE INDEX `IDX_STATE` ON INSURANCE_ADMIN.`STATES` (`STATE_ID` ASC);

SELECT * FROM INSURANCE_ADMIN.`STATES`; 