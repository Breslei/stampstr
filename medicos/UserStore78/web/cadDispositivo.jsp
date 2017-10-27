<%-- 
    Document   : cadDispositivo
    Created on : 15/10/2017, 22:52:54
    Author     : max
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
  </head>
  <body>
           
      <div class="container,row" align="center" style="padding-top:2.5%">
          <div class="col-sm-4" >
              <h1>Cadastro de Dispositivo</h1>
          </div>
      </div>
     
          <section class="container-fluid col-sm-6" style="width: 100%; height: 100%; margin-left: 25%" >
             
             <div style="padding-top: 5%;padding-bottom: 15%">
             
    <form method="post" action="CadastroDispositivoServlet"> <!--action é o servlet -->
      <div class="form-group row" style="padding-top:2.5%" align="center" >
        <label for="example-text-input" class="col-sm-1 col-form-label">IP</label>
        <div class="col-12">
          <input class="form-control" type="text" placeholder="IP do Dispositivo" name="ip">
        </div>
      </div>
      
       <div class="form-group row" style="padding-top:2.5%" align="center" >
        <label for="example-text-input" class="col-sm-1 col-form-label">Nome</label>
        <div class="col-12">
          <input class="form-control" type="text" placeholder="Nome do Dispositivo"  name="nome">
        </div>
      </div>
                 
       <div class="form-group row" style="padding-top:2.5%" align="center" >
        <label for="example-text-input" class="col-sm-1 col-form-label">Modelo</label>
        <div class="col-12">
          <input class="form-control" type="text" placeholder="Modelo do Dispositivo"  name="modelo">
        </div>
      </div>
                 
       <div class="form-group row" style="padding-top:2.5%" align="center" >
        <label for="example-text-input" class="col-sm-1 col-form-label">Marca</label>
        <div class="col-12">
          <input class="form-control" type="text" placeholder="Marca do Dispositivo" name="marca">
        </div>
      </div>
     
         
        <div  style="padding-top: 5%">
         <button type="submit" class="btn col-sm-6" style="border-color: black"  name="cadastrar">Enviar Avaliação</button>
        </div>
                 
        <div style="padding-top: 10%;padding-right: 50%;padding-bottom:15%; margin-left: -25% ">
         <a href="cadPac.jsp"><button type="button" class="col-sm-4, btn btn-secondary" style="padding-left: 10%; padding-right: 10%;background-color: blue; color: white">voltar </button></a>
        </div>
           
     </form>
    </body>
</html>
