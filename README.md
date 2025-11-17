After building the JAR, it should be placed in <APIM_HOME>/lib/runtimes/cxf3/
Within your custom web application, you should replace the reference to org.wso2.carbon.apimgt.rest.api.util.interceptors.auth.OAuthAuthenticationInterceptor with the newly implemented interceptor class, in beans.xml and web.xml.
