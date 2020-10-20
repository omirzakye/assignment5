<%@ page import="astanait.edu.kz.Shop" %>
<%@ page import="astanait.edu.kz.Cart" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="astanait.edu.kz.Device" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<center>
    <h1>CONFIRMATION PAGE</h1>
    <%
        HttpSession session1 = request.getSession();
        //<a href="smartphones.jsp">Main</a>
        out.println("<form method=\"post\" action=\"addtocart\"><h3><input type=\"submit\" value=\"Main\"></h3></form>");
        out.println("<h2> Session ID: </h2>" + session1.getId() + "<br>");
        out.println("<h2> Creation of time of the Session: </h2>" + new Date(session1.getCreationTime()) + "<br>");
        out.println("<h2> Last access time of the Session: </h2>" + new Date(session1.getLastAccessedTime()) + "<br>");
        out.println("<h2> Maximum inactive interval time: </h2>" + session1.getMaxInactiveInterval() + "<br>");
        out.println("<h2> Username is: </h2>" + session1.getAttribute("uname") + "<br>");
        out.println("<h2> Email address is: </h2>" + session1.getAttribute("email") + "<br>");
        out.println("<h2> You have bought: </h2>");
        Cart c = (Cart) session1.getAttribute("cart");
        out.print(c.showDevices());
    %>
</center>
<%@include file="footer.jsp"%>