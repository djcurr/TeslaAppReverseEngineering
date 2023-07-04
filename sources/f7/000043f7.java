package com.plaid.internal;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.joran.action.Action;
import com.plaid.internal.wa;
import com.plaid.link.configuration.PlaidEnvironment;

/* loaded from: classes2.dex */
public final class g9 implements g2 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f18665a;

    /* renamed from: b  reason: collision with root package name */
    public final vz.k f18666b;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<SharedPreferences> {
        public a() {
            super(0);
        }

        @Override // h00.a
        public SharedPreferences invoke() {
            return g9.this.f18665a.getApplicationContext().getSharedPreferences("plaid_environment_values", 0);
        }
    }

    public g9(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        this.f18665a = context;
        this.f18666b = vz.l.a(new a());
    }

    @Override // com.plaid.internal.g2
    public String a() {
        return b().name();
    }

    public final PlaidEnvironment b() {
        SharedPreferences sharedPrefs = (SharedPreferences) this.f18666b.getValue();
        kotlin.jvm.internal.s.f(sharedPrefs, "sharedPrefs");
        String json = PlaidEnvironment.SANDBOX.getJson();
        kotlin.jvm.internal.s.g(sharedPrefs, "<this>");
        kotlin.jvm.internal.s.g("plaid_environment", Action.KEY_ATTRIBUTE);
        kotlin.jvm.internal.s.g(json, "default");
        String string = sharedPrefs.getString("plaid_environment", json);
        if (string != null) {
            json = string;
        }
        try {
            return PlaidEnvironment.Companion.fromJson(json);
        } catch (Exception e11) {
            wa.a.b(wa.f19678a, kotlin.jvm.internal.s.p("Unknown value was stored in shared prefs: ", json), new Object[]{e11}, false, 4);
            return PlaidEnvironment.SANDBOX;
        }
    }

    public final String c() {
        PlaidEnvironment env = b();
        kotlin.jvm.internal.s.g(env, "env");
        int i11 = f9.f18589a[env.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? "https://production.plaid.com/" : "https://sandbox.plaid.com/" : "https://development.plaid.com/" : "https://production.plaid.com/";
    }
}