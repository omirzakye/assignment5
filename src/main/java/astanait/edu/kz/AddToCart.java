package astanait.edu.kz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        //Shop sh = (Shop) req.getAttribute("shop");
        HttpSession session = req.getSession();
        Shop sh = new Shop();
        Cart cart = (Cart) session.getAttribute("cart");
        ArrayList sm = sh.getDevices();
        for(int i = 0; i < sm.size(); i++){
            if(id == sh.getDevices().get(i).getId()){
                cart.addDevice(sh.getDevices().get(i));
                break;
            }
        }
        req.getRequestDispatcher("/smartphones.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Cart c = (Cart) session.getAttribute("cart");
        c.clear();
        session.setAttribute("cart",c);
        req.getRequestDispatcher("/smartphones.jsp").forward(req, resp);
    }
}
