import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exe05")
public class Exe05 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("	<title>Exercício - 05</title>");
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
		out.println("  <script type=\"text/javascript\">");
		
		//Bloco Jquery
		out.println("  $(document).ready(function() {");
		
		//Acrescenta campos para o Vetor 1
		out.println("	    var maxInput = 20;");
		out.println("	    var cont = 1;");
		out.println("	    $(\".addCampos1\").click(function(e){");
		out.println("	        e.preventDefault();");
		out.println("	        if(cont < maxInput){");
		out.println("	            cont++;");
		out.println("	            $(\".input_vetor1\").append('<div><input type=\"number\" class=\"form-control\" name=\"vetor1[]\"/><a href=\"#\" class=\"remove_field\">Remover</a></div>');");
		out.println("	        }");
		out.println("	    });");
		out.println("	    ");
		out.println("	    $(\".input_vetor1\").on(\"click\",\".remove_field\", function(e){");
		out.println("	        e.preventDefault(); $(this).parent('div').remove(); ");
		out.println("	        cont--;");
		out.println("	    })");
		
		//Acrescenta campos para o Vetor 2
		out.println("	    var maxInput2 = 20;");
		out.println("	    var cont2 = 1;");
		out.println("	    $(\".addCampos2\").click(function(e){");
		out.println("	        e.preventDefault();");
		out.println("	        if(cont2 < maxInput2){");
		out.println("	            cont2++;");
		out.println("	            $(\".input_vetor2\").append('<div><input type=\"number\" class=\"form-control\" name=\"vetor2[]\"/><a href=\"#\" class=\"remove_field\">Remover</a></div>');");
		out.println("	        }");
		out.println("	    });");
		out.println("	    ");
		out.println("	    $(\".input_vetor2\").on(\"click\",\".remove_field\", function(e){");
		out.println("	        e.preventDefault(); $(this).parent('div').remove(); ");
		out.println("	        cont2--;");
		out.println("	    })");
		out.println("	});");
		
		out.println("</script>");
		
		out.println("<body>");
		out.println("	<div class=\"container\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<h1>EXERCÍCIO - 05</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Utilizando vetor, faça um programa em Java que leia dois vetores (podem ter o tamanho diferente) já ordenados de forma crescente. Crie um outro vetor para armazenar os dois conjuntos unidos, sendo que os números devem permanecer ordenados. Finalmente, exiba este vetor resultante.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\" align=\"center\">");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<form method='post' action = 'Exe05' >");
		out.println("					<div class=\"input_vetor1 col-md-6\">");
		out.println("						<span>Digite os números do primeiro vetor: </span>");
		out.println("    					<button type=\"button\" class=\"addCampos1 btn btn-success\">Aumentar vetor 1</button>");
		out.println("    					<div><input type=\"number\" class=\"form-control\" name=\"vetor1[]\"></div>");
		out.println("					</div>");
		out.println("					<div class=\"input_vetor2 col-md-6\">");
		out.println("						<span>Digite os números do segundo vetor: </span>");
		out.println("    					<button type=\"button\" class=\"addCampos2 btn btn-success\">Aumentar vetor 2</button>");
		out.println("    					<div><input type=\"number\" class=\"form-control\" name=\"vetor2[]\"></div>");
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
	
		PrintWriter out = response.getWriter();
		Scanner sc = new Scanner (System.in);
		
		String vet1[] = request.getParameterValues("vetor1[]");
		String vet2[] = request.getParameterValues("vetor2[]");
		
		Arrays.sort(vet1);
		Arrays.sort(vet2);
		
		int vet3 = vet1.length + vet2.length;
		int resultado[] = new int[vet3];
		
		for(int i = 0; i < vet1.length; i++){
			resultado[i] = Integer.parseInt(vet1[i]);
		}
		
		for(int i = 0; i < vet2.length; i++){
			resultado[i + vet1.length] = Integer.parseInt(vet2[i]);
		}
		
		Arrays.sort(resultado);		
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("	<title>Exercício - 05</title>");
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
		out.println("				<h1>EXERCÍCIO - 05</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Utilizando vetor, faça um programa em Java que leia dois vetores (podem ter o tamanho diferente) já ordenados de forma crescente. Crie um outro vetor para armazenar os dois conjuntos unidos, sendo que os números devem permanecer ordenados. Finalmente, exiba este vetor resultante.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("	<div class=\"container\" align=\"center\" align='center'>");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("    			<div class=\"jumbotron\">");
		out.println("					<div>");
		out.println("						Primeiro vetor ordenado: ");
		for (int i = 0; i < vet1.length; i++) {
		out.println(					vet1[i]);
		}
		out.println("					</div>");
		out.println("					<div>");
		out.println("						Segundo vetor ordenado: ");
		for (int i = 0; i < vet2.length; i++) {
		out.println(					vet2[i]);
		}
		out.println("					</div>");
		out.println("					<div>");
		out.println("						Terceiro vetor ordenado: ");
		for (int i = 0; i < vet3; i++) {
		out.println(					resultado[i]);
		}
		out.println("					</div>");
		out.println("				</div>");
		out.println("				<div>");
		out.println("					<a href='Exe05'><input type='button' name='Voltar' value='Voltar'></a>");
		out.println("				</div>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
	}
	
}
