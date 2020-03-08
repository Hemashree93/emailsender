<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">


<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<!-- asdfg -->
<!--Bootsrap 4 CDN-->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<!--Fontawesome CDN-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">

<!--Custom styles-->
<link rel="stylesheet" type="text/css" href="styles.css">


</head>
<body
	style="background-image: url('./images/glowingbutterfly-1583083959522-7823.jpg'); background-repeat: no-repeat; background-size: auto;">



	<form action="sendMail.do" method="post">
		<div class="container w-70%">
			<div class="card-body" align="center">
				<!-- <div class="container p-bottom-10%" style="height: 100%; align-content: center;"> -->
				<div class="d-flex justify-content-center h-100">
					<div class="card"
						style="height: 430px; margin-top: auto; margin-bottom: auto; width: 400px; background-color: rgba(0, 0, 0, 0.5) !important;">
						<div class="card-header" style="color: white;">
							<h4>Enter E-mail and your message</h4>

						</div>
						<div class="card-body">

							<div class="input-group form-group">
								<div class="input-group-prepend">
									<span class="input-group-text"></span>
								</div>
								<input type="text" class="form-control"
									placeholder="Enter mail-Id" name="emailId">

							</div>

							<div class="input-group form-group">
								<div class="input-group-prepend">
									<span class="input-group-text"></span>
								</div>
								<input type="text" class="form-control" placeholder="Subject"
									name="subject">


							</div>

							<div class="input-group form-group">
								<div class="input-group-prepend">
									<span class="input-group-text"></span>
								</div>
								<textarea cols="50" rows="5" class="form-control"
									placeholder="Enter message here" name="body"></textarea>
							</div>





							<div class="form-group">
								<input type="submit" value="Send"
									class="btn float-right login_btn"
									style="color: black; background-color: #FFC312; width: 100px;">
							</div>
						</div>



					</div>
				</div>
			</div>
		</div>
		</div>

	</form>

	<div align="center">
		<span style="font-family: cursive; color: white;">${key} </span> <span
			style="color: red; font-family: cursive">${failureMessage}</span>
	</div>

</body>
</html>