package y0;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a */
    private static final c1.w0<r1> f58660a = c1.r.d(a.f58661a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<r1> {

        /* renamed from: a */
        public static final a f58661a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final r1 invoke() {
            return new r1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
    }

    public static final c1.w0<r1> b() {
        return f58660a;
    }

    public static final n2.a0 c(n2.a0 a0Var, r2.e eVar) {
        n2.a0 b11;
        if (a0Var.g() != null) {
            return a0Var;
        }
        b11 = a0Var.b((r44 & 1) != 0 ? a0Var.f() : 0L, (r44 & 2) != 0 ? a0Var.i() : 0L, (r44 & 4) != 0 ? a0Var.f40266c : null, (r44 & 8) != 0 ? a0Var.j() : null, (r44 & 16) != 0 ? a0Var.k() : null, (r44 & 32) != 0 ? a0Var.f40269f : eVar, (r44 & 64) != 0 ? a0Var.f40270g : null, (r44 & 128) != 0 ? a0Var.m() : 0L, (r44 & 256) != 0 ? a0Var.e() : null, (r44 & 512) != 0 ? a0Var.f40273j : null, (r44 & 1024) != 0 ? a0Var.f40274k : null, (r44 & 2048) != 0 ? a0Var.d() : 0L, (r44 & 4096) != 0 ? a0Var.f40276m : null, (r44 & PKIFailureInfo.certRevoked) != 0 ? a0Var.f40277n : null, (r44 & 16384) != 0 ? a0Var.q() : null, (r44 & 32768) != 0 ? a0Var.s() : null, (r44 & 65536) != 0 ? a0Var.n() : 0L, (r44 & 131072) != 0 ? a0Var.f40281r : null);
        return b11;
    }
}