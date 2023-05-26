package model.dao;

import db.DB;
import model.dao.imp.SellerDaoJDBC;

// Objeto auxiliar responsável pela instânciação dos daos
public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
