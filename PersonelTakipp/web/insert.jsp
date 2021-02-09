<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>Personel Takip Sistemi</title>
          
        </head>
        <style>
            body{
                 background-color: aquamarine;
                }

            label{
                    font-size:20px;
                }
                p{
                    text-align:center;
                    font-size:35px;
                    font-family: "Times New Roman", Times, serif;
                    
                }
                .form-group{
                    margin-left: 30px;
                    margin-top: 50px;
                    margin-right: 30px;
                    background-color: darkturquoise;
                }
                b{
                    text-align:center;
                    font-size:20px;
                    widht:20px;
                }
                a{
                    font-size:30px;
                    text-decoration: none;
                    color:white;
                    text-align: center;
                }
                #bat{text-align: center}
        </style>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="https://www.javaguides.net" class="navbar-brand" id="bat"> Personel Takip Sistemi </a>
                    </div>

                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Personel Listesi</a></li>
                    </ul>
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                        <c:if test="${user != null}">
                            <form action="update" method="post">
                        </c:if>
                        <c:if test="${user == null}">
                            <form action="insert" method="post">
                        </c:if>

                        <caption>
                            <h2>
                                <c:if test="${user != null}">
                                    Personel Duzenle
                                </c:if>
                                <c:if test="${user == null}">
                                    Personel Ekle
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${user != null}">
                            <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
                        </c:if>

                        <fieldset class="form-group">
                            <label>Personel isim</label> <input type="text" value="<c:out value='${user.isim}' />" class="form-control" name="isim" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Personel Email</label> <input type="text" value="<c:out value='${user.email}' />" class="form-control" name="email">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Persone Telefon</label> <input type="text" value="<c:out value='${user.telefon}' />" class="form-control" name="telefon">
                        </fieldset>

                        <button type="submit" class="btn btn-success">Kaydet</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>
