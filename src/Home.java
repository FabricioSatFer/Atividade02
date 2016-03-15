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
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Atividade - 02 </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<div align='center'>");
		out.println("		<div>");
		out.println("			<h1>ATIVIDADE - 02</h1>");
		out.println("		</div>");
		out.println("		<div>");
		out.println("			<span>Escolha um dos exercicios abaixo: </span>");
		out.println("		</div>");
		
		for(int i = 1; i <= 10; i++){
			
		String Exer = Integer.toString(i);
		
		out.println("		<div>");
		out.println("			<div>");
		
		if(Exer.length() < 2){
			
		out.println("				<a href='Exe0" + i + "'>Exercício - 0" + i + "</a>");
		
		}else{
			
		out.println("				<a href='Exe" + i + "'>Exercício - " + i + "</a>");
			
		}
		
		out.println("			</div>");
		out.println("		</div>");
		
		}
		
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
