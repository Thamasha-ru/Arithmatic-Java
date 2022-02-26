package com.itum;
import java.util.* ;
public class Arith {


        public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);

            Arith obj = new Arith();

            System.out.print("Enter 1st Number: ");
            int x = sc.nextInt();

            System.out.print("Enter 2nd Number: ");
            int y = sc.nextInt();
            obj.add(x,y);
            obj.sub(x,y);
            obj.mul(x,y);
            obj.dev(x,y);

        }
        void add(int x,int y){
            System.out.println("Sum = " + (x+y));
        }
        void sub(int x,int y){
            System.out.println("Sub = " + (x-y));
        }
        void mul(int x,int y){
            System.out.println("Mul = " + (x*y));
        }
        void dev(int x,int y){
            System.out.println("Dev = " + (x/y));
        }
    }

