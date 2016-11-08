Coding Ground provides Oracle Express Edition 11g Release 2 on Ubuntu 14.04.1 LTS. You can connect database with following setting:  

hostname: localhost 
port: 49161 
sid: xe 
username: system 
password: oracle 

Password for SYS & SYSTEM is oracle


You will not be able to create a new database, but you can create your tables. So start with creating new tables using the following syntax

CREATE TABLE table_name(
   column1 datatype,
   column2 datatype,
   column3 datatype,
   .....
   columnN datatype,
   PRIMARY KEY( one or more columns )
);

Following is an example:

CREATE TABLE CUSTOMERS(
   ID   INT              NOT NULL,
   NAME VARCHAR (20)     NOT NULL,
   AGE  INT              NOT NULL,
   ADDRESS  CHAR (25) ,
   SALARY   DECIMAL (18, 2),
   PRIMARY KEY (ID)
);

Now you can practice complete Oracle SQL and PL/SQL online using simple and easy step. For further detail you can check our short tutorials
http://www.tutorialspoint.com/sql/index.htm
http://www.tutorialspoint.com/plsql/index.htm
