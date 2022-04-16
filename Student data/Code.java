import java.util.*;

class database {
    public int roll;
    public long mob;
    public static int id = 1;
    public String name, city, department;
    Scanner sc = new Scanner(System.in);

    public void insert() {
        System.out.print("enter roll number:");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("enter name:");
        name = sc.nextLine();
        System.out.print("enter mobile number:");
        mob = sc.nextLong();
        sc.nextLine();
        System.out.print("enter department:");
        department = sc.nextLine();
        System.out.print("enter city:");
        city = sc.nextLine();
        System.out.println("your id is:" + id);
        id++;
        System.out.println();
    }

    public void update() {
        System.out.print("enter name:");
        name = sc.nextLine();
        System.out.print("enter mobile number:");
        mob = sc.nextLong();
        sc.nextLine();
        System.out.print("enter department:");
        department = sc.nextLine();
        System.out.print("enter city:");
        city = sc.nextLine();
        System.out.println();

    }

    public void search(int i) {
        if(id<=i||i<0){
            System.out.println("data not found"); 
            return;
        }
        System.out.println("data found"); 
        System.out.println();

    }
    public void display(int num){
        System.out.println("data found");
        System.out.println("roll number:"+roll);  
        System.out.println("name:"+name); 
        System.out.println("mobile number:"+mob); 
        System.out.println("department:"+department); 
        System.out.println("city:"+city); 
        System.out.println("id:"+num); 
        System.out.println();

    }
}

public class Simple {
    public static void main(String[] args) {
        int roll,choice,i=0,num;
        database obj[] = new database[10];
        for (int j = 0; j < 10; j++) {
            obj[j] = new database();
        }
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Menu\n1)insert\n2)display\n3)update\n4)search\n0)exit\n");
            System.out.print("enter your choice:");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                obj[i].insert();
                i++;
                break;
                case 2:
                System.out.print("enter id:");
                num = s.nextInt();
                obj[num-1].display(num);
                break;
                case 3:
                System.out.print("enter id:");
                num = s.nextInt();
                obj[num-1].update();
                break;
                case 4:
                System.out.print("enter id:");
                num = s.nextInt();
                obj[num-1].search(num);
                break;
                default:
                System.out.print("wrong choice!");
                break;
                case 0:
                return;
            }
        }
    }
}
