package com.microservice.demo.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.protocol.RequestContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLogginFilter extends ZuulFilter {

	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		
		logger.info(" Zuul Filter Request object info {}",request);
		logger.info(" Zuul Filter Request URI info {}",request.getRequestURI());
		logger.info(" Zuul Filter Request URL {}",request.getRequestURL());
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
