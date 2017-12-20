package com.xianjinxia.controller;

import com.xianjinxia.enums.ResultEnum;
import com.xianjinxia.utils.ResultUtils;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Kevin.Tse
 * @version V1.0
 * @描述 邮件发送接口
 * @create 2017-12-18 16:30
 */
@RestController
public class EmailController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private JavaMailSender javaMailSender;

//    @Autowired
//    private VelocityEngine velocityEngine;


    /**
     * @author Kevin.Tse
     * @version V1.0
     * @描述 发送邮件
     * @create 2017/12/18  15:55
     **/
    @PostMapping("/sendEmail")
    @ApiOperation(value = "/sendEmail")
    public String sendEmail1() {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("lr3699@163.com");
            message.setTo("xlr@xianjinxia.com");
            message.setSentDate(new Date());
            message.setSubject("主题：默认主题");
            message.setText("这里是内容");
            javaMailSender.send(message);
            logger.info("发送邮件成功");
        } catch (Exception e) {
            logger.error("sendEmail  is error:", e);
        }
        return ResultUtils.returnJsonMsg(ResultEnum.SUCCESS);
    }

    /**
     * @author Kevin.Tse
     * @version V1.0
     * @描述 发送邮件
     * @create 2017/12/18  15:55
     **/
    @PostMapping("/sendEmail2")
    @ApiOperation(value = "/sendEmail2")
    public String sendEmail2() {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("lr3699@163.com");
            helper.setTo("xlr@xianjinxia.com");
            helper.setSentDate(new Date());
            helper.setSubject("主题：默认主题");
            helper.setText("这里是内容");

            FileSystemResource file1 = new FileSystemResource("E:\\1.txt");
            FileSystemResource file2 = new FileSystemResource("E:\\2.txt");
            helper.addAttachment("附件1.txt", file1);
            helper.addAttachment("附件2.txt", file2);
            javaMailSender.send(message);
            logger.info("发送邮件成功");
        } catch (Exception e) {
            logger.error("sendEmail  is error:", e);
        }
        return ResultUtils.returnJsonMsg(ResultEnum.SUCCESS);
    }

    /**
     * @author Kevin.Tse
     * @version V1.0
     * @描述 发送邮件
     * @create 2017/12/18  15:55
     **/
    @PostMapping("/sendEmail3")
    @ApiOperation(value = "/sendEmail3")
    public String sendEmail3() {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("lr3699@163.com");
            helper.setTo("xlr@xianjinxia.com");
            helper.setSentDate(new Date());
            helper.setSubject("主题：默认主题");
            helper.setText("这里是内容");

            Map<String, Object> model = new HashMap<>(16);
            model.put("username", "admin");
            String vm = "invite_email.vm";

           // String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,"template.vm","UTF-8",model);
          //  helper.setText(text, true);
            javaMailSender.send(message);
            logger.info("发送邮件成功");
        } catch (Exception e) {
            logger.error("sendEmail  is error:", e);
        }
        return ResultUtils.returnJsonMsg(ResultEnum.SUCCESS);
    }

}
