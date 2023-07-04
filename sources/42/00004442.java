package com.plaid.internal;

import android.content.Context;
import com.plaid.internal.core.crashreporting.internal.models.Breadcrumb;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import com.plaid.internal.core.crashreporting.internal.models.DebugImage;
import com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface;
import com.plaid.internal.core.crashreporting.internal.models.ExceptionInterface;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f18862a;

    /* renamed from: b  reason: collision with root package name */
    public final CrashApiOptions f18863b;

    /* renamed from: c  reason: collision with root package name */
    public final g2 f18864c;

    /* renamed from: d  reason: collision with root package name */
    public final e3 f18865d;

    /* renamed from: e  reason: collision with root package name */
    public final hb<Breadcrumb> f18866e;

    /* renamed from: f  reason: collision with root package name */
    public UUID f18867f;

    /* renamed from: g  reason: collision with root package name */
    public final vz.k f18868g;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<SimpleDateFormat> {
        public a() {
            super(0);
        }

        @Override // h00.a
        public SimpleDateFormat invoke() {
            j2.this.getClass();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSZ", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("gmt"));
            return simpleDateFormat;
        }
    }

    public j2(Context application, CrashApiOptions crashApiOptions, g2 crashEnvironmentProvider, e3 deviceInfo) {
        vz.k a11;
        kotlin.jvm.internal.s.g(application, "application");
        kotlin.jvm.internal.s.g(crashApiOptions, "crashApiOptions");
        kotlin.jvm.internal.s.g(crashEnvironmentProvider, "crashEnvironmentProvider");
        kotlin.jvm.internal.s.g(deviceInfo, "deviceInfo");
        this.f18862a = application;
        this.f18863b = crashApiOptions;
        this.f18864c = crashEnvironmentProvider;
        this.f18865d = deviceInfo;
        this.f18866e = new hb<>(50);
        a11 = vz.m.a(new a());
        this.f18868g = a11;
    }

    public final Crash a(Throwable throwable) {
        String D;
        kotlin.jvm.internal.s.g(throwable, "throwable");
        UUID id2 = UUID.randomUUID();
        this.f18867f = id2;
        kotlin.jvm.internal.s.f(id2, "id");
        String uuid = id2.toString();
        kotlin.jvm.internal.s.f(uuid, "this.toString()");
        D = kotlin.text.v.D(uuid, "-", "", false, 4, null);
        String format = ((SimpleDateFormat) this.f18868g.getValue()).format(new Date());
        kotlin.jvm.internal.s.f(format, "dateFormat.format(Date())");
        return a(new Crash(D, throwable.getMessage(), format, CrashLogLevel.ERROR, null, null, null, null, null, null, null, this.f18863b.getRelease(), null, this.f18864c.a(), null, null, null, new ExceptionInterface(throwable), a(), 120816, null));
    }

    public /* synthetic */ j2(Context context, CrashApiOptions crashApiOptions, g2 g2Var, e3 e3Var, int i11) {
        this(context, crashApiOptions, g2Var, (i11 & 8) != 0 ? d8.f18493a : null);
    }

    public final DebugMetaInterface a() {
        DebugMetaInterface debugMetaInterface = new DebugMetaInterface();
        String[] strArr = {"4b04af7b-4ff8-54fd-8bbf-c9680dbab357"};
        int i11 = 0;
        while (i11 < 1) {
            String str = strArr[i11];
            i11++;
            debugMetaInterface.getDebugImages().add(new DebugImage(str, null, 2, null));
        }
        return debugMetaInterface;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.plaid.internal.core.crashreporting.internal.models.Crash a(com.plaid.internal.core.crashreporting.internal.models.Crash r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.j2.a(com.plaid.internal.core.crashreporting.internal.models.Crash):com.plaid.internal.core.crashreporting.internal.models.Crash");
    }
}