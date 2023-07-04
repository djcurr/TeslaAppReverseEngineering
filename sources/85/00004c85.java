package com.stripe.android.core.browser;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.q;
import vz.r;

/* loaded from: classes2.dex */
public final class BrowserCapabilitiesSupplier {
    @Deprecated
    private static final String CHROME_PACKAGE = "com.android.chrome";
    private static final Companion Companion = new Companion(null);
    private final Context context;

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class NoopCustomTabsServiceConnection extends e {
        @Override // androidx.browser.customtabs.e
        public void onCustomTabsServiceConnected(ComponentName componentName, c customTabsClient) {
            s.g(componentName, "componentName");
            s.g(customTabsClient, "customTabsClient");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            s.g(name, "name");
        }
    }

    public BrowserCapabilitiesSupplier(Context context) {
        s.g(context, "context");
        this.context = context;
    }

    private final boolean isCustomTabsSupported() {
        Boolean b11;
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(Boolean.valueOf(c.a(this.context, CHROME_PACKAGE, new NoopCustomTabsServiceConnection())));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (q.g(b11)) {
            b11 = bool;
        }
        return ((Boolean) b11).booleanValue();
    }

    public final BrowserCapabilities get() {
        return isCustomTabsSupported() ? BrowserCapabilities.CustomTabs : BrowserCapabilities.Unknown;
    }
}