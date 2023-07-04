package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;
import rz.h;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class o1 extends j implements b0 {

    /* renamed from: g */
    private static final Charset f32339g = Charset.forName("UTF-8");

    /* renamed from: c */
    private final c0 f32340c;

    /* renamed from: d */
    private final a0 f32341d;

    /* renamed from: e */
    private final h0 f32342e;

    /* renamed from: f */
    private final d0 f32343f;

    public o1(c0 c0Var, a0 a0Var, h0 h0Var, d0 d0Var, long j11) {
        super(d0Var, j11);
        this.f32340c = (c0) rz.j.a(c0Var, "Hub is required.");
        this.f32341d = (a0) rz.j.a(a0Var, "Envelope reader is required.");
        this.f32342e = (h0) rz.j.a(h0Var, "Serializer is required.");
        this.f32343f = (d0) rz.j.a(d0Var, "Logger is required.");
    }

    public static /* synthetic */ void g(o1 o1Var, File file, oz.f fVar) {
        o1Var.j(file, fVar);
    }

    public static /* synthetic */ void h(oz.e eVar) {
        eVar.reset();
    }

    public /* synthetic */ void j(File file, oz.f fVar) {
        if (fVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f32343f.c(f3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e11) {
            this.f32343f.a(f3.ERROR, e11, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    private void k(z2 z2Var, int i11) {
        this.f32343f.c(f3.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i11), z2Var.w().b());
    }

    private void l(int i11) {
        this.f32343f.c(f3.DEBUG, "Item %d is being captured.", Integer.valueOf(i11));
    }

    private void m(io.sentry.protocol.o oVar) {
        this.f32343f.c(f3.WARNING, "Timed out waiting for event id submission: %s", oVar);
    }

    private void n(i2 i2Var, io.sentry.protocol.o oVar, int i11) {
        this.f32343f.c(f3.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i11), i2Var.b().a(), oVar);
    }

    private void o(i2 i2Var, t tVar) {
        Object f11;
        this.f32343f.c(f3.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(rz.a.d(i2Var.c())));
        int i11 = 0;
        for (z2 z2Var : i2Var.c()) {
            i11++;
            if (z2Var.w() == null) {
                this.f32343f.c(f3.ERROR, "Item %d has no header", Integer.valueOf(i11));
            } else if (e3.Event.equals(z2Var.w().b())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(z2Var.v()), f32339g));
                    b3 b3Var = (b3) this.f32342e.c(bufferedReader, b3.class);
                    if (b3Var == null) {
                        k(z2Var, i11);
                    } else if (i2Var.b().a() != null && !i2Var.b().a().equals(b3Var.E())) {
                        n(i2Var, b3Var.E(), i11);
                        bufferedReader.close();
                    } else {
                        this.f32340c.o(b3Var, tVar);
                        l(i11);
                        if (!p(tVar)) {
                            m(b3Var.E());
                            bufferedReader.close();
                            return;
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    this.f32343f.b(f3.ERROR, "Item failed to process.", th2);
                }
                f11 = rz.h.f(tVar);
                if (!(f11 instanceof oz.k) && !((oz.k) f11).e()) {
                    this.f32343f.c(f3.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i11));
                    return;
                }
                rz.h.m(tVar, oz.e.class, new h.a() { // from class: io.sentry.n1
                    @Override // rz.h.a
                    public final void accept(Object obj) {
                        o1.h((oz.e) obj);
                    }
                });
            } else {
                if (e3.Transaction.equals(z2Var.w().b())) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(z2Var.v()), f32339g));
                        io.sentry.protocol.v vVar = (io.sentry.protocol.v) this.f32342e.c(bufferedReader2, io.sentry.protocol.v.class);
                        if (vVar == null) {
                            k(z2Var, i11);
                        } else if (i2Var.b().a() != null && !i2Var.b().a().equals(vVar.E())) {
                            n(i2Var, vVar.E(), i11);
                            bufferedReader2.close();
                        } else {
                            if (vVar.B().f() != null) {
                                vVar.B().f().j(Boolean.TRUE);
                            }
                            this.f32340c.g(vVar, i2Var.b().c(), tVar);
                            l(i11);
                            if (!p(tVar)) {
                                m(vVar.E());
                                bufferedReader2.close();
                                return;
                            }
                        }
                        bufferedReader2.close();
                    } catch (Throwable th3) {
                        this.f32343f.b(f3.ERROR, "Item failed to process.", th3);
                    }
                } else {
                    this.f32340c.f(new i2(i2Var.b().a(), i2Var.b().b(), z2Var), tVar);
                    this.f32343f.c(f3.DEBUG, "%s item %d is being captured.", z2Var.w().b().getItemType(), Integer.valueOf(i11));
                    if (!p(tVar)) {
                        this.f32343f.c(f3.WARNING, "Timed out waiting for item type submission: %s", z2Var.w().b().getItemType());
                        return;
                    }
                }
                f11 = rz.h.f(tVar);
                if (!(f11 instanceof oz.k)) {
                }
                rz.h.m(tVar, oz.e.class, new h.a() { // from class: io.sentry.n1
                    @Override // rz.h.a
                    public final void accept(Object obj) {
                        o1.h((oz.e) obj);
                    }
                });
            }
        }
    }

    private boolean p(t tVar) {
        Object f11 = rz.h.f(tVar);
        if (f11 instanceof oz.d) {
            return ((oz.d) f11).d();
        }
        rz.i.a(oz.d.class, f11, this.f32343f);
        return true;
    }

    @Override // io.sentry.b0
    public void a(String str, t tVar) {
        rz.j.a(str, "Path is required.");
        f(new File(str), tVar);
    }

    @Override // io.sentry.j
    protected boolean c(String str) {
        return (str == null || str.startsWith("session")) ? false : true;
    }

    @Override // io.sentry.j
    protected void f(final File file, t tVar) {
        d0 d0Var;
        h.a aVar;
        rz.j.a(file, "File is required.");
        try {
            if (!c(file.getName())) {
                this.f32343f.c(f3.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    i2 a11 = this.f32341d.a(bufferedInputStream);
                    if (a11 == null) {
                        this.f32343f.c(f3.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        o(a11, tVar);
                        this.f32343f.c(f3.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    d0Var = this.f32343f;
                    aVar = new h.a() { // from class: io.sentry.m1
                        @Override // rz.h.a
                        public final void accept(Object obj) {
                            o1.g(o1.this, file, (oz.f) obj);
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
            } catch (IOException e11) {
                this.f32343f.b(f3.ERROR, "Error processing envelope.", e11);
                d0Var = this.f32343f;
                aVar = new h.a() { // from class: io.sentry.m1
                    @Override // rz.h.a
                    public final void accept(Object obj) {
                        o1.g(o1.this, file, (oz.f) obj);
                    }
                };
            }
            rz.h.o(tVar, oz.f.class, d0Var, aVar);
        } catch (Throwable th4) {
            rz.h.o(tVar, oz.f.class, this.f32343f, new h.a() { // from class: io.sentry.m1
                @Override // rz.h.a
                public final void accept(Object obj) {
                    o1.g(o1.this, file, (oz.f) obj);
                }
            });
            throw th4;
        }
    }
}