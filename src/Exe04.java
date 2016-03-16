import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
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
				
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Calcular o valor de acordo com os pontos!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<div align='center'>");
		out.println("		<form method='post' action = 'Exe04' >");
		out.println("			<div>");
		out.println("				<br>Digite a pontuação:<br>");
		out.println("				<br>Primeiro Colocado: <input type='number'name='primeiro'></br>");
		out.println("				<br>Segundo Colocado: <input type='number'name='segundo'></br>");
		out.println("				<br>Terceiro Colocado: <input type='number'name='terceiro'></br>");
		out.println("			</div>");
		out.println("			<div>");
		out.println("				<br><input type='submit' name='botao' value'Calcular' >");
		out.println("				<a href='Home'><input type='button' name='VoltaHome' value='Voltar'></a>");
		out.println("			</div>");
		out.println("		</form>");
		out.println("	</div>");
		out.println("</body>");
		out.println("</html>");
		
				
		out.close();
	}

protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	double valor = 780.000;
	double pontos,soma,total;
	
	
	//convertendo as variaveis para double.
	//String v = request.getParameter("valor");
	//double valor = Double.parseDouble(v);
	//convertendo as variaveis para double.
	String pri= request.getParameter("primeiro");
	double primeiro= Double.parseDouble(pri);
	//convertendo as variaveis para double.
	String seg = request.getParameter("segundo");
	double segundo = Double.parseDouble(seg);
	//convertendo as variaveis para double.
	String ter = request.getParameter("terceiro");
	double terceiro = Double.parseDouble(ter);
	//convertendo as variaveis para double.
	//String pont = request.getParameter("pontos");
	//double pontos = Double.parseDouble(pont);
	//convertendo as variaveis para double.
	//String som = request.getParameter("soma");
	//double soma = Double.parseDouble(som);
	//convertendo as variaveis para double.
	//String tot = request.getParameter("total");
	//double total = Double.parseDouble(tot);
	
	PrintWriter out = response.getWriter();
	Scanner sc = new Scanner (System.in);
	
	out.println("<html>");
	out.println("<body>");

	pontos = primeiro + segundo + terceiro;
	soma = valor/pontos;

	primeiro =  soma*primeiro;
	segundo = soma*segundo;
	terceiro = soma*terceiro;
	
	total = primeiro + segundo +terceiro;
	
	//aonde mostra o resultado para o usuário
	out.println("	<div align='center'>");
	out.println("		<div>");
	out.println("			<p>Valor Para Cada Concorrente</p> ");
	out.println("		</div>");
	out.println("		<div>");
	out.println("			<br>Primeiro Colocado = R$ " + primeiro);
	out.println("			<br>=======================================</br>");
	out.println("			<br>Segundo Colocado = R$ " + segundo);
	out.println("			<br>=======================================</br>");
	out.println("			<br>tercerio Colocado = R$ " + terceiro);
	out.println("			<br>=======================================</br>");
	out.println("			<br>total = R$ " + total);
	out.println("			<br>=======================================</br>");
	out.println("		</div>");
	out.println("		<div>");
	out.println("			<p><a href='Exe04'><input type='button' name='txtVoltar' value='voltar'></a></p>");
	out.println("		</div>");
	out.println("	</div>");
	out.println("</body>");
	out.println("</html>");
	
	out.close();
	
	}

	
	
}
