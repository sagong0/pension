window.onload = function(){
	function win(){	//통신 규약에 대한 인스턴스를 새롭게 생성하는 역할
		if(window.XMLHttpRequest){
			return new XMLHttpRequest();
		}
	}
	
	function file(){
		// 서버접속 성공 유/무 를 확인 또한 해당 로드할 파일이 정상적으로 로드가 되었는지 확인하는 공간.
		if(data.readyState == XMLHttpRequest.DONE && data.status == 200){
			// JSON파일은 기본이 문자열 => 해당 문자열을 정상적인 배열화 
			// 시켜주는 함수 입니다. (Json.parse)
			array = JSON.parse(this.response);	//response : 결과값 반환
			//console.log(array["penson_product"]);
			
			var html = document.getElementById("product");
			//console.log(html);
			var s;
			for(s in array["penson_product"]){
				html.innerHTML += "<ol>";				
				//console.log(s);
				var f;
				for(f in array["penson_product"][s]){
					console.log(array["penson_product"][s][f]);
					if(array["penson_product"][s][f] == "a_wkimg"){
						html.innerHTML += "<li><div><span><img src ="+array["penson_product"][s][f]+"</div></span></li>";
					}
						html.innerHTML += "<li>"+array["penson_product"][s][f]+"</li>";			
						html.innerHTML += "</ol>";
					}		
			} 		
			if(data.status == 404 || data.status == 405){
				console.log("해당 파일 및 서버에 접속할 수 없습니다.");
			}
		}
		data = win();
		data.onreadystatechange = file;
		data.open("get", "./data.json", true);	
	
		data.send();
	}
}