package jdbc.daoDemoProject.application;

import jdbc.daoDemoProject.model.entities.Department;
import jdbc.daoDemoProject.model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        System.out.println(seller);
    }
}
