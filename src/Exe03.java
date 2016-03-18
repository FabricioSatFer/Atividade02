import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exe03")
public class Exe03 extends HttpServlet {
	
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exerc�cio - 03</title>");
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
		out.println("				<h1>EXERC�CIO - 03</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Fa�a um programa que solicite ao usu�rio o ano e imprima \"Ano Bissexto\" ou \"Ano N�o-Bissexto\". Um ano � bissexto se for divis�vel por 4, mas n�o por 100. Um ano tamb�m � bissexto se for divis�vel por 400.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<form method='post' action = 'Exe03' >");
		out.println("					<div>");
		out.println("						<label for=\"ano\">Digite um ano</label>");
		out.println("    					<input type=\"number\" class=\"form-control\" name=\"ano\">");
		out.println("					</div>");
		out.println("					<div>");
		out.println("  						<button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
		out.println("						<a href='Home'><input type='button' class=\"btn btn\" name='VoltaHome' value='Voltar'></a>");
		out.println("					</div>");
		out.println("				</form>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
				
		out.close();
	}

	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ano = request.getParameter("ano");
		int numbe = Integer.parseInt(ano);
		PrintWriter out = response.getWriter();
		Scanner sc = new Scanner (System.in);
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exerc�cio - 03</title>");
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
		out.println("				<h1>EXERC�CIO - 03</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Fa�a um programa que solicite ao usu�rio o ano e imprima \"Ano Bissexto\" ou \"Ano N�o-Bissexto\". Um ano � bissexto se for divis�vel por 4, mas n�o por 100. Um ano tamb�m � bissexto se for divis�vel por 400.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\" aling='center'>");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("       		<div class=\"jumbotron\">");
		
		if(numbe %4 == 0){
			
		out.println("					<p>Ano � Bissexto!</p>");
		
		}else{
			
		out.println("					<p>Ano n�o � Bissexto!</p>");
		
		}
		out.println("				</div>");
		out.println("					<a href='Exe03'><input type='button' class=\"btn btn\" name='Voltar' value='Voltar'></a>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}


}
