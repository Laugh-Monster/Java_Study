package encapsulationexer.exer3;

/**
 * @ClassName:Employee
 * @Description
 * @Author Laugh_Monster
 * @Date 2024/9/24
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;

    public void setName(String na){
        name = na;
    }
    public String getName(){
        return name;
    }
    public void setGender(char ge){
        gender = ge;
    }
    public char getGender(){
        return gender;
    }
    public void setAge( int ag){
        age = ag;
    }
    public int getAge(){
        return age;
    }
    public void setPhoneNumber(String ph){
        phoneNumber = ph;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String showInfo(){
        return name + "\t" + gender + "\t" + age + "\t" + phoneNumber;
    }
}
