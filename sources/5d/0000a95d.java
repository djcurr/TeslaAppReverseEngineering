package p10;

import androidx.recyclerview.widget.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import p10.e;
import p10.q;
import p10.t;

/* loaded from: classes5.dex */
public final class i extends h.d<i> {

    /* renamed from: t  reason: collision with root package name */
    private static final i f45619t;

    /* renamed from: w  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<i> f45620w = new a();

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45621b;

    /* renamed from: c  reason: collision with root package name */
    private int f45622c;

    /* renamed from: d  reason: collision with root package name */
    private int f45623d;

    /* renamed from: e  reason: collision with root package name */
    private int f45624e;

    /* renamed from: f  reason: collision with root package name */
    private int f45625f;

    /* renamed from: g  reason: collision with root package name */
    private q f45626g;

    /* renamed from: h  reason: collision with root package name */
    private int f45627h;

    /* renamed from: i  reason: collision with root package name */
    private List<s> f45628i;

    /* renamed from: j  reason: collision with root package name */
    private q f45629j;

    /* renamed from: k  reason: collision with root package name */
    private int f45630k;

    /* renamed from: l  reason: collision with root package name */
    private List<u> f45631l;

    /* renamed from: m  reason: collision with root package name */
    private t f45632m;

    /* renamed from: n  reason: collision with root package name */
    private List<Integer> f45633n;

    /* renamed from: o  reason: collision with root package name */
    private e f45634o;

    /* renamed from: p  reason: collision with root package name */
    private byte f45635p;

