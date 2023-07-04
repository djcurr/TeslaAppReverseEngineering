package com.plaid.link;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.w;
import com.plaid.internal.a7;
import com.plaid.internal.a9;
import com.plaid.internal.b9;
import com.plaid.internal.c2;
import com.plaid.internal.g9;
import com.plaid.internal.u5;
import com.plaid.internal.v9;
import com.plaid.internal.w8;
import com.plaid.internal.wa;
import com.plaid.internal.y1;
import com.plaid.internal.z2;
import com.plaid.link.configuration.LinkLogLevel;
import com.plaid.link.configuration.LinkPublicKeyConfiguration;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.configuration.PlaidEnvironment;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkException;
import h00.a;
import h00.l;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import tw.h;
import v20.e1;
import v20.i;
import v20.k;
import v20.t1;
import vz.b0;
import zz.d;

@Keep
/* loaded from: classes2.dex */
public final class Plaid {
    public static w8 component;
    public static final Plaid INSTANCE = new Plaid();
    private static AtomicBoolean isCreated = new AtomicBoolean(false);
    private static final String VERSION_NAME = BuildConfig.LINK_VERSION_NAME;
    private static l<? super LinkEvent, b0> linkEventListener = Plaid$linkEventListener$1.INSTANCE;

    private Plaid() {
    }

    private final boolean checkLinkPreconditions(Context context, LinkPublicKeyConfiguration linkPublicKeyConfiguration) {
        if (hasPortrait(context)) {
            if (isCreated.get()) {
                String token = linkPublicKeyConfiguration.getToken();
                if (token == null || token.length() == 0) {
                    wa.a aVar = wa.f19678a;
                    wa.f19679b.a("public_key is deprecated. Please use token.", Arrays.copyOf(new Object[0], 0), false);
                }
                return true;
            }
            throw new LinkException("Plaid has not been initialized, please create a PlaidLink instance by calling Plaid.createLinkWith(application, linkTokenConfiguration)");
        }
        throw new LinkException("Device does not support portrait mode");
    }

    public static final void clearLinkEventListener() {
        linkEventListener = Plaid$clearLinkEventListener$1.INSTANCE;
    }

    public static final PlaidHandler create(Application application, LinkTokenConfiguration linkTokenConfiguration) {
        s.g(application, "application");
        s.g(linkTokenConfiguration, "linkTokenConfiguration");
        s.g(linkTokenConfiguration, "<this>");
        PlaidHandler create = create(application, new LinkPublicKeyConfiguration.Builder().token(linkTokenConfiguration.getToken()).environment(PlaidEnvironment.Companion.fromLinkToken(linkTokenConfiguration.getToken())).logLevel(linkTokenConfiguration.getLogLevel()).extraParams(linkTokenConfiguration.getExtraParams()).build());
        ((z2) getComponent$link_sdk_release()).a().a(linkTokenConfiguration.getNoLoadingState());
        return create;
    }

    public static final w8 getComponent$link_sdk_release() {
        w8 w8Var = component;
        if (w8Var != null) {
            return w8Var;
        }
        s.x("component");
        return null;
    }

    public static /* synthetic */ void getComponent$link_sdk_release$annotations() {
    }

    public static final String getVERSION_NAME() {
        return VERSION_NAME;
    }

    public static /* synthetic */ void getVERSION_NAME$annotations() {
    }

    private final boolean hasPortrait(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.screen.portrait");
    }

    private final synchronized void initialize(Application application) {
        if (isCreated.get()) {
            return;
        }
        Application application2 = (Application) h.b(application);
        v9 v9Var = (v9) h.b(new v9());
        h.a(application2, Application.class);
        h.a(v9Var, v9.class);
        setComponent$link_sdk_release(new z2(new v9(), application2, v9Var));
        isCreated.getAndSet(true);
    }

