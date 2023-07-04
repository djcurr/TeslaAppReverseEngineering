package com.withpersona.sdk.inquiry.network;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk/inquiry/network/NetworkConstants;", "", "<init>", "()V", "Companion", "network_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class NetworkConstants {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u0003H\u0007¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/network/NetworkConstants$Companion;", "", "", "Lcom/withpersona/sdk/inquiry/network/ServerEndpoint;", "viewRegistry", "<init>", "()V", "network_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String viewRegistry() {
            return "https://withpersona.com";
        }
    }

    public static final String viewRegistry() {
        return Companion.viewRegistry();
    }
}