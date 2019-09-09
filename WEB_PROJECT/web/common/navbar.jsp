<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand bg-gray">
    <ul class="navbar-nav ml-auto header">
        <li class="nav-item dropdown">
            %>
            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-user-circle fa-fw mr-1 fa-lg"></i>
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
               
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal"><i class="fas fa-sign-out-alt fa-fw mr-2"></i>Đăng xuất</a>
            </div>
        </li>
    </ul>
</nav>

<!-- Modal logout-->
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="logoutModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <!-- Modal Header -->
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <!-- Modal body -->
            <div class="modal-body">
                <div class="text-center">
                    <div class="text-danger mb-4">
                        <i class="fas fa-exclamation-triangle fa-3x"></i>
                    </div>
                    <h4>Bạn chắc chắn muốn thoát?</h4>
                </div>
            </div>
            <!-- Modal footer -->
            <div class="modal-footer">
                <button type="button" class="btn btn-md btn-danger" onclick="logOut()">Có</button>
                <button type="button" class="btn btn-md btn-white" data-dismiss="modal">Đóng</button>
            </div>
        </div>
    </div>
    <script>
        function logOut() {
                    window.location.href = "LogOut";
                }
    </script>
</div>