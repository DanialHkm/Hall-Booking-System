	package booking;
	import java.sql.*;  
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;  
	
	public class bookingDao {  
	  
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	}  
	public static int save(booking b){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"insert into bookinghall(bookingDate,bookingTime,bookingDescription,bookingEstimateCapacity,bookingPrice,staffID,custID) values(?,?,?,?,?,?,?)");  
	        java.util.Date utilDate = b.getBookingDate();
	        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	        ps.setDate(1, sqlDate);
	        ps.setTime(2,b.getBookingTime());  
	        ps.setString(3,b.getBookingDescription());  
	        ps.setInt(4,b.getBookingEstimateCapacity());  
	        ps.setFloat(5,b.getBookingPrice());  
	        ps.setInt(6,b.getStaffID());  
	        ps.setFloat(7,b.getCustID());
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}  
	public static int update(booking b){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"update bookinghall set bookingDate=?,bookingTime=?,bookingDescription=?,bookingEstimateCapacity=?,bookingPrice=?,staffID=?,custID=? where bookingID=?");  
	        java.util.Date utilDate = b.getBookingDate();
	        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	        ps.setDate(1, sqlDate);         
	        ps.setTime(2,b.getBookingTime());  
	        ps.setString(3,b.getBookingDescription()); 
	        ps.setInt(4,b.getBookingEstimateCapacity()); 
	        ps.setFloat(5,b.getBookingPrice());  
	        ps.setInt(6,b.getStaffID());  
	        ps.setInt(7,b.getCustID()); 
	        ps.setInt(8,b.getBookingID());
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}  
	
	public static int delete(booking b){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("delete from bookinghall where bookingID=?");  
	        ps.setInt(1,b.getBookingID());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	  
	    return status;  
	}  
	public static List<booking> getAllRecords(){  
	    List<booking> list=new ArrayList<booking>();  
	      
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from bookinghall");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	        	booking b=new booking();  
	        	b.setBookingID(rs.getInt("bookingID"));
	            b.setBookingDate(rs.getDate("bookingDate"));  
	            b.setBookingTime(rs.getTime("bookingTime"));  
	            b.setBookingDescription(rs.getString("bookingDescription"));  
	            b.setBookingEstimateCapacity(rs.getInt("bookingEstimateCapacity")); 
	            b.setBookingPrice(rs.getFloat("bookingPrice"));  
	            b.setStaffID(rs.getInt("staffID"));  
	            b.setCustID(rs.getInt("custID")); 
	            list.add(b);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}  
	public static booking getRecordById(int bookingID){  
		booking b=null;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from bookinghall where bookingID=?");  
	        ps.setInt(1,bookingID);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            b=new booking();   
	            b.setBookingID(rs.getInt("bookingID"));
	            b.setBookingDate(rs.getDate("bookingDate"));  
	            b.setBookingTime(rs.getTime("bookingTime"));  
	            b.setBookingDescription(rs.getString("bookingDescription"));  
	            b.setBookingEstimateCapacity(rs.getInt("bookingEstimateCapacity")); 
	            b.setBookingPrice(rs.getFloat("bookingPrice"));  
	            b.setStaffID(rs.getInt("staffID"));  
	            b.setCustID(rs.getInt("custID")); 
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return b;  
	}  
	}  