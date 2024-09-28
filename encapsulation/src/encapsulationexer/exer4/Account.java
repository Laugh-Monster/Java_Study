package encapsulationexer.exer4;

/**
 * @ClassName:Account
 * @Description
 * @Author Laugh_Monster
 * @Date 2024/9/28
 */
public class Account {
    private int accountId;
    private int balance;
    private double annualInterestRate;

    public void setAccountId(int id){
        accountId = id;
    }
    public int getAccountId(){
        return accountId;
    }
    public void setBalance(int b){
        balance = b;
    }
    public int getBalance(){
        return balance;
    }
    public void setAnnualInterestRate(double a){
        annualInterestRate = a;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public Account(int n,int y,double l){
        accountId = n;
        balance = y;
        annualInterestRate = l;
    }
    //存款
    public void deposit(int q){
        if (q > 0){
            balance += q;
            System.out.println("存款成功，成功存入" + q + "元");
        }else {
            System.out.println("存款操作失败");
        }
    }

    //取款
    public void withdraw(int c){
        if (c > 0 && c <= balance){
            balance -= c;
        }else {
            System.out.println("取款操作失败");
        }
    }
    public String printInfo(){
        return "账户ID" + accountId + "的余额为" + balance + "," + "年利率为" + annualInterestRate;
    }

}
