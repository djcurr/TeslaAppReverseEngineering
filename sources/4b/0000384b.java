package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
class n1 extends l1<m1, m1> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: A */
    public m1 g(Object obj) {
        return ((y) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: B */
    public int h(m1 m1Var) {
        return m1Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: C */
    public int i(m1 m1Var) {
        return m1Var.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: D */
    public m1 k(m1 m1Var, m1 m1Var2) {
        return m1Var2.equals(m1.e()) ? m1Var : m1.k(m1Var, m1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: E */
    public m1 n() {
        return m1.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: F */
    public void o(Object obj, m1 m1Var) {
        p(obj, m1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: G */
    public void p(Object obj, m1 m1Var) {
        ((y) obj).unknownFields = m1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: H */
    public m1 r(m1 m1Var) {
        m1Var.j();
        return m1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: I */
    public void s(m1 m1Var, s1 s1Var) {
        m1Var.o(s1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: J */
    public void t(m1 m1Var, s1 s1Var) {
        m1Var.q(s1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    public void j(Object obj) {
        g(obj).j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    public boolean q(e1 e1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: u */
    public void a(m1 m1Var, int i11, int i12) {
        m1Var.n(r1.c(i11, 5), Integer.valueOf(i12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: v */
    public void b(m1 m1Var, int i11, long j11) {
        m1Var.n(r1.c(i11, 1), Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: w */
    public void c(m1 m1Var, int i11, m1 m1Var2) {
        m1Var.n(r1.c(i11, 3), m1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: x */
    public void d(m1 m1Var, int i11, i iVar) {
        m1Var.n(r1.c(i11, 2), iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: y */
    public void e(m1 m1Var, int i11, long j11) {
        m1Var.n(r1.c(i11, 0), Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l1
    /* renamed from: z */
    public m1 f(Object obj) {
        m1 g11 = g(obj);
        if (g11 == m1.e()) {
            m1 l11 = m1.l();
            p(obj, l11);
            return l11;
        }
        return g11;
    }
}