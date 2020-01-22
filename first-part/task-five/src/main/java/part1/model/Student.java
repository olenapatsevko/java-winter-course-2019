package part1.model;

public class Student {
    private String surname;
    private String name;
    private String birthday;
    private String phone;
    private String adress;

    public Student() {
    }

    public Student(String name, String surname, String birthday, String phone, String adress) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.adress = adress;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "\n surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", adress='" + adress + '\'';
    }
}
