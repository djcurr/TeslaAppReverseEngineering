package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final AssetManager f5260a;

    /* renamed from: b */
    private final Executor f5261b;

    /* renamed from: c */
    private final d.c f5262c;

    /* renamed from: e */
    private final File f5264e;

    /* renamed from: f */
    private final String f5265f;

    /* renamed from: g */
    private final String f5266g;

    /* renamed from: h */
    private final String f5267h;

    /* renamed from: j */
    private b[] f5269j;

    /* renamed from: k */
    private byte[] f5270k;

    /* renamed from: i */
    private boolean f5268i = false;

    /* renamed from: d */
    private final byte[] f5263d = c();

    public a(AssetManager assetManager, Executor executor, d.c cVar, String str, String str2, String str3, File file) {
        this.f5260a = assetManager;
        this.f5261b = executor;
        this.f5262c = cVar;
        this.f5265f = str;
        this.f5266g = str2;
        this.f5267h = str3;
        this.f5264e = file;
    }

    private void b() {
        if (!this.f5268i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] c() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 24) {
            return null;
        }
        switch (i11) {
            case 24:
            case 25:
                return g.f5287d;
            case 26:
                return g.f5286c;
            case 27:
                return g.f5285b;
            case 28:
            case 29:
            case 30:
                return g.f5284a;
            default:
                return null;
        }
    }

    public /* synthetic */ void e(int i11, Object obj) {
        this.f5262c.a(i11, obj);
    }

    private static boolean g() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 24) {
            return false;
        }
        return i11 == 24 || i11 == 25;
    }

    private void h(final int i11, final Object obj) {
        this.f5261b.execute(new Runnable() { // from class: r4.a
            {
                androidx.profileinstaller.a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.a.this.e(i11, obj);
            }
        });
    }

    public boolean d() {
        if (this.f5263d == null) {
            h(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.f5264e.canWrite()) {
            h(4, null);
            return false;
        } else {
            this.f5268i = true;
            return true;
        }
    }

    public a f() {
        b();
        if (this.f5263d == null) {
            return this;
        }
        try {
            AssetFileDescriptor openFd = this.f5260a.openFd(this.f5266g);
            FileInputStream createInputStream = openFd.createInputStream();
            this.f5269j = f.l(createInputStream, f.g(createInputStream, f.f5282a), this.f5265f);
            if (createInputStream != null) {
                createInputStream.close();
            }
            openFd.close();
        } catch (FileNotFoundException e11) {
            this.f5262c.a(6, e11);
        } catch (IOException e12) {
            this.f5262c.a(7, e12);
        } catch (IllegalStateException e13) {
            this.f5262c.a(8, e13);
        }
        b[] bVarArr = this.f5269j;
        if (bVarArr != null && g()) {
            try {
                AssetFileDescriptor openFd2 = this.f5260a.openFd(this.f5267h);
                try {
                    FileInputStream createInputStream2 = openFd2.createInputStream();
                    this.f5269j = f.i(createInputStream2, f.g(createInputStream2, f.f5283b), bVarArr);
                    if (createInputStream2 != null) {
                        createInputStream2.close();
                    }
                    openFd2.close();
                    return this;
                } catch (Throwable th2) {
                    if (openFd2 != null) {
                        try {
                            openFd2.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e14) {
                this.f5262c.a(9, e14);
            } catch (IOException e15) {
                this.f5262c.a(7, e15);
            } catch (IllegalStateException e16) {
                this.f5262c.a(8, e16);
            }
        }
        return this;
    }

    public a i() {
        ByteArrayOutputStream byteArrayOutputStream;
        b[] bVarArr = this.f5269j;
        byte[] bArr = this.f5263d;
        if (bVarArr != null && bArr != null) {
            b();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e11) {
                this.f5262c.a(7, e11);
            } catch (IllegalStateException e12) {
                this.f5262c.a(8, e12);
            }
            try {
                f.s(byteArrayOutputStream, bArr);
                if (!f.q(byteArrayOutputStream, bArr, bVarArr)) {
                    this.f5262c.a(5, null);
                    this.f5269j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f5270k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f5269j = null;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [byte[], androidx.profileinstaller.b[]] */
    public boolean j() {
        byte[] bArr = this.f5270k;
        if (bArr == null) {
            return false;
        }
        b();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f5264e);
                    c.k(byteArrayInputStream, fileOutputStream);
                    h(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e11) {
                h(6, e11);
                return false;
            } catch (IOException e12) {
                h(7, e12);
                return false;
            }
        } finally {
            this.f5270k = null;
            this.f5269j = null;
        }
    }
}