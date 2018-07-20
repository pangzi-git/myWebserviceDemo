<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>报销易 - 系统错误</title>
    <link rel="SHORTCUT ICON" href="resource/images/ico.ico">
    <style type="text/css">
        * {
            box-sizing: border-box;
        }

        html, body {
            margin: 0;
            padding: 0;
        }

        body {
            background-color: #e9e9eb;
            font-family: "Segoe UI", "Lucida Grande", Helvetica, Arial, "Microsoft YaHei", FreeSans, Arimo, "Droid Sans", "wenquanyi micro hei", "Hiragino Sans GB", "Hiragino Sans GB W3", FontAwesome, sans-serif;
        }

        .error {
            text-align: center;
            width: 728px;
            margin: 100px auto 0;
        }

        .error img {
            max-width: 728px;
        }

        a {
            color: #fff;
            text-decoration: none;
            margin-top: 5px;
            margin-bottom: 5px;
            background-image: linear-gradient(to bottom, #f0ad4e 0, #eb9316 100%);
            text-shadow: 0 -1px 0 rgba(0, 0, 0, .2);
            box-shadow: inset 0 1px 0 rgba(255, 255, 255, .15), 0 1px 1px rgba(0, 0, 0, .075);
            display: inline-block;
            padding: 6px 12px;
            font-size: 14px;
            font-weight: 400;
            line-height: 1.42857143;
            text-align: center;
            white-space: nowrap;
            vertical-align: middle;
            touch-action: manipulation;
            cursor: pointer;
            -webkit-user-select: none;
            border: 1px solid transparent;
            border-radius: 4px;
        }

        a:hover {
            background-color: #eb9316;
            color: #fff;
            border-color: #d58512;
        }
    </style>
</head>
<body>
<div class="error">
    <!-- 替换图片url 401.jpg/403.jpg/404.jpg/500.jpg -->
    <img src="resource/images/404.jpg"/>

    <div class="error-btn">
        <a href="#">返回</a>
    </div>
</div>
</body>
</html>