import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"pt-br\">");
		out.println("<head>");
		out.println("	<title>Atividade - 02</title>");
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
		out.println("	<div class=\"container\" align='center'>");
		out.println("   	<div class=\"row clearfix c\">");
		out.println("       	<div class=\"col-md-12\">");
		out.println("				<div>");
		out.println("					<h1>ATIVIDADE - 02</h1>");
		out.println("				</div>");
		out.println("				<div>");
		out.println("					<p>Escolha um dos exercicios abaixo: </p>");
		out.println("				</div>");
		
		for(int i = 1; i <= 10; i++){
			
		String Exer = Integer.toString(i);
		
		out.println("				<div>");
		
		if(Exer.length() < 2){
			
		out.println("					<a href='Exe0" + i + "'><input type='button' class=\"btn btn\" value='Exercício - 0" + i + "'></a>");
		
		}else{
			
		out.println("					<a href='Exe" + i + "'><input type='button' class=\"btn btn\" value='Exercício - " + i + "'></a>");
			
		}
		
		out.println("				</div>");
		
		}
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
