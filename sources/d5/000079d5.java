package io.sentry;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;
import rz.h;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class q extends j implements b0 {

    /* renamed from: c */
    private final c0 f32529c;

    /* renamed from: d */
    private final h0 f32530d;

    /* renamed from: e */
    private final d0 f32531e;

    public q(c0 c0Var, h0 h0Var, d0 d0Var, long j11) {
        super(d0Var, j11);
        this.f32529c = (c0) rz.j.a(c0Var, "Hub is required.");
        this.f32530d = (h0) rz.j.a(h0Var, "Serializer is required.");
        this.f32531e = (d0) rz.j.a(d0Var, "Logger is required.");
    }

    public static /* synthetic */ void g(q qVar, Throwable th2, File file, oz.f fVar) {
        qVar.k(th2, file, fVar);
    }

    public static /* synthetic */ void h(q qVar, oz.d dVar) {
        qVar.j(dVar);
    }

    public static /* synthetic */ void i(q qVar, File file, oz.f fVar) {
        qVar.l(file, fVar);
    }

    public /* synthetic */ void j(oz.d dVar) {
        if (dVar.d()) {
            return;
        }
        this.f32531e.c(f3.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    public /* synthetic */ void k(Throwable th2, File file, oz.f fVar) {
        fVar.c(false);
        this.f32531e.a(f3.INFO, th2, "File '%s' won't retry.", file.getAbsolutePath());
    }

    public /* synthetic */ void l(File file, oz.f fVar) {
        if (!fVar.a()) {
            m(file, "after trying to capture it");
            this.f32531e.c(f3.DEBUG, "Deleted file %s.", file.getAbsolutePath());
            return;
        }
        this.f32531e.c(f3.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
    }

    private void m(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f32531e.c(f3.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th2) {
            this.f32531e.a(f3.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.b0
    public void a(String str, t tVar) {
        rz.j.a(str, "Path is required.");
        f(new File(str), tVar);
    }

    @Override // io.sentry.j
    protected boolean c(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.j
    protected void f(final File file, t tVar) {
        d0 d0Var;
        h.a aVar;
        if (!file.isFile()) {
            this.f32531e.c(f3.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
        } else if (!c(file.getName())) {
            this.f32531e.c(f3.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
        } else {
            try {
                if (!file.getParentFile().canWrite()) {
                    this.f32531e.c(f3.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                    return;
                }
                try {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            i2 d11 = this.f32530d.d(bufferedInputStream);
                            if (d11 == null) {
                                this.f32531e.c(f3.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                            } else {
                                this.f32529c.f(d11, tVar);
                            }
                            rz.h.o(tVar, oz.d.class, this.f32531e, new h.a() { // from class: io.sentry.n
                                @Override // rz.h.a
                                public final void accept(Object obj) {
                                    q.h(q.this, (oz.d) obj);
                                }
                            });
                            bufferedInputStream.close();
                            d0Var = this.f32531e;
                            aVar = new h.a() { // from class: io.sentry.o
                                @Override // rz.h.a
                                public final void accept(Object obj) {
                                    q.i(q.this, file, (oz.f) obj);
                                }
                            };
                        } catch (Throwable th2) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (FileNotFoundException e11) {
                        this.f32531e.a(f3.ERROR, e11, "File '%s' cannot be found.", file.getAbsolutePath());
                        d0Var = this.f32531e;
                        aVar = new h.a() { // from class: io.sentry.o
                            @Override // rz.h.a
                            public final void accept(Object obj) {
                                q.i(q.this, file, (oz.f) obj);
                            }
                        };
                    }
                } catch (IOException e12) {
                    this.f32531e.a(f3.ERROR, e12, "I/O on file '%s' failed.", file.getAbsolutePath());
                    d0Var = this.f32531e;
                    aVar = new h.a() { // from class: io.sentry.o
                        @Override // rz.h.a
                        public final void accept(Object obj) {
                            q.i(q.this, file, (oz.f) obj);
                        }
                    };
                }
                rz.h.o(tVar, oz.f.class, d0Var, aVar);
            }
        }
    }
}