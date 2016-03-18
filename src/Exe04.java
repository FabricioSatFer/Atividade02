import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exe04")
public class Exe04 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exercício - 04</title>");
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
		out.println("				<h1>EXERCÍCIO - 04</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>A importância de 780.000,00 será dividida entre os três primeiros colocados de um concurso, em partes diretamente proporcionais aos pontos conseguidos por eles. Construa um programa que solicite o número de pontos dos três primeiros colocados e imprima a importância que caberá a cada um.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<form method='post' action = 'Exe04' >");
		out.println("					<div>");
		out.println("						<label for=\"ano\">Digite a pontuação do primeiro colocado:</label>");
		out.println("    					<input type=\"number\" class=\"form-control\" name=\"primeiro\">");
		out.println("					</div>");
		out.println("					<div>");
		out.println("						<label for=\"ano\">Digite a pontuação do segundo colocado:</label>");
		out.println("    					<input type=\"number\" class=\"form-control\" name=\"segundo\">");
		out.println("					</div>");
		out.println("					<div>");
		out.println("						<label for=\"ano\">Digite a pontuação do terceiro colocado:</label>");
		out.println("    					<input type=\"number\" class=\"form-control\" name=\"terceiro\">");
		out.println("					</div>");
		out.println("					<div>");
		out.println("  						<button type=\"submit\" class=\"btn btn-primary\">Calcular</button>");
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

	
	double valor = 780.000;
	double pontos,soma,total;
	
	
	double primeiro = Double.parseDouble(request.getParameter("primeiro"));
	double segundo = Double.parseDouble(request.getParameter("segundo"));
	double terceiro =Double.parseDouble(request.getParameter("terceiro"));
	
	pontos = primeiro + segundo + terceiro;
	soma = valor/pontos;

	primeiro =  soma * primeiro;
	segundo = soma * segundo;
	terceiro = soma * terceiro;
	
	total = primeiro + segundo + terceiro;
	
	DecimalFormat formato = new DecimalFormat("#.##");      
	double p = Double.valueOf(formato.format(primeiro));
	double s = Double.valueOf(formato.format(segundo));
	double t = Double.valueOf(formato.format(terceiro));
	double tot = Double.valueOf(formato.format(total));
	
	
	PrintWriter out = response.getWriter();
	Scanner sc = new Scanner (System.in);
	
	out.println("<!DOCTYPE html>");
	out.println("<html lang=\"pt-br\">");
	out.println("<head>");
	out.println("<title>Exercício - 04</title>");
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
	out.println("				<h1>EXERCÍCIO - 04</h1>");
	out.println("			</div>");
	out.println("       	<div class=\"col-md-12\">");
	out.println("				<p>A importância de 780.000,00 será dividida entre os três primeiros colocados de um concurso, em partes diretamente proporcionais aos pontos conseguidos por eles. Construa um programa que solicite o número de pontos dos três primeiros colocados e imprima a importância que caberá a cada um.</p>");
	out.println("			</div>");
	out.println("		</div>");
	out.println("	</div>");
	

	
	out.println("	<div class=\"container\" align='center'>");
	out.println("   	<div class=\"row clearfix c\">");
	out.println("       	<div class=\"col-md-12\">");
	out.println("    			<div class=\"jumbotron\">");
	out.println("					<p>Valor Para Cada Concorrente</p> ");
	out.println("					<br><p>Primeiro Colocado</p> R$ " + p);
	out.println("					<br>___________________________________________</br>");
	out.println("					<br><p>Segundo Colocado</p> R$ " + s);
	out.println("					<br>___________________________________________</br>");
	out.println("					<br><p>tercerio Colocado</p> R$ " + t);
	out.println("					<br>___________________________________________</br>");
	out.println("					<br><p>total</p> R$ " + tot);
	out.println("					<br>___________________________________________</br>");
	out.println("				</div>");
	out.println("				<div>");
	out.println("					<a href='Exe04'><input type='button' class=\"btn btn\" name='Voltar' value='Voltar'></a>");
	out.println("				</div>");
	out.println("			</div>");
	out.println("		</div>");
	out.println("	</div>");
	out.println("</body>");
	out.println("</html>");
	
	out.close();
	
	}

	
	
}
