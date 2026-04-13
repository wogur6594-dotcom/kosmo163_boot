<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/temp/head_css.jsp"></c:import>
</head>
<body id="page-top">
	<div id="wrapper">
		<c:import url="/WEB-INF/views/temp/sidebar.jsp"></c:import>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<c:import url="/WEB-INF/views/temp/topbar.jsp"></c:import>

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-4 text-gray-800">Contents Page</h1>
					<table class="table table-bordered">
						<tbody>
							<tr>
								<th style="width: 20%;"
									class="bg-dark text-white">No.</th>
								<td>${d.boardNum}</td>
							</tr>
							<tr>
								<th class="bg-dark text-white">Title</th>
								<td>${d.boardTitle}</td>
							</tr>
							<tr>
								<th class="bg-dark text-white">Contents</th>
								<td>${d.boardContents}</td>
							</tr>
							<tr>
								<th class="bg-dark text-white">Writer</th>
								<td>${d.boardWriter}</td>
							</tr>
							<tr>
								<th class="bg-dark text-white">Time</th>
								<td>${d.boardDate}</td>
							</tr>
							<tr>
								<th class="bg-dark text-white">Hit</th>
								<td>${d.boardHit}</td>
							</tr>

						</tbody>

					</table>
					<div>
						<a class="btn btn-primary" href="./update?boardNum=${d.boardNum}">글
							수정</a>

						<form action="./delete" method="post">
							<input type="hidden" name="boardNum" value="${d.boardNum}">
							<button class="btn btn-danger">DELETE</button>
						</form>
					</div>


				</div>
				<!-- End Page container-fluid -->

			</div>
			<!-- End page Content -->
			<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
		</div>
		<!-- End Content wrapper -->
	</div>
	<!-- End Wrapper -->

	<c:import url="/WEB-INF/views/temp/footer_script.jsp"></c:import>

</body>
</html>