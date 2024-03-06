# Java Basketball Statts Tracker

## Overview
This project is a Java application designed to track player statistics using MySQL database.

## Installation

### Prerequisites
- NetBeans IDE
- MySQL database

### Steps
1. Download NetBeans from the official website 
2. Download the `mysqljconnector`, Rafael sent that in the gc, and add it to the library of the `java_mysql` folder. (Note: It might work without it, but it's recommended to include it.)
3. Create a MySQL database named "PlayerStats".

### Database Setup
- Run the following command in your MySQL environment to set up the necessary table:

Make sure to replace `username` with your MySQL username.

mysql -u username -p PlayerStats  < PlayerStatsTable.sql




### Configuration
- In the Java GUI Form class, update the username and password to match your MySQL credentials if they differ from the default.

## Usage
- Launch the application using NetBeans or by compiling and running the source files.
- Use the GUI to track and manage player statistics.


### Your welcome hopefully we can live in peace since I finished it.

