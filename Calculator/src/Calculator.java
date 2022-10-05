import java.util.*;
public class Calculator {
    public static void main (String args[]) {
        byte by1,by2;
        short s1,s2;
        int i1,i2;
        long l1,l2;
        float f1, f2;
        double d1,d2;
        Scanner scan = new Scanner(System.in);
        char choice;
        System.out.println("1 for multiplication\n 2 for division\n");
        choice=scan.next().charAt(0);
        if(choice=='1'){
            do {
                System.out.print("1 Multiplication byte\n");
                System.out.print("2 Multiplication short\n");
                System.out.print("3 Multiplication int\n");
                System.out.print("4 Multiplication long\n");
                System.out.print("5 Multiplication float\n");
                System.out.print("6 Multiplication double\n");
                System.out.print("8 Exit\n\n");
                System.out.print("Enter Your Choice : ");
                choice = scan.next().charAt(0);
                switch (choice) {
                    case '1':
                        System.out.println("Enter Two Number : ");
                        by1 = scan.nextByte();
                        by2 = scan.nextByte();
                        System.out.println("Result = " + by1*by2);
                        break;
                    case '2':
                        System.out.println("Enter Two Number : ");
                        s1 = scan.nextShort();
                        s2 = scan.nextShort();
                        System.out.println("Result = " + s1*s2);
                        break;
                    case '3':
                        System.out.println("Enter Two Number : ");
                        i1 = scan.nextInt();
                        i2 = scan.nextInt();
                        System.out.println("Result = " + i1*i2);
                        break;
                    case '4':
                        System.out.println("Enter Two Number : ");
                        l1 = scan.nextLong();
                        l2 = scan.nextLong();
                        System.out.println("Result = " + l1*l2);
                        break;
                    case '5':
                        System.out.print("Enter Two Number : ");
                        f1 = scan.nextFloat();
                        f2 = scan.nextFloat();
                        System.out.print("Result = " + f1*f2);
                        break;
                    case '6':
                        System.out.print("Enter Two Number : ");
                        d1 = scan.nextDouble();
                        d2 = scan.nextDouble();
                        System.out.println("Result = " + d1*d2);
                        break;
                    case '7':
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong Choice!");
                }
            } while (choice != '7');
        }
        else if(choice=='2'){
            do {
                System.out.print("1 Division byte\n");
                System.out.print("2 Division short\n");
                System.out.print("3 Division int\n");
                System.out.print("4 Division long\n");
                System.out.print("5 Division float\n");
                System.out.print("6 Division double\n");
                System.out.print("7 Exit\n\n");
                System.out.print("Enter Your Choice : ");
                choice = scan.next().charAt(0);
                switch (choice) {
                    case '1':
                        System.out.println("Enter Two Number : ");
                        by1 = scan.nextByte();
                        by2 = scan.nextByte();
                        System.out.println("Result = " + by1/by2);
                        break;
                    case '2':
                        System.out.println("Enter Two Number : ");
                        s1 = scan.nextShort();
                        s2 = scan.nextShort();
                        System.out.println("Result = " + s1/s2);
                        break;
                    case '3':
                        System.out.println("Enter Two Number : ");
                        i1 = scan.nextInt();
                        i2 = scan.nextInt();
                        System.out.println("Result = " + i1/i2);
                        break;
                    case '4':
                        System.out.println("Enter Two Number : ");
                        l1 = scan.nextLong();
                        l2 = scan.nextLong();
                        System.out.println("Result = " + l1/l2);
                        break;
                    case '5':
                        System.out.println("Enter Two Number : ");
                        f1 = scan.nextFloat();
                        f2 = scan.nextFloat();
                        System.out.println("Result = " + f1/f2);
                        break;
                    case '6':
                        System.out.println("Enter Two Number : ");
                        d1 = scan.nextDouble();
                        d2 = scan.nextDouble();
                        System.out.println("Result = " + d1/d2);
                        break;
                    case '7':
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong Choice!");
                }
            } while (choice != '7');
        }
        else{
            System.exit(0);
        }
    }
}
