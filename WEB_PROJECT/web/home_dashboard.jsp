<%-- 
    Document   : dashbord
    Created on : Mar 16, 2019, 11:01:17 PM
    Author     : Pyke-xxx
--%>

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
                                Dashboard
                            </h3>
                        </div>
                    </div>
                    <!-- /.row -->

                    <div class="row statistical mt-3">
                        <div class="col-md-6 col-lg-3">
                            <div class="card">
                                <div class="row">
                                    <div class="col-3">
                                        <i class="fas fa-th-large fa-3x"></i>
                                    </div>
                                    <div class="col-9 text-right">
                                        <div class="huge">4</div>
                                        <div class="sub-text">menu1</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-3">
                            <div class="card">
                                <div class="row">
                                    <div class="col-3">
                                        <i class="fas fa-th-large fa-3x"></i>
                                    </div>
                                    <div class="col-9 text-right">
                                        <div class="huge">13</div>
                                        <div class="sub-text">menu2</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-3">
                            <div class="card">
                                <div class="row">
                                    <div class="col-3">
                                        <i class="fas fa-user-graduate fa-3x"></i>
                                    </div>
                                    <div class="col-9 text-right">
                                        <div class="huge">63</div>
                                        <div class="sub-text">menu3</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-3">
                            <div class="card">
                                <div class="row">
                                    <div class="col-3">
                                        <i class="fas fa-user-friends fa-3x"></i>
                                    </div>
                                    <div class="col-9 text-right">
                                        <div class="huge">6</div>
                                        <div class="sub-text">menu4</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /.row -->
                </div>
            </div>
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
