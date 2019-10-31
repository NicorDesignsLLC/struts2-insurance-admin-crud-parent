# struts2-insurance-admin-crud-6

#This App will add the Maria JDBC Drive to the dependencies in the Maven POM, and use that to setup a Test Servlet that will use the JDBC
#Connection pool to get a list of the Admin Users to diplay them
#We defined the Connection pool in META-INF/context.xml and added a reference to the DB Resource name in web.xml
#Because we used a servlet we also had to change out struts.xml config files
#with <constant name="struts.action.excludePattern" value="/usersServlet"/> in insurance.xml
#and we had to disable the default action in struts.xml
# <!-- Do not enable index/HelloWorld Action by default so that we can call the Users Test Servlet -->
#        <!-- >default-action-ref name="index"/ -->
# Or else our servlet call would always end up with a default action call 