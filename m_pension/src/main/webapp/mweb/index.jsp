<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>호텔 & 펜션 예약시스템</title>
    <link rel="stylesheet" type="text/css" href="./css/m_index.css?v=2">
    <script src="./js/m_index.js?v=1"></script>
</head>
<body>
<!-- 상단 시작 -->
<%@ include file="./top.jsp"%>
<!-- 상단 끝 -->
<main>
<!-- 배너 -->
<%@ include file="./banner.jsp"%>
<!-- 배너 끝-->
<!-- 중단 -->
<%@ include file="./main.jsp" %>
<!-- 하단 시작 -->
<%@ include file="./qmenu.jsp" %>
</main>
<footer>
<%@ include file="./copy.jsp" %>
</footer>
</body>
</html>