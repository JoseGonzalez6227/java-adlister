import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doPost(req, resp);
//        if (request.getMethod().equalsIgnoreCase("post"));

        String username = request.getParameter("username");
        String password = request.getParameter("password");

            if(username.equalsIgnoreCase("admin") && password.equals("password")) {
                response.sendRedirect("/profile");
                } else {
                response.sendRedirect("/login");
            }
        }
    }
