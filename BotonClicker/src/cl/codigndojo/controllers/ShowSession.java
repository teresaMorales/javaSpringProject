package cl.codigndojo.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session
 */
@WebServlet("/ShowSession")
public class ShowSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private int suma;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowSession() {	
        super();
        suma=0;
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        HttpSession miSesion = request.getSession();
        
        String numeroVeces = (request.getParameter("contador")!= null)?request.getParameter("contador"):"0";
        int numero = Integer.parseInt(numeroVeces);
        suma+=numero;
        miSesion.setAttribute("contador",suma);

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/Vista.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}
	//get obtener
	//set establecer
}
