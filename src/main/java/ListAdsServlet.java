//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet("/ads")
//public class ListAdsServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Ad> ads = DaoFactory.getAdsDao().all();
//        req.setAttribute("ads", ads);
//        req.getRequestDispatcher("/Adslist.jsp").forward(req, resp);
//    }
//}