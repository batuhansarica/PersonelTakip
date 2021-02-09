<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>Personel Takip Sistemi</title>
          
        </head><style>
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
                        <a href="https://www.javaguides.net" class="navbar-brand"> Personel Takip Sistemi </a>
                    </div>

                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/listyemek1" class="nav-link">Yemek Listesi</a></li>
                    </ul>
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                        <c:if test="${yemek != null}">
                            <form action="updateyemek" method="post">
                        </c:if>
                        <c:if test="${yemek == null}">
                            <form action="insertyemek" method="post">
                        </c:if>

                        <caption>
                            <h2>
                                <c:if test="${yemek != null}">
                                    Personel Duzenle
                                </c:if>
                                <c:if test="${yemek == null}">
                                    Personel Ekle
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${yemek != null}">
                            <input type="hidden" name="gun" value="<c:out value='${yemek.gun}' />" />
                        </c:if>

                        <fieldset class="form-group">
                            <label>Corba</label> <input type="text" value="<c:out value='${yemek.corba}' />" class="form-control" name="corba" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Ana Yemek</label> <input type="text" value="<c:out value='${yemek.anayemek}' />" class="form-control" name="anayemek">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Ana Yemek 2</label> <input type="text" value="<c:out value='${yemek.anayemek2}' />" class="form-control" name="anayemek2">
                        </fieldset>

                        <button type="submit" class="btn btn-success">Kaydet</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>
