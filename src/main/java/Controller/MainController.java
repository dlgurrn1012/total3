package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.model.PageBoard;
import login.dao.LoginDAO;

@WebServlet("/")
public class MainController extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println(request.getRequestURI());
	String[] uris=request.getRequestURI().substring(1).split("/");
	System.out.println(uris.length);
	System.out.println("uris[0]:"+uris[0]);
	String context="/home/";
	String page="section.jsp";
	if(uris[0].equals("") || uris[0].equals("index")) {
	context="/home/";
	page="section.jsp";
	}else {
		context="/"+uris[0]+"/";
		if(uris[0].equals("home")) {
			page="section.jsp";
		}else if(uris[0].equals("intro")) {
			page="intro.jsp";
		}else if(uris[0].equals("realchat")) {
			page="realchat.jsp";
		}else if(uris[0].equals("board")) {
			if(request.getSession().getAttribute("id")==null) {
				//로그인이 되지 않았을 때 서비스 불가
				context="/login/";
				page="login.jsp";
			}else {
				//로그인이 된 상태이므로 board처리
				if(uris.length==1) {
					//페이지 요청에 관한 정보가 있는지 확인
					//만약 없을 경우 기본페이지 1페이지 설정
					int requestPage=1;
					String _reqeustPage=request.getParameter("requestPage");
					if(_reqeustPage!=null && !_reqeustPage.equals("")) {
						requestPage=Integer.parseInt(_reqeustPage);
					}
					//해당페이지에 대한 리스트와 관련된 정보를 요청
					BoardDAO dao=new BoardDAO();
					PageBoard pageboard=dao.list(requestPage);
					request.setAttribute("pageboard", pageboard);
					request.setAttribute("requestPage", requestPage);
					page="list.jsp";
				}else {
					if(uris[1].equals("list")) {
						//페이지 요청에 관한 정보가 있는지 확인
						//만약 없을 경우 기본페이지 1페이지 설정
						int requestPage=1;
						String _reqeustPage=request.getParameter("requestPage");
						if(_reqeustPage!=null && !_reqeustPage.equals("")) {
							requestPage=Integer.parseInt(_reqeustPage);
						}
						//해당페이지에 대한 리스트와 관련된 정보를 요청
						BoardDAO dao=new BoardDAO();
						PageBoard pageboard=dao.list(requestPage);
						request.setAttribute("pageboard", pageboard);
						request.setAttribute("requestPage", requestPage);
						page="list.jsp";
					}else if(uris[1].equals("read")) {
						int idx=Integer.parseInt(request.getParameter("idx"));
						int requestPage=Integer.parseInt(request.getParameter("requestPage"));
						page="read.jsp";
					}else if(uris[1].equals("update")) {
						
					}else if(uris[1].equals("update")) {
						
					}else if(uris[1].equals("update")) {
						
					}else if(uris[1].equals("update")) {
						
					}else if(uris[1].equals("update")) {
						
					}
				
				}
			}
		}else if(uris[0].equals("login")) {  //예를 들어 /login
			if(uris.length==1) {
			page="login.jsp";
			}else {
				if(uris[1].equals("login")) {
					page="login.jsp";
				}else if(uris[1].equals("login.do")) {
					LoginDAO logindao=new LoginDAO();
					int result=logindao.loginCheck
					(request.getParameter("id"), request.getParameter("password"));
					if(result==1) {
						request.getSession().
						setAttribute("id", request.getParameter("id"));
						page="login_sucess.jsp";
					}else {
						request.getSession().invalidate();
						page="login.jsp";
					}
					
				}else if(uris[1].equals("logout")) {
					request.getSession().invalidate();
					context="/home/";
					page="section.jsp";
				}
			}
		}else {
			context="/home/";
			page="section.jsp";
		}
	}
	
	request.setAttribute("section", context+page);
	request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
}
}
