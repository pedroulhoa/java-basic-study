package jdbc.daoDemoProject.model.dao;

import jdbc.daoDemoProject.model.dao.impl.SellerDaoJDBC;
import jdbc.db.DB;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

}
