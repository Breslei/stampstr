<%-- 
    Document   : cadPesquisa
    Created on : 13/10/2017, 19:49:24
    Author     : Max
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
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
              <h1>Pesquisa de Cadastros</h1>
          </div>
      </div>
      
        <section align="center" class="container" style="width: 65%; height: 80%; margin-left: 32.5%" >
             
             <div style="padding-top: 5%;padding-bottom: 10%">
                 
   <form method="post" action="Pesquisa">             
      
       <div class="form-inline" style="padding-top: 1%; padding-right: 50%" align="center" >
        <label class="mr-sm-2" for="inlineFormCustomSelect">Pesquisar por:</label>
         <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12" style="padding-left: 5%;padding-right: 6.5% " name="modoPesquisa">
           <option selected >Escolher...</option>
            <option value="Pacientes">Pacientes</option>
           <option value="Dispositivo">Dispositivo</option>
        </select>
      </div> 
       
       <div class="form-group row"  style="padding-top:1%; padding-right: 50%" align="center" >
        <label for="example-date-input" class="col-2 col-form-label"><h3>Pesquisar</h3></label>
         <div class="col-12">
             <input name="campoNome" class="form-control" type="text" placeholder="Pesquisar cadastro aqui..." >
        </div>
      </div>
                 
       <div  style="padding-top: 0.5%; padding-left: 10%">
           <button type="submit" class="btn col-sm-4" style="border-color: black" name="btnPesquisa">Pesquisar </button>
      </div>
      
        <div  style="padding-top: 15%;padding-right: 50%">
           <a href="index.jsp"><button type="button" class="col-sm-4, btn btn-secondary" style="padding-left: 10%; padding-right: 10%;background-color: blue; color: white">voltar </button></a>
        </div>
      
           </div>
         </section>
    </form>
      
      

    <!-- jQuery first, then Tether, then Bootstrap JS. -->
    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
  </body>
</html>
