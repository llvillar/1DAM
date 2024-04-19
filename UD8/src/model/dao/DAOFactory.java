package model.dao;

import datasource.DataSource;

public class DAOFactory {

    public static CocheDao createCocheDao(){
        return new CocheDaoImpl(DataSource.getConnection());
    }
}
