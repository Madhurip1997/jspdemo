package JSPdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class productController
 */
@WebServlet("/ProductController")
public class productController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String m_option=request.getParameter("option");
		System.out.println(m_option);
		String url=null;
		if(m_option.equals("Insert")) {
			url="Insertproduct.html";
		}
		
		else if(m_option.equals("Update")) {
			url="Updateproduct.html";
		}
//		else if(m_option.equals("Delete")) {
//			url="Deleteproduct.html";
	//	}
	
		 if(m_option.equals("Display")) {
			url="DisplayProduct.jsp";
			//System.out.println(url);
			//System.out.println("hello");
		}

		RequestDispatcher rd=request.getRequestDispatcher(url);
	    rd.forward(request,response);	
	}

}
