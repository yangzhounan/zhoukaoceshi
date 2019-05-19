<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<link rel="stylesheet" type="text/css" href="/css/css.css">
<script type="text/javascript">
    function tj(){
    	location="tj";
    }
    
    function qx(){
		$(":checkbox").prop("checked",true);
	}
    
    function fx(){
		$(":checkbox").each(function(){
			var m = $(this).prop("checked");
			$(this).prop("checked",!m);
		});
	}
    
    function qbx(){
		$(":checkbox").prop("checked",false);
	}
    
    
    
</script>
</head>
<body>
<form action="list" method="post">
    <input type="text" name="mohu" value="${map.mohu!''}">
    <input type="submit">
</form>
<table>
   <tr>
      <td colspan="10">
        <input type="button" value="全选" onclick="qx()">
        <input type="button" value="反选" onclick="fx()">
        <input type="button" value="全不选" onclick="qbx()">
        <input type="button" value="删除" onclick="plsc()">
      </td>
   </tr>
   <tr>
     <td></td>
     <td>编号</td>
     <td>名称</td>
     <td>价格</td>
     <td>尺寸</td>
     <td>数量</td>
     <td>品牌</td>
     <td>品牌介绍</td>
     <td>操作</td>
   </tr>
   <#list list as l>
       <tr>
          <td>
             <input type="checkbox" value="${l.gid}">
          </td>
          <td>${l.gid}</td>
          <td>${l.gname}</td>
          <td>${l.price}</td>
          <td>${l.size}</td>
          <td>${l.gnum}</td>
          <td>${l.brand.bname}</td>
          <td>${l.brand.descp}</td>
          <td>
             <input type="button" value="添加" onclick="tj()">
          </td>
       </tr>
   </#list>
   <tr>
    <td colspan="10">
      <#include "page.ftl">
    </td>
   </tr>
</table>
</body>
</html>