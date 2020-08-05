package jdbc.daoDemoProject.application;

import jdbc.daoDemoProject.model.dao.DaoFactory;
import jdbc.daoDemoProject.model.dao.SellerDao;
import jdbc.daoDemoProject.model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
