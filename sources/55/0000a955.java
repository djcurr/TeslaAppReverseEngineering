package p10;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes5.dex */
public final class g extends h.d<g> {

    /* renamed from: g  reason: collision with root package name */
    private static final g f45589g;

    /* renamed from: h  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<g> f45590h = new a();

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45591b;

    /* renamed from: c  reason: collision with root package name */
    private int f45592c;

    /* renamed from: d  reason: collision with root package name */
    private int f45593d;

    /* renamed from: e  reason: collision with root package name */
    private byte f45594e;

    /* renamed from: f  reason: collision with root package name */
    private int f45595f;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<g> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public g c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new g(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.c<g, b> {

        /* renamed from: d  reason: collision with root package name */
        private int f45596d;

        /* renamed from: e  reason: collision with root package name */
        private int f45597e;

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
        public g build() {
            g n11 = n();
            if (n11.isInitialized()) {
                return n11;
            }
            throw a.AbstractC0651a.c(n11);
        }

        public g n() {
            g gVar = new g(this);
            int i11 = (this.f45596d & 1) != 1 ? 0 : 1;
            gVar.f45593d = this.f45597e;
            gVar.f45592c = i11;
            return gVar;
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
        public p10.g.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.g> r1 = p10.g.f45590h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.g r3 = (p10.g) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.g r4 = (p10.g) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.g.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.g$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: s */
        public b f(g gVar) {
            if (gVar == g.x()) {
                return this;
            }
            if (gVar.A()) {
                t(gVar.z());
            }
            k(gVar);
            g(e().c(gVar.f45591b));
            return this;
        }

        public b t(int i11) {
            this.f45596d |= 1;
            this.f45597e = i11;
            return this;
        }
    }

    static {
        g gVar = new g(true);
        f45589g = gVar;
        gVar.B();
    }

    private void B() {
        this.f45593d = 0;
    }

    public static b C() {
        return b.l();
    }

    public static b E(g gVar) {
        return C().f(gVar);
    }

    public static g x() {
        return f45589g;
    }

    public boolean A() {
        return (this.f45592c & 1) == 1;
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
        h.d<MessageType>.a s11 = s();
        if ((this.f45592c & 1) == 1) {
            codedOutputStream.a0(1, this.f45593d);
        }
        s11.a(200, codedOutputStream);
        codedOutputStream.i0(this.f45591b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<g> getParserForType() {
        return f45590h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45595f;
        if (i11 != -1) {
            return i11;
        }
        int o11 = ((this.f45592c & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f45593d) : 0) + n() + this.f45591b.size();
        this.f45595f = o11;
        return o11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45594e;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!m()) {
            this.f45594e = (byte) 0;
            return false;
        }
        this.f45594e = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: y */
    public g getDefaultInstanceForType() {
        return f45589g;
    }

    public int z() {
        return this.f45593d;
    }

    private g(h.c<g, ?> cVar) {
        super(cVar);
        this.f45594e = (byte) -1;
        this.f45595f = -1;
        this.f45591b = cVar.e();
    }

    private g(boolean z11) {
        this.f45594e = (byte) -1;
        this.f45595f = -1;
        this.f45591b = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    private g(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45594e = (byte) -1;
        this.f45595f = -1;
        B();
        d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
        CodedOutputStream J = CodedOutputStream.J(q11, 1);
        boolean z11 = false;
        while (!z11) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K != 8) {
                            if (!j(eVar, J, fVar, K)) {
                            }
                        } else {
                            this.f45592c |= 1;
                            this.f45593d = eVar.s();
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
                    this.f45591b = q11.l();
                    throw th3;
                }
                this.f45591b = q11.l();
                g();
                throw th2;
            }
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45591b = q11.l();
            throw th4;
        }
        this.f45591b = q11.l();
        g();
    }
}