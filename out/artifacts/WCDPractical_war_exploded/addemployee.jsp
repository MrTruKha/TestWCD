<%--
  Created by IntelliJ IDEA.
  User: Trường Nguyễn
  Date: 9/10/2020
  Time: 8:18 AM
  To change this template use File | Settings | File Templates.
--%>
<form action="EmployeeServlet" method="post">
    <input name="fullname" placeholder="Fullname" required type="text"/>
    <input name="birthday" placeholder="birthday" required type="text"/>
    <input name="address" placeholder="Address" required type="text"/>
    <input name="position" placeholder="position" required type="text"/>
    <input type="submit" value="Submit"/>
    <input type="reset" value="Reset"/>
</form>
