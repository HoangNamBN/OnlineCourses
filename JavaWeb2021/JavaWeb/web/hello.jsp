<%-- 
    Document   : Home
    Created on : Nov 23, 2021, 9:30:30 PM
    Author     : Nam10
--%>

<%@page import="JavaCore.JavaBuoi1.SinhVien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hiển thị thông tin sinh viên</h1>
        <%
            SinhVien sv = new SinhVien("SV01", "Nguyễn Văn Nam", 20);
            out.println("<p> Mã sinh viên: " + sv.idsv + "</p>");
            out.println("<p> Tên sinh viên: " + sv.name + "</p>");
            out.println("<p> Tuổi sinh viên: " + sv.age + "</p>");
            String id = "18810310435";
            String hoten = "Hà Qúy Đức";
            int tuoi = 20;
        %>

        <!--cách 2:--> 
        <p>Mã sinh viên: <%=id%></p>
        <p>Tên sinh viên: <%=hoten%></p>
        <p>Tuổi sinh viên: <%=tuoi%></p>
    </body>
</html>
