package com.stripe.android.stripe3ds2.observability;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class DefaultSentryConfig implements SentryConfig {
    public static final DefaultSentryConfig INSTANCE = new DefaultSentryConfig();
    private static final String projectId = "426";
    private static final String key = "dcb428fea25c40e7b99f81ae5981ee6a";
    private static final String secret = "deca87e736574c5c83c07314051fd93a";
    private static final String version = "7";

    private DefaultSentryConfig() {
    }

    @Override // com.stripe.android.stripe3ds2.observability.SentryConfig
    public String getKey() {
        return key;
    }

    @Override // com.stripe.android.stripe3ds2.observability.SentryConfig
    public String getProjectId() {
        return projectId;
    }

    @Override // com.stripe.android.stripe3ds2.observability.SentryConfig
    public String getSecret() {
        return secret;
    }

    @Override // com.stripe.android.stripe3ds2.observability.SentryConfig
    public String getTimestamp() {
        long currentTimeMillis = System.currentTimeMillis();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis);
        long millis = currentTimeMillis - TimeUnit.SECONDS.toMillis(seconds);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(seconds);
        sb2.append(CoreConstants.DOT);
        sb2.append(millis);
        return sb2.toString();
    }

    @Override // com.stripe.android.stripe3ds2.observability.SentryConfig
    public String getVersion() {
        return version;
    }
}