<%@include file="header.jsp"%>
<link rel="stylesheet" type="text/css" href="task 1.css">
        <div class="login">
            <h1>Login here</h1>
            <form class="login1" method="post" action="ServletManagement">
                <div>
                    <label for="username">Username</label>
                    <input type="text" name="username" class="borders" id="username" required>
                </div>
                <div>
                    <label for="email">Email</label>
                    <input type="email" name="email" class="borders" id="email" required>
                </div>
                <div>
                    <label for="password">Password</label>
                    <input type="password" name="password" class="borders" id="password" required>
                </div>
                <div class="others">
                    <input type="submit" name="login" value="Login" id="submit">
                </div>
            </form>
        </div>
<%@include file="footer.jsp"%>
