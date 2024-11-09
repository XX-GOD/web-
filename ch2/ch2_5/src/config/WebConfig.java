package config;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import jakarta.servlet.MultipartConfigElement;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration.Dynamic;
public class WebConfig implements WebApplicationInitializer{
	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		AnnotationConfigWebApplicationContext ctx 
		= new AnnotationConfigWebApplicationContext();
		ctx.register(SpringMVCConfig.class);//注册Spring MVC的Java配置类SpringMVCConfig
		ctx.setServletContext(arg0);//和当前ServletContext关联
		/**
		 * 注册Spring MVC的DispatcherServlet
		 */
		Dynamic servlet = arg0.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.setMultipartConfig(getMultiPartConfig());
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}
	private MultipartConfigElement getMultiPartConfig() {
        String location = "";
        long maxFileSize = 20848820;//允许上传文件大小的最大值，默认为-1（不限制）
        long maxRequestSize = 418018841;//multipart/form-data请求允许的最大值，默认为-1（不限制）
        int fileSizeThreshold = 1048576;//文件将写入磁盘的阈值大小，默认为0 
        return new MultipartConfigElement(
            location,
            maxFileSize,
            maxRequestSize,
            fileSizeThreshold
        );
	}
}
