package com.bpm.pag.backend.rest.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;


@Component public class SimpleFilter implements Filter {

@Override
public void init(FilterConfig arg0) throws ServletException {}

@Override
public void doFilter(ServletRequest req, ServletResponse resp,
                     FilterChain chain) throws IOException, ServletException {
    // TODO Auto-generated method stub
    HttpServletResponse response=(HttpServletResponse) resp;

    response.setHeader("Access-Control-Allow-Origin", "*");
    response.setHeader("Access-Control-Allow-Methods", " POST, GET, PUT, OPTIONS, DELETE");
    response.setHeader("Access-Control-Max-Age", "3600");
    response.setHeader("Access-Control-Allow-Headers", "Content-Type");

    chain.doFilter(req, resp);
}

@Override
public void destroy() {}

}