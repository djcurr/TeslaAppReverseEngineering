package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class a implements IDiffDevOAuth {

    /* renamed from: c  reason: collision with root package name */
    private b f21333c;

    /* renamed from: a  reason: collision with root package name */
    private Handler f21331a = null;

    /* renamed from: b  reason: collision with root package name */
    private List<OAuthListener> f21332b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private OAuthListener f21334d = new C0390a();

    /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    class C0390a implements OAuthListener {

        /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        class RunnableC0391a implements Runnable {
            RunnableC0391a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(a.this.f21332b);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((OAuthListener) it2.next()).onQrcodeScanned();
                }
            }
        }

        C0390a() {
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
            Log.d("MicroMsg.SDK.ListenerWrapper", String.format("onAuthFinish, errCode = %s, authCode = %s", oAuthErrCode.toString(), str));
            a.this.f21333c = null;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a.this.f21332b);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((OAuthListener) it2.next()).onAuthFinish(oAuthErrCode, str);
            }
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthGotQrcode(String str, byte[] bArr) {
            Log.d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = " + str);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a.this.f21332b);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((OAuthListener) it2.next()).onAuthGotQrcode(str, bArr);
            }
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onQrcodeScanned() {
            Log.d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
            if (a.this.f21331a != null) {
                a.this.f21331a.post(new RunnableC0391a());
            }
        }
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void addListener(OAuthListener oAuthListener) {
        if (this.f21332b.contains(oAuthListener)) {
            return;
        }
        this.f21332b.add(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        Log.i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = " + str);
        if (str != null && str.length() > 0 && str2 != null && str2.length() > 0) {
            if (this.f21331a == null) {
                this.f21331a = new Handler(Looper.getMainLooper());
            }
            if (!this.f21332b.contains(oAuthListener)) {
                this.f21332b.add(oAuthListener);
            }
            if (this.f21333c != null) {
                Log.d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
                return true;
            }
            b bVar = new b(str, str2, str3, str4, str5, this.f21334d);
            this.f21333c = bVar;
            if (Build.VERSION.SDK_INT >= 11) {
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                bVar.execute(new Void[0]);
            }
            return true;
        }
        Log.d("MicroMsg.SDK.DiffDevOAuth", String.format("auth fail, invalid argument, appId = %s, scope = %s", str, str2));
        return false;
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void detach() {
        Log.i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f21332b.clear();
        stopAuth();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeAllListeners() {
        this.f21332b.clear();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeListener(OAuthListener oAuthListener) {
        this.f21332b.remove(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean stopAuth() {
        boolean z11;
        Log.i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            b bVar = this.f21333c;
            z11 = bVar == null ? true : bVar.a();
        } catch (Exception e11) {
            Log.w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e11.getMessage());
            z11 = false;
        }
        this.f21333c = null;
        return z11;
    }
}