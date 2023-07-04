package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.r1;
import com.google.crypto.tink.shaded.protobuf.u;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class u0<T> implements f1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f16408a;

    /* renamed from: b  reason: collision with root package name */
    private final l1<?, ?> f16409b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f16410c;

    /* renamed from: d  reason: collision with root package name */
    private final q<?> f16411d;

    private u0(l1<?, ?> l1Var, q<?> qVar, q0 q0Var) {
        this.f16409b = l1Var;
        this.f16410c = qVar.e(q0Var);
        this.f16411d = qVar;
        this.f16408a = q0Var;
    }

    private <UT, UB> int d(l1<UT, UB> l1Var, T t11) {
        return l1Var.i(l1Var.g(t11));
    }

    private <UT, UB, ET extends u.b<ET>> void e(l1<UT, UB> l1Var, q<ET> qVar, T t11, e1 e1Var, p pVar) {
        UB f11 = l1Var.f(t11);
        u<ET> d11 = qVar.d(t11);
        do {
            try {
                if (e1Var.getFieldNumber() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                l1Var.o(t11, f11);
            }
        } while (g(e1Var, pVar, qVar, d11, l1Var, f11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> u0<T> f(l1<?, ?> l1Var, q<?> qVar, q0 q0Var) {
        return new u0<>(l1Var, qVar, q0Var);
    }

    private <UT, UB, ET extends u.b<ET>> boolean g(e1 e1Var, p pVar, q<ET> qVar, u<ET> uVar, l1<UT, UB> l1Var, UB ub2) {
        int tag = e1Var.getTag();
        if (tag != r1.f16377a) {
            if (r1.b(tag) == 2) {
                Object b11 = qVar.b(pVar, this.f16408a, r1.a(tag));
                if (b11 != null) {
                    qVar.h(e1Var, b11, pVar, uVar);
                    return true;
                }
                return l1Var.m(ub2, e1Var);
            }
            return e1Var.skipField();
        }
        int i11 = 0;
        Object obj = null;
        i iVar = null;
        while (e1Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = e1Var.getTag();
            if (tag2 == r1.f16379c) {
                i11 = e1Var.readUInt32();
                obj = qVar.b(pVar, this.f16408a, i11);
            } else if (tag2 == r1.f16380d) {
                if (obj != null) {
                    qVar.h(e1Var, obj, pVar, uVar);
                } else {
                    iVar = e1Var.readBytes();
                }
            } else if (!e1Var.skipField()) {
                break;
            }
        }
        if (e1Var.getTag() == r1.f16378b) {
            if (iVar != null) {
                if (obj != null) {
                    qVar.i(iVar, obj, pVar, uVar);
                } else {
                    l1Var.d(ub2, i11, iVar);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.a();
    }

    private <UT, UB> void h(l1<UT, UB> l1Var, T t11, s1 s1Var) {
        l1Var.s(l1Var.g(t11), s1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:34:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.e.b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.crypto.tink.shaded.protobuf.y r0 = (com.google.crypto.tink.shaded.protobuf.y) r0
            com.google.crypto.tink.shaded.protobuf.m1 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.m1 r2 = com.google.crypto.tink.shaded.protobuf.m1.e()
            if (r1 != r2) goto L11
            com.google.crypto.tink.shaded.protobuf.m1 r1 = com.google.crypto.tink.shaded.protobuf.m1.l()
            r0.unknownFields = r1
        L11:
            com.google.crypto.tink.shaded.protobuf.y$c r11 = (com.google.crypto.tink.shaded.protobuf.y.c) r11
            com.google.crypto.tink.shaded.protobuf.u r11 = r11.C()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r13, r15)
            int r13 = r15.f16253a
            int r3 = com.google.crypto.tink.shaded.protobuf.r1.f16377a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.crypto.tink.shaded.protobuf.r1.b(r13)
            if (r3 != r5) goto L66
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r10.f16411d
            com.google.crypto.tink.shaded.protobuf.p r3 = r15.f16256d
            com.google.crypto.tink.shaded.protobuf.q0 r5 = r10.f16408a
            int r6 = com.google.crypto.tink.shaded.protobuf.r1.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.crypto.tink.shaded.protobuf.y$e r8 = (com.google.crypto.tink.shaded.protobuf.y.e) r8
            if (r8 == 0) goto L5b
            com.google.crypto.tink.shaded.protobuf.b1 r13 = com.google.crypto.tink.shaded.protobuf.b1.a()
            com.google.crypto.tink.shaded.protobuf.q0 r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.f1 r13 = r13.d(r2)
            int r13 = com.google.crypto.tink.shaded.protobuf.e.p(r13, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.y$d r2 = r8.f16431b
            java.lang.Object r3 = r15.f16255c
            r11.w(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.crypto.tink.shaded.protobuf.e.G(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.crypto.tink.shaded.protobuf.e.N(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r6 = r15.f16253a
            int r7 = com.google.crypto.tink.shaded.protobuf.r1.a(r6)
            int r8 = com.google.crypto.tink.shaded.protobuf.r1.b(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.crypto.tink.shaded.protobuf.b1 r6 = com.google.crypto.tink.shaded.protobuf.b1.a()
            com.google.crypto.tink.shaded.protobuf.q0 r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.crypto.tink.shaded.protobuf.f1 r6 = r6.d(r7)
            int r4 = com.google.crypto.tink.shaded.protobuf.e.p(r6, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.y$d r6 = r2.f16431b
            java.lang.Object r7 = r15.f16255c
            r11.w(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.b(r12, r4, r15)
            java.lang.Object r3 = r15.f16255c
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.i) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r13 = r15.f16253a
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r10.f16411d
            com.google.crypto.tink.shaded.protobuf.p r6 = r15.f16256d
            com.google.crypto.tink.shaded.protobuf.q0 r7 = r10.f16408a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.crypto.tink.shaded.protobuf.y$e r2 = (com.google.crypto.tink.shaded.protobuf.y.e) r2
            goto L6d
        Lc1:
            int r7 = com.google.crypto.tink.shaded.protobuf.r1.f16378b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.crypto.tink.shaded.protobuf.e.N(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.crypto.tink.shaded.protobuf.r1.c(r13, r5)
            r1.n(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r11 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.a(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void b(T t11, e1 e1Var, p pVar) {
        e(this.f16409b, this.f16411d, t11, e1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void c(T t11, s1 s1Var) {
        Iterator<Map.Entry<?, Object>> r11 = this.f16411d.c(t11).r();
        while (r11.hasNext()) {
            Map.Entry<?, Object> next = r11.next();
            u.b bVar = (u.b) next.getKey();
            if (bVar.getLiteJavaType() == r1.c.MESSAGE && !bVar.isRepeated() && !bVar.isPacked()) {
                if (next instanceof c0.b) {
                    s1Var.writeMessageSetItem(bVar.getNumber(), ((c0.b) next).a().e());
                } else {
                    s1Var.writeMessageSetItem(bVar.getNumber(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        h(this.f16409b, t11, s1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public boolean equals(T t11, T t12) {
        if (this.f16409b.g(t11).equals(this.f16409b.g(t12))) {
            if (this.f16410c) {
                return this.f16411d.c(t11).equals(this.f16411d.c(t12));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int getSerializedSize(T t11) {
        int d11 = d(this.f16409b, t11) + 0;
        return this.f16410c ? d11 + this.f16411d.c(t11).j() : d11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int hashCode(T t11) {
        int hashCode = this.f16409b.g(t11).hashCode();
        return this.f16410c ? (hashCode * 53) + this.f16411d.c(t11).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public final boolean isInitialized(T t11) {
        return this.f16411d.c(t11).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void makeImmutable(T t11) {
        this.f16409b.j(t11);
        this.f16411d.f(t11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void mergeFrom(T t11, T t12) {
        h1.G(this.f16409b, t11, t12);
        if (this.f16410c) {
            h1.E(this.f16411d, t11, t12);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public T newInstance() {
        return (T) this.f16408a.newBuilderForType().buildPartial();
    }
}