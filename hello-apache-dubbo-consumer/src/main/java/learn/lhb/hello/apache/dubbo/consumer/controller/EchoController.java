package learn.lhb.hello.apache.dubbo.consumer.controller;

import learn.lhb.hello.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 梁鸿斌
 * @date 2020/2/23.
 * @time 12:02
 */
@RestController
public class EchoController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {
        return echoService.echo(string);
    }
}
