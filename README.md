# MakerSharks_Assignment

Steps to Run the above Task/Assignment
1. Down this project zip file and extract it.
2. Place the extracted folder in ...apache-tomcat-9.0.93-windows-x64\apache-tomcat-9.0.93\webapps\ location (initial part varies based on where you saved the tomcat server files/folders).
3. Open your MySQL and create a database with name **Makersharks_Assessment** and then create a table using the below query

(It is madatory to make the username as **root** and password as **root** for MySQL)

create database Makersharks_Assessment;
use Makersharks_Assessment;

create table manufacturersTable(
	supplier_id varchar(100),
    company_name varchar(100),
    website varchar(100),
    location varchar(100),
    nature varchar(100),
    manufacturing_process varchar(100)
	);
Insert the data as an example:


insert into manufacturersTable values(1234, "TCS", "https://www.tcs.com/", "Banglore", "large_scale", "3d_painting");
insert into manufacturersTable values(1234, "Accenture", "https://www.accenture.com/in-en/careers/jobsearch?jk=&sb=1&vw=0&is_rj=0&pg=1", "Banglore", "medium_scale", "casting");
insert into manufacturersTable values(1234, "Zoho", "https://careers.zohocorp.com/jobs/Careers", "Chennai", "low_scale", "");
insert into manufacturersTable values(1234, "Makersharks", "https://www.notion.so/makersharks", "Banglore", "large", "3d_painting");
insert into manufacturersTable values(1235, "TCS", "https://www.tcs.com/", "Tirupati", "medium_scale", "coating");
insert into manufacturersTable values(1235, "Accenture", "https://www.accenture.com/in-en/careers/jobsearch?jk=&sb=1&vw=0&is_rj=0&pg=1", "Noida", "small_scale", "coating");
insert into manufacturersTable values(1235, "Zoho", "https://careers.zohocorp.com/jobs/Careers", "Chennai", "Low_scale", "");
insert into manufacturersTable values(1235, "Makersharks", "https://www.notion.so/makersharks", "Banglore", "medium_scale", "moulding");


Now Turn the TomCat Server ON - go to ...apache-tomcat-9.0.93-windows-x64\apache-tomcat-9.0.93\bin\ and click on **startup.bat** file then the server will start running

Now Go to Chrome and enter the URL as : **http://localhost:8080/Makersharks_Assessment/Main.html** (Note that localhost number 8080 varies based on the port number you installed the TomCat server)

You will see the output/searchbar asking the rrequired things select supplier_id and more which ever you want as filter and click on submit.
You will see the list of result saperated by box.
