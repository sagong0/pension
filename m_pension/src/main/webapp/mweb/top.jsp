<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String user_id = "";
//String name = "";
//String tel = "";
//String email ="";
	try{
		user_id = session.getAttribute("userid").toString();
	}
	catch(Exception e){
	}
%>
    
    
<!-- 상단 시작 -->
<header>
<ul class="top_menu">
    <li><img src="./img/menu.svg"></li>
    <li><img src="./img/header_logo.png"></li>
    <%if(user_id==""||user_id==null)  {%>
    <li id="isuseron" onclick="login_pop();"><img src="./img/login.svg"></li>
    <%}else{ %>
    	<li style="text-align:center; margin-left:-90px;width:37%;"><span><%=user_id%>님 환영합니다.<a href="./mlogout.jsp">[LogOut하기]</a></span></li>
    <%}%>
</ul>
</header>
<form id="f" method="post" action="./m_loginok.do" onsubmit="return login();">
	<aside class="popup" id="popup" style="display:none;">
		<div class="login">
			<span class="close" onclick="pop_close();">X</span>
			<p>MEMBER-LOGIN</p>
			<ol>
			<li><input type="text" class="login_input" id="uid" name="uid" placeholder="아이디를 입력하세요"></li>
			<li><input type="password" class="login_input" id="upw" name="upw" placeholder="패스워드를 입력하세요"></li>
			<li><label><input type="checkbox" id="saveidbox" name="uck" class="login_check" onclick="id_save()"> 자동로그인</label></li>
			<li><input type="submit" value="로그인" class="login_btn"></li>
			<li class="login_info">
			<span onclick="page_location(1)">아이디 찾기</span>
			<span onclick="page_location(2)">회원가입</span>
			</li>
			</ol>
		</div>
	</aside>
</form>
<!-- 상단 끝 -->

<script>
	function login(){
		if(f.uid.value ==""){
			alert("아이디를 입력해주세요.");
			return false;
		}
		else if(f.upw.value ==""){
			alert("패스워드를 입력해주세요.");
			return false;
		}
		else{
			return;
		}
	}
	function id_save(){
		var ck = document.getElementById("saveidbox");
		
		if(f.uid.value==""){
			alert("아이디를 입력하셔야만 해당 기능을 사용하실 수 있습니다.!");
			ck.checked = false;
		}
		else{
			if(ck.checked == true){
				window.localStorage.setItem("userid",f.uid.value);
			}
			else{
				window.localStorage.setItem("userid","");
			}
		}
	}
	var li = document.getElementById("isuseron");
	var id = "<%=user_id%>";
	
</script>