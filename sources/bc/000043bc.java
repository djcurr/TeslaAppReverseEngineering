package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class f2 {

    /* renamed from: a  reason: collision with root package name */
    public final Date f18572a;

    public f2() {
        this.f18572a = new Date();
    }

    public /* synthetic */ f2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final CrashLogLevel a(int i11) {
        switch (i11) {
            case 2:
                return CrashLogLevel.INFO;
            case 3:
                return CrashLogLevel.DEBUG;
            case 4:
                return CrashLogLevel.INFO;
            case 5:
                return CrashLogLevel.WARNING;
            case 6:
                return CrashLogLevel.ERROR;
            case 7:
                return CrashLogLevel.DEBUG;
            default:
                return CrashLogLevel.ERROR;
        }
    }

    public abstract Map<String, String> a();

    public abstract int b();

    public abstract String c();
}