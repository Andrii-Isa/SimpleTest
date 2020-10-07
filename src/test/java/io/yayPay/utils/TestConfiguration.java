package io.yayPay.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:/test.properties")
public class TestConfiguration {
}
