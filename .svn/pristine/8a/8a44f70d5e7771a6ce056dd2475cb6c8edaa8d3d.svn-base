package com.ehb.xavier.garageverhuur.classes;

/**
 * Created by xavier on 27/05/2015.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "ormlite1android.db";
    private static final int DATABASE_VERSION = 4;
    private Context context;
    private Dao<Adres, String> AdresDao = null;
    private Dao<Persoon, String> PersoonDao = null;
    private Dao<Garage, String> GarageDao = null;
    private Dao<Verhuurd, String> VerhuurdDAO = null;
    private RuntimeExceptionDao<Adres, String> AdresRuntimeDao = null;
    private RuntimeExceptionDao<Persoon, String> PersoonRuntimeDao = null;
    private RuntimeExceptionDao<Garage, String> GarageRuntimeDAO = null;
    private RuntimeExceptionDao<Verhuurd, String> VerhuurdRuntimeDao = null;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    public Dao<Adres, String> getAdresDao() throws SQLException {
        if (AdresDao == null) {
            AdresDao = getDao(Adres.class);
        }
        return AdresDao;
    }

    public Dao<Persoon, String> getPersoonDao() throws SQLException {
        if (PersoonDao == null) {
            PersoonDao = getDao(Persoon.class);
        }
        return PersoonDao;
    }

    public Dao<Garage, String> getGarageDao() throws SQLException {
        if (GarageDao == null) {
            GarageDao = getDao(Garage.class);
        }
        return GarageDao;
    }

    public RuntimeExceptionDao<Adres, String> getAdresDataDao() {
        if (AdresRuntimeDao == null) {
            AdresRuntimeDao = getRuntimeExceptionDao(Adres.class);
        }
        return AdresRuntimeDao;
    }

    public RuntimeExceptionDao<Garage, String> getGarageDataDao() {
        if (GarageRuntimeDAO == null) {
            GarageRuntimeDAO = getRuntimeExceptionDao(Garage.class);
        }
        return GarageRuntimeDAO;
    }
    public RuntimeExceptionDao<Verhuurd, String> getVerhuurdDataDao() {
        if (VerhuurdRuntimeDao == null) {
            VerhuurdRuntimeDao = getRuntimeExceptionDao(Verhuurd.class);

        }
        return VerhuurdRuntimeDao;
    }

    public RuntimeExceptionDao<Persoon, String> getPersoonDataDao() {
        if (PersoonRuntimeDao == null) {
            PersoonRuntimeDao = getRuntimeExceptionDao(Persoon.class);

        }
        return PersoonRuntimeDao;
    }

        //method for list of person
        public ArrayList<Adres> getAdresData() {
            DatabaseHelper helper = new DatabaseHelper(context);
            RuntimeExceptionDao<Adres, String> AdresDao = helper.getAdresDataDao();
            ArrayList<Adres> list = (ArrayList) AdresDao.queryForAll();
            return list;
        }

        public Adres getAdresByID(int id) {
            RuntimeExceptionDao<Adres, String> dao = getAdresDataDao();
            Adres c = dao.queryForId(id + "");
            return c;
        }

        //method for insert data
        public int addAdresData(Adres person) {
            RuntimeExceptionDao<Adres, String> dao = getAdresDataDao();
            int i = dao.create(person);
            return i;
        }

        public int updateAdresData(Adres person) {
            RuntimeExceptionDao<Adres, String> dao = getAdresDataDao();
            int i = dao.update(person);
            return i;
        }

        public void deleteAdresbyid(int id) {
            RuntimeExceptionDao<Adres, String> dao = getAdresDataDao();
            Adres c = dao.queryForId(id + "");
            dao.delete(c);
        }

        //method for delete all rows
        public void deleteAdresAll() {
            RuntimeExceptionDao<Adres, String> dao = getAdresDataDao();
            List<Adres> list = dao.queryForAll();
            dao.delete(list);
        }

        public ArrayList<Persoon> getPersoonData() {
            DatabaseHelper helper = new DatabaseHelper(context);
            RuntimeExceptionDao<Persoon, String> PersoonDao = helper.getPersoonDataDao();
            ArrayList<Persoon> list = (ArrayList) PersoonDao.queryForAll();
            return list;
        }

        public Persoon getPersoonByID(int id) {
            RuntimeExceptionDao<Persoon, String> dao = getPersoonDataDao();
            Persoon c = dao.queryForId(id + "");
            return c;
        }

        //method for insert data
        public int addPersoonData(Persoon person) {
            RuntimeExceptionDao<Persoon, String> dao = getPersoonDataDao();
            int i = dao.create(person);
            return i;
        }

        public int updatePersoonData(Persoon person) {
            RuntimeExceptionDao<Persoon, String> dao = getPersoonDataDao();
            int i = dao.update(person);
            return i;
        }

        public void deletePersoonbyid(int id) {
            RuntimeExceptionDao<Persoon, String> dao = getPersoonDataDao();
            Persoon c = dao.queryForId(id + "");
            dao.delete(c);
        }

        //method for delete all rows
        public void deletePersoonAll() {
            RuntimeExceptionDao<Persoon, String> dao = getPersoonDataDao();
            List<Persoon> list = dao.queryForAll();
            dao.delete(list);
        }


        public ArrayList<Garage> getGarageData() {

            RuntimeExceptionDao<Garage, String> GarageDao = getGarageDataDao();
            return (ArrayList) GarageDao.queryForAll();
        }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
        public ArrayList<Garage> getGarageBy(String s) {
            RuntimeExceptionDao<Garage, String> dao = getGarageDataDao();
            ArrayList<Garage> c = (ArrayList) dao.queryForEq("groote", s);

            boolean bool = isInteger(s);
            if (bool) {
                int in = Integer.parseInt(s);

                    c = (ArrayList) dao.queryForEq("prijs", in);

            }
            /*SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            try {
                Date date = format.parse(s);
                // System.out.println(date);
                c = (ArrayList) dao.queryForEq("Startdate", date);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                //e.printStackTrace();
            }
            try {
                Date date = format.parse(s);
                // System.out.println(date);
                c = (ArrayList) dao.queryForEq("Endedate", date);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                //e.printStackTrace();
            }*/

                return c;

        }

        public Garage getGarageByID(int id) {
            RuntimeExceptionDao<Garage, String> dao = getGarageDataDao();
            Garage c = dao.queryForId(String.valueOf(id));
            return c;
        }

        //method for insert data
        public int addGarageData(Garage person) {
            RuntimeExceptionDao<Garage, String> dao = getGarageDataDao();
            int i = dao.create(person);
            return i;
        }

        public int updateGarageData(Garage person) {
            RuntimeExceptionDao<Garage, String> dao = getGarageDataDao();
            int i = dao.update(person);
            return i;
        }

        public void deleteGaragebyid(int id) {
            RuntimeExceptionDao<Garage, String> dao = getGarageDataDao();
            Garage c = dao.queryForId(id + "");
            dao.delete(c);
        }

        //method for delete all rows
        public void deleteGarageAll() {
            RuntimeExceptionDao<Garage, String> dao = getGarageDataDao();
            List<Garage> list = dao.queryForAll();
            dao.delete(list);
        }


        public ArrayList<Verhuurd> getVerhuurdData() {
            DatabaseHelper helper = new DatabaseHelper(context);
            RuntimeExceptionDao<Verhuurd, String> LoginDao = helper.getVerhuurdDataDao();
            ArrayList<Verhuurd> list = (ArrayList) LoginDao.queryForAll();
            return list;
        }

        public Verhuurd getVerhuurdByID(int id) {
            RuntimeExceptionDao<Verhuurd, String> dao = getVerhuurdDataDao();
            Verhuurd c = dao.queryForId(id + "");
            return c;
        }

    public ArrayList<Verhuurd> getVerhuurdByGarageID(int id) {
        RuntimeExceptionDao<Verhuurd, String> dao = getVerhuurdDataDao();
        ArrayList<Verhuurd> c = (ArrayList) dao.queryForEq("Opslag_id",id);
        return c;
    }

        //method for insert data
        public int addVerhuurdData(Verhuurd person) {
            RuntimeExceptionDao<Verhuurd, String> dao = getVerhuurdDataDao();
            int i = dao.create(person);
            return i;
        }

        public int updateVerhuurdData(Verhuurd person) {
            RuntimeExceptionDao<Verhuurd, String> dao = getVerhuurdDataDao();
            int i = dao.update(person);
            return i;
        }

        public void deleteVerhuurdbyid(int id) {
            RuntimeExceptionDao<Verhuurd, String> dao = getVerhuurdDataDao();
            Verhuurd c = dao.queryForId(id + "");
            dao.delete(c);
        }

        //method for delete all rows
        public void deleteVerhuurdAll() {
            RuntimeExceptionDao<Verhuurd, String> dao = getVerhuurdDataDao();
            List<Verhuurd> list = dao.queryForAll();
            dao.delete(list);
        }
   /* public void delete(Contact city) throws SQLException {
        RuntimeExceptionDao<Contact,String> dao = getSimpleDataDao();
        DeleteBuilder db = dao.deleteBuilder();
        db.where().eq("id", city.getId());
        dao.delete(db.prepare());
        // then call the super to delete the city

    }*/




    @Override
    public void close() {
        super.close();
        AdresRuntimeDao = null;
        PersoonRuntimeDao = null;
        GarageRuntimeDAO = null;
        VerhuurdRuntimeDao = null;
    }

    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
        try {
            Log.e(DatabaseHelper.class.getName(), "onCreate");
            TableUtils.createTable(connectionSource, Adres.class);
            TableUtils.createTable(connectionSource, Persoon.class);
            TableUtils.createTable(connectionSource, Garage.class);
            TableUtils.createTable(connectionSource, Verhuurd.class);
        } catch (SQLException e) {
            Log.e(DatabaseHelper.class.getName(), "Can't create database", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            Log.e(DatabaseHelper.class.getName(), "onUpgrade");
            TableUtils.dropTable(connectionSource, Adres.class, true);
            TableUtils.dropTable(connectionSource, Persoon.class, true);
            TableUtils.dropTable(connectionSource, Garage.class, true);
            TableUtils.dropTable(connectionSource, Verhuurd.class, true);
            onCreate(db, connectionSource);
        } catch (SQLException e) {
            Log.e(DatabaseHelper.class.getName(), "Can't drop databases", e);
            throw new RuntimeException(e);
        }
    }
}

