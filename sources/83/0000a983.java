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

/* loaded from: classes5.dex */
public final class s extends h.d<s> {

    /* renamed from: m  reason: collision with root package name */
    private static final s f45815m;

    /* renamed from: n  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<s> f45816n = new a();

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45817b;

    /* renamed from: c  reason: collision with root package name */
    private int f45818c;

    /* renamed from: d  reason: collision with root package name */
    private int f45819d;

    /* renamed from: e  reason: collision with root package name */
    private int f45820e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f45821f;

    /* renamed from: g  reason: collision with root package name */
    private c f45822g;

    /* renamed from: h  reason: collision with root package name */
    private List<q> f45823h;

    /* renamed from: i  reason: collision with root package name */
    private List<Integer> f45824i;

    /* renamed from: j  reason: collision with root package name */
    private int f45825j;

    /* renamed from: k  reason: collision with root package name */
    private byte f45826k;

    /* renamed from: l  reason: collision with root package name */
    private int f45827l;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<s> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public s c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new s(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.c<s, b> {

        /* renamed from: d  reason: collision with root package name */
        private int f45828d;

        /* renamed from: e  reason: collision with root package name */
        private int f45829e;

        /* renamed from: f  reason: collision with root package name */
        private int f45830f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f45831g;

        /* renamed from: h  reason: collision with root package name */
        private c f45832h = c.INV;

        /* renamed from: i  reason: collision with root package name */
        private List<q> f45833i = Collections.emptyList();

        /* renamed from: j  reason: collision with root package name */
        private List<Integer> f45834j = Collections.emptyList();

        private b() {
            s();
        }

        static /* synthetic */ b l() {
            return p();
        }

        private static b p() {
            return new b();
        }

        private void q() {
            if ((this.f45828d & 32) != 32) {
                this.f45834j = new ArrayList(this.f45834j);
                this.f45828d |= 32;
            }
        }

        private void r() {
            if ((this.f45828d & 16) != 16) {
                this.f45833i = new ArrayList(this.f45833i);
                this.f45828d |= 16;
            }
        }

        private void s() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: m */
        public s build() {
            s n11 = n();
            if (n11.isInitialized()) {
                return n11;
            }
            throw a.AbstractC0651a.c(n11);
        }

        public s n() {
            s sVar = new s(this);
            int i11 = this.f45828d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            sVar.f45819d = this.f45829e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            sVar.f45820e = this.f45830f;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            sVar.f45821f = this.f45831g;
            if ((i11 & 8) == 8) {
                i12 |= 8;
            }
            sVar.f45822g = this.f45832h;
            if ((this.f45828d & 16) == 16) {
                this.f45833i = Collections.unmodifiableList(this.f45833i);
                this.f45828d &= -17;
            }
            sVar.f45823h = this.f45833i;
            if ((this.f45828d & 32) == 32) {
                this.f45834j = Collections.unmodifiableList(this.f45834j);
                this.f45828d &= -33;
            }
            sVar.f45824i = this.f45834j;
            sVar.f45818c = i12;
            return sVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: o */
        public b d() {
            return p().f(n());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: t */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.s.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.s> r1 = p10.s.f45816n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.s r3 = (p10.s) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.s r4 = (p10.s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.s.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.s$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: u */
        public b f(s sVar) {
            if (sVar == s.F()) {
                return this;
            }
            if (sVar.P()) {
                v(sVar.H());
            }
            if (sVar.Q()) {
                w(sVar.I());
            }
            if (sVar.R()) {
                x(sVar.J());
            }
            if (sVar.S()) {
                y(sVar.O());
            }
            if (!sVar.f45823h.isEmpty()) {
                if (this.f45833i.isEmpty()) {
                    this.f45833i = sVar.f45823h;
                    this.f45828d &= -17;
                } else {
                    r();
                    this.f45833i.addAll(sVar.f45823h);
                }
            }
            if (!sVar.f45824i.isEmpty()) {
                if (this.f45834j.isEmpty()) {
                    this.f45834j = sVar.f45824i;
                    this.f45828d &= -33;
                } else {
                    q();
                    this.f45834j.addAll(sVar.f45824i);
                }
            }
            k(sVar);
            g(e().c(sVar.f45817b));
            return this;
        }

        public b v(int i11) {
            this.f45828d |= 1;
            this.f45829e = i11;
            return this;
        }

        public b w(int i11) {
            this.f45828d |= 2;
            this.f45830f = i11;
            return this;
        }

        public b x(boolean z11) {
            this.f45828d |= 4;
            this.f45831g = z11;
            return this;
        }

        public b y(c cVar) {
            Objects.requireNonNull(cVar);
            this.f45828d |= 8;
            this.f45832h = cVar;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum c implements i.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        
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
                    return INV;
                }
                return OUT;
            }
            return IN;
        }
    }

    static {
        s sVar = new s(true);
        f45815m = sVar;
        sVar.T();
    }

    public static s F() {
        return f45815m;
    }

    private void T() {
        this.f45819d = 0;
        this.f45820e = 0;
        this.f45821f = false;
        this.f45822g = c.INV;
        this.f45823h = Collections.emptyList();
        this.f45824i = Collections.emptyList();
    }

    public static b U() {
        return b.l();
    }

    public static b V(s sVar) {
        return U().f(sVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: G */
    public s getDefaultInstanceForType() {
        return f45815m;
    }

    public int H() {
        return this.f45819d;
    }

    public int I() {
        return this.f45820e;
    }

    public boolean J() {
        return this.f45821f;
    }

    public q K(int i11) {
        return this.f45823h.get(i11);
    }

    public int L() {
        return this.f45823h.size();
    }

    public List<Integer> M() {
        return this.f45824i;
    }

    public List<q> N() {
        return this.f45823h;
    }

    public c O() {
        return this.f45822g;
    }

    public boolean P() {
        return (this.f45818c & 1) == 1;
    }

    public boolean Q() {
        return (this.f45818c & 2) == 2;
    }

    public boolean R() {
        return (this.f45818c & 4) == 4;
    }

    public boolean S() {
        return (this.f45818c & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: W */
    public b newBuilderForType() {
        return U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: X */
    public b toBuilder() {
        return V(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        h.d<MessageType>.a s11 = s();
        if ((this.f45818c & 1) == 1) {
            codedOutputStream.a0(1, this.f45819d);
        }
        if ((this.f45818c & 2) == 2) {
            codedOutputStream.a0(2, this.f45820e);
        }
        if ((this.f45818c & 4) == 4) {
            codedOutputStream.L(3, this.f45821f);
        }
        if ((this.f45818c & 8) == 8) {
            codedOutputStream.S(4, this.f45822g.getNumber());
        }
        for (int i11 = 0; i11 < this.f45823h.size(); i11++) {
            codedOutputStream.d0(5, this.f45823h.get(i11));
        }
        if (M().size() > 0) {
            codedOutputStream.o0(50);
            codedOutputStream.o0(this.f45825j);
        }
        for (int i12 = 0; i12 < this.f45824i.size(); i12++) {
            codedOutputStream.b0(this.f45824i.get(i12).intValue());
        }
        s11.a(1000, codedOutputStream);
        codedOutputStream.i0(this.f45817b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<s> getParserForType() {
        return f45816n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45827l;
        if (i11 != -1) {
            return i11;
        }
        int o11 = (this.f45818c & 1) == 1 ? CodedOutputStream.o(1, this.f45819d) + 0 : 0;
        if ((this.f45818c & 2) == 2) {
            o11 += CodedOutputStream.o(2, this.f45820e);
        }
        if ((this.f45818c & 4) == 4) {
            o11 += CodedOutputStream.a(3, this.f45821f);
        }
        if ((this.f45818c & 8) == 8) {
            o11 += CodedOutputStream.h(4, this.f45822g.getNumber());
        }
        for (int i12 = 0; i12 < this.f45823h.size(); i12++) {
            o11 += CodedOutputStream.s(5, this.f45823h.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f45824i.size(); i14++) {
            i13 += CodedOutputStream.p(this.f45824i.get(i14).intValue());
        }
        int i15 = o11 + i13;
        if (!M().isEmpty()) {
            i15 = i15 + 1 + CodedOutputStream.p(i13);
        }
        this.f45825j = i13;
        int n11 = i15 + n() + this.f45817b.size();
        this.f45827l = n11;
        return n11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45826k;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!P()) {
            this.f45826k = (byte) 0;
            return false;
        } else if (!Q()) {
            this.f45826k = (byte) 0;
            return false;
        } else {
            for (int i11 = 0; i11 < L(); i11++) {
                if (!K(i11).isInitialized()) {
                    this.f45826k = (byte) 0;
                    return false;
                }
            }
            if (!m()) {
                this.f45826k = (byte) 0;
                return false;
            }
            this.f45826k = (byte) 1;
            return true;
        }
    }

    private s(h.c<s, ?> cVar) {
        super(cVar);
        this.f45825j = -1;
        this.f45826k = (byte) -1;
        this.f45827l = -1;
        this.f45817b = cVar.e();
    }

    private s(boolean z11) {
        this.f45825j = -1;
        this.f45826k = (byte) -1;
        this.f45827l = -1;
        this.f45817b = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private s(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45825j = -1;
        this.f45826k = (byte) -1;
        this.f45827l = -1;
        T();
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
                            if (K == 8) {
                                this.f45818c |= 1;
                                this.f45819d = eVar.s();
                            } else if (K == 16) {
                                this.f45818c |= 2;
                                this.f45820e = eVar.s();
                            } else if (K == 24) {
                                this.f45818c |= 4;
                                this.f45821f = eVar.k();
                            } else if (K == 32) {
                                int n11 = eVar.n();
                                c valueOf = c.valueOf(n11);
                                if (valueOf == null) {
                                    J.o0(K);
                                    J.o0(n11);
                                } else {
                                    this.f45818c |= 8;
                                    this.f45822g = valueOf;
                                }
                            } else if (K == 42) {
                                if (!(z12 & true)) {
                                    this.f45823h = new ArrayList();
                                    z12 |= true;
                                }
                                this.f45823h.add(eVar.u(q.f45743y, fVar));
                            } else if (K == 48) {
                                if (!(z12 & true)) {
                                    this.f45824i = new ArrayList();
                                    z12 |= true;
                                }
                                this.f45824i.add(Integer.valueOf(eVar.s()));
                            } else if (K != 50) {
                                if (!j(eVar, J, fVar, K)) {
                                }
                            } else {
                                int j11 = eVar.j(eVar.A());
                                if (!(z12 & true) && eVar.e() > 0) {
                                    this.f45824i = new ArrayList();
                                    z12 |= true;
                                }
                                while (eVar.e() > 0) {
                                    this.f45824i.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j11);
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
                if (z12 & true) {
                    this.f45823h = Collections.unmodifiableList(this.f45823h);
                }
                if (z12 & true) {
                    this.f45824i = Collections.unmodifiableList(this.f45824i);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45817b = q11.l();
                    throw th3;
                }
                this.f45817b = q11.l();
                g();
                throw th2;
            }
        }
        if (z12 & true) {
            this.f45823h = Collections.unmodifiableList(this.f45823h);
        }
        if (z12 & true) {
            this.f45824i = Collections.unmodifiableList(this.f45824i);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45817b = q11.l();
            throw th4;
        }
        this.f45817b = q11.l();
        g();
    }
}