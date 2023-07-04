package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class c extends AsyncTask<Void, Void, a> {

    /* renamed from: a  reason: collision with root package name */
    private String f21349a;

    /* renamed from: b  reason: collision with root package name */
    private String f21350b;

    /* renamed from: c  reason: collision with root package name */
    private OAuthListener f21351c;

    /* renamed from: d  reason: collision with root package name */
    private int f21352d;

    /* loaded from: classes6.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public OAuthErrCode f21353a;

        /* renamed from: b  reason: collision with root package name */
        public String f21354b;

        /* renamed from: c  reason: collision with root package name */
        public int f21355c;

        a() {
        }
    }

    public c(String str, OAuthListener oAuthListener) {
        this.f21349a = str;
        this.f21351c = oAuthListener;
        this.f21350b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.tencent.mm.opensdk.diffdev.a.c.a doInBackground(java.lang.Void[] r14) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.diffdev.a.c.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f21351c.onAuthFinish(aVar2.f21353a, aVar2.f21354b);
    }
}