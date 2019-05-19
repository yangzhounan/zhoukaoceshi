<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<link rel="stylesheet" type="text/css" href="/css/css.css">
<script type="text/javascript">
      $(function(){
    	  $.ajax({
    		  url:"brandList",
    		  type:"post",
    	      dataType:"json",
    	      success:function(obj){
    	    	  for(var i=0;i<obj.length;i++){
    	    		  $("[name='brand.bid']").append("<option value="+obj[i].bid+">--"+obj[i].bname+"--</option>")
    	    	  }
    	      }
    		  
    	  })
      })

</script>
</head>
<body>
<form action="add">
    <table>
       <tr>
         <td>名称:</td>
         <td>
            <input type="text" name="gname">
         </td>
       </tr>
       <tr>
         <td>价格:</td>
         <td>
            <input type="text" name="price">
         </td>
       </tr>
       <tr>
         <td>尺寸:</td>
         <td>
            <input type="text" name="size">
         </td>
       </tr>
       <tr>
         <td>数量:</td>
         <td>
            <input type="text" name="gnum">
         </td>
       </tr>
       <tr>
         <td>品牌:</td>
         <td>
            <select name="brand.bid">
               <option>--请选择---</option>            
            </select>
         </td>
       </tr>
       <tr>
         <td colspan="10">
            <input type="submit">
         </td>
       </tr>
    </table>
</form>
</body>
</html>