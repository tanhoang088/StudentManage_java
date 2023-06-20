package model;

public class Student {
    int ID;
    String fullName;
    String address;
    int phoneNumber;

    public Student(int ID, String fullName, String address, int phoneNumber) {
        this.ID = ID;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Student(){

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString(){
        return  "ID:           " + this.getID() + "\n"+
                "Full name:    " + this.fullName + "\n"+
                "Address:      " + this.getAddress() +  "\n"+
                "Phone Number: " + this.getPhoneNumber() + "\n";
    }
}
