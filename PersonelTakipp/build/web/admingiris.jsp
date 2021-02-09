<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Personel Takip Sistemi</title>
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
       
        
    }
    
    a{
        font-size:30px;
        
        margin-top:10px;
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
    
</style>

<body>
<h1>Personel Takip Sistemi</h1>

    <form  action = "login" method="get" >
        <table>
            <tbody>
                <tr>
                  
                <td> Kullanici Adi : </td>
                    <td ><input type ="text" name ="kadi" value = "" size = "30"/></td>
                </tr>

                <tr>
                    <td>Password : </td>
                    <td><input type ="password" name ="password" value = "" size = "30"/></td>
                </tr>

                <td id="button">
                     <input type ="reset"  value = "Temizle"  name = "clear"/> 
                     <input type ="submit" value = "Giris" name = "clear"/>
                </td>
            </tbody>
        </table>
        
        
          <br>${message}
        
    </form> 
</body>
</html>
