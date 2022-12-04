
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page session="true" %>

<%@page import="Modelo.Usuario"%>
<%@page import="java.lang.String"%>
<%@page import="Modelo.UsuarioDAO"%>



  <%
                HttpSession  sesion =request.getSession();
        


   
    if(sesion.getAttribute("cargo")==null){
        
       response.sendRedirect("login.jsp");
        
       
    }else{
        
        String cargo=sesion.getAttribute("cargo").toString();
        
        if(!cargo.equals("1")){
            
           response.sendRedirect("login.jsp");
        
    }
        
        
        
        
}
                
                

                
                %>
                



<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title></title>
    <%@include file="includes/RecursoCss.jsp" %>
  </head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <%@include file="includes/Header.jsp" %>
     <%@include file="includes/Navegacion.jsp" %>
      
    <%
    
UsuarioDAO  dao= new UsuarioDAO();
 
int id=Integer.parseInt((String)request.getAttribute("idper"));


Usuario p= dao.enviar(id);

    
    
    %>



    <form action="ControladorUsuario">



  <div class="content-wrapper">
   
 


      <!-- SELECT2 EXAMPLE -->
      <div class="box box-default">
        <div class="box-header with-border">
          <h3 class="box-title"></h3>

          
        </div>
        <!-- /.box-header -->
        <div class="box-body">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
            
              <!-- dividir ventana -->
            
               <div class="form-group">
                  <label for="exampleInputEmail1">Codigo</label>
           <input type="text" class="form-control"  placeholder="Ingrese Usuario"   name="txtcodigo" value="<%= p.getId() %>">
           

                         
                </div>
           
             
                 <div class="form-group">
                  <label for="exampleInputEmail1">Usuario</label>
           <input type="text" class="form-control"  placeholder="Ingrese Usuario"   name="txtusuario" value="<%= p.getUsuario() %>">
           

                         
                </div>



                 <div class="form-group">
                  <label for="exampleInputEmail1">Contraseña</label>
                  <input type="text" class="form-control"  placeholder="Ingrese Contraseña"  name="txtcontraseña" value="<%= p.getContra()%>">
                </div>








              </div>
              <!-- /.form-group -->
            </div>






            <!-- /.col -->
            <div class="col-md-6">


              <!-- /.form-group -->
              <div class="form-group">
                <div class="form-group">
            
              <!-- dividir ventana -->
            
             
              
              
              
                 <div class="form-group">
                  <label for="exampleInputEmail1">Cargo</label>
                 <input type="text" class="form-control"  placeholder="Ingrese N° Cargo "  name="txtcargo" value="<%= p.getCargo()%>">
                </div>
              
              
              
                  
                  <div class="form-group">
            
              <!-- dividir ventana -->
            
                
              



              
              <!-- /.form group -->

            
 </div>




              </div>
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>

<div class="box-footer">

              

 <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 



 
<a href="ControladorUsuario?accion=listar"  class="btn btn-warning">Listado  </a>  


              </div>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>





















        <!-- /.box-body -->
       
      <!-- /.box -->

   
            
          
            </div>
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col (right) -->
      </div>
      <!-- /.row -->

    </section>
    <!-- /.content -->
  </div>

</form>

</div><%@include file="includes/RecursoJs.jsp" %>
</body>
</html>