    /* renamed from: q  reason: collision with root package name */
    private int f45636q;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<i> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public i c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new i(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.c<i, b> {

        /* renamed from: d  reason: collision with root package name */
        private int f45637d;

        /* renamed from: g  reason: collision with root package name */
        private int f45640g;

        /* renamed from: i  reason: collision with root package name */
        private int f45642i;

        /* renamed from: l  reason: collision with root package name */
        private int f45645l;

        /* renamed from: e  reason: collision with root package name */
        private int f45638e = 6;

        /* renamed from: f  reason: collision with root package name */
        private int f45639f = 6;

        /* renamed from: h  reason: collision with root package name */
        private q f45641h = q.S();

        /* renamed from: j  reason: collision with root package name */
        private List<s> f45643j = Collections.emptyList();

        /* renamed from: k  reason: collision with root package name */
        private q f45644k = q.S();

        /* renamed from: m  reason: collision with root package name */
        private List<u> f45646m = Collections.emptyList();

        /* renamed from: n  reason: collision with root package name */
        private t f45647n = t.q();

        /* renamed from: o  reason: collision with root package name */
        private List<Integer> f45648o = Collections.emptyList();

        /* renamed from: p  reason: collision with root package name */
        private e f45649p = e.o();

        private b() {
            t();
        }

        static /* synthetic */ b l() {
            return p();
        }

        private static b p() {
            return new b();
        }

        private void q() {
            if ((this.f45637d & 32) != 32) {
                this.f45643j = new ArrayList(this.f45643j);
                this.f45637d |= 32;
            }
        }

        private void r() {
            if ((this.f45637d & 256) != 256) {
                this.f45646m = new ArrayList(this.f45646m);
                this.f45637d |= 256;
            }
        }

        private void s() {
            if ((this.f45637d & 1024) != 1024) {
                this.f45648o = new ArrayList(this.f45648o);
                this.f45637d |= 1024;
            }
        }

        private void t() {
        }

        public b A(int i11) {
            this.f45637d |= 1;
            this.f45638e = i11;
            return this;
        }

        public b B(int i11) {
            this.f45637d |= 4;
            this.f45640g = i11;
            return this;
        }

        public b C(int i11) {
            this.f45637d |= 2;
            this.f45639f = i11;
            return this;
        }

        public b E(int i11) {
            this.f45637d |= 128;
            this.f45645l = i11;
            return this;
        }

        public b F(int i11) {
            this.f45637d |= 16;
            this.f45642i = i11;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: m */
        public i build() {
            i n11 = n();
            if (n11.isInitialized()) {
                return n11;
            }
            throw a.AbstractC0651a.c(n11);
        }

        public i n() {
            i iVar = new i(this);
            int i11 = this.f45637d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            iVar.f45623d = this.f45638e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            iVar.f45624e = this.f45639f;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            iVar.f45625f = this.f45640g;
            if ((i11 & 8) == 8) {
                i12 |= 8;
            }
            iVar.f45626g = this.f45641h;
            if ((i11 & 16) == 16) {
                i12 |= 16;
            }
            iVar.f45627h = this.f45642i;
            if ((this.f45637d & 32) == 32) {
                this.f45643j = Collections.unmodifiableList(this.f45643j);
                this.f45637d &= -33;
            }
            iVar.f45628i = this.f45643j;
            if ((i11 & 64) == 64) {
                i12 |= 32;
            }
            iVar.f45629j = this.f45644k;
            if ((i11 & 128) == 128) {
                i12 |= 64;
            }
            iVar.f45630k = this.f45645l;
            if ((this.f45637d & 256) == 256) {
                this.f45646m = Collections.unmodifiableList(this.f45646m);
                this.f45637d &= -257;
            }
            iVar.f45631l = this.f45646m;
            if ((i11 & 512) == 512) {
                i12 |= 128;
            }
            iVar.f45632m = this.f45647n;
            if ((this.f45637d & 1024) == 1024) {
                this.f45648o = Collections.unmodifiableList(this.f45648o);
                this.f45637d &= -1025;
            }
            iVar.f45633n = this.f45648o;
            if ((i11 & 2048) == 2048) {
                i12 |= 256;
            }
            iVar.f45634o = this.f45649p;
            iVar.f45622c = i12;
            return iVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: o */
        public b d() {
            return p().f(n());
        }

        public b u(e eVar) {
            if ((this.f45637d & 2048) == 2048 && this.f45649p != e.o()) {
                this.f45649p = e.t(this.f45649p).f(eVar).j();
            } else {
                this.f45649p = eVar;
            }
            this.f45637d |= 2048;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: v */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.i.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.i> r1 = p10.i.f45620w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.i r3 = (p10.i) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.i r4 = (p10.i) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.i.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.i$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: w */
        public b f(i iVar) {
            if (iVar == i.N()) {
                return this;
            }
            if (iVar.f0()) {
                A(iVar.P());
            }
            if (iVar.h0()) {
                C(iVar.R());
            }
            if (iVar.g0()) {
                B(iVar.Q());
            }
            if (iVar.k0()) {
                y(iVar.U());
            }
            if (iVar.l0()) {
                F(iVar.V());
            }
            if (!iVar.f45628i.isEmpty()) {
                if (this.f45643j.isEmpty()) {
                    this.f45643j = iVar.f45628i;
                    this.f45637d &= -33;
                } else {
                    q();
                    this.f45643j.addAll(iVar.f45628i);
                }
            }
            if (iVar.i0()) {
                x(iVar.S());
            }
            if (iVar.j0()) {
                E(iVar.T());
            }
            if (!iVar.f45631l.isEmpty()) {
                if (this.f45646m.isEmpty()) {
                    this.f45646m = iVar.f45631l;
                    this.f45637d &= -257;
                } else {
                    r();
                    this.f45646m.addAll(iVar.f45631l);
                }
            }
            if (iVar.m0()) {
                z(iVar.Z());
            }
            if (!iVar.f45633n.isEmpty()) {
                if (this.f45648o.isEmpty()) {
                    this.f45648o = iVar.f45633n;
                    this.f45637d &= -1025;
                } else {
                    s();
                    this.f45648o.addAll(iVar.f45633n);
                }
            }
            if (iVar.e0()) {
                u(iVar.M());
            }
            k(iVar);
            g(e().c(iVar.f45621b));
            return this;
        }

        public b x(q qVar) {
            if ((this.f45637d & 64) == 64 && this.f45644k != q.S()) {
                this.f45644k = q.t0(this.f45644k).f(qVar).n();
            } else {
                this.f45644k = qVar;
            }
            this.f45637d |= 64;
            return this;
        }

        public b y(q qVar) {
            if ((this.f45637d & 8) == 8 && this.f45641h != q.S()) {
                this.f45641h = q.t0(this.f45641h).f(qVar).n();
            } else {
                this.f45641h = qVar;
            }
            this.f45637d |= 8;
            return this;
        }

        public b z(t tVar) {
            if ((this.f45637d & 512) == 512 && this.f45647n != t.q()) {
                this.f45647n = t.y(this.f45647n).f(tVar).j();
            } else {
                this.f45647n = tVar;
            }
            this.f45637d |= 512;
            return this;
        }
    }

    static {
        i iVar = new i(true);
        f45619t = iVar;
        iVar.n0();
    }

    public static i N() {
        return f45619t;
    }

    private void n0() {
        this.f45623d = 6;
        this.f45624e = 6;
        this.f45625f = 0;
        this.f45626g = q.S();
        this.f45627h = 0;
        this.f45628i = Collections.emptyList();
        this.f45629j = q.S();
        this.f45630k = 0;
        this.f45631l = Collections.emptyList();
        this.f45632m = t.q();
        this.f45633n = Collections.emptyList();
        this.f45634o = e.o();
    }

    public static b o0() {
        return b.l();
    }

    public static b p0(i iVar) {
        return o0().f(iVar);
    }

    public static i r0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return f45620w.a(inputStream, fVar);
    }

    public e M() {
        return this.f45634o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: O */
    public i getDefaultInstanceForType() {
        return f45619t;
    }

    public int P() {
        return this.f45623d;
    }

    public int Q() {
        return this.f45625f;
    }

    public int R() {
        return this.f45624e;
    }

    public q S() {
        return this.f45629j;
    }

    public int T() {
        return this.f45630k;
    }

    public q U() {
        return this.f45626g;
    }

    public int V() {
        return this.f45627h;
    }

    public s W(int i11) {
        return this.f45628i.get(i11);
    }

    public int X() {
        return this.f45628i.size();
    }

    public List<s> Y() {
        return this.f45628i;
    }

    public t Z() {
        return this.f45632m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        h.d<MessageType>.a s11 = s();
        if ((this.f45622c & 2) == 2) {
            codedOutputStream.a0(1, this.f45624e);
        }
        if ((this.f45622c & 4) == 4) {
            codedOutputStream.a0(2, this.f45625f);
        }
        if ((this.f45622c & 8) == 8) {
            codedOutputStream.d0(3, this.f45626g);
        }
        for (int i11 = 0; i11 < this.f45628i.size(); i11++) {
            codedOutputStream.d0(4, this.f45628i.get(i11));
        }
        if ((this.f45622c & 32) == 32) {
            codedOutputStream.d0(5, this.f45629j);
        }
        for (int i12 = 0; i12 < this.f45631l.size(); i12++) {
            codedOutputStream.d0(6, this.f45631l.get(i12));
        }
        if ((this.f45622c & 16) == 16) {
            codedOutputStream.a0(7, this.f45627h);
        }
        if ((this.f45622c & 64) == 64) {
            codedOutputStream.a0(8, this.f45630k);
        }
        if ((this.f45622c & 1) == 1) {
            codedOutputStream.a0(9, this.f45623d);
        }
        if ((this.f45622c & 128) == 128) {
            codedOutputStream.d0(30, this.f45632m);
        }
        for (int i13 = 0; i13 < this.f45633n.size(); i13++) {
            codedOutputStream.a0(31, this.f45633n.get(i13).intValue());
        }
        if ((this.f45622c & 256) == 256) {
            codedOutputStream.d0(32, this.f45634o);
        }
        s11.a(19000, codedOutputStream);
        codedOutputStream.i0(this.f45621b);
    }

    public u a0(int i11) {
        return this.f45631l.get(i11);
    }

    public int b0() {
        return this.f45631l.size();
    }

    public List<u> c0() {
        return this.f45631l;
    }

    public List<Integer> d0() {
        return this.f45633n;
    }

    public boolean e0() {
        return (this.f45622c & 256) == 256;
    }

    public boolean f0() {
        return (this.f45622c & 1) == 1;
    }

    public boolean g0() {
        return (this.f45622c & 4) == 4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<i> getParserForType() {
        return f45620w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45636q;
        if (i11 != -1) {
            return i11;
        }
        int o11 = (this.f45622c & 2) == 2 ? CodedOutputStream.o(1, this.f45624e) + 0 : 0;
        if ((this.f45622c & 4) == 4) {
            o11 += CodedOutputStream.o(2, this.f45625f);
        }
        if ((this.f45622c & 8) == 8) {
            o11 += CodedOutputStream.s(3, this.f45626g);
        }
        for (int i12 = 0; i12 < this.f45628i.size(); i12++) {
            o11 += CodedOutputStream.s(4, this.f45628i.get(i12));
        }
        if ((this.f45622c & 32) == 32) {
            o11 += CodedOutputStream.s(5, this.f45629j);
        }
        for (int i13 = 0; i13 < this.f45631l.size(); i13++) {
            o11 += CodedOutputStream.s(6, this.f45631l.get(i13));
        }
        if ((this.f45622c & 16) == 16) {
            o11 += CodedOutputStream.o(7, this.f45627h);
        }
        if ((this.f45622c & 64) == 64) {
            o11 += CodedOutputStream.o(8, this.f45630k);
        }
        if ((this.f45622c & 1) == 1) {
            o11 += CodedOutputStream.o(9, this.f45623d);
        }
        if ((this.f45622c & 128) == 128) {
            o11 += CodedOutputStream.s(30, this.f45632m);
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f45633n.size(); i15++) {
            i14 += CodedOutputStream.p(this.f45633n.get(i15).intValue());
        }
        int size = o11 + i14 + (d0().size() * 2);
        if ((this.f45622c & 256) == 256) {
            size += CodedOutputStream.s(32, this.f45634o);
        }
        int n11 = size + n() + this.f45621b.size();
        this.f45636q = n11;
        return n11;
    }

    public boolean h0() {
        return (this.f45622c & 2) == 2;
    }

    public boolean i0() {
        return (this.f45622c & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45635p;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!g0()) {
            this.f45635p = (byte) 0;
            return false;
        } else if (k0() && !U().isInitialized()) {
            this.f45635p = (byte) 0;
            return false;
        } else {
            for (int i11 = 0; i11 < X(); i11++) {
                if (!W(i11).isInitialized()) {
                    this.f45635p = (byte) 0;
                    return false;
                }
            }
            if (i0() && !S().isInitialized()) {
                this.f45635p = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < b0(); i12++) {
                if (!a0(i12).isInitialized()) {
                    this.f45635p = (byte) 0;
                    return false;
                }
            }
            if (m0() && !Z().isInitialized()) {
                this.f45635p = (byte) 0;
                return false;
            } else if (e0() && !M().isInitialized()) {
                this.f45635p = (byte) 0;
                return false;
            } else if (!m()) {
                this.f45635p = (byte) 0;
                return false;
            } else {
                this.f45635p = (byte) 1;
                return true;
            }
        }
    }

    public boolean j0() {
        return (this.f45622c & 64) == 64;
    }

    public boolean k0() {
        return (this.f45622c & 8) == 8;
    }

    public boolean l0() {
        return (this.f45622c & 16) == 16;
    }

    public boolean m0() {
        return (this.f45622c & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: q0 */
    public b newBuilderForType() {
        return o0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: s0 */
    public b toBuilder() {
        return p0(this);
    }

    private i(h.c<i, ?> cVar) {
        super(cVar);
        this.f45635p = (byte) -1;
        this.f45636q = -1;
        this.f45621b = cVar.e();
    }

    private i(boolean z11) {
        this.f45635p = (byte) -1;
        this.f45636q = -1;
        this.f45621b = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private i(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45635p = (byte) -1;
        this.f45636q = -1;
        n0();
        d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
        CodedOutputStream J = CodedOutputStream.J(q11, 1);
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            ?? r52 = 1024;
            if (!z11) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            switch (K) {
                                case 0:
                                    break;
                                case 8:
                                    this.f45622c |= 2;
                                    this.f45624e = eVar.s();
                                    continue;
                                case 16:
                                    this.f45622c |= 4;
                                    this.f45625f = eVar.s();
                                    continue;
                                case 26:
                                    q.c builder = (this.f45622c & 8) == 8 ? this.f45626g.toBuilder() : null;
                                    q qVar = (q) eVar.u(q.f45743y, fVar);
                                    this.f45626g = qVar;
                                    if (builder != null) {
                                        builder.f(qVar);
                                        this.f45626g = builder.n();
                                    }
                                    this.f45622c |= 8;
                                    continue;
                                case 34:
                                    boolean z13 = (z12 ? 1 : 0) & true;
                                    z12 = z12;
                                    if (!z13) {
                                        this.f45628i = new ArrayList();
                                        z12 = (z12 ? 1 : 0) | true;
                                    }
                                    this.f45628i.add(eVar.u(s.f45816n, fVar));
                                    continue;
                                case 42:
                                    q.c builder2 = (this.f45622c & 32) == 32 ? this.f45629j.toBuilder() : null;
                                    q qVar2 = (q) eVar.u(q.f45743y, fVar);
                                    this.f45629j = qVar2;
                                    if (builder2 != null) {
                                        builder2.f(qVar2);
                                        this.f45629j = builder2.n();
                                    }
                                    this.f45622c |= 32;
                                    continue;
                                case 50:
                                    boolean z14 = (z12 ? 1 : 0) & true;
                                    z12 = z12;
                                    if (!z14) {
                                        this.f45631l = new ArrayList();
                                        z12 = (z12 ? 1 : 0) | true;
                                    }
                                    this.f45631l.add(eVar.u(u.f45847m, fVar));
                                    continue;
                                case 56:
                                    this.f45622c |= 16;
                                    this.f45627h = eVar.s();
                                    continue;
                                case 64:
                                    this.f45622c |= 64;
                                    this.f45630k = eVar.s();
                                    continue;
                                case 72:
                                    this.f45622c |= 1;
                                    this.f45623d = eVar.s();
                                    continue;
                                case 242:
                                    t.b builder3 = (this.f45622c & 128) == 128 ? this.f45632m.toBuilder() : null;
                                    t tVar = (t) eVar.u(t.f45836h, fVar);
                                    this.f45632m = tVar;
                                    if (builder3 != null) {
                                        builder3.f(tVar);
                                        this.f45632m = builder3.j();
                                    }
                                    this.f45622c |= 128;
                                    continue;
                                case 248:
                                    boolean z15 = (z12 ? 1 : 0) & true;
                                    z12 = z12;
                                    if (!z15) {
                                        this.f45633n = new ArrayList();
                                        z12 = (z12 ? 1 : 0) | true;
                                    }
                                    this.f45633n.add(Integer.valueOf(eVar.s()));
                                    continue;
                                case l.f.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                    int j11 = eVar.j(eVar.A());
                                    boolean z16 = (z12 ? 1 : 0) & true;
                                    z12 = z12;
                                    if (!z16) {
                                        z12 = z12;
                                        if (eVar.e() > 0) {
                                            this.f45633n = new ArrayList();
                                            z12 = (z12 ? 1 : 0) | true;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.f45633n.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j11);
                                    continue;
                                case 258:
                                    e.b builder4 = (this.f45622c & 256) == 256 ? this.f45634o.toBuilder() : null;
                                    e eVar2 = (e) eVar.u(e.f45567f, fVar);
                                    this.f45634o = eVar2;
                                    if (builder4 != null) {
                                        builder4.f(eVar2);
                                        this.f45634o = builder4.j();
                                    }
                                    this.f45622c |= 256;
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
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if ((z12 ? 1 : 0) & true) {
                        this.f45628i = Collections.unmodifiableList(this.f45628i);
                    }
                    if ((z12 ? 1 : 0) & true) {
                        this.f45631l = Collections.unmodifiableList(this.f45631l);
                    }
                    if (((z12 ? 1 : 0) & true) == r52) {
                        this.f45633n = Collections.unmodifiableList(this.f45633n);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f45621b = q11.l();
                        throw th3;
                    }
                    this.f45621b = q11.l();
                    g();
                    throw th2;
                }
            } else {
                if ((z12 ? 1 : 0) & true) {
                    this.f45628i = Collections.unmodifiableList(this.f45628i);
                }
                if ((z12 ? 1 : 0) & true) {
                    this.f45631l = Collections.unmodifiableList(this.f45631l);
                }
                if ((z12 ? 1 : 0) & true) {
                    this.f45633n = Collections.unmodifiableList(this.f45633n);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f45621b = q11.l();
                    throw th4;
                }
                this.f45621b = q11.l();
                g();
                return;
            }
        }
    }
}