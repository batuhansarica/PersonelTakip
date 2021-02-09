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

    <form  action = "login" method="post">
        <table>
            <tbody>
                <tr>
                  
                    <td>Email : </td>
                    <td><input type ="text" name ="email" value = "" size = "50"/></td>
                </tr>

                <tr>
                    <td>Id : </td>
                    <td><input type ="password" name ="id" value = "" size = "50"/></td>
                </tr>

                    <td id="button">
                    <input type ="reset"  value = "Temizle"  name = "clear"/> 
                    <input type ="submit" value = "Giris" name = "clear"/>
                    <br>${message}
                    </td>
            </tbody>
        </table>
        
            
    
          
       
    </form> 
</body>
</html>
