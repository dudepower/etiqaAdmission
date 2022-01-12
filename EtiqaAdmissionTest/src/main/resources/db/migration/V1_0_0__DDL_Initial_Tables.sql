CREATE TABLE `Student` (
    `Student_ID` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `First_Name` VARCHAR(50) NOT NULL,
    `Last_Name` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`Student_ID`)
) ENGINE=INNODB CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE `Course` (
    `Course_ID` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `Name` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`Course_ID`)
) ENGINE=INNODB CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE `Student_Course` (
    `Student` INT UNSIGNED NOT NULL,
    `Course` INT UNSIGNED NOT NULL,
    PRIMARY KEY (`Student`, `Course`),
    CONSTRAINT `Constr_Student_fk`
        FOREIGN KEY `Student_fk` (`Student`) REFERENCES `Student` (`Student_ID`)
        ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT `Constr_Course_fk`
        FOREIGN KEY `Course_fk` (`Course`) REFERENCES `Course` (`Course_ID`)
        ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB CHARACTER SET ascii COLLATE ascii_general_ci;