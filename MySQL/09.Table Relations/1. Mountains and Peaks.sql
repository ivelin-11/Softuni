CREATE TABLE `mountains` (
`id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
`name` VARCHAR(30) NOT NULL
);

CREATE TABLE `peaks` (
`id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
`name` VARCHAR(30) NOT NULL,
`mountain_id` INT ,
CONSTRAINT FOREIGN KEY `pks_peaks_mountains` (`mountain_id`)
REFERENCES `mountains`(`id`)
);