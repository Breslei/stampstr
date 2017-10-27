<%-- 
    Document   : cadPac
    Created on : 13/10/2017, 19:48:35
    Author     : Max
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
              <h1>Cadastro de Paciente</h1>
          </div>
      </div>
     
          <section class="container-fluid col-sm-6" style="width: 100%; height: 100%; margin-left: 25%" >
             
             <div style="padding-top: 5%;padding-bottom: 15%">
             
    <form action="CadastroPacServlet" method="post">
      <div class="form-group row" style="padding-top:2.5%" align="center" >
        <label for="example-text-input" class="col-sm-1 col-form-label">Nome</label>
        <div class="col-12">
          <input class="form-control" type="text" placeholder="Nome do Paciente" name="nomePac">
        </div>
      </div>
      
      
      <div class="form-inline" style="padding-top: 1%" align="center" >
        <label class="mr-sm-2" for="inlineFormCustomSelect">Sexo</label>
        <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12" id="inlineFormCustomSelect" name="sexo">
          <option selected >Sexo</option>
          <option value="Masculino">Masculino</option>
          <option value="Feminino">Feminino</option>
        </select>
      </div>
      
      
      <div class="form-group row"  style="padding-top:1%" align="center" >
          <label for="example-date-input" class="col-xs-8 col-form-label" style=" margin-left: 2.5%" >Data Nasc.</label>
        <div class="col-12">
          <input class="form-control" type="date" name="dataNasc">
        </div>
      </div>
      
     
      <div class="form-inline"  align="center" >
        <label class="mr-sm-2" for="inlineFormCustomSelect">Estado Cívil</label>
        <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-sm-12" id="inlineFormCustomSelect" name="EstadoCivil">
          <option selected value="Estado Civil">Estado Cívil</option>
          <option value="Solteiro(a)">Solteiro(a)</option>
          <option value="Casado(a)">Casado(a)</option>
          <option value="Viuvo(a)">Viúvo(a)</option>
          <option value="Divorciado(a)">Divórciado(a)</option>
          <option value="Separado(a)">Separado(a)</option>
        </select>
      </div>
      
      <div class="form-group row" style="padding-top:1%" align="center" >
        <label for="example-text-input" class="col-sm-1 col-form-label" >Endereço</label>
        <div class="col-12" >
          <input class="form-control" type="text" placeholder="Endereço do Paciente"  name="endereco">
        </div>
      </div>
      
      
      <div class="form-group row" style="padding-top:.5%" align="center" >
        <label for="example-text-input" class="col-sm-1 col-form-label" >Bairro </label>
        <div class="col-12" >
          <input class="form-control" type="text" placeholder="Bairro do Paciente" name="bairro">
        </div>
      </div>
      
      
      <div class="form-group row" style="padding-top:.5%" align="center" >
        <label for="example-text-input" class="col-sm-1 col-form-label" >Cidade </label>
        <div class="col-12" >
          <input class="form-control" type="text" placeholder="Cidade do Paciente" name="cidade">
        </div>
      </div>
      
     
      <div class="form-group row"  style="padding-top:.5%" align="center" >
          <label for="example-tel-input" class="col-xs-8 col-form-label" style="padding-left: 3%">Telefone Residencial</label>
        <div class="col-12">
          <input class="form-control" type="tel"  placeholder="(99)9999-9999" maxlength="10" name="telefone">
        </div>
      </div>
      
      
     <div class="form-group row"  style="padding-top: .50%" align="center" >
        <label for="example-tel-input" class="col-xs-8 col-form-label" style="padding-left: 3%">Celular</label>
        <div class="col-12">
          <input class="form-control" type="tel" placeholder="(99)91234-5678" maxlength="11" name="celular">
        </div>
      </div>
      
      
      <div class="form-group row" style="padding-top:.5%" align="center" >
        <label for="example-email-input" class="col-xs-8 col-form-label" style="padding-left: 3%">Email</label>
        <div class="col-12">
          <input class="form-control" type="email" placeholder="examplo@exemplo.com" name="email">
        </div>
      </div>
      
      
      <div class="form-group row" style="padding-top:1%" align="center" >
        <label for="example-text-input" class="col-xs-8 col-form-label" style="padding-left: 3%">Médico Responsável</label>
        <div class="col-12" >
          <input class="form-control" type="text" placeholder="Médico Responsável" name="medicoResp">
        </div>
      </div>
      
         
      <div class="form-group row" style="padding-top:1%" align="center" >
        <label for="example-text-input" class="col-xs-8 col-form-label" style="padding-left: 3%">Triado por</label>
        <div class="col-12">
          <input class="form-control" type="text" placeholder="Triado por..." name="triadoPor">
        </div>
      </div>
      
            
      <div class="form-group row"  style="padding-top:1%" align="center" >
          <label for="example-date-input" class="col-xs-8 col-form-label" style="padding-left: 3%">Data da Triagem</label>
        <div class="col-12">
          <input class="form-control" type="date" name="dataTriagem">
        </div>
      </div>
      
   
                 
                     
        <div style="padding-left: 15%; padding-right: 15%;padding-top: 5%;padding-bottom: 2%">   
            <button type="submit" class="btn col-sm-6" style="border-color: black"name="cadastrarPac" value="true">Traumas</button>
       </div>
       <div style="padding-top: 10%;padding-right: 50%;padding-bottom:15%; ">
           <a href="index.jsp"><button type="button" class="col-sm-4, btn btn-secondary" style="padding-left: 10%; padding-right: 10%;background-color: blue; color: white">voltar </button></a>
       </div>  
        
        </form>
       </div>
     </section>
        
    <!-- jQuery first, then Tether, then Bootstrap JS. -->
    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
  </body>
</html>
