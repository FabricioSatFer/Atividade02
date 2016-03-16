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
        
				
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Exercício - 06</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<div align='center'>");
		out.println("		<div>");
		out.println("			<table border='1'>");
		out.println("				<tr>");
		out.println("					<td>Posição do vetor de números ímpares</td>");
		out.println("					<td>Número</td>");
		out.println("				</tr>");
		
		for(i = 0; i < vetor.length; i++){
			int pos = i + 1;
		out.println("				<tr>");
		out.println("					<td align='center'>" + pos + "º número do vetor</td>");
		out.println("					<td align='center'>" + vetor[i] + "</td>");
		out.println("				</tr>");
		}
		out.println("			</table>");
		out.println("		</div></br>");
		
		out.println("		<div>");
		out.println("			<a href='Home'><input type='button' name='VoltaHome' value='Voltar'></a>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
				
		out.close();
	}
}