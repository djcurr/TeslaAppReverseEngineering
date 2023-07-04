package p10;

import java.io.IOException;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes5.dex */
public final class v extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: k  reason: collision with root package name */
    private static final v f45865k;

    /* renamed from: l  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<v> f45866l = new a();

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45867a;

    /* renamed from: b  reason: collision with root package name */
    private int f45868b;

    /* renamed from: c  reason: collision with root package name */
    private int f45869c;

    /* renamed from: d  reason: collision with root package name */
    private int f45870d;

    /* renamed from: e  reason: collision with root package name */
    private c f45871e;

    /* renamed from: f  reason: collision with root package name */
    private int f45872f;

    /* renamed from: g  reason: collision with root package name */
    private int f45873g;

    /* renamed from: h  reason: collision with root package name */
    private d f45874h;

    /* renamed from: i  reason: collision with root package name */
    private byte f45875i;

    /* renamed from: j  reason: collision with root package name */
    private int f45876j;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<v> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public v c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new v(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.b<v, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: b  reason: collision with root package name */
        private int f45877b;

        /* renamed from: c  reason: collision with root package name */
        private int f45878c;

        /* renamed from: d  reason: collision with root package name */
        private int f45879d;

        /* renamed from: f  reason: collision with root package name */
        private int f45881f;

        /* renamed from: g  reason: collision with root package name */
        private int f45882g;

        /* renamed from: e  reason: collision with root package name */
        private c f45880e = c.ERROR;

        /* renamed from: h  reason: collision with root package name */
        private d f45883h = d.LANGUAGE_VERSION;

        private b() {
            m();
        }

        static /* synthetic */ b h() {
            return l();
        }

        private static b l() {
            return new b();
        }

        private void m() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: i */
        public v build() {
            v j11 = j();
            if (j11.isInitialized()) {
                return j11;
            }
            throw a.AbstractC0651a.c(j11);
        }

        public v j() {
            v vVar = new v(this);
            int i11 = this.f45877b;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            vVar.f45869c = this.f45878c;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            vVar.f45870d = this.f45879d;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            vVar.f45871e = this.f45880e;
            if ((i11 & 8) == 8) {
                i12 |= 8;
            }
            vVar.f45872f = this.f45881f;
            if ((i11 & 16) == 16) {
                i12 |= 16;
            }
            vVar.f45873g = this.f45882g;
            if ((i11 & 32) == 32) {
                i12 |= 32;
            }
            vVar.f45874h = this.f45883h;
            vVar.f45868b = i12;
            return vVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: k */
        public b d() {
            return l().f(j());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.v.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.v> r1 = p10.v.f45866l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.v r3 = (p10.v) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.v r4 = (p10.v) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.v.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.v$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: o */
        public b f(v vVar) {
            if (vVar == v.t()) {
                return this;
            }
            if (vVar.E()) {
                s(vVar.x());
            }
            if (vVar.F()) {
                t(vVar.y());
            }
            if (vVar.B()) {
                q(vVar.v());
            }
            if (vVar.A()) {
                p(vVar.u());
            }
            if (vVar.C()) {
                r(vVar.w());
            }
            if (vVar.G()) {
                u(vVar.z());
            }
            g(e().c(vVar.f45867a));
            return this;
        }

        public b p(int i11) {
            this.f45877b |= 8;
            this.f45881f = i11;
            return this;
        }

        public b q(c cVar) {
            Objects.requireNonNull(cVar);
            this.f45877b |= 4;
            this.f45880e = cVar;
            return this;
        }

        public b r(int i11) {
            this.f45877b |= 16;
            this.f45882g = i11;
            return this;
        }

        public b s(int i11) {
            this.f45877b |= 1;
            this.f45878c = i11;
            return this;
        }

        public b t(int i11) {
            this.f45877b |= 2;
            this.f45879d = i11;
            return this;
        }

        public b u(d dVar) {
            Objects.requireNonNull(dVar);
            this.f45877b |= 32;
            this.f45883h = dVar;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum c implements i.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        
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
                    return HIDDEN;
                }
                return ERROR;
            }
            return WARNING;
        }
    }

    /* loaded from: classes5.dex */
    public enum d implements i.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        
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
                    return API_VERSION;
                }
                return COMPILER_VERSION;
            }
            return LANGUAGE_VERSION;
        }
    }

    static {
        v vVar = new v(true);
        f45865k = vVar;
        vVar.H();
    }

    private void H() {
        this.f45869c = 0;
        this.f45870d = 0;
        this.f45871e = c.ERROR;
        this.f45872f = 0;
        this.f45873g = 0;
        this.f45874h = d.LANGUAGE_VERSION;
    }

    public static b I() {
        return b.h();
    }

    public static b J(v vVar) {
        return I().f(vVar);
    }

    public static v t() {
        return f45865k;
    }

    public boolean A() {
        return (this.f45868b & 8) == 8;
    }

    public boolean B() {
        return (this.f45868b & 4) == 4;
    }

    public boolean C() {
        return (this.f45868b & 16) == 16;
    }

    public boolean E() {
        return (this.f45868b & 1) == 1;
    }

    public boolean F() {
        return (this.f45868b & 2) == 2;
    }

    public boolean G() {
        return (this.f45868b & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: K */
    public b newBuilderForType() {
        return I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: L */
    public b toBuilder() {
        return J(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        if ((this.f45868b & 1) == 1) {
            codedOutputStream.a0(1, this.f45869c);
        }
        if ((this.f45868b & 2) == 2) {
            codedOutputStream.a0(2, this.f45870d);
        }
        if ((this.f45868b & 4) == 4) {
            codedOutputStream.S(3, this.f45871e.getNumber());
        }
        if ((this.f45868b & 8) == 8) {
            codedOutputStream.a0(4, this.f45872f);
        }
        if ((this.f45868b & 16) == 16) {
            codedOutputStream.a0(5, this.f45873g);
        }
        if ((this.f45868b & 32) == 32) {
            codedOutputStream.S(6, this.f45874h.getNumber());
        }
        codedOutputStream.i0(this.f45867a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<v> getParserForType() {
        return f45866l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45876j;
        if (i11 != -1) {
            return i11;
        }
        int o11 = (this.f45868b & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f45869c) : 0;
        if ((this.f45868b & 2) == 2) {
            o11 += CodedOutputStream.o(2, this.f45870d);
        }
        if ((this.f45868b & 4) == 4) {
            o11 += CodedOutputStream.h(3, this.f45871e.getNumber());
        }
        if ((this.f45868b & 8) == 8) {
            o11 += CodedOutputStream.o(4, this.f45872f);
        }
        if ((this.f45868b & 16) == 16) {
            o11 += CodedOutputStream.o(5, this.f45873g);
        }
        if ((this.f45868b & 32) == 32) {
            o11 += CodedOutputStream.h(6, this.f45874h.getNumber());
        }
        int size = o11 + this.f45867a.size();
        this.f45876j = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45875i;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        this.f45875i = (byte) 1;
        return true;
    }

    public int u() {
        return this.f45872f;
    }

    public c v() {
        return this.f45871e;
    }

    public int w() {
        return this.f45873g;
    }

    public int x() {
        return this.f45869c;
    }

    public int y() {
        return this.f45870d;
    }

    public d z() {
        return this.f45874h;
    }

    private v(h.b bVar) {
        super(bVar);
        this.f45875i = (byte) -1;
        this.f45876j = -1;
        this.f45867a = bVar.e();
    }

    private v(boolean z11) {
        this.f45875i = (byte) -1;
        this.f45876j = -1;
        this.f45867a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    private v(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45875i = (byte) -1;
        this.f45876j = -1;
        H();
        d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
        CodedOutputStream J = CodedOutputStream.J(q11, 1);
        boolean z11 = false;
        while (!z11) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K == 8) {
                            this.f45868b |= 1;
                            this.f45869c = eVar.s();
                        } else if (K == 16) {
                            this.f45868b |= 2;
                            this.f45870d = eVar.s();
                        } else if (K == 24) {
                            int n11 = eVar.n();
                            c valueOf = c.valueOf(n11);
                            if (valueOf == null) {
                                J.o0(K);
                                J.o0(n11);
                            } else {
                                this.f45868b |= 4;
                                this.f45871e = valueOf;
                            }
                        } else if (K == 32) {
                            this.f45868b |= 8;
                            this.f45872f = eVar.s();
                        } else if (K == 40) {
                            this.f45868b |= 16;
                            this.f45873g = eVar.s();
                        } else if (K != 48) {
                            if (!j(eVar, J, fVar, K)) {
                            }
                        } else {
                            int n12 = eVar.n();
                            d valueOf2 = d.valueOf(n12);
                            if (valueOf2 == null) {
                                J.o0(K);
                                J.o0(n12);
                            } else {
                                this.f45868b |= 32;
                                this.f45874h = valueOf2;
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
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45867a = q11.l();
                    throw th3;
                }
                this.f45867a = q11.l();
                g();
                throw th2;
            }
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45867a = q11.l();
            throw th4;
        }
        this.f45867a = q11.l();
        g();
    }
}