package m_pension;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mweb/join_ok.do")
public class joinok extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement ps = null;
	PrintWriter pw = null;

    public joinok() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("jid").intern();
		String name = request.getParameter("jname").intern();
		String pw = request.getParameter("jpw").intern();
		String email = request.getParameter("jemail").intern();
		String tell = request.getParameter("jtell").intern();
		String securityNo = request.getParameter("jscode").intern();
		
		if(id=="" || name==""||pw==""||email==""||tell==""||securityNo=="") {
			this.pw.write("<script>"
					+ "alert('올바른 정보가 전달되지 않았습니다.'); "
					+ "history.go(-1);"
					+ "</script>");
		}else {
			try {
				dbconfig db = new dbconfig();
				Connection con = db.dbinfo();
				
				String sql = "insert into member_person('0',?,?,?,?,?,'Y',now())";
				this.ps = con.prepareStatement(sql);
				this.ps.setString(1, id);
				this.ps.setString(2, name);
				this.ps.setString(3, pw);
				this.ps.setString(4, email);
				this.ps.setString(5, tell);
			}
			catch(Exception e) {
				System.out.println("SQL 구문 및 오류...");
				System.out.println(e);
			}
		}
	}

}
