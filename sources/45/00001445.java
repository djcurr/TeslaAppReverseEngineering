package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import r9.a;

/* loaded from: classes.dex */
public class APayEntranceActivity extends Activity {

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f10192d = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public String f10193a;

    /* renamed from: b  reason: collision with root package name */
    public String f10194b;

    /* renamed from: c  reason: collision with root package name */
    public r9.a f10195c;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.f10194b;
        r9.a aVar = this.f10195c;
        c9.a.c(aVar, "biz", "BSAFinish", str + "|" + TextUtils.isEmpty(this.f10193a));
        if (TextUtils.isEmpty(this.f10193a)) {
            this.f10193a = a9.b.a();
            r9.a aVar2 = this.f10195c;
            if (aVar2 != null) {
                aVar2.l(true);
            }
        }
        if (str != null) {
            a remove = f10192d.remove(str);
            if (remove != null) {
                remove.a(this.f10193a);
            } else {
                r9.a aVar3 = this.f10195c;
                c9.a.h(aVar3, "wr", "refNull", "session=" + str);
            }
        }
        try {
            super.finish();
        } catch (Throwable th2) {
            c9.a.d(this.f10195c, "wr", "APStartFinish", th2);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        r9.a aVar = this.f10195c;
        c9.a.c(aVar, "biz", "BSAOnAR", this.f10194b + "|" + i11 + "," + i12);
        if (i11 == 1000) {
            if (intent != null) {
                try {
                    this.f10193a = intent.getStringExtra("result");
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString("ap_order_info");
            String string2 = extras.getString("ap_target_packagename");
            this.f10194b = extras.getString("ap_session");
            String string3 = extras.getString("ap_local_info", "{}");
            if (!TextUtils.isEmpty(this.f10194b)) {
                r9.a b11 = a.C1076a.b(this.f10194b);
                this.f10195c = b11;
                c9.a.c(b11, "biz", "BSAEntryCreate", this.f10194b + "|" + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th2) {
                c9.a.d(this.f10195c, "wr", "APStartEx", th2);
                finish();
            }
            if (this.f10195c != null) {
                Context applicationContext = getApplicationContext();
                r9.a aVar = this.f10195c;
                c9.a.a(applicationContext, aVar, string, aVar.f49316d);
                this.f10195c.g(true);
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}