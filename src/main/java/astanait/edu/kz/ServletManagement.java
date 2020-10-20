package astanait.edu.kz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletManagement")
public class ServletManagement extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("username");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");

        HttpSession session = request.getSession(true);
        session.setAttribute("uname", uname);
        session.setAttribute("email", email);
        session.setAttribute("pass", pass);
        session.setMaxInactiveInterval(60);
        try{
            if(session.isNew()){
                Cart c = new Cart();
                session.setAttribute("cart",c);
            }else{
                Cart c = (Cart) session.getAttribute("cart");
                c.clear();
                session.setAttribute("cart",c);
            }
        } finally {
            request.getRequestDispatcher("/smartphones.jsp").forward(request, response);
            out.close();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
