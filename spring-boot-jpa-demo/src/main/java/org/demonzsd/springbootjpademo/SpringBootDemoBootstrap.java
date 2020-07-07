package org.demonzsd.springbootjpademo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.print.attribute.standard.Media;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * SpringBootDemoBootstrap an entry class for this project
 * @author DemonZSD
 */
@SpringBootApplication
public class SpringBootDemoBootstrap implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoBootstrap.class, args);
    }

    @Bean
    public Gson gson(){
        return new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss")
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.TRANSIENT, Modifier.VOLATILE)
                .create();
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        GsonHttpMessageConverter gsonConverter = new GsonHttpMessageConverter(gson());
        List<MediaType> supportMediaType = new ArrayList<>();
        supportMediaType.add(MediaType.APPLICATION_JSON_UTF8);
        gsonConverter.setSupportedMediaTypes(supportMediaType);
        gsonConverter.setDefaultCharset(StandardCharsets.UTF_8);
        /*
         * SpringBoot 2.0.1版本中加载 WebMvcConfigurer 的顺序发生了变动，
         * 故需使用 converters.add(0, converter);指定 GsonHttpMessageConverter
         * 在converters内的顺序，否则在SpringBoot 2.0.1及之后的版本中将优先使用Jackson处理
         * 如果不指定顺序，则需要排除jar包
         * {@code com.fasterxml.jackson.core} 的引用
         */
        converters.add(0, gsonConverter);
    }
}
