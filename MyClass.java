package myproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyClass")
public class MyClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public MyClass() {
    	System.out.println("checkinggggg");
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String review_by_user = request.getParameter("review");
		String rating = request.getParameter("rate");
		
		System.out.println(review_by_user);
		System.out.println(rating);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Thank you for your Review as:"+review_by_user+"</h1>");
		out.println("<h1>Thank you for Rating us "+rating+"</h1>");
		out.println("</html></body>");
		
	}
	
    
    /*public void doGet(HttpServletRequest req, 
            HttpServletResponse resp)
throws ServletException, IOException 
{
 resp.setContentType("text/html");
 PrintWriter out = resp.getWriter();
 out.println("output");
}*/

}