    private final boolean internalOpenLink(Context context, LinkPublicKeyConfiguration linkPublicKeyConfiguration, a<b0> aVar) {
        aVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object maybeSetWebviewDebugging(Context context, d<? super b0> dVar) {
        Object d11;
        if ((context.getApplicationInfo().flags & 2) != 0) {
            Object g11 = i.g(e1.c(), new Plaid$maybeSetWebviewDebugging$2(null), dVar);
            d11 = a00.d.d();
            return g11 == d11 ? g11 : b0.f54756a;
        }
        return b0.f54756a;
    }

    public static final void setComponent$link_sdk_release(w8 w8Var) {
        s.g(w8Var, "<set-?>");
        component = w8Var;
    }

    private final boolean setLinkConfiguration(Context context, LinkPublicKeyConfiguration linkPublicKeyConfiguration) {
        a7 a7Var;
        if (checkLinkPreconditions(context, linkPublicKeyConfiguration)) {
            String uuid = UUID.randomUUID().toString();
            s.f(uuid, "randomUUID().toString()");
            k.d(t1.f54002a, e1.b(), null, new Plaid$setLinkConfiguration$1(uuid, linkPublicKeyConfiguration, context, null), 2, null);
            LinkLogLevel logLevel = linkPublicKeyConfiguration.getLogLevel();
            s.g(logLevel, "<this>");
            switch (u5.f19578a[logLevel.ordinal()]) {
                case 1:
                    a7Var = a7.ASSERT;
                    break;
                case 2:
                    a7Var = a7.DEBUG;
                    break;
                case 3:
                    a7Var = a7.ERROR;
                    break;
                case 4:
                    a7Var = a7.INFO;
                    break;
                case 5:
                    a7Var = a7.VERBOSE;
                    break;
                case 6:
                    a7Var = a7.WARN;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            setPlogLevel(a7Var);
            g9 b11 = ((z2) getComponent$link_sdk_release()).b();
            PlaidEnvironment environment = linkPublicKeyConfiguration.getEnvironment();
            b11.getClass();
            s.g(environment, "environment");
            ((SharedPreferences) b11.f18666b.getValue()).edit().putString("plaid_environment", environment.getJson()).apply();
            PlaidEnvironment environment2 = linkPublicKeyConfiguration.getEnvironment();
            String packageName = ((z2) getComponent$link_sdk_release()).f19945a.getPackageName();
            s.f(packageName, "component.application().packageName");
            if (shouldSendTestCrash(environment2, packageName)) {
                b9 i11 = ((z2) getComponent$link_sdk_release()).i();
                i11.getClass();
                try {
                    c2 crashApi = i11.f18228a;
                    s.g(crashApi, "crashApi");
                    crashApi.a("Proguard crash test");
                    return true;
                } catch (RuntimeException e11) {
                    k.d(t1.f54002a, null, null, new a9(i11, e11, null), 3, null);
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public static final void setLinkEventListener(l<? super LinkEvent, b0> linkEventListener2) {
        s.g(linkEventListener2, "linkEventListener");
        linkEventListener = new Plaid$setLinkEventListener$1(linkEventListener2);
    }

    private final void setPlogLevel(a7 priority) {
        wa.a aVar = wa.f19678a;
        Plaid$setPlogLevel$1 plaid$setPlogLevel$1 = Plaid$setPlogLevel$1.INSTANCE;
        s.g(priority, "priority");
        wa.f19679b = new y1(priority, plaid$setPlogLevel$1);
    }

    private final boolean shouldSendTestCrash(PlaidEnvironment plaidEnvironment, String str) {
        boolean H;
        if (plaidEnvironment == PlaidEnvironment.SANDBOX) {
            H = v.H(str, "com.plaid.", false, 2, null);
            return H;
        }
        return false;
    }

    public final l<LinkEvent, b0> getLinkEventListenerInternal$link_sdk_release() {
        return linkEventListener;
    }

    public final AtomicBoolean isCreated$link_sdk_release() {
        return isCreated;
    }

    public final boolean openLinkInternal$link_sdk_release(Activity activity, LinkPublicKeyConfiguration linkConfiguration) {
        s.g(activity, "activity");
        s.g(linkConfiguration, "linkConfiguration");
        k.d(t1.f54002a, null, null, new Plaid$openLinkInternal$1(activity, null), 3, null);
        return true;
    }

    public final w8 providePlaidComponent$link_sdk_release(Application application) {
        s.g(application, "application");
        initialize(application);
        return getComponent$link_sdk_release();
    }

    public final void setCreated$link_sdk_release(AtomicBoolean atomicBoolean) {
        s.g(atomicBoolean, "<set-?>");
        isCreated = atomicBoolean;
    }

    public final void setLinkResultAndFinish$link_sdk_release(Activity activity, int i11, Parcelable data) {
        s.g(activity, "activity");
        s.g(data, "data");
        Intent intent = new Intent();
        intent.putExtra("link_result", data);
        activity.setResult(i11, intent);
        activity.finish();
    }

    public final boolean openLinkInternal$link_sdk_release(Fragment fragment, LinkPublicKeyConfiguration linkConfiguration) {
        s.g(fragment, "fragment");
        s.g(linkConfiguration, "linkConfiguration");
        k.d(w.a(fragment), null, null, new Plaid$openLinkInternal$2(fragment, null), 3, null);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003f, code lost:
        if (r0.equals("true") == true) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.plaid.link.PlaidHandler create(android.app.Application r8, com.plaid.link.configuration.LinkPublicKeyConfiguration r9) {
        /*
            java.lang.String r0 = "application"
            kotlin.jvm.internal.s.g(r8, r0)
            java.lang.String r0 = "linkConfiguration"
            kotlin.jvm.internal.s.g(r9, r0)
            com.plaid.link.Plaid r0 = com.plaid.link.Plaid.INSTANCE
            r0.initialize(r8)
            r0.setLinkConfiguration(r8, r9)
            java.util.Map r8 = r9.getExtraParams()
            java.lang.String r0 = "status_bar_hex_color"
            java.lang.Object r8 = r8.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map r0 = r9.getExtraParams()
            java.lang.String r1 = "flag_secure"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1
            if (r0 != 0) goto L2e
            goto L42
        L2e:
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.String r2 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.s.f(r0, r2)
            java.lang.String r2 = "true"
            boolean r0 = r0.equals(r2)
            if (r0 != r1) goto L42
            goto L43
        L42:
            r1 = 0
        L43:
            v20.t1 r2 = v20.t1.f54002a
            com.plaid.link.Plaid$create$1 r5 = new com.plaid.link.Plaid$create$1
            r0 = 0
            r5.<init>(r8, r1, r0)
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            v20.i.d(r2, r3, r4, r5, r6, r7)
            com.plaid.link.PlaidHandler r8 = new com.plaid.link.PlaidHandler
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.link.Plaid.create(android.app.Application, com.plaid.link.configuration.LinkPublicKeyConfiguration):com.plaid.link.PlaidHandler");
    }
}