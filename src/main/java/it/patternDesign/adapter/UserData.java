package it.patternDesign.adapter;

public class UserData {
    private String completedName;
    private int age;
    public void getData(DataSurce ds){
        completedName = ds.getCompleteName();
        age = ds.getAge();
    }

    @Override
    public String toString() {
        return "UserData{" +
                "completedName='" + completedName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getCompletedName() {
        return completedName;
    }

    public void setCompletedName(String completedName) {
        this.completedName = completedName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
