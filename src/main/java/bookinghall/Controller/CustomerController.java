package bookinghall.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mybaju.dao.OrdersDAO;
import mybaju.model.Orders;

import java.io.IOException;

import dao.CustomerDAO;

/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Integer Integer = null;
	private String action="", forward="";
	private static String LIST ="staffListCustomer.jsp";
	private static String VIEW ="staffViewCustomer.jsp";
	private CustomerDAO dao;
	private int custID;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        dao = new CustomerDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		action = request.getParameter("action");

		//Complete action for view order
		if(action.equalsIgnoreCase("view")) {
			forward = VIEW;
			int orderId = Integer.parseInt(request.getParameter("custID"));
			request.setAttribute("customer", CustomerDAO.getCustomer(custID));
			RequestDispatcher view = request.getRequestDispatcher("staffViewCustomer.jsp");
			view.forward(request, response);
			
		}
		
		//Complete action for list order
		if(action.equalsIgnoreCase("list")) {
			forward = LIST;
			request.setAttribute("customers", CustomerDAO.getCustomer());
			RequestDispatcher view = request.getRequestDispatcher("staffListCustomer.jsp");
			view.forward(request, response);

			
		}

		//Complete action for delete order
		if(action.equalsIgnoreCase("delete")) {
			forward = LIST;
			int custID = Integer.parseInt(request.getParameter("custID"));
			dao.deleteCustomer(custID);
			request.setAttribute("customers", CustomerDAO.getCustomer());
			RequestDispatcher view = request.getRequestDispatcher("staffListCustomer.jsp");
			view.forward(request, response);   

			
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//invoke method addOrder() in CustomerDAO
		Customers c = new Customers);
		c.setCustID(Integer.parseInt(request.getParameter(("custID"))));
		c.setCustIC((Integer.parseInt(request.getParameter("custIC"))));
		c.setCustName((String.parseString(request.getParameter("custName"))));
		c.setCustTelNum((Integer.parseInt(request.getParameter("custTelNum"))));
		c.setCustHomeNo((Integer.parseInt(request.getParameter("custHomeNo"))));
		c.setCustCity((Integer.parseInt(request.getParameter("custCity"))));
		c.setCustPostcode((Integer.parseInt(request.getParameter("custPostcode"))));
		c.setCustState((Integer.parseInt(request.getParameter("custState"))));
		c.setCustPass((Integer.parseInt(request.getParameter("custPass"))));
	
		
		dao.staffAddCustomer(c); //invoke method addShawl() in ShawlDAO
		
		request.setAttribute("customer", CustomerDAO.getCustomer());
		RequestDispatcher view = request.getRequestDispatcher("staffListCustomer.jsp");
		view.forward(request, response);
		
		//forward the request to listOrder.jsp
		forward = LIST;

	}
}