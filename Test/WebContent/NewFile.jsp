<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>

<body>
	<%
		String result = (String)request.getAttribute("result");
			
	%>
	<form action ="./TestServlet" method ="GET">
		<input type ="text" name ="chkText" id="chkText" value="GGBBHHB">
		<input type ="submit" value = "KULBA!!!!!">
	</form>	
	
	<%=result%><br>
	<% out.print(result); %>
	<button id="btn">TEST AJAX</button>
	<script>	
		$("#btn").click(function(){
			//alert($("#chkText").val());
			let text = $("#chkText").val();
		  $.ajax({type:"POST" , url: "./TestAjaxServlet" , data: {chkText: text} , success: function(result){
		    $("#div1").html(result);
		  }});
		});
	</script>
	
	<div id="div1">
	
	</div>
</body>
</html>