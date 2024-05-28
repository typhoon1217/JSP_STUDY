<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Enumeration, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application Init Parameters</title>
</head>
<body>
    <ul>
        <%--
        Enumeration<String> enumData = application.getInitParameterNames();
        ArrayList<String> dataList = new ArrayList<String>();

        while (enumData.hasMoreElements()) {
            dataList.add(enumData.nextElement());
        }
        --%>
        <%
            Enumeration<String> enumData = application.getInitParameterNames();
            ArrayList<String> dataList = new ArrayList<String>();

            while (enumData.hasMoreElements()) {
                dataList.add(enumData.nextElement());
            }

            for (int i = 0; i < dataList.size(); i++) {
                String data = dataList.get(i);
                String value = application.getInitParameter(data);
                String printValue = String.format("<li>%s = %s</li>", data, value);
                pageContext.getOut().println(printValue);
            }
        %>
    </ul>
</body>
</html>
