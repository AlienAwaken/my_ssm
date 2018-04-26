package com.zrsf.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fChain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest=(HttpServletRequest)req;
		HttpServletResponse httpServletResponse=(HttpServletResponse)resp;
		HttpSession session = httpServletRequest.getSession();
		String user = (String) session.getAttribute("user");
		String requestURI = httpServletRequest.getRequestURI();
		String contextPath = httpServletRequest.getContextPath();
		if(requestURI.contains("/login.jsp")) {
			fChain.doFilter(req, resp);
			return;
		}
		if(requestURI.contains("/sys/login")) {
			fChain.doFilter(req, resp);
			return;
		}
		
		if(user==null||user.equals("")) {
			//httpServletResponse.sendRedirect(contextPath+"/login.jsp");
			httpServletRequest.getRequestDispatcher("WEB-INF/view/jsp/sys/login.jsp").forward(httpServletRequest, httpServletResponse);
		}else {
			if(requestURI.equals("/ssmdemo/")||requestURI.equals(contextPath)) {
				httpServletRequest.getRequestDispatcher("WEB-INF/view/jsp/main/hello.jsp").forward(httpServletRequest, httpServletResponse);
			}else {
				fChain.doFilter(req, resp);
			}
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
