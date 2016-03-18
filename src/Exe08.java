import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe08")
public class Exe08 extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exercício - 08</title>");
		out.println("  <meta charset=\"ISO-8859-1\">");
		out.println("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" charset=\"ISO-8859-1\">");
		out.println("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("  <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\">");
		out.println("</head>");
		
		out.println("  <style type=\"text/css\">");
		out.println("	div {");
		out.println("		padding-top: 5px;");
		out.println("		padding-bottom: 5px;");
		out.println("	}");
		out.println("  </style>");
		
		
		out.println("<body>");
		out.println("	<div class=\"container\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<h1>EXERCÍCIO - 08</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Um vendedor necessita de um algoritmo que calcule o preço total devido por um cliente. O algoritmo deve receber o código de um produto e a quantidade comprada e calcular o preço total, usando a tabela abaixo:</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\" align='center'>");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("       		<table class='table'>");
		out.println("       			<thead>");
		out.println("       				<tr>");
		out.println("       					<th>Código do Produto</th>");
		out.println("       					<th>Preço Unitário</th>");
		out.println("						</tr>");
		out.println("       			</thead>");
		out.println("       			<tbody>");
		out.println("       				<tr>");
		out.println("       					<td>1001</td>");
		out.println("       					<td>R$ 5,32</td>");
		out.println("						</tr>");
		out.println("       				<tr>");
		out.println("       					<td>1324</td>");
		out.println("       					<td>R$ 6,45</td>");
		out.println("						</tr>");
		out.println("       				<tr>");
		out.println("       					<td>6548</td>");
		out.println("       					<td>R$ 2,37</td>");
		out.println("						</tr>");
		out.println("       				<tr>");
		out.println("       					<td>0987</td>");
		out.println("       					<td>R$ 5,32</td>");
		out.println("						</tr>");
		out.println("       				<tr>");
		out.println("       					<td>7623</td>");
		out.println("       					<td>R$ 6,45</td>");
		out.println("						</tr>");
		out.println("       			</tbody>");
		out.println("       		</table>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\" align='center'>");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<form method='post' action = 'Exe08' >");
		out.println("					<div class=\"form-group col-md-6\">");
		out.println("						<label for=\"n\">Digite o código do produto</label>");
		out.println("    					<input type=\"number\" class=\"form-control\" name=\"cod\">");
		out.println("  					</div>");	
		out.println("					<div class=\"form-group col-md-6\">");
		out.println("						<label for=\"n\">Digite a quantidade</label>");
		out.println("    					<input type=\"number\" class=\"form-control\" name=\"quant\">");
		out.println("  					</div>");	
		out.println("					<div class=\"form-group\">");
		out.println("  						<button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
		out.println("						<a href='Home'><input type='button' class=\"btn btn\" name='VoltaHome' value='Voltar'></a>");
		out.println("  					</div>");	
		out.println("				</form>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = response.getWriter();
		
		String prod = request.getParameter("cod");
		int quant = Integer.parseInt(request.getParameter("quant"));
		Double total ,prod1 = 5.32, prod2 = 6.45, prod3 = 2.37, prod4 = 5.32, prod5 = 6.45 ;
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exercício - 08</title>");
		out.println("  <meta charset=\"ISO-8859-1\">");
		out.println("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" charset=\"ISO-8859-1\">");
		out.println("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("  <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\">");
		out.println("</head>");
		
		out.println("  <style type=\"text/css\">");
		out.println("	div {");
		out.println("		padding-top: 5px;");
		out.println("		padding-bottom: 5px;");
		out.println("	}");
		out.println("  </style>");
		
		
		out.println("<body>");
		out.println("	<div class=\"container\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<h1>EXERCÍCIO - 08</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Um vendedor necessita de um algoritmo que calcule o preço total devido por um cliente. O algoritmo deve receber o código de um produto e a quantidade comprada e calcular o preço total, usando a tabela abaixo:</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\" align='center'>");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("       		<table class='table'>");
		out.println("       			<thead>");
		out.println("       				<tr>");
		out.println("       					<th>Código do Produto</th>");
		out.println("       					<th>Preço Unitário</th>");
		out.println("						</tr>");
		out.println("       			</thead>");
		out.println("       			<tbody>");
		out.println("       				<tr>");
		out.println("       					<td>1001</td>");
		out.println("       					<td>R$ 5,32</td>");
		out.println("						</tr>");
		out.println("       				<tr>");
		out.println("       					<td>1324</td>");
		out.println("       					<td>R$ 6,45</td>");
		out.println("						</tr>");
		out.println("       				<tr>");
		out.println("       					<td>6548</td>");
		out.println("       					<td>R$ 2,37</td>");
		out.println("						</tr>");
		out.println("       				<tr>");
		out.println("       					<td>0987</td>");
		out.println("       					<td>R$ 5,32</td>");
		out.println("						</tr>");
		out.println("       				<tr>");
		out.println("       					<td>7623</td>");
		out.println("       					<td>R$ 6,45</td>");
		out.println("						</tr>");
		out.println("       			</tbody>");
		out.println("       		</table>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\" align='center'>");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		
		switch (prod){
        	
			case ("1001"):
				
		total = prod1 * quant;
        out.println("<p>Você escolheu o código: <strong>1001</strong></p>");
        out.println("<p>Valor desse produto: R$ 5.32</p>");
        out.println("<p>" + quant + " X 5.32 </p>");
        out.println("<p>_____________________________________</p>");
        out.println("<p>O total da compra é : R$ " + total + "</p>");
            
        break;
         
        	
        	case ("1324"):
        		
        total = prod2 * quant;

        out.println("<p>Você escolheu o código: <strong>1324</strong></p>");
        out.println("<p>Valor desse produto: R$ 6.45</p>");
        out.println("<p>" + quant + " X 6.45 </p>");
        out.println("<p>_____________________________________</p>");
        out.println("<p>O total da compra é : R$ " + total + "</p>");
             
        break;

        	case ("6548"):
        		
        total = prod3 * quant;

        out.println("<p>Você escolheu o código: <strong>6548</strong></p>");
        out.println("<p>Valor desse produto: R$ 2.37</p>");
        out.println("<p>" + quant + " X 2.37 </p>");
        out.println("<p>_____________________________________</p>");
        out.println("<p>O total da compra é : R$ " + total + "</p>");
              
        break;

        	case ("0987"):
          	 
  	    total = prod4 * quant;
              
              
  	    out.println("<p>Você escolheu o código: <strong>0987</strong></p>");
        out.println("<p>Valor desse produto: R$ 5.32</p>");
        out.println("<p>" + quant + " X 5.32 </p>");
        out.println("<p>_____________________________________</p>");
        out.println("<p>O total da compra é : R$ " + total + "</p>");    
        
        break;

        	case ("7623"):
          	   
  	    total = prod5 * quant;

  	    out.println("<p>Você escolheu o código: <strong>7623</strong></p>");
        out.println("<p>Valor desse produto: R$ 6.45</p>");
        out.println("<p>" + quant + " X 6.45 </p>");
        out.println("<p>_____________________________________</p>");
        out.println("<p>O total da compra é : R$ " + total + "</p>"); 
            
        break;

            default:
  
    	out.println("<p>Este produto não existe!</p>");

        break;
		}
		out.println("				<a href='Exe08'><input type='button' class=\"btn btn\" name='Voltar' value='Voltar'></a>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
		
	}

}