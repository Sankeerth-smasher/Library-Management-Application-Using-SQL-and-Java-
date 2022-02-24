# Library-Management-Application-Using-SQL-and-Java-

Library Management System is a system which maintains the information about the books present in the library, their authors, the members of library to whom books are issued, library staff and all. This is very difficult to organize manually. Maintenance of all this information manually is a very complex task. Owing to the advancement of technology, organization of a Library becomes much simple. The Library Management has been designed to computerize and automate the operations performed over the information about the members, book issues and returns and all other operations. This computerization of library helps in many instances of its maintenances. It reduces the workload of management as most of the manual work done is reduced.

1.1 PROJECT AIMS AND OBJECTIVES
The project aims and objectives that will be achieved after completion of this project are discussed in this subchapter. The aims and objectives are as follows:
	 A search column to search availability of books.
	 An Admin login page where admin can add books, videos or page sources.
	Statistics for the issued books and etc.
	Secure login for admins and fast response from the server.
	High database storage and secure transferring of data from server to application and vice-versa.
	Easy searching with book id’s and student id’s (useful when the admin issuing books or when returning of books).
	Easy tools for using the application tools.

1.2 BACKGROUND OF PROJECT
E-Library Management System is an application which refers to library systems which are generally small or medium in size. It is used by librarian to manage the library using a computerized system where he/she can add new books, new users or new students.
Books and student maintenance modules are also included in this system which would keep track of the students using the library and also a detailed description about the books a library contains. With this computerized system there will be no loss of book record or member record which generally happens when a non-computerized system is used. All these modules are able to help librarian to manage the library with more convenience and in a more efficient way as compared to library systems which are not computerized.

1.3 SYSTEM OBJECTIVES
	Improvement in control and performance.
The system is developed to cope up with the current issues and problems of library. The system can add user, validate user and is also bug free.
	Save cost
After computerized system is implemented less human force will be required to maintain the library thus reducing the overall cost.
	Save time
Librarian is able to search record by using few clicks of mouse and few search keywords thus saving his valuable time.
	Save Storage
Admin can easily update the application and use the application with some few clicks and the user can login from the application and connect to server from anywhere with few applications and some instructions.


SYSTEM REQUIREMENTS

2.1 NON-FUNCTIONAL REQUIREMENTS
	EFFICIENCY REQUIREMENT
When a library management system will be implemented librarian and user will easily access library as searching and book transaction will be very faster.

	RELIABILITY REQUIREMENT
The system should accurately perform member registration, member validation, report generation, book transaction and search.

	USABILITY REQUIREMENT
The system is designed for a user-friendly environment so that student and staff of library can perform the various tasks easily and in an effective way.

	IMPLEMENTATION REQUIREMNTS
In implementing whole system, it uses html in front end with php as server-side scripting language which will be used for database connectivity and the backend i.e., the database part is developed using MySQL.



2.2 FUNCTIONAL REQUIREMENTS
     1. NORMAL USER
	USER LOGIN
Description of feature
This feature used by the user to login into system. They are required to enter user id and password before they are allowed to enter the system. The user id and password will be verified and if invalid id is their user is allowed to not enter the system.
Functional requirements
	user id is provided when they register
	The system must only allow user with valid id and password to enter the system.
	The system performs authorization process which decides what user level can access to.
	The user must be able to logout after they finished using system.
2. REGISTER NEW USER
Description of feature
This feature can be performed by all users to register new user to create account.
Functional requirements
	System must be able to verify information.
	System must be able to delete information if information is wrong or can access the server for deleting the information for more storage.

3. REGISTER NEW BOOK
Description of feature
This feature allows to add new books to the library
Functional requirements
	System must be able to verify information.
	System must be able to enter number of copies into table.
	System must be able to not allow two books having same book id.
4. SEARCH BOOK
Description of feature
This feature is found in book maintenance part. we can search book based on book id (book id will be pasted by librarian while adding books. And the system generates the book id automatically while adding so that the librarian won’t get confused and will be managed by application).
Functional requirements
	System must be able to search the database based on select search 
	System must be able to show the filtered book in table view






2.3 SOFTWARE AND HARDWARE REQUIREMENTS This section describes the software and hardware requirements of the system
2.3.1 SOFTWARE REQUIREMENTS
	Operating system- Windows 7 is used as the operating system as it is stable and supports more features and is more user friendly.
	Database MYSQL-MYSQL is used as database as it easy to maintain and retrieve records by simple queries which are in English language which are easy to understand and easy to write.
	Development tools and Programming language- JAVA is used to write the whole code and database is created using MySQL and the code is developed using SWING concepts and the features of NetBeans IDE.
2.3.2 HARDWARE REQUIREMENTS
	Intel core i5 2nd generation and the latest processors is used as a processor because it is fast than other processors an provide reliable and stable and we can run our pc for longtime. By using this processor, we can keep on developing our project without any worries.
	Ram 4GB is used as it will provide fast reading and writing capabilities and will in turn support in processing.







2.4 Existing System Vs Proposed System
Existing System:
	Early days Libraries are managed manually. It required lot of time to record or to retrieve the details. The employees who have to record the details must perform their job very carefully. Even a small mistake would create a lot of problems. Security of information is very less. Report generations of all the information is very tough task.
	Maintenance of Library catalogue and arrangement of the books to the catalogue is very complex task. In addition to its maintenance of member details, issue dates and return dates etc. manually is a complex task.
	All the operations must be performed in perfect manner for the maintenance of the library without any degradation which may finally result in the failure of the entire system.
Proposed System:
To solve the inconveniences as mentioned in the existing system, an Online Library is proposed. The proposed system contains the following features:
	The students will register them through Online.
	Individually each member will have his account through which he can access the information he needs.
	Book details like authors, number of copies totally maintained by library, present available number of books, reference books, non-reference books etc. all this information can be made handy.
	Issue dates and returns of each member is maintained separately and fine charged if there is any delay in returning the book.
	Administrator can add, update the books.
	Time consuming is low, gives accurate results, reliability can be improved with the help of security.
2.5 SOFTWARE TOOLS USED
Front-End:
NetBeans IDE is used as the software tool for programming the front end. Java Programming is used as the front-end of this project. Java is a powerful general-purpose programming language. It is used to develop desktop and mobile applications, big data processing, embedded systems, and so on. According to Oracle, the company that owns Java, Java runs on 3 billion devices worldwide, which makes Java one of the most popular programming languages. In NetBeans IDE we have created each class for different features of the application. All classes are connected with a connection file. The Java classes runs accordingly to the programming. MySQL database connector/library is an in-built function in NetBeans IDE. The SQL server will be connected to the IDE classes and while the project is compiled and running successfully, the tables created in the database will be updated or edited and stored in the database. The stored information is only accessible by the admin with a username and password for the database server and cannot be accessed without a proper username and a password. The Connector “MySQL JDBC Driver” will be added as a library in our project and will be connected directly to the SQL server installed in the PC (in our case we have used WAMP SERVER 64.
Database:
In our project we have used MySQL as our database server and the console is used from WAMPSERVER 64. The server is connected to the NetBeans IDE locally using JDBC driver as a library in our project. The database is created and different tables were created for storing the data from the application in a formatted manner. This process of saving locally in a server makes the process of transferring or updating the tables in the database easy. This server is only accessed by the server admin with a username and a password of the administrator.
MySQL JDBC Driver and JAR files:
The driver connects all the classes to the database server locally and updates accordingly by the application. The driver is used as a library file in the project an in-built function of NetBeans IDE. The JAR files used in the project is taken from an open source and the jar files consists of calendar and some of the image icons and some important features of our project. The JAR files can be updated manually for future upgrades. This connector file can be used for connecting to one or more databases in same server at a time. In our project one simple database is used for the application and all the tables are created in a single database and in the same server.
