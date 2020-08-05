package jdbc.daoDemoProject.application;

import jdbc.daoDemoProject.model.entities.Department;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        System.out.println(obj);
    }
}
