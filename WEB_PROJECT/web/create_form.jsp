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
            <div action="" class="container">
                <%@include file="title_form.jsp" %>
                <%
                    List<Question> questions = (List<Question>) request.getAttribute("questions");
                    int pageForm = Integer.parseInt((String) request.getAttribute("page"));
                    int size = questions.size();
                    int current = 0;
                    for (int i = 1; i < 6 && (5 * (pageForm - 1) + i) <= size; i++) {
                        current = 5 * (pageForm - 1) + i;
                        Question q = questions.get(current - 1);
                %>
                <form action="" method="post">
                    <input type="text" style="padding-bottom: 0px;margin-bottom: 0px;font-size: 23px" value="<%=q.getQues()%>" readonly="" name="ques<%=q.getI()%>">
                    <input type="text" class="ans" placeholder="Nhập câu trả lời" style="width: 60%;font-size: 12px;padding-bottom: 0px; margin-left: 15px;padding-left: 2px;padding-top: 0px;;margin-bottom: 0px;border-bottom: solid #ddd" name="<%=q.getI()%>">
                </form>
                <%
                    }
                    if (size == current) {
                %>
                <form action="SubmitFormServlet?userId=<%=request.getParameter("userId")%>&titleId=<%=request.getParameter("titleId")%>&formPage=<%=request.getParameter("formPage")%>&next=0&nextPage=${nextPage}" method="post">
                    <input type="submit" value="Submit" style="margin-top: 20px; float: right;">
                </form>
                <%
                } else {   
                %>
                <form action="SubmitFormServlet?userId=<%=request.getParameter("userId")%>&titleId=<%=request.getParameter("titleId")%>&formPage=<%=request.getParameter("formPage")%>&next=1&nextPage=${nextPage}" method="post">
                    <input type="submit" value="next" style="margin-top: 20px; float: right;">
                </form>
                <%
                    }
                %>                  

            </div>
        </div>
    </div>

</body>
</html>
