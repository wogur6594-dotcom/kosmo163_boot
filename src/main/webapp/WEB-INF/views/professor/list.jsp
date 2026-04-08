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
					<h1 class="h3 mb-4 text-gray-800">professor List Page</h1>

					<!-- 그룹을 위해 div태그 준비 -->
					<div class="row justify-content-center">
						<div class="col-12">
							<!-- 테이블 div 시작 -->
							<table class="table table-bordered w-50 mx-auto">
								<thead>
									<tr class="table-dark">
										<th>PROFESSORNO</th>
										<th>PROFESSOR_NAME</th>
										<th>DEPARTMENT_NO</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="d">
										<tr>
											<td><a href="./detail?professorNo=${d.professorNo}">${d.professorNo}</td>
											<td>${d.professorName}</td>
											<td>${d.departmentNo}</td>
											<!-- el 안에서 ==, eq / !=, ne -->
										
										</tr>

									</c:forEach>
								</tbody>
							</table>
							
							
							
						</div>
						<!-- 테이블 div 끝 -->
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