package com.bfh.config;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.SubjectContext;
import org.apache.shiro.web.mgt.DefaultWebSubjectFactory;

/**
 * @Author bfh
 * @Date 2018/3/8.
 * @Description 修改createSubject关闭session的创建
 */
public class StatelessDefaultSubjectFactory extends DefaultWebSubjectFactory {

    @Override
    public Subject createSubject(SubjectContext context) {

        context.setSessionCreationEnabled(false);//不创建session.
        return super.createSubject(context);

    }
}
