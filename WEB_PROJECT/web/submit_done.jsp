
<%@page import="entity.Question"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Create Form </title>

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <style>
            body, html {
                background-color: #4CAF50;
                height: 100%;
                font-family: Arial, Helvetica, sans-serif;
            }

            * {
                box-sizing: border-box;
            }
            .title{
                font-size: 30px;
            }
            .bg-img {
                /* The image used */
                background-image: url("img_nature.jpg");

                min-height: 380px;

                /* Center and scale the image nicely */
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
                position: relative;
            }

            /* Add styles to the form container */
            .container {
                position: absolute;
                margin-top: 100px ;
                width: 50%;
                padding: 10px;
                margin-left: 25%;
                margin-right: auto;
                background-color: white;
            }

            /* Full-width input fields */
            input[type=text] {
                width: 100%;
                padding: 15px;
                margin: 5px 0 22px 0;
                border: none;
                background-color: white;

            }


            input[type=text]:hover {
                outline: none;
            }

            /* Set a style for the submit button */
            .btn {
                background-color: #4CAF50;
                color: white;
                opacity: 0.9;
            }

            textArea:hover{
                background-color: #f1f1f1;
            }

            .head{
                margin: 0px;
                padding: 20px;
            }

            .dropdown{
                margin: 20px;
            }
            hr{
                margin-bottom:0px; 
            }
            .component{
                padding-top:0px;
                margin: 0px;
                padding: 20px;
            }
            .component:hover{
                border: solid black;
            }
            .required{
                width: 130px; 
                float:right;
            }
            .ans:hover{
                background-color: #f1f1f1;
            }
        </style>

    </head>
    <body>
        <div class="bg-img">
            <footer class="container-fluid text-center"style="background-color: white; margin-top: 200px; width: 25%; padding: 15px 0px 15px 0px;">
                <pre>Submit successfully

Thanks you for your time

<a href="CreateFormServlet?userId=${userId}&titleId=${titleId}&formPage=1">Rewrite the form</a></pre>
            </footer>
        </div>

    </body>
</html>
