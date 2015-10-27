package com.example


import javax.servlet.http._

class MyServlet extends HttpServlet {

  override def doGet(request: HttpServletRequest, response: HttpServletResponse) {
    response.setContentType("text/html")
    response.setCharacterEncoding("UTF-8")
    response.getWriter.write("""<h1>Hello, Embedded Jetty!</h1>""")
  }
}
