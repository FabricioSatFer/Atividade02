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
		
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Achar o Ano Bissexto</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<div align='center'>");
		out.println("		<form method='post' action = 'Exe03' >");
		out.println("			<div>");
		out.println("				<span>Digite um Ano: <input type='number'name='ano'></span>");
		out.println("			</div></br>");
		out.println("			<div>");
		out.println("				<input type='submit' name='botao'>");
		out.println("				<a href='Home'><input type='button' name='VoltaHome' value='Voltar'></a>");
		out.println("			</div>");
		out.println("		</form>");
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
		
		out.println("<html>");
		out.println("<body>");
		out.println("	<div align='center'>");
		out.println("		<div>");
		
		if(numbe %4 == 0){
			
		out.println("			Ano eh Bissexto!");
		
		}else{
			
		out.println("			Ano não é Bissexto!");
		
		}
		
		out.println("		</div></br>");
		out.println("		<div>");
		out.println("		<a href='Exe03'><input type='button' name='txtVoltar' value='voltar'></a>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}


}
