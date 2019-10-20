ALTER TABLE `udemy_insurance_app`.`user` DROP PRIMARY KEY;

DROP INDEX `PK_USER` ON `udemy_insurance_app`.`user`;

DROP TABLE `udemy_insurance_app`.`user`;

CREATE TABLE `udemy_insurance_app`.`user` (
	`id` INT NOT NULL,
	`first_name` VARCHAR(45),
	`last_name` VARCHAR(45),
	`email` VARCHAR(45),
	`password` VARCHAR(50),
	 PRIMARY KEY (`id`)
) ENGINE=InnoDB;

CREATE UNIQUE INDEX `PK_USER` ON `udemy_insurance_app`.`user` (`ID` ASC);


