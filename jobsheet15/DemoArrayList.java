import java.util.ArrayList;
public class DemoArrayList{

    public static void main(String[] args) {
        ArrayList<Customer> newCustomers = new ArrayList<>();

        newCustomers.add(new Customer(201, "Della"));
        newCustomers.add(new Customer(202, "Victor"));
        newCustomers.add(new Customer(203, "Sarah"));

        newCustomers.sort((c1,c2)->c1.name.compareTo(c2.name));
        System.out.println(newCustomers); 

        for (Customer cust : newCustomers) {
            System.out.println(cust.toString());
        }
        System.out.println(newCustomers);
    }
}