<%-- Created by IntelliJ IDEA. User: Truong Nguyen Date: AM To change this
template use File | Settings | File Templates. --%> <%@ page
contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <title>List employee</title>
  </head>
  <body>
    <div align="center">
      <table border="1" cellpadding="5">
        <caption>
          <h2>List of Employees</h2>
        </caption>
        <tr>
          <th>FullName</th>
          <th>Birthday</th>
          <th>Address</th>
          <th>Position</th>
        </tr>
        <c:forEach var="employee" items="${employeeList}">
          <tr>
            <td><c:out value="${employee.fullname}" /></td>
            <td><c:out value="${employee.birthday}" /></td>
            <td><c:out value="${employee.address}" /></td>
            <td><c:out value="${employee.position}" /></td>
          </tr>
        </c:forEach>
      </table>
      <a href="/WCDPractical_war_exploded">Back</a>
    </div>
  </body>
</html>
