package Servicer;
import java.sql.*;  
import java.util.ArrayList;
import java.util.List;

public class servicerDAO {
	
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	} 
	
	public static int save(servicer se){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"insert into servicer(servicerName,servicerTelNo,servicerHomeNo,servicerAddress,servicerCity,servicerPostcode,servicerState) values(?,?,?,?,?,?,?)"); 
	        ps.setString(1,se.getServicerName());
	        ps.setInt(2,se.getServicerTelNo());
	        ps.setInt(3,se.getServicerHomeNo());
	        ps.setString(4,se.getServicerAddress());
	        ps.setString(5,se.getServicerCity());
	        ps.setInt(6,se.getServicerPostcode());
	        ps.setString(7,se.getServicerState()); 
  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}
	
	public static int update(servicer se){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"update servicer set servicerName=?,servicerTelNo=?,servicerHomeNo=?,servicerAddress=?,servicerCity=?,servicerPostcode=?,servicerState=? where servicerID=?");  
	        ps.setString(1,se.getServicerName());
	        ps.setInt(2,se.getServicerTelNo());
	        ps.setInt(3,se.getServicerHomeNo());
	        ps.setString(4,se.getServicerAddress());
	        ps.setString(5,se.getServicerCity());
	        ps.setInt(6,se.getServicerPostcode());
	        ps.setString(7,se.getServicerState());
	        ps.setInt(8,se.getServicerID());
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}
	
	public static List<servicer> getAllRecords(){  
	    List<servicer> list=new ArrayList<servicer>();  
	      
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from servicer");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	        	servicer se=new servicer();  
	        	se.setServicerID(rs.getInt("servicerID"));
	        	se.setServicerName(rs.getString("servicerName"));
	            se.setServicerTelNo(rs.getInt("servicerTelNo"));
	            se.setServicerHomeNo(rs.getInt("servicerHomeNo"));
	            se.setServicerAddress(rs.getString("servicerAddress"));
	            se.setServicerCity(rs.getString("servicerCity"));
	            se.setServicerPostcode(rs.getInt("servicerPostcode"));
	            se.setServicerState(rs.getString("servicerState"));   
	            list.add(se);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}
	
	public static servicer getRecordById(int servicerID){  
		servicer se=null;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from servicer where servicerID=?");  
	        ps.setInt(1,servicerID);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            se=new servicer();   
	            se.setServicerID(rs.getInt("servicerID"));
	        	se.setServicerName(rs.getString("servicerName"));
	            se.setServicerTelNo(rs.getInt("servicerTelNo"));
	            se.setServicerHomeNo(rs.getInt("servicerHomeNo"));
	            se.setServicerAddress(rs.getString("servicerAddress"));
	            se.setServicerCity(rs.getString("servicerCity"));
	            se.setServicerPostcode(rs.getInt("servicerPostcode"));
	            se.setServicerState(rs.getString("servicerState"));   
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return se;  
	}

}
