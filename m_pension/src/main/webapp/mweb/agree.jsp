<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 중단 -->
<section class="subpage">
<form id="f" method="post">
    <div class="member_agree">
    <p>회원가입 약관동의</p>
    <ol class="agree_ol">
    <li><label><input type="checkbox" class="ckbox" id="a1" onclick="each_ck()"> 이용약관의 동의</label><span class="agree_info">[자세히 보기]</span></li>
    <li><label><input type="checkbox" class="ckbox" id="a2" onclick="each_ck()"> 개인정보 수집의 동의</label><span class="agree_info">[자세히 보기]</span></li>
    <li><label><input type="checkbox" class="ckbox" id="a3" onclick="each_ck()"> 개인정보 제3자 제공 동의</label><span class="agree_info">[자세히 보기]</span></li>
    <li><label><input type="checkbox" class="ckbox" id="a4" onclick="each_ck()"> 개인정보 위탁제공 동의</label><span class="agree_info">[자세히 보기]</span></li>
    <li><label><input type="checkbox" class="ckbox" id="a5" onclick="each_ck()"> 마케팅 활용 동의 (선택)</label><span class="agree_info">[자세히 보기]</span></li>
    <li><label><input type="checkbox" class="ckbox" id="all" onclick="ck_all(this.checked)"> 위 약관에 모두 동의 합니다.</label></li>
    </ol>
    <div class="member_agreebtn" onclick="register();">기본정보 등록하기</div>
    </div>
</form>
    <script>
    
   		function register(){
   			var all = document.getElementById("all");
   			var a4 = document.getElementById("a4");
   			var w = 1;
   			var isalert = false;
   			
   			if(all.checked){
	   			location.href="./join_step2.jsp";
	   			f.submit();
   			}
   			while(w<=5){
   				if(w!=4){
	   				if(document.getElementById("a"+w).checked == true){
	   					f.submit();
	   					isalert = false;
	   					location.href="./join_step2.jsp";
	   				}
	   				else{
	   					isalert = true;
	   				}
   				}
   				w++;
   			}
   			if(isalert){
	   			alert("회원가입 약관에 필수 사항은 모두 체크 하셔야 회원가입이 진행 됩니다.");   				
   			}
   		}
    
    	function ck_all(all){
    		var w = 1;
    		while (w<=5){
    			document.getElementById("a"+w).checked = all;
    			w++;
    		}
    	}
    	
    	function each_ck(){
    		var all = document.getElementById("all");
    		var w = 1;
    		var check = true;
    		
    		do{
    			if(document.getElementById("a"+w).checked == false){
    				check = false;
    			}
    			w++;
    		}while(w <= 5);
    		
    		if(check == false){
    			all.checked = false;
    		}
    		else{
    			all.checked = true;
    		}
    	}
    	
    </script>
    
</section>