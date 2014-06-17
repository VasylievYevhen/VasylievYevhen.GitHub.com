<%--
  Created by IntelliJ IDEA.
  User: Жека
  Date: 02.06.2014
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Student Details</h2><br /><br />
        <form action="./StudentController" method="post">
            Student ID: <input type="text" name="id"/><br/>
            Name: <input type="text" name="name"/><br/>
            Address: <input type="text" name="address"/><br/>
            <input type="submit" value="Submit"/>
        </form>
        <form name="regform" method="get" action="./Second">
            <table ID="Table1">
                <tr>
                    <td>
                        First Name : <input type="text" name="firstName" size="25" value="">
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="Submit" NAME="Submit" value="Submit" >
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
