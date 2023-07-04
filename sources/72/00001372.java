package com.adyen.threeds2.internal.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.widget.Toast;
import atd.c.g;
import atd.c.h;
import atd.c.i;
import atd.c.j;
import atd.p0.d;
import atd.p0.e;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.adyen.threeds2.internal.f;
import java.util.List;

/* loaded from: classes.dex */
public class ChallengeActivity extends b implements e, d, atd.p0.c, atd.p0.b {

    /* renamed from: d  reason: collision with root package name */
    static final String f9679d = "ChallengeActivity";

    /* renamed from: e  reason: collision with root package name */
    static final String f9680e;

    /* renamed from: f  reason: collision with root package name */
    static final String f9681f;

    /* renamed from: g  reason: collision with root package name */
    static final String f9682g;

    /* renamed from: h  reason: collision with root package name */
    static final String f9683h;

    /* renamed from: i  reason: collision with root package name */
    static final String f9684i;

    /* renamed from: j  reason: collision with root package name */
    private static final String f9685j;

    /* renamed from: k  reason: collision with root package name */
    private static final String f9686k;

    /* renamed from: a  reason: collision with root package name */
    private a f9687a;

    /* renamed from: b  reason: collision with root package name */
    private atd.d.a f9688b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9689c;

    static {
        String simpleName = ChallengeActivity.class.getSimpleName();
        f9680e = simpleName + atd.s0.a.a(-842310470134336L);
        f9681f = simpleName + atd.s0.a.a(-842688427256384L);
        f9682g = simpleName + atd.s0.a.a(-842516628564544L);
        f9683h = simpleName + atd.s0.a.a(-842589643008576L);
        f9684i = simpleName + atd.s0.a.a(-841898153273920L);
        f9685j = simpleName + atd.s0.a.a(-841687699876416L);
        f9686k = simpleName + atd.s0.a.a(-841786484124224L);
    }

    public static Intent a(Context context, atd.d.a aVar) {
        Intent intent = new Intent(context, ChallengeActivity.class);
        intent.setAction(f9682g);
        intent.putExtra(f9684i, aVar);
        return intent;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, ChallengeActivity.class);
        intent.setAction(f9680e);
        return intent;
    }

    public static boolean g() {
        return a.g();
    }

    private void h() {
        atd.q0.a c11 = this.f9687a.c();
        if (c11 != null) {
            c11.setChallengeListener(null);
        }
    }

    @Override // atd.p0.a
    public void c() {
    }

    @Override // atd.p0.a
    public void d() {
        a(new h());
    }

    @Override // com.adyen.threeds2.internal.ui.activity.b
    com.adyen.threeds2.internal.h e() {
        return com.adyen.threeds2.internal.h.f9667a;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adyen.threeds2.internal.ui.activity.b, androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            if (Process.myPid() != bundle.getInt(f9686k)) {
                finish();
            } else {
                this.f9689c = bundle.getBoolean(f9685j, false);
            }
        }
        this.f9687a = new a(this, this);
        try {
            a(getIntent());
        } catch (SDKRuntimeException e11) {
            f.d().a(e11, e11.getMessage());
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f9687a.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        atd.d.a aVar;
        super.onResume();
        a((atd.p0.a) this);
        if (!this.f9689c || (aVar = this.f9688b) == null) {
            return;
        }
        this.f9687a.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(f9685j, this.f9689c);
        bundle.putInt(f9686k, Process.myPid());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f9689c = true;
    }

    @Override // atd.p0.a
    public void b() {
        a(new atd.c.f());
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, ChallengeActivity.class);
        intent.setAction(f9683h);
        return intent;
    }

    @Override // atd.p0.b
    public void b(String str) {
        a(new atd.c.e(str));
    }

    @Override // atd.p0.a
    public void a() {
        a(new atd.c.a());
    }

    @Override // atd.p0.e
    public void a(String str, String str2) {
        a(new j(str), str2);
    }

    @Override // atd.p0.d
    public void a(List<String> list, String str) {
        a(new i(list), str);
    }

    @Override // atd.p0.c
    public void a(Uri uri) {
        Intent intent = new Intent(atd.s0.a.a(-843311197514304L));
        intent.setData(uri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            this.f9689c = true;
            startActivity(intent);
            return;
        }
        Toast.makeText(this, atd.s0.a.a(-843160873658944L) + uri, 0).show();
    }

    @Override // atd.p0.c
    public void a(String str) {
        a(new g(), str);
    }

    private void a(Intent intent) {
        setIntent(intent);
        if (f9680e.equals(intent.getAction())) {
            this.f9687a.i();
        } else if (f9681f.equals(intent.getAction())) {
            this.f9687a.f();
        } else if (f9682g.equals(intent.getAction())) {
            atd.d.a aVar = (atd.d.a) intent.getParcelableExtra(f9684i);
            this.f9688b = aVar;
            this.f9687a.b(aVar);
        } else if (f9683h.equals(intent.getAction())) {
            finish();
        } else if (atd.s0.a.a(-842400664447552L).equals(intent.getAction()) && intent.getData() != null && atd.s0.a.a(-842250340592192L).equals(intent.getData().getScheme())) {
            atd.q0.a c11 = this.f9687a.c();
            a(new g(), c11 instanceof atd.q0.e ? ((atd.q0.e) c11).getWhitelistStatus() : null);
        } else {
            throw atd.y.c.CHALLENGE_PRESENTATION_FAILURE.a();
        }
    }

    private void a(atd.p0.a aVar) {
        atd.q0.a c11 = this.f9687a.c();
        if (c11 != null) {
            c11.setChallengeListener(aVar);
        }
    }

    private void a(atd.c.c cVar) {
        a(cVar, (String) null);
    }

    private void a(atd.c.c cVar, String str) {
        f.d().a(cVar, str);
    }
}