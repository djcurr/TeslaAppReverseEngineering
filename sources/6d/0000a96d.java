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
public final class o extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: e  reason: collision with root package name */
    private static final o f45713e;

    /* renamed from: f  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<o> f45714f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45715a;

    /* renamed from: b  reason: collision with root package name */
    private List<c> f45716b;

    /* renamed from: c  reason: collision with root package name */
    private byte f45717c;

    /* renamed from: d  reason: collision with root package name */
    private int f45718d;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<o> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public o c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new o(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.b<o, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: b  reason: collision with root package name */
        private int f45719b;

        /* renamed from: c  reason: collision with root package name */
        private List<c> f45720c = Collections.emptyList();

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
            if ((this.f45719b & 1) != 1) {
                this.f45720c = new ArrayList(this.f45720c);
                this.f45719b |= 1;
            }
        }

        private void n() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: i */
        public o build() {
            o j11 = j();
            if (j11.isInitialized()) {
                return j11;
            }
            throw a.AbstractC0651a.c(j11);
        }

        public o j() {
            o oVar = new o(this);
            if ((this.f45719b & 1) == 1) {
                this.f45720c = Collections.unmodifiableList(this.f45720c);
                this.f45719b &= -2;
            }
            oVar.f45716b = this.f45720c;
            return oVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: k */
        public b d() {
            return l().f(j());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.o.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.o> r1 = p10.o.f45714f     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.o r3 = (p10.o) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.o r4 = (p10.o) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.o.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.o$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: p */
        public b f(o oVar) {
            if (oVar == o.o()) {
                return this;
            }
            if (!oVar.f45716b.isEmpty()) {
                if (this.f45720c.isEmpty()) {
                    this.f45720c = oVar.f45716b;
                    this.f45719b &= -2;
                } else {
                    m();
                    this.f45720c.addAll(oVar.f45716b);
                }
            }
            g(e().c(oVar.f45715a));
            return this;
        }
    }

    static {
        o oVar = new o(true);
        f45713e = oVar;
        oVar.r();
    }

    public static o o() {
        return f45713e;
    }

    private void r() {
        this.f45716b = Collections.emptyList();
    }

    public static b s() {
        return b.h();
    }

    public static b t(o oVar) {
        return s().f(oVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        for (int i11 = 0; i11 < this.f45716b.size(); i11++) {
            codedOutputStream.d0(1, this.f45716b.get(i11));
        }
        codedOutputStream.i0(this.f45715a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<o> getParserForType() {
        return f45714f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45718d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f45716b.size(); i13++) {
            i12 += CodedOutputStream.s(1, this.f45716b.get(i13));
        }
        int size = i12 + this.f45715a.size();
        this.f45718d = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45717c;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < q(); i11++) {
            if (!p(i11).isInitialized()) {
                this.f45717c = (byte) 0;
                return false;
            }
        }
        this.f45717c = (byte) 1;
        return true;
    }

    public c p(int i11) {
        return this.f45716b.get(i11);
    }

    public int q() {
        return this.f45716b.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: u */
    public b newBuilderForType() {
        return s();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: v */
    public b toBuilder() {
        return t(this);
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: h  reason: collision with root package name */
        private static final c f45721h;

        /* renamed from: i  reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> f45722i = new a();

        /* renamed from: a  reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f45723a;

        /* renamed from: b  reason: collision with root package name */
        private int f45724b;

        /* renamed from: c  reason: collision with root package name */
        private int f45725c;

        /* renamed from: d  reason: collision with root package name */
        private int f45726d;

        /* renamed from: e  reason: collision with root package name */
        private EnumC0975c f45727e;

        /* renamed from: f  reason: collision with root package name */
        private byte f45728f;

        /* renamed from: g  reason: collision with root package name */
        private int f45729g;

        /* loaded from: classes5.dex */
        static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m */
            public c c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new c(eVar, fVar);
            }
        }

        /* loaded from: classes5.dex */
        public static final class b extends h.b<c, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

            /* renamed from: b  reason: collision with root package name */
            private int f45730b;

            /* renamed from: d  reason: collision with root package name */
            private int f45732d;

            /* renamed from: c  reason: collision with root package name */
            private int f45731c = -1;

            /* renamed from: e  reason: collision with root package name */
            private EnumC0975c f45733e = EnumC0975c.PACKAGE;

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
            public c build() {
                c j11 = j();
                if (j11.isInitialized()) {
                    return j11;
                }
                throw a.AbstractC0651a.c(j11);
            }

            public c j() {
                c cVar = new c(this);
                int i11 = this.f45730b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                cVar.f45725c = this.f45731c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                cVar.f45726d = this.f45732d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                cVar.f45727e = this.f45733e;
                cVar.f45724b = i12;
                return cVar;
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
            public p10.o.c.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<p10.o$c> r1 = p10.o.c.f45722i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    p10.o$c r3 = (p10.o.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    p10.o$c r4 = (p10.o.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: p10.o.c.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.o$c$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: o */
            public b f(c cVar) {
                if (cVar == c.q()) {
                    return this;
                }
                if (cVar.v()) {
                    q(cVar.s());
                }
                if (cVar.w()) {
                    r(cVar.t());
                }
                if (cVar.u()) {
                    p(cVar.r());
                }
                g(e().c(cVar.f45723a));
                return this;
            }

            public b p(EnumC0975c enumC0975c) {
                Objects.requireNonNull(enumC0975c);
                this.f45730b |= 4;
                this.f45733e = enumC0975c;
                return this;
            }

            public b q(int i11) {
                this.f45730b |= 1;
                this.f45731c = i11;
                return this;
            }

            public b r(int i11) {
                this.f45730b |= 2;
                this.f45732d = i11;
                return this;
            }
        }

        /* renamed from: p10.o$c$c  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public enum EnumC0975c implements i.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            
            private static i.b<EnumC0975c> internalValueMap = new a();
            private final int value;

            /* renamed from: p10.o$c$c$a */
            /* loaded from: classes5.dex */
            static class a implements i.b<EnumC0975c> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                /* renamed from: a */
                public EnumC0975c findValueByNumber(int i11) {
                    return EnumC0975c.valueOf(i11);
                }
            }

            EnumC0975c(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static EnumC0975c valueOf(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return null;
                        }
                        return LOCAL;
                    }
                    return PACKAGE;
                }
                return CLASS;
            }
        }

        static {
            c cVar = new c(true);
            f45721h = cVar;
            cVar.x();
        }

        public static c q() {
            return f45721h;
        }

        private void x() {
            this.f45725c = -1;
            this.f45726d = 0;
            this.f45727e = EnumC0975c.PACKAGE;
        }

        public static b y() {
            return b.h();
        }

        public static b z(c cVar) {
            return y().f(cVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: A */
        public b newBuilderForType() {
            return y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: B */
        public b toBuilder() {
            return z(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f45724b & 1) == 1) {
                codedOutputStream.a0(1, this.f45725c);
            }
            if ((this.f45724b & 2) == 2) {
                codedOutputStream.a0(2, this.f45726d);
            }
            if ((this.f45724b & 4) == 4) {
                codedOutputStream.S(3, this.f45727e.getNumber());
            }
            codedOutputStream.i0(this.f45723a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<c> getParserForType() {
            return f45722i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int getSerializedSize() {
            int i11 = this.f45729g;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.f45724b & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f45725c) : 0;
            if ((this.f45724b & 2) == 2) {
                o11 += CodedOutputStream.o(2, this.f45726d);
            }
            if ((this.f45724b & 4) == 4) {
                o11 += CodedOutputStream.h(3, this.f45727e.getNumber());
            }
            int size = o11 + this.f45723a.size();
            this.f45729g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b11 = this.f45728f;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!w()) {
                this.f45728f = (byte) 0;
                return false;
            }
            this.f45728f = (byte) 1;
            return true;
        }

        public EnumC0975c r() {
            return this.f45727e;
        }

        public int s() {
            return this.f45725c;
        }

        public int t() {
            return this.f45726d;
        }

        public boolean u() {
            return (this.f45724b & 4) == 4;
        }

        public boolean v() {
            return (this.f45724b & 1) == 1;
        }

        public boolean w() {
            return (this.f45724b & 2) == 2;
        }

        private c(h.b bVar) {
            super(bVar);
            this.f45728f = (byte) -1;
            this.f45729g = -1;
            this.f45723a = bVar.e();
        }

        private c(boolean z11) {
            this.f45728f = (byte) -1;
            this.f45729g = -1;
            this.f45723a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            this.f45728f = (byte) -1;
            this.f45729g = -1;
            x();
            d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f45724b |= 1;
                                this.f45725c = eVar.s();
                            } else if (K == 16) {
                                this.f45724b |= 2;
                                this.f45726d = eVar.s();
                            } else if (K != 24) {
                                if (!j(eVar, J, fVar, K)) {
                                }
                            } else {
                                int n11 = eVar.n();
                                EnumC0975c valueOf = EnumC0975c.valueOf(n11);
                                if (valueOf == null) {
                                    J.o0(K);
                                    J.o0(n11);
                                } else {
                                    this.f45724b |= 4;
                                    this.f45727e = valueOf;
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
                        this.f45723a = q11.l();
                        throw th3;
                    }
                    this.f45723a = q11.l();
                    g();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f45723a = q11.l();
                throw th4;
            }
            this.f45723a = q11.l();
            g();
        }
    }

    private o(h.b bVar) {
        super(bVar);
        this.f45717c = (byte) -1;
        this.f45718d = -1;
        this.f45715a = bVar.e();
    }

    private o(boolean z11) {
        this.f45717c = (byte) -1;
        this.f45718d = -1;
        this.f45715a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private o(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45717c = (byte) -1;
        this.f45718d = -1;
        r();
        d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
        CodedOutputStream J = CodedOutputStream.J(q11, 1);
        boolean z11 = false;
        boolean z12 = false;
        while (!z11) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K != 10) {
                            if (!j(eVar, J, fVar, K)) {
                            }
                        } else {
                            if (!(z12 & true)) {
                                this.f45716b = new ArrayList();
                                z12 |= true;
                            }
                            this.f45716b.add(eVar.u(c.f45722i, fVar));
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
                    this.f45716b = Collections.unmodifiableList(this.f45716b);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45715a = q11.l();
                    throw th3;
                }
                this.f45715a = q11.l();
                g();
                throw th2;
            }
        }
        if (z12 & true) {
            this.f45716b = Collections.unmodifiableList(this.f45716b);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45715a = q11.l();
            throw th4;
        }
        this.f45715a = q11.l();
        g();
    }
}