
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title><spring:message code="label.title"></title>
</head>
<body>
    <h2><spring:message code="label.title" /></h2>

    <form:form method="post" action="add" commandName="department">

        <table>
            <tr>
                <td><form:label path="name">
                    <spring:message code="label.name" />
                </form:label></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td><form:label path="location">
                    <spring:message code="label.location" />
                </form:label></td>
                <td><form:input path="location" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit"
                                       value="<spring:message code="label.adddepartment"/>" /></td>
            </tr>
        </table>
    </form:form>
    <h3><spring:message code="label.departments" /></h3>
    <c:if test="${!empty departmentList}">
        <table class="data">
            <tr>
                <th><spring:message code="label.name" /></th>
                <th><spring:message code="label.location" /></th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach items="${departmentList}" var="department">
                <tr>
                    <td>${department.name}</td>
                    <td>${department.loc}</td>
                    <td><a href="delete/${department.departmentId}"><spring:message code="label.delete" /></a></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

</body>
</html>
