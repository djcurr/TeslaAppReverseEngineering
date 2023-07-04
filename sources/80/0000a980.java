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
import p10.q;

/* loaded from: classes5.dex */
public final class r extends h.d<r> {

    /* renamed from: o  reason: collision with root package name */
    private static final r f45790o;

    /* renamed from: p  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<r> f45791p = new a();

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45792b;

    /* renamed from: c  reason: collision with root package name */
    private int f45793c;

    /* renamed from: d  reason: collision with root package name */
    private int f45794d;

    /* renamed from: e  reason: collision with root package name */
    private int f45795e;

    /* renamed from: f  reason: collision with root package name */
    private List<s> f45796f;

    /* renamed from: g  reason: collision with root package name */
    private q f45797g;

    /* renamed from: h  reason: collision with root package name */
    private int f45798h;

    /* renamed from: i  reason: collision with root package name */
    private q f45799i;

    /* renamed from: j  reason: collision with root package name */
    private int f45800j;

    /* renamed from: k  reason: collision with root package name */
    private List<p10.b> f45801k;

    /* renamed from: l  reason: collision with root package name */
    private List<Integer> f45802l;

    /* renamed from: m  reason: collision with root package name */
    private byte f45803m;

    /* renamed from: n  reason: collision with root package name */
    private int f45804n;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<r> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public r c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new r(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.c<r, b> {

        /* renamed from: d  reason: collision with root package name */
        private int f45805d;

        /* renamed from: f  reason: collision with root package name */
        private int f45807f;

        /* renamed from: i  reason: collision with root package name */
        private int f45810i;

        /* renamed from: k  reason: collision with root package name */
        private int f45812k;

        /* renamed from: e  reason: collision with root package name */
        private int f45806e = 6;

        /* renamed from: g  reason: collision with root package name */
        private List<s> f45808g = Collections.emptyList();

        /* renamed from: h  reason: collision with root package name */
        private q f45809h = q.S();

        /* renamed from: j  reason: collision with root package name */
        private q f45811j = q.S();

        /* renamed from: l  reason: collision with root package name */
        private List<p10.b> f45813l = Collections.emptyList();

        /* renamed from: m  reason: collision with root package name */
        private List<Integer> f45814m = Collections.emptyList();

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
            if ((this.f45805d & 128) != 128) {
                this.f45813l = new ArrayList(this.f45813l);
                this.f45805d |= 128;
            }
        }

        private void r() {
            if ((this.f45805d & 4) != 4) {
                this.f45808g = new ArrayList(this.f45808g);
                this.f45805d |= 4;
            }
        }

        private void s() {
            if ((this.f45805d & 256) != 256) {
                this.f45814m = new ArrayList(this.f45814m);
                this.f45805d |= 256;
            }
        }

        private void t() {
        }

        public b A(int i11) {
            this.f45805d |= 2;
            this.f45807f = i11;
            return this;
        }

        public b B(int i11) {
            this.f45805d |= 16;
            this.f45810i = i11;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: m */
        public r build() {
            r n11 = n();
            if (n11.isInitialized()) {
                return n11;
            }
            throw a.AbstractC0651a.c(n11);
        }

        public r n() {
            r rVar = new r(this);
            int i11 = this.f45805d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            rVar.f45794d = this.f45806e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            rVar.f45795e = this.f45807f;
            if ((this.f45805d & 4) == 4) {
                this.f45808g = Collections.unmodifiableList(this.f45808g);
                this.f45805d &= -5;
            }
            rVar.f45796f = this.f45808g;
            if ((i11 & 8) == 8) {
                i12 |= 4;
            }
            rVar.f45797g = this.f45809h;
            if ((i11 & 16) == 16) {
                i12 |= 8;
            }
            rVar.f45798h = this.f45810i;
            if ((i11 & 32) == 32) {
                i12 |= 16;
            }
            rVar.f45799i = this.f45811j;
            if ((i11 & 64) == 64) {
                i12 |= 32;
            }
            rVar.f45800j = this.f45812k;
            if ((this.f45805d & 128) == 128) {
                this.f45813l = Collections.unmodifiableList(this.f45813l);
                this.f45805d &= -129;
            }
            rVar.f45801k = this.f45813l;
            if ((this.f45805d & 256) == 256) {
                this.f45814m = Collections.unmodifiableList(this.f45814m);
                this.f45805d &= -257;
            }
            rVar.f45802l = this.f45814m;
            rVar.f45793c = i12;
            return rVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: o */
        public b d() {
            return p().f(n());
        }

        public b u(q qVar) {
            if ((this.f45805d & 32) == 32 && this.f45811j != q.S()) {
                this.f45811j = q.t0(this.f45811j).f(qVar).n();
            } else {
                this.f45811j = qVar;
            }
            this.f45805d |= 32;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: v */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.r.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.r> r1 = p10.r.f45791p     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.r r3 = (p10.r) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.r r4 = (p10.r) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.r.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.r$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: w */
        public b f(r rVar) {
            if (rVar == r.M()) {
                return this;
            }
            if (rVar.a0()) {
                z(rVar.Q());
            }
            if (rVar.b0()) {
                A(rVar.R());
            }
            if (!rVar.f45796f.isEmpty()) {
                if (this.f45808g.isEmpty()) {
                    this.f45808g = rVar.f45796f;
                    this.f45805d &= -5;
                } else {
                    r();
                    this.f45808g.addAll(rVar.f45796f);
                }
            }
            if (rVar.c0()) {
                x(rVar.V());
            }
            if (rVar.d0()) {
                B(rVar.W());
            }
            if (rVar.Y()) {
                u(rVar.O());
            }
            if (rVar.Z()) {
                y(rVar.P());
            }
            if (!rVar.f45801k.isEmpty()) {
                if (this.f45813l.isEmpty()) {
                    this.f45813l = rVar.f45801k;
                    this.f45805d &= -129;
                } else {
                    q();
                    this.f45813l.addAll(rVar.f45801k);
                }
            }
            if (!rVar.f45802l.isEmpty()) {
                if (this.f45814m.isEmpty()) {
                    this.f45814m = rVar.f45802l;
                    this.f45805d &= -257;
                } else {
                    s();
                    this.f45814m.addAll(rVar.f45802l);
                }
            }
            k(rVar);
            g(e().c(rVar.f45792b));
            return this;
        }

        public b x(q qVar) {
            if ((this.f45805d & 8) == 8 && this.f45809h != q.S()) {
                this.f45809h = q.t0(this.f45809h).f(qVar).n();
            } else {
                this.f45809h = qVar;
            }
            this.f45805d |= 8;
            return this;
        }

        public b y(int i11) {
            this.f45805d |= 64;
            this.f45812k = i11;
            return this;
        }

        public b z(int i11) {
            this.f45805d |= 1;
            this.f45806e = i11;
            return this;
        }
    }

    static {
        r rVar = new r(true);
        f45790o = rVar;
        rVar.e0();
    }

    public static r M() {
        return f45790o;
    }

    private void e0() {
        this.f45794d = 6;
        this.f45795e = 0;
        this.f45796f = Collections.emptyList();
        this.f45797g = q.S();
        this.f45798h = 0;
        this.f45799i = q.S();
        this.f45800j = 0;
        this.f45801k = Collections.emptyList();
        this.f45802l = Collections.emptyList();
    }

    public static b f0() {
        return b.l();
    }

    public static b g0(r rVar) {
        return f0().f(rVar);
    }

    public static r i0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return f45791p.d(inputStream, fVar);
    }

    public p10.b J(int i11) {
        return this.f45801k.get(i11);
    }

    public int K() {
        return this.f45801k.size();
    }

    public List<p10.b> L() {
        return this.f45801k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: N */
    public r getDefaultInstanceForType() {
        return f45790o;
    }

    public q O() {
        return this.f45799i;
    }

    public int P() {
        return this.f45800j;
    }

    public int Q() {
        return this.f45794d;
    }

    public int R() {
        return this.f45795e;
    }

    public s S(int i11) {
        return this.f45796f.get(i11);
    }

    public int T() {
        return this.f45796f.size();
    }

    public List<s> U() {
        return this.f45796f;
    }

    public q V() {
        return this.f45797g;
    }

    public int W() {
        return this.f45798h;
    }

    public List<Integer> X() {
        return this.f45802l;
    }

    public boolean Y() {
        return (this.f45793c & 16) == 16;
    }

    public boolean Z() {
        return (this.f45793c & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        h.d<MessageType>.a s11 = s();
        if ((this.f45793c & 1) == 1) {
            codedOutputStream.a0(1, this.f45794d);
        }
        if ((this.f45793c & 2) == 2) {
            codedOutputStream.a0(2, this.f45795e);
        }
        for (int i11 = 0; i11 < this.f45796f.size(); i11++) {
            codedOutputStream.d0(3, this.f45796f.get(i11));
        }
        if ((this.f45793c & 4) == 4) {
            codedOutputStream.d0(4, this.f45797g);
        }
        if ((this.f45793c & 8) == 8) {
            codedOutputStream.a0(5, this.f45798h);
        }
        if ((this.f45793c & 16) == 16) {
            codedOutputStream.d0(6, this.f45799i);
        }
        if ((this.f45793c & 32) == 32) {
            codedOutputStream.a0(7, this.f45800j);
        }
        for (int i12 = 0; i12 < this.f45801k.size(); i12++) {
            codedOutputStream.d0(8, this.f45801k.get(i12));
        }
        for (int i13 = 0; i13 < this.f45802l.size(); i13++) {
            codedOutputStream.a0(31, this.f45802l.get(i13).intValue());
        }
        s11.a(200, codedOutputStream);
        codedOutputStream.i0(this.f45792b);
    }

    public boolean a0() {
        return (this.f45793c & 1) == 1;
    }

    public boolean b0() {
        return (this.f45793c & 2) == 2;
    }

    public boolean c0() {
        return (this.f45793c & 4) == 4;
    }

    public boolean d0() {
        return (this.f45793c & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<r> getParserForType() {
        return f45791p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45804n;
        if (i11 != -1) {
            return i11;
        }
        int o11 = (this.f45793c & 1) == 1 ? CodedOutputStream.o(1, this.f45794d) + 0 : 0;
        if ((this.f45793c & 2) == 2) {
            o11 += CodedOutputStream.o(2, this.f45795e);
        }
        for (int i12 = 0; i12 < this.f45796f.size(); i12++) {
            o11 += CodedOutputStream.s(3, this.f45796f.get(i12));
        }
        if ((this.f45793c & 4) == 4) {
            o11 += CodedOutputStream.s(4, this.f45797g);
        }
        if ((this.f45793c & 8) == 8) {
            o11 += CodedOutputStream.o(5, this.f45798h);
        }
        if ((this.f45793c & 16) == 16) {
            o11 += CodedOutputStream.s(6, this.f45799i);
        }
        if ((this.f45793c & 32) == 32) {
            o11 += CodedOutputStream.o(7, this.f45800j);
        }
        for (int i13 = 0; i13 < this.f45801k.size(); i13++) {
            o11 += CodedOutputStream.s(8, this.f45801k.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f45802l.size(); i15++) {
            i14 += CodedOutputStream.p(this.f45802l.get(i15).intValue());
        }
        int size = o11 + i14 + (X().size() * 2) + n() + this.f45792b.size();
        this.f45804n = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: h0 */
    public b newBuilderForType() {
        return f0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45803m;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!b0()) {
            this.f45803m = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < T(); i11++) {
            if (!S(i11).isInitialized()) {
                this.f45803m = (byte) 0;
                return false;
            }
        }
        if (c0() && !V().isInitialized()) {
            this.f45803m = (byte) 0;
            return false;
        } else if (Y() && !O().isInitialized()) {
            this.f45803m = (byte) 0;
            return false;
        } else {
            for (int i12 = 0; i12 < K(); i12++) {
                if (!J(i12).isInitialized()) {
                    this.f45803m = (byte) 0;
                    return false;
                }
            }
            if (!m()) {
                this.f45803m = (byte) 0;
                return false;
            }
            this.f45803m = (byte) 1;
            return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: j0 */
    public b toBuilder() {
        return g0(this);
    }

    private r(h.c<r, ?> cVar) {
        super(cVar);
        this.f45803m = (byte) -1;
        this.f45804n = -1;
        this.f45792b = cVar.e();
    }

    private r(boolean z11) {
        this.f45803m = (byte) -1;
        this.f45804n = -1;
        this.f45792b = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private r(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        q.c builder;
        this.f45803m = (byte) -1;
        this.f45804n = -1;
        e0();
        d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
        CodedOutputStream J = CodedOutputStream.J(q11, 1);
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            ?? r52 = 128;
            if (!z11) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            switch (K) {
                                case 0:
                                    break;
                                case 8:
                                    this.f45793c |= 1;
                                    this.f45794d = eVar.s();
                                    continue;
                                case 16:
                                    this.f45793c |= 2;
                                    this.f45795e = eVar.s();
                                    continue;
                                case 26:
                                    if (!(z12 & true)) {
                                        this.f45796f = new ArrayList();
                                        z12 |= true;
                                    }
                                    this.f45796f.add(eVar.u(s.f45816n, fVar));
                                    continue;
                                case 34:
                                    builder = (this.f45793c & 4) == 4 ? this.f45797g.toBuilder() : null;
                                    q qVar = (q) eVar.u(q.f45743y, fVar);
                                    this.f45797g = qVar;
                                    if (builder != null) {
                                        builder.f(qVar);
                                        this.f45797g = builder.n();
                                    }
                                    this.f45793c |= 4;
                                    continue;
                                case 40:
                                    this.f45793c |= 8;
                                    this.f45798h = eVar.s();
                                    continue;
                                case 50:
                                    builder = (this.f45793c & 16) == 16 ? this.f45799i.toBuilder() : null;
                                    q qVar2 = (q) eVar.u(q.f45743y, fVar);
                                    this.f45799i = qVar2;
                                    if (builder != null) {
                                        builder.f(qVar2);
                                        this.f45799i = builder.n();
                                    }
                                    this.f45793c |= 16;
                                    continue;
                                case 56:
                                    this.f45793c |= 32;
                                    this.f45800j = eVar.s();
                                    continue;
                                case 66:
                                    if (!(z12 & true)) {
                                        this.f45801k = new ArrayList();
                                        z12 |= true;
                                    }
                                    this.f45801k.add(eVar.u(p10.b.f45463h, fVar));
                                    continue;
                                case 248:
                                    if (!(z12 & true)) {
                                        this.f45802l = new ArrayList();
                                        z12 |= true;
                                    }
                                    this.f45802l.add(Integer.valueOf(eVar.s()));
                                    continue;
                                case l.f.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                    int j11 = eVar.j(eVar.A());
                                    if (!(z12 & true) && eVar.e() > 0) {
                                        this.f45802l = new ArrayList();
                                        z12 |= true;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f45802l.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j11);
                                    continue;
                                    break;
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
                    if (z12 & true) {
                        this.f45796f = Collections.unmodifiableList(this.f45796f);
                    }
                    if ((z12 & true) == r52) {
                        this.f45801k = Collections.unmodifiableList(this.f45801k);
                    }
                    if (z12 & true) {
                        this.f45802l = Collections.unmodifiableList(this.f45802l);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f45792b = q11.l();
                        throw th3;
                    }
                    this.f45792b = q11.l();
                    g();
                    throw th2;
                }
            } else {
                if (z12 & true) {
                    this.f45796f = Collections.unmodifiableList(this.f45796f);
                }
                if (z12 & true) {
                    this.f45801k = Collections.unmodifiableList(this.f45801k);
                }
                if (z12 & true) {
                    this.f45802l = Collections.unmodifiableList(this.f45802l);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f45792b = q11.l();
                    throw th4;
                }
                this.f45792b = q11.l();
                g();
                return;
            }
        }
    }
}