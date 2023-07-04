package p10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes5.dex */
public final class d extends h.d<d> {

    /* renamed from: i  reason: collision with root package name */
    private static final d f45553i;

    /* renamed from: j  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<d> f45554j = new a();

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45555b;

    /* renamed from: c  reason: collision with root package name */
    private int f45556c;

    /* renamed from: d  reason: collision with root package name */
    private int f45557d;

    /* renamed from: e  reason: collision with root package name */
    private List<u> f45558e;

    /* renamed from: f  reason: collision with root package name */
    private List<Integer> f45559f;

    /* renamed from: g  reason: collision with root package name */
    private byte f45560g;

    /* renamed from: h  reason: collision with root package name */
    private int f45561h;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<d> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public d c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new d(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.c<d, b> {

        /* renamed from: d  reason: collision with root package name */
        private int f45562d;

        /* renamed from: e  reason: collision with root package name */
        private int f45563e = 6;

        /* renamed from: f  reason: collision with root package name */
        private List<u> f45564f = Collections.emptyList();

        /* renamed from: g  reason: collision with root package name */
        private List<Integer> f45565g = Collections.emptyList();

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
            if ((this.f45562d & 2) != 2) {
                this.f45564f = new ArrayList(this.f45564f);
                this.f45562d |= 2;
            }
        }

        private void r() {
            if ((this.f45562d & 4) != 4) {
                this.f45565g = new ArrayList(this.f45565g);
                this.f45562d |= 4;
            }
        }

        private void s() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: m */
        public d build() {
            d n11 = n();
            if (n11.isInitialized()) {
                return n11;
            }
            throw a.AbstractC0651a.c(n11);
        }

        public d n() {
            d dVar = new d(this);
            int i11 = (this.f45562d & 1) != 1 ? 0 : 1;
            dVar.f45557d = this.f45563e;
            if ((this.f45562d & 2) == 2) {
                this.f45564f = Collections.unmodifiableList(this.f45564f);
                this.f45562d &= -3;
            }
            dVar.f45558e = this.f45564f;
            if ((this.f45562d & 4) == 4) {
                this.f45565g = Collections.unmodifiableList(this.f45565g);
                this.f45562d &= -5;
            }
            dVar.f45559f = this.f45565g;
            dVar.f45556c = i11;
            return dVar;
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
        public p10.d.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.d> r1 = p10.d.f45554j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.d r3 = (p10.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.d r4 = (p10.d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.d.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.d$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: u */
        public b f(d dVar) {
            if (dVar == d.B()) {
                return this;
            }
            if (dVar.J()) {
                v(dVar.E());
            }
            if (!dVar.f45558e.isEmpty()) {
                if (this.f45564f.isEmpty()) {
                    this.f45564f = dVar.f45558e;
                    this.f45562d &= -3;
                } else {
                    q();
                    this.f45564f.addAll(dVar.f45558e);
                }
            }
            if (!dVar.f45559f.isEmpty()) {
                if (this.f45565g.isEmpty()) {
                    this.f45565g = dVar.f45559f;
                    this.f45562d &= -5;
                } else {
                    r();
                    this.f45565g.addAll(dVar.f45559f);
                }
            }
            k(dVar);
            g(e().c(dVar.f45555b));
            return this;
        }

        public b v(int i11) {
            this.f45562d |= 1;
            this.f45563e = i11;
            return this;
        }
    }

    static {
        d dVar = new d(true);
        f45553i = dVar;
        dVar.K();
    }

    public static d B() {
        return f45553i;
    }

    private void K() {
        this.f45557d = 6;
        this.f45558e = Collections.emptyList();
        this.f45559f = Collections.emptyList();
    }

    public static b L() {
        return b.l();
    }

    public static b M(d dVar) {
        return L().f(dVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: C */
    public d getDefaultInstanceForType() {
        return f45553i;
    }

    public int E() {
        return this.f45557d;
    }

    public u F(int i11) {
        return this.f45558e.get(i11);
    }

    public int G() {
        return this.f45558e.size();
    }

    public List<u> H() {
        return this.f45558e;
    }

    public List<Integer> I() {
        return this.f45559f;
    }

    public boolean J() {
        return (this.f45556c & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: N */
    public b newBuilderForType() {
        return L();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: O */
    public b toBuilder() {
        return M(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        h.d<MessageType>.a s11 = s();
        if ((this.f45556c & 1) == 1) {
            codedOutputStream.a0(1, this.f45557d);
        }
        for (int i11 = 0; i11 < this.f45558e.size(); i11++) {
            codedOutputStream.d0(2, this.f45558e.get(i11));
        }
        for (int i12 = 0; i12 < this.f45559f.size(); i12++) {
            codedOutputStream.a0(31, this.f45559f.get(i12).intValue());
        }
        s11.a(19000, codedOutputStream);
        codedOutputStream.i0(this.f45555b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<d> getParserForType() {
        return f45554j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45561h;
        if (i11 != -1) {
            return i11;
        }
        int o11 = (this.f45556c & 1) == 1 ? CodedOutputStream.o(1, this.f45557d) + 0 : 0;
        for (int i12 = 0; i12 < this.f45558e.size(); i12++) {
            o11 += CodedOutputStream.s(2, this.f45558e.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f45559f.size(); i14++) {
            i13 += CodedOutputStream.p(this.f45559f.get(i14).intValue());
        }
        int size = o11 + i13 + (I().size() * 2) + n() + this.f45555b.size();
        this.f45561h = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45560g;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < G(); i11++) {
            if (!F(i11).isInitialized()) {
                this.f45560g = (byte) 0;
                return false;
            }
        }
        if (!m()) {
            this.f45560g = (byte) 0;
            return false;
        }
        this.f45560g = (byte) 1;
        return true;
    }

    private d(h.c<d, ?> cVar) {
        super(cVar);
        this.f45560g = (byte) -1;
        this.f45561h = -1;
        this.f45555b = cVar.e();
    }

    private d(boolean z11) {
        this.f45560g = (byte) -1;
        this.f45561h = -1;
        this.f45555b = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45560g = (byte) -1;
        this.f45561h = -1;
        K();
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
                                this.f45556c |= 1;
                                this.f45557d = eVar.s();
                            } else if (K == 18) {
                                if (!(z12 & true)) {
                                    this.f45558e = new ArrayList();
                                    z12 |= true;
                                }
                                this.f45558e.add(eVar.u(u.f45847m, fVar));
                            } else if (K == 248) {
                                if (!(z12 & true)) {
                                    this.f45559f = new ArrayList();
                                    z12 |= true;
                                }
                                this.f45559f.add(Integer.valueOf(eVar.s()));
                            } else if (K != 250) {
                                if (!j(eVar, J, fVar, K)) {
                                }
                            } else {
                                int j11 = eVar.j(eVar.A());
                                if (!(z12 & true) && eVar.e() > 0) {
                                    this.f45559f = new ArrayList();
                                    z12 |= true;
                                }
                                while (eVar.e() > 0) {
                                    this.f45559f.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j11);
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
                if (z12 & true) {
                    this.f45558e = Collections.unmodifiableList(this.f45558e);
                }
                if (z12 & true) {
                    this.f45559f = Collections.unmodifiableList(this.f45559f);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45555b = q11.l();
                    throw th3;
                }
                this.f45555b = q11.l();
                g();
                throw th2;
            }
        }
        if (z12 & true) {
            this.f45558e = Collections.unmodifiableList(this.f45558e);
        }
        if (z12 & true) {
            this.f45559f = Collections.unmodifiableList(this.f45559f);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45555b = q11.l();
            throw th4;
        }
        this.f45555b = q11.l();
        g();
    }
}