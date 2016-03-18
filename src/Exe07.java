import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe07")
public class Exe07 extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exercício - 07</title>");
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
		out.println("				<h1>EXERCÍCIO - 07</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Criar um programa que leia um vetor de 10 elementos inteiros. Apresente na tela apenas os números PARES.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\" align='center'>");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<form method='post' action = 'Exe07' >");
		out.println("       			<div class=\"col-md-6\">");
		for (int i = 0; i < 5; i++){
		out.println(					"Digite o " + (i + 1) + "º Numero: ");
		out.println("    				<div><input type=\"number\" class=\"form-control\" name=\"vetor[]\"></div>");
	    }
		out.println("					</div>");
		out.println("       			<div class=\"col-md-6\">");
		for (int i = 5; i < 10; i++){
		out.println(					"Digite o " + (i + 1) + "º Numero: ");
		out.println("    				<div><input type=\"number\" class=\"form-control\" name=\"vetor[]\"></div>");
	    }
		out.println("					</div>");
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
		
		Scanner sc = new Scanner(System.in);
		
		String vet[] = request.getParameterValues("vetor[]");
		int i, par = 0;
		
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exercício - 07</title>");
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
		out.println("				<h1>EXERCÍCIO - 07</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Criar um programa que leia um vetor de 10 elementos inteiros. Apresente na tela apenas os números PARES.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\" align='center'>");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<div class=\"jumbotron\">");
		
		for (i = 0; i < vet.length; i++){
			
	    	if (Integer.parseInt(vet[i]) % 2 == 0){
	
	    		out.println(" - " + vet[i]);
	            par++;
	        }
	    }
		out.println("					<p>Um total de " + par + " números pares.</p>");
		out.println("				</div>");
		out.println("					<a href='Exe07'><input type='button' class=\"btn btn\" name='Voltar' value='Voltar'></a>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();
		
		
	}
}
