package jdbc.daoDemoProject.model.dao;

import jdbc.daoDemoProject.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static  SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }

}
