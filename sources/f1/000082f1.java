package la;

import android.util.Log;
import ea.a;
import java.io.File;
import java.io.IOException;
import la.a;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: b */
    private final File f37132b;

    /* renamed from: c */
    private final long f37133c;

    /* renamed from: e */
    private ea.a f37135e;

    /* renamed from: d */
    private final c f37134d = new c();

    /* renamed from: a */
    private final j f37131a = new j();

    @Deprecated
    protected e(File file, long j11) {
        this.f37132b = file;
        this.f37133c = j11;
    }

    public static a c(File file, long j11) {
        return new e(file, j11);
    }

    private synchronized ea.a d() {
        if (this.f37135e == null) {
            this.f37135e = ea.a.D0(this.f37132b, 1, 1, this.f37133c);
        }
        return this.f37135e;
    }

    private synchronized void e() {
        this.f37135e = null;
    }

    @Override // la.a
    public File a(ha.b bVar) {
        String b11 = this.f37131a.b(bVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b11 + " for for Key: " + bVar);
        }
        try {
            a.e u02 = d().u0(b11);
            if (u02 != null) {
                return u02.a(0);
            }
            return null;
        } catch (IOException e11) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e11);
                return null;
            }
            return null;
        }
    }

    @Override // la.a
    public void b(ha.b bVar, a.b bVar2) {
        ea.a d11;
        String b11 = this.f37131a.b(bVar);
        this.f37134d.a(b11);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b11 + " for for Key: " + bVar);
            }
            try {
                d11 = d();
            } catch (IOException e11) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e11);
                }
            }
            if (d11.u0(b11) != null) {
                return;
            }
            a.c n02 = d11.n0(b11);
            if (n02 != null) {
                try {
                    if (bVar2.a(n02.f(0))) {
                        n02.e();
                    }
                    n02.b();
                    return;
                } catch (Throwable th2) {
                    n02.b();
                    throw th2;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + b11);
        } finally {
            this.f37134d.b(b11);
        }
    }

    @Override // la.a
    public synchronized void clear() {
        try {
            d().a0();
        } catch (IOException e11) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e11);
            }
        }
        e();
    }
}