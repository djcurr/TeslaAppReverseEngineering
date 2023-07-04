package com.adyen.threeds2.internal;

import android.content.Context;
import com.adyen.threeds2.Transaction;
import com.adyen.threeds2.Warning;
import com.adyen.threeds2.customization.UiCustomization;
import com.adyen.threeds2.exception.SDKAlreadyInitializedException;
import com.adyen.threeds2.exception.SDKNotInitializedException;
import com.adyen.threeds2.parameters.ConfigParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
class g implements h {

    /* renamed from: b  reason: collision with root package name */
    private Context f9661b;

    /* renamed from: c  reason: collision with root package name */
    private ConfigParameters f9662c;

    /* renamed from: d  reason: collision with root package name */
    private UiCustomization f9663d;

    /* renamed from: e  reason: collision with root package name */
    private List<Warning> f9664e;

    /* renamed from: f  reason: collision with root package name */
    private atd.h.b f9665f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9666g;

    private synchronized void b() {
        if (!this.f9666g) {
            throw new SDKNotInitializedException();
        }
    }

    private synchronized void c() {
        if (this.f9666g) {
            throw new SDKAlreadyInitializedException();
        }
    }

    @Override // com.adyen.threeds2.internal.h
    public UiCustomization a() {
        return this.f9663d;
    }

    @Override // com.adyen.threeds2.ThreeDS2Service
    public synchronized void cleanup(Context context) {
        b();
        this.f9662c = null;
        this.f9663d = null;
        this.f9664e = null;
        this.f9665f = null;
        this.f9666g = false;
    }

    @Override // com.adyen.threeds2.ThreeDS2Service
    public Transaction createTransaction(String str, String str2) {
        b();
        atd.r0.f.a((Object) str2, atd.y.a.MESSAGE_VERSION);
        d b11 = d.b(str2);
        JSONObject a11 = this.f9665f.a(b11.b());
        atd.g0.b a12 = atd.x.c.a(str, this.f9662c);
        String e11 = c.a((atd.f0.b) a12, a11).e();
        if (a12 instanceof atd.g0.c) {
            ((atd.g0.c) a12).c();
        }
        String uuid = UUID.randomUUID().toString();
        e a13 = e.a(this.f9661b, atd.k0.b.a());
        atd.g0.a aVar = new atd.g0.a(atd.s0.a.a(-102961914899008L), atd.i0.d.P256);
        return new i(atd.x.a.a(str, this.f9662c), aVar, new atd.j0.a(uuid, e11, aVar.g().toString(), a13.a(), a13.b(), b11.c()));
    }

    @Override // com.adyen.threeds2.ThreeDS2Service
    public String getSDKVersion() {
        return atd.s0.a.a(-102991979670080L);
    }

    @Override // com.adyen.threeds2.ThreeDS2Service
    public List<Warning> getWarnings() {
        return new ArrayList(this.f9664e);
    }

    @Override // com.adyen.threeds2.ThreeDS2Service
    public synchronized void initialize(Context context, ConfigParameters configParameters, String str, UiCustomization uiCustomization) {
        c();
        atd.r0.b.a(6);
        atd.r0.f.a(context, atd.y.a.APPLICATION_CONTEXT);
        atd.r0.f.a(configParameters, atd.y.a.CONFIG_PARAMETERS);
        atd.r0.c.b(str);
        Context applicationContext = context.getApplicationContext();
        this.f9661b = applicationContext;
        this.f9662c = configParameters;
        this.f9663d = uiCustomization;
        List<Warning> a11 = atd.l0.g.a(applicationContext, configParameters).a();
        this.f9664e = a11;
        this.f9665f = atd.h.b.a(this.f9661b, this.f9662c, a11);
        this.f9666g = true;
    }
}