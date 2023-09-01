<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
String id = "";
String name = "";
String tel = "";
String email = "";

try{
	id = session.getAttribute("userid").toString();
	name = session.getAttribute("username").toString();
	tel = session.getAttribute("usertel").toString();
	email = session.getAttribute("semail").toString();	
}
catch(Exception e){
	out.print("Session Error로 인하여 Service 중지.");
}
%>

<header>
<ul class="top_menu">
    <li><img src="./img/menu.svg"></li>
    <li onclick="location.href='./index.jsp';"><img src="./img/header_logo.png"></li>
    <li id="userhtml" onclick="login_pop();"><img src="./img/login.svg"></li>
</ul>
</header>
<form id="f" method="post" onsubmit="return zzz();" action="./m_loginok.do">
	<aside class="popup" id="popup" style="display:none;">
		<div class="login">
			<span class="close" onclick="pop_close();">X</span>
			<p>MEMBER-LOGIN</p>
			<ol>
			<li><input type="text" class="login_input" id="mid" name="mid" placeholder="아이디를 입력하세요"></li>
			<li><input type="password" class="login_input"id="mpw" name="mpw" placeholder="패스워드를 입력하세요"></li>
			<li><label><input type="checkbox" id="mck" name="mck" value="true" class="login_check"> 자동로그인</label></li>
			<li><input type="submit" value="로그인" class="login_btn"></li>
			<li class="login_info">
			<span onclick="page_location(1)">아이디 찾기</span>
			<span onclick="page_location(2)">회원가입</span>
			</li>
			</ol>
		</div>
	</aside>
</form>

<script>

	window.onload = function(){
		var user = "<%=name%>";
		//console.log(user);
		var li = document.getElementById("userhtml");
		if(user != ""){
			console.log(li.getAttribute("onclick"));
			li.setAttribute("onclick","");
			li.innerHTML = user + "님" + "<a href='./logout.jsp'>[로그아웃]</a>";
			li.style.width = "40%";
		}
	}

	function zzz(){
		if(f.mid.value==""){
			alert("아이디를 입력해주세요.");
		}
		else if(f.mpw.value==""){
			alert("패스워드를 입력해주세요.");
		}
		else{
			f.submit();
		}
	}
</script>

