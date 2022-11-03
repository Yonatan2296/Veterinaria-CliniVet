



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">


<meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">




	






	<br>
<br><br><br><br><br><br><br><br><br><br><br><br><br>




<style>
*{
margin: 0;
padding: 0;
font-family: sans-serif;
box-sizing: border-box;


}

body{

background: #DEDEDE;
display: flex;
min-height: 100vh;


}

form {

	margin: auto;
	width: 50%;
	max-width: 400px;
  background: #2ECCFA;
  padding: 30px;
  border: 1px solid rgba(0,0,0,0.2)


}

h3 {

	text-align: center;
	margin-bottom: 10px;
	color: rgba(0,0,0,0.5);

}

input {


	display: block;
	padding: 70px;
	width: 100%;
	margin: 90px 0;
	font-size: 20px;
}






</style>



<!DOCTYPE html>

<%@page session="true" %>

<html>

<head>


<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-theme.min.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</head>
<body>

	<body>


            <%
                HttpSession  sesion =request.getSession();
       int cargo=0 ;         

              
if(request.getAttribute("cargo")!=null){
    
    
    cargo=(Integer)request.getAttribute("cargo");
   
    if(cargo==1){
        
        sesion.setAttribute("usu",request.getAttribute("usu"));
        sesion.setAttribute("cargo", cargo);
        
        
        response.sendRedirect("Web_Menu_Principal.jsp");
        
    }
}
          

         



if(request.getAttribute("cargo")!=null){
    
    
    cargo=(Integer)request.getAttribute("cargo");
   
    if(cargo==2){
        
        sesion.setAttribute("usu",request.getAttribute("usu"));
        sesion.setAttribute("cargo", cargo);
        
        
        response.sendRedirect("Menu_Tecnico.jsp");
        
    }
}

                if(request.getParameter("cerrar")!=null) {
                    
                    
                    session.invalidate();
                }

                
                %>



		<form action="ControladorUsuario" method="POST">


<h3> Accede a tu cuenta &#128272 </h3>

<input value="Administrador" type="text" placeholder="&#128272; Usuario"   class="form-control" name="txtusuario">
			<br>
                        <input value="123" type="password" placeholder="&#128272;  Contraseña" class="form-control"   name="txtcontra">

			<br>

                       <input  type="submit" class="btn btn-primary"  name="btnIngresar"  value="Ingresar"> 
			
			
			</form>
		</body>
		</html>
			



