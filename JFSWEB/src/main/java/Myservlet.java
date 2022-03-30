

import jakarta.servlet.ServletConfig;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import controller.Productcontroller;
import model.Productdetails;
import view.myproductview;


/**
 * Servlet implementation class Myservlet
 */
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.getWriter().append("Served at: ").append(request.getContextPath());
	response.getWriter();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String productid=request.getParameter("productid");
		out.print("<marquee>"+productid+"</marquee>");
		response.sendRedirect("productReceivePage.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer .parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		float price=Float.parseFloat(request.getParameter("price"));
		int offer=Integer .parseInt(request.getParameter("offer"));
		
		
		Productdetails productdetails=new Productdetails( pid,pname, price,offer);
		 System.out.println(productdetails);
		
		 request.setAttribute("productname", pname);
		 request.getRequestDispatcher("productReceiverPage.jsp").forward(request,response);
		 
	}

	//	out.print("<marquee>"+productid+"</marquee>");
	//	response.sendRedirect("productReceivePage.jsp");
	//	String productid=request.getParameter("productid");
	//if(productid.equals("p001")) {
		//	response.sendRedirect("productReceivePage.jsp");
	//}
     
       
	//}
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("initiated");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroyed");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("serviced");
		}


}

