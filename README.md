# Java Basketball Stats Tracker

## Overview
This project is a Java application designed to track player statistics using MySQL database.

## Installation

### Prerequisites
- NetBeans IDE
- MySQL database

### Steps
1. Download NetBeans from the official website and open Java-Stats-Tracker folder. Once you finished netbeans installation, open the Java_MySQl_Completed folder in netbeans.
2. Download the `mysqljconnector`, or get it from the lib folder, and add it to the library of the `java_mysql` after you open it in netbeans. (Note: It might work without it, but it's recommended to include it.)
3. Create a MySQL database named "PlayerStats".
4. Make sure in the java_gui_form that the you change your username and password to whatever your mysql username and password is.

### Database Setup
- Run the following command in your MySQL environment to set up the necessary table, must open the terminal with the table folder:

Make sure to replace `username` with your MySQL username.

mysql -u username -p PlayerStats  < PlayerStatsTable.sql




### Configuration
- In the Java GUI Form class, update the username and password to match your MySQL credentials if they differ from the default.

## Usage
- Launch the application using NetBeans or by compiling and running the source files.
- Use the GUI to track and manage player statistics.



