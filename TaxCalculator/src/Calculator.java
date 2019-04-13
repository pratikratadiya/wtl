

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		double income = Double.parseDouble(request.getParameter("inc"));
		String name = request.getParameter("name");
		double tax = 0;
        if(income<=250000)
        {
            tax=0;
        }
        else if(income>250000 && income<=500000)
        {
            tax=income*0.10;
        }
        else
        {
            tax=income*0.20;
        }
        out.println("Name: "+name+"<br>");
        out.println("Gross Income: "+income+"<br>");
        out.println("Tax: "+tax+"<br>");
        out.println("Net Income: "+(income-tax)+"</body></html>");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
