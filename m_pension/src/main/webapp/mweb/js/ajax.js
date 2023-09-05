window.onload=function(){
	var product = document.getElementById("list");
	
	//console.log(product.innerText);
	
	if(product.innerText ==""){
		ajax();	
	}
	
	
	
	function ajax(){
		var data;
		
		function wk(){
			if(window.XMLHttpRequest){
				return new XMLHttpRequest();
			}
		}
		
		function file(){
			if(data.readyState == XMLHttpRequest.DONE && data.status == 200){
				array = JSON.parse(this.response);
				//console.log(array);
				//console.log(array["penson_product"].length);//6
				
				var html = document.getElementById("list");
				

				//for(s in array["penson_product"]){
					//console.log(s);	 //배열 인덱스 나옴.
					//console.log(array["penson_product"][s]);	// 배열 하나씩 나옴
					
					var s =0;
					var htmlcode ="";
					while(s < array["penson_product"].length){
						var penson_name = array["penson_product"][s]["a_wktitle"].replaceAll(' ','&nbsp;');
						htmlcode +=`
						<li onclick=resv('`+penson_name+`','`+array["penson_product"][s]["a_wkpd"]+`')>
							<div>
								<span><img src="`+array["penson_product"][s]["a_wkimg"]+`"></span>
								<span>`+ penson_name +`</span>
								<span>`+Number(array["penson_product"][s]["a_wkpd"]).toLocaleString()+`원</span>
							</div>
						</li>
						`;
						s++;
					}
					html.innerHTML = htmlcode;
					
																	
			}
		}
		
		data = wk();
		data.onreadystatechange = file;
		data.open("get","./data.json?v=1",true);
		data.send();
	}	
}

		function resv(nm,money){
	
			location.href ='./m_reservation.jsp?pnm='+encodeURI(nm)+'&pmoney='+money;
		}