package encapsulationexer.exer4;

/**
 * @ClassName:CustomerTest
 * @Description
 * @Author Laugh_Monster
 * @Date 2024/9/28
 */
public class CustomerTest {
    public static void main(String[] args) {
        Cusotmer cus1 = new Cusotmer("Jane", "Smith");
        Account account1 = new Account(1001, 2000, 0.0123);
        cus1.setAccount(account1);
        cus1.getAccount().deposit(100);
        cus1.getAccount().withdraw(960);
        cus1.getAccount().withdraw(2000);


    }

}
