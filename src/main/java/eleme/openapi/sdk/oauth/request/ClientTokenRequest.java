package eleme.openapi.sdk.oauth.request;

import eleme.openapi.sdk.config.OverallContext;
import eleme.openapi.sdk.oauth.BaseOAuthRequest;
import eleme.openapi.sdk.oauth.response.Token;

import java.util.Map;

public class ClientTokenRequest extends BaseOAuthRequest<Token> {

    public Class<Token> getResponseClass() {
        return Token.class;
    }

    public Map<String, String> getHeaderMap()  {
        setAuthorization(OverallContext.getApp_key(), OverallContext.getApp_secret());
        return super.headerMap;
    }

    public Map<String, String> getBodyMap() {
        putBodyParam("grant_type", "client_credentials");
        return super.bodyMap;
    }

    public Map<String, String> getBodyMap(String appKey) {
        return null;
    }
}
