
package com.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
@WebFilter("/*")
public class TimeFilter implements Filter{

	public void init(FilterConfig filterconfig)throws ServletException{}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest=(HttpServletRequest)request;
		
		String buttonName= httpServletRequest.getParameter("buttonName");
		System.out.println("buttonname="+buttonName);
		
		String resourceName=httpServletRequest.getServletPath();
		System.out.println("Hello resource name= "+resourceName+"at "+new Date());
		//chain.doFilter(request,response);//GO Ahead!!!!!!!
		
		if(buttonName!=null && "NotReady".equals(buttonName)) {
			httpServletRequest.getRequestDispatcher("notready.jsp").forward(request, response);
		}
		else {
			chain.doFilter(request,response);//GO Ahead!!!!!!!
		}
		
		
		
	}

}
