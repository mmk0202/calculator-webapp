package in.maheshtechonline;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String operation = request.getParameter("operation");

        double result = 0;
        switch (operation) {
            case "add":
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                break;
            case "subtract":
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                break;
            case "multiply":
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                break;
            case "divide":
                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                break;
        }

        // Set result as a request attribute
        request.setAttribute("result", result);
        // Forward to the JSP page
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}

