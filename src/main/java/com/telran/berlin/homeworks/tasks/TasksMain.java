package com.telran.berlin.homeworks.tasks;

public class TasksMain {
    public static void main(String[] args) {
        Student firstStudent = new Student("Friedrich", 33);
        Student secondStudent = new Student("Friedrich", 25, "Trier");

        Rectangle firstRect = new Rectangle(3, 4);
        System.out.println("Perimeter of rectangle: " + firstRect.perimeter());
        System.out.println("Square of rectangle: " + firstRect.square());
    }
}
