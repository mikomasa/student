package tool;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class EncodingFilter
 */
@WebFilter(urlPatterns={"/*"})
public class EncodingFilter implements Filter {

    /**
     * Default constructor.
     */
    public void doFilter(
    		ServletRequest request, ServletResponse response,
    		FilterChain chain
    		) throws IOException, ServletException{
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	System.out.println("フィルターの処理");

    	chain.doFilter(request,response);
    	System.out.println("フィルタの後処理");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void init(FilterConfig filterConfig){}
	public void destroy() {}



}
