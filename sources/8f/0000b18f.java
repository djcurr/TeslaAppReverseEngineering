package s10;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.w;
import p10.i;
import p10.l;
import p10.n;
import p10.q;
import p10.s;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h.f<p10.d, c> f49973a;

    /* renamed from: b  reason: collision with root package name */
    public static final h.f<i, c> f49974b;

    /* renamed from: c  reason: collision with root package name */
    public static final h.f<i, Integer> f49975c;

    /* renamed from: d  reason: collision with root package name */
    public static final h.f<n, d> f49976d;

    /* renamed from: e  reason: collision with root package name */
    public static final h.f<n, Integer> f49977e;

    /* renamed from: f  reason: collision with root package name */
    public static final h.f<q, List<p10.b>> f49978f;

    /* renamed from: g  reason: collision with root package name */
    public static final h.f<q, Boolean> f49979g;

    /* renamed from: h  reason: collision with root package name */
    public static final h.f<s, List<p10.b>> f49980h;

    /* renamed from: i  reason: collision with root package name */
    public static final h.f<p10.c, Integer> f49981i;

    /* renamed from: j  reason: collision with root package name */
    public static final h.f<p10.c, List<n>> f49982j;

    /* renamed from: k  reason: collision with root package name */
    public static final h.f<p10.c, Integer> f49983k;

    /* renamed from: l  reason: collision with root package name */
    public static final h.f<p10.c, Integer> f49984l;

    /* renamed from: m  reason: collision with root package name */
    public static final h.f<l, Integer> f49985m;

    /* renamed from: n  reason: collision with root package name */
    public static final h.f<l, List<n>> f49986n;

    /* loaded from: classes5.dex */
    public static final class e extends h implements p {

        /* renamed from: g  reason: collision with root package name */
        private static final e f50024g;

        /* renamed from: h  reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<e> f50025h = new C1104a();

        /* renamed from: a  reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f50026a;

        /* renamed from: b  reason: collision with root package name */
        private List<c> f50027b;

        /* renamed from: c  reason: collision with root package name */
        private List<Integer> f50028c;

        /* renamed from: d  reason: collision with root package name */
        private int f50029d;

        /* renamed from: e  reason: collision with root package name */
        private byte f50030e;

        /* renamed from: f  reason: collision with root package name */
        private int f50031f;

        /* renamed from: s10.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static class C1104a extends kotlin.reflect.jvm.internal.impl.protobuf.b<e> {
            C1104a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m */
            public e c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new e(eVar, fVar);
            }
        }

        /* loaded from: classes5.dex */
        public static final class b extends h.b<e, b> implements p {

            /* renamed from: b  reason: collision with root package name */
            private int f50032b;

            /* renamed from: c  reason: collision with root package name */
            private List<c> f50033c = Collections.emptyList();

            /* renamed from: d  reason: collision with root package name */
            private List<Integer> f50034d = Collections.emptyList();

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
                if ((this.f50032b & 2) != 2) {
                    this.f50034d = new ArrayList(this.f50034d);
                    this.f50032b |= 2;
                }
            }

            private void n() {
                if ((this.f50032b & 1) != 1) {
                    this.f50033c = new ArrayList(this.f50033c);
                    this.f50032b |= 1;
                }
            }

            private void o() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: i */
            public e build() {
                e j11 = j();
                if (j11.isInitialized()) {
                    return j11;
                }
                throw a.AbstractC0651a.c(j11);
            }

            public e j() {
                e eVar = new e(this);
                if ((this.f50032b & 1) == 1) {
                    this.f50033c = Collections.unmodifiableList(this.f50033c);
                    this.f50032b &= -2;
                }
                eVar.f50027b = this.f50033c;
                if ((this.f50032b & 2) == 2) {
                    this.f50034d = Collections.unmodifiableList(this.f50034d);
                    this.f50032b &= -3;
                }
                eVar.f50028c = this.f50034d;
                return eVar;
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
            public s10.a.e.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<s10.a$e> r1 = s10.a.e.f50025h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    s10.a$e r3 = (s10.a.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    s10.a$e r4 = (s10.a.e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: s10.a.e.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):s10.a$e$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: q */
            public b f(e eVar) {
                if (eVar == e.q()) {
                    return this;
                }
                if (!eVar.f50027b.isEmpty()) {
                    if (this.f50033c.isEmpty()) {
                        this.f50033c = eVar.f50027b;
                        this.f50032b &= -2;
                    } else {
                        n();
                        this.f50033c.addAll(eVar.f50027b);
                    }
                }
                if (!eVar.f50028c.isEmpty()) {
                    if (this.f50034d.isEmpty()) {
                        this.f50034d = eVar.f50028c;
                        this.f50032b &= -3;
                    } else {
                        m();
                        this.f50034d.addAll(eVar.f50028c);
                    }
                }
                g(e().c(eVar.f50026a));
                return this;
            }
        }

        static {
            e eVar = new e(true);
            f50024g = eVar;
            eVar.t();
        }

        public static e q() {
            return f50024g;
        }

        private void t() {
            this.f50027b = Collections.emptyList();
            this.f50028c = Collections.emptyList();
        }

        public static b u() {
            return b.h();
        }

        public static b v(e eVar) {
            return u().f(eVar);
        }

        public static e x(InputStream inputStream, f fVar) {
            return f50025h.d(inputStream, fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i11 = 0; i11 < this.f50027b.size(); i11++) {
                codedOutputStream.d0(1, this.f50027b.get(i11));
            }
            if (r().size() > 0) {
                codedOutputStream.o0(42);
                codedOutputStream.o0(this.f50029d);
            }
            for (int i12 = 0; i12 < this.f50028c.size(); i12++) {
                codedOutputStream.b0(this.f50028c.get(i12).intValue());
            }
            codedOutputStream.i0(this.f50026a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<e> getParserForType() {
            return f50025h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int getSerializedSize() {
            int i11 = this.f50031f;
            if (i11 != -1) {
                return i11;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.f50027b.size(); i13++) {
                i12 += CodedOutputStream.s(1, this.f50027b.get(i13));
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.f50028c.size(); i15++) {
                i14 += CodedOutputStream.p(this.f50028c.get(i15).intValue());
            }
            int i16 = i12 + i14;
            if (!r().isEmpty()) {
                i16 = i16 + 1 + CodedOutputStream.p(i14);
            }
            this.f50029d = i14;
            int size = i16 + this.f50026a.size();
            this.f50031f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b11 = this.f50030e;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f50030e = (byte) 1;
            return true;
        }

        public List<Integer> r() {
            return this.f50028c;
        }

        public List<c> s() {
            return this.f50027b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: w */
        public b newBuilderForType() {
            return u();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: y */
        public b toBuilder() {
            return v(this);
        }

        /* loaded from: classes5.dex */
        public static final class c extends h implements p {

            /* renamed from: m  reason: collision with root package name */
            private static final c f50035m;

            /* renamed from: n  reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> f50036n = new C1105a();

            /* renamed from: a  reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f50037a;

            /* renamed from: b  reason: collision with root package name */
            private int f50038b;

            /* renamed from: c  reason: collision with root package name */
            private int f50039c;

            /* renamed from: d  reason: collision with root package name */
            private int f50040d;

            /* renamed from: e  reason: collision with root package name */
            private Object f50041e;

            /* renamed from: f  reason: collision with root package name */
            private EnumC1106c f50042f;

            /* renamed from: g  reason: collision with root package name */
            private List<Integer> f50043g;

            /* renamed from: h  reason: collision with root package name */
            private int f50044h;

            /* renamed from: i  reason: collision with root package name */
            private List<Integer> f50045i;

            /* renamed from: j  reason: collision with root package name */
            private int f50046j;

            /* renamed from: k  reason: collision with root package name */
            private byte f50047k;

            /* renamed from: l  reason: collision with root package name */
            private int f50048l;

            /* renamed from: s10.a$e$c$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            static class C1105a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
                C1105a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m */
                public c c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                    return new c(eVar, fVar);
                }
            }

            /* loaded from: classes5.dex */
            public static final class b extends h.b<c, b> implements p {

                /* renamed from: b  reason: collision with root package name */
                private int f50049b;

                /* renamed from: d  reason: collision with root package name */
                private int f50051d;

                /* renamed from: c  reason: collision with root package name */
                private int f50050c = 1;

                /* renamed from: e  reason: collision with root package name */
                private Object f50052e = "";

                /* renamed from: f  reason: collision with root package name */
                private EnumC1106c f50053f = EnumC1106c.NONE;

                /* renamed from: g  reason: collision with root package name */
                private List<Integer> f50054g = Collections.emptyList();

                /* renamed from: h  reason: collision with root package name */
                private List<Integer> f50055h = Collections.emptyList();

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
                    if ((this.f50049b & 32) != 32) {
                        this.f50055h = new ArrayList(this.f50055h);
                        this.f50049b |= 32;
                    }
                }

                private void n() {
                    if ((this.f50049b & 16) != 16) {
                        this.f50054g = new ArrayList(this.f50054g);
                        this.f50049b |= 16;
                    }
                }

                private void o() {
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
                    int i11 = this.f50049b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    cVar.f50039c = this.f50050c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    cVar.f50040d = this.f50051d;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    cVar.f50041e = this.f50052e;
                    if ((i11 & 8) == 8) {
                        i12 |= 8;
                    }
                    cVar.f50042f = this.f50053f;
                    if ((this.f50049b & 16) == 16) {
                        this.f50054g = Collections.unmodifiableList(this.f50054g);
                        this.f50049b &= -17;
                    }
                    cVar.f50043g = this.f50054g;
                    if ((this.f50049b & 32) == 32) {
                        this.f50055h = Collections.unmodifiableList(this.f50055h);
                        this.f50049b &= -33;
                    }
                    cVar.f50045i = this.f50055h;
                    cVar.f50038b = i12;
                    return cVar;
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
                public s10.a.e.c.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<s10.a$e$c> r1 = s10.a.e.c.f50036n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        s10.a$e$c r3 = (s10.a.e.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        s10.a$e$c r4 = (s10.a.e.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: s10.a.e.c.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):s10.a$e$c$b");
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: q */
                public b f(c cVar) {
                    if (cVar == c.w()) {
                        return this;
                    }
                    if (cVar.J()) {
                        t(cVar.z());
                    }
                    if (cVar.I()) {
                        s(cVar.y());
                    }
                    if (cVar.K()) {
                        this.f50049b |= 4;
                        this.f50052e = cVar.f50041e;
                    }
                    if (cVar.H()) {
                        r(cVar.x());
                    }
                    if (!cVar.f50043g.isEmpty()) {
                        if (this.f50054g.isEmpty()) {
                            this.f50054g = cVar.f50043g;
                            this.f50049b &= -17;
                        } else {
                            n();
                            this.f50054g.addAll(cVar.f50043g);
                        }
                    }
                    if (!cVar.f50045i.isEmpty()) {
                        if (this.f50055h.isEmpty()) {
                            this.f50055h = cVar.f50045i;
                            this.f50049b &= -33;
                        } else {
                            m();
                            this.f50055h.addAll(cVar.f50045i);
                        }
                    }
                    g(e().c(cVar.f50037a));
                    return this;
                }

                public b r(EnumC1106c enumC1106c) {
                    Objects.requireNonNull(enumC1106c);
                    this.f50049b |= 8;
                    this.f50053f = enumC1106c;
                    return this;
                }

                public b s(int i11) {
                    this.f50049b |= 2;
                    this.f50051d = i11;
                    return this;
                }

                public b t(int i11) {
                    this.f50049b |= 1;
                    this.f50050c = i11;
                    return this;
                }
            }

            /* renamed from: s10.a$e$c$c  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public enum EnumC1106c implements i.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                
                private static i.b<EnumC1106c> internalValueMap = new C1107a();
                private final int value;

                /* renamed from: s10.a$e$c$c$a  reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                static class C1107a implements i.b<EnumC1106c> {
                    C1107a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    /* renamed from: a */
                    public EnumC1106c findValueByNumber(int i11) {
                        return EnumC1106c.valueOf(i11);
                    }
                }

                EnumC1106c(int i11, int i12) {
                    this.value = i12;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC1106c valueOf(int i11) {
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                return null;
                            }
                            return DESC_TO_CLASS_ID;
                        }
                        return INTERNAL_TO_CLASS_ID;
                    }
                    return NONE;
                }
            }

            static {
                c cVar = new c(true);
                f50035m = cVar;
                cVar.L();
            }

            private void L() {
                this.f50039c = 1;
                this.f50040d = 0;
                this.f50041e = "";
                this.f50042f = EnumC1106c.NONE;
                this.f50043g = Collections.emptyList();
                this.f50045i = Collections.emptyList();
            }

            public static b M() {
                return b.h();
            }

            public static b N(c cVar) {
                return M().f(cVar);
            }

            public static c w() {
                return f50035m;
            }

            public int A() {
                return this.f50045i.size();
            }

            public List<Integer> B() {
                return this.f50045i;
            }

            public String C() {
                Object obj = this.f50041e;
                if (obj instanceof String) {
                    return (String) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                String w11 = dVar.w();
                if (dVar.n()) {
                    this.f50041e = w11;
                }
                return w11;
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.d E() {
                Object obj = this.f50041e;
                if (obj instanceof String) {
                    kotlin.reflect.jvm.internal.impl.protobuf.d h11 = kotlin.reflect.jvm.internal.impl.protobuf.d.h((String) obj);
                    this.f50041e = h11;
                    return h11;
                }
                return (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
            }

            public int F() {
                return this.f50043g.size();
            }

            public List<Integer> G() {
                return this.f50043g;
            }

            public boolean H() {
                return (this.f50038b & 8) == 8;
            }

            public boolean I() {
                return (this.f50038b & 2) == 2;
            }

            public boolean J() {
                return (this.f50038b & 1) == 1;
            }

            public boolean K() {
                return (this.f50038b & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: O */
            public b newBuilderForType() {
                return M();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: P */
            public b toBuilder() {
                return N(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void a(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f50038b & 1) == 1) {
                    codedOutputStream.a0(1, this.f50039c);
                }
                if ((this.f50038b & 2) == 2) {
                    codedOutputStream.a0(2, this.f50040d);
                }
                if ((this.f50038b & 8) == 8) {
                    codedOutputStream.S(3, this.f50042f.getNumber());
                }
                if (G().size() > 0) {
                    codedOutputStream.o0(34);
                    codedOutputStream.o0(this.f50044h);
                }
                for (int i11 = 0; i11 < this.f50043g.size(); i11++) {
                    codedOutputStream.b0(this.f50043g.get(i11).intValue());
                }
                if (B().size() > 0) {
                    codedOutputStream.o0(42);
                    codedOutputStream.o0(this.f50046j);
                }
                for (int i12 = 0; i12 < this.f50045i.size(); i12++) {
                    codedOutputStream.b0(this.f50045i.get(i12).intValue());
                }
                if ((this.f50038b & 4) == 4) {
                    codedOutputStream.O(6, E());
                }
                codedOutputStream.i0(this.f50037a);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public kotlin.reflect.jvm.internal.impl.protobuf.q<c> getParserForType() {
                return f50036n;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int getSerializedSize() {
                int i11 = this.f50048l;
                if (i11 != -1) {
                    return i11;
                }
                int o11 = (this.f50038b & 1) == 1 ? CodedOutputStream.o(1, this.f50039c) + 0 : 0;
                if ((this.f50038b & 2) == 2) {
                    o11 += CodedOutputStream.o(2, this.f50040d);
                }
                if ((this.f50038b & 8) == 8) {
                    o11 += CodedOutputStream.h(3, this.f50042f.getNumber());
                }
                int i12 = 0;
                for (int i13 = 0; i13 < this.f50043g.size(); i13++) {
                    i12 += CodedOutputStream.p(this.f50043g.get(i13).intValue());
                }
                int i14 = o11 + i12;
                if (!G().isEmpty()) {
                    i14 = i14 + 1 + CodedOutputStream.p(i12);
                }
                this.f50044h = i12;
                int i15 = 0;
                for (int i16 = 0; i16 < this.f50045i.size(); i16++) {
                    i15 += CodedOutputStream.p(this.f50045i.get(i16).intValue());
                }
                int i17 = i14 + i15;
                if (!B().isEmpty()) {
                    i17 = i17 + 1 + CodedOutputStream.p(i15);
                }
                this.f50046j = i15;
                if ((this.f50038b & 4) == 4) {
                    i17 += CodedOutputStream.d(6, E());
                }
                int size = i17 + this.f50037a.size();
                this.f50048l = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean isInitialized() {
                byte b11 = this.f50047k;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                this.f50047k = (byte) 1;
                return true;
            }

            public EnumC1106c x() {
                return this.f50042f;
            }

            public int y() {
                return this.f50040d;
            }

            public int z() {
                return this.f50039c;
            }

            private c(h.b bVar) {
                super(bVar);
                this.f50044h = -1;
                this.f50046j = -1;
                this.f50047k = (byte) -1;
                this.f50048l = -1;
                this.f50037a = bVar.e();
            }

            private c(boolean z11) {
                this.f50044h = -1;
                this.f50046j = -1;
                this.f50047k = (byte) -1;
                this.f50048l = -1;
                this.f50037a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
            }

            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                this.f50044h = -1;
                this.f50046j = -1;
                this.f50047k = (byte) -1;
                this.f50048l = -1;
                L();
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
                                    this.f50038b |= 1;
                                    this.f50039c = eVar.s();
                                } else if (K == 16) {
                                    this.f50038b |= 2;
                                    this.f50040d = eVar.s();
                                } else if (K == 24) {
                                    int n11 = eVar.n();
                                    EnumC1106c valueOf = EnumC1106c.valueOf(n11);
                                    if (valueOf == null) {
                                        J.o0(K);
                                        J.o0(n11);
                                    } else {
                                        this.f50038b |= 8;
                                        this.f50042f = valueOf;
                                    }
                                } else if (K == 32) {
                                    if (!(z12 & true)) {
                                        this.f50043g = new ArrayList();
                                        z12 |= true;
                                    }
                                    this.f50043g.add(Integer.valueOf(eVar.s()));
                                } else if (K == 34) {
                                    int j11 = eVar.j(eVar.A());
                                    if (!(z12 & true) && eVar.e() > 0) {
                                        this.f50043g = new ArrayList();
                                        z12 |= true;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f50043g.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j11);
                                } else if (K == 40) {
                                    if (!(z12 & true)) {
                                        this.f50045i = new ArrayList();
                                        z12 |= true;
                                    }
                                    this.f50045i.add(Integer.valueOf(eVar.s()));
                                } else if (K == 42) {
                                    int j12 = eVar.j(eVar.A());
                                    if (!(z12 & true) && eVar.e() > 0) {
                                        this.f50045i = new ArrayList();
                                        z12 |= true;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f50045i.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j12);
                                } else if (K != 50) {
                                    if (!j(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    kotlin.reflect.jvm.internal.impl.protobuf.d l11 = eVar.l();
                                    this.f50038b |= 4;
                                    this.f50041e = l11;
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
                            this.f50043g = Collections.unmodifiableList(this.f50043g);
                        }
                        if (z12 & true) {
                            this.f50045i = Collections.unmodifiableList(this.f50045i);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f50037a = q11.l();
                            throw th3;
                        }
                        this.f50037a = q11.l();
                        g();
                        throw th2;
                    }
                }
                if (z12 & true) {
                    this.f50043g = Collections.unmodifiableList(this.f50043g);
                }
                if (z12 & true) {
                    this.f50045i = Collections.unmodifiableList(this.f50045i);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f50037a = q11.l();
                    throw th4;
                }
                this.f50037a = q11.l();
                g();
            }
        }

        private e(h.b bVar) {
            super(bVar);
            this.f50029d = -1;
            this.f50030e = (byte) -1;
            this.f50031f = -1;
            this.f50026a = bVar.e();
        }

        private e(boolean z11) {
            this.f50029d = -1;
            this.f50030e = (byte) -1;
            this.f50031f = -1;
            this.f50026a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f50029d = -1;
            this.f50030e = (byte) -1;
            this.f50031f = -1;
            t();
            d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                if (!(z12 & true)) {
                                    this.f50027b = new ArrayList();
                                    z12 |= true;
                                }
                                this.f50027b.add(eVar.u(c.f50036n, fVar));
                            } else if (K == 40) {
                                if (!(z12 & true)) {
                                    this.f50028c = new ArrayList();
                                    z12 |= true;
                                }
                                this.f50028c.add(Integer.valueOf(eVar.s()));
                            } else if (K != 42) {
                                if (!j(eVar, J, fVar, K)) {
                                }
                            } else {
                                int j11 = eVar.j(eVar.A());
                                if (!(z12 & true) && eVar.e() > 0) {
                                    this.f50028c = new ArrayList();
                                    z12 |= true;
                                }
                                while (eVar.e() > 0) {
                                    this.f50028c.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j11);
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
                        this.f50027b = Collections.unmodifiableList(this.f50027b);
                    }
                    if (z12 & true) {
                        this.f50028c = Collections.unmodifiableList(this.f50028c);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f50026a = q11.l();
                        throw th3;
                    }
                    this.f50026a = q11.l();
                    g();
                    throw th2;
                }
            }
            if (z12 & true) {
                this.f50027b = Collections.unmodifiableList(this.f50027b);
            }
            if (z12 & true) {
                this.f50028c = Collections.unmodifiableList(this.f50028c);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f50026a = q11.l();
                throw th4;
            }
            this.f50026a = q11.l();
            g();
        }
    }

    static {
        p10.d B = p10.d.B();
        c p11 = c.p();
        c p12 = c.p();
        w.b bVar = w.b.MESSAGE;
        f49973a = h.i(B, p11, p12, null, 100, bVar, c.class);
        f49974b = h.i(p10.i.N(), c.p(), c.p(), null, 100, bVar, c.class);
        p10.i N = p10.i.N();
        w.b bVar2 = w.b.INT32;
        f49975c = h.i(N, 0, null, null, 101, bVar2, Integer.class);
        f49976d = h.i(n.L(), d.r(), d.r(), null, 100, bVar, d.class);
        f49977e = h.i(n.L(), 0, null, null, 101, bVar2, Integer.class);
        f49978f = h.h(q.S(), p10.b.t(), null, 100, bVar, false, p10.b.class);
        f49979g = h.i(q.S(), Boolean.FALSE, null, null, 101, w.b.BOOL, Boolean.class);
        f49980h = h.h(s.F(), p10.b.t(), null, 100, bVar, false, p10.b.class);
        f49981i = h.i(p10.c.f0(), 0, null, null, 101, bVar2, Integer.class);
        f49982j = h.h(p10.c.f0(), n.L(), null, 102, bVar, false, n.class);
        f49983k = h.i(p10.c.f0(), 0, null, null, 103, bVar2, Integer.class);
        f49984l = h.i(p10.c.f0(), 0, null, null, 104, bVar2, Integer.class);
        f49985m = h.i(l.F(), 0, null, null, 101, bVar2, Integer.class);
        f49986n = h.h(l.F(), n.L(), null, 102, bVar, false, n.class);
    }

    public static void a(f fVar) {
        fVar.a(f49973a);
        fVar.a(f49974b);
        fVar.a(f49975c);
        fVar.a(f49976d);
        fVar.a(f49977e);
        fVar.a(f49978f);
        fVar.a(f49979g);
        fVar.a(f49980h);
        fVar.a(f49981i);
        fVar.a(f49982j);
        fVar.a(f49983k);
        fVar.a(f49984l);
        fVar.a(f49985m);
        fVar.a(f49986n);
    }

    /* loaded from: classes5.dex */
    public static final class b extends h implements p {

        /* renamed from: g  reason: collision with root package name */
        private static final b f49987g;

        /* renamed from: h  reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<b> f49988h = new C1100a();

        /* renamed from: a  reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f49989a;

        /* renamed from: b  reason: collision with root package name */
        private int f49990b;

        /* renamed from: c  reason: collision with root package name */
        private int f49991c;

        /* renamed from: d  reason: collision with root package name */
        private int f49992d;

        /* renamed from: e  reason: collision with root package name */
        private byte f49993e;

        /* renamed from: f  reason: collision with root package name */
        private int f49994f;

        /* renamed from: s10.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static class C1100a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
            C1100a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new b(eVar, fVar);
            }
        }

        /* renamed from: s10.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1101b extends h.b<b, C1101b> implements p {

            /* renamed from: b  reason: collision with root package name */
            private int f49995b;

            /* renamed from: c  reason: collision with root package name */
            private int f49996c;

            /* renamed from: d  reason: collision with root package name */
            private int f49997d;

            private C1101b() {
                m();
            }

            static /* synthetic */ C1101b h() {
                return l();
            }

            private static C1101b l() {
                return new C1101b();
            }

            private void m() {
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
                int i11 = this.f49995b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                bVar.f49991c = this.f49996c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                bVar.f49992d = this.f49997d;
                bVar.f49990b = i12;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: k */
            public C1101b d() {
                return l().f(j());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public s10.a.b.C1101b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<s10.a$b> r1 = s10.a.b.f49988h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    s10.a$b r3 = (s10.a.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    s10.a$b r4 = (s10.a.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: s10.a.b.C1101b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):s10.a$b$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: o */
            public C1101b f(b bVar) {
                if (bVar == b.p()) {
                    return this;
                }
                if (bVar.t()) {
                    q(bVar.r());
                }
                if (bVar.s()) {
                    p(bVar.q());
                }
                g(e().c(bVar.f49989a));
                return this;
            }

            public C1101b p(int i11) {
                this.f49995b |= 2;
                this.f49997d = i11;
                return this;
            }

            public C1101b q(int i11) {
                this.f49995b |= 1;
                this.f49996c = i11;
                return this;
            }
        }

        static {
            b bVar = new b(true);
            f49987g = bVar;
            bVar.u();
        }

        public static b p() {
            return f49987g;
        }

        private void u() {
            this.f49991c = 0;
            this.f49992d = 0;
        }

        public static C1101b v() {
            return C1101b.h();
        }

        public static C1101b w(b bVar) {
            return v().f(bVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f49990b & 1) == 1) {
                codedOutputStream.a0(1, this.f49991c);
            }
            if ((this.f49990b & 2) == 2) {
                codedOutputStream.a0(2, this.f49992d);
            }
            codedOutputStream.i0(this.f49989a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<b> getParserForType() {
            return f49988h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int getSerializedSize() {
            int i11 = this.f49994f;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.f49990b & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f49991c) : 0;
            if ((this.f49990b & 2) == 2) {
                o11 += CodedOutputStream.o(2, this.f49992d);
            }
            int size = o11 + this.f49989a.size();
            this.f49994f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b11 = this.f49993e;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f49993e = (byte) 1;
            return true;
        }

        public int q() {
            return this.f49992d;
        }

        public int r() {
            return this.f49991c;
        }

        public boolean s() {
            return (this.f49990b & 2) == 2;
        }

        public boolean t() {
            return (this.f49990b & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: x */
        public C1101b newBuilderForType() {
            return v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: y */
        public C1101b toBuilder() {
            return w(this);
        }

        private b(h.b bVar) {
            super(bVar);
            this.f49993e = (byte) -1;
            this.f49994f = -1;
            this.f49989a = bVar.e();
        }

        private b(boolean z11) {
            this.f49993e = (byte) -1;
            this.f49994f = -1;
            this.f49989a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
        }

        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f49993e = (byte) -1;
            this.f49994f = -1;
            u();
            d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f49990b |= 1;
                                this.f49991c = eVar.s();
                            } else if (K != 16) {
                                if (!j(eVar, J, fVar, K)) {
                                }
                            } else {
                                this.f49990b |= 2;
                                this.f49992d = eVar.s();
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
                        this.f49989a = q11.l();
                        throw th3;
                    }
                    this.f49989a = q11.l();
                    g();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f49989a = q11.l();
                throw th4;
            }
            this.f49989a = q11.l();
            g();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends h implements p {

        /* renamed from: g  reason: collision with root package name */
        private static final c f49998g;

        /* renamed from: h  reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> f49999h = new C1102a();

        /* renamed from: a  reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f50000a;

        /* renamed from: b  reason: collision with root package name */
        private int f50001b;

        /* renamed from: c  reason: collision with root package name */
        private int f50002c;

        /* renamed from: d  reason: collision with root package name */
        private int f50003d;

        /* renamed from: e  reason: collision with root package name */
        private byte f50004e;

        /* renamed from: f  reason: collision with root package name */
        private int f50005f;

        /* renamed from: s10.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static class C1102a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
            C1102a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m */
            public c c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new c(eVar, fVar);
            }
        }

        /* loaded from: classes5.dex */
        public static final class b extends h.b<c, b> implements p {

            /* renamed from: b  reason: collision with root package name */
            private int f50006b;

            /* renamed from: c  reason: collision with root package name */
            private int f50007c;

            /* renamed from: d  reason: collision with root package name */
            private int f50008d;

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
                int i11 = this.f50006b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                cVar.f50002c = this.f50007c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                cVar.f50003d = this.f50008d;
                cVar.f50001b = i12;
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
            public s10.a.c.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<s10.a$c> r1 = s10.a.c.f49999h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    s10.a$c r3 = (s10.a.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    s10.a$c r4 = (s10.a.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: s10.a.c.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):s10.a$c$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: o */
            public b f(c cVar) {
                if (cVar == c.p()) {
                    return this;
                }
                if (cVar.t()) {
                    q(cVar.r());
                }
                if (cVar.s()) {
                    p(cVar.q());
                }
                g(e().c(cVar.f50000a));
                return this;
            }

            public b p(int i11) {
                this.f50006b |= 2;
                this.f50008d = i11;
                return this;
            }

            public b q(int i11) {
                this.f50006b |= 1;
                this.f50007c = i11;
                return this;
            }
        }

        static {
            c cVar = new c(true);
            f49998g = cVar;
            cVar.u();
        }

        public static c p() {
            return f49998g;
        }

        private void u() {
            this.f50002c = 0;
            this.f50003d = 0;
        }

        public static b v() {
            return b.h();
        }

        public static b w(c cVar) {
            return v().f(cVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f50001b & 1) == 1) {
                codedOutputStream.a0(1, this.f50002c);
            }
            if ((this.f50001b & 2) == 2) {
                codedOutputStream.a0(2, this.f50003d);
            }
            codedOutputStream.i0(this.f50000a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<c> getParserForType() {
            return f49999h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int getSerializedSize() {
            int i11 = this.f50005f;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.f50001b & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f50002c) : 0;
            if ((this.f50001b & 2) == 2) {
                o11 += CodedOutputStream.o(2, this.f50003d);
            }
            int size = o11 + this.f50000a.size();
            this.f50005f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b11 = this.f50004e;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f50004e = (byte) 1;
            return true;
        }

        public int q() {
            return this.f50003d;
        }

        public int r() {
            return this.f50002c;
        }

        public boolean s() {
            return (this.f50001b & 2) == 2;
        }

        public boolean t() {
            return (this.f50001b & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: x */
        public b newBuilderForType() {
            return v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: y */
        public b toBuilder() {
            return w(this);
        }

        private c(h.b bVar) {
            super(bVar);
            this.f50004e = (byte) -1;
            this.f50005f = -1;
            this.f50000a = bVar.e();
        }

        private c(boolean z11) {
            this.f50004e = (byte) -1;
            this.f50005f = -1;
            this.f50000a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f50004e = (byte) -1;
            this.f50005f = -1;
            u();
            d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f50001b |= 1;
                                this.f50002c = eVar.s();
                            } else if (K != 16) {
                                if (!j(eVar, J, fVar, K)) {
                                }
                            } else {
                                this.f50001b |= 2;
                                this.f50003d = eVar.s();
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
                        this.f50000a = q11.l();
                        throw th3;
                    }
                    this.f50000a = q11.l();
                    g();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f50000a = q11.l();
                throw th4;
            }
            this.f50000a = q11.l();
            g();
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends h implements p {

        /* renamed from: i  reason: collision with root package name */
        private static final d f50009i;

        /* renamed from: j  reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<d> f50010j = new C1103a();

        /* renamed from: a  reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f50011a;

        /* renamed from: b  reason: collision with root package name */
        private int f50012b;

        /* renamed from: c  reason: collision with root package name */
        private b f50013c;

        /* renamed from: d  reason: collision with root package name */
        private c f50014d;

        /* renamed from: e  reason: collision with root package name */
        private c f50015e;

        /* renamed from: f  reason: collision with root package name */
        private c f50016f;

        /* renamed from: g  reason: collision with root package name */
        private byte f50017g;

        /* renamed from: h  reason: collision with root package name */
        private int f50018h;

        /* renamed from: s10.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static class C1103a extends kotlin.reflect.jvm.internal.impl.protobuf.b<d> {
            C1103a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m */
            public d c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new d(eVar, fVar);
            }
        }

        /* loaded from: classes5.dex */
        public static final class b extends h.b<d, b> implements p {

            /* renamed from: b  reason: collision with root package name */
            private int f50019b;

            /* renamed from: c  reason: collision with root package name */
            private b f50020c = b.p();

            /* renamed from: d  reason: collision with root package name */
            private c f50021d = c.p();

            /* renamed from: e  reason: collision with root package name */
            private c f50022e = c.p();

            /* renamed from: f  reason: collision with root package name */
            private c f50023f = c.p();

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
            public d build() {
                d j11 = j();
                if (j11.isInitialized()) {
                    return j11;
                }
                throw a.AbstractC0651a.c(j11);
            }

            public d j() {
                d dVar = new d(this);
                int i11 = this.f50019b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                dVar.f50013c = this.f50020c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                dVar.f50014d = this.f50021d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                dVar.f50015e = this.f50022e;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                dVar.f50016f = this.f50023f;
                dVar.f50012b = i12;
                return dVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: k */
            public b d() {
                return l().f(j());
            }

            public b n(b bVar) {
                if ((this.f50019b & 1) == 1 && this.f50020c != b.p()) {
                    this.f50020c = b.w(this.f50020c).f(bVar).j();
                } else {
                    this.f50020c = bVar;
                }
                this.f50019b |= 1;
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public s10.a.d.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<s10.a$d> r1 = s10.a.d.f50010j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    s10.a$d r3 = (s10.a.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    s10.a$d r4 = (s10.a.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: s10.a.d.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):s10.a$d$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: p */
            public b f(d dVar) {
                if (dVar == d.r()) {
                    return this;
                }
                if (dVar.w()) {
                    n(dVar.s());
                }
                if (dVar.z()) {
                    s(dVar.v());
                }
                if (dVar.x()) {
                    q(dVar.t());
                }
                if (dVar.y()) {
                    r(dVar.u());
                }
                g(e().c(dVar.f50011a));
                return this;
            }

            public b q(c cVar) {
                if ((this.f50019b & 4) == 4 && this.f50022e != c.p()) {
                    this.f50022e = c.w(this.f50022e).f(cVar).j();
                } else {
                    this.f50022e = cVar;
                }
                this.f50019b |= 4;
                return this;
            }

            public b r(c cVar) {
                if ((this.f50019b & 8) == 8 && this.f50023f != c.p()) {
                    this.f50023f = c.w(this.f50023f).f(cVar).j();
                } else {
                    this.f50023f = cVar;
                }
                this.f50019b |= 8;
                return this;
            }

            public b s(c cVar) {
                if ((this.f50019b & 2) == 2 && this.f50021d != c.p()) {
                    this.f50021d = c.w(this.f50021d).f(cVar).j();
                } else {
                    this.f50021d = cVar;
                }
                this.f50019b |= 2;
                return this;
            }
        }

        static {
            d dVar = new d(true);
            f50009i = dVar;
            dVar.A();
        }

        private void A() {
            this.f50013c = b.p();
            this.f50014d = c.p();
            this.f50015e = c.p();
            this.f50016f = c.p();
        }

        public static b B() {
            return b.h();
        }

        public static b C(d dVar) {
            return B().f(dVar);
        }

        public static d r() {
            return f50009i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: E */
        public b newBuilderForType() {
            return B();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: F */
        public b toBuilder() {
            return C(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f50012b & 1) == 1) {
                codedOutputStream.d0(1, this.f50013c);
            }
            if ((this.f50012b & 2) == 2) {
                codedOutputStream.d0(2, this.f50014d);
            }
            if ((this.f50012b & 4) == 4) {
                codedOutputStream.d0(3, this.f50015e);
            }
            if ((this.f50012b & 8) == 8) {
                codedOutputStream.d0(4, this.f50016f);
            }
            codedOutputStream.i0(this.f50011a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<d> getParserForType() {
            return f50010j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int getSerializedSize() {
            int i11 = this.f50018h;
            if (i11 != -1) {
                return i11;
            }
            int s11 = (this.f50012b & 1) == 1 ? 0 + CodedOutputStream.s(1, this.f50013c) : 0;
            if ((this.f50012b & 2) == 2) {
                s11 += CodedOutputStream.s(2, this.f50014d);
            }
            if ((this.f50012b & 4) == 4) {
                s11 += CodedOutputStream.s(3, this.f50015e);
            }
            if ((this.f50012b & 8) == 8) {
                s11 += CodedOutputStream.s(4, this.f50016f);
            }
            int size = s11 + this.f50011a.size();
            this.f50018h = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b11 = this.f50017g;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f50017g = (byte) 1;
            return true;
        }

        public b s() {
            return this.f50013c;
        }

        public c t() {
            return this.f50015e;
        }

        public c u() {
            return this.f50016f;
        }

        public c v() {
            return this.f50014d;
        }

        public boolean w() {
            return (this.f50012b & 1) == 1;
        }

        public boolean x() {
            return (this.f50012b & 4) == 4;
        }

        public boolean y() {
            return (this.f50012b & 8) == 8;
        }

        public boolean z() {
            return (this.f50012b & 2) == 2;
        }

        private d(h.b bVar) {
            super(bVar);
            this.f50017g = (byte) -1;
            this.f50018h = -1;
            this.f50011a = bVar.e();
        }

        private d(boolean z11) {
            this.f50017g = (byte) -1;
            this.f50018h = -1;
            this.f50011a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
        }

        private d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f50017g = (byte) -1;
            this.f50018h = -1;
            A();
            d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                b.C1101b builder = (this.f50012b & 1) == 1 ? this.f50013c.toBuilder() : null;
                                b bVar = (b) eVar.u(b.f49988h, fVar);
                                this.f50013c = bVar;
                                if (builder != null) {
                                    builder.f(bVar);
                                    this.f50013c = builder.j();
                                }
                                this.f50012b |= 1;
                            } else if (K == 18) {
                                c.b builder2 = (this.f50012b & 2) == 2 ? this.f50014d.toBuilder() : null;
                                c cVar = (c) eVar.u(c.f49999h, fVar);
                                this.f50014d = cVar;
                                if (builder2 != null) {
                                    builder2.f(cVar);
                                    this.f50014d = builder2.j();
                                }
                                this.f50012b |= 2;
                            } else if (K == 26) {
                                c.b builder3 = (this.f50012b & 4) == 4 ? this.f50015e.toBuilder() : null;
                                c cVar2 = (c) eVar.u(c.f49999h, fVar);
                                this.f50015e = cVar2;
                                if (builder3 != null) {
                                    builder3.f(cVar2);
                                    this.f50015e = builder3.j();
                                }
                                this.f50012b |= 4;
                            } else if (K != 34) {
                                if (!j(eVar, J, fVar, K)) {
                                }
                            } else {
                                c.b builder4 = (this.f50012b & 8) == 8 ? this.f50016f.toBuilder() : null;
                                c cVar3 = (c) eVar.u(c.f49999h, fVar);
                                this.f50016f = cVar3;
                                if (builder4 != null) {
                                    builder4.f(cVar3);
                                    this.f50016f = builder4.j();
                                }
                                this.f50012b |= 8;
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
                        this.f50011a = q11.l();
                        throw th3;
                    }
                    this.f50011a = q11.l();
                    g();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f50011a = q11.l();
                throw th4;
            }
            this.f50011a = q11.l();
            g();
        }
    }
}