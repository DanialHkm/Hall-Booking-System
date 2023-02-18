package Staff;
import java.sql.*;  
import java.util.ArrayList;
import java.util.List;

public class staffDAO {
	
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	} 	
	public static int save(staff s){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"insert into staff(staffName,staffEmail,staffHomeNo,staffAddress,staffCity,staffPostcode,staffState,staffPass,staffTelNum,adminID) values(?,?,?,?,?,?,?,?,?,?)"); 
	        ps.setString(1,s.getStaffName());
	        ps.setString(2,s.getStaffEmail());
	        ps.setInt(3,s.getStaffHomeNo());
	        ps.setString(4,s.getStaffAddress());
	        ps.setString(5,s.getStaffCity());
	        ps.setInt(6,s.getStaffPostcode());
	        ps.setString(7,s.getStaffState());
	        ps.setString(8,s.getStaffPass());  
	        ps.setInt(9,s.getStaffTelNum());  
	        ps.setInt(10,s.getAdminID());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}
	public static int update(staff s){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"update staff set staffName=?,staffEmail=?,staffHomeNo=?,staffAddress=?,staffCity=?,staffPostcode=?,staffState=?,staffPass=?,staffTelNum=?,adminID=? where staffID=?");  
	        ps.setString(1,s.getStaffName());
	        ps.setString(2,s.getStaffEmail());
	        ps.setInt(3,s.getStaffHomeNo());
	        ps.setString(4,s.getStaffAddress());
	        ps.setString(5,s.getStaffCity());
	        ps.setInt(6,s.getStaffPostcode());
	        ps.setString(7,s.getStaffState());
	        ps.setString(8,s.getStaffPass());  
	        ps.setInt(9,s.getStaffTelNum());  
	        ps.setInt(10,s.getAdminID());
	        ps.setInt(11,s.getStaffID());
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}
	public static int delete(staff s){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("delete from staff where staffID=?");  
	        ps.setInt(1,s.getStaffID());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	  
	    return status;  
	} 
	public static List<staff> getAllRecords(){  
	    List<staff> list=new ArrayList<staff>();  
	      
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from staff");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	        	staff s=new staff();  
	        	s.setStaffID(rs.getInt("staffID"));
	        	s.setStaffName(rs.getString("staffName"));
	            s.setStaffEmail(rs.getString("staffEmail"));
	            s.setStaffHomeNo(rs.getInt("staffHomeNo"));
	            s.setStaffAddress(rs.getString("staffAddress"));
	            s.setStaffCity(rs.getString("staffCity"));
	            s.setStaffPostcode(rs.getInt("staffPostcode"));
	            s.setStaffState(rs.getString("staffState"));
	            s.setStaffPass(rs.getString("staffPass")); 
	            s.setStaffTelNum(rs.getInt("staffTelNum"));
	            s.setAdminID(rs.getInt("adminID"));   
	            list.add(s);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}
	public static staff getRecordById(int staffID){  
		staff s=null;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from staff where staffID=?");  
	        ps.setInt(1,staffID);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            s=new staff();   
	            s.setStaffID(rs.getInt("staffID"));
	        	s.setStaffName(rs.getString("staffName"));
	            s.setStaffEmail(rs.getString("staffEmail"));
	            s.setStaffHomeNo(rs.getInt("staffHomeNo"));
	            s.setStaffAddress(rs.getString("staffAddress"));
	            s.setStaffCity(rs.getString("staffCity"));
	            s.setStaffPostcode(rs.getInt("staffPostcode"));
	            s.setStaffState(rs.getString("staffState"));
	            s.setStaffPass(rs.getString("staffPass")); 
	            s.setStaffTelNum(rs.getInt("staffTelNum"));
	            s.setAdminID(rs.getInt("adminID"));   
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return s;  
	}

}
