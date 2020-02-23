package learn.lhb.hello.apache.dubbo.provider.service;

import learn.lhb.hello.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author 梁鸿斌
 * @date 2020/2/23.
 * @time 11:46
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String echo(String string) {
        return "Echo Dubbo "+string+" ,port: "+port;
    }
}
