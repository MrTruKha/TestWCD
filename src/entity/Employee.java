package entity;

public class Employee {
    private int id;
    private String fullname;
    private String birthday;
    private String address;
    private String position;

    public Employee(String fullname, String birthday, String address, String position) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.address = address;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public float getAddress() {
        return address;
    }

    public void setAddress(float address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
