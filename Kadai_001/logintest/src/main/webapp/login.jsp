<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" name="viewport" content="width=device-width,initial-scale=1">
    <title>ログイン画面</title>
    <link rel="stylesheet" href="login.css">
</head>
  <form name="login_form" action="/logintest/AccountSearch" method="post">
  <div class="login_form_top">
    <h1>ログイン</h1>
    <p>UserID、Passwordをご入力の上、「ログイン」ボタンをクリックしてください</p>
  </div>
  <div class="login_form_btm">
    <input type="id" name="loginId" placeholder="UserID" required>
    <input type="password" name="pass" placeholder="Password" required>
    <input type="submit" name="botton" value="ログイン">
    </form>
    <p>アカウント登録がお済みでない方「新規登録」ボタンをクリックしてください</p>
    <input type="submit" name="botton" onclick="location.href='register.jsp'" value="新規登録">
</div>
  
</form>
