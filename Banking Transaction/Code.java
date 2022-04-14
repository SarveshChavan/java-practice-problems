import java.util.*;

class Bank {
    public int accno, bal;
    static int id = 0;
    public String name, type;
    Scanner s = new Scanner(System.in);

    Bank() {
        accno = 0;
        bal = 0;
        name = "no data";
        type = "no data";
    }

    public int insert() {
        System.out.print("Enter Your Name:");
        name = s.nextLine();
        System.out.print("Enter your account no:");
        accno = s.nextInt();
        System.out.print("Enter your account type:");
        type = s.next();
        System.out.print("Enter your Balance:");
        bal = s.nextInt();
        id++;
        System.out.print("your id is:" + id);
        System.out.println();
        return id;
    }

    public void display() {
        System.out.println("Name:" + this.name);
        System.out.println("account no:" + this.accno);
        System.out.println("account type:" + this.type);
        System.out.println("Balance:" + this.bal);
    }

    public boolean check() {
        return bal > 2000;
    }

    public void deposit(long val) {
        bal += val;
        System.out.println("The balance after deposition is:" + bal);
    }

    public void withdraw(long val) {
        if (check()) {
            bal -= val;
            System.out.println("The amount after withdraw is:" + bal);
        } else {
            System.out.println("Sorry! you have critical balance in your account.");
        }
    }
}

public class ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, num = 0, i, val;
        Bank obj[] = new Bank[10];
        for (int j = 0; j < 10; j++) {
            obj[j] = new Bank();
        }
        while (true) {
            System.out.print("Menu\n1)insert\n2)display\n3)deposit\n4)withdraw\n0)exit\n");
            System.out.print("enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    num = obj[num].insert();
                    break;
                case 2:
                    System.out.print("enter your id:");
                    i = sc.nextInt();
                    obj[i - 1].display();
                    break;
                default:
                    System.out.print("wrong choice!");
                    break;
                case 3:
                    System.out.print("enter your id:");
                    i = sc.nextInt();
                    System.out.println("Enter amount to deposit:");
                    val = sc.nextInt();
                    obj[i-1].deposit(val);
                    break;
                case 4:
                    System.out.print("enter your id:");
                    i = sc.nextInt();
                    System.out.println("Enter amount to withdraw:");
                    val = sc.nextInt();
                    obj[i-1].withdraw(val);
                    break;
                case 0:
                    return;

            }
        }
    }
}
