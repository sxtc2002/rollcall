CREATE TABLE if not exists Teacher
(
    Teacher_Id CHAR (20) PRIMARY KEY,
    Teacher_Name CHAR (20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE if not exists Student
(
    Student_Id CHAR (20) PRIMARY KEY,
    Student_Name CHAR (20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE if not exists Course
(
    Course_Id CHAR(20) PRIMARY KEY,
    Course_Name CHAR (20) NOT NULL,
    Teacher_Id CHAR (20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE if not exists Schedules
(
    Course_Id CHAR(20) NOT NULL,
    Course_Date CHAR (20) NOT NULL,
    PRIMARY KEY(Course_Id, Course_Date)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE if not exists Selection
(
    Course_Id CHAR(20) NOT NULL,
    Student_Id CHAR (20) NOT NULL,
    PRIMARY KEY(Course_Id, Student_Id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE if not exists State
(
    Student_Id CHAR (20) NOT NULL,
    Course_Id CHAR(20) NOT NULL,
    Course_Date CHAR (10) NOT NULL,
    Student_State CHAR (20) CHECK (Student_State='present' OR Student_State='absent' OR Student_State='leave'),
    PRIMARY KEY(Student_Id, Course_Id, Course_Date)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;