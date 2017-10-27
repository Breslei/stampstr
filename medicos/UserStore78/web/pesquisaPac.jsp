<%-- 
    Document   : pesquisaPac
    Created on : 17/10/2017, 17:01:15
    Author     : max
--%>


<%@page import="pojo.TbPaciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
HttpSession sessao=request.getSession();
  TbPaciente pacientePersistido = (TbPaciente)session.getAttribute("Pacientes");
%>
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
              <h1>Pesquisa de Cadastros de Pacientes</h1>
          </div>
      </div>
      
        <section align="center" class="container" style="width: 65%; height: 80%; margin-left: 32.5%" >
             
             <div style="padding-top: 5%;padding-bottom: 10%">
                 
   <form method="post" action="Pesquisa">     
    <body>
        
    <table border="1">
        <td>ID</td>
        <% pacientePersistido.getPacId();%>
        <td>Nome</td>
        <% pacientePersistido.getPacNome();%>
        <td>Sexo</td>
        <% pacientePersistido.getPacSexo();%>
        <td>Data de Nascimento</td>
        <% pacientePersistido.getPacDataNasc();%>
        <td>Estado Civil</td>
        <% pacientePersistido.getPacEstadoCivil();%>
        <td>Endereço</td>
        <% pacientePersistido.getPacEndereco();%>
        <td>Bairro</td>
        <% pacientePersistido.getPacBairro();%>
        <td>Cidade</td>
        <% pacientePersistido.getPacCidade();%>
        <td>Telefone Residêncial</td>
        <% pacientePersistido.getPacTelefoneResidencial();%>
        <td>Celular</td>
        <% pacientePersistido.getPacTelefoneCelular();%>
        <td>Email</td>
        <% pacientePersistido.getPacEmail();%>
        <td>Médico Responsável</td>
        <% pacientePersistido.getPacMedicoResponsavel();%>
        <td>Encaminhamento Médico</td>
        <% pacientePersistido.getPacEncaminhamentoMedico();%>
        <td>Plano de Saúde</td>
        <% pacientePersistido.getPacPlanoSaude();%>
        <td>Triado Por</td>
        <% pacientePersistido.getPacTriadoPor();%>
        <td>Data da Triagem</td>
        <% pacientePersistido.getPacDataTriagem();%>
    </table>        

    <!-- jQuery first, then Tether, then Bootstrap JS. -->
    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
  </body>
</html>
