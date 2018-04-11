<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head><title>Spring Pizza</title></head>

  <body>
	<h2>Thank you for your order!</h2>
	
<form:form>
  <input type="hidden" name="_flowExecutionKey" 
         value="${flowExecutionKey}"/>
  <input type="hidden" name="_eventId"
         value="finished" />
  <input type="submit" value="Finished" />
</form:form>

		
    <a href='${flowExecutionUrl}&_eventId=finished'>Finish</a>
	</body>
</html>