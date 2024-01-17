package com.DeadlockExample;

public class DeadlockDemo {

 // Two shared resources
 static Object resource1 = new Object();
 static Object resource2 = new Object();

 public static void main(String[] args) {
     // Create two threads that attempt to acquire resources in different order
     Thread thread1 = new Thread(new Task1());
     Thread thread2 = new Thread(new Task2());

     // Start the threads
     thread1.start();
     thread2.start();
 }

 static class Task1 implements Runnable {
     @Override
     public void run() {
         synchronized (resource1) {
             System.out.println("Thread 1: Holding resource 1");

             // Introduce some delay to make deadlock more likely
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

             synchronized (resource2) {
                 System.out.println("Thread 1: Holding resource 2");
             }
         }
     }
 }

 static class Task2 implements Runnable {
     @Override
     public void run() {
         synchronized (resource2) {
             System.out.println("Thread 2: Holding resource 2");

             // Introduce some delay to make deadlock more likely
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

             synchronized (resource1) {
                 System.out.println("Thread 2: Holding resource 1");
             }
         }
     }
 }
}

