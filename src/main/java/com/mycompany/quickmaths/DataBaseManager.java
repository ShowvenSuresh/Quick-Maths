
package com.mycompany.quickmaths;
import java.sql.*;

public class DataBaseManager {
    private String userName= "root";
    private String password= "admin";
    private String url = "jdbc:mysql://localhost:3306/mathsranking";
    public static Connection connectDB = null;
    
    public Connection dbConnect(){
        if (connectDB==null){
            try {
                connectDB= DriverManager.getConnection(url, userName, password);
                if (connectDB!=null){
                    System.out.println("Database connected");
                }
            }catch (SQLException e){
                e.printStackTrace();
                System.out.println("Error connecting to  database please try again");
            }
        }
        return connectDB;
    }
    
    public void closeConnect(){
        if (connectDB!= null){
            try{
                connectDB.close();
                if(connectDB==null){
                    System.out.println("Database Connection closed");
                }
            }catch (SQLException e){
                e.printStackTrace();
                
            }
        }
    }
    
    
    
}
