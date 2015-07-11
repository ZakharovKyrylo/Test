package Lection;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class L006 {


    public static void main(String[] args) {
        ExceptinCaller exceptinCaller = new ExceptinCaller();
        try {
            exceptinCaller.test();
        } catch (Exception e) {
            System.out.println(" me ");
        }
    }
}

// обработать сразу

//class exceptinCaller {
//
//    void test() throws SQLException {
//        try {
//            throw new SQLException("text exception");
//
//        } catch (RuntimeException | SQLClientInfoException e){
//            e.printStackTrace();
//        }
//        finally {
//            {
//                System.out.println("finaly");
//            }
//        }
//    }
//}

//выпустить

class  ExceptinCaller {
    void  test() throws  Exception{
        throw  new Exception("test exception");
    }
}