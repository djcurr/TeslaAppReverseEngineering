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
import p10.l;
import p10.o;
import p10.p;

/* loaded from: classes5.dex */
public final class m extends h.d<m> {

    /* renamed from: j  reason: collision with root package name */
    private static final m f45667j;

    /* renamed from: k  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<m> f45668k = new a();

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45669b;

    /* renamed from: c  reason: collision with root package name */
    private int f45670c;

    /* renamed from: d  reason: collision with root package name */
    private p f45671d;

    /* renamed from: e  reason: collision with root package name */
    private o f45672e;

    /* renamed from: f  reason: collision with root package name */
    private l f45673f;

    /* renamed from: g  reason: collision with root package name */
    private List<c> f45674g;

    /* renamed from: h  reason: collision with root package name */
    private byte f45675h;

    /* renamed from: i  reason: collision with root package name */
    private int f45676i;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<m> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public m c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new m(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.c<m, b> {

        /* renamed from: d  reason: collision with root package name */
        private int f45677d;

        /* renamed from: e  reason: collision with root package name */
        private p f45678e = p.o();

        /* renamed from: f  reason: collision with root package name */
        private o f45679f = o.o();

        /* renamed from: g  reason: collision with root package name */
        private l f45680g = l.F();

        /* renamed from: h  reason: collision with root package name */
        private List<c> f45681h = Collections.emptyList();

        private b() {
            r();
        }

        static /* synthetic */ b l() {
            return p();
        }

        private static b p() {
            return new b();
        }

        private void q() {
            if ((this.f45677d & 8) != 8) {
                this.f45681h = new ArrayList(this.f45681h);
                this.f45677d |= 8;
            }
        }

        private void r() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: m */
        public m build() {
            m n11 = n();
            if (n11.isInitialized()) {
                return n11;
            }
            throw a.AbstractC0651a.c(n11);
        }

        public m n() {
            m mVar = new m(this);
            int i11 = this.f45677d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            mVar.f45671d = this.f45678e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            mVar.f45672e = this.f45679f;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            mVar.f45673f = this.f45680g;
            if ((this.f45677d & 8) == 8) {
                this.f45681h = Collections.unmodifiableList(this.f45681h);
                this.f45677d &= -9;
            }
            mVar.f45674g = this.f45681h;
            mVar.f45670c = i12;
            return mVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: o */
        public b d() {
            return p().f(n());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: s */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.m.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.m> r1 = p10.m.f45668k     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.m r3 = (p10.m) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.m r4 = (p10.m) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.m.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.m$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: t */
        public b f(m mVar) {
            if (mVar == m.F()) {
                return this;
            }
            if (mVar.M()) {
                w(mVar.J());
            }
            if (mVar.L()) {
                v(mVar.I());
            }
            if (mVar.K()) {
                u(mVar.H());
            }
            if (!mVar.f45674g.isEmpty()) {
                if (this.f45681h.isEmpty()) {
                    this.f45681h = mVar.f45674g;
                    this.f45677d &= -9;
                } else {
                    q();
                    this.f45681h.addAll(mVar.f45674g);
                }
            }
            k(mVar);
            g(e().c(mVar.f45669b));
            return this;
        }

        public b u(l lVar) {
            if ((this.f45677d & 4) == 4 && this.f45680g != l.F()) {
                this.f45680g = l.W(this.f45680g).f(lVar).n();
            } else {
                this.f45680g = lVar;
            }
            this.f45677d |= 4;
            return this;
        }

        public b v(o oVar) {
            if ((this.f45677d & 2) == 2 && this.f45679f != o.o()) {
                this.f45679f = o.t(this.f45679f).f(oVar).j();
            } else {
                this.f45679f = oVar;
            }
            this.f45677d |= 2;
            return this;
        }

        public b w(p pVar) {
            if ((this.f45677d & 1) == 1 && this.f45678e != p.o()) {
                this.f45678e = p.t(this.f45678e).f(pVar).j();
            } else {
                this.f45678e = pVar;
            }
            this.f45677d |= 1;
            return this;
        }
    }

    static {
        m mVar = new m(true);
        f45667j = mVar;
        mVar.N();
    }

    public static m F() {
        return f45667j;
    }

    private void N() {
        this.f45671d = p.o();
        this.f45672e = o.o();
        this.f45673f = l.F();
        this.f45674g = Collections.emptyList();
    }

    public static b O() {
        return b.l();
    }

    public static b P(m mVar) {
        return O().f(mVar);
    }

    public static m R(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return f45668k.a(inputStream, fVar);
    }

    public c B(int i11) {
        return this.f45674g.get(i11);
    }

    public int C() {
        return this.f45674g.size();
    }

    public List<c> E() {
        return this.f45674g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: G */
    public m getDefaultInstanceForType() {
        return f45667j;
    }

    public l H() {
        return this.f45673f;
    }

    public o I() {
        return this.f45672e;
    }

    public p J() {
        return this.f45671d;
    }

    public boolean K() {
        return (this.f45670c & 4) == 4;
    }

    public boolean L() {
        return (this.f45670c & 2) == 2;
    }

    public boolean M() {
        return (this.f45670c & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: Q */
    public b newBuilderForType() {
        return O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: S */
    public b toBuilder() {
        return P(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        h.d<MessageType>.a s11 = s();
        if ((this.f45670c & 1) == 1) {
            codedOutputStream.d0(1, this.f45671d);
        }
        if ((this.f45670c & 2) == 2) {
            codedOutputStream.d0(2, this.f45672e);
        }
        if ((this.f45670c & 4) == 4) {
            codedOutputStream.d0(3, this.f45673f);
        }
        for (int i11 = 0; i11 < this.f45674g.size(); i11++) {
            codedOutputStream.d0(4, this.f45674g.get(i11));
        }
        s11.a(200, codedOutputStream);
        codedOutputStream.i0(this.f45669b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<m> getParserForType() {
        return f45668k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45676i;
        if (i11 != -1) {
            return i11;
        }
        int s11 = (this.f45670c & 1) == 1 ? CodedOutputStream.s(1, this.f45671d) + 0 : 0;
        if ((this.f45670c & 2) == 2) {
            s11 += CodedOutputStream.s(2, this.f45672e);
        }
        if ((this.f45670c & 4) == 4) {
            s11 += CodedOutputStream.s(3, this.f45673f);
        }
        for (int i12 = 0; i12 < this.f45674g.size(); i12++) {
            s11 += CodedOutputStream.s(4, this.f45674g.get(i12));
        }
        int n11 = s11 + n() + this.f45669b.size();
        this.f45676i = n11;
        return n11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45675h;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (L() && !I().isInitialized()) {
            this.f45675h = (byte) 0;
            return false;
        } else if (K() && !H().isInitialized()) {
            this.f45675h = (byte) 0;
            return false;
        } else {
            for (int i11 = 0; i11 < C(); i11++) {
                if (!B(i11).isInitialized()) {
                    this.f45675h = (byte) 0;
                    return false;
                }
            }
            if (!m()) {
                this.f45675h = (byte) 0;
                return false;
            }
            this.f45675h = (byte) 1;
            return true;
        }
    }

    private m(h.c<m, ?> cVar) {
        super(cVar);
        this.f45675h = (byte) -1;
        this.f45676i = -1;
        this.f45669b = cVar.e();
    }

    private m(boolean z11) {
        this.f45675h = (byte) -1;
        this.f45676i = -1;
        this.f45669b = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45675h = (byte) -1;
        this.f45676i = -1;
        N();
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
                            if (K == 10) {
                                p.b builder = (this.f45670c & 1) == 1 ? this.f45671d.toBuilder() : null;
                                p pVar = (p) eVar.u(p.f45735f, fVar);
                                this.f45671d = pVar;
                                if (builder != null) {
                                    builder.f(pVar);
                                    this.f45671d = builder.j();
                                }
                                this.f45670c |= 1;
                            } else if (K == 18) {
                                o.b builder2 = (this.f45670c & 2) == 2 ? this.f45672e.toBuilder() : null;
                                o oVar = (o) eVar.u(o.f45714f, fVar);
                                this.f45672e = oVar;
                                if (builder2 != null) {
                                    builder2.f(oVar);
                                    this.f45672e = builder2.j();
                                }
                                this.f45670c |= 2;
                            } else if (K == 26) {
                                l.b builder3 = (this.f45670c & 4) == 4 ? this.f45673f.toBuilder() : null;
                                l lVar = (l) eVar.u(l.f45651l, fVar);
                                this.f45673f = lVar;
                                if (builder3 != null) {
                                    builder3.f(lVar);
                                    this.f45673f = builder3.n();
                                }
                                this.f45670c |= 4;
                            } else if (K != 34) {
                                if (!j(eVar, J, fVar, K)) {
                                }
                            } else {
                                boolean z13 = (z12 ? 1 : 0) & true;
                                z12 = z12;
                                if (!z13) {
                                    this.f45674g = new ArrayList();
                                    z12 = (z12 ? 1 : 0) | true;
                                }
                                this.f45674g.add(eVar.u(c.H, fVar));
                            }
                        }
                        z11 = true;
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.i(this);
                    }
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((z12 ? 1 : 0) & true) {
                    this.f45674g = Collections.unmodifiableList(this.f45674g);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45669b = q11.l();
                    throw th3;
                }
                this.f45669b = q11.l();
                g();
                throw th2;
            }
        }
        if ((z12 ? 1 : 0) & true) {
            this.f45674g = Collections.unmodifiableList(this.f45674g);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45669b = q11.l();
            throw th4;
        }
        this.f45669b = q11.l();
        g();
    }
}