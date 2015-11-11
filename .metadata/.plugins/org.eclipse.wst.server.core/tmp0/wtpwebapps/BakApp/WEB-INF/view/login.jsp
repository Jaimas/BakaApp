<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
</head>
<body>
	<div id="login-modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header" align="center">
					<img class="img-circle" id="img_logo"
						src="<c:url value="/resources/images/mif-logo.png"/>">
				</div>
				<div id="div-forms">
					<form id="login-form">
						<div class="modal-body">
							<input id="login_username" class="form-control" type="text"
								placeholder="Username">
							<input id="login_password" class="form-control" type="password"
								placeholder="Password">
							<div class="checkbox">
								<label> <input type="checkbox"> Remember me
								</label>
							</div>
						</div>
						<div class="modal-footer">
							<div>
								<a class="btn btn-primary btn-lg btn-block" href="main">Login</a>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>