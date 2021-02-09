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
        margin-right: 10px;
        margin-left: 0px;
        margin-top:10px;
        height : 300px;
        width:1350px;
        padding: 20px;
        font-family: Ubuntu-Regular;
        font-size:14px;
        transition:all 0.4s;
        background-color:  #9acce3;
       
        
    }
    
    a{
        font-size:30px;
        
        margin-top:0px;
        font-family: Ubuntu-Regular;
        
        
    }
    td{
        font-size:30px;
        text-align:center;
        
        
    }
    
    h1{
        text-align: center;
    }
   
   input{font-size:20px;}
    
   th {
    font-size:30px;   
   }
</style>
<body>
<div class="container">
    <a href="logout">Cikis Yap</a>
    
    <a href="<%=request.getContextPath()%>/listyemek1" class="btn btn-success">Yemek Listesi</a>
    <br>
    <div class="row">
    <table border ="1">
                        <thead>
                            <tr>
                                <th>Gun</th>
                                <th>Corba</th>
                                <th>Ana Yemek</th>
                                <th>Ana Yemek2</th>
                                <th>Guncelle</th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            <c:forEach var="yemek" items="${listYemek1}">

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
                                    <td><a href="/edityemek?gun=<c:out value='${yemek.gun}' />">Edit</a>  </td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                           </div>     
</div>
</body>
</html>

