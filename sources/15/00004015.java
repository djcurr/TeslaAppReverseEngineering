package com.plaid.internal.core.crashreporting.internal.models;

import com.stripe.android.networking.FraudDetectionData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nn.c;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class Crash {
    @c("breadcrumbs")
    private final List<Breadcrumb> breadcrumbs;
    @c("checksum")
    private final String checksum;
    @c("contexts")
    private final Map<String, CrashContext> contexts;
    @c("culprit")
    private final String culprit;
    @c("debug_meta")
    private final DebugMetaInterface debugMetaInterface;
    @c("dist")
    private final String dist;
    @c("environment")
    private final String environment;
    @c(ExceptionInterface.EXCEPTION_INTERFACE)
    private final ExceptionInterface exceptionInterface;
    @c("fingerprint")
    private final List<String> fingerprint;
    @c("event_id")

    /* renamed from: id  reason: collision with root package name */
    private final String f18274id;
    @c("level")
    private final CrashLogLevel level;
    @c("logger")
    private final String logger;
    @c("message")
    private final String message;
    @c("method")
    private final String method;
    @c("platform")
    private final String platform;
    @c("release")
    private final String release;
    @c("serverName")
    private final String serverName;
    @c("tags")
    private final Map<String, String> tags;
    @c(FraudDetectionData.KEY_TIMESTAMP)
    private final String timestamp;

    public Crash(String id2, String str, String str2, CrashLogLevel crashLogLevel, String str3, String platform, String str4, String str5, Map<String, String> tags, List<Breadcrumb> breadcrumbs, Map<String, CrashContext> contexts, String str6, String str7, String str8, String str9, List<String> list, String str10, ExceptionInterface exceptionInterface, DebugMetaInterface debugMetaInterface) {
        s.g(id2, "id");
        s.g(platform, "platform");
        s.g(tags, "tags");
        s.g(breadcrumbs, "breadcrumbs");
        s.g(contexts, "contexts");
        this.f18274id = id2;
        this.message = str;
        this.timestamp = str2;
        this.level = crashLogLevel;
        this.logger = str3;
        this.platform = platform;
        this.culprit = str4;
        this.method = str5;
        this.tags = tags;
        this.breadcrumbs = breadcrumbs;
        this.contexts = contexts;
        this.release = str6;
        this.dist = str7;
        this.environment = str8;
        this.serverName = str9;
        this.fingerprint = list;
        this.checksum = str10;
        this.exceptionInterface = exceptionInterface;
        this.debugMetaInterface = debugMetaInterface;
    }

    public final List<Breadcrumb> getBreadcrumbs$crash_reporting_release() {
        return this.breadcrumbs;
    }

    public final String getChecksum$crash_reporting_release() {
        return this.checksum;
    }

    public final Map<String, CrashContext> getContexts$crash_reporting_release() {
        return this.contexts;
    }

    public final String getCulprit$crash_reporting_release() {
        return this.culprit;
    }

    public final DebugMetaInterface getDebugMetaInterface$crash_reporting_release() {
        return this.debugMetaInterface;
    }

    public final String getDist$crash_reporting_release() {
        return this.dist;
    }

    public final String getEnvironment$crash_reporting_release() {
        return this.environment;
    }

    public final ExceptionInterface getExceptionInterface$crash_reporting_release() {
        return this.exceptionInterface;
    }

    public final List<String> getFingerprint$crash_reporting_release() {
        return this.fingerprint;
    }

    public final String getId() {
        return this.f18274id;
    }

    public final CrashLogLevel getLevel$crash_reporting_release() {
        return this.level;
    }

    public final String getLogger$crash_reporting_release() {
        return this.logger;
    }

    public final String getMessage$crash_reporting_release() {
        return this.message;
    }

    public final String getMethod$crash_reporting_release() {
        return this.method;
    }

    public final String getPlatform$crash_reporting_release() {
        return this.platform;
    }

    public final String getRelease$crash_reporting_release() {
        return this.release;
    }

    public final String getServerName$crash_reporting_release() {
        return this.serverName;
    }

    public final Map<String, String> getTags$crash_reporting_release() {
        return this.tags;
    }

    public final String getTimestamp$crash_reporting_release() {
        return this.timestamp;
    }

    public /* synthetic */ Crash(String str, String str2, String str3, CrashLogLevel crashLogLevel, String str4, String str5, String str6, String str7, Map map, List list, Map map2, String str8, String str9, String str10, String str11, List list2, String str12, ExceptionInterface exceptionInterface, DebugMetaInterface debugMetaInterface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : crashLogLevel, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? "java" : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? new HashMap() : map, (i11 & 512) != 0 ? new ArrayList() : list, (i11 & 1024) != 0 ? new HashMap() : map2, (i11 & 2048) != 0 ? null : str8, (i11 & 4096) != 0 ? null : str9, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str10, (i11 & 16384) != 0 ? null : str11, (i11 & 32768) != 0 ? null : list2, (i11 & 65536) != 0 ? null : str12, (i11 & 131072) != 0 ? null : exceptionInterface, (i11 & 262144) == 0 ? debugMetaInterface : null);
    }
}