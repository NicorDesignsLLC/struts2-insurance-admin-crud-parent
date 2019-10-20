ALTER TABLE `AGENTS` DROP INDEX `NT_PS_UNIQUE`;

ALTER TABLE `AGENTS` DROP INDEX `PK_AGENTS`;

ALTER TABLE `AGENTS` DROP FOREIGN KEY `LU_AGENTPROVINCE`;

DROP TABLE `AGENTS`;

CREATE TABLE `AGENTS` (
		`AGENTID` VARCHAR(10) NOT NULL,
		`AGENTFNAME` VARCHAR(100),
		`AGENTLNAME` VARCHAR(25),
		`AGENTMI` VARCHAR(5),
		`AGENTADDR1` VARCHAR(50),
		`AGENTADDR2` VARCHAR(50),
		`AGENTCITY` VARCHAR(50),
		`AGENTPROVINCEID` DECIMAL(22 , 0),
		`AGENTCOUNTRYID` DECIMAL(22 , 0),
		`AGENTDATEADD` DATETIME,
		`AGENTDATEMOD` DATETIME,
		`AGENTDATEDEL` DATETIME,
		`FSSITEID` VARCHAR(10),
		`FSSITEPW` VARCHAR(10),
		`AGENTPOSTALCODE` VARCHAR(10),
		`GROUPORINDIVIDUAL` VARCHAR(1),
		`NTUSERID` VARCHAR(20),
		`PEOPLESOFTID` VARCHAR(10),
		`AGENT_EMAIL` VARCHAR(50),
		`MONUMENT_MARKER_YESNO` VARCHAR(1),
		`FINAL_DOCUMENT_SVCS_YESNO` VARCHAR(1),
		`FINAL_EXPENSE_ITEMS_YESNO` VARCHAR(1),
		`ENTITY` VARCHAR(10),
		`DATE_ADDED_TO_FILE` DATETIME DEFAULT CURRENT_TIMESTAMP
	);

CREATE INDEX `NT_PS_UNIQUE` ON `AGENTS` (`NTUSERID` ASC, `PEOPLESOFTID` ASC);

CREATE UNIQUE INDEX `PK_AGENTS` ON `AGENTS` (`AGENTID` ASC);

ALTER TABLE `AGENTS` ADD CONSTRAINT `PK_AGENTS` PRIMARY KEY (`AGENTID`);

ALTER TABLE `AGENTS` ADD CONSTRAINT `LU_AGENTPROVINCE` FOREIGN KEY (`AGENTPROVINCEID`)
	REFERENCES `PROVINCES` (`PROVINCEID`) #
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

