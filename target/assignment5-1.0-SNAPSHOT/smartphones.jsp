<%@ page import="astanait.edu.kz.Cart" %>
<%@ page import="astanait.edu.kz.Shop" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="astanait.edu.kz.Smartphone" %>
<%@ page import="astanait.edu.kz.Device" %>
<%@ page import="java.util.Date" %>
<%@include file="header.jsp"%>
    <form method="get" action="addtocart">
        <div class="listt">
            <%
                Shop sh = new Shop();
                ArrayList<Device> sm = sh.getDevices();
                for(int i = 0; i < sm.size(); i++){
                    out.println(
                            "<h3>Id: " + sm.get(i).getId() + ", Model: " + sm.get(i).getModel() + ", Price: " + sm.get(i).getPrice() + "<a href=addtocart?id=" + sm.get(i).getId() + ">Add to Cart</a></h3>"
                            );
                }
            %>
        </div>
    </form>
    <form method="post" action="confirmation.jsp">
        <input type="submit" value="Buy"><br><br>
    </form>
    <%
        HttpSession session1 = request.getSession();
        /*out.println("<b> Session ID: </b>" + session1.getId() + "<br>");
        out.println("<b> Creation of time of the Session: </b>" + new Date(session1.getCreationTime()) + "<br>");
        out.println("<b> Last access time of the Session: </b>" + new Date(session1.getLastAccessedTime()) + "<br>");
        out.println("<b> Maximum inactive interval time: </b>" + session1.getMaxInactiveInterval() + "<br>");*/
        //out.println(session1.getAttribute("cart"));
        /*out.println(session1.getAttribute("uname"));
        out.println(session1.getAttribute("email"));
        out.println(session1.getAttribute("pass"));*/
        Cart c = (Cart) session1.getAttribute("cart");
        out.print("Here are the devices in your cart");
        out.print(c.showDevices());
    %>
<%@include file="footer.jsp"%>
