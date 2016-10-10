<%@ page language = "java" contentType = "text/html; charset = UTF-8">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録</title>
</head>
<body>
<form action = "/product01/RegisterUser" method="post">
<ul>
<li>パスワード<input type=password placeholder="パスワード" name="password"></li>
<li>ニックネーム<input type="text" placeholder="ニックネーム" name="name"></li>
<li>メールアドレス<input type=text placeholder="メールアドレス" name="email"></li>
<li>生年月日<input type="text" placeholder="生年月日" name="birthday"></li>
<li>性別<input type="radio" name="gender" value="男" checked>男
<input type="radio" name="gender" value="女">女</li>
</ul>
<input type="submit" value="送信"/>
</form>
</body>
</html>
