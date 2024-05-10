
import java.util.Scanner;

public class BasicATM {

    public static void main(String[] args) {
        int balance = 1000;
        int electricityBillUnitPrice = 150; // Elektrik faturası birim fiyatı ($)
        int waterBillUnitPrice = 50; // Su faturası birim fiyatı ($)
        int gasBillUnitPrice = 80; // Doğalgaz faturası birim fiyatı ($)
        int phoneBillUnitPrice = 40; // Telefon faturası birim fiyatı ($)
        boolean electricityBillPaid = false;
        boolean waterBillPaid = false;
        boolean gasBillPaid = false;
        boolean phoneBillPaid = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("Your Balance = $" + balance);

        while (true) {
            System.out.println("\n***** TRANSACTIONS *****");
            System.out.println("1 - WITHDRAW");
            System.out.println("2 - DEPOSIT");
            System.out.println("3 - CHECK BALANCE");
            System.out.println("4 - PAY BILL");
            System.out.println("5 - EXIT");
            System.out.print("Select Your Transaction: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: $");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient Balance.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Current Balance = $" + balance);
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    int depositAmount = scanner.nextInt();
                    balance += depositAmount;
                    System.out.println("Deposit successful. Current Balance = $" + balance);
                    break;
                case 3:
                    System.out.println("Your Balance = $" + balance);
                    break;
                case 4:
                    System.out.println("***** PAY BILL *****");
                    System.out.println("1 - Electricity Bill");
                    System.out.println("2 - Water Bill");
                    System.out.println("3 - Gas Bill");
                    System.out.println("4 - Phone Bill");
                    System.out.print("Select Bill to Pay: ");
                    System.out.println("!! Press the type of bill twice to pay the bill.");
                    int billChoice = scanner.nextInt();
                    int billAmount;
                    boolean billPaid;
                    switch (billChoice) {
                        case 1 -> {
                            if (!electricityBillPaid) {
                                System.out.println("Enter Electricity Bill Units: " + electricityBillUnitPrice);
                                int electricityBillUnits = scanner.nextInt();
                                billAmount = electricityBillUnits * electricityBillUnitPrice;
                                if (billAmount > balance) {
                                    System.out.println("Insufficient Balance.");
                                    billPaid = false;
                                } else {
                                    balance -= billAmount;
                                    System.out.println("Electricity bill payment successful. Current Balance = $" + balance);
                                    electricityBillPaid = true;
                                    billPaid = true;
                                }
                            } else {
                                System.out.println("Electricity bill has already been paid.");
                                billPaid = false;
                            }
                    }
                        case 2 -> {
                            if (!waterBillPaid) {
                                System.out.println("Enter Water Bill Units: " + waterBillUnitPrice);
                                int waterBillUnits = scanner.nextInt();
                                billAmount = waterBillUnits * waterBillUnitPrice;
                                if (billAmount > balance) {
                                    System.out.println("Insufficient Balance.");
                                    billPaid = false;
                                } else {
                                    balance -= billAmount;
                                    System.out.println("Water bill payment successful. Current Balance = $" + balance);
                                    waterBillPaid = true;
                                    billPaid = true;
                                }
                            } else {
                                System.out.println("Water bill has already been paid.");
                                billPaid = false;
                            }
                    }
                        case 3 -> {
                            if (!gasBillPaid) {
                                System.out.println("Enter Gas Bill Units: " + gasBillUnitPrice);
                                int gasBillUnits = scanner.nextInt();
                                billAmount = gasBillUnits * gasBillUnitPrice;
                                if (billAmount > balance) {
                                    System.out.println("Insufficient Balance.");
                                    billPaid = false;
                                } else {
                                    balance -= billAmount;
                                    System.out.println("Gas bill payment successful. Current Balance = $" + balance);
                                    gasBillPaid = true;
                                    billPaid = true;
                                }
                            } else {
                                System.out.println("Gas bill has already been paid.");
                                billPaid = false;
                            }
                    }
                        case 4 -> {
                            if (!phoneBillPaid) {
                                System.out.println("Enter Phone Bill Units: " + phoneBillUnitPrice);
                                int phoneBillUnits = scanner.nextInt();
                                billAmount = phoneBillUnits * phoneBillUnitPrice;
                                if (billAmount > balance) {
                                    System.out.println("Insufficient Balance.");
                                    billPaid = false;
                                } else {
                                    balance -= billAmount;
                                    System.out.println("Phone bill payment successful. Current Balance = $" + balance);
                                    phoneBillPaid = true;
                                    billPaid = true;
                                }
                            } else {
                                System.out.println("Phone bill has already been paid.");
                                billPaid = false;
                            }
                    }
                        default -> {
                            System.out.println("Invalid choice.");
                            billPaid = false;
                    }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
