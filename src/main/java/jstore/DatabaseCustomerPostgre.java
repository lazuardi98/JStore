package jstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static jstore.DatabaseConnection.connection;

public class DatabaseCustomerPostgre
{
    public int getLastCustomerId(){
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        try {
            String sql = "SELECT id from customer;";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt(1);
            }
            stmt.close();
            c.close();
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public static Customer insertCustomer(String name, String email, String username, String password,
                                          int year, int month, int dayOfMonth){
        Connection c = connection();
        PreparedStatement stmt;
        Customer customer = null;
        try {
            String sql = "INSERT INTO customer (name, email, username, password, year, month, dayofmonth)" +
                    "values (?,?,?,?,?,?,?) RETURNING id;";
            stmt = c.prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setString(2,email);
            stmt.setString(3,username);
            stmt.setString(4,password);
            stmt.setInt(5,year);
            stmt.setInt(6,month);
            stmt.setInt(7,dayOfMonth);
            ResultSet rs = stmt.executeQuery();
            int id = 1;
            while(rs.next()){
                id = rs.getInt(1);
            }
            customer = new Customer(name, email, username, password, year, month, dayOfMonth);
            stmt.close();
            c.close();
            return customer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customer;
    }

    public static Customer getCustomer(int customerId){
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        String name = null;
        String email = null;
        String username = null;
        String password = null;
        int year = 0;
        int month = 0;
        int dayofmonth = 0;
        Customer customer = null;
        try {
            String sql = "SELECT * from customer where id=?;";
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                username = rs.getString("username");
                password = rs.getString("password");
                year = rs.getInt("year");
                month = rs.getInt("month");
                dayofmonth = rs.getInt("dayofmonth");
            }
            stmt.close();
            c.close();
            customer = new Customer(name, email, username, password, year, month, dayofmonth);
            return customer;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public static Customer getCustomer(String customerEmail, String customerPassword){
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        String name = null;
        String email = null;
        String username = null;
        String password = null;
        int year = 0;
        int month = 0;
        int dayofmonth = 0;
        Customer customer = null;
        try {
            String sql = "SELECT id, name, email, username, password, year, month, dayofmonth" +
                    "from customer where email=? and password=?;";
            stmt = c.prepareStatement(sql);
            stmt.setString(1, customerEmail);
            stmt.setString(2, customerPassword);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                username = rs.getString("username");
                password = rs.getString("password");
                year = rs.getInt("year");
                month = rs.getInt("month");
                dayofmonth = rs.getInt("dayofmonth");
            }
            stmt.close();
            c.close();
            customer = new Customer(name, email, username, password, year, month, dayofmonth);
            return customer;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public void removeCustomer(int id){
        Connection c = connection();
        PreparedStatement stmt;
        try {
            String sql = "DELETE FROM customer where id = 1;";
            stmt = c.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
