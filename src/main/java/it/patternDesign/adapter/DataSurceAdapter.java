package it.patternDesign.adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class DataSurceAdapter implements DataSurce{
    private Info info;

    public DataSurceAdapter(Info info){
        this.info = info;
    }
    @Override
    public String getCompleteName() {
        String completename = info.getName() + " " + info.getSurname();
        return completename;
    }

    @Override
    public int getAge() {
        LocalDate dateOfBirth = info.getDataNascita();
        int age = calculateAge(dateOfBirth);
        return age;
    }

    private int calculateAge(LocalDate dateOfBirth){
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }
}
