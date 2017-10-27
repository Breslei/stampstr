<%-- 
    Document   : cadTraumas
    Created on : 13/10/2017, 19:50:18
    Author     : Max
--%>

<%@page import="pojo.TbTrauma"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    <link rel="stylesheet" href="../src/java/css/bootstrap.min.css" type="text/css"/>
    <link rel="stylesheet" href="../src/java/css/bootstrap.css" type="text/css">

  </head>
  <body>
    
        <section style="padding-right: 50%" align="center" >  
     <div class="container,row" align="center" style="padding-top:2.5%">
          <div class="col-4" >
              <h1>Traumas</h1>
     </div>
            
         <form action="CadastroServlet" method="post">
         <section class="container" style="width: 100%; height: 100%; margin-left: 50%" >
             
             <div style="padding-top: 5%;padding-bottom: 15%">
             
             <!--as variaveis que estão dentro do nome são as abreviaçoes dos nomes da label-->
             <div class="form-inline" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Veículo Motorizado</label>
                <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12" style="padding-left: 5%; padding-right: 6.5% " name="vm"><!--para que o servlet reconheça o valor o 
                                                                                                                                 name tem q vir nesta linha do select-->
                  <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>

             <div class="form-inline" style="padding-top:2%" align="center">
                <label class="mr-sm-2" for="inlineFormCustomSelect">Força de Desaceleração</label>
                <select name="forca" class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12" style="padding-left: 5%; padding-right: 6.5%">
                    <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>
              
            <div class="form-group row" style="padding-top:2%" align="center">
                <label for="example-text-input" class="col-2 col-form-label">Descrição</label>
             <div class="col-12">
                <input class="form-control" type="text" name="fddes" placeholder="Descrever aqui...">
              </div>
            </div>
           
             <div class="form-inline" style="padding-top:1%" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Perda de Consciência</label>
                <select name="pd" class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12" style="padding-left: 5%; padding-right: 6.5%">
                  <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>

            <div class="form-group row" style="padding-top:2%" align="center" >
              <label for="example-text-input" class="col-2 col-form-label">Descrição</label>
             <div class="col-12">
               <input class="form-control" type="text" name="pddes" placeholder="Descrever aqui...">
             </div>
            </div>
             
             
             <div class="form-inline" style="padding-top:1%" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Ejeção Veicular</label>
                <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12" style="padding-left: 5%; padding-right: 6.5%" name="ej">
                  <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>
             
              <div class="form-inline" style="padding-top:2%" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Negação violenta das óbvias injúrias graves, pensamentos de fuga
                    e alteração do</label>
                  <label style="padding-bottom:2%"> discurso, respostas inapropriadas</label>
                <select name="neg" class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12" style="padding-left: 5%; padding-right: 6.5%">
                  <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>

            <div class="form-group row" style="padding-top:2%" align="center" >
              <label for="example-text-input" class="col-2 col-form-label">Descrição</label>
             <div class="col-12">
               <input class="form-control" type="text" name="negdes" placeholder="Descrever aqui...">
             </div>
            </div>
             
             <div class="form-inline" style="padding-top:2%" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Fraturas da 1ª costela</label>
                <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12"  style="padding-left: 5%; padding-right: 6.5%" name="f1c" >
                  <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>

                <div class="form-group row" style="padding-top:2%" align="center" >
                    <label for="example-text-input" class="col-2 col-form-label">Descrição</label>
                    <div class="col-12">
                      <input class="form-control" type="text" name="f1cdes" placeholder="Descrever aqui...">
                    </div>
                 </div>
             
             
              <div class="form-inline" style="padding-top:1%" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Fraturas da 2ª costela</label>
                <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12"  style="padding-left: 5%; padding-right: 6.5%" name="f2c">
                  <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>

                <div class="form-group row" style="padding-top:2%" align="center" >
                    <label for="example-text-input" class="col-2 col-form-label">Descrição</label>
                    <div class="col-12" >
                      <input class="form-control" type="text" name="f2cdes" placeholder="Descrever aqui...">
                    </div>
                 </div>
             
             
             <div class="form-inline" style="padding-top:1%" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Fraturas da 9ª, 10ª e 11ª costela ou mais de 3 costelas</label>
                <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12"  style="padding-left: 5%"  name="fc">
                  <option selected>escolher...</option>
                  <option value="9">9ª</option>
                  <option value="10">10ª</option>
                  <option value="11">11ª</option>
                  <option value="mais de 3 costelas">mais de 3 costelas</option>
                </select>
             </div>

              <div class="form-group row" style="padding-top:2%" align="center" >
                <label for="example-text-input" class="col-2 col-form-label">Descrição</label>
                 <div class="col-12">
                   <input class="form-control" type="text"  name="fcdes" placeholder="Descrever aqui quais foram...">
                </div>
              </div>
         
              <div class="form-inline" style="padding-top:1%" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Possível aspiração</label>
                <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12"  style="padding-left: 5%; padding-right: 6.5%"  name="asp">
                  <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>

                <div class="form-group row" style="padding-top:2%" align="center" >
                    <label for="example-text-input" class="col-2 col-form-label">Descrição</label>
                    <div class="col-12">
                      <input class="form-control" type="text"  name="aspdes" placeholder="Descrever aqui...">
                    </div>
                 </div>
             
             
              <div class="form-inline" style="padding-top:1%" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Possível contusão pulmonar</label>
                <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12"  style="padding-left: 5%; padding-right: 6.5%" name="contpulm">
                  <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>
             
             
              <div class="form-inline" style="padding-top:1%" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Acidentes com óbito no local</label>
                <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12"  style="padding-left: 5%; padding-right: 6.5%" name="aol">
                  <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>          
             
            
            <div class="form-inline" style="padding-top:1%" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Acidente com motociclista</label>
                <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12"  style="padding-left: 5%; padding-right: 6.5%" name="acm">
                  <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>

                <div class="form-group row" style="padding-top:2%" align="center" >
                    <label for="example-text-input" class="col-2 col-form-label"  style=" padding-right: 6.5%">Descrição</label>
                    <div class="col-12">
                      <input class="form-control" type="text"  name="acmdes" placeholder="Descrever aqui...">
                    </div>
                 </div> 
                 
              
              <div class="form-inline" style="padding-top:1%" align="center" >
                <label class="mr-sm-2" for="inlineFormCustomSelect">Atropelamento de pedestre ou ciclista</label>
                <select class="custom-select mb-2 mr-sm-2 mb-sm-0 col-12"  style="padding-left: 5%; padding-right: 6.5%"  name="apc">
                  <option selected>escolher...</option>
                  <option value="Sim">Sim</option>
                  <option value="Nao">Não</option>
                </select>
             </div>

                 <div  style="padding-top: 5%">
                     <button type="submit" class="btn col-sm-6" style="border-color: black" name="cadastrar">Enviar Avaliação</button>
                 </div>
                 
                <div style="padding-top: 10%;padding-right: 50%;padding-bottom:15%; margin-left: -25% ">
                      <a href="cadPac.jsp"><button type="button" class="col-sm-4, btn btn-secondary" style="padding-left: 10%; padding-right: 10%;background-color: blue; color: white">voltar </button></a>
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
