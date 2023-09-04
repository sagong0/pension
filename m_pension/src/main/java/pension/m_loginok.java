package pension;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("uid").intern();
		String pw = request.getParameter("upw").intern();
		this.pw = response.getWriter();
		if(id=="" || pw=="") {
			this.pw.write("<script>alert('정상적인 접근 방식이 아닙니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
		else {
			try {
				/* 사용자 아이디와 패스워드를 Database에서 가져오는 코드 */
				dbconfig db = new dbconfig();
				PreparedStatement ps = null;
				Connection con = db.dbinfo();
				String sql = "select * from member_person where mid=?";
				ps = con.prepareStatement(sql);
				ps.setString(1, id);
				ResultSet rs = ps.executeQuery();
				
				String sql_id = "";
				String sql_pw = "";
				String sql_use = "";
				while(rs.next()) {	//무한루프
					sql_id = rs.getString("mid").intern();
					sql_pw = rs.getString("mpw").intern();
					sql_use = rs.getString("muse").intern();
				}
				
				//System.out.println(sql_id);
				//System.out.println(sql_pw);
				//System.out.println(sql_use);
				con.close();
				ps.close();
				if(sql_id =="") {
					this.pw.write("<script>"
							+ "alert('해당사용자 정보를 확인 하지 못하였습니다.');"
							+ "history.go(-1);"
							+ "</script>");
				}
				else {
					// id확인 되고, 패스워드 검토 !!!!
					if(sql_pw == pw) {
						
						
						if(sql_use =="Y") {
							this.session = request.getSession();
							this.session.setAttribute("userid", id);
							
							this.pw.write("<script>"
									+ "alert('로그인 하셨습니다.');"
									+ "location.href='./index.jsp'"
									+ "</script>");
						}
						else {
							this.pw.write("<script>"
									+ "alert('관리자권한으로 로그인 하실수 없습니다.');"
									+ "history.go(-1);"
									+ "</script>");
						}
						this.session.setAttribute("userid", id);
						this.pw.write("<script>"
								+ "alert('로그인 하셨습니다.');"
								+ "location.href='./index.jsp'"
								+ "</script>");
					}
					else {
						// 패스워드 틀림
						this.pw.write("<script>"
								+ "alert('패스워드가 틀립니다.');"
								+ "history.go(-1);"
								+ "</script>");
					}
				}
				this.pw.close();
			}
			catch(Exception e) {
				System.out.println("DB연결과정 오류");
				System.out.println(e);
			}
		}
	}

}
