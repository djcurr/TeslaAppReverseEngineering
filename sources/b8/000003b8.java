package androidx.camera.core;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.c0;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class l0 implements Runnable {

    /* renamed from: a */
    private final g0 f2446a;

    /* renamed from: b */
    private final int f2447b;

    /* renamed from: c */
    private final c0.s f2448c;

    /* renamed from: d */
    private final Executor f2449d;

    /* renamed from: e */
    private final b f2450e;

    /* renamed from: f */
    private final Executor f2451f;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2452a;

        static {
            int[] iArr = new int[ImageUtil.CodecFailedException.a.values().length];
            f2452a = iArr;
            try {
                iArr[ImageUtil.CodecFailedException.a.ENCODE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2452a[ImageUtil.CodecFailedException.a.DECODE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2452a[ImageUtil.CodecFailedException.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(c0.t tVar);

        void b(c cVar, String str, Throwable th2);
    }

    /* loaded from: classes.dex */
    public enum c {
        FILE_IO_FAILED,
        ENCODE_FAILED,
        CROP_FAILED,
        UNKNOWN
    }

    public l0(g0 g0Var, c0.s sVar, int i11, Executor executor, Executor executor2, b bVar) {
        this.f2446a = g0Var;
        this.f2448c = sVar;
        this.f2447b = i11;
        this.f2450e = bVar;
        this.f2449d = executor;
        this.f2451f = executor2;
    }

    public static /* synthetic */ void a(l0 l0Var, Uri uri) {
        l0Var.k(uri);
    }

    public static /* synthetic */ void b(l0 l0Var, File file) {
        l0Var.l(file);
    }

    public static /* synthetic */ void c(l0 l0Var, c cVar, String str, Throwable th2) {
        l0Var.j(cVar, str, th2);
    }

    private void e(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private boolean f(File file, Uri uri) {
        OutputStream openOutputStream = this.f2448c.a().openOutputStream(uri);
        if (openOutputStream == null) {
            if (openOutputStream != null) {
                openOutputStream.close();
            }
            return false;
        }
        try {
            e(file, openOutputStream);
            openOutputStream.close();
            return true;
        } catch (Throwable th2) {
            try {
                openOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private boolean g() {
        return this.f2448c.c() != null;
    }

    private boolean h() {
        return (this.f2448c.f() == null || this.f2448c.a() == null || this.f2448c.b() == null) ? false : true;
    }

    private boolean i() {
        return this.f2448c.e() != null;
    }

    public /* synthetic */ void j(c cVar, String str, Throwable th2) {
        this.f2450e.b(cVar, str, th2);
    }

    public /* synthetic */ void k(Uri uri) {
        this.f2450e.a(new c0.t(uri));
    }

    private void m(final c cVar, final String str, final Throwable th2) {
        try {
            this.f2449d.execute(new Runnable() { // from class: androidx.camera.core.j0
                {
                    l0.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    l0.c(l0.this, cVar, str, th2);
                }
            });
        } catch (RejectedExecutionException unused) {
            n0.c("ImageSaver", "Application executor rejected executing OnImageSavedCallback.onError callback. Skipping.");
        }
    }

    private void n(final Uri uri) {
        try {
            this.f2449d.execute(new Runnable() { // from class: androidx.camera.core.i0
                {
                    l0.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    l0.a(l0.this, uri);
                }
            });
        } catch (RejectedExecutionException unused) {
            n0.c("ImageSaver", "Application executor rejected executing OnImageSavedCallback.onImageSaved callback. Skipping.");
        }
    }

    private File o() {
        File createTempFile;
        c cVar;
        String str;
        ImageUtil.CodecFailedException codecFailedException;
        g0 g0Var;
        try {
            if (g()) {
                createTempFile = new File(this.f2448c.c().getParent(), "CameraX" + UUID.randomUUID().toString() + ".tmp");
            } else {
                createTempFile = File.createTempFile("CameraX", ".tmp");
            }
            try {
                g0Var = this.f2446a;
            } catch (ImageUtil.CodecFailedException e11) {
                int i11 = a.f2452a[e11.a().ordinal()];
                if (i11 == 1) {
                    cVar = c.ENCODE_FAILED;
                    str = "Failed to encode mImage";
                    codecFailedException = e11;
                } else if (i11 != 2) {
                    cVar = c.UNKNOWN;
                    str = "Failed to transcode mImage";
                    codecFailedException = e11;
                } else {
                    cVar = c.CROP_FAILED;
                    str = "Failed to crop mImage";
                    codecFailedException = e11;
                }
            } catch (IOException e12) {
                e = e12;
                cVar = c.FILE_IO_FAILED;
                str = "Failed to write temp file";
                codecFailedException = e;
            } catch (IllegalArgumentException e13) {
                e = e13;
                cVar = c.FILE_IO_FAILED;
                str = "Failed to write temp file";
                codecFailedException = e;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.write(ImageUtil.d(this.f2446a));
                a0.c h11 = a0.c.h(createTempFile);
                h11.c();
                if (new g0.a().b(this.f2446a)) {
                    ByteBuffer b11 = this.f2446a.x0()[0].b();
                    b11.rewind();
                    byte[] bArr = new byte[b11.capacity()];
                    b11.get(bArr);
                    h11.z(a0.c.j(new ByteArrayInputStream(bArr)).p());
                } else {
                    h11.x(this.f2447b);
                }
                c0.p d11 = this.f2448c.d();
                if (d11.b()) {
                    h11.k();
                }
                if (d11.c()) {
                    h11.l();
                }
                if (d11.a() != null) {
                    h11.b(this.f2448c.d().a());
                }
                h11.y();
                fileOutputStream.close();
                if (g0Var != null) {
                    g0Var.close();
                }
                codecFailedException = null;
                cVar = null;
                str = null;
                if (cVar != null) {
                    m(cVar, str, codecFailedException);
                    createTempFile.delete();
                    return null;
                }
                return createTempFile;
            } catch (Throwable th2) {
                if (g0Var != null) {
                    try {
                        g0Var.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e14) {
            m(c.FILE_IO_FAILED, "Failed to create temp file", e14);
            return null;
        }
    }

    private void p(ContentValues contentValues, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i11));
        }
    }

    private void q(Uri uri) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            p(contentValues, 0);
            this.f2448c.a().update(uri, contentValues, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x009e  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(java.io.File r6) {
        /*
            r5 = this;
            v3.h.f(r6)
            r0 = 0
            boolean r1 = r5.h()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            if (r1 == 0) goto L54
            androidx.camera.core.c0$s r1 = r5.f2448c     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            android.content.ContentValues r1 = r1.b()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            if (r1 == 0) goto L1e
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            androidx.camera.core.c0$s r2 = r5.f2448c     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            android.content.ContentValues r2 = r2.b()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            goto L23
        L1e:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            r1.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
        L23:
            r2 = 1
            r5.p(r1, r2)     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            androidx.camera.core.c0$s r2 = r5.f2448c     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            android.content.ContentResolver r2 = r2.a()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            androidx.camera.core.c0$s r3 = r5.f2448c     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            android.net.Uri r3 = r3.f()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            android.net.Uri r1 = r2.insert(r3, r1)     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            if (r1 != 0) goto L3f
            androidx.camera.core.l0$c r2 = androidx.camera.core.l0.c.FILE_IO_FAILED     // Catch: java.lang.IllegalArgumentException -> L50 java.io.IOException -> L52 java.lang.Throwable -> L89
            java.lang.String r3 = "Failed to insert URI."
            goto L95
        L3f:
            boolean r2 = r5.f(r6, r1)     // Catch: java.lang.IllegalArgumentException -> L50 java.io.IOException -> L52 java.lang.Throwable -> L89
            if (r2 != 0) goto L4a
            androidx.camera.core.l0$c r2 = androidx.camera.core.l0.c.FILE_IO_FAILED     // Catch: java.lang.IllegalArgumentException -> L50 java.io.IOException -> L52 java.lang.Throwable -> L89
            java.lang.String r3 = "Failed to save to URI."
            goto L4c
        L4a:
            r2 = r0
            r3 = r2
        L4c:
            r5.q(r1)     // Catch: java.lang.IllegalArgumentException -> L50 java.io.IOException -> L52 java.lang.Throwable -> L89
            goto L95
        L50:
            r0 = move-exception
            goto L91
        L52:
            r0 = move-exception
            goto L91
        L54:
            boolean r1 = r5.i()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            if (r1 == 0) goto L64
            androidx.camera.core.c0$s r1 = r5.f2448c     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            java.io.OutputStream r1 = r1.e()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            r5.e(r6, r1)     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            goto L85
        L64:
            boolean r1 = r5.g()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            if (r1 == 0) goto L85
            androidx.camera.core.c0$s r1 = r5.f2448c     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            java.io.File r1 = r1.c()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            if (r2 == 0) goto L79
            r1.delete()     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
        L79:
            boolean r1 = r6.renameTo(r1)     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            if (r1 != 0) goto L85
            androidx.camera.core.l0$c r2 = androidx.camera.core.l0.c.FILE_IO_FAILED     // Catch: java.lang.Throwable -> L89 java.lang.IllegalArgumentException -> L8b java.io.IOException -> L8d
            java.lang.String r3 = "Failed to rename file."
            r1 = r0
            goto L95
        L85:
            r1 = r0
            r2 = r1
            r3 = r2
            goto L95
        L89:
            r0 = move-exception
            goto La2
        L8b:
            r1 = move-exception
            goto L8e
        L8d:
            r1 = move-exception
        L8e:
            r4 = r1
            r1 = r0
            r0 = r4
        L91:
            androidx.camera.core.l0$c r2 = androidx.camera.core.l0.c.FILE_IO_FAILED     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "Failed to write destination file."
        L95:
            r6.delete()
            if (r2 == 0) goto L9e
            r5.m(r2, r3, r0)
            goto La1
        L9e:
            r5.n(r1)
        La1:
            return
        La2:
            r6.delete()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.l0.l(java.io.File):void");
    }

    @Override // java.lang.Runnable
    public void run() {
        final File o11 = o();
        if (o11 != null) {
            this.f2451f.execute(new Runnable() { // from class: androidx.camera.core.k0
                {
                    l0.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    l0.b(l0.this, o11);
                }
            });
        }
    }
}