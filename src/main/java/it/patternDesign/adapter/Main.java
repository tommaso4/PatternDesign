package it.patternDesign.adapter;

import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Info info1 = new Info("Tom","Cant", LocalDate.of(1991,06,20));

        DataSurceAdapter adapter = new DataSurceAdapter(info1);
        UserData userData1 = new UserData();
        userData1.getData(adapter);
        System.out.println(userData1);

    }
}
