package com.github.autolog.controller;

import java.util.concurrent.TimeUnit;

import com.github.autolog.context.ApplicationUserContext;
import com.github.autolog.dto.People;
import com.github.autolog.dto.Person;
import com.github.autolog.dto.TestParam;
import com.github.autolog.dto.User;
import com.github.autolog.methodParamLog.annotation.MethodParamLog;
import com.github.autolog.placeholderLog.annotation.PlaceholderLog;
import com.github.autolog.service.IndexService;
import com.github.autolog.util.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengyue
 * @date 2021/5/21
 */
@RestController
public class IndexController {


    @GetMapping("index")
    @MethodParamLog
    public String index(@RequestParam("str1") String str, @RequestParam("str2") String str2)
        throws InterruptedException {
        TimeUnit.SECONDS.sleep(2L);
        return str + str2 + "hahahh";
    }

    @PostMapping("person")
    @MethodParamLog(countExecuteTime = true)
    // @PlaceholderLog(content = "我#{#person.name + '的年龄是:' + #person.age}", currentUser = ApplicationUserContext.class)
    // @PlaceholderLog(content = "当前用户:#{#applicationUserContext.username}", currentUser = ApplicationUserContext.class)
    public String person(@RequestBody TestParam testParam)
        throws InterruptedException {
        IndexController controller = SpringUtil.getBean(IndexController.class);
        return controller.person(testParam.getPerson(),testParam.getUser(),testParam.getPeople(),"hahah");
    }

    @PlaceholderLog(
        content = "当前用户:#{#applicationUserContext.username+ '我是p0：'+ #p0['name'] + '的年龄是:' + #p0['age']   "
            + "+  '我是p1：'+ #p1['name'] + '的年龄是:' + #p1['age'] +'地址是：'+#p1['address']+'我是p2：'+ #p2['name'] + '的年龄是:' + #p2['age'] + '字符串测试'+#p3}",
        currentUser = ApplicationUserContext.class)
    public String person(Person person, User user, People people, String str) {
        return "1";
    }
}
