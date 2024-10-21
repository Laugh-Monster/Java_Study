package encapsulationexer.exer5_project;

/**
 * @ClassName:CustomerList
 * @Description
 * @Author Laugh_Monster
 * @Date 2024/10/21
 */
public class CustomerList {
    private Customer[] customers;//用来保存客户对象的数组
    private int total;//记录已保存客户对象的数量
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];

    }
    public boolean addCustomer(Customer customer){
        if (total < customers.length){
            customers[total] = customer;
            total = total + 1;
            return true;
        }else {
            return false;
        }

    }
    public boolean replaceCustomer(int index, Customer cust){
        if (index >= 0 && index < total){
            customers[index] = cust;
            return true;
        }else {
            return false;
        }

    }
    public boolean deleteCustomer(int index){
        if (index >= 0 && index < total){
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[total - 1] = null;
            return true;
        }else {
            return false;
        }


    }
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;


    }
    public Customer getCustomer(int index){
        if (index > 0 && index < total){
            return customers[index];
        }else {
            return null;
        }

    }
    public int getTotal(){
        return total;

    }

}
