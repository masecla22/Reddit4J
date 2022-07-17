package masecla.reddit4j.objects;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import masecla.reddit4j.deserializers.ExpiresAtDeserializer;

import java.time.LocalDateTime;

public class AccessToken {
    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("token_type")
    private String tokenType; // TODO: 17.07.2022 Replace with Enum

    @SerializedName("expires_in")
    @JsonAdapter(ExpiresAtDeserializer.class)
    private LocalDateTime expiresAt;

    @SerializedName("scope")
    private String scope; // TODO: 17.07.2022 Replace with Enum

    public boolean isExpired() {
        return LocalDateTime.now().isAfter(expiresAt);
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "AccessToken{" +
                "accessToken='" + accessToken + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", expiresAt=" + expiresAt +
                ", scope='" + scope + '\'' +
                ", expired=" + isExpired() +
                '}';
    }
}
