package Exam;

public class Contact {
    private String name;
    private String phone;


    // Constructor
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}

