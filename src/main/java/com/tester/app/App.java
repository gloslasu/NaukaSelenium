package com.tester.app;

import com.tester.app.database.DatabaseConnection;
import pages.DatabaseUtils;

public class App {

    public static void main(String[] args) {

        DatabaseConnection databaseConnection = new DatabaseConnection();
        DatabaseUtils databaseUtils = new DatabaseUtils(); // klasa DatabaseUtils z paczki pages a nie z com.tester.app.database.DatabaseUtils
        // jak chcemy mieć w tej klasie dwa obiekty z Klas o tych samych nazwach to musimy jawnie wskazać
        // o jaką paczkę nam chodzi:
        com.tester.app.database.DatabaseUtils databaseUtils1 = new com.tester.app.database.DatabaseUtils();


    }

}
