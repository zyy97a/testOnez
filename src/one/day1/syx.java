package one.day1;

public class syx {
    public syx() {
    }

    public String name;
    protected int age;
    char sex;
    private String phoneNum;

    public syx(String name, int age, char sex, String phoneNum) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phoneNum = phoneNum;
    }


    @Override
    public String toString() {
        return "syx{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
