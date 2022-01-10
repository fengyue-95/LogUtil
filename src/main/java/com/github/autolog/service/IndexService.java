package com.github.autolog.service;

import com.github.autolog.context.ApplicationUserContext;
import com.github.autolog.dto.People;
import com.github.autolog.dto.Person;
import com.github.autolog.dto.User;
import com.github.autolog.placeholderLog.annotation.PlaceholderLog;
import org.springframework.stereotype.Service;

/**
 * @author fengyue
 * @date 2022/1/10
 */
@Service
public class IndexService {

    @PlaceholderLog(
        content = "当前用户:#{#applicationUserContext.username+ '我是p0：'+ #p0['name'] + '的年龄是:' + #p0['age']   "
            + "+  '我是p1：'+ #p1['name'] + '的年龄是:' + #p1['age'] +'地址是：'+#p1['address']+'我是p2：'+ #p2['name'] + '的年龄是:' + #p2['age'] + '字符串测试'+#p3}",
        currentUser = ApplicationUserContext.class)
    public String person(Person person, User user, People people, String str) {
        return "1";
    }
}
