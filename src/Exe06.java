import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exe06")
public class Exe06 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		int vetor[] = new int[10];
		int i = 0, cont = 0;
		
		do{
            if(i % 2 == 1){
                vetor[cont] = i;
                cont++;
            }
            i++;
        }while(cont < 10);
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("<title>Exercício - 06</title>");
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
		out.println("				<h1>EXERCÍCIO - 06</h1>");
		out.println("			</div>");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<p>Faça um programa em Java que preencha um vetor de 10 posições com os 10 primeiros números ímpares.</p>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		
		out.println("	<div class=\"container\" align='center'>");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("       		<table class='table'>");
		out.println("       			<thead>");
		out.println("       				<tr>");
		out.println("       					<th>Posição do vetor de números ímpares</th>");
		out.println("       					<th>Número</th>");
		out.println("						</tr>");
		out.println("       			</thead>");
		out.println("       			<tbody>");
		
		for(i = 0; i < vetor.length; i++){
			int pos = i + 1;
		out.println("						<tr>");
		out.println("							<td>" + pos + "º número do vetor</td>");
		out.println("							<td>" + vetor[i] + "</td>");
		out.println("						</tr>");
		}
		
		out.println("       			</tbody>");
		out.println("       		</table>");
		out.println("			</div>");
		out.println("				<a href='Home'><input type='button' class=\"btn btn\" name='VoltaHome' value='Voltar'></a>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
				
		out.close();
	}
}