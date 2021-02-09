<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<style>
    body{
        background-color: aquamarine;
    }
    table{
        background-color: #9acce3;
        width: 70%;
        height: 100px;
        margin-left : 200px;
        margin-top : 100px;
    }
    p{
        font-family: "Times New Roman", Times, serif;
        font-size:25px;
        margin-right : 50px;
    }
    input{
        font-size: 20px;
    }
     h1{
        text-align: center;
        font-family: "Times New Roman", Times, serif;
        font-size:50px;
    }
    a{
        text-align: center;
        font-family: "Times New Roman", Times, serif;
        font-size:30px;
    }
    a{
        text-decoration: none;
        color:black;
    }
    
    th{
        font-size:30px;
    }
    td{
        font-size:30px;
    }
</style>
<body>
<div class="container">
    <table border="1">
        <tr>
            <td>
    <a href="logout">Cikis Yap</a>
    
    <br>
    <td>
    <a href="<%=request.getContextPath()%>/list">Personelleri Listele</a>
    </td>
    <br>
    <td>
    <a href="<%=request.getContextPath()%>/new" class="btn btn-success">Personel Ekle</a>
    </td>
    <br>
    <td>
    <a href="/adminyemek.jsp" class="btn btn-success">Yemek Listesi</a>
    </td>
    </tr>
    </table>
    <div class="row">
    <table class="table table-bordered" border="1">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>isim</th>
                                <th>Email</th>
                                <th>telefon</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            <c:forEach var="user" items="${listUser}">

                                <tr>
                                    <td>
                                        <c:out value="${user.id}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.isim}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.email}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.telefon}" />
                                    </td>
                                    <td><a href="edit?id=<c:out value='${user.id}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=<c:out value='${user.id}' />">Delete</a></td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                           </div>     
</div>
</body>
</html>

