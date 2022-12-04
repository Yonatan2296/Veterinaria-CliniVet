



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
                  <label for="exampleInputEmail1">Usuario</label>
           <input type="text" class="form-control"  placeholder="Ingrese Usuario"   name="txtusuario">
                </div>



                 <div class="form-group">
                  <label for="exampleInputEmail1">Contraseña</label>
                     <input type="text" class="form-control"  placeholder="Ingrese Contraseña"  name="txtcontraseña"> 
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
                 <input type="text" class="form-control"  placeholder="Ingrese N° Cargo "  name="txtcargo"> 
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

              

               
  <input class="btn btn-success"  type="submit" name="accion" value="Guardar"> 



 
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


<%@include file="includes/RecursoJs.jsp" %>
</body>
</html>
