package p10;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import p10.t;
import p10.w;

/* loaded from: classes5.dex */
public final class l extends h.d<l> {

    /* renamed from: k  reason: collision with root package name */
    private static final l f45650k;

    /* renamed from: l  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<l> f45651l = new a();

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45652b;

    /* renamed from: c  reason: collision with root package name */
    private int f45653c;

    /* renamed from: d  reason: collision with root package name */
    private List<i> f45654d;

    /* renamed from: e  reason: collision with root package name */
    private List<n> f45655e;

    /* renamed from: f  reason: collision with root package name */
    private List<r> f45656f;

    /* renamed from: g  reason: collision with root package name */
    private t f45657g;

    /* renamed from: h  reason: collision with root package name */
    private w f45658h;

    /* renamed from: i  reason: collision with root package name */
    private byte f45659i;

    /* renamed from: j  reason: collision with root package name */
    private int f45660j;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<l> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public l c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new l(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.c<l, b> {

        /* renamed from: d  reason: collision with root package name */
        private int f45661d;

        /* renamed from: e  reason: collision with root package name */
        private List<i> f45662e = Collections.emptyList();

        /* renamed from: f  reason: collision with root package name */
        private List<n> f45663f = Collections.emptyList();

        /* renamed from: g  reason: collision with root package name */
        private List<r> f45664g = Collections.emptyList();

        /* renamed from: h  reason: collision with root package name */
        private t f45665h = t.q();

        /* renamed from: i  reason: collision with root package name */
        private w f45666i = w.o();

        private b() {
            t();
        }

        static /* synthetic */ b l() {
            return p();
        }

        private static b p() {
            return new b();
        }

        private void q() {
            if ((this.f45661d & 1) != 1) {
                this.f45662e = new ArrayList(this.f45662e);
                this.f45661d |= 1;
            }
        }

        private void r() {
            if ((this.f45661d & 2) != 2) {
                this.f45663f = new ArrayList(this.f45663f);
                this.f45661d |= 2;
            }
        }

        private void s() {
            if ((this.f45661d & 4) != 4) {
                this.f45664g = new ArrayList(this.f45664g);
                this.f45661d |= 4;
            }
        }

        private void t() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: m */
        public l build() {
            l n11 = n();
            if (n11.isInitialized()) {
                return n11;
            }
            throw a.AbstractC0651a.c(n11);
        }

        public l n() {
            l lVar = new l(this);
            int i11 = this.f45661d;
            if ((i11 & 1) == 1) {
                this.f45662e = Collections.unmodifiableList(this.f45662e);
                this.f45661d &= -2;
            }
            lVar.f45654d = this.f45662e;
            if ((this.f45661d & 2) == 2) {
                this.f45663f = Collections.unmodifiableList(this.f45663f);
                this.f45661d &= -3;
            }
            lVar.f45655e = this.f45663f;
            if ((this.f45661d & 4) == 4) {
                this.f45664g = Collections.unmodifiableList(this.f45664g);
                this.f45661d &= -5;
            }
            lVar.f45656f = this.f45664g;
            int i12 = (i11 & 8) != 8 ? 0 : 1;
            lVar.f45657g = this.f45665h;
            if ((i11 & 16) == 16) {
                i12 |= 2;
            }
            lVar.f45658h = this.f45666i;
            lVar.f45653c = i12;
            return lVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: o */
        public b d() {
            return p().f(n());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: u */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.l.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.l> r1 = p10.l.f45651l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.l r3 = (p10.l) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.f(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                p10.l r4 = (p10.l) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.f(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p10.l.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.l$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v */
        public b f(l lVar) {
            if (lVar == l.F()) {
                return this;
            }
            if (!lVar.f45654d.isEmpty()) {
                if (this.f45662e.isEmpty()) {
                    this.f45662e = lVar.f45654d;
                    this.f45661d &= -2;
                } else {
                    q();
                    this.f45662e.addAll(lVar.f45654d);
                }
            }
            if (!lVar.f45655e.isEmpty()) {
                if (this.f45663f.isEmpty()) {
                    this.f45663f = lVar.f45655e;
                    this.f45661d &= -3;
                } else {
                    r();
                    this.f45663f.addAll(lVar.f45655e);
                }
            }
            if (!lVar.f45656f.isEmpty()) {
                if (this.f45664g.isEmpty()) {
                    this.f45664g = lVar.f45656f;
                    this.f45661d &= -5;
                } else {
                    s();
                    this.f45664g.addAll(lVar.f45656f);
                }
            }
            if (lVar.S()) {
                w(lVar.Q());
            }
            if (lVar.T()) {
                x(lVar.R());
            }
            k(lVar);
            g(e().c(lVar.f45652b));
            return this;
        }

        public b w(t tVar) {
            if ((this.f45661d & 8) == 8 && this.f45665h != t.q()) {
                this.f45665h = t.y(this.f45665h).f(tVar).j();
            } else {
                this.f45665h = tVar;
            }
            this.f45661d |= 8;
            return this;
        }

        public b x(w wVar) {
            if ((this.f45661d & 16) == 16 && this.f45666i != w.o()) {
                this.f45666i = w.t(this.f45666i).f(wVar).j();
            } else {
                this.f45666i = wVar;
            }
            this.f45661d |= 16;
            return this;
        }
    }

    static {
        l lVar = new l(true);
        f45650k = lVar;
        lVar.U();
    }

    public static l F() {
        return f45650k;
    }

    private void U() {
        this.f45654d = Collections.emptyList();
        this.f45655e = Collections.emptyList();
        this.f45656f = Collections.emptyList();
        this.f45657g = t.q();
        this.f45658h = w.o();
    }

    public static b V() {
        return b.l();
    }

    public static b W(l lVar) {
        return V().f(lVar);
    }

    public static l Y(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return f45651l.a(inputStream, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: G */
    public l getDefaultInstanceForType() {
        return f45650k;
    }

    public i H(int i11) {
        return this.f45654d.get(i11);
    }

    public int I() {
        return this.f45654d.size();
    }

    public List<i> J() {
        return this.f45654d;
    }

    public n K(int i11) {
        return this.f45655e.get(i11);
    }

    public int L() {
        return this.f45655e.size();
    }

    public List<n> M() {
        return this.f45655e;
    }

    public r N(int i11) {
        return this.f45656f.get(i11);
    }

    public int O() {
        return this.f45656f.size();
    }

    public List<r> P() {
        return this.f45656f;
    }

    public t Q() {
        return this.f45657g;
    }

    public w R() {
        return this.f45658h;
    }

    public boolean S() {
        return (this.f45653c & 1) == 1;
    }

    public boolean T() {
        return (this.f45653c & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: X */
    public b newBuilderForType() {
        return V();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: Z */
    public b toBuilder() {
        return W(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        h.d<MessageType>.a s11 = s();
        for (int i11 = 0; i11 < this.f45654d.size(); i11++) {
            codedOutputStream.d0(3, this.f45654d.get(i11));
        }
        for (int i12 = 0; i12 < this.f45655e.size(); i12++) {
            codedOutputStream.d0(4, this.f45655e.get(i12));
        }
        for (int i13 = 0; i13 < this.f45656f.size(); i13++) {
            codedOutputStream.d0(5, this.f45656f.get(i13));
        }
        if ((this.f45653c & 1) == 1) {
            codedOutputStream.d0(30, this.f45657g);
        }
        if ((this.f45653c & 2) == 2) {
            codedOutputStream.d0(32, this.f45658h);
        }
        s11.a(200, codedOutputStream);
        codedOutputStream.i0(this.f45652b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<l> getParserForType() {
        return f45651l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45660j;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f45654d.size(); i13++) {
            i12 += CodedOutputStream.s(3, this.f45654d.get(i13));
        }
        for (int i14 = 0; i14 < this.f45655e.size(); i14++) {
            i12 += CodedOutputStream.s(4, this.f45655e.get(i14));
        }
        for (int i15 = 0; i15 < this.f45656f.size(); i15++) {
            i12 += CodedOutputStream.s(5, this.f45656f.get(i15));
        }
        if ((this.f45653c & 1) == 1) {
            i12 += CodedOutputStream.s(30, this.f45657g);
        }
        if ((this.f45653c & 2) == 2) {
            i12 += CodedOutputStream.s(32, this.f45658h);
        }
        int n11 = i12 + n() + this.f45652b.size();
        this.f45660j = n11;
        return n11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45659i;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < I(); i11++) {
            if (!H(i11).isInitialized()) {
                this.f45659i = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < L(); i12++) {
            if (!K(i12).isInitialized()) {
                this.f45659i = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < O(); i13++) {
            if (!N(i13).isInitialized()) {
                this.f45659i = (byte) 0;
                return false;
            }
        }
        if (S() && !Q().isInitialized()) {
            this.f45659i = (byte) 0;
            return false;
        } else if (!m()) {
            this.f45659i = (byte) 0;
            return false;
        } else {
            this.f45659i = (byte) 1;
            return true;
        }
    }

    private l(h.c<l, ?> cVar) {
        super(cVar);
        this.f45659i = (byte) -1;
        this.f45660j = -1;
        this.f45652b = cVar.e();
    }

    private l(boolean z11) {
        this.f45659i = (byte) -1;
        this.f45660j = -1;
        this.f45652b = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45659i = (byte) -1;
        this.f45660j = -1;
        U();
        d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
        CodedOutputStream J = CodedOutputStream.J(q11, 1);
        boolean z11 = false;
        boolean z12 = false;
        while (!z11) {
            try {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 26) {
                                boolean z13 = (z12 ? 1 : 0) & true;
                                z12 = z12;
                                if (!z13) {
                                    this.f45654d = new ArrayList();
                                    z12 = (z12 ? 1 : 0) | true;
                                }
                                this.f45654d.add(eVar.u(i.f45620w, fVar));
                            } else if (K == 34) {
                                boolean z14 = (z12 ? 1 : 0) & true;
                                z12 = z12;
                                if (!z14) {
                                    this.f45655e = new ArrayList();
                                    z12 = (z12 ? 1 : 0) | true;
                                }
                                this.f45655e.add(eVar.u(n.f45683w, fVar));
                            } else if (K != 42) {
                                if (K == 242) {
                                    t.b builder = (this.f45653c & 1) == 1 ? this.f45657g.toBuilder() : null;
                                    t tVar = (t) eVar.u(t.f45836h, fVar);
                                    this.f45657g = tVar;
                                    if (builder != null) {
                                        builder.f(tVar);
                                        this.f45657g = builder.j();
                                    }
                                    this.f45653c |= 1;
                                } else if (K != 258) {
                                    if (!j(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    w.b builder2 = (this.f45653c & 2) == 2 ? this.f45658h.toBuilder() : null;
                                    w wVar = (w) eVar.u(w.f45885f, fVar);
                                    this.f45658h = wVar;
                                    if (builder2 != null) {
                                        builder2.f(wVar);
                                        this.f45658h = builder2.j();
                                    }
                                    this.f45653c |= 2;
                                }
                            } else {
                                boolean z15 = (z12 ? 1 : 0) & true;
                                z12 = z12;
                                if (!z15) {
                                    this.f45656f = new ArrayList();
                                    z12 = (z12 ? 1 : 0) | true;
                                }
                                this.f45656f.add(eVar.u(r.f45791p, fVar));
                            }
                        }
                        z11 = true;
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (InvalidProtocolBufferException e12) {
                    throw e12.i(this);
                }
            } catch (Throwable th2) {
                if ((z12 ? 1 : 0) & true) {
                    this.f45654d = Collections.unmodifiableList(this.f45654d);
                }
                if ((z12 ? 1 : 0) & true) {
                    this.f45655e = Collections.unmodifiableList(this.f45655e);
                }
                if ((z12 ? 1 : 0) & true) {
                    this.f45656f = Collections.unmodifiableList(this.f45656f);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45652b = q11.l();
                    throw th3;
                }
                this.f45652b = q11.l();
                g();
                throw th2;
            }
        }
        if ((z12 ? 1 : 0) & true) {
            this.f45654d = Collections.unmodifiableList(this.f45654d);
        }
        if ((z12 ? 1 : 0) & true) {
            this.f45655e = Collections.unmodifiableList(this.f45655e);
        }
        if ((z12 ? 1 : 0) & true) {
            this.f45656f = Collections.unmodifiableList(this.f45656f);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45652b = q11.l();
            throw th4;
        }
        this.f45652b = q11.l();
        g();
    }
}