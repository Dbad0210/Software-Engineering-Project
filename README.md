# Java Basketball Stats Tracker

## Overview
A project completed for *CSCI 234 - Intro to Software Engineering* that utilizes a Java GUI to track and manage player statistics for the Moravian Women's Basketball Team.

## Installation - Manual Tutorial

### 0. Prerequisites
First, download the [NetBeans IDE](https://netbeans.apache.org/front/main/download/nb122/nb122/).

Once installed, download [MySQL](https://dev.mysql.com/downloads/mysql/) and follow the [tutorial](https://dev.mysql.com/doc/mysql-getting-started/en/) to create an account.

### 1. Clone the repository
Once you are all set up, press the green `<> Code` button to gain a link to clone the repository.

Then, open your preferred [IDE](https://aws.amazon.com/what-is/ide/) or a [Command Line Interface](https://en.wikipedia.org/wiki/Command-line_interface#:~:text=A%20command%2Dline%20interface%20\(CLI,interface%20available%20with%20punched%20cards.) and clone the repository with the command `git clone [REPO LINK HERE]`.

### 2. Open the `Java_MySQl_Completed` folder in NetBeans.

### 3. Create a MySQL Database
Open up a Command Line Interface or Terminal.

Log into MySQL with the following command:

```
mysql -u [YOUR USER NAME] -p
```

You will then be prompted to enter the password to your MySQL account. If successful, you should be logged in.

Next, create a new database for the project called `playerstats` with the command:

```
mysql> CREATE DATABASE playerstats;
```

Now, open a new Terminal window at the `Table` folder in the project's folder. To do this, run the following command (this is assuming the `Software-Engineering-Project` repo was cloned or downloaded to your `Downloads` folder):

```
cd Downloads/Software-Engineering-Project/Java-Stats-Tracker/Table
```

Finally, run the following command in that Terminal to populate (insert data into) the newly created database:

```
mysql -u [YOUR USER NAME] -p playerstats < PlayerStatsTable.sql 
```

If successful, you should see that data has been inserted into the database when the following commands are run in MySQL:

```
mysql> USE playerstats;
mysql> SELECT * FROM playerstats;
```

### 4. Edit "java_gui_form.java"
Go back into the NetBeans IDE where you previously opened the `Java_MySQL_Completed` folder.

In it, go to `Source Packages` ---> `Java_GUI_Form` ---> `java_gui_form.java`.

At the very top of the file, locate lines 29-31 in that file that read:

```
    private static final String username = "project";
    private static final String password = "project";
    private static final String dataConn = "jdbc:mysql://localhost:3306/playerstats";
```

Replace the placeholder words that read `project` with your MySQL username and password, respectively.

### 5. Run the application

If all the above steps were done correctly, you will now be able to successfully run the application!

In the NetBeans IDE, locate and press the green arrow (the "Run Project" button) to run the project locally.
