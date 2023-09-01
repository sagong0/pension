package m_pension;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mweb/m_loginok.do")
public class m_loginok extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session = null;
	PrintWriter pw = null;

    public m_loginok() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("mid").intern();
		String pw = request.getParameter("mpw").intern();
		String checked = request.getParameter("mck").intern();
		
		//System.out.println(checked);
		
		this.pw = response.getWriter();
		
		if(id==""||pw==""||checked==null||checked=="") {
			/*아이디 패스워드 동일 할 경우*/
			HttpSession session = request.getSession();
			// id
			session.setAttribute("userid", id);
			// 고객명
			//session.setAttribute("username", rs2.getSTring("sname"));
			//연락처
			//session.setAttribute("usertel", rs2.getString("shp"));
			// 이메일
			//session.setAttribute("email", rs2.getString("semail"));
			
			
			this.pw.write("<script>"
					+ "alert(정보를 모두 입력해주세요);"
					+ "history.go(-1);"
					+ "</script>");
		}
		else {
			this.pw.write("<script>"
					+ "alert(로그인 성공!);"
					+ "location.href='./index.jsp'"
					+ "</script>");
		}
		this.pw.close();
		
	}
}
