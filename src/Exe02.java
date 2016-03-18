import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe02")
public class Exe02 extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exercício - 02</title>");
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
		out.println("				<h1>EXERCÍCIO - 02</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Dizemos que um inteiro positivo N é perfeito se for igual à soma de seus divisores positivos diferentes de N, por exemplo: 6 é perfeito, pois 1 + 2 + 3 = 6. Criar um programa que dado um inteiro positivo N, verificar se N é perfeito.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<form method='post' action = 'Exe02' >");
		out.println("					<div class=\"form-group\">");
		out.println("						<label for=\"n\">Digite um número inteiro positivo</label>");
		out.println("    					<input type=\"number\" class=\"form-control\" name=\"n\">");
		out.println("  					</div>");		
		out.println("  						<button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
		out.println("						<a href='Home'><input type='button' class=\"btn btn\" name='VoltaHome' value='Voltar'></a>");
		out.println("				</form>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String n = request.getParameter("n");
		int a = Integer.parseInt(n);
		int b = 0;

		for(int i = a - 1; i > 0; i--) {
			if(a % i == 0)
				b = b + i;
		}
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exercício - 02</title>");
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
		out.println("				<h1>EXERCÍCIO - 02</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Dizemos que um inteiro positivo N é perfeito se for igual à soma de seus divisores positivos diferentes de N, por exemplo: 6 é perfeito, pois 1 + 2 + 3 = 6. Criar um programa que dado um inteiro positivo N, verificar se N é perfeito.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<div class=\"jumbotron\">");
		
		if(a == b) {
		out.println("					<p>Número é perfeito!</p>");
		}
		else {
		out.println("					<p>Número NÃO é perfeito!</p>");
		}
		
		out.println("				</div>");
		out.println("					<a href='Exe02'><input type='button' class=\"btn btn\" name='Voltar' value='Voltar'></a>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
		
	}

}
