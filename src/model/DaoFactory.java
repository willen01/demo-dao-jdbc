package model;

import model.dao.SellerDao;
import model.dao.imp.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
