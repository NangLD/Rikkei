<%@page contentType="text/html" pageEncoding="UTF-8"%>

<ul class="sidebar navbar-nav sidebar-fixed">
    <li class="nav-item">
        <a class="nav-link" href="">
            <h3>Title</h3>
        </a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="home?ID=<%=request.getParameter("ID")%>">
            <i class="fas fa-tachometer-alt fa-fw"></i>
            <span>Dashboard</span>
        </a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="TitleServlet?ID=<%=request.getParameter("ID")%>">
            <i class="fas fa-archive fa-fw"></i>
            <span>Quản lý tiêu đề</span>
        </a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="QestionServlet?ID=<%=request.getParameter("ID")%>">
            <i class="fas fa-users fa-fw"></i>
            <span>Quản lý câu hỏi</span>
        </a>
    </li>


    <li class="nav-item btn-toggle">
        <a class="nav-link" href="javascript:void(0)" id="btn-sidebar-toggle">
            <i class="fas fa-angle-left fa-fw"></i>
        </a>
    </li>
</ul>

<!-- Toast -->
<div style="position: fixed; bottom: 28px; right: 14px; z-index: 9999;">
    <!-- Then put toasts within -->
    <div class="toast toast-error" role="alert" aria-live="assertive" aria-atomic="true" data-delay="8000">
        <div class="toast-header">
            <strong class="mr-auto">Thông báo</strong>
            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
        <div class="toast-body">
            ${messageError}
        </div>
    </div>
</div>

<div style="position: fixed; bottom: 28px; right: 14px; z-index: 9999;">
    <!-- Then put toasts within -->
    <div class="toast toast-success" role="alert" aria-live="assertive" aria-atomic="true" data-delay="5000">
        <div class="toast-header">
            <strong class="mr-auto">Thông báo</strong>
            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
        <div class="toast-body">
            ${messageSuccess}
        </div>
    </div>
</div>