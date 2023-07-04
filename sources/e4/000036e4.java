package com.google.android.vending.expansion.downloader.impl;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SyncFailedException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private Context f15867a;

    /* renamed from: b  reason: collision with root package name */
    private com.google.android.vending.expansion.downloader.impl.b f15868b;

    /* renamed from: c  reason: collision with root package name */
    private DownloaderService f15869c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.vending.expansion.downloader.impl.e f15870d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.vending.expansion.downloader.impl.c f15871e;

    /* renamed from: f  reason: collision with root package name */
    private String f15872f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f15873a;

        /* renamed from: b  reason: collision with root package name */
        public int f15874b;

        /* renamed from: c  reason: collision with root package name */
        public String f15875c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15876d;

        /* renamed from: e  reason: collision with root package name */
        public String f15877e;

        /* renamed from: f  reason: collision with root package name */
        public String f15878f;

        /* renamed from: g  reason: collision with root package name */
        public String f15879g;

        /* renamed from: h  reason: collision with root package name */
        public int f15880h;

        /* renamed from: i  reason: collision with root package name */
        public long f15881i;

        private b() {
            this.f15873a = 0;
            this.f15874b = 0;
            this.f15876d = false;
            this.f15880h = 0;
            this.f15881i = 0L;
        }
    }

    /* loaded from: classes3.dex */
    private class c extends Throwable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.vending.expansion.downloader.impl.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0285d {

        /* renamed from: a  reason: collision with root package name */
        public String f15882a;

        /* renamed from: b  reason: collision with root package name */
        public FileOutputStream f15883b;

        /* renamed from: e  reason: collision with root package name */
        public int f15886e;

        /* renamed from: g  reason: collision with root package name */
        public String f15888g;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15884c = false;

        /* renamed from: d  reason: collision with root package name */
        public int f15885d = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f15887f = false;

        public C0285d(com.google.android.vending.expansion.downloader.impl.b bVar, DownloaderService downloaderService) {
            this.f15886e = 0;
            this.f15886e = bVar.f15853l;
            this.f15888g = bVar.f15842a;
            this.f15882a = downloaderService.generateTempSaveFileName(bVar.f15844c);
        }
    }

    public d(com.google.android.vending.expansion.downloader.impl.b bVar, DownloaderService downloaderService, com.google.android.vending.expansion.downloader.impl.c cVar) {
        this.f15867a = downloaderService;
        this.f15868b = bVar;
        this.f15869c = downloaderService;
        this.f15871e = cVar;
        this.f15870d = com.google.android.vending.expansion.downloader.impl.e.a(downloaderService);
        this.f15872f = "APKXDL (Linux; U; Android " + Build.VERSION.RELEASE + ";" + Locale.getDefault().toString() + "; " + Build.DEVICE + "/" + Build.ID + ")" + downloaderService.getPackageName();
    }

    private void A(int i11, boolean z11, int i12, int i13, boolean z12, String str) {
        com.google.android.vending.expansion.downloader.impl.b bVar = this.f15868b;
        bVar.f15849h = i11;
        bVar.f15852k = i12;
        bVar.f15853l = i13;
        bVar.f15848g = System.currentTimeMillis();
        if (!z11) {
            this.f15868b.f15851j = 0;
        } else if (z12) {
            this.f15868b.f15851j = 1;
        } else {
            this.f15868b.f15851j++;
        }
        this.f15870d.j(this.f15868b);
    }

    private String B() {
        return this.f15872f;
    }

    private void C(C0285d c0285d, byte[] bArr, int i11) {
        try {
            if (c0285d.f15883b == null) {
                c0285d.f15883b = new FileOutputStream(c0285d.f15882a, true);
            }
            c0285d.f15883b.write(bArr, 0, i11);
            f(c0285d);
        } catch (IOException e11) {
            if (al.e.j()) {
                if (al.e.c(al.e.f(c0285d.f15882a)) < i11) {
                    throw new e(this, DownloaderService.STATUS_INSUFFICIENT_SPACE_ERROR, "insufficient space while writing destination file", e11);
                }
                throw new e(this, DownloaderService.STATUS_FILE_ERROR, "while writing destination file: " + e11.toString(), e11);
            }
            throw new e(this, DownloaderService.STATUS_DEVICE_NOT_FOUND_ERROR, "external media not mounted while writing destination file");
        }
    }

    private void a(b bVar, HttpURLConnection httpURLConnection) {
        if (bVar.f15876d) {
            String str = bVar.f15875c;
            if (str != null) {
                httpURLConnection.setRequestProperty("If-Match", str);
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + bVar.f15873a + "-");
        }
    }

    private boolean b(b bVar) {
        return bVar.f15873a > 0 && bVar.f15875c == null;
    }

    private void c(C0285d c0285d) {
        int networkAvailabilityState = this.f15869c.getNetworkAvailabilityState(this.f15870d);
        if (networkAvailabilityState == 2) {
            throw new e(this, 195, "waiting for network to return");
        }
        if (networkAvailabilityState == 3) {
            throw new e(this, 197, "waiting for wifi");
        }
        if (networkAvailabilityState == 5) {
            throw new e(this, 195, "roaming is not allowed");
        }
        if (networkAvailabilityState == 6) {
            throw new e(this, 196, "waiting for wifi or for download over cellular to be authorized");
        }
    }

    private void d(C0285d c0285d) {
        if (this.f15869c.getControl() == 1 && this.f15869c.getStatus() == 193) {
            throw new e(this, this.f15869c.getStatus(), "download paused");
        }
    }

    private void e(C0285d c0285d, int i11) {
        f(c0285d);
        if (c0285d.f15882a == null || !DownloaderService.isStatusError(i11)) {
            return;
        }
        new File(c0285d.f15882a).delete();
        c0285d.f15882a = null;
    }

    private void f(C0285d c0285d) {
        try {
            FileOutputStream fileOutputStream = c0285d.f15883b;
            if (fileOutputStream != null) {
                fileOutputStream.close();
                c0285d.f15883b = null;
            }
        } catch (IOException unused) {
        }
    }

    private void g(C0285d c0285d, HttpURLConnection httpURLConnection) {
        b bVar = new b();
        d(c0285d);
        w(c0285d, bVar);
        a(bVar, httpURLConnection);
        c(c0285d);
        this.f15871e.onDownloadStateChanged(3);
        k(c0285d, bVar, httpURLConnection, v(c0285d, httpURLConnection));
        q(c0285d, bVar, httpURLConnection);
        InputStream p11 = p(c0285d, httpURLConnection);
        this.f15871e.onDownloadStateChanged(4);
        y(c0285d, bVar, new byte[4096], p11);
    }

    private void h(C0285d c0285d) {
        x(c0285d);
        String str = c0285d.f15882a;
        String b11 = al.e.b(this.f15869c, this.f15868b.f15844c);
        if (c0285d.f15882a.equals(b11)) {
            return;
        }
        File file = new File(str);
        File file2 = new File(b11);
        com.google.android.vending.expansion.downloader.impl.b bVar = this.f15868b;
        long j11 = bVar.f15846e;
        if (j11 != -1 && bVar.f15847f == j11) {
            if (!file.renameTo(file2)) {
                throw new e(this, DownloaderService.STATUS_FILE_ERROR, "unable to finalize destination file");
            }
            return;
        }
        throw new e(this, DownloaderService.STATUS_FILE_DELIVERED_INCORRECTLY, "file delivered with incorrect size. probably due to network not browser configured");
    }

    private int i(C0285d c0285d) {
        if (this.f15869c.getNetworkAvailabilityState(this.f15870d) != 1) {
            return 195;
        }
        if (this.f15868b.f15851j < 5) {
            c0285d.f15884c = true;
            return 194;
        }
        Log.w("LVLDL", "reached max retries for " + this.f15868b.f15851j);
        return DownloaderService.STATUS_HTTP_DATA_ERROR;
    }

    private void j(C0285d c0285d, b bVar) {
        com.google.android.vending.expansion.downloader.impl.b bVar2 = this.f15868b;
        bVar2.f15847f = bVar.f15873a;
        this.f15870d.j(bVar2);
        String str = bVar.f15877e;
        if ((str == null || bVar.f15873a == Integer.parseInt(str)) ? false : true) {
            if (b(bVar)) {
                throw new e(this, DownloaderService.STATUS_CANNOT_RESUME, "mismatched content length");
            }
            throw new e(this, i(c0285d), "closed socket before end of file");
        }
    }

    private void k(C0285d c0285d, b bVar, HttpURLConnection httpURLConnection, int i11) {
        if (i11 == 503 && this.f15868b.f15851j < 5) {
            m(c0285d, httpURLConnection);
        }
        if (i11 != (bVar.f15876d ? 206 : 200)) {
            l(c0285d, bVar, i11);
        } else {
            c0285d.f15886e = 0;
        }
    }

    private void l(C0285d c0285d, b bVar, int i11) {
        int i12;
        if (DownloaderService.isStatusError(i11)) {
            i12 = i11;
        } else if (i11 < 300 || i11 >= 400) {
            i12 = (bVar.f15876d && i11 == 200) ? DownloaderService.STATUS_CANNOT_RESUME : DownloaderService.STATUS_UNHANDLED_HTTP_CODE;
        } else {
            i12 = DownloaderService.STATUS_UNHANDLED_REDIRECT;
        }
        throw new e(this, i12, "http error " + i11);
    }

    private void m(C0285d c0285d, HttpURLConnection httpURLConnection) {
        c0285d.f15884c = true;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            try {
                int parseInt = Integer.parseInt(headerField);
                c0285d.f15885d = parseInt;
                if (parseInt >= 0) {
                    if (parseInt < 30) {
                        c0285d.f15885d = 30;
                    } else if (parseInt > 86400) {
                        c0285d.f15885d = 86400;
                    }
                    int nextInt = c0285d.f15885d + al.e.f573a.nextInt(31);
                    c0285d.f15885d = nextInt;
                    c0285d.f15885d = nextInt * 1000;
                } else {
                    c0285d.f15885d = 0;
                }
            } catch (NumberFormatException unused) {
            }
        }
        throw new e(this, 194, "got 503 Service Unavailable, will retry later");
    }

    private void n() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Net ");
        sb2.append(this.f15869c.getNetworkAvailabilityState(this.f15870d) == 1 ? "Up" : "Down");
        Log.i("LVLDL", sb2.toString());
    }

    private void o(int i11, boolean z11, int i12, int i13, boolean z12, String str) {
        A(i11, z11, i12, i13, z12, str);
        DownloaderService.isStatusCompleted(i11);
    }

    private InputStream p(C0285d c0285d, HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException e11) {
            n();
            int i11 = i(c0285d);
            throw new e(this, i11, "while getting entity: " + e11.toString(), e11);
        }
    }

    private void q(C0285d c0285d, b bVar, HttpURLConnection httpURLConnection) {
        if (bVar.f15876d) {
            return;
        }
        s(c0285d, bVar, httpURLConnection);
        try {
            DownloaderService downloaderService = this.f15869c;
            com.google.android.vending.expansion.downloader.impl.b bVar2 = this.f15868b;
            c0285d.f15882a = downloaderService.generateSaveFile(bVar2.f15844c, bVar2.f15846e);
            try {
                c0285d.f15883b = new FileOutputStream(c0285d.f15882a);
            } catch (FileNotFoundException e11) {
                try {
                    if (new File(al.e.g(this.f15869c)).mkdirs()) {
                        c0285d.f15883b = new FileOutputStream(c0285d.f15882a);
                    }
                } catch (Exception unused) {
                    throw new e(this, DownloaderService.STATUS_FILE_ERROR, "while opening destination file: " + e11.toString(), e11);
                }
            }
            z(c0285d, bVar);
            c(c0285d);
        } catch (DownloaderService.GenerateSaveFileError e12) {
            throw new e(this, e12.f15833a, e12.f15834b);
        }
    }

    private int r(C0285d c0285d, b bVar, byte[] bArr, InputStream inputStream) {
        try {
            return inputStream.read(bArr);
        } catch (IOException e11) {
            n();
            this.f15868b.f15847f = bVar.f15873a;
            this.f15870d.j(this.f15868b);
            if (b(bVar)) {
                throw new e(this, DownloaderService.STATUS_CANNOT_RESUME, "while reading response: " + e11.toString() + ", can't resume interrupted download with no ETag", e11);
            }
            int i11 = i(c0285d);
            throw new e(this, i11, "while reading response: " + e11.toString(), e11);
        }
    }

    private void s(C0285d c0285d, b bVar, HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Disposition");
        if (headerField != null) {
            bVar.f15878f = headerField;
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Location");
        if (headerField2 != null) {
            bVar.f15879g = headerField2;
        }
        String headerField3 = httpURLConnection.getHeaderField("ETag");
        if (headerField3 != null) {
            bVar.f15875c = headerField3;
        }
        String headerField4 = httpURLConnection.getHeaderField("Transfer-Encoding");
        String str = headerField4 != null ? headerField4 : null;
        String headerField5 = httpURLConnection.getHeaderField(NetworkConstantsKt.HEADER_CONTENT_TYPE);
        if (headerField5 != null && !headerField5.equals("application/vnd.android.obb")) {
            throw new e(this, DownloaderService.STATUS_FILE_DELIVERED_INCORRECTLY, "file delivered with incorrect Mime type");
        }
        if (str == null) {
            long contentLength = httpURLConnection.getContentLength();
            if (headerField5 != null) {
                if (contentLength != -1 && contentLength != this.f15868b.f15846e) {
                    Log.e("LVLDL", "Incorrect file size delivered.");
                } else {
                    bVar.f15877e = Long.toString(contentLength);
                }
            }
        }
        if (bVar.f15877e == null && (str == null || !str.equalsIgnoreCase("chunked"))) {
            throw new e(this, DownloaderService.STATUS_HTTP_DATA_ERROR, "can't know size of download, giving up");
        }
    }

    private void t(C0285d c0285d, b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = bVar.f15873a;
        if (i11 - bVar.f15880h <= 4096 || currentTimeMillis - bVar.f15881i <= 1000) {
            return;
        }
        com.google.android.vending.expansion.downloader.impl.b bVar2 = this.f15868b;
        bVar2.f15847f = i11;
        this.f15870d.l(bVar2);
        bVar.f15880h = bVar.f15873a;
        bVar.f15881i = currentTimeMillis;
        DownloaderService downloaderService = this.f15869c;
        downloaderService.notifyUpdateBytes(bVar.f15874b + downloaderService.mBytesSoFar);
    }

    private int v(C0285d c0285d, HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e11) {
            n();
            int i11 = i(c0285d);
            throw new e(this, i11, "while trying to execute request: " + e11.toString(), e11);
        } catch (IllegalArgumentException e12) {
            throw new e(this, DownloaderService.STATUS_HTTP_DATA_ERROR, "while trying to execute request: " + e12.toString(), e12);
        }
    }

    private void w(C0285d c0285d, b bVar) {
        String str = c0285d.f15882a;
        if (str != null) {
            if (al.e.k(str)) {
                File file = new File(c0285d.f15882a);
                if (file.exists()) {
                    long length = file.length();
                    if (length == 0) {
                        file.delete();
                        c0285d.f15882a = null;
                    } else if (this.f15868b.f15845d != null) {
                        try {
                            c0285d.f15883b = new FileOutputStream(c0285d.f15882a, true);
                            bVar.f15873a = (int) length;
                            long j11 = this.f15868b.f15846e;
                            if (j11 != -1) {
                                bVar.f15877e = Long.toString(j11);
                            }
                            bVar.f15875c = this.f15868b.f15845d;
                            bVar.f15876d = true;
                        } catch (FileNotFoundException e11) {
                            throw new e(this, DownloaderService.STATUS_FILE_ERROR, "while opening destination for resuming: " + e11.toString(), e11);
                        }
                    } else {
                        file.delete();
                        throw new e(this, DownloaderService.STATUS_CANNOT_RESUME, "Trying to resume a download that can't be resumed");
                    }
                }
            } else {
                throw new e(this, DownloaderService.STATUS_FILE_ERROR, "found invalid internal destination filename");
            }
        }
        if (c0285d.f15883b != null) {
            f(c0285d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0039 -> B:53:0x00b4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x003f -> B:53:0x00b4). Please submit an issue!!! */
    private void x(C0285d c0285d) {
        FileOutputStream fileOutputStream;
        FileNotFoundException e11 = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        e11 = null;
        e11 = 0;
        try {
        } catch (Throwable th2) {
            th = th2;
            e11 = fileOutputStream;
        }
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(c0285d.f15882a, true);
                } catch (FileNotFoundException e12) {
                    fileOutputStream = null;
                    e11 = e12;
                } catch (SyncFailedException e13) {
                    fileOutputStream = null;
                    e11 = e13;
                } catch (IOException e14) {
                    e = e14;
                } catch (RuntimeException e15) {
                    e = e15;
                }
                try {
                    FileDescriptor fd2 = fileOutputStream.getFD();
                    fd2.sync();
                    fileOutputStream.close();
                    e11 = fd2;
                    fileOutputStream = fileOutputStream;
                } catch (FileNotFoundException e16) {
                    e11 = e16;
                    Log.w("LVLDL", "file " + c0285d.f15882a + " not found: " + e11);
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (SyncFailedException e17) {
                    e11 = e17;
                    Log.w("LVLDL", "file " + c0285d.f15882a + " sync failed: " + e11);
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e18) {
                    e = e18;
                    fileOutputStream2 = fileOutputStream;
                    ?? sb2 = new StringBuilder();
                    sb2.append("IOException trying to sync ");
                    sb2.append(c0285d.f15882a);
                    sb2.append(": ");
                    sb2.append(e);
                    Log.w("LVLDL", sb2.toString());
                    e11 = fileOutputStream2;
                    fileOutputStream = sb2;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                        e11 = fileOutputStream2;
                        fileOutputStream = sb2;
                    }
                } catch (RuntimeException e19) {
                    e = e19;
                    fileOutputStream3 = fileOutputStream;
                    Log.w("LVLDL", "exception while syncing file: ", e);
                    e11 = fileOutputStream3;
                    fileOutputStream = fileOutputStream;
                    if (fileOutputStream3 != null) {
                        fileOutputStream3.close();
                        e11 = fileOutputStream3;
                        fileOutputStream = fileOutputStream;
                    }
                }
            } catch (IOException e21) {
                Log.w("LVLDL", "IOException while closing synced file: ", e21);
                e11 = e11;
                fileOutputStream = fileOutputStream;
            } catch (RuntimeException e22) {
                Log.w("LVLDL", "exception while closing file: ", e22);
                e11 = e11;
                fileOutputStream = fileOutputStream;
            }
        } catch (Throwable th3) {
            th = th3;
            if (e11 != null) {
                try {
                    e11.close();
                } catch (IOException e23) {
                    Log.w("LVLDL", "IOException while closing synced file: ", e23);
                } catch (RuntimeException e24) {
                    Log.w("LVLDL", "exception while closing file: ", e24);
                }
            }
            throw th;
        }
    }

    private void y(C0285d c0285d, b bVar, byte[] bArr, InputStream inputStream) {
        while (true) {
            int r11 = r(c0285d, bVar, bArr, inputStream);
            if (r11 == -1) {
                j(c0285d, bVar);
                return;
            }
            c0285d.f15887f = true;
            C(c0285d, bArr, r11);
            bVar.f15873a += r11;
            bVar.f15874b += r11;
            t(c0285d, bVar);
            d(c0285d);
        }
    }

    private void z(C0285d c0285d, b bVar) {
        com.google.android.vending.expansion.downloader.impl.b bVar2 = this.f15868b;
        bVar2.f15845d = bVar.f15875c;
        this.f15870d.j(bVar2);
    }

    public void u() {
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        String str;
        int i13;
        Process.setThreadPriority(10);
        C0285d c0285d = new C0285d(this.f15868b, this.f15869c);
        PowerManager.WakeLock wakeLock = null;
        try {
            try {
                wakeLock = ((PowerManager) this.f15867a.getSystemService("power")).newWakeLock(1, "org.godot.game:wakelock");
                wakeLock.acquire(1200000L);
                boolean z13 = false;
                while (!z13) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(c0285d.f15888g).openConnection()));
                    httpURLConnection.setRequestProperty(NetworkConstantsKt.HEADER_USER_AGENT, B());
                    try {
                        g(c0285d, httpURLConnection);
                        httpURLConnection.disconnect();
                        z13 = true;
                    } catch (c unused) {
                        httpURLConnection.disconnect();
                    } catch (Throwable th2) {
                        httpURLConnection.disconnect();
                        throw th2;
                    }
                }
                h(c0285d);
                wakeLock.release();
                e(c0285d, 200);
                z11 = c0285d.f15884c;
                i11 = c0285d.f15885d;
                i12 = c0285d.f15886e;
                z12 = c0285d.f15887f;
                str = c0285d.f15882a;
                i13 = 200;
            } catch (e e11) {
                Log.w("LVLDL", "Aborting request for download " + this.f15868b.f15844c + ": " + e11.getMessage());
                e11.printStackTrace();
                int i14 = e11.f15889a;
                if (wakeLock != null) {
                    wakeLock.release();
                }
                e(c0285d, i14);
                o(i14, c0285d.f15884c, c0285d.f15885d, c0285d.f15886e, c0285d.f15887f, c0285d.f15882a);
                return;
            } catch (Throwable th3) {
                Log.w("LVLDL", "Exception for " + this.f15868b.f15844c + ": " + th3);
                if (wakeLock != null) {
                    wakeLock.release();
                }
                e(c0285d, DownloaderService.STATUS_UNKNOWN_ERROR);
                z11 = c0285d.f15884c;
                i11 = c0285d.f15885d;
                i12 = c0285d.f15886e;
                z12 = c0285d.f15887f;
                str = c0285d.f15882a;
                i13 = DownloaderService.STATUS_UNKNOWN_ERROR;
            }
            o(i13, z11, i11, i12, z12, str);
        } catch (Throwable th4) {
            if (0 != 0) {
                wakeLock.release();
            }
            e(c0285d, DownloaderService.STATUS_UNKNOWN_ERROR);
            o(DownloaderService.STATUS_UNKNOWN_ERROR, c0285d.f15884c, c0285d.f15885d, c0285d.f15886e, c0285d.f15887f, c0285d.f15882a);
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e extends Throwable {

        /* renamed from: a  reason: collision with root package name */
        public int f15889a;

        public e(d dVar, int i11, String str) {
            super(str);
            this.f15889a = i11;
        }

        public e(d dVar, int i11, String str, Throwable th2) {
            super(str, th2);
            this.f15889a = i11;
        }
    }
}