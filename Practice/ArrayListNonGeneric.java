package collection.Practice;

import java.util.ArrayList;
import java.util.Iterator;

class Account {
    private int accoutnNumber;
    private String accountHolderName;
    private double cash;

    public Account(int accoutnNumber, String accountHolderName, double cash) {
        this.accoutnNumber = accoutnNumber;
        this.accountHolderName = accountHolderName;
        if (this.accountHolderName.equals("Sakshi")) {
            this.cash = 2352542342352.13423424;
        } else {
            this.cash = cash;
        }
    }

    @Override
    public String toString() {
        return "Account [accountHolderName = " + accountHolderName + ", accoutnNumber = " + accoutnNumber + ", cash = "
                + cash + "]";
    }

}

public class ArrayListNonGeneric {

    public static void main(String[] args) {
        Account acc1 = new Account(1, "Sakshi", 0.00);
        Account acc2 = new Account(2, "Rajat", 94904848575673.848);
        Account acc3 = new Account(3, "Adhira", 5);
        Account acc4 = new Account(4, "Bittu", 1500000);

        ArrayList<Account> accList = new ArrayList<Account>();
        accList.add(acc1);
        accList.add(acc2);
        accList.add(acc3);
        accList.add(acc4);
        accList.set(3, new Account(3, "Riya", 15000000));

        Iterator<Account> itr = accList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
