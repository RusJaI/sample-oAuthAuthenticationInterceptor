package org.example.oauthinterceptor;

import org.apache.commons.logging.Log;
import org.apache.cxf.message.Message;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.apimgt.rest.api.util.MethodStats;
import org.wso2.carbon.apimgt.rest.api.util.interceptors.auth.OAuthAuthenticationInterceptor;

public class OauthInterceptor extends OAuthAuthenticationInterceptor {
    private static final Log logger = LogFactory.getLog(OauthInterceptor.class);

    public OauthInterceptor() {
        //We will use PRE_INVOKE phase as we need to process message before hit actual service
        logger.info("######## OauthInterceptor initialized ########");
    }

    @Override
    @MethodStats
    public void handleMessage(Message inMessage) {

        //by-passes the interceptor if user calls an anonymous api
        System.out.println("######## OauthInterceptor handleMessage invoked ########");
    }

}