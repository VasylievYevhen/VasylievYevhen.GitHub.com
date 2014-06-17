<%@ page import="controller.StudentController" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"  language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="CONTENT-TYPE" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Details</h1><br /><br />
        Student ID: ${requestScope.student.studentID}<br />
        Name: ${requestScope.student.name}<br />
        Address: ${requestScope.student.address}<br />
    </body>

    <form name="regform" method="get" action="./Action">
        <table ID="Table1">

            <tr>
                <td>
                    <input type="Submit" NAME="Back" value="Back" >
                </td>
            </tr>
        </table>
    </form>


</html>
