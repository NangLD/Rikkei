package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Question;
import java.util.List;

public final class create_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Create Form </title>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body, html {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                height: 100%;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .title{\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .bg-img {\n");
      out.write("                /* The image used */\n");
      out.write("                background-image: url(\"img_nature.jpg\");\n");
      out.write("\n");
      out.write("                min-height: 380px;\n");
      out.write("\n");
      out.write("                /* Center and scale the image nicely */\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Add styles to the form container */\n");
      out.write("            .container {\n");
      out.write("                position: absolute;\n");
      out.write("                margin-top: 100px ;\n");
      out.write("                width: 65%;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin-left: 17.5%;\n");
      out.write("                margin-right: auto;\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Full-width input fields */\n");
      out.write("            input[type=text] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 5px 0 22px 0;\n");
      out.write("                border: none;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            input[type=text]:hover {\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Set a style for the submit button */\n");
      out.write("            .btn {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            textArea{\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 5px 0 22px 0;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            textArea:hover{\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .head{\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown{\n");
      out.write("                margin: 20px;\n");
      out.write("            }\n");
      out.write("            hr{\n");
      out.write("                margin-bottom:0px; \n");
      out.write("            }\n");
      out.write("            .component{\n");
      out.write("                padding-top:0px;\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            .component:hover{\n");
      out.write("                border: solid black;\n");
      out.write("            }\n");
      out.write("            .required{\n");
      out.write("                width: 130px; \n");
      out.write("                float:right;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            var count = 1;\n");
      out.write("            var countAns = 1;\n");
      out.write("            function addAnswerCheckBox(id, ansId) {\n");
      out.write("                var answerid = \"newAnswer\" + id;\n");
      out.write("                var answer = document.getElementById(answerid);\n");
      out.write("                var an = document.createElement(\"div\");\n");
      out.write("                answer.appendChild(an);\n");
      out.write("                an.innerHTML = \"<input type=\\\"checkbox\\\" name=\\\"ans\" + count + \".\" + ansId + \"\\\"  > <input type=\\\"text\\\" style=\\\"width:70%; padding:8px; margin-bottom:7px;\\\" placeholder=\\\"Write an answer\\\"/>\";\n");
      out.write("            }\n");
      out.write("            function addAnswerRadioBox(id, ansId) {\n");
      out.write("                var answerid = \"newAnswer\" + id;\n");
      out.write("                var answer = document.getElementById(answerid);\n");
      out.write("                var an = document.createElement(\"form\");\n");
      out.write("                answer.appendChild(an);\n");
      out.write("                an.innerHTML = \"<input type=\\\"radio\\\" name=\\\"ans\" + count + \".\" + ansId + \"\\\"  > <input type=\\\"text\\\" style=\\\"width:70%; padding:8px; margin-bottom:7px;\\\" placeholder=\\\"Write an answer\\\"/>\";\n");
      out.write("            }\n");
      out.write("            function delQuestion(id) {\n");
      out.write("                var questionid = \"question\" + id;\n");
      out.write("                var onequesion = document.getElementById(questionid);\n");
      out.write("                var add = document.getElementById(\"add\");\n");
      out.write("                add.removeChild(onequesion);\n");
      out.write("            }\n");
      out.write("            function createAnswer() {\n");
      out.write("                var add = document.getElementById(\"add\");\n");
      out.write("                var oneques = document.createElement(\"div\");\n");
      out.write("                oneques.id = \"question\" + count;\n");
      out.write("                oneques.class = \"component\";\n");
      out.write("                oneques.style.margin = \"0px\";\n");
      out.write("                oneques.style.padding = \"0px 20px 0px 20px\";\n");
      out.write("                var required = document.createElement(\"div\");\n");
      out.write("                required.class = \"required\";\n");
      out.write("                required.style.width = \"120px\";\n");
      out.write("                required.style.float = \"right\";\n");
      out.write("                required.class = \"required\";\n");
      out.write("                required.style.margin = \"0px 5px 5px 0px\";\n");
      out.write("                var input = document.createElement(\"div\");\n");
      out.write("                // nest elements together\n");
      out.write("                add.appendChild(oneques);\n");
      out.write("                oneques.appendChild(required);\n");
      out.write("                oneques.appendChild(input);\n");
      out.write("                // add attributes by html\n");
      out.write("                required.innerHTML = \"<a href=\\\"#\\\"onclick=\\\"delQuestion(\" + count + \")\\\"><span  style=\\\"margin:0px 20px 0px 0px;\\\" class=\\\"glyphicon glyphicon-trash\\\"></span></a> <input type=\\\"checkbox\\\" name=\\\"\\\" value=\\\"Required\\\" > Required \";\n");
      out.write("                input.innerHTML = \"<input type=\\\"text\\\" name=\\\"ques\" + count + \"\\\"  placeholder=\\\"QUESTION\\\" >   <input style=\\\" background-color: white;  margin: auto auto 0px 55px; width: 70%; \\\" type=\\\"text\\\" name=\\\"\\\" value =\\\"Answer\\\" readonly>  <hr style=\\\"margin-top:0;\\\"/> \";\n");
      out.write("                count++;\n");
      out.write("            }\n");
      out.write("            function createRadioQuestion() {\n");
      out.write("                var add = document.getElementById(\"add\");\n");
      out.write("                var oneques = document.createElement(\"div\");\n");
      out.write("                oneques.id = \"question\" + count;\n");
      out.write("                oneques.class = \"component\";\n");
      out.write("                oneques.style.margin = \"0px\";\n");
      out.write("                oneques.style.padding = \"0px 20px 0px 20px\";\n");
      out.write("                var required = document.createElement(\"div\");\n");
      out.write("                required.style.width = \"120px\";\n");
      out.write("                required.style.float = \"right\";\n");
      out.write("                required.class = \"required\";\n");
      out.write("                required.style.margin = \"5px 5px 5px 0px\";\n");
      out.write("                var input = document.createElement(\"div\");\n");
      out.write("                var newAnswer = document.createElement(\"div\");\n");
      out.write("                newAnswer.style.margin = \"0px 0px 0px 40px\";\n");
      out.write("                newAnswer.style.width = \"40%\";\n");
      out.write("                newAnswer.id = \"newAnswer\" + count;\n");
      out.write("                var complete = document.createElement(\"div\");\n");
      out.write("                complete.style.margin = \"10px 0px 0px 40px\";\n");
      out.write("                complete.style.width = \"40%\";\n");
      out.write("                var hr = document.createElement(\"hr\");\n");
      out.write("                hr.style.margin = \"10px auto 10px auto\";\n");
      out.write("                // nest elements together\n");
      out.write("                add.appendChild(oneques);\n");
      out.write("                oneques.appendChild(required);\n");
      out.write("                oneques.appendChild(input);\n");
      out.write("                oneques.appendChild(newAnswer);\n");
      out.write("                oneques.appendChild(complete);\n");
      out.write("                oneques.appendChild(hr);\n");
      out.write("                // add attributes by html\n");
      out.write("                required.innerHTML = \"<a href=\\\"#\\\"onclick=\\\"delQuestion(\" + count + \")\\\"><span  style=\\\"margin:0px 20px 0px 0px;\\\" class=\\\"glyphicon glyphicon-trash\\\"></span></a> <input type=\\\"checkbox\\\" name=\\\"\\\" value=\\\"Required\\\" > Required \";\n");
      out.write("                input.innerHTML = \"<input type=\\\"text\\\"  name=\\\"ques\" + count + \"\\\"  placeholder=\\\"QUESTION\\\" > \";\n");
      out.write("                complete.innerHTML = \"<span class=\\\"glyphicon glyphicon-ok-circle\\\" style=\\\"margin:0 20px 0 15px;\\\"></span> <button type=\\\"button\\\" onclick=\\\"addAnswerRadioBox(\" + count + \")\\\">Add An Answer</button>  \";\n");
      out.write("                count++;\n");
      out.write("            }\n");
      out.write("            function createMultipleChoices() {\n");
      out.write("                var add = document.getElementById(\"add\");\n");
      out.write("                var oneques = document.createElement(\"div\");\n");
      out.write("                oneques.id = \"question\" + count;\n");
      out.write("                oneques.class = \"component\";\n");
      out.write("                oneques.style.margin = \"0px\";\n");
      out.write("                oneques.style.padding = \"0px 20px 0px 20px\";\n");
      out.write("                var required = document.createElement(\"div\");\n");
      out.write("                required.style.width = \"120px\";\n");
      out.write("                required.style.float = \"right\";\n");
      out.write("                required.class = \"required\";\n");
      out.write("                required.style.margin = \"5px 5px 5px 0px\";\n");
      out.write("                var input = document.createElement(\"div\");\n");
      out.write("                var newAnswer = document.createElement(\"div\");\n");
      out.write("                newAnswer.style.margin = \"0px 0px 0px 40px\";\n");
      out.write("                newAnswer.style.width = \"40%\";\n");
      out.write("                newAnswer.id = \"newAnswer\" + count;\n");
      out.write("                var complete = document.createElement(\"div\");\n");
      out.write("                complete.style.margin = \"10px 0px 0px 40px\";\n");
      out.write("                complete.style.width = \"40%\";\n");
      out.write("                var hr = document.createElement(\"hr\");\n");
      out.write("                hr.style.margin = \"10px auto 10px auto\";\n");
      out.write("                // nest elements together\n");
      out.write("                add.appendChild(oneques);\n");
      out.write("                oneques.appendChild(required);\n");
      out.write("                oneques.appendChild(input);\n");
      out.write("                oneques.appendChild(newAnswer);\n");
      out.write("                oneques.appendChild(complete);\n");
      out.write("                oneques.appendChild(hr);\n");
      out.write("                // add attributes by html\n");
      out.write("                required.innerHTML = \"<a href=\\\"#\\\"onclick=\\\"delQuestion(\" + count + \")\\\"><span  style=\\\"margin:0px 20px 0px 0px;\\\" class=\\\"glyphicon glyphicon-trash\\\"></span></a> <input type=\\\"checkbox\\\" name=\\\"\\\" value=\\\"Required\\\" > Required \";\n");
      out.write("                input.innerHTML = \"<input type=\\\"text\\\"  name=\\\"ques\" + count + \"\\\"  placeholder=\\\"QUESTION\\\" > \";\n");
      out.write("                complete.innerHTML = \"<span class=\\\"glyphicon glyphicon-check\\\" style=\\\"margin:0 20px 0 15px;\\\"></span><button type=\\\"button\\\" onclick=\\\"addAnswerCheckBox(\" + count + \")\\\">Add An Answer</button>  \";\n");
      out.write("                count++;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"bg-img\">\n");
      out.write("            <div action=\"\" class=\"container\">\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    ");

