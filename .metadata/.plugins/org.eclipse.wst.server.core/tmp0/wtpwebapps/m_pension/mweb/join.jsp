<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 중단 -->
<section class="subpage">
	<form id="f2" method="post" action="./join_ok.do">
	    <div class="member_agree">
		    <p>회원 기본 정보입력</p>
		    <ol class="join_ol">
			    <li><input type="text" id="jid" name="jid" class="join_input1" placeholder="아이디 (영문/숫자 6~16자리)" maxlength="16"></li>
			    <li><input type="text" id="jname" name="jname" class="join_input1" placeholder="이름 (홍길동)" maxlength="10"></li>
			    <li><input type="password" id="jpw" name="jpw" class="join_input1" placeholder="비밀번호 (영문/숫자 6~12자리)" maxlength="12"></li>
			    <li><input type="password" id="jpw2" class="join_input1" placeholder="동일한 패스워드를 입력하세요" maxlength="12"></li>
			    <li><input type="email" id="jemail" name="jemail" class="join_input1" placeholder="이메일을 입력하세요" maxlength="35"></li>
			    <li><input type="tel" id="jtell" name="jtell" class="join_input1" placeholder="연락처 ('-'는 미입력)" maxlength="11"></li>
			    <li class="security">
			    보안코드 : <input type="text" id="j_scode" value="" class="join_input2 bgcolor" maxlength="6" readonly="readonly">
			    <input type="number" id="j_scode2" class="join_input2" placeholder="보안코드 6자리 입력" maxlength="6">
			    </li>
		    </ol>
		    <div class="member_agreebtn" onclick="join()">회원가입</div>
	    </div>
	</form>
</section>

<script>
	var uri = decodeURI(window.location.search);
	//console.log(uri);
	var data = uri.split("all");
	console.log(data[0].length);	//0
	//console.log(data.length);
	
	if(data[0].length == 0){
		alert("잘못된 접근 방법입니다 !");
		location.href="./join_step.jsp";
	}


	var b ="";
	var w = 0;
	while(w<=5){
	    var a = Math.floor(Math.random() * 10);
	    b += a;
	    w++;
	}
	//console.log(b);
	document.getElementById("j_scode").value = b;
	
	
	function join(){
		if(document.getElementById("jid").value==""){
			alert("사용하실 아이디를 입력해주세요.");
		}
		else if(document.getElementById("jname").value==""){
			alert("이름을 입력해주세요.");
		}
		else if(document.getElementById("jpw").value==""){
			alert("사용하실 패스워드를 입력해주세요.");
		}
		else if(document.getElementById("jpw").value != document.getElementById("jpw2").value){
			alert("비밀번호가 일치하지 않습니다.");
		}
		else if(document.getElementById("jemail").value==""){
			alert("사용하실 이메일을 입력해주세요.");
		}
		else if(document.getElementById("jtell").value==""){
			alert("사용하실 연락처를 입력해주세요.");
		}
		else{
			if(document.getElementById("jid").value.length < 6 || document.getElementById("jid").value.length > 16){
				alert("아이디는 영문/숫자 포함 6~16자리로 사용해주세요.");
			}
			else if(document.getElementById("jpw").value.length < 6 || document.getElementById("jpw").value.length > 16){
				alert("6~16 자리의 비밀번호를 입력해주세요.");
			}
			else if(document.getElementById("jemail").value.indexOf("@")==-1){
				alert("올바른 이메일 형식이 아닙니다.");
			}
			else if(document.getElementById("jtell").value.length < 10){
				alert("올바른 전화번호 형식을 입력해주세요.");
			}
			else if(document.getElementById("j_scode").value != document.getElementById("j_scode").value || isNaN(document.getElementById("j_scode2").value)){
				alert("인증번호가 일치하지 않습니다.");
			}
			else{
				f2.submit();				
			}
		}
	}
</script>
