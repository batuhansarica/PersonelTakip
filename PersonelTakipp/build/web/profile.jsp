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
        text-decoration: none;
        color:black;
        background-color: #9acce3;
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
    <a href="logout">Cikis Yap</a>
    
    <a href="<%=request.getContextPath()%>/listyemek" class="btn btn-success">Yemek Listesi</a>
    <br>
    <div class="row">
    <table class="table table-bordered" border="1">
                        <thead>
                            <tr>
                                <th>Gun</th>
                                <th>Corba</th>
                                <th>Ana Yemek</th>
                                <th>Ana Yemek2</th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            <c:forEach var="yemek" items="${listYemek}">

                                <tr>
                                    <td>
                                        <c:out value="${yemek.gun}" />
                                    </td>
                                    <td>
                                        <c:out value="${yemek.corba}" />
                                    </td>
                                    <td>
                                        <c:out value="${yemek.anayemek}" />
                                    </td>
                                    <td>
                                        <c:out value="${yemek.anayemek2}" />
                                    </td>
                                    
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                           </div>     
</div>
</body>
</html>

