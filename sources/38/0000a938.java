package p10;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
public final class b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: g  reason: collision with root package name */
    private static final b f45462g;

    /* renamed from: h  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<b> f45463h = new a();

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45464a;

    /* renamed from: b  reason: collision with root package name */
    private int f45465b;

    /* renamed from: c  reason: collision with root package name */
    private int f45466c;

    /* renamed from: d  reason: collision with root package name */
    private List<C0970b> f45467d;

    /* renamed from: e  reason: collision with root package name */
    private byte f45468e;

    /* renamed from: f  reason: collision with root package name */
    private int f45469f;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new b(eVar, fVar);
        }
    }

    /* renamed from: p10.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0970b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: g  reason: collision with root package name */
        private static final C0970b f45470g;

        /* renamed from: h  reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<C0970b> f45471h = new a();

        /* renamed from: a  reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f45472a;

        /* renamed from: b  reason: collision with root package name */
        private int f45473b;

        /* renamed from: c  reason: collision with root package name */
        private int f45474c;

        /* renamed from: d  reason: collision with root package name */
        private c f45475d;

        /* renamed from: e  reason: collision with root package name */
        private byte f45476e;

        /* renamed from: f  reason: collision with root package name */
        private int f45477f;

        /* renamed from: p10.b$b$a */
        /* loaded from: classes5.dex */
        static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C0970b> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m */
            public C0970b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new C0970b(eVar, fVar);
            }
        }

        /* renamed from: p10.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0971b extends h.b<C0970b, C0971b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

            /* renamed from: b  reason: collision with root package name */
            private int f45478b;

            /* renamed from: c  reason: collision with root package name */
            private int f45479c;

            /* renamed from: d  reason: collision with root package name */
            private c f45480d = c.G();

            private C0971b() {
                m();
            }

            static /* synthetic */ C0971b h() {
                return l();
            }

            private static C0971b l() {
                return new C0971b();
            }

            private void m() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: i */
            public C0970b build() {
                C0970b j11 = j();
                if (j11.isInitialized()) {
                    return j11;
                }
                throw a.AbstractC0651a.c(j11);
            }

            public C0970b j() {
                C0970b c0970b = new C0970b(this);
                int i11 = this.f45478b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                c0970b.f45474c = this.f45479c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                c0970b.f45475d = this.f45480d;
                c0970b.f45473b = i12;
                return c0970b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: k */
            public C0971b d() {
                return l().f(j());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p10.b.C0970b.C0971b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<p10.b$b> r1 = p10.b.C0970b.f45471h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    p10.b$b r3 = (p10.b.C0970b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    p10.b$b r4 = (p10.b.C0970b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: p10.b.C0970b.C0971b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.b$b$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: o */
            public C0971b f(C0970b c0970b) {
                if (c0970b == C0970b.p()) {
                    return this;
                }
                if (c0970b.s()) {
                    q(c0970b.q());
                }
                if (c0970b.t()) {
                    p(c0970b.r());
                }
                g(e().c(c0970b.f45472a));
                return this;
            }

            public C0971b p(c cVar) {
                if ((this.f45478b & 2) == 2 && this.f45480d != c.G()) {
                    this.f45480d = c.a0(this.f45480d).f(cVar).j();
                } else {
                    this.f45480d = cVar;
                }
                this.f45478b |= 2;
                return this;
            }

            public C0971b q(int i11) {
                this.f45478b |= 1;
                this.f45479c = i11;
                return this;
            }
        }

        static {
            C0970b c0970b = new C0970b(true);
            f45470g = c0970b;
            c0970b.u();
        }

        public static C0970b p() {
            return f45470g;
        }

        private void u() {
            this.f45474c = 0;
            this.f45475d = c.G();
        }

        public static C0971b v() {
            return C0971b.h();
        }

        public static C0971b w(C0970b c0970b) {
            return v().f(c0970b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f45473b & 1) == 1) {
                codedOutputStream.a0(1, this.f45474c);
            }
            if ((this.f45473b & 2) == 2) {
                codedOutputStream.d0(2, this.f45475d);
            }
            codedOutputStream.i0(this.f45472a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<C0970b> getParserForType() {
            return f45471h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int getSerializedSize() {
            int i11 = this.f45477f;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.f45473b & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f45474c) : 0;
            if ((this.f45473b & 2) == 2) {
                o11 += CodedOutputStream.s(2, this.f45475d);
            }
            int size = o11 + this.f45472a.size();
            this.f45477f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b11 = this.f45476e;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!s()) {
                this.f45476e = (byte) 0;
                return false;
            } else if (!t()) {
                this.f45476e = (byte) 0;
                return false;
            } else if (!r().isInitialized()) {
                this.f45476e = (byte) 0;
                return false;
            } else {
                this.f45476e = (byte) 1;
                return true;
            }
        }

        public int q() {
            return this.f45474c;
        }

        public c r() {
            return this.f45475d;
        }

        public boolean s() {
            return (this.f45473b & 1) == 1;
        }

        public boolean t() {
            return (this.f45473b & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: x */
        public C0971b newBuilderForType() {
            return v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: y */
        public C0971b toBuilder() {
            return w(this);
        }

        /* renamed from: p10.b$b$c */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

            /* renamed from: p  reason: collision with root package name */
            private static final c f45481p;

            /* renamed from: q  reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> f45482q = new a();

            /* renamed from: a  reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f45483a;

            /* renamed from: b  reason: collision with root package name */
            private int f45484b;

            /* renamed from: c  reason: collision with root package name */
            private EnumC0973c f45485c;

            /* renamed from: d  reason: collision with root package name */
            private long f45486d;

            /* renamed from: e  reason: collision with root package name */
            private float f45487e;

            /* renamed from: f  reason: collision with root package name */
            private double f45488f;

            /* renamed from: g  reason: collision with root package name */
            private int f45489g;

            /* renamed from: h  reason: collision with root package name */
            private int f45490h;

            /* renamed from: i  reason: collision with root package name */
            private int f45491i;

            /* renamed from: j  reason: collision with root package name */
            private b f45492j;

            /* renamed from: k  reason: collision with root package name */
            private List<c> f45493k;

            /* renamed from: l  reason: collision with root package name */
            private int f45494l;

            /* renamed from: m  reason: collision with root package name */
            private int f45495m;

            /* renamed from: n  reason: collision with root package name */
            private byte f45496n;

            /* renamed from: o  reason: collision with root package name */
            private int f45497o;

            /* renamed from: p10.b$b$c$a */
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

            /* renamed from: p10.b$b$c$b  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0972b extends h.b<c, C0972b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

                /* renamed from: b  reason: collision with root package name */
                private int f45498b;

                /* renamed from: d  reason: collision with root package name */
                private long f45500d;

                /* renamed from: e  reason: collision with root package name */
                private float f45501e;

                /* renamed from: f  reason: collision with root package name */
                private double f45502f;

                /* renamed from: g  reason: collision with root package name */
                private int f45503g;

                /* renamed from: h  reason: collision with root package name */
                private int f45504h;

                /* renamed from: i  reason: collision with root package name */
                private int f45505i;

                /* renamed from: l  reason: collision with root package name */
                private int f45508l;

                /* renamed from: m  reason: collision with root package name */
                private int f45509m;

                /* renamed from: c  reason: collision with root package name */
                private EnumC0973c f45499c = EnumC0973c.BYTE;

                /* renamed from: j  reason: collision with root package name */
                private b f45506j = b.t();

                /* renamed from: k  reason: collision with root package name */
                private List<c> f45507k = Collections.emptyList();

                private C0972b() {
                    n();
                }

                static /* synthetic */ C0972b h() {
                    return l();
                }

                private static C0972b l() {
                    return new C0972b();
                }

                private void m() {
                    if ((this.f45498b & 256) != 256) {
                        this.f45507k = new ArrayList(this.f45507k);
                        this.f45498b |= 256;
                    }
                }

                private void n() {
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
                    int i11 = this.f45498b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    cVar.f45485c = this.f45499c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    cVar.f45486d = this.f45500d;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    cVar.f45487e = this.f45501e;
                    if ((i11 & 8) == 8) {
                        i12 |= 8;
                    }
                    cVar.f45488f = this.f45502f;
                    if ((i11 & 16) == 16) {
                        i12 |= 16;
                    }
                    cVar.f45489g = this.f45503g;
                    if ((i11 & 32) == 32) {
                        i12 |= 32;
                    }
                    cVar.f45490h = this.f45504h;
                    if ((i11 & 64) == 64) {
                        i12 |= 64;
                    }
                    cVar.f45491i = this.f45505i;
                    if ((i11 & 128) == 128) {
                        i12 |= 128;
                    }
                    cVar.f45492j = this.f45506j;
                    if ((this.f45498b & 256) == 256) {
                        this.f45507k = Collections.unmodifiableList(this.f45507k);
                        this.f45498b &= -257;
                    }
                    cVar.f45493k = this.f45507k;
                    if ((i11 & 512) == 512) {
                        i12 |= 256;
                    }
                    cVar.f45494l = this.f45508l;
                    if ((i11 & 1024) == 1024) {
                        i12 |= 512;
                    }
                    cVar.f45495m = this.f45509m;
                    cVar.f45484b = i12;
                    return cVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: k */
                public C0972b d() {
                    return l().f(j());
                }

                public C0972b o(b bVar) {
                    if ((this.f45498b & 128) == 128 && this.f45506j != b.t()) {
                        this.f45506j = b.y(this.f45506j).f(bVar).j();
                    } else {
                        this.f45506j = bVar;
                    }
                    this.f45498b |= 128;
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
                /* renamed from: p */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public p10.b.C0970b.c.C0972b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<p10.b$b$c> r1 = p10.b.C0970b.c.f45482q     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        p10.b$b$c r3 = (p10.b.C0970b.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        p10.b$b$c r4 = (p10.b.C0970b.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: p10.b.C0970b.c.C0972b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.b$b$c$b");
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: q */
                public C0972b f(c cVar) {
                    if (cVar == c.G()) {
                        return this;
                    }
                    if (cVar.X()) {
                        z(cVar.N());
                    }
                    if (cVar.V()) {
                        x(cVar.L());
                    }
                    if (cVar.U()) {
                        w(cVar.K());
                    }
                    if (cVar.R()) {
                        t(cVar.H());
                    }
                    if (cVar.W()) {
                        y(cVar.M());
                    }
                    if (cVar.Q()) {
                        s(cVar.F());
                    }
                    if (cVar.S()) {
                        u(cVar.I());
                    }
                    if (cVar.O()) {
                        o(cVar.z());
                    }
                    if (!cVar.f45493k.isEmpty()) {
                        if (this.f45507k.isEmpty()) {
                            this.f45507k = cVar.f45493k;
                            this.f45498b &= -257;
                        } else {
                            m();
                            this.f45507k.addAll(cVar.f45493k);
                        }
                    }
                    if (cVar.P()) {
                        r(cVar.A());
                    }
                    if (cVar.T()) {
                        v(cVar.J());
                    }
                    g(e().c(cVar.f45483a));
                    return this;
                }

                public C0972b r(int i11) {
                    this.f45498b |= 512;
                    this.f45508l = i11;
                    return this;
                }

                public C0972b s(int i11) {
                    this.f45498b |= 32;
                    this.f45504h = i11;
                    return this;
                }

                public C0972b t(double d11) {
                    this.f45498b |= 8;
                    this.f45502f = d11;
                    return this;
                }

                public C0972b u(int i11) {
                    this.f45498b |= 64;
                    this.f45505i = i11;
                    return this;
                }

                public C0972b v(int i11) {
                    this.f45498b |= 1024;
                    this.f45509m = i11;
                    return this;
                }

                public C0972b w(float f11) {
                    this.f45498b |= 4;
                    this.f45501e = f11;
                    return this;
                }

                public C0972b x(long j11) {
                    this.f45498b |= 2;
                    this.f45500d = j11;
                    return this;
                }

                public C0972b y(int i11) {
                    this.f45498b |= 16;
                    this.f45503g = i11;
                    return this;
                }

                public C0972b z(EnumC0973c enumC0973c) {
                    Objects.requireNonNull(enumC0973c);
                    this.f45498b |= 1;
                    this.f45499c = enumC0973c;
                    return this;
                }
            }

            /* renamed from: p10.b$b$c$c  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public enum EnumC0973c implements i.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                
                private static i.b<EnumC0973c> internalValueMap = new a();
                private final int value;

                /* renamed from: p10.b$b$c$c$a */
                /* loaded from: classes5.dex */
                static class a implements i.b<EnumC0973c> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    /* renamed from: a */
                    public EnumC0973c findValueByNumber(int i11) {
                        return EnumC0973c.valueOf(i11);
                    }
                }

                EnumC0973c(int i11, int i12) {
                    this.value = i12;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC0973c valueOf(int i11) {
                    switch (i11) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }
            }

            static {
                c cVar = new c(true);
                f45481p = cVar;
                cVar.Y();
            }

            public static c G() {
                return f45481p;
            }

            private void Y() {
                this.f45485c = EnumC0973c.BYTE;
                this.f45486d = 0L;
                this.f45487e = BitmapDescriptorFactory.HUE_RED;
                this.f45488f = 0.0d;
                this.f45489g = 0;
                this.f45490h = 0;
                this.f45491i = 0;
                this.f45492j = b.t();
                this.f45493k = Collections.emptyList();
                this.f45494l = 0;
                this.f45495m = 0;
            }

            public static C0972b Z() {
                return C0972b.h();
            }

            public static C0972b a0(c cVar) {
                return Z().f(cVar);
            }

            public int A() {
                return this.f45494l;
            }

            public c B(int i11) {
                return this.f45493k.get(i11);
            }

            public int C() {
                return this.f45493k.size();
            }

            public List<c> E() {
                return this.f45493k;
            }

            public int F() {
                return this.f45490h;
            }

            public double H() {
                return this.f45488f;
            }

            public int I() {
                return this.f45491i;
            }

            public int J() {
                return this.f45495m;
            }

            public float K() {
                return this.f45487e;
            }

            public long L() {
                return this.f45486d;
            }

            public int M() {
                return this.f45489g;
            }

            public EnumC0973c N() {
                return this.f45485c;
            }

            public boolean O() {
                return (this.f45484b & 128) == 128;
            }

            public boolean P() {
                return (this.f45484b & 256) == 256;
            }

            public boolean Q() {
                return (this.f45484b & 32) == 32;
            }

            public boolean R() {
                return (this.f45484b & 8) == 8;
            }

            public boolean S() {
                return (this.f45484b & 64) == 64;
            }

            public boolean T() {
                return (this.f45484b & 512) == 512;
            }

            public boolean U() {
                return (this.f45484b & 4) == 4;
            }

            public boolean V() {
                return (this.f45484b & 2) == 2;
            }

            public boolean W() {
                return (this.f45484b & 16) == 16;
            }

            public boolean X() {
                return (this.f45484b & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void a(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f45484b & 1) == 1) {
                    codedOutputStream.S(1, this.f45485c.getNumber());
                }
                if ((this.f45484b & 2) == 2) {
                    codedOutputStream.t0(2, this.f45486d);
                }
                if ((this.f45484b & 4) == 4) {
                    codedOutputStream.W(3, this.f45487e);
                }
                if ((this.f45484b & 8) == 8) {
                    codedOutputStream.Q(4, this.f45488f);
                }
                if ((this.f45484b & 16) == 16) {
                    codedOutputStream.a0(5, this.f45489g);
                }
                if ((this.f45484b & 32) == 32) {
                    codedOutputStream.a0(6, this.f45490h);
                }
                if ((this.f45484b & 64) == 64) {
                    codedOutputStream.a0(7, this.f45491i);
                }
                if ((this.f45484b & 128) == 128) {
                    codedOutputStream.d0(8, this.f45492j);
                }
                for (int i11 = 0; i11 < this.f45493k.size(); i11++) {
                    codedOutputStream.d0(9, this.f45493k.get(i11));
                }
                if ((this.f45484b & 512) == 512) {
                    codedOutputStream.a0(10, this.f45495m);
                }
                if ((this.f45484b & 256) == 256) {
                    codedOutputStream.a0(11, this.f45494l);
                }
                codedOutputStream.i0(this.f45483a);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: b0 */
            public C0972b newBuilderForType() {
                return Z();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: c0 */
            public C0972b toBuilder() {
                return a0(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public kotlin.reflect.jvm.internal.impl.protobuf.q<c> getParserForType() {
                return f45482q;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int getSerializedSize() {
                int i11 = this.f45497o;
                if (i11 != -1) {
                    return i11;
                }
                int h11 = (this.f45484b & 1) == 1 ? CodedOutputStream.h(1, this.f45485c.getNumber()) + 0 : 0;
                if ((this.f45484b & 2) == 2) {
                    h11 += CodedOutputStream.A(2, this.f45486d);
                }
                if ((this.f45484b & 4) == 4) {
                    h11 += CodedOutputStream.l(3, this.f45487e);
                }
                if ((this.f45484b & 8) == 8) {
                    h11 += CodedOutputStream.f(4, this.f45488f);
                }
                if ((this.f45484b & 16) == 16) {
                    h11 += CodedOutputStream.o(5, this.f45489g);
                }
                if ((this.f45484b & 32) == 32) {
                    h11 += CodedOutputStream.o(6, this.f45490h);
                }
                if ((this.f45484b & 64) == 64) {
                    h11 += CodedOutputStream.o(7, this.f45491i);
                }
                if ((this.f45484b & 128) == 128) {
                    h11 += CodedOutputStream.s(8, this.f45492j);
                }
                for (int i12 = 0; i12 < this.f45493k.size(); i12++) {
                    h11 += CodedOutputStream.s(9, this.f45493k.get(i12));
                }
                if ((this.f45484b & 512) == 512) {
                    h11 += CodedOutputStream.o(10, this.f45495m);
                }
                if ((this.f45484b & 256) == 256) {
                    h11 += CodedOutputStream.o(11, this.f45494l);
                }
                int size = h11 + this.f45483a.size();
                this.f45497o = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean isInitialized() {
                byte b11 = this.f45496n;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                if (O() && !z().isInitialized()) {
                    this.f45496n = (byte) 0;
                    return false;
                }
                for (int i11 = 0; i11 < C(); i11++) {
                    if (!B(i11).isInitialized()) {
                        this.f45496n = (byte) 0;
                        return false;
                    }
                }
                this.f45496n = (byte) 1;
                return true;
            }

            public b z() {
                return this.f45492j;
            }

            private c(h.b bVar) {
                super(bVar);
                this.f45496n = (byte) -1;
                this.f45497o = -1;
                this.f45483a = bVar.e();
            }

            private c(boolean z11) {
                this.f45496n = (byte) -1;
                this.f45497o = -1;
                this.f45483a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                this.f45496n = (byte) -1;
                this.f45497o = -1;
                Y();
                d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
                CodedOutputStream J = CodedOutputStream.J(q11, 1);
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    ?? r52 = 256;
                    if (!z11) {
                        try {
                            try {
                                int K = eVar.K();
                                switch (K) {
                                    case 0:
                                        break;
                                    case 8:
                                        int n11 = eVar.n();
                                        EnumC0973c valueOf = EnumC0973c.valueOf(n11);
                                        if (valueOf == null) {
                                            J.o0(K);
                                            J.o0(n11);
                                        } else {
                                            this.f45484b |= 1;
                                            this.f45485c = valueOf;
                                            continue;
                                        }
                                    case 16:
                                        this.f45484b |= 2;
                                        this.f45486d = eVar.H();
                                        continue;
                                    case 29:
                                        this.f45484b |= 4;
                                        this.f45487e = eVar.q();
                                        continue;
                                    case 33:
                                        this.f45484b |= 8;
                                        this.f45488f = eVar.m();
                                        continue;
                                    case 40:
                                        this.f45484b |= 16;
                                        this.f45489g = eVar.s();
                                        continue;
                                    case 48:
                                        this.f45484b |= 32;
                                        this.f45490h = eVar.s();
                                        continue;
                                    case 56:
                                        this.f45484b |= 64;
                                        this.f45491i = eVar.s();
                                        continue;
                                    case 66:
                                        c builder = (this.f45484b & 128) == 128 ? this.f45492j.toBuilder() : null;
                                        b bVar = (b) eVar.u(b.f45463h, fVar);
                                        this.f45492j = bVar;
                                        if (builder != null) {
                                            builder.f(bVar);
                                            this.f45492j = builder.j();
                                        }
                                        this.f45484b |= 128;
                                        continue;
                                    case 74:
                                        if (!(z12 & true)) {
                                            this.f45493k = new ArrayList();
                                            z12 |= true;
                                        }
                                        this.f45493k.add(eVar.u(f45482q, fVar));
                                        continue;
                                    case 80:
                                        this.f45484b |= 512;
                                        this.f45495m = eVar.s();
                                        continue;
                                    case 88:
                                        this.f45484b |= 256;
                                        this.f45494l = eVar.s();
                                        continue;
                                    default:
                                        r52 = j(eVar, J, fVar, K);
                                        if (r52 == 0) {
                                            break;
                                        } else {
                                            continue;
                                        }
                                }
                                z11 = true;
                            } catch (InvalidProtocolBufferException e11) {
                                throw e11.i(this);
                            } catch (IOException e12) {
                                throw new InvalidProtocolBufferException(e12.getMessage()).i(this);
                            }
                        } catch (Throwable th2) {
                            if ((z12 & true) == r52) {
                                this.f45493k = Collections.unmodifiableList(this.f45493k);
                            }
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f45483a = q11.l();
                                throw th3;
                            }
                            this.f45483a = q11.l();
                            g();
                            throw th2;
                        }
                    } else {
                        if (z12 & true) {
                            this.f45493k = Collections.unmodifiableList(this.f45493k);
                        }
                        try {
                            J.I();
                        } catch (IOException unused2) {
                        } catch (Throwable th4) {
                            this.f45483a = q11.l();
                            throw th4;
                        }
                        this.f45483a = q11.l();
                        g();
                        return;
                    }
                }
            }
        }

        private C0970b(h.b bVar) {
            super(bVar);
            this.f45476e = (byte) -1;
            this.f45477f = -1;
            this.f45472a = bVar.e();
        }

        private C0970b(boolean z11) {
            this.f45476e = (byte) -1;
            this.f45477f = -1;
            this.f45472a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
        }

        private C0970b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            this.f45476e = (byte) -1;
            this.f45477f = -1;
            u();
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
                                    this.f45473b |= 1;
                                    this.f45474c = eVar.s();
                                } else if (K != 18) {
                                    if (!j(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    c.C0972b builder = (this.f45473b & 2) == 2 ? this.f45475d.toBuilder() : null;
                                    c cVar = (c) eVar.u(c.f45482q, fVar);
                                    this.f45475d = cVar;
                                    if (builder != null) {
                                        builder.f(cVar);
                                        this.f45475d = builder.j();
                                    }
                                    this.f45473b |= 2;
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
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f45472a = q11.l();
                        throw th3;
                    }
                    this.f45472a = q11.l();
                    g();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f45472a = q11.l();
                throw th4;
            }
            this.f45472a = q11.l();
            g();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends h.b<b, c> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: b  reason: collision with root package name */
        private int f45510b;

        /* renamed from: c  reason: collision with root package name */
        private int f45511c;

        /* renamed from: d  reason: collision with root package name */
        private List<C0970b> f45512d = Collections.emptyList();

        private c() {
            n();
        }

        static /* synthetic */ c h() {
            return l();
        }

        private static c l() {
            return new c();
        }

        private void m() {
            if ((this.f45510b & 2) != 2) {
                this.f45512d = new ArrayList(this.f45512d);
                this.f45510b |= 2;
            }
        }

        private void n() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: i */
        public b build() {
            b j11 = j();
            if (j11.isInitialized()) {
                return j11;
            }
            throw a.AbstractC0651a.c(j11);
        }

        public b j() {
            b bVar = new b(this);
            int i11 = (this.f45510b & 1) != 1 ? 0 : 1;
            bVar.f45466c = this.f45511c;
            if ((this.f45510b & 2) == 2) {
                this.f45512d = Collections.unmodifiableList(this.f45512d);
                this.f45510b &= -3;
            }
            bVar.f45467d = this.f45512d;
            bVar.f45465b = i11;
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: k */
        public c d() {
            return l().f(j());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.b.c b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.b> r1 = p10.b.f45463h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.b r3 = (p10.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.b r4 = (p10.b) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.b.c.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.b$c");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: p */
        public c f(b bVar) {
            if (bVar == b.t()) {
                return this;
            }
            if (bVar.v()) {
                q(bVar.u());
            }
            if (!bVar.f45467d.isEmpty()) {
                if (this.f45512d.isEmpty()) {
                    this.f45512d = bVar.f45467d;
                    this.f45510b &= -3;
                } else {
                    m();
                    this.f45512d.addAll(bVar.f45467d);
                }
            }
            g(e().c(bVar.f45464a));
            return this;
        }

        public c q(int i11) {
            this.f45510b |= 1;
            this.f45511c = i11;
            return this;
        }
    }

    static {
        b bVar = new b(true);
        f45462g = bVar;
        bVar.w();
    }

    public static b t() {
        return f45462g;
    }

    private void w() {
        this.f45466c = 0;
        this.f45467d = Collections.emptyList();
    }

    public static c x() {
        return c.h();
    }

    public static c y(b bVar) {
        return x().f(bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: A */
    public c toBuilder() {
        return y(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        if ((this.f45465b & 1) == 1) {
            codedOutputStream.a0(1, this.f45466c);
        }
        for (int i11 = 0; i11 < this.f45467d.size(); i11++) {
            codedOutputStream.d0(2, this.f45467d.get(i11));
        }
        codedOutputStream.i0(this.f45464a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<b> getParserForType() {
        return f45463h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45469f;
        if (i11 != -1) {
            return i11;
        }
        int o11 = (this.f45465b & 1) == 1 ? CodedOutputStream.o(1, this.f45466c) + 0 : 0;
        for (int i12 = 0; i12 < this.f45467d.size(); i12++) {
            o11 += CodedOutputStream.s(2, this.f45467d.get(i12));
        }
        int size = o11 + this.f45464a.size();
        this.f45469f = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45468e;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!v()) {
            this.f45468e = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < r(); i11++) {
            if (!q(i11).isInitialized()) {
                this.f45468e = (byte) 0;
                return false;
            }
        }
        this.f45468e = (byte) 1;
        return true;
    }

    public C0970b q(int i11) {
        return this.f45467d.get(i11);
    }

    public int r() {
        return this.f45467d.size();
    }

    public List<C0970b> s() {
        return this.f45467d;
    }

    public int u() {
        return this.f45466c;
    }

    public boolean v() {
        return (this.f45465b & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: z */
    public c newBuilderForType() {
        return x();
    }

    private b(h.b bVar) {
        super(bVar);
        this.f45468e = (byte) -1;
        this.f45469f = -1;
        this.f45464a = bVar.e();
    }

    private b(boolean z11) {
        this.f45468e = (byte) -1;
        this.f45469f = -1;
        this.f45464a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45468e = (byte) -1;
        this.f45469f = -1;
        w();
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
                            this.f45465b |= 1;
                            this.f45466c = eVar.s();
                        } else if (K != 18) {
                            if (!j(eVar, J, fVar, K)) {
                            }
                        } else {
                            if (!(z12 & true)) {
                                this.f45467d = new ArrayList();
                                z12 |= true;
                            }
                            this.f45467d.add(eVar.u(C0970b.f45471h, fVar));
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
                    this.f45467d = Collections.unmodifiableList(this.f45467d);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45464a = q11.l();
                    throw th3;
                }
                this.f45464a = q11.l();
                g();
                throw th2;
            }
        }
        if (z12 & true) {
            this.f45467d = Collections.unmodifiableList(this.f45467d);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45464a = q11.l();
            throw th4;
        }
        this.f45464a = q11.l();
        g();
    }
}