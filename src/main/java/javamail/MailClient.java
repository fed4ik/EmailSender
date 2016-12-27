package javamail;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;

/**
 * Servlet implementation class MailClient
 */
@WebServlet("/MailClient")
public class MailClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MailClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	UserDAO usersDAO = new UserDAO();
	List<String> emailList = usersDAO.getAllEmail();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		
		 out.println("<!DOCTYPE html>");
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<meta charset=\"UTF-8\">");
		out.println("<ttle>WelcomeSenderMail</title>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<h1>Welcome on this site!!! You can send mail to friends that registered on this resource</h1>");
		 out.println("<form action=\"action_page.php\">");
		 out.println("<select name=\"emailAdress\">");
		
		UserDAO usersDAO = new UserDAO();
		List<String> emailList = usersDAO.getAllEmail();
		 for (int i = 0; i < emailList.size(); i++) {
			String st = "<option value=" + emailList.get(i) + ">" + emailList.get(i) + "</option>";
			out.println(st);
		 }

		 out.println("</select>");
		 out.println("<br>");
		 out.println("Subject: <input type=\"text\" name=\"subject\"><br>");
		out.println("<textarea name=\"message\" rows=\"10\" cols=\"30\">The cat was playing in the garden.</textarea>");
		 out.println("<br>");
		 out.println("Your email:<br>");
		 out.println("<input type=\"text\" name=\"login\"><br>");
		 out.println("Login:<br>");
		 out.println("<input type=\"text\" name=\"emailAdres\"><br>");
		 out.println("Password:<br>");
		 out.println("<input type=\"password\" name=\"password\"><br>");
		 out.println("<br>");
		 out.println("<input type=\"submit\" value = \"send mail\">");
		 out.println("</form>");
		 out.println("</body>");
		 out.println("</html>");

	}

	public void doSome() {
		UserDAO usersDAO = new UserDAO();
		List<String> emailList = usersDAO.getAllEmail();
		for (int i = 0; i < emailList.size(); i++) {
			System.out.println(emailList.get(i));
		}
	}

}
