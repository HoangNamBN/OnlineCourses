<%@page import="Models.ClsTaiKhoan" %>
<%@page import="Data.QLTaiKhoan" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Demo mảng động</title>
</head>
<body>
<h1>Quản lý tài khoản</h1>
<table width="400" border="1" align="center">
    <tr>
        <th>Số tài khoản:</th>
        <th>Số dư:</th>
        <th>Tiền lãi:</th>
    </tr>

    <%
        QLTaiKhoan qltk = new QLTaiKhoan();
        qltk.getData();
        out.println("<h3> Lãi suất: " + ClsTaiKhoan.getLaiSuat() + "</h3>");
        for (ClsTaiKhoan tk : qltk.getList2TK()) {
    %>
    <tr>
        <td><%=tk.getSoTK()%>
        </td>
        <td><%=tk.getSoDu()%>
        </td>
        <td><%=tk.getSoDu() * ClsTaiKhoan.getLaiSuat()%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
