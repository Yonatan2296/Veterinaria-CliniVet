

<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>



<%@page import="Modelo.Mascota"%>
<%@page import="Modelo.MascotaDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>






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

  <!-- formularioss -->




    <%
    
 MascotaDAO  dao= new MascotaDAO();
 
int id=Integer.parseInt((String)request.getAttribute("idper"));


Mascota p= dao.enviar(id);

    
    
    %>






  <form action="ControladorMascota">



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
                  <input type="text" class="form-control"  placeholder="Ingrese Codigo"   name="txtcodigo" value="<%= p.getIdmascota()%>">
                </div>
                
                
                
                 <div class="form-group">
                  <label for="exampleInputEmail1">Mascota</label>
                  <input type="text"   class="form-control"  placeholder="Ingrese Nombre" name="txtnombres" value="<%= p.getNombre()%>">
                </div>



                 <div class="form-group">
                  <label for="exampleInputEmail1">Especie</label>
                  <input type="text"   class="form-control"  placeholder="Ingrese Especie" name="txtespecie" value="<%= p.getEspecie()%>">
                </div>



 <div class="form-group">
                  <label for="exampleInputEmail1">Fecha Nacimiento</label>
                  <input type="text"   class="form-control"  placeholder="Ingrese Fecha Nacimiento" name="txtfecha" value="<%= p.getFecha()%>">
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
                  <label for="exampleInputEmail1">Peso</label>
                  <input type="text"   class="form-control"  placeholder="Ingrese Peso" name="txtpeso" value="<%= p.getPeso()%>">
                </div>

                
                
                 <div class="form-group">
                  <label>Tipo Raza</label>
                
                  
                    
             <jsp:useBean id="cnn" class="Modelo.MascotaDAO"> </jsp:useBean>
           
           <%
               ResultSet rss= cnn.mostrartipo_raza();
     %>
      <select class="form-control" id="cboraza" name="cboraza" autofocus=""  required="">
         
        
         <%
             while(rss.next()){
                 
                 %>
                 <option value="<%=rss.getString("cod_raza") %>"><%=rss.getString("nombre")%> </option>
                 <%
             }
%>
         </select>

                  
                 
                 
                 
                 
                 </div>
                  
            <div class="form-group">
                  <label for="exampleInputEmail1">Sexo</label>
                  <input type="text"   class="form-control"  placeholder="Ingrese Sexo" name="txtsexo" value="<%= p.getSexo()%>">
                </div>

         
         
                  <div class="form-group">
            
              <!-- dividir ventana -->
            
             
                <label>Cliente</label>
                
                  
                    
                             
          <jsp:useBean id="cn" class="Modelo.MascotaDAO"> </jsp:useBean>
           
           <%
                  
    
               ResultSet rs= cn.mostrarcliente();
     %>
      <select class="form-control" id="cbocliente" name="cbocliente" autofocus=""  required="">
         
      
         <%
             while(rs.next()){
                 
                 %>
                 <option value="<%=rs.getString("cod_cliente") %>"><%=rs.getString("nombres")%> </option>
                 <%
             }
%>
         </select>




              
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
           
  
<a href="ControladorMascota?accion=listar" class="btn btn-warning" >Listado</a>


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
