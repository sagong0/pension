package pension;

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
	PrintWriter pw = null;
	Connection con = null;
	PreparedStatement ps = null;

    public joinok() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("jid").intern();
		String name = request.getParameter("jname").intern();
		String pw = request.getParameter("jpw").intern();
		String email = request.getParameter("jemail").intern();
		String tell = request.getParameter("jtell").intern();
		
		this.pw = response.getWriter();
		
		String msg = "";
		
		if(id==""||name==""||pw==""||email==""||tell=="") {
			msg = "alert('모든 정보가 원활히 들어오지 않았습니다.');";
			this.pw.write("<script>"+msg
					+"history.go(-1);"
					+ "</script>");
		}
		else {
			try {
				dbconfig db = new dbconfig();
				this.con = db.dbinfo();
				
				String insertSQL = "insert into member_person values('0',?,?,?,?,?,now(),'Y')";
				this.ps = this.con.prepareStatement(insertSQL);
				this.ps.setString(1, id);
				this.ps.setString(2, name);
				this.ps.setString(3, pw);
				this.ps.setString(4, email);
				this.ps.setString(5, tell);
				
				int oksign = this.ps.executeUpdate();
				if(oksign >0) {
					msg ="alert('정상적으로 회원가입 되었습니다.');";
					this.pw.write("<script>"+msg
							+"location.href='./index.jsp'"
							+ "</script>");					
				}
				
				this.ps.close();
				this.con.close();
				this.pw.close();
			}
			catch(Exception e) {
				System.out.println("DB연결 또는 SQL 구문 에러");
			}
		}
	}
}
