package com.rnfs;

import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class h extends AsyncTask<f, int[], g> {

    /* renamed from: a  reason: collision with root package name */
    private f f20457a;

    /* renamed from: b  reason: collision with root package name */
    private g f20458b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f20459c = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h hVar = h.this;
                hVar.g(hVar.f20457a, h.this.f20458b);
                h.this.f20457a.f20450g.a(h.this.f20458b);
            } catch (Exception e11) {
                h.this.f20458b.f20455c = e11;
                h.this.f20457a.f20450g.a(h.this.f20458b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014b A[Catch: all -> 0x01e2, TryCatch #1 {all -> 0x01e2, blocks: (B:25:0x0100, B:32:0x013a, B:34:0x014b, B:36:0x0182, B:38:0x018b, B:31:0x0129), top: B:116:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(com.rnfs.f r37, com.rnfs.g r38) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.h.g(com.rnfs.f, com.rnfs.g):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d */
    public g doInBackground(f... fVarArr) {
        this.f20457a = fVarArr[0];
        this.f20458b = new g();
        new Thread(new a()).start();
        return this.f20458b;
    }

    protected String e(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase()) : null;
        return mimeTypeFromExtension == null ? "*/*" : mimeTypeFromExtension;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        this.f20459c.set(true);
    }
}