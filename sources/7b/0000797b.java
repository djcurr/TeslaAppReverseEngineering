package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a */
    private final d0 f32297a;

    /* renamed from: b */
    private final long f32298b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a implements oz.b, oz.f, oz.k, oz.d {

        /* renamed from: a */
        boolean f32299a = false;

        /* renamed from: b */
        boolean f32300b = false;

        /* renamed from: c */
        private final CountDownLatch f32301c = new CountDownLatch(1);

        /* renamed from: d */
        private final long f32302d;

        /* renamed from: e */
        private final d0 f32303e;

        public a(long j11, d0 d0Var) {
            this.f32302d = j11;
            this.f32303e = d0Var;
        }

        @Override // oz.f
        public boolean a() {
            return this.f32299a;
        }

        @Override // oz.k
        public void b(boolean z11) {
            this.f32300b = z11;
            this.f32301c.countDown();
        }

        @Override // oz.f
        public void c(boolean z11) {
            this.f32299a = z11;
        }

        @Override // oz.d
        public boolean d() {
            try {
                return this.f32301c.await(this.f32302d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                this.f32303e.b(f3.ERROR, "Exception while awaiting on lock.", e11);
                return false;
            }
        }

        @Override // oz.k
        public boolean e() {
            return this.f32300b;
        }
    }

    public j(d0 d0Var, long j11) {
        this.f32297a = d0Var;
        this.f32298b = j11;
    }

    public static /* synthetic */ boolean b(j jVar, File file, String str) {
        return jVar.d(file, str);
    }

    public /* synthetic */ boolean d(File file, String str) {
        return c(str);
    }

    protected abstract boolean c(String str);

    public void e(File file) {
        try {
            d0 d0Var = this.f32297a;
            f3 f3Var = f3.DEBUG;
            d0Var.c(f3Var, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                this.f32297a.c(f3.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
            } else if (!file.isDirectory()) {
                this.f32297a.c(f3.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    this.f32297a.c(f3.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                    return;
                }
                File[] listFiles2 = file.listFiles(new FilenameFilter() { // from class: io.sentry.i
                    {
                        j.this = this;
                    }

                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str) {
                        return j.b(j.this, file2, str);
                    }
                });
                d0 d0Var2 = this.f32297a;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(listFiles2 != null ? listFiles2.length : 0);
                objArr[1] = file.getAbsolutePath();
                d0Var2.c(f3Var, "Processing %d items from cache dir %s", objArr);
                for (File file2 : listFiles) {
                    if (!file2.isFile()) {
                        this.f32297a.c(f3.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    } else {
                        this.f32297a.c(f3.DEBUG, "Processing file: %s", file2.getAbsolutePath());
                        f(file2, rz.h.e(new a(this.f32298b, this.f32297a)));
                    }
                }
            }
        } catch (Throwable th2) {
            this.f32297a.a(f3.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    protected abstract void f(File file, t tVar);
}