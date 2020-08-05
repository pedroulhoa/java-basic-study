package jdbc.daoDemoProject.application;

import jdbc.daoDemoProject.model.dao.DaoFactory;
import jdbc.daoDemoProject.model.dao.SellerDao;
import jdbc.daoDemoProject.model.entities.Department;
import jdbc.daoDemoProject.model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
