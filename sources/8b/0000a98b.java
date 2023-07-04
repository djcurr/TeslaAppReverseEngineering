package p10;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import p10.q;

/* loaded from: classes5.dex */
public final class u extends h.d<u> {

    /* renamed from: l  reason: collision with root package name */
    private static final u f45846l;

    /* renamed from: m  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<u> f45847m = new a();

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45848b;

    /* renamed from: c  reason: collision with root package name */
    private int f45849c;

    /* renamed from: d  reason: collision with root package name */
    private int f45850d;

    /* renamed from: e  reason: collision with root package name */
    private int f45851e;

    /* renamed from: f  reason: collision with root package name */
    private q f45852f;

    /* renamed from: g  reason: collision with root package name */
    private int f45853g;

    /* renamed from: h  reason: collision with root package name */
    private q f45854h;

    /* renamed from: i  reason: collision with root package name */
    private int f45855i;

    /* renamed from: j  reason: collision with root package name */
    private byte f45856j;

    /* renamed from: k  reason: collision with root package name */
    private int f45857k;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<u> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public u c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new u(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.c<u, b> {

        /* renamed from: d  reason: collision with root package name */
        private int f45858d;

        /* renamed from: e  reason: collision with root package name */
        private int f45859e;

        /* renamed from: f  reason: collision with root package name */
        private int f45860f;

        /* renamed from: h  reason: collision with root package name */
        private int f45862h;

        /* renamed from: j  reason: collision with root package name */
        private int f45864j;

        /* renamed from: g  reason: collision with root package name */
        private q f45861g = q.S();

        /* renamed from: i  reason: collision with root package name */
        private q f45863i = q.S();

        private b() {
            q();
        }

        static /* synthetic */ b l() {
            return p();
        }

        private static b p() {
            return new b();
        }

        private void q() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: m */
        public u build() {
            u n11 = n();
            if (n11.isInitialized()) {
                return n11;
            }
            throw a.AbstractC0651a.c(n11);
        }

        public u n() {
            u uVar = new u(this);
            int i11 = this.f45858d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            uVar.f45850d = this.f45859e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            uVar.f45851e = this.f45860f;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            uVar.f45852f = this.f45861g;
            if ((i11 & 8) == 8) {
                i12 |= 8;
            }
            uVar.f45853g = this.f45862h;
            if ((i11 & 16) == 16) {
                i12 |= 16;
            }
            uVar.f45854h = this.f45863i;
            if ((i11 & 32) == 32) {
                i12 |= 32;
            }
            uVar.f45855i = this.f45864j;
            uVar.f45849c = i12;
            return uVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: o */
        public b d() {
            return p().f(n());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.u.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.u> r1 = p10.u.f45847m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.u r3 = (p10.u) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.u r4 = (p10.u) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.u.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.u$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: s */
        public b f(u uVar) {
            if (uVar == u.C()) {
                return this;
            }
            if (uVar.L()) {
                v(uVar.F());
            }
            if (uVar.M()) {
                w(uVar.G());
            }
            if (uVar.N()) {
                t(uVar.H());
            }
            if (uVar.O()) {
                x(uVar.I());
            }
            if (uVar.P()) {
                u(uVar.J());
            }
            if (uVar.Q()) {
                y(uVar.K());
            }
            k(uVar);
            g(e().c(uVar.f45848b));
            return this;
        }

        public b t(q qVar) {
            if ((this.f45858d & 4) == 4 && this.f45861g != q.S()) {
                this.f45861g = q.t0(this.f45861g).f(qVar).n();
            } else {
                this.f45861g = qVar;
            }
            this.f45858d |= 4;
            return this;
        }

        public b u(q qVar) {
            if ((this.f45858d & 16) == 16 && this.f45863i != q.S()) {
                this.f45863i = q.t0(this.f45863i).f(qVar).n();
            } else {
                this.f45863i = qVar;
            }
            this.f45858d |= 16;
            return this;
        }

        public b v(int i11) {
            this.f45858d |= 1;
            this.f45859e = i11;
            return this;
        }

        public b w(int i11) {
            this.f45858d |= 2;
            this.f45860f = i11;
            return this;
        }

        public b x(int i11) {
            this.f45858d |= 8;
            this.f45862h = i11;
            return this;
        }

        public b y(int i11) {
            this.f45858d |= 32;
            this.f45864j = i11;
            return this;
        }
    }

    static {
        u uVar = new u(true);
        f45846l = uVar;
        uVar.R();
    }

    public static u C() {
        return f45846l;
    }

    private void R() {
        this.f45850d = 0;
        this.f45851e = 0;
        this.f45852f = q.S();
        this.f45853g = 0;
        this.f45854h = q.S();
        this.f45855i = 0;
    }

    public static b S() {
        return b.l();
    }

    public static b T(u uVar) {
        return S().f(uVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: E */
    public u getDefaultInstanceForType() {
        return f45846l;
    }

    public int F() {
        return this.f45850d;
    }

    public int G() {
        return this.f45851e;
    }

    public q H() {
        return this.f45852f;
    }

    public int I() {
        return this.f45853g;
    }

    public q J() {
        return this.f45854h;
    }

    public int K() {
        return this.f45855i;
    }

    public boolean L() {
        return (this.f45849c & 1) == 1;
    }

    public boolean M() {
        return (this.f45849c & 2) == 2;
    }

    public boolean N() {
        return (this.f45849c & 4) == 4;
    }

    public boolean O() {
        return (this.f45849c & 8) == 8;
    }

    public boolean P() {
        return (this.f45849c & 16) == 16;
    }

    public boolean Q() {
        return (this.f45849c & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: U */
    public b newBuilderForType() {
        return S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: V */
    public b toBuilder() {
        return T(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        h.d<MessageType>.a s11 = s();
        if ((this.f45849c & 1) == 1) {
            codedOutputStream.a0(1, this.f45850d);
        }
        if ((this.f45849c & 2) == 2) {
            codedOutputStream.a0(2, this.f45851e);
        }
        if ((this.f45849c & 4) == 4) {
            codedOutputStream.d0(3, this.f45852f);
        }
        if ((this.f45849c & 16) == 16) {
            codedOutputStream.d0(4, this.f45854h);
        }
        if ((this.f45849c & 8) == 8) {
            codedOutputStream.a0(5, this.f45853g);
        }
        if ((this.f45849c & 32) == 32) {
            codedOutputStream.a0(6, this.f45855i);
        }
        s11.a(200, codedOutputStream);
        codedOutputStream.i0(this.f45848b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<u> getParserForType() {
        return f45847m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45857k;
        if (i11 != -1) {
            return i11;
        }
        int o11 = (this.f45849c & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f45850d) : 0;
        if ((this.f45849c & 2) == 2) {
            o11 += CodedOutputStream.o(2, this.f45851e);
        }
        if ((this.f45849c & 4) == 4) {
            o11 += CodedOutputStream.s(3, this.f45852f);
        }
        if ((this.f45849c & 16) == 16) {
            o11 += CodedOutputStream.s(4, this.f45854h);
        }
        if ((this.f45849c & 8) == 8) {
            o11 += CodedOutputStream.o(5, this.f45853g);
        }
        if ((this.f45849c & 32) == 32) {
            o11 += CodedOutputStream.o(6, this.f45855i);
        }
        int n11 = o11 + n() + this.f45848b.size();
        this.f45857k = n11;
        return n11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45856j;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!M()) {
            this.f45856j = (byte) 0;
            return false;
        } else if (N() && !H().isInitialized()) {
            this.f45856j = (byte) 0;
            return false;
        } else if (P() && !J().isInitialized()) {
            this.f45856j = (byte) 0;
            return false;
        } else if (!m()) {
            this.f45856j = (byte) 0;
            return false;
        } else {
            this.f45856j = (byte) 1;
            return true;
        }
    }

    private u(h.c<u, ?> cVar) {
        super(cVar);
        this.f45856j = (byte) -1;
        this.f45857k = -1;
        this.f45848b = cVar.e();
    }

    private u(boolean z11) {
        this.f45856j = (byte) -1;
        this.f45857k = -1;
        this.f45848b = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    private u(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        q.c builder;
        this.f45856j = (byte) -1;
        this.f45857k = -1;
        R();
        d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
        CodedOutputStream J = CodedOutputStream.J(q11, 1);
        boolean z11 = false;
        while (!z11) {
            try {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f45849c |= 1;
                                this.f45850d = eVar.s();
                            } else if (K != 16) {
                                if (K == 26) {
                                    builder = (this.f45849c & 4) == 4 ? this.f45852f.toBuilder() : null;
                                    q qVar = (q) eVar.u(q.f45743y, fVar);
                                    this.f45852f = qVar;
                                    if (builder != null) {
                                        builder.f(qVar);
                                        this.f45852f = builder.n();
                                    }
                                    this.f45849c |= 4;
                                } else if (K == 34) {
                                    builder = (this.f45849c & 16) == 16 ? this.f45854h.toBuilder() : null;
                                    q qVar2 = (q) eVar.u(q.f45743y, fVar);
                                    this.f45854h = qVar2;
                                    if (builder != null) {
                                        builder.f(qVar2);
                                        this.f45854h = builder.n();
                                    }
                                    this.f45849c |= 16;
                                } else if (K == 40) {
                                    this.f45849c |= 8;
                                    this.f45853g = eVar.s();
                                } else if (K != 48) {
                                    if (!j(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    this.f45849c |= 32;
                                    this.f45855i = eVar.s();
                                }
                            } else {
                                this.f45849c |= 2;
                                this.f45851e = eVar.s();
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
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45848b = q11.l();
                    throw th3;
                }
                this.f45848b = q11.l();
                g();
                throw th2;
            }
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45848b = q11.l();
            throw th4;
        }
        this.f45848b = q11.l();
        g();
    }
}