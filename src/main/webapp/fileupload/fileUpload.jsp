<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.File" %>

<%
    // Configure the upload path (e.g., outside the web application directory)
    String uploadPath = "/path/to/upload/directory";
    int maxFileSize = 10 * 1024 * 1024; // 10 MB
    String encoding = "UTF-8";

    try {
        // Create the upload directory if it doesn't exist
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }

        // Create a MultipartRequest object to handle the file upload
        MultipartRequest multi = MultipartRequest(request, uploadPath, maxFileSize, encoding, new DefaultFileRenamePolicy());

        // Retrieve form parameters
        String name = multi.getParameter("name");
        String subject = multi.getParameter("subject");

        // Get the list of uploaded files
        Enumeration<String> fileNames = multi.getFileNames();
        List<String> uploadedFiles = new ArrayList<>();
        List<String> originalFileNames = new ArrayList<>();

        // Process each uploaded file
        while (fileNames.hasMoreElements()) {
            String fileName = fileNames.nextElement();
            String uploadedFile = multi.getFilesystemName(fileName);
            String originalFileName = multi.getOriginalFileName(fileName);

            if (uploadedFile != null) {
                uploadedFiles.add(uploadedFile);
                originalFileNames.add(originalFileName);
            }
        }
    } catch (Exception e) {
        // Handle the exception appropriately (e.g., log the error, display a user-friendly message)
        e.printStackTrace();
        // You can also set an error message in the request scope and forward to an error page
        request.setAttribute("errorMessage", "An error occurred during file upload: " + e.getMessage());
        request.getRequestDispatcher("/error.jsp").forward(request, response);
    }
%>

<html>
<body>
    <form name="filecheck" action="fileCheck.jsp" method="post">
        <input type="hidden" name="name" value="<%= name %>">
        <input type="hidden" name="subject" value="<%= subject %>">
        <% for (int i = 0; i < uploadedFiles.size(); i++) { %>
            <input type="hidden" name="filename<%= i + 1 %>" value="<%= uploadedFiles.get(i) %>">
            <input type="hidden" name="origfilename<%= i + 1 %>" value="<%= originalFileNames.get(i) %>">
        <% } %>
    </form>
    <a href="#" onclick="javascript:filecheck.submit()">Upload Confirmation and Download Page</a>
</body>
</html>