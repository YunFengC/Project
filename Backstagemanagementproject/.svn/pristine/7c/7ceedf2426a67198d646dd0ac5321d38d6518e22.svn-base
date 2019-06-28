package com.backstage.controller;

import com.backstage.damain.SysLog;
import com.backstage.service.SysLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

@Aspect
@Component
@RequestMapping("/sysLog")
public class LogAop {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private SysLogService sysLogService;

    private Date startTime;//访问时间
    private Class executionClass;//访问的类
    private Method executionMethod;//访问的方法

    /**
     * 前置通知
     * @param jp
     * @throws NoSuchMethodException
     */
    @Before("execution(* com.backstage.controller.*.*(..))")
    public void doBefore(JoinPoint jp) throws NoSuchMethodException {
        startTime = new Date();//访问时间
        //获取访问的类
        executionClass = jp.getTarget().getClass();
        //获取访问方法的名称
        String methodName = jp.getSignature().getName();
        //获取访问方法的参数
        Object[] args = jp.getArgs();
        //判断方法是否有参数
        if(args==null||args.length==0){
            //获取访问的方法
            executionMethod = executionClass.getMethod(methodName);
        }else {
            //如果有参数的话就将args数组获取对应的class装到class数组中
            Class[] classArgs = new Class[args.length];
            for (int i = 0; i < args.length; i++){
                classArgs[i] = args[i].getClass();
            }
             executionMethod = executionClass.getMethod(methodName, classArgs);

        }
    }

    /**
     * 后置通知
     * @param jp
     */
    @After("execution(* com.backstage.controller.*.*(..))")
    public void doAfter(JoinPoint jp){
        //获取访问时长
        Long time = new Date().getTime()-startTime.getTime();
        //获取访问路径
        String url = "";
        //判断访问的类和方法不为空且不是本类
        if(executionClass!=null&&executionMethod!=null&&executionClass!=LogAop.class){
            //获取类上的Anno
            RequestMapping requestMappings = (RequestMapping) executionClass.getAnnotation(RequestMapping.class);
            if(requestMappings!=null) {
                //获取RequestMapping的value
                String[] classValue = requestMappings.value();
                //获取方法上的Anno
                RequestMapping annotation = executionMethod.getAnnotation(RequestMapping.class);
                if (annotation != null) {
                    //获取RequestMapping的value
                    String[] methodValue = annotation.value();
                    url = classValue[0] + methodValue[0];
                }
            }
        }
        //获取访问的IP
        String remoteAddr = request.getRemoteAddr();
        //获取当前操作者
        SecurityContext context = SecurityContextHolder.getContext();
        User user = (User) context.getAuthentication().getPrincipal();
        String username = user.getUsername();

        //封装数据
        SysLog sysLog = new SysLog();
        sysLog.setExecutionTime(time);
        sysLog.setIp(remoteAddr);
        sysLog.setMethod("类名="+executionClass.getName()+"方法名="+executionMethod.getName());
        sysLog.setUrl(url);
        sysLog.setUsername(username);
        sysLog.setVisitTime(startTime);

        sysLogService.save(sysLog);
    }
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){

        List<SysLog> list = sysLogService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("sysLogs",list);
        modelAndView.setViewName("syslog-list");
        return modelAndView;
    }
}
