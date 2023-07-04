package androidx.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j0 implements v4.g {

    /* renamed from: a */
    private final v4.g f5781a;

    /* renamed from: b */
    private final t0.f f5782b;

    /* renamed from: c */
    private final Executor f5783c;

    public j0(v4.g gVar, t0.f fVar, Executor executor) {
        this.f5781a = gVar;
        this.f5782b = fVar;
        this.f5783c = executor;
    }

    public static /* synthetic */ void C(j0 j0Var, String str) {
        j0Var.p0(str);
    }

    public /* synthetic */ void C0() {
        this.f5782b.a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    public static /* synthetic */ void D(j0 j0Var, v4.j jVar, m0 m0Var) {
        j0Var.u0(jVar, m0Var);
    }

    public static /* synthetic */ void J(j0 j0Var) {
        j0Var.L();
    }

    public /* synthetic */ void L() {
        this.f5782b.a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    public /* synthetic */ void R() {
        this.f5782b.a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    public static /* synthetic */ void a(j0 j0Var) {
        j0Var.a0();
    }

    public /* synthetic */ void a0() {
        this.f5782b.a("END TRANSACTION", Collections.emptyList());
    }

    public /* synthetic */ void e0(String str) {
        this.f5782b.a(str, new ArrayList(0));
    }

    public static /* synthetic */ void g(j0 j0Var) {
        j0Var.R();
    }

    public static /* synthetic */ void j(j0 j0Var) {
        j0Var.C0();
    }

    public static /* synthetic */ void l(j0 j0Var, String str, List list) {
        j0Var.n0(str, list);
    }

    public static /* synthetic */ void m(j0 j0Var, String str) {
        j0Var.e0(str);
    }

    public /* synthetic */ void n0(String str, List list) {
        this.f5782b.a(str, list);
    }

    public static /* synthetic */ void p(j0 j0Var, v4.j jVar, m0 m0Var) {
        j0Var.t0(jVar, m0Var);
    }

    public /* synthetic */ void p0(String str) {
        this.f5782b.a(str, Collections.emptyList());
    }

    public /* synthetic */ void t0(v4.j jVar, m0 m0Var) {
        this.f5782b.a(jVar.a(), m0Var.a());
    }

    public /* synthetic */ void u0(v4.j jVar, m0 m0Var) {
        this.f5782b.a(jVar.a(), m0Var.a());
    }

    @Override // v4.g
    public boolean B1() {
        return this.f5781a.B1();
    }

    @Override // v4.g
    public v4.k H0(String str) {
        return new p0(this.f5781a.H0(str), this.f5782b, str, this.f5783c);
    }

    @Override // v4.g
    public void N() {
        this.f5783c.execute(new Runnable() { // from class: androidx.room.c0
            {
                j0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.j(j0.this);
            }
        });
        this.f5781a.N();
    }

    @Override // v4.g
    public void P(final String str, Object[] objArr) {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.f5783c.execute(new Runnable() { // from class: androidx.room.g0
            {
                j0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.l(j0.this, str, arrayList);
            }
        });
        this.f5781a.P(str, arrayList.toArray());
    }

    @Override // v4.g
    public void Q() {
        this.f5783c.execute(new Runnable() { // from class: androidx.room.b0
            {
                j0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.g(j0.this);
            }
        });
        this.f5781a.Q();
    }

    @Override // v4.g
    public void X() {
        this.f5783c.execute(new Runnable() { // from class: androidx.room.a0
            {
                j0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.a(j0.this);
            }
        });
        this.f5781a.X();
    }

    @Override // v4.g
    public Cursor a1(final String str) {
        this.f5783c.execute(new Runnable() { // from class: androidx.room.f0
            {
                j0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.C(j0.this, str);
            }
        });
        return this.f5781a.a1(str);
    }

    @Override // v4.g
    public void beginTransaction() {
        this.f5783c.execute(new Runnable() { // from class: androidx.room.d0
            {
                j0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.J(j0.this);
            }
        });
        this.f5781a.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5781a.close();
    }

    @Override // v4.g
    public Cursor d0(final v4.j jVar) {
        final m0 m0Var = new m0();
        jVar.g(m0Var);
        this.f5783c.execute(new Runnable() { // from class: androidx.room.h0
            {
                j0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.p(j0.this, jVar, m0Var);
            }
        });
        return this.f5781a.d0(jVar);
    }

    @Override // v4.g
    public Cursor e1(final v4.j jVar, CancellationSignal cancellationSignal) {
        final m0 m0Var = new m0();
        jVar.g(m0Var);
        this.f5783c.execute(new Runnable() { // from class: androidx.room.i0
            {
                j0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.D(j0.this, jVar, m0Var);
            }
        });
        return this.f5781a.d0(jVar);
    }

    @Override // v4.g
    public String getPath() {
        return this.f5781a.getPath();
    }

    @Override // v4.g
    public boolean isOpen() {
        return this.f5781a.isOpen();
    }

    @Override // v4.g
    public List<Pair<String, String>> s() {
        return this.f5781a.s();
    }

    @Override // v4.g
    public boolean s1() {
        return this.f5781a.s1();
    }

    @Override // v4.g
    public void u(final String str) {
        this.f5783c.execute(new Runnable() { // from class: androidx.room.e0
            {
                j0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.m(j0.this, str);
            }
        });
        this.f5781a.u(str);
    }
}