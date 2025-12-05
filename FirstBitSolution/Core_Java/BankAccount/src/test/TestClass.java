package test;

import controller.BankController;
import model.SalaryAccount;
import java.time.LocalDate;

class Test {
    public static void main(String[] args) {

        BankController bb1 = new BankController();

        SalaryAccount sa = new SalaryAccount("1008", "Abhay Gupta", 8000, "Active");
        sa.lastTransactionDate = LocalDate.now().minusMonths(3);

        bb1.b1.accounts.add(sa);

        bb1.showmenu();
    }
}
