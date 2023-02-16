package dao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.*;
import connection.ConnectionManager;
import model.*;
import model.Customer;
/**
 * Servlet implementation class CustomerDAO
 */
public class CustomerDAO {
	
	public class OrdersDAO {
		private static Connection con = null;
		private static PreparedStatement ps = null;
		private static Statement stmt = null;
		private static ResultSet rs = null;
		private static String sql;
		private static Customer Customer;
		private int custID;
		private int custIC,custTelNum,custPostcode;
		private String custName,custHomeNo,custCity,custState,custEmail,custPass;

		//Complete getCustomer() method
		public static Customer getCustomer(int custID) { 
			Customer cust = new Customer();
			try {
				//call getConnection() method
				con = ConnectionManager.getConnection();
				
				//create statement 
				ps = con.prepareStatement("SELECT * FROM customer WHERE custID=?");
				ps.setInt(1, custID);

				//execute query
				rs = ps.executeQuery();
				if(rs.next()) {		//process result
					cust.setCustID(rs.getInt("custID"));
					cust.setCustIC(rs.getInt("custIC"));
					cust.setCustName(rs.getString("custName"));
					cust.setCustTelNum(rs.getInt("custTelNum"));
					cust.setCustHomeNo(rs.getString("custHomeNo"));
					cust.setCustCity(rs.getString("custCity"));
					cust.setCustPostcode(rs.getInt("custPostcode"));	
					cust.setCustState(rs.getString("custState"));
					cust.setCustPass(rs.getString("custPass"));
				}

				//close connection
				con.close();
				

			} catch (Exception e) {
				e.printStackTrace();
			}
			return Customer; 
		}
			

		//Complete staffAddCustomer() method
		public void staffAddCustomer(Customer bean) {
			
			//get values
			custID = bean.getCustID();
			custIC  = bean.getCustIC();
			custName = bean.getCustName();
			custTelNum = bean.getCustTelNum();
			custHomeNo = bean.getCustHomeNo();
			custCity = bean.getCustCity();
			custPostcode = bean.getCustPostcode();
			custState  = bean.getCustState();
			custPass  = bean.getCustPass();
			

			try {			
				//call getConnection() method
				con = ConnectionManager.getConnection();

				//create statement
				ps = con.prepareStatement("INSERT INTO customer(custID,custIC,custName,custTelNum,custHomeNo,custCity,custPostcode,custState,custPass)VALUES(?,?,?,?,?,?,?,?,?)");
				ps.setInt(1, custID);
				ps.setInt(2, custIC);
				ps.setString(3, custName);
				ps.setInt(4, custTelNum);
				ps.setString(5, custHomeNo);
				ps.setString(6, custCity);
				ps.setFloat(7, custPostcode);
				ps.setString(8, custState);
				ps.setString(9, custPass);

				//execute query
				ps.executeUpdate();
				System.out.println("Successfully inserted");

				//close connection
				con.close();

			}catch(Exception e) {
				e.printStackTrace();				
			}
		}	

		//Complete deleteCustomer() method
		public void deleteCustomer(int custID) {
			try {
				//call getConnection() method
				con = ConnectionManager.getConnection();

				//create statement
				ps = con.prepareStatement("DELETE FROM customer WHERE custID=?");
				ps.setInt(1, custID);

				//execute query
				ps.executeUpdate();
				System.out.println("Successfully inserted");

				//close connection
				con.close();

			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		//Complete getCustomer() method
		public static List<Customer> getCustomerList() { 
			List<Customer> orders = new ArrayList<Customer>(); 
			try { 
				//call getConnection() method
				con = ConnectionManager.getConnection();

				//create statement
				stmt = con.createStatement();
				String sql = "SELECT * FROM customer ORDER BY custID";
				
				//execute query
				rs = stmt.executeQuery(sql);
				while(rs.next()) {		//process result
					Customer c = new Customer();
					c.setCustID(rs.getInt("custID"));
					c.setCustPass(rs.getString("custIC"));
					c.setCustName(rs.getString("custName"));
					c.setCustTelNum(rs.getInt("custTelNum"));
					c.setCustHomeNo(rs.getString("custHomeNo"));
					c.setCustCity(rs.getString("custCity"));
					c.setCustPostcode(rs.getInt("custPostcode"));
					c.setCustState(rs.getString("custState"));
					c.setCustPass(rs.getString("custPass"));
	
					Customer.add(c);
					
				}


				//close connection
				con.close();

			} catch (Exception e) { 
				e.printStackTrace(); 
			}

			return orders; 
		
		}
	}

	public static Object getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCustomer(int custID) {
		// TODO Auto-generated method stub
		
	}}
	
				

				 
				