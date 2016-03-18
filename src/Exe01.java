import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe01")
public class Exe01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exercício - 01</title>");
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
		
		out.println("<script src=\"http://code.jquery.com/jquery-2.2.1.min.js\" integrity=\"sha256-gvQgAFzTH6trSrAWoH1iPo9Xc96QxSZ3feW6kem+O00=\" crossorigin=\"anonymous\"></script>");
		out.println("<script type=\"text/javascript\">");
		
		//Bloco Jquery
		out.println("$(document).ready(function() {");
		out.println("	    var max_fields      = 10;");
		out.println("	    var x = 1;");
		out.println("	    $(\".addInput\").click(function(e){");
		out.println("	        e.preventDefault();");
		out.println("	        if(x < max_fields){");
		out.println("	            x++;");
		out.println("	            $(\".multiple-input\").append('<div><input type=\"number\" class=\"form-control\" name=\"n[]\"/><a href=\"#\" class=\"remove_field\">Remove</a></div>');");
		out.println("	        }");
		out.println("	    });");
		out.println("	    ");
		out.println("	    $(\".multiple-input\").on(\"click\",\".remove_field\", function(e){");
		out.println("	        e.preventDefault(); $(this).parent('div').remove(); ");
		out.println("	        x--;");
		out.println("	    })");
		out.println("	})");
		
		out.println("</script>");
		
		out.println("<body>");
		
		out.println("	<div class=\"container\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<h1>EXERCÍCIO - 01</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Utilizando vetor, faça um programa em Java que leia um conjunto de números. Exiba este conjunto acompanhado do seu elemento simétrico em relação a sua posição no conjunto.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\" align=\"center\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<form method=\"POST\">");
		out.println("					<div class=\"multiple-input\">");
		out.println("    					<button type=\"button\" class=\"addInput btn btn-success\">Adicionar mais um campo</button>");
		out.println("    					<div><input type=\"number\" class=\"form-control\" name=\"n[]\"></div>");
		out.println("					</div>");
		out.println("						<button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
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

		String numero[] = request.getParameterValues("n[]");
		int a = numero.length;
		int j = numero.length - 1;
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exercício - 01</title>");
		out.println("  <meta charset=\"ISO-8859-1\">");
		out.println("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" charset=\"ISO-8859-1\">");
		out.println("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("  <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\">");
		out.println("</head>");
		out.println("<body>");
		
		out.println("  <style type=\"text/css\">");
		out.println("	div {");
		out.println("		padding-top: 5px;");
		out.println("		padding-bottom: 5px;");
		out.println("	}");
		out.println("  </style>");
		
		out.println("	<div class=\"container\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<h1>EXERCÍCIO - 01</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Utilizando vetor, faça um programa em Java que leia um conjunto de números. Exiba este conjunto acompanhado do seu elemento simétrico em relação a sua posição no conjunto.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\" align=\"center\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		
		out.println("				<div class=\"jumbotron\">");
		for(int i = 0; i < a; i++) {
			
		out.println("					<div>");
		out.println(						numero[i] + " - " + numero[j]);
		out.println("					</div>");
		j--;
		
		} 
		
		out.println("				</div>");
		out.println("					<a href='Exe01'><input type='button' class=\"btn btn\" name='Voltar' value='Voltar'></a>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();
	}

}
