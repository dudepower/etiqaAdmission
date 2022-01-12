CREATE TABLE Student (
    Student_ID INT NOT NULL AUTO_INCREMENT,
    First_Name VARCHAR(50) NOT NULL,
    Last_Name VARCHAR(50) NOT NULL,
    Insert_date TIMESTAMP NOT NULL,
    Update_date TIMESTAMP,
    PRIMARY KEY (Student_ID)
);

CREATE TABLE Course (
    Course_ID INT NOT NULL AUTO_INCREMENT,
    Name VARCHAR(100) NOT NULL,
    Insert_date TIMESTAMP NOT NULL,
    Update_date TIMESTAMP,
    PRIMARY KEY (Course_ID)
);

CREATE TABLE Student_Course (
    Course_ID INT NOT NULL AUTO_INCREMENT,
    Student_ID INT NOT NULL AUTO_INCREMENT,
    FOREIGN KEY (Course_ID) REFERENCES Course(Course_ID),
    FOREIGN KEY (Student_ID) REFERENCES Student(Student_ID)
);