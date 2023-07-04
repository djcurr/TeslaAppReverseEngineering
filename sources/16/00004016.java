package com.plaid.internal.core.crashreporting.internal.models;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nn.c;

/* loaded from: classes2.dex */
public final class CrashApiOptions {
    @c("apiKey")
    private final String apiKey;
    @c("projectName")
    private final int projectId;
    @c("release")
    private final String release;

    public CrashApiOptions(int i11, String apiKey, String str) {
        s.g(apiKey, "apiKey");
        this.projectId = i11;
        this.apiKey = apiKey;
        this.release = str;
    }

    public static /* synthetic */ CrashApiOptions copy$default(CrashApiOptions crashApiOptions, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = crashApiOptions.projectId;
        }
        if ((i12 & 2) != 0) {
            str = crashApiOptions.apiKey;
        }
        if ((i12 & 4) != 0) {
            str2 = crashApiOptions.release;
        }
        return crashApiOptions.copy(i11, str, str2);
    }

    public final int component1() {
        return this.projectId;
    }

    public final String component2() {
        return this.apiKey;
    }

    public final String component3() {
        return this.release;
    }

    public final CrashApiOptions copy(int i11, String apiKey, String str) {
        s.g(apiKey, "apiKey");
        return new CrashApiOptions(i11, apiKey, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CrashApiOptions) {
            CrashApiOptions crashApiOptions = (CrashApiOptions) obj;
            return this.projectId == crashApiOptions.projectId && s.c(this.apiKey, crashApiOptions.apiKey) && s.c(this.release, crashApiOptions.release);
        }
        return false;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    public final String getRelease() {
        return this.release;
    }

    public int hashCode() {
        int hashCode = (this.apiKey.hashCode() + (Integer.hashCode(this.projectId) * 31)) * 31;
        String str = this.release;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder a11 = g4.a("CrashApiOptions(projectId=");
        a11.append(this.projectId);
        a11.append(", apiKey=");
        a11.append(this.apiKey);
        a11.append(", release=");
        a11.append((Object) this.release);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    public /* synthetic */ CrashApiOptions(int i11, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, (i12 & 4) != 0 ? null : str2);
    }
}