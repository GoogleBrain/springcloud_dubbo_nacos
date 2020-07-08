package cn.kkkkka;

import cn.kkkk.studentInter;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@Service
public class Hu implements studentInter {

    @Value("${name.age}")
    private String age;

    public String getNow() {
        return "aaaaaaa"+age;
    }
}
