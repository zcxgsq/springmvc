package com.zcx.service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import javax.sound.midi.ShortMessage;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zcx
 * @Title service层
 * @date 2018年11月07日 18:50
 **/
@Service
public class CodeService {

    private Map<String, MessageAttributeValue> smsAttributes;

    private String awsAppId = "xxxxxxxxxxxxxxxxx";

    private String awsAppKey = "xxxxxxxxxxxxxx";

    public String sendService(String telephone) {
        int ran = (int) (Math.random() * 9000 + 1000);
        String messagetext = ran + "";
        String content = "auth code：" + messagetext + ",Input valid in 1 minute. Please don't leak to anyone";
//        String content = "auth code：" + messagetext;
        PublishResult publishResult = sendSMSMessage(telephone, content);
        return publishResult.getMessageId();
    }

    public Map<String, MessageAttributeValue> getDefaultSMSAttributes() {
        if (smsAttributes == null) {
            smsAttributes = new HashMap<>();
            smsAttributes.put("AWS.SNS.SMS.SenderID", new MessageAttributeValue()
                    .withStringValue("mySenderID")
                    .withDataType("String"));
            smsAttributes.put("AWS.SNS.SMS.MaxPrice", new MessageAttributeValue()
                    .withStringValue("0.50")
                    .withDataType("Number"));
        }
        return smsAttributes;
    }
    public PublishResult sendSMSMessage(String phoneNumber, String message) {
        return sendSMSMessage(phoneNumber, message, getDefaultSMSAttributes());
    }
    public PublishResult sendSMSMessage(String phoneNumber, String message, Map<String, MessageAttributeValue> smsAttributes) {

        final AWSCredentials awsCredentials = new AWSCredentials() {
            @Override
            public String getAWSAccessKeyId() {
                return awsAppId; // 带有发短信权限的 IAM 的 ACCESS_KEY
            }

            @Override
            public String getAWSSecretKey() {
                return awsAppKey; // 带有发短信权限的 IAM 的 SECRET_KEY
            }
        };
        AWSCredentialsProvider provider = new AWSCredentialsProvider() {
            @Override
            public AWSCredentials getCredentials() {
                return awsCredentials;
            }

            @Override
            public void refresh() {
            }
        };
        AmazonSNS amazonSNS = null;
        try {
            amazonSNS = AmazonSNSClientBuilder.standard()
                    .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                    .withRegion("ap-southeast-1")
                    .build();
        } catch (Exception e) {

        }
        return amazonSNS.publish(
                new PublishRequest()
                        .withMessage(message)
                        .withPhoneNumber(phoneNumber)
                        .withMessageAttributes(smsAttributes));
    }

}
