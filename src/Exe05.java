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
		
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Exercício - 05</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<div align='center'>");
		out.println("		<form method='post' action = 'Exe05' >");
		out.println("			<div>");
		out.println("				<span>Digite o tamanho do primeiro vetor: <input type='number'name='vet1'></span>");
		out.println("			</div></br>");
		out.println("			<div>");
		out.println("				<span>Digite o tamanho do segundo vetor: <input type='number'name='vet2'></span>");
		out.println("			</div></br>");
		out.println("			<div>");
		out.println("				<input type='submit' value='Continuar'>");
		out.println("				<a href='Home'><input type='button' name='VoltaHome' value='Voltar'></a>");
		out.println("			</div>");
		out.println("		</form>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();

	}
	
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		Scanner sc = new Scanner (System.in);
		
		String v1= request.getParameter("vet1");
		String v2= request.getParameter("vet2");
		
		int a = Integer.parseInt(v1);
		int vetor[] = new int [a];
		int b = Integer.parseInt(v2);
		int vetor2[] = new int [b];
		
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Exercício - 05</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<div align='center'>");
		out.println("		<form method='post' action = 'Exe05' >");
		out.println("			<div>");
		out.println("				Digite os numeros do primeiro vetor de forma crescente</br>");
		
		for(int i = 1; i <= a; i++){
			
		out.println("				<br><div>");
		out.println("					<span>Digite o " + i + "º do vetor: <input type='number'name='valVet1'></span>");
		out.println("				</div></br>");
		
		}
		out.println("				<input type='hidden' name='vetor1' value='"+ vetor +"'");
		out.println("			</div>");
		
		out.println("			<div>");
		out.println("				Digite os numeros do segundo vetor de forma crescente</br>");
		
		for(int i = 1; i <= b; i++){
			
		out.println("				<br><div>");
		out.println("					<span>Digite o " + i + "º do vetor: <input type='number'name='valVet2'></span>");
		out.println("				</div></br>");
			
		}
		out.println("				<input type='hidden' name='vetor2' value='"+ vetor2 +"'");
		out.println("			</div>");
		
		out.println("			<div>");
		out.println("				<input type='submit' name='Ordenar' value='Ordenar'>");
		out.println("				<a href='Exe05'><input type='button' name='txtVoltar' value='Voltar'></a>");
		out.println("			</div>");
		out.println("		</form>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		Arrays.sort(vetor);
		Arrays.sort(vetor2);
		
		out.close();
		
	}
	
	protected void doPostr (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		Scanner sc = new Scanner (System.in);
		
		String vetor1 = request.getParameter("vetor1");
		String vetor2 = request.getParameter("vetor2");
		
		int vetor3 = vetor1.length() + vetor2.length();
		int resultado[] = new int[vetor3];
		
		System.arraycopy(vetor1, 0, resultado, 0, vetor1.length());
        System.arraycopy(vetor2, 0, resultado, vetor1.length(), vetor2.length());
        
        Arrays.sort(resultado);
		
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Exercício - 05</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<div align='center'>");
		out.println("		<div>");
		out.println("			Primeiro vetor ordenado: " + vetor1);
		out.println("		</div>");
		out.println("		<div>");
		out.println("			Segundo vetor ordenado: " + vetor2);
		out.println("		</div>");
		out.println("		<div>");
		out.println("			Terceiro vetor ordenado: ");
		for (int i = 0; i < vetor3; i++) {
		out.println(resultado[i]);
		}
		out.println("		</div>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();
		
		
	}
	
}
