package jdbc.daoDemoProject.application;

import jdbc.daoDemoProject.model.dao.DaoFactory;
import jdbc.daoDemoProject.model.dao.SellerDao;
import jdbc.daoDemoProject.model.entities.Department;
import jdbc.daoDemoProject.model.entities.Seller;

import java.util.List;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellerList = sellerDao.findByDepartment(department);
        for (Seller obj : sellerList) {
            System.out.println(obj);
        }
    }
}
