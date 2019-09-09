<!DOCTYPE html>
<html lang="en">
    <head>
        <title>home</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <style>
            .img-responsive{
                height: 180px;
            }
            .navbar {
                margin-bottom: 0;
                border-radius: 0;
            }
            footer {
                background-color: #f2f2f2;
                padding: 25px;
            }

            .carousel-inner img {
                width: 100%; 
                margin: auto;
                max-height: 500px;
            }
            @media (max-width: 600px) {
                .carousel-caption {
                    display: none; 
                }
            }
            .logo{
                height:40px;
                padding-bottom: 15px;
            }

        </style>
    </head>
    <body>

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                    <a class="navbar-brand" href="#"><img src="images/logo.png" class="logo"  alt="Image"></a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Home</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="SignUpServlet"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                        <li><a href="LogInServlet"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="images/statistic.jpg"  alt="Image">
                    <div class="carousel-caption">

                        <p>Make your work easer</p>
                    </div>      
                </div>

                <div class="item">
                    <img src="images/calculator.png" alt="Image">
                    <div class="carousel-caption">
                        <p>Smart to way to calculate</p>
                    </div>      
                </div>
            </div>


            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>


        <footer class="container-fluid text-center">
            <pre>Posted by: The Boys

Contact information: NangLDse06165@fpt.edu.vn

Note: The website helps you to create a servey form to get information from people conveniently.</pre>
        </footer>

    </body>
</html>
