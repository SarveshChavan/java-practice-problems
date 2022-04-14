
import java.lang.*;
import java.io.*;
import java.util.Scanner ;
class arrfun{
   int size;
   int arr[]=new int[100];
   Scanner sc = new Scanner(System.in);
  public void accept(int n){
	size=n;
      System.out.println("enter array element:");
    for (int i = 0; i < size; i++)
      {
	    arr[i] = sc.nextInt();
      }
     System.out.println();
  }
  public void display(){
    System.out.print("The array elements are:");
    for (int i = 0; i < size; i++)
      {
	    System.out.print(arr[i]+" ");
      }
      System.out.println();
  }
  public void asc(){
    int p=0;
    for (int i=0;i<size;i++){
      for(int j=i+1;j<size;j++){
        if(arr[i]>arr[j]){
          p=arr[j];
          arr[j]=arr[i];
          arr[i]=p;
        }
      }
    }
  }
  public void des(){
    int p;
    for (int i=0;i<size;i++){
      for(int j=i+1;j<size;j++){
        if(arr[i]< arr[j]){
          p=arr[j];
          arr[j]=arr[i];
          arr[i]=p;
        }
      }
    }
  }
  public void largeNsmall(){
    int large=-99 ,small=100000;
    for(int i=0;i<size;i++)
    {
      if(large < arr[i])
      {
        large=arr[i];
      }
      if(small >arr[i])
      {
        small=arr[i];
      }
    }
    System.out.println("The large in array is :"+large+" and the small is :"+small);
  }
  
  public void oddNeven(){
      int oddc=0,evenc=0;
    System.out.println("The even numbers are:");
    for(int i=0;i<size;i++)
    {
      if(arr[i]%2==0)
      {
        System.out.print(arr[i]+" ");
        evenc++;
      }
      
    }
    System.out.println("The count of even numbers is:"+evenc);
    System.out.println();
    System.out.println("The odd numbers are:");
    for(int i=0;i<size;i++)
    {
      if(arr[i]%2!=0)
      {
        System.out.print(arr[i]+" ");
        evenc++; 
      }
    }
     System.out.println("The count of odd numbers is:"+oddc);
    System.out.println();
  }
  public void reverse(){
      System.out.print("The array elements in reverse order are:");
    for(int i=size-1;i>=0;i--){
        System.out.print(arr[i]+" ");
          }
    System.out.println();
  }

  public void findmultiples(){
    int num;
    System.out.println("enter the number:");
    num=sc.nextInt();
    System.out.println("multiples of the number "+num+" in array are:");
    for(int i=0;i<size;i++)
    {
      if(arr[i]%num==0)
      {
        System.out.println(arr[i]+" ");
      }
    }
    System.out.println();
  }
  public void duplicate(){
      int dup=0;
      for(int i=0;i<size;i++)
      {
          for(int j=i+1;j<size;j++)
          {
              if(arr[i]==arr[j])
              {
                  System.out.println("duplicate of "+arr[i]+" is available");
                  dup++;
                  break;
              }
          }
          if(dup==0)
          {
              System.out.println("sorry dupicate for "+arr[i]+" is not available");
          }
      }
      System.out.println();
  }
}
class ass1{
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("define array size:");
    int len = s.nextInt();
    arrfun p= new arrfun();
    p.accept(len);
    boolean t=true;
    int choice=0;
    while(t){
      System.out.println("MENU");
      System.out.println("1.ascending");
      System.out.println("2.descending");
      System.out.println("3.largest and smallest");
      System.out.println("4.count odd and even");
      System.out.println("5.reverse");
      System.out.println("6.find multiples");
      System.out.println("7.duplicate");
      System.out.println("8.exit");
	  choice=s.nextInt();
      switch(choice){
        case 1:
          p.asc();
          p.display();
          break;
        case 2:
          p.des();
          p.display();
          break;
        case 3:
          p.largeNsmall();
          break;
        case 4:
          p.oddNeven();
          break;
        case 5:
          p.reverse();
          break;
        case 6:
          p.findmultiples();
          break;
        case 7:
          p.duplicate();
          break;
        case 8:
          return ;
      }
    }
  }
  
}

      

  


