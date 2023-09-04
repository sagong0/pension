<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 중단 -->
<section class="subpage">
	<form id="ff" method="get" action="./join_step2.jsp">
	    <div class="member_agree">
		    <p>회원가입 약관동의</p>
		    <ol class="agree_ol">
			    <li><label><input type="checkbox" class="ckbox" id="a1" name="a1" onclick="each()"> 이용약관의 동의</label><span class="agree_info">[자세히 보기]</span></li>
			    <li><label><input type="checkbox" class="ckbox" id="a2" name="a2" onclick="each()"> 개인정보 수집의 동의</label><span class="agree_info">[자세히 보기]</span></li>
			    <li><label><input type="checkbox" class="ckbox" id="a3" name="a3" onclick="each()"> 개인정보 제3자 제공 동의</label><span class="agree_info">[자세히 보기]</span></li>
			    <li><label><input type="checkbox" class="ckbox" id="a4" name="a4" onclick="each()"> 개인정보 위탁제공 동의</label><span class="agree_info">[자세히 보기]</span></li>
			    <li><label><input type="checkbox" class="ckbox" id="a5" name="a5" onclick="each()"> 마케팅 활용 동의 (선택)</label><span class="agree_info">[자세히 보기]</span></li>
			    <li><label><input type="checkbox" class="ckbox" id="all" name="all" onclick="ck_all(this.checked)"> 위 약관에 모두 동의 합니다.</label></li>
		    </ol>
	    	<div class="member_agreebtn" onclick="register()">기본정보 등록하기</div>
	    </div>
    </form>
</section>

<script>
	var ischeck = true;
	function register(){
		var all = document.getElementById("all");
		var isgo = true;
		
		var w = 1;
		while(w<=5){
			//w4 는 체크안해도됨
			if(w!=5){
				if(document.getElementById("a"+w).checked == false){
					isgo = false;
				}				
			}
			w++;
		}
		if(isgo){
			//location.href='./join_step2.jsp';
			ff.submit();
		}
		else{
			alert("회원가입 약관에 모두 체크 하셔야 회원가입이 진행됩니다.");
		}
	}

	function each(){
		ischeck = true;
		var all = document.getElementById("all");

		var w = 1;
		while(w<=5){
			if(document.getElementById("a"+w).checked == false){
				ischeck = false;
			}
			w++;
		}
		// 하나라도 미체크시
		if(ischeck == false){
			all.checked = false;
		}
		// 전체 동의 된 상태.
		else{
			all.checked = true;
		}
	}

	function ck_all(all){
		var w = 1;
		while(w <=5){
			document.getElementById("a"+w).checked = all;
			w++;
		}
	}
</script>