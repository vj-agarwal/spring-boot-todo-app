<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
	<head>
		<title>List ToDo Page</title>
	</head>
	<body>
		<div>Welcome To ToDo's Page ${name}</div><hr>
		<h1>Your ToDo </h1>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
					</tr>
				</thead>
				<tbody>
						<c:forEach items="${todos}" var = "todo">
							<tr>
								<th>${todo.id}</th>
								<th>${todo.description}</th>
								<th>${todo.targetdate}</th>
								<th>${todo.done}</th>
							</tr>
						</c:forEach>
				</tbody>
			</table>
	</body>
</html>