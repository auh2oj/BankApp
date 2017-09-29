<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
function close_window() {
	  if (confirm("Are you sure you want to close this page?")) {
	    close();
	  }
	}

</script>
</head>
<body background="img/background1.jpg">
	<br>
	<h3 style = "color:#00ff80;margin-left: 20px;">User Profile</h3>
	<hr />
	<span style="color: red; font-size: 16px;margin-left: 40px;">${message}</span><br><br>
	<div style="margin-left: 30px;">
		<form action="request.do" method="POST">
			<table>
				<tr>
					<td>
						<div class="form-group">
							<label  style = "color:#00ff80;">Name : </label> <input type="text" class="form-control"
								name="name" placeholder="Name"
								style="width: 300px; display: inline; margin-left: 40px;" /> <br />
						</div>
						
						<div class="form-group">
							<label  style = "color:#00ff80;">Age :</label> <input type="text" class="form-control"
								name="age" placeholder="Age"
								style="margin-left: 50px; width: 300px; display: inline;"
								 /> <br />
						</div>
						<div class="form-group">
							<label  style = "color:#00ff80;">Address :</label> <input type="text" class="form-control"
								name="address" placeholder="Address"
								style="margin-left: 20px; width: 300px; display: inline;" /> <br />
						</div>
						<div class="form-group">
							<label  style = "color:#00ff80;">Contact Number :</label> <input type="text" class="form-control"
								name="contactNumber" placeholder="Contact Number"
								style="margin-left: 20px; width: 300px; display: inline;" /> <br />
						</div>
						
						<div class="form-group">
							<label  style = "color:#00ff80;">Loan Amount :</label> <input type="text" class="form-control"
								name="loanAmount" placeholder="Loan Amount"
								style="margin-left: 40px; width: 300px; display: inline;" /> <br />
						</div>
						<div class="form-group">
							<label  style = "color:#00ff80;">SSN :</label> <input type="password" class="form-control"
								name="ssn" placeholder="SSN"
								style="margin-left: 20px; width: 300px; display: inline;" /> <br />
						</div>
						
						
						<button type="submit" class="btn btn-danger"
							style="display: inline; margin-left: 100px; background-color: #00ff80; color: black">Save
							Profile</button>
						<button type="button" class="btn btn-danger"
							style="display: inline; margin-left: 30px; background-color: #ff8080;"
							ng-click="clearSearch();"><a href="javascript:close_window();">Close</a></button>
							</td>
				</tr>

					
			</table>
		</form>
		<br /> <br />
	</div>
</body>
</html>