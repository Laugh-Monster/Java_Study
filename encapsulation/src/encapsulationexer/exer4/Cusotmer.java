package encapsulationexer.exer4;

/**
 * @ClassName:Custmer
 * @Description
 * @Author Laugh_Monster
 * @Date 2024/9/28
 */
public class Cusotmer {
    private String firstName;
    private String lastName;
    private Account account;
    public Cusotmer(String f,String l){
        firstName = f;
        lastName = l;
    }
    public void setFirstName(String f){
        firstName = f;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String l){
        lastName = l;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAccount(Account a){
        account = a;
    }
    public Account getAccount(){
        return account;
    }
}
