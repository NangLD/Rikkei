<%-- 
    Document   : dashbord
    Created on : Mar 16, 2019, 11:01:17 PM
    Author     : Pyke-xxx
--%>

<%@page import="entity.Title"%>
<%@page import="DAO.TitleDAO"%>
<%@page import="entity.Question"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Font Awesome CSS -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="assets/css/bootstrap/bootstrap.min.css">

        <!-- Custom CSS -->
        <link rel="stylesheet" href="assets/css/mnd/common.css">
        <link rel="stylesheet" href="assets/css/mnd/dashboard.css">

        <title>Dashboard</title>
    </head>

    <body id="page-top">
        <!-- Start wrapper -->
        <div id="wrapper">
            <!-- Sidebar -->
            <%@include file="common/sidebar.jsp"%>

            <div id="content-wrapper">
                <!-- Navbar -->
                <%@include file="common/navbar.jsp"%>

                <div class="container-fluid" style="height: 2000px;">
                    <!-- Page Title -->
                    <div class="row title">
                        <div class="col-12">
                            <h3>
                                Quản lý câu hỏi
                            </h3>
                        </div>
                    </div>
                    <!-- /.row -->
                    <div class="row mt-2 mb-3">
                        <div class="col-12 btn-add">
                            <p class="mb-3">Ấn nút để thêm/ sửa câu hỏi.</p>
                            <button type="button" class="btn btn-success collapsed" data-toggle="collapse" data-target="#addAccount" aria-expanded="false" aria-controls="collapse">
                                Thêm/ sửa câu hỏi <i class="fas fa-angle-down ml-2"></i>
                            </button>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12">
                            <div class="collapse mb-2" id="addAccount">
                                <div class="card">
                                    <div class="card-body">
                                        <h5 class="mb-4">Nhập thông tin câu hỏi</h5>
                                        <form action="AddQuestionServlet?ID=<%=request.getParameter("ID")%>&quesId=<%=request.getParameter("quesId")%>" method="post">
                                            <div class="form-group row col-6">
                                                <label for="role" class="col-sm-3 col-form-label text-right">Tiêu đề</label>
                                                <div class="col-sm-9">
                                                    <select class="form-control" name="topic">
                                                        <%
                                                            String titleId = (String) request.getAttribute("titleId");
                                                            int a = 0;
                                                            if (titleId != null) {
                                                                a = Integer.parseInt(titleId);
                                                            }
                                                            List<Title> titles = (List<Title>) request.getAttribute("titles");
                                                            for (Title std : titles) {
                                                                if (a == std.getId()) {
                                                        %>
                                                        <option value="<%=std.getId()%>" selected  ><pre><%=std.getId()%>  -  <%=std.getTitle()%></pre></option>
                                                        <%
                                                        } else {
                                                        %>
                                                        <option value="<%=std.getId()%>"  ><pre><%=std.getId()%>   -  <%=std.getTitle()%></pre></option>
                                                        <%
                                                                }
                                                            }
                                                        %>

                                                    </select>
                                                </div>
                                            </div>
                                            <div class="row">                                               
                                                <div class="form-group row col-6">
                                                    <label for="question" class="col-sm-3 col-form-label text-right">Câu hỏi</label>
                                                    <div class="col-sm-9">
                                                        <input type="text" class="form-control" value="${question}" name="question" placeholder="Nhập câu hỏi" required>
                                                    </div>
                                                </div>


                                            </div>
                                            <button type="submit" style="margin-right: 500px;" class="btn btn-info btn-md btn-float-r mr-fix" name="btnSubmit">
                                                <i class="fas fa-check fa-fw mr-1"></i>Xác nhận
                                            </button>  
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /.row -->

                    <!-- Page Title -->
                    <div class="row title">
                        <div class="col-12">
                            <h3>
                                Danh sách câu hỏi
                            </h3>
                        </div>
                    </div>

                    <!-- /.row -->                   
                    <div class="row mt-3">
                        <div class="col-12">
                            <table id="accounts" class="table table-bordered" cellspacing="0" style="width:100%">
                                <thead>
                                    <tr>
                                        <th>Tiêu đề ID</th>
                                        <th>Tên tiêu đề</th>
                                        <th>Câu hỏi</th>                                                           
                                        <th>chức năng</th>                                  
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        List<Question> questions = (List<Question>) request.getAttribute("questions");
                                        for (Question std : questions) {
                                            TitleDAO titleDao = new TitleDAO();
                                            Title t = titleDao.getOne(std.getTitleId());
                                    %>
                                    <tr>
                                        <td><%=t.getId()%></td>
                                        <td><%=t.getTitle()%></td>
                                        <td><%=std.getQues()%></td>                                                                                                         
                                        <td>
                                            <a href="AddQuestionServlet?ID=<%=request.getParameter("ID")%>&quesId=<%=std.getI()%>" class="edit mr-1" data-toggle="tooltip" title="Chỉnh sửa"><i class="fas fa-pen fa-fw"></i></a>
                                            <a href="#" class="remove" data-toggle="tooltip" onclick="deleteQuestion(<%=std.getI()%>,<%=request.getParameter("ID")%>)" title="Xóa"><i class="fas fa-trash fa-fw"></i></a>
                                        </td>
                                    </tr>
                                    <%
                                        }
                                    %>
                                <script>
                                    function deleteQuestion(id, userId) {
                                        var r = confirm("do you want to delete the student??");
                                        if (r === true) {
                                            window.location.href = "DeleteQuestion?ID=" + userId + "&quesId=" + id;
                                        }
                                    }
                                </script>
                                </tbody>
                            </table>
                            
                        </div>
                    </div>
                </div>
            </div>
                                <%
                                boolean isCreatedSuccessful = Boolean.valueOf(request.getAttribute("isDeletedDone").toString());
                                if (isCreatedSuccessful) {
                            %>
                            <h4>Deleted successfully</h4>
                            <%
                                }
                            %>
        </div>
                                
        <!-- End wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Bootstrap core JavaScript-->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js "></script>
        <script src="assets/js/bootstrap/popper.min.js"></script>
        <script src="assets/js/bootstrap/bootstrap.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="assets/js/mnd/mnd.min.js"></script>

    </body>

</html>
