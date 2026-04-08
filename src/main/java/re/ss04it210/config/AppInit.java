package re.ss04it210.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // không cần root config
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ AppConfig.class }; // load config chính
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{ "/" }; // map toàn bộ request
    }
}