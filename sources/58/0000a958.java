package p10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import p10.q;

/* loaded from: classes5.dex */
public final class h extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: l  reason: collision with root package name */
    private static final h f45598l;

    /* renamed from: m  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<h> f45599m = new a();

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45600a;

    /* renamed from: b  reason: collision with root package name */
    private int f45601b;

    /* renamed from: c  reason: collision with root package name */
    private int f45602c;

    /* renamed from: d  reason: collision with root package name */
    private int f45603d;

    /* renamed from: e  reason: collision with root package name */
    private c f45604e;

    /* renamed from: f  reason: collision with root package name */
    private q f45605f;

    /* renamed from: g  reason: collision with root package name */
    private int f45606g;

    /* renamed from: h  reason: collision with root package name */
    private List<h> f45607h;

    /* renamed from: i  reason: collision with root package name */
    private List<h> f45608i;

    /* renamed from: j  reason: collision with root package name */
    private byte f45609j;

    /* renamed from: k  reason: collision with root package name */
    private int f45610k;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<h> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public h c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new h(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.b<h, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: b  reason: collision with root package name */
        private int f45611b;

        /* renamed from: c  reason: collision with root package name */
        private int f45612c;

        /* renamed from: d  reason: collision with root package name */
        private int f45613d;

        /* renamed from: g  reason: collision with root package name */
        private int f45616g;

        /* renamed from: e  reason: collision with root package name */
        private c f45614e = c.TRUE;

        /* renamed from: f  reason: collision with root package name */
        private q f45615f = q.S();

        /* renamed from: h  reason: collision with root package name */
        private List<h> f45617h = Collections.emptyList();

        /* renamed from: i  reason: collision with root package name */
        private List<h> f45618i = Collections.emptyList();

        private b() {
            o();
        }

        static /* synthetic */ b h() {
            return l();
        }

        private static b l() {
            return new b();
        }

        private void m() {
            if ((this.f45611b & 32) != 32) {
                this.f45617h = new ArrayList(this.f45617h);
                this.f45611b |= 32;
            }
        }

        private void n() {
            if ((this.f45611b & 64) != 64) {
                this.f45618i = new ArrayList(this.f45618i);
                this.f45611b |= 64;
            }
        }

        private void o() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: i */
        public h build() {
            h j11 = j();
            if (j11.isInitialized()) {
                return j11;
            }
            throw a.AbstractC0651a.c(j11);
        }

        public h j() {
            h hVar = new h(this);
            int i11 = this.f45611b;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            hVar.f45602c = this.f45612c;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            hVar.f45603d = this.f45613d;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            hVar.f45604e = this.f45614e;
            if ((i11 & 8) == 8) {
                i12 |= 8;
            }
            hVar.f45605f = this.f45615f;
            if ((i11 & 16) == 16) {
                i12 |= 16;
            }
            hVar.f45606g = this.f45616g;
            if ((this.f45611b & 32) == 32) {
                this.f45617h = Collections.unmodifiableList(this.f45617h);
                this.f45611b &= -33;
            }
            hVar.f45607h = this.f45617h;
            if ((this.f45611b & 64) == 64) {
                this.f45618i = Collections.unmodifiableList(this.f45618i);
                this.f45611b &= -65;
            }
            hVar.f45608i = this.f45618i;
            hVar.f45601b = i12;
            return hVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: k */
        public b d() {
            return l().f(j());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: p */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.h.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.h> r1 = p10.h.f45599m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.h r3 = (p10.h) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.h r4 = (p10.h) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.h.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.h$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: q */
        public b f(h hVar) {
            if (hVar == h.z()) {
                return this;
            }
            if (hVar.I()) {
                t(hVar.A());
            }
            if (hVar.L()) {
                v(hVar.G());
            }
            if (hVar.H()) {
                s(hVar.y());
            }
            if (hVar.J()) {
                r(hVar.B());
            }
            if (hVar.K()) {
                u(hVar.C());
            }
            if (!hVar.f45607h.isEmpty()) {
                if (this.f45617h.isEmpty()) {
                    this.f45617h = hVar.f45607h;
                    this.f45611b &= -33;
                } else {
                    m();
                    this.f45617h.addAll(hVar.f45607h);
                }
            }
            if (!hVar.f45608i.isEmpty()) {
                if (this.f45618i.isEmpty()) {
                    this.f45618i = hVar.f45608i;
                    this.f45611b &= -65;
                } else {
                    n();
                    this.f45618i.addAll(hVar.f45608i);
                }
            }
            g(e().c(hVar.f45600a));
            return this;
        }

        public b r(q qVar) {
            if ((this.f45611b & 8) == 8 && this.f45615f != q.S()) {
                this.f45615f = q.t0(this.f45615f).f(qVar).n();
            } else {
                this.f45615f = qVar;
            }
            this.f45611b |= 8;
            return this;
        }

        public b s(c cVar) {
            Objects.requireNonNull(cVar);
            this.f45611b |= 4;
            this.f45614e = cVar;
            return this;
        }

        public b t(int i11) {
            this.f45611b |= 1;
            this.f45612c = i11;
            return this;
        }

        public b u(int i11) {
            this.f45611b |= 16;
            this.f45616g = i11;
            return this;
        }

        public b v(int i11) {
            this.f45611b |= 2;
            this.f45613d = i11;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum c implements i.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        
        private static i.b<c> internalValueMap = new a();
        private final int value;

        /* loaded from: classes5.dex */
        static class a implements i.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: a */
            public c findValueByNumber(int i11) {
                return c.valueOf(i11);
            }
        }

        c(int i11, int i12) {
            this.value = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static c valueOf(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return NULL;
                }
                return FALSE;
            }
            return TRUE;
        }
    }

    static {
        h hVar = new h(true);
        f45598l = hVar;
        hVar.M();
    }

    private void M() {
        this.f45602c = 0;
        this.f45603d = 0;
        this.f45604e = c.TRUE;
        this.f45605f = q.S();
        this.f45606g = 0;
        this.f45607h = Collections.emptyList();
        this.f45608i = Collections.emptyList();
    }

    public static b N() {
        return b.h();
    }

    public static b O(h hVar) {
        return N().f(hVar);
    }

    public static h z() {
        return f45598l;
    }

    public int A() {
        return this.f45602c;
    }

    public q B() {
        return this.f45605f;
    }

    public int C() {
        return this.f45606g;
    }

    public h E(int i11) {
        return this.f45608i.get(i11);
    }

    public int F() {
        return this.f45608i.size();
    }

    public int G() {
        return this.f45603d;
    }

    public boolean H() {
        return (this.f45601b & 4) == 4;
    }

    public boolean I() {
        return (this.f45601b & 1) == 1;
    }

    public boolean J() {
        return (this.f45601b & 8) == 8;
    }

    public boolean K() {
        return (this.f45601b & 16) == 16;
    }

    public boolean L() {
        return (this.f45601b & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: P */
    public b newBuilderForType() {
        return N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: Q */
    public b toBuilder() {
        return O(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        if ((this.f45601b & 1) == 1) {
            codedOutputStream.a0(1, this.f45602c);
        }
        if ((this.f45601b & 2) == 2) {
            codedOutputStream.a0(2, this.f45603d);
        }
        if ((this.f45601b & 4) == 4) {
            codedOutputStream.S(3, this.f45604e.getNumber());
        }
        if ((this.f45601b & 8) == 8) {
            codedOutputStream.d0(4, this.f45605f);
        }
        if ((this.f45601b & 16) == 16) {
            codedOutputStream.a0(5, this.f45606g);
        }
        for (int i11 = 0; i11 < this.f45607h.size(); i11++) {
            codedOutputStream.d0(6, this.f45607h.get(i11));
        }
        for (int i12 = 0; i12 < this.f45608i.size(); i12++) {
            codedOutputStream.d0(7, this.f45608i.get(i12));
        }
        codedOutputStream.i0(this.f45600a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<h> getParserForType() {
        return f45599m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45610k;
        if (i11 != -1) {
            return i11;
        }
        int o11 = (this.f45601b & 1) == 1 ? CodedOutputStream.o(1, this.f45602c) + 0 : 0;
        if ((this.f45601b & 2) == 2) {
            o11 += CodedOutputStream.o(2, this.f45603d);
        }
        if ((this.f45601b & 4) == 4) {
            o11 += CodedOutputStream.h(3, this.f45604e.getNumber());
        }
        if ((this.f45601b & 8) == 8) {
            o11 += CodedOutputStream.s(4, this.f45605f);
        }
        if ((this.f45601b & 16) == 16) {
            o11 += CodedOutputStream.o(5, this.f45606g);
        }
        for (int i12 = 0; i12 < this.f45607h.size(); i12++) {
            o11 += CodedOutputStream.s(6, this.f45607h.get(i12));
        }
        for (int i13 = 0; i13 < this.f45608i.size(); i13++) {
            o11 += CodedOutputStream.s(7, this.f45608i.get(i13));
        }
        int size = o11 + this.f45600a.size();
        this.f45610k = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45609j;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (J() && !B().isInitialized()) {
            this.f45609j = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < x(); i11++) {
            if (!w(i11).isInitialized()) {
                this.f45609j = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < F(); i12++) {
            if (!E(i12).isInitialized()) {
                this.f45609j = (byte) 0;
                return false;
            }
        }
        this.f45609j = (byte) 1;
        return true;
    }

    public h w(int i11) {
        return this.f45607h.get(i11);
    }

    public int x() {
        return this.f45607h.size();
    }

    public c y() {
        return this.f45604e;
    }

    private h(h.b bVar) {
        super(bVar);
        this.f45609j = (byte) -1;
        this.f45610k = -1;
        this.f45600a = bVar.e();
    }

    private h(boolean z11) {
        this.f45609j = (byte) -1;
        this.f45610k = -1;
        this.f45600a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45609j = (byte) -1;
        this.f45610k = -1;
        M();
        d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
        CodedOutputStream J = CodedOutputStream.J(q11, 1);
        boolean z11 = false;
        boolean z12 = false;
        while (!z11) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K == 8) {
                            this.f45601b |= 1;
                            this.f45602c = eVar.s();
                        } else if (K == 16) {
                            this.f45601b |= 2;
                            this.f45603d = eVar.s();
                        } else if (K == 24) {
                            int n11 = eVar.n();
                            c valueOf = c.valueOf(n11);
                            if (valueOf == null) {
                                J.o0(K);
                                J.o0(n11);
                            } else {
                                this.f45601b |= 4;
                                this.f45604e = valueOf;
                            }
                        } else if (K == 34) {
                            q.c builder = (this.f45601b & 8) == 8 ? this.f45605f.toBuilder() : null;
                            q qVar = (q) eVar.u(q.f45743y, fVar);
                            this.f45605f = qVar;
                            if (builder != null) {
                                builder.f(qVar);
                                this.f45605f = builder.n();
                            }
                            this.f45601b |= 8;
                        } else if (K == 40) {
                            this.f45601b |= 16;
                            this.f45606g = eVar.s();
                        } else if (K == 50) {
                            if (!(z12 & true)) {
                                this.f45607h = new ArrayList();
                                z12 |= true;
                            }
                            this.f45607h.add(eVar.u(f45599m, fVar));
                        } else if (K != 58) {
                            if (!j(eVar, J, fVar, K)) {
                            }
                        } else {
                            if (!(z12 & true)) {
                                this.f45608i = new ArrayList();
                                z12 |= true;
                            }
                            this.f45608i.add(eVar.u(f45599m, fVar));
                        }
                    }
                    z11 = true;
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.i(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if (z12 & true) {
                    this.f45607h = Collections.unmodifiableList(this.f45607h);
                }
                if (z12 & true) {
                    this.f45608i = Collections.unmodifiableList(this.f45608i);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45600a = q11.l();
                    throw th3;
                }
                this.f45600a = q11.l();
                g();
                throw th2;
            }
        }
        if (z12 & true) {
            this.f45607h = Collections.unmodifiableList(this.f45607h);
        }
        if (z12 & true) {
            this.f45608i = Collections.unmodifiableList(this.f45608i);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45600a = q11.l();
            throw th4;
        }
        this.f45600a = q11.l();
        g();
    }
}