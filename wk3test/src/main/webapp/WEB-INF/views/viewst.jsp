<h2>Assigned Courses</h2>
<table>
    <tr>
        <th>Course Name</th>
        <th>Duration</th>
    </tr>
    <c:forEach var="assignment" items="${assignments}">
        <tr>
            <td>${assignment.course.name}</td>
            <td>${assignment.course.duration}</td>
        </tr>
    </c:forEach>
</table>
