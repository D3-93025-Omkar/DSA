package com;

import java.util.Scanner;

public class Program {

    public static Scanner sc = new Scanner(System.in);

    public static int menuList() {

        System.out.println("-----------------------------------------");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Undo");
        System.out.println("4. Redo");
        System.out.println("5. Display List");
        System.out.println("0. Exit");
        System.out.println("-----------------------------------------");
        System.out.print("Enter choice : ");
        return sc.nextInt();
    }

    public static void main(String[] args) {

        int ch;
        LinkedList ll = new LinkedList();

        while ((ch = menuList()) != 0) {

            switch (ch) {

                case 1:
                    System.out.print("Enter data : ");
                    ll.pushRear(sc.nextInt());
                    break;

                case 2:
                	 int delRear = ll.popRare();
                     System.out.println("Deleted from rear : " + delRear);
                     break;

                case 3:
                    ll.undo();
                    break;

                case 4:
                    ll.redo();
                    break;

                case 5:
                    ll.display();
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        System.out.println("Program Ended.");
    }
}
