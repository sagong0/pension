/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.85
 * Generated at: 2023-09-05 09:46:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class m_005freservation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/mweb/./reservation.jsp", Long.valueOf(1693907179101L));
    _jspx_dependants.put("/mweb/./qmenu.jsp", Long.valueOf(1693590784000L));
    _jspx_dependants.put("/mweb/./banner.jsp", Long.valueOf(1693590576000L));
    _jspx_dependants.put("/mweb/./top.jsp", Long.valueOf(1693672366000L));
    _jspx_dependants.put("/mweb/./copy.jsp", Long.valueOf(1693590892000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>호텔 & 펜션 예약시스템</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/m_index.css?v=2\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/m_sub.css?v=2\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/m_reservation.css?v=2\">\r\n");
      out.write("   \r\n");
      out.write("    <script src=\"./js/m_index.js?v=2\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 상단 시작 -->\r\n");
      out.write('\r');
      out.write('\n');
 
String user_id = "";
//String name = "";
//String tel = "";
//String email ="";
	try{
		user_id = session.getAttribute("userid").toString();
	}
	catch(Exception e){
	}

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!-- 상단 시작 -->\r\n");
      out.write("<header>\r\n");
      out.write("<ul class=\"top_menu\">\r\n");
      out.write("    <li><img src=\"./img/menu.svg\"></li>\r\n");
      out.write("    <li><img src=\"./img/header_logo.png\"></li>\r\n");
      out.write("    ");
if(user_id==""||user_id==null)  {
      out.write("\r\n");
      out.write("    <li id=\"isuseron\" onclick=\"login_pop();\"><img src=\"./img/login.svg\"></li>\r\n");
      out.write("    ");
}else{ 
      out.write("\r\n");
      out.write("    	<li style=\"text-align:center; margin-left:-90px;width:37%;\"><span>");
      out.print(user_id);
      out.write("님 환영합니다.<a href=\"./mlogout.jsp\">[LogOut하기]</a></span></li>\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("</header>\r\n");
      out.write("<form id=\"f\" method=\"post\" action=\"./m_loginok.do\" onsubmit=\"return login();\">\r\n");
      out.write("	<aside class=\"popup\" id=\"popup\" style=\"display:none;\">\r\n");
      out.write("		<div class=\"login\">\r\n");
      out.write("			<span class=\"close\" onclick=\"pop_close();\">X</span>\r\n");
      out.write("			<p>MEMBER-LOGIN</p>\r\n");
      out.write("			<ol>\r\n");
      out.write("			<li><input type=\"text\" class=\"login_input\" id=\"uid\" name=\"uid\" placeholder=\"아이디를 입력하세요\"></li>\r\n");
      out.write("			<li><input type=\"password\" class=\"login_input\" id=\"upw\" name=\"upw\" placeholder=\"패스워드를 입력하세요\"></li>\r\n");
      out.write("			<li><label><input type=\"checkbox\" id=\"saveidbox\" name=\"uck\" class=\"login_check\" onclick=\"id_save()\"> 자동로그인</label></li>\r\n");
      out.write("			<li><input type=\"submit\" value=\"로그인\" class=\"login_btn\"></li>\r\n");
      out.write("			<li class=\"login_info\">\r\n");
      out.write("			<span onclick=\"page_location(1)\">아이디 찾기</span>\r\n");
      out.write("			<span onclick=\"page_location(2)\">회원가입</span>\r\n");
      out.write("			</li>\r\n");
      out.write("			</ol>\r\n");
      out.write("		</div>\r\n");
      out.write("	</aside>\r\n");
      out.write("</form>\r\n");
      out.write("<!-- 상단 끝 -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	function login(){\r\n");
      out.write("		if(f.uid.value ==\"\"){\r\n");
      out.write("			alert(\"아이디를 입력해주세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		else if(f.upw.value ==\"\"){\r\n");
      out.write("			alert(\"패스워드를 입력해주세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		else{\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	function id_save(){\r\n");
      out.write("		var ck = document.getElementById(\"saveidbox\");\r\n");
      out.write("		\r\n");
      out.write("		if(f.uid.value==\"\"){\r\n");
      out.write("			alert(\"아이디를 입력하셔야만 해당 기능을 사용하실 수 있습니다.!\");\r\n");
      out.write("			ck.checked = false;\r\n");
      out.write("		}\r\n");
      out.write("		else{\r\n");
      out.write("			if(ck.checked == true){\r\n");
      out.write("				window.localStorage.setItem(\"userid\",f.uid.value);\r\n");
      out.write("			}\r\n");
      out.write("			else{\r\n");
      out.write("				window.localStorage.setItem(\"userid\",\"\");\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	var li = document.getElementById(\"isuseron\");\r\n");
      out.write("	var id = \"");
      out.print(user_id);
      out.write("\";\r\n");
      out.write("	\r\n");
      out.write("</script>");
      out.write(" \r\n");
      out.write("<!-- 상단 끝 -->\r\n");
      out.write("<main>\r\n");
      out.write("<!-- 배너 -->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- 배너 -->\r\n");
      out.write("<section>\r\n");
      out.write("    <img src=\"./img/title_Resort.jpg\">\r\n");
      out.write("</section>\r\n");
      out.write("<!-- 배너 끝-->");
      out.write("\r\n");
      out.write("<!-- 배너 끝-->\r\n");
      out.write("<!-- 중단 -->\r\n");
      out.write("\r\n");
      out.write("<section class=\"subpage\">\r\n");
      out.write("    <div class=\"member_agree\">\r\n");
      out.write("    <p>펜션 예약하기</p>\r\n");
      out.write("    <ol class=\"reser_ol\">\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">펜션명</span>\r\n");
      out.write("    <span class=\"reser_part2\" id=\"room_name\"></span>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">객실선택</span>\r\n");
      out.write("    <span class=\"reser_part2\">\r\n");
      out.write("    <select class=\"reser_select\">\r\n");
      out.write("    <option value=\"\">객실선택</option>\r\n");
      out.write("    <option>로즈힙 101호</option>\r\n");
      out.write("    <option>튤립 102호</option>\r\n");
      out.write("    <option>레몬 201호</option>\r\n");
      out.write("    <option>만다리 202호</option>\r\n");
      out.write("    <option>피치 301호</option>\r\n");
      out.write("    <option>올리비아 302호</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    </span>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">일자선택</span>\r\n");
      out.write("    <span class=\"reser_part2\">\r\n");
      out.write("    <input type=\"datetime-local\" class=\"reser_input\">\r\n");
      out.write("    </span>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">객실구조</span>\r\n");
      out.write("    <span class=\"reser_part2\">\r\n");
      out.write("    방2, 주방1, 화장실1, 거실1\r\n");
      out.write("    </span>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">입실인원</span>\r\n");
      out.write("    <span class=\"reser_part2\">\r\n");
      out.write("    기준 3인 / 최대 4인\r\n");
      out.write("    </span>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">추가인원</span>\r\n");
      out.write("    <span class=\"reser_part2\">\r\n");
      out.write("    기준인원 초과시 추가요금이 발생합니다.\r\n");
      out.write("    </span>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">구매금액</span>\r\n");
      out.write("    <span class=\"reser_part2\" id=\"room_money\"></span>\r\n");
      out.write("    </li>\r\n");
      out.write("    </ol>\r\n");
      out.write("    <p>예약자정보 입력</p>\r\n");
      out.write("        <ol class=\"reser_ol\">\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">객실선택</span>\r\n");
      out.write("    <span class=\"reser_part2\">\r\n");
      out.write("    <select class=\"reser_select\">\r\n");
      out.write("    <option value=\"\">객실선택</option>\r\n");
      out.write("    <option>로즈힙 101호</option>\r\n");
      out.write("    <option>튤립 102호</option>\r\n");
      out.write("    <option>레몬 201호</option>\r\n");
      out.write("    <option>만다리 202호</option>\r\n");
      out.write("    <option>피치 301호</option>\r\n");
      out.write("    <option>올리비아 302호</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    </span>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">예약자명</span>\r\n");
      out.write("    <span class=\"reser_part2\">\r\n");
      out.write("    <input type=\"text\" class=\"reser_input\" maxlength=\"30\">\r\n");
      out.write("    </span>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">휴대폰</span>\r\n");
      out.write("    <span class=\"reser_part2\">\r\n");
      out.write("    <input type=\"number\" class=\"reser_input\" maxlength=\"11\">\r\n");
      out.write("    </span>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">입실인원</span>\r\n");
      out.write("    <span class=\"reser_part2\">\r\n");
      out.write("    <select class=\"reser_select\">\r\n");
      out.write("    <option value=\"\">입실 인원선택</option>\r\n");
      out.write("    <option>1인</option>\r\n");
      out.write("    <option>2인</option>\r\n");
      out.write("    <option>3인</option>\r\n");
      out.write("    <option>4인</option>\r\n");
      out.write("    <option>5인</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    </span>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <span class=\"reser_part1\">이메일</span>\r\n");
      out.write("    <span class=\"reser_part2\">\r\n");
      out.write("    <input type=\"email\" class=\"reser_input\" maxlength=\"50\">\r\n");
      out.write("    </span>\r\n");
      out.write("    </li>\r\n");
      out.write("    </ol>\r\n");
      out.write("    <div class=\"member_agreebtn\" onclick=\"\">예약하기</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	var param = decodeURI(window.location.search);\r\n");
      out.write("	console.log(param);\r\n");
      out.write("	var room = document.getElementById(\"room_name\");\r\n");
      out.write("	var money = document.getElementById(\"room_money\");\r\n");
      out.write("	\r\n");
      out.write("	var data = param.split(\"&pmoney=\");\r\n");
      out.write("	var data2 = data[0].split(\"?pnm=\");\r\n");
      out.write("	\r\n");
      out.write("	room.innerText = data2[1];\r\n");
      out.write("	money.innerText = Number(data[1]).toLocaleString() + \"원\";\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- 하단 시작 -->\r\n");
      out.write("\r\n");
      out.write("<!-- 하단 시작 -->\r\n");
      out.write("<section>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>회사소개</li>\r\n");
      out.write("            <li>제휴문의</li>\r\n");
      out.write("            <li>광고문의</li>\r\n");
      out.write("            <li>FAQ</li>\r\n");
      out.write("            <li>개인정보취급방침</li>\r\n");
      out.write("            <li>이용약관</li>\r\n");
      out.write("            <li>예약관리시스템</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>");
      out.write("\r\n");
      out.write("</main>\r\n");
      out.write("<footer>\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("<li><img src=\"./img/footer_logo.png\"></li>\r\n");
      out.write("<li>상호명 : (주)플레이스엠 |  대표이사 : 송재철</li>\r\n");
      out.write("<li>사업자등록번호 : 120-86-43350[사업자등록번호 확인]</li>\r\n");
      out.write("<li>통신판매신고번호 : 제2012-서울강남 00160호</li>\r\n");
      out.write("<li>주소 : 서울 강남구 테헤란로 79길 6,5층(삼성동,제이에스타워)</li>\r\n");
      out.write("<li>펜션 고객센터 : 1544-7317</li>\r\n");
      out.write("<li>개인정보담당자 : </li>\r\n");
      out.write("<li>Copyright (c) 2023 PLACEM CO.LTD. All Rights Reserved</li>\r\n");
      out.write("</ul>");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}