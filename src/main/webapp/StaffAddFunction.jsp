<%@page import="Staff.staffDAO"%>  
<jsp:useBean id="s" class="Staff.staff"></jsp:useBean>  
<jsp:setProperty property="*" name="s"/>  
  
<%  
int i=staffDAO.save(s);   
response.sendRedirect("StaffView.jsp");  
%>  