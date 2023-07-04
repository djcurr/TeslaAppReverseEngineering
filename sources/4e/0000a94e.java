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
import p10.h;

/* loaded from: classes5.dex */
public final class f extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: i  reason: collision with root package name */
    private static final f f45574i;

    /* renamed from: j  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<f> f45575j = new a();

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45576a;

    /* renamed from: b  reason: collision with root package name */
    private int f45577b;

    /* renamed from: c  reason: collision with root package name */
    private c f45578c;

    /* renamed from: d  reason: collision with root package name */
    private List<h> f45579d;

    /* renamed from: e  reason: collision with root package name */
    private h f45580e;

    /* renamed from: f  reason: collision with root package name */
    private d f45581f;

    /* renamed from: g  reason: collision with root package name */
    private byte f45582g;

    /* renamed from: h  reason: collision with root package name */
    private int f45583h;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<f> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public f c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new f(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.b<f, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: b  reason: collision with root package name */
        private int f45584b;

        /* renamed from: c  reason: collision with root package name */
        private c f45585c = c.RETURNS_CONSTANT;

        /* renamed from: d  reason: collision with root package name */
        private List<h> f45586d = Collections.emptyList();

        /* renamed from: e  reason: collision with root package name */
        private h f45587e = h.z();

        /* renamed from: f  reason: collision with root package name */
        private d f45588f = d.AT_MOST_ONCE;

        private b() {
            n();
        }

        static /* synthetic */ b h() {
            return l();
        }

        private static b l() {
            return new b();
        }

        private void m() {
            if ((this.f45584b & 2) != 2) {
                this.f45586d = new ArrayList(this.f45586d);
                this.f45584b |= 2;
            }
        }

        private void n() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: i */
        public f build() {
            f j11 = j();
            if (j11.isInitialized()) {
                return j11;
            }
            throw a.AbstractC0651a.c(j11);
        }

        public f j() {
            f fVar = new f(this);
            int i11 = this.f45584b;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            fVar.f45578c = this.f45585c;
            if ((this.f45584b & 2) == 2) {
                this.f45586d = Collections.unmodifiableList(this.f45586d);
                this.f45584b &= -3;
            }
            fVar.f45579d = this.f45586d;
            if ((i11 & 4) == 4) {
                i12 |= 2;
            }
            fVar.f45580e = this.f45587e;
            if ((i11 & 8) == 8) {
                i12 |= 4;
            }
            fVar.f45581f = this.f45588f;
            fVar.f45577b = i12;
            return fVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: k */
        public b d() {
            return l().f(j());
        }

        public b o(h hVar) {
            if ((this.f45584b & 4) == 4 && this.f45587e != h.z()) {
                this.f45587e = h.O(this.f45587e).f(hVar).j();
            } else {
                this.f45587e = hVar;
            }
            this.f45584b |= 4;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: p */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.f.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.f> r1 = p10.f.f45575j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.f r3 = (p10.f) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.f r4 = (p10.f) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.f.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.f$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: q */
        public b f(f fVar) {
            if (fVar == f.t()) {
                return this;
            }
            if (fVar.z()) {
                r(fVar.w());
            }
            if (!fVar.f45579d.isEmpty()) {
                if (this.f45586d.isEmpty()) {
                    this.f45586d = fVar.f45579d;
                    this.f45584b &= -3;
                } else {
                    m();
                    this.f45586d.addAll(fVar.f45579d);
                }
            }
            if (fVar.y()) {
                o(fVar.s());
            }
            if (fVar.A()) {
                s(fVar.x());
            }
            g(e().c(fVar.f45576a));
            return this;
        }

        public b r(c cVar) {
            Objects.requireNonNull(cVar);
            this.f45584b |= 1;
            this.f45585c = cVar;
            return this;
        }

        public b s(d dVar) {
            Objects.requireNonNull(dVar);
            this.f45584b |= 8;
            this.f45588f = dVar;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum c implements i.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        
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
                    return RETURNS_NOT_NULL;
                }
                return CALLS;
            }
            return RETURNS_CONSTANT;
        }
    }

    /* loaded from: classes5.dex */
    public enum d implements i.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        
        private static i.b<d> internalValueMap = new a();
        private final int value;

        /* loaded from: classes5.dex */
        static class a implements i.b<d> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: a */
            public d findValueByNumber(int i11) {
                return d.valueOf(i11);
            }
        }

        d(int i11, int i12) {
            this.value = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static d valueOf(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return AT_LEAST_ONCE;
                }
                return EXACTLY_ONCE;
            }
            return AT_MOST_ONCE;
        }
    }

    static {
        f fVar = new f(true);
        f45574i = fVar;
        fVar.B();
    }

    private void B() {
        this.f45578c = c.RETURNS_CONSTANT;
        this.f45579d = Collections.emptyList();
        this.f45580e = h.z();
        this.f45581f = d.AT_MOST_ONCE;
    }

    public static b C() {
        return b.h();
    }

    public static b E(f fVar) {
        return C().f(fVar);
    }

    public static f t() {
        return f45574i;
    }

    public boolean A() {
        return (this.f45577b & 4) == 4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: F */
    public b newBuilderForType() {
        return C();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: G */
    public b toBuilder() {
        return E(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        if ((this.f45577b & 1) == 1) {
            codedOutputStream.S(1, this.f45578c.getNumber());
        }
        for (int i11 = 0; i11 < this.f45579d.size(); i11++) {
            codedOutputStream.d0(2, this.f45579d.get(i11));
        }
        if ((this.f45577b & 2) == 2) {
            codedOutputStream.d0(3, this.f45580e);
        }
        if ((this.f45577b & 4) == 4) {
            codedOutputStream.S(4, this.f45581f.getNumber());
        }
        codedOutputStream.i0(this.f45576a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<f> getParserForType() {
        return f45575j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45583h;
        if (i11 != -1) {
            return i11;
        }
        int h11 = (this.f45577b & 1) == 1 ? CodedOutputStream.h(1, this.f45578c.getNumber()) + 0 : 0;
        for (int i12 = 0; i12 < this.f45579d.size(); i12++) {
            h11 += CodedOutputStream.s(2, this.f45579d.get(i12));
        }
        if ((this.f45577b & 2) == 2) {
            h11 += CodedOutputStream.s(3, this.f45580e);
        }
        if ((this.f45577b & 4) == 4) {
            h11 += CodedOutputStream.h(4, this.f45581f.getNumber());
        }
        int size = h11 + this.f45576a.size();
        this.f45583h = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45582g;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < v(); i11++) {
            if (!u(i11).isInitialized()) {
                this.f45582g = (byte) 0;
                return false;
            }
        }
        if (y() && !s().isInitialized()) {
            this.f45582g = (byte) 0;
            return false;
        }
        this.f45582g = (byte) 1;
        return true;
    }

    public h s() {
        return this.f45580e;
    }

    public h u(int i11) {
        return this.f45579d.get(i11);
    }

    public int v() {
        return this.f45579d.size();
    }

    public c w() {
        return this.f45578c;
    }

    public d x() {
        return this.f45581f;
    }

    public boolean y() {
        return (this.f45577b & 2) == 2;
    }

    public boolean z() {
        return (this.f45577b & 1) == 1;
    }

    private f(h.b bVar) {
        super(bVar);
        this.f45582g = (byte) -1;
        this.f45583h = -1;
        this.f45576a = bVar.e();
    }

    private f(boolean z11) {
        this.f45582g = (byte) -1;
        this.f45583h = -1;
        this.f45576a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45582g = (byte) -1;
        this.f45583h = -1;
        B();
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
                            int n11 = eVar.n();
                            c valueOf = c.valueOf(n11);
                            if (valueOf == null) {
                                J.o0(K);
                                J.o0(n11);
                            } else {
                                this.f45577b |= 1;
                                this.f45578c = valueOf;
                            }
                        } else if (K == 18) {
                            if (!(z12 & true)) {
                                this.f45579d = new ArrayList();
                                z12 |= true;
                            }
                            this.f45579d.add(eVar.u(h.f45599m, fVar));
                        } else if (K == 26) {
                            h.b builder = (this.f45577b & 2) == 2 ? this.f45580e.toBuilder() : null;
                            h hVar = (h) eVar.u(h.f45599m, fVar);
                            this.f45580e = hVar;
                            if (builder != null) {
                                builder.f(hVar);
                                this.f45580e = builder.j();
                            }
                            this.f45577b |= 2;
                        } else if (K != 32) {
                            if (!j(eVar, J, fVar, K)) {
                            }
                        } else {
                            int n12 = eVar.n();
                            d valueOf2 = d.valueOf(n12);
                            if (valueOf2 == null) {
                                J.o0(K);
                                J.o0(n12);
                            } else {
                                this.f45577b |= 4;
                                this.f45581f = valueOf2;
                            }
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
                    this.f45579d = Collections.unmodifiableList(this.f45579d);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45576a = q11.l();
                    throw th3;
                }
                this.f45576a = q11.l();
                g();
                throw th2;
            }
        }
        if (z12 & true) {
            this.f45579d = Collections.unmodifiableList(this.f45579d);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45576a = q11.l();
            throw th4;
        }
        this.f45576a = q11.l();
        g();
    }
}