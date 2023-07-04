package com.alipay.sdk.app;

import a9.d;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.i18n.MessageBundle;
import r9.a;
import t9.e;
import t9.m;
import v9.c;

/* loaded from: classes.dex */
public class H5PayActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public c f10202a;

    /* renamed from: b  reason: collision with root package name */
    public String f10203b;

    /* renamed from: c  reason: collision with root package name */
    public String f10204c;

    /* renamed from: d  reason: collision with root package name */
    public String f10205d;

    /* renamed from: e  reason: collision with root package name */
    public String f10206e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10207f;

    /* renamed from: g  reason: collision with root package name */
    public String f10208g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<r9.a> f10209h;

    private void b() {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(PKIFailureInfo.certRevoked);
        } catch (Throwable th2) {
            e.d(th2);
        }
    }

    public void a() {
        Object obj = PayTask.f10215h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        a();
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1010) {
            d.a((r9.a) m.f(this.f10209h), i11, i12, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c cVar = this.f10202a;
        if (cVar == null) {
            finish();
        } else if (cVar.l()) {
            cVar.m();
        } else {
            if (!cVar.m()) {
                super.onBackPressed();
            }
            a9.b.c(a9.b.a());
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        b();
        super.onCreate(bundle);
        try {
            r9.a a11 = a.C1076a.a(getIntent());
            if (a11 == null) {
                finish();
                return;
            }
            this.f10209h = new WeakReference<>(a11);
            if (!g9.a.d().L()) {
                setRequestedOrientation(1);
            } else {
                setRequestedOrientation(3);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.f10203b = string;
                if (!m.U(string)) {
                    finish();
                    return;
                }
                this.f10205d = extras.getString("cookie", null);
                this.f10204c = extras.getString("method", null);
                this.f10206e = extras.getString(MessageBundle.TITLE_ENTRY, null);
                this.f10208g = extras.getString("version", "v1");
                this.f10207f = extras.getBoolean("backisexit", false);
                try {
                    v9.d dVar = new v9.d(this, a11, this.f10208g);
                    setContentView(dVar);
                    dVar.r(this.f10206e, this.f10204c, this.f10207f);
                    dVar.k(this.f10203b, this.f10205d);
                    dVar.p(this.f10203b);
                    this.f10202a = dVar;
                } catch (Throwable th2) {
                    c9.a.d(a11, "biz", "GetInstalledAppEx", th2);
                    finish();
                }
            } catch (Exception unused) {
                finish();
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.f10202a;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i11) {
        try {
            super.setRequestedOrientation(i11);
        } catch (Throwable th2) {
            try {
                c9.a.d((r9.a) m.f(this.f10209h), "biz", "H5PayDataAnalysisError", th2);
            } catch (Throwable unused) {
            }
        }
    }
}