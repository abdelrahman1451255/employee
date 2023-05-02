/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hellloword;
import java.util.*;
/**
 *
 * @author Lab505
 */
public class Hellloword {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
       String x1;
       int y;
//        ArrayList<Integer> a = new ArrayList();
//        //to add values
//        for (int i = 0; i < 10; i++) {
//            int x = S.nextInt();
//            a.add(x);
//        }
//        //to find serch
//        int x=S.nextInt();
//        boolean d = a.contains(x);
//        if(d)
//        {
//            System.out.println(d);
//        }
//        //sum 
//        int sum=0;
//        for (Integer i : a) {
//            sum+=i;
//        }
//        System.out.println(sum);
//        //min
//        int min = a.get(0);
//         for (Integer i : a) {
//            if(min>i)
//                min=i;
//        }
//         Employee my = new Employee();
         ArrayList<Employee> myList = new ArrayList<>();
         for(int i = 0 ; i<2; i++)
         {
//             System.out.println("enter name");
//             x1=S.next();
////             my.name=x1;
//             System.out.println("enter Salary");
//             y=S.nextInt();
////             my.salary=y;

Employee my = new Employee(S.next(),S.nextInt());
             myList.add(my);
         }
         for (Employee employee : myList) {
             System.out.println("name "+employee.name + "\nSalary " + employee.salary);
        }
    }
}