                        boolean isEmpty = Boolean.valueOf(request.getAttribute("emptyTitle").toString());
                        if (isEmpty == false) {
                    
      out.write("\n");
      out.write("                    <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  style=\"font-size: 25px\" readonly>\n");
      out.write("                    <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${discription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  style=\"font-size: 18px\" name=\"discription\" readonly>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div id=\"accordion\" style=\"margin-top: 20px;\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <a class=\"collapsed card-link\" data-toggle=\"collapse\" href=\"#collapseThree\">\n");
      out.write("                                    TITLE\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseThree\" class=\"collapse\" data-parent=\"#accordion\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <form action=\"CreateFormServlet?ID=");
      out.print(request.getParameter("ID"));
      out.write("\" method=\"post\">\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Input Title\" style=\"font-size: 25px\" name=\"title\">\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${discription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Discription\" style=\"font-size: 18px\" name=\"discription\">\n");
      out.write("                                        <input type=\"submit\" style=\"margin-top: 10px;\" value=\"Done\">     \n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                    List<Question> questions = (List<Question>) request.getAttribute("questions");
                    for (Question std : questions) {
                
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"text\" value=\"");
      out.print(std.getQues());
      out.write("\"  style=\"font-size: 25px\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"accordion\" style=\"margin-top: 20px;\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <a class=\"collapsed card-link\" data-toggle=\"collapse\" href=\"#collapseThree\">\n");
      out.write("                                    Edit Question\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseThree\" class=\"collapse\" data-parent=\"#accordion\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <form action=\"CreateFormServlet?ID=");
      out.print(request.getParameter("ID"));
      out.write("\" method=\"post\">\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Input Question\" style=\"font-size: 25px\" name=\"question\">\n");
      out.write("                                        <input type=\"submit\" style=\"margin-top: 10px;\" value=\"Done\">     \n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
