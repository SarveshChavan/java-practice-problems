import java.util.*;

abstract class shape{
    public int l,h;
    public void print_area(){

    } 
} 
class triangle extends shape{
    Scanner sc=new Scanner(System.in);

    public void print_area(){
        System.out.print("enter height:");
        h=sc.nextInt();
        System.out.print("enter base:");
        l=sc.nextInt();
        System.out.println("the area of triangle is:"+l*h/2);
    }
}
class rect extends shape{
    Scanner sc=new Scanner(System.in);

    public void print_area(){
        System.out.print("enter breadth:");
        h=sc.nextInt();
        System.out.print("enter length:");
        l=sc.nextInt();
        System.out.println("the area of triangle is:"+l*h);
    }
}
class circle extends shape{
    Scanner sc=new Scanner(System.in);

    public void print_area(){
        System.out.print("enter radius:");
        h=sc.nextInt();
        System.out.println("the area of circle is:"+(3.142*h*h));
    }
}
public class area {
    public static void main(String[] args) {
        int choice;
        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.print("Menu\n1)triangle\n2)rectangle\n3)circle\n0)exit\n");
            System.out.print("enter your choice:");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                triangle obj=new triangle();
                obj.print_area();
                break;
                case 2:
                rect objr=new rect();
                objr.print_area();
                break;
                case 3:
                circle obj2=new circle();
                obj2.print_area();
                break;
                default:
                System.out.println("wrong choice!");
                break;
                case 0:
                return;

            }
        }
    }
}
