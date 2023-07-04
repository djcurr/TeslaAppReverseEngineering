package com.rnfs;

import android.os.AsyncTask;
import android.os.Build;
import com.rnfs.a;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class c extends AsyncTask<com.rnfs.a, long[], b> {

    /* renamed from: a  reason: collision with root package name */
    private com.rnfs.a f20439a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f20440b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    b f20441c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c cVar = c.this;
                cVar.d(cVar.f20439a, c.this.f20441c);
                c.this.f20439a.f20433h.a(c.this.f20441c);
            } catch (Exception e11) {
                c cVar2 = c.this;
                cVar2.f20441c.f20438c = e11;
                cVar2.f20439a.f20433h.a(c.this.f20441c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.rnfs.a r30, com.rnfs.b r31) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.c.d(com.rnfs.a, com.rnfs.b):void");
    }

    private long e(HttpURLConnection httpURLConnection) {
        if (Build.VERSION.SDK_INT >= 24) {
            return httpURLConnection.getContentLengthLong();
        }
        return httpURLConnection.getContentLength();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    public b doInBackground(com.rnfs.a... aVarArr) {
        this.f20439a = aVarArr[0];
        this.f20441c = new b();
        new Thread(new a()).start();
        return this.f20441c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: f */
    public void onProgressUpdate(long[]... jArr) {
        super.onProgressUpdate(jArr);
        a.b bVar = this.f20439a.f20435j;
        if (bVar != null) {
            bVar.a(jArr[0][0], jArr[0][1]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        this.f20440b.set(true);
    }
}