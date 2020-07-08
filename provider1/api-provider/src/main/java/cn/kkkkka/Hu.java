package cn.kkkkka;

import cn.kkkk.studentInter;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 配置数据动态刷新
 */
@RefreshScope
@Service
public class Hu implements studentInter {

    @Value("${name.age}")
    private String age;

    public String getNow() {
        return "aaaaaaa"+age;
    }
}
