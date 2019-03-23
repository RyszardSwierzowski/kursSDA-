package pl.swierzowski.filtry;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Logger;

@WebFilter(urlPatterns = {"/filtr/index.jsp"})
public class Zad1 implements Filter {

    private static final Logger FILTER_LOGGER
            = Logger.getLogger(BaseFilter.class.getName());

    private String encoding="ISO-8859-1";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        encoding = filterConfig.getInitParameter("requestEncoding");
//        if (encoding == null) encoding = "ISO-8859-1";
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {





        HttpServletRequest request = (HttpServletRequest) servletRequest;

        servletResponse.setContentType("text/html; charset=ISO-8859-1");
        servletResponse.setCharacterEncoding(encoding);

        Enumeration<String> hedersNamnes = request.getHeaderNames();
        FILTER_LOGGER.info(request.getRequestURI());

        while(hedersNamnes.hasMoreElements()){
            FILTER_LOGGER.info(request.getHeader(hedersNamnes.nextElement()));
        }

        filterChain.doFilter(servletRequest,servletResponse);


    }

    @Override
    public void destroy() {

    }
}
