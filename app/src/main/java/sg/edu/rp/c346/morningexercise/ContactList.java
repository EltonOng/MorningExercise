package sg.edu.rp.c346.morningexercise;

/**
 * Created by 16043971 on 23/7/2018.
 */

public class ContactList {

    private String name;
    private String code;
    private int Number;

    public ContactList(String name, String code, int number) {
        this.name = name;
        this.code = code;
        Number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", Number=" + Number +
                '}';
    }
}
