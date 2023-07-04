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
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p10.q;
import p10.t;
import p10.w;

/* loaded from: classes5.dex */
public final class c extends h.d<c> {
    private static final c G;
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> H = new a();
    private t A;
    private List<Integer> B;
    private w C;
    private byte E;
    private int F;

    /* renamed from: b */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45513b;

    /* renamed from: c */
    private int f45514c;

    /* renamed from: d */
    private int f45515d;

    /* renamed from: e */
    private int f45516e;

    /* renamed from: f */
    private int f45517f;

    /* renamed from: g */
    private List<s> f45518g;

    /* renamed from: h */
    private List<q> f45519h;

    /* renamed from: i */
    private List<Integer> f45520i;

    /* renamed from: j */
    private int f45521j;

    /* renamed from: k */
    private List<Integer> f45522k;

    /* renamed from: l */
    private int f45523l;

    /* renamed from: m */
    private List<d> f45524m;

    /* renamed from: n */
    private List<i> f45525n;

    /* renamed from: o */
    private List<n> f45526o;

    /* renamed from: p */
    private List<r> f45527p;

    /* renamed from: q */
    private List<g> f45528q;

    /* renamed from: t */
    private List<Integer> f45529t;

    /* renamed from: w */
    private int f45530w;

    /* renamed from: x */
    private int f45531x;

    /* renamed from: y */
    private q f45532y;

    /* renamed from: z */
    private int f45533z;

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
    public static final class b extends h.c<c, b> {

        /* renamed from: d */
        private int f45534d;

        /* renamed from: f */
        private int f45536f;

        /* renamed from: g */
        private int f45537g;

        /* renamed from: t */
        private int f45548t;

        /* renamed from: x */
        private int f45550x;

        /* renamed from: e */
        private int f45535e = 6;

        /* renamed from: h */
        private List<s> f45538h = Collections.emptyList();

        /* renamed from: i */
        private List<q> f45539i = Collections.emptyList();

        /* renamed from: j */
        private List<Integer> f45540j = Collections.emptyList();

        /* renamed from: k */
        private List<Integer> f45541k = Collections.emptyList();

        /* renamed from: l */
        private List<d> f45542l = Collections.emptyList();

        /* renamed from: m */
        private List<i> f45543m = Collections.emptyList();

        /* renamed from: n */
        private List<n> f45544n = Collections.emptyList();

        /* renamed from: o */
        private List<r> f45545o = Collections.emptyList();

        /* renamed from: p */
        private List<g> f45546p = Collections.emptyList();

        /* renamed from: q */
        private List<Integer> f45547q = Collections.emptyList();

        /* renamed from: w */
        private q f45549w = q.S();

        /* renamed from: y */
        private t f45551y = t.q();

        /* renamed from: z */
        private List<Integer> f45552z = Collections.emptyList();
        private w A = w.o();

        private b() {
            B();
        }

        private void A() {
            if ((this.f45534d & 131072) != 131072) {
                this.f45552z = new ArrayList(this.f45552z);
                this.f45534d |= 131072;
            }
        }

        private void B() {
        }

        static /* synthetic */ b l() {
            return p();
        }

        private static b p() {
            return new b();
        }

        private void q() {
            if ((this.f45534d & 128) != 128) {
                this.f45542l = new ArrayList(this.f45542l);
                this.f45534d |= 128;
            }
        }

        private void r() {
            if ((this.f45534d & 2048) != 2048) {
                this.f45546p = new ArrayList(this.f45546p);
                this.f45534d |= 2048;
            }
        }

        private void s() {
            if ((this.f45534d & 256) != 256) {
                this.f45543m = new ArrayList(this.f45543m);
                this.f45534d |= 256;
            }
        }

        private void t() {
            if ((this.f45534d & 64) != 64) {
                this.f45541k = new ArrayList(this.f45541k);
                this.f45534d |= 64;
            }
        }

        private void u() {
            if ((this.f45534d & 512) != 512) {
                this.f45544n = new ArrayList(this.f45544n);
                this.f45534d |= 512;
            }
        }

        private void v() {
            if ((this.f45534d & 4096) != 4096) {
                this.f45547q = new ArrayList(this.f45547q);
                this.f45534d |= 4096;
            }
        }

        private void w() {
            if ((this.f45534d & 32) != 32) {
                this.f45540j = new ArrayList(this.f45540j);
                this.f45534d |= 32;
            }
        }

        private void x() {
            if ((this.f45534d & 16) != 16) {
                this.f45539i = new ArrayList(this.f45539i);
                this.f45534d |= 16;
            }
        }

        private void y() {
            if ((this.f45534d & 1024) != 1024) {
                this.f45545o = new ArrayList(this.f45545o);
                this.f45534d |= 1024;
            }
        }

        private void z() {
            if ((this.f45534d & 8) != 8) {
                this.f45538h = new ArrayList(this.f45538h);
                this.f45534d |= 8;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.c.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.c> r1 = p10.c.H     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.c r3 = (p10.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.c r4 = (p10.c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.c.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.c$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: E */
        public b f(c cVar) {
            if (cVar == c.f0()) {
                return this;
            }
            if (cVar.L0()) {
                J(cVar.k0());
            }
            if (cVar.M0()) {
                K(cVar.l0());
            }
            if (cVar.K0()) {
                I(cVar.b0());
            }
            if (!cVar.f45518g.isEmpty()) {
                if (this.f45538h.isEmpty()) {
                    this.f45538h = cVar.f45518g;
                    this.f45534d &= -9;
                } else {
                    z();
                    this.f45538h.addAll(cVar.f45518g);
                }
            }
            if (!cVar.f45519h.isEmpty()) {
                if (this.f45539i.isEmpty()) {
                    this.f45539i = cVar.f45519h;
                    this.f45534d &= -17;
                } else {
                    x();
                    this.f45539i.addAll(cVar.f45519h);
                }
            }
            if (!cVar.f45520i.isEmpty()) {
                if (this.f45540j.isEmpty()) {
                    this.f45540j = cVar.f45520i;
                    this.f45534d &= -33;
                } else {
                    w();
                    this.f45540j.addAll(cVar.f45520i);
                }
            }
            if (!cVar.f45522k.isEmpty()) {
                if (this.f45541k.isEmpty()) {
                    this.f45541k = cVar.f45522k;
                    this.f45534d &= -65;
                } else {
                    t();
                    this.f45541k.addAll(cVar.f45522k);
                }
            }
            if (!cVar.f45524m.isEmpty()) {
                if (this.f45542l.isEmpty()) {
                    this.f45542l = cVar.f45524m;
                    this.f45534d &= -129;
                } else {
                    q();
                    this.f45542l.addAll(cVar.f45524m);
                }
            }
            if (!cVar.f45525n.isEmpty()) {
                if (this.f45543m.isEmpty()) {
                    this.f45543m = cVar.f45525n;
                    this.f45534d &= -257;
                } else {
                    s();
                    this.f45543m.addAll(cVar.f45525n);
                }
            }
            if (!cVar.f45526o.isEmpty()) {
                if (this.f45544n.isEmpty()) {
                    this.f45544n = cVar.f45526o;
                    this.f45534d &= -513;
                } else {
                    u();
                    this.f45544n.addAll(cVar.f45526o);
                }
            }
            if (!cVar.f45527p.isEmpty()) {
                if (this.f45545o.isEmpty()) {
                    this.f45545o = cVar.f45527p;
                    this.f45534d &= -1025;
                } else {
                    y();
                    this.f45545o.addAll(cVar.f45527p);
                }
            }
            if (!cVar.f45528q.isEmpty()) {
                if (this.f45546p.isEmpty()) {
                    this.f45546p = cVar.f45528q;
                    this.f45534d &= -2049;
                } else {
                    r();
                    this.f45546p.addAll(cVar.f45528q);
                }
            }
            if (!cVar.f45529t.isEmpty()) {
                if (this.f45547q.isEmpty()) {
                    this.f45547q = cVar.f45529t;
                    this.f45534d &= -4097;
                } else {
                    v();
                    this.f45547q.addAll(cVar.f45529t);
                }
            }
            if (cVar.N0()) {
                L(cVar.p0());
            }
            if (cVar.O0()) {
                F(cVar.q0());
            }
            if (cVar.P0()) {
                M(cVar.r0());
            }
            if (cVar.Q0()) {
                G(cVar.H0());
            }
            if (!cVar.B.isEmpty()) {
                if (this.f45552z.isEmpty()) {
                    this.f45552z = cVar.B;
                    this.f45534d &= -131073;
                } else {
                    A();
                    this.f45552z.addAll(cVar.B);
                }
            }
            if (cVar.R0()) {
                H(cVar.J0());
            }
            k(cVar);
            g(e().c(cVar.f45513b));
            return this;
        }

        public b F(q qVar) {
            if ((this.f45534d & 16384) == 16384 && this.f45549w != q.S()) {
                this.f45549w = q.t0(this.f45549w).f(qVar).n();
            } else {
                this.f45549w = qVar;
            }
            this.f45534d |= 16384;
            return this;
        }

        public b G(t tVar) {
            if ((this.f45534d & 65536) == 65536 && this.f45551y != t.q()) {
                this.f45551y = t.y(this.f45551y).f(tVar).j();
            } else {
                this.f45551y = tVar;
            }
            this.f45534d |= 65536;
            return this;
        }

        public b H(w wVar) {
            if ((this.f45534d & 262144) == 262144 && this.A != w.o()) {
                this.A = w.t(this.A).f(wVar).j();
            } else {
                this.A = wVar;
            }
            this.f45534d |= 262144;
            return this;
        }

        public b I(int i11) {
            this.f45534d |= 4;
            this.f45537g = i11;
            return this;
        }

        public b J(int i11) {
            this.f45534d |= 1;
            this.f45535e = i11;
            return this;
        }

        public b K(int i11) {
            this.f45534d |= 2;
            this.f45536f = i11;
            return this;
        }

        public b L(int i11) {
            this.f45534d |= PKIFailureInfo.certRevoked;
            this.f45548t = i11;
            return this;
        }

        public b M(int i11) {
            this.f45534d |= 32768;
            this.f45550x = i11;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: m */
        public c build() {
            c n11 = n();
            if (n11.isInitialized()) {
                return n11;
            }
            throw a.AbstractC0651a.c(n11);
        }

        public c n() {
            c cVar = new c(this);
            int i11 = this.f45534d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            cVar.f45515d = this.f45535e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            cVar.f45516e = this.f45536f;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            cVar.f45517f = this.f45537g;
            if ((this.f45534d & 8) == 8) {
                this.f45538h = Collections.unmodifiableList(this.f45538h);
                this.f45534d &= -9;
            }
            cVar.f45518g = this.f45538h;
            if ((this.f45534d & 16) == 16) {
                this.f45539i = Collections.unmodifiableList(this.f45539i);
                this.f45534d &= -17;
            }
            cVar.f45519h = this.f45539i;
            if ((this.f45534d & 32) == 32) {
                this.f45540j = Collections.unmodifiableList(this.f45540j);
                this.f45534d &= -33;
            }
            cVar.f45520i = this.f45540j;
            if ((this.f45534d & 64) == 64) {
                this.f45541k = Collections.unmodifiableList(this.f45541k);
                this.f45534d &= -65;
            }
            cVar.f45522k = this.f45541k;
            if ((this.f45534d & 128) == 128) {
                this.f45542l = Collections.unmodifiableList(this.f45542l);
                this.f45534d &= -129;
            }
            cVar.f45524m = this.f45542l;
            if ((this.f45534d & 256) == 256) {
                this.f45543m = Collections.unmodifiableList(this.f45543m);
                this.f45534d &= -257;
            }
            cVar.f45525n = this.f45543m;
            if ((this.f45534d & 512) == 512) {
                this.f45544n = Collections.unmodifiableList(this.f45544n);
                this.f45534d &= -513;
            }
            cVar.f45526o = this.f45544n;
            if ((this.f45534d & 1024) == 1024) {
                this.f45545o = Collections.unmodifiableList(this.f45545o);
                this.f45534d &= -1025;
            }
            cVar.f45527p = this.f45545o;
            if ((this.f45534d & 2048) == 2048) {
                this.f45546p = Collections.unmodifiableList(this.f45546p);
                this.f45534d &= -2049;
            }
            cVar.f45528q = this.f45546p;
            if ((this.f45534d & 4096) == 4096) {
                this.f45547q = Collections.unmodifiableList(this.f45547q);
                this.f45534d &= -4097;
            }
            cVar.f45529t = this.f45547q;
            if ((i11 & PKIFailureInfo.certRevoked) == 8192) {
                i12 |= 8;
            }
            cVar.f45531x = this.f45548t;
            if ((i11 & 16384) == 16384) {
                i12 |= 16;
            }
            cVar.f45532y = this.f45549w;
            if ((i11 & 32768) == 32768) {
                i12 |= 32;
            }
            cVar.f45533z = this.f45550x;
            if ((i11 & 65536) == 65536) {
                i12 |= 64;
            }
            cVar.A = this.f45551y;
            if ((this.f45534d & 131072) == 131072) {
                this.f45552z = Collections.unmodifiableList(this.f45552z);
                this.f45534d &= -131073;
            }
            cVar.B = this.f45552z;
            if ((i11 & 262144) == 262144) {
                i12 |= 128;
            }
            cVar.C = this.A;
            cVar.f45514c = i12;
            return cVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: o */
        public b d() {
            return p().f(n());
        }
    }

    /* renamed from: p10.c$c */
    /* loaded from: classes5.dex */
    public enum EnumC0974c implements i.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        
        private static i.b<EnumC0974c> internalValueMap = new a();
        private final int value;

        /* renamed from: p10.c$c$a */
        /* loaded from: classes5.dex */
        static class a implements i.b<EnumC0974c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: a */
            public EnumC0974c findValueByNumber(int i11) {
                return EnumC0974c.valueOf(i11);
            }
        }

        EnumC0974c(int i11, int i12) {
            this.value = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static EnumC0974c valueOf(int i11) {
            switch (i11) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }
    }

    static {
        c cVar = new c(true);
        G = cVar;
        cVar.S0();
    }

    private void S0() {
        this.f45515d = 6;
        this.f45516e = 0;
        this.f45517f = 0;
        this.f45518g = Collections.emptyList();
        this.f45519h = Collections.emptyList();
        this.f45520i = Collections.emptyList();
        this.f45522k = Collections.emptyList();
        this.f45524m = Collections.emptyList();
        this.f45525n = Collections.emptyList();
        this.f45526o = Collections.emptyList();
        this.f45527p = Collections.emptyList();
        this.f45528q = Collections.emptyList();
        this.f45529t = Collections.emptyList();
        this.f45531x = 0;
        this.f45532y = q.S();
        this.f45533z = 0;
        this.A = t.q();
        this.B = Collections.emptyList();
        this.C = w.o();
    }

    public static b T0() {
        return b.l();
    }

    public static b U0(c cVar) {
        return T0().f(cVar);
    }

    public static c W0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return H.a(inputStream, fVar);
    }

    public static c f0() {
        return G;
    }

    public List<q> A0() {
        return this.f45519h;
    }

    public r B0(int i11) {
        return this.f45527p.get(i11);
    }

    public int C0() {
        return this.f45527p.size();
    }

    public List<r> D0() {
        return this.f45527p;
    }

    public s E0(int i11) {
        return this.f45518g.get(i11);
    }

    public int F0() {
        return this.f45518g.size();
    }

    public List<s> G0() {
        return this.f45518g;
    }

    public t H0() {
        return this.A;
    }

    public List<Integer> I0() {
        return this.B;
    }

    public w J0() {
        return this.C;
    }

    public boolean K0() {
        return (this.f45514c & 4) == 4;
    }

    public boolean L0() {
        return (this.f45514c & 1) == 1;
    }

    public boolean M0() {
        return (this.f45514c & 2) == 2;
    }

    public boolean N0() {
        return (this.f45514c & 8) == 8;
    }

    public boolean O0() {
        return (this.f45514c & 16) == 16;
    }

    public boolean P0() {
        return (this.f45514c & 32) == 32;
    }

    public boolean Q0() {
        return (this.f45514c & 64) == 64;
    }

    public boolean R0() {
        return (this.f45514c & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: V0 */
    public b newBuilderForType() {
        return T0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: X0 */
    public b toBuilder() {
        return U0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        h.d<MessageType>.a s11 = s();
        if ((this.f45514c & 1) == 1) {
            codedOutputStream.a0(1, this.f45515d);
        }
        if (z0().size() > 0) {
            codedOutputStream.o0(18);
            codedOutputStream.o0(this.f45521j);
        }
        for (int i11 = 0; i11 < this.f45520i.size(); i11++) {
            codedOutputStream.b0(this.f45520i.get(i11).intValue());
        }
        if ((this.f45514c & 2) == 2) {
            codedOutputStream.a0(3, this.f45516e);
        }
        if ((this.f45514c & 4) == 4) {
            codedOutputStream.a0(4, this.f45517f);
        }
        for (int i12 = 0; i12 < this.f45518g.size(); i12++) {
            codedOutputStream.d0(5, this.f45518g.get(i12));
        }
        for (int i13 = 0; i13 < this.f45519h.size(); i13++) {
            codedOutputStream.d0(6, this.f45519h.get(i13));
        }
        if (s0().size() > 0) {
            codedOutputStream.o0(58);
            codedOutputStream.o0(this.f45523l);
        }
        for (int i14 = 0; i14 < this.f45522k.size(); i14++) {
            codedOutputStream.b0(this.f45522k.get(i14).intValue());
        }
        for (int i15 = 0; i15 < this.f45524m.size(); i15++) {
            codedOutputStream.d0(8, this.f45524m.get(i15));
        }
        for (int i16 = 0; i16 < this.f45525n.size(); i16++) {
            codedOutputStream.d0(9, this.f45525n.get(i16));
        }
        for (int i17 = 0; i17 < this.f45526o.size(); i17++) {
            codedOutputStream.d0(10, this.f45526o.get(i17));
        }
        for (int i18 = 0; i18 < this.f45527p.size(); i18++) {
            codedOutputStream.d0(11, this.f45527p.get(i18));
        }
        for (int i19 = 0; i19 < this.f45528q.size(); i19++) {
            codedOutputStream.d0(13, this.f45528q.get(i19));
        }
        if (w0().size() > 0) {
            codedOutputStream.o0(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            codedOutputStream.o0(this.f45530w);
        }
        for (int i21 = 0; i21 < this.f45529t.size(); i21++) {
            codedOutputStream.b0(this.f45529t.get(i21).intValue());
        }
        if ((this.f45514c & 8) == 8) {
            codedOutputStream.a0(17, this.f45531x);
        }
        if ((this.f45514c & 16) == 16) {
            codedOutputStream.d0(18, this.f45532y);
        }
        if ((this.f45514c & 32) == 32) {
            codedOutputStream.a0(19, this.f45533z);
        }
        if ((this.f45514c & 64) == 64) {
            codedOutputStream.d0(30, this.A);
        }
        for (int i22 = 0; i22 < this.B.size(); i22++) {
            codedOutputStream.a0(31, this.B.get(i22).intValue());
        }
        if ((this.f45514c & 128) == 128) {
            codedOutputStream.d0(32, this.C);
        }
        s11.a(19000, codedOutputStream);
        codedOutputStream.i0(this.f45513b);
    }

    public int b0() {
        return this.f45517f;
    }

    public d c0(int i11) {
        return this.f45524m.get(i11);
    }

    public int d0() {
        return this.f45524m.size();
    }

    public List<d> e0() {
        return this.f45524m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: g0 */
    public c getDefaultInstanceForType() {
        return G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<c> getParserForType() {
        return H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.F;
        if (i11 != -1) {
            return i11;
        }
        int o11 = (this.f45514c & 1) == 1 ? CodedOutputStream.o(1, this.f45515d) + 0 : 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f45520i.size(); i13++) {
            i12 += CodedOutputStream.p(this.f45520i.get(i13).intValue());
        }
        int i14 = o11 + i12;
        if (!z0().isEmpty()) {
            i14 = i14 + 1 + CodedOutputStream.p(i12);
        }
        this.f45521j = i12;
        if ((this.f45514c & 2) == 2) {
            i14 += CodedOutputStream.o(3, this.f45516e);
        }
        if ((this.f45514c & 4) == 4) {
            i14 += CodedOutputStream.o(4, this.f45517f);
        }
        for (int i15 = 0; i15 < this.f45518g.size(); i15++) {
            i14 += CodedOutputStream.s(5, this.f45518g.get(i15));
        }
        for (int i16 = 0; i16 < this.f45519h.size(); i16++) {
            i14 += CodedOutputStream.s(6, this.f45519h.get(i16));
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f45522k.size(); i18++) {
            i17 += CodedOutputStream.p(this.f45522k.get(i18).intValue());
        }
        int i19 = i14 + i17;
        if (!s0().isEmpty()) {
            i19 = i19 + 1 + CodedOutputStream.p(i17);
        }
        this.f45523l = i17;
        for (int i21 = 0; i21 < this.f45524m.size(); i21++) {
            i19 += CodedOutputStream.s(8, this.f45524m.get(i21));
        }
        for (int i22 = 0; i22 < this.f45525n.size(); i22++) {
            i19 += CodedOutputStream.s(9, this.f45525n.get(i22));
        }
        for (int i23 = 0; i23 < this.f45526o.size(); i23++) {
            i19 += CodedOutputStream.s(10, this.f45526o.get(i23));
        }
        for (int i24 = 0; i24 < this.f45527p.size(); i24++) {
            i19 += CodedOutputStream.s(11, this.f45527p.get(i24));
        }
        for (int i25 = 0; i25 < this.f45528q.size(); i25++) {
            i19 += CodedOutputStream.s(13, this.f45528q.get(i25));
        }
        int i26 = 0;
        for (int i27 = 0; i27 < this.f45529t.size(); i27++) {
            i26 += CodedOutputStream.p(this.f45529t.get(i27).intValue());
        }
        int i28 = i19 + i26;
        if (!w0().isEmpty()) {
            i28 = i28 + 2 + CodedOutputStream.p(i26);
        }
        this.f45530w = i26;
        if ((this.f45514c & 8) == 8) {
            i28 += CodedOutputStream.o(17, this.f45531x);
        }
        if ((this.f45514c & 16) == 16) {
            i28 += CodedOutputStream.s(18, this.f45532y);
        }
        if ((this.f45514c & 32) == 32) {
            i28 += CodedOutputStream.o(19, this.f45533z);
        }
        if ((this.f45514c & 64) == 64) {
            i28 += CodedOutputStream.s(30, this.A);
        }
        int i29 = 0;
        for (int i31 = 0; i31 < this.B.size(); i31++) {
            i29 += CodedOutputStream.p(this.B.get(i31).intValue());
        }
        int size = i28 + i29 + (I0().size() * 2);
        if ((this.f45514c & 128) == 128) {
            size += CodedOutputStream.s(32, this.C);
        }
        int n11 = size + n() + this.f45513b.size();
        this.F = n11;
        return n11;
    }

    public g h0(int i11) {
        return this.f45528q.get(i11);
    }

    public int i0() {
        return this.f45528q.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.E;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!M0()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < F0(); i11++) {
            if (!E0(i11).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < y0(); i12++) {
            if (!x0(i12).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < d0(); i13++) {
            if (!c0(i13).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < n0(); i14++) {
            if (!m0(i14).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < u0(); i15++) {
            if (!t0(i15).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < C0(); i16++) {
            if (!B0(i16).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < i0(); i17++) {
            if (!h0(i17).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if (O0() && !q0().isInitialized()) {
            this.E = (byte) 0;
            return false;
        } else if (Q0() && !H0().isInitialized()) {
            this.E = (byte) 0;
            return false;
        } else if (!m()) {
            this.E = (byte) 0;
            return false;
        } else {
            this.E = (byte) 1;
            return true;
        }
    }

    public List<g> j0() {
        return this.f45528q;
    }

    public int k0() {
        return this.f45515d;
    }

    public int l0() {
        return this.f45516e;
    }

    public i m0(int i11) {
        return this.f45525n.get(i11);
    }

    public int n0() {
        return this.f45525n.size();
    }

    public List<i> o0() {
        return this.f45525n;
    }

    public int p0() {
        return this.f45531x;
    }

    public q q0() {
        return this.f45532y;
    }

    public int r0() {
        return this.f45533z;
    }

    public List<Integer> s0() {
        return this.f45522k;
    }

    public n t0(int i11) {
        return this.f45526o.get(i11);
    }

    public int u0() {
        return this.f45526o.size();
    }

    public List<n> v0() {
        return this.f45526o;
    }

    public List<Integer> w0() {
        return this.f45529t;
    }

    public q x0(int i11) {
        return this.f45519h.get(i11);
    }

    public int y0() {
        return this.f45519h.size();
    }

    public List<Integer> z0() {
        return this.f45520i;
    }

    private c(h.c<c, ?> cVar) {
        super(cVar);
        this.f45521j = -1;
        this.f45523l = -1;
        this.f45530w = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.f45513b = cVar.e();
    }

    private c(boolean z11) {
        this.f45521j = -1;
        this.f45523l = -1;
        this.f45530w = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.f45513b = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        boolean z11;
        this.f45521j = -1;
        this.f45523l = -1;
        this.f45530w = -1;
        this.E = (byte) -1;
        this.F = -1;
        S0();
        d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
        CodedOutputStream J = CodedOutputStream.J(q11, 1);
        boolean z12 = false;
        boolean z13 = false;
        while (!z12) {
            try {
                try {
                    int K = eVar.K();
                    switch (K) {
                        case 0:
                            z11 = true;
                            z12 = z11;
                            break;
                        case 8:
                            z11 = true;
                            this.f45514c |= 1;
                            this.f45515d = eVar.s();
                            break;
                        case 16:
                            boolean z14 = (z13 ? 1 : 0) & true;
                            boolean z15 = z13;
                            if (!z14) {
                                this.f45520i = new ArrayList();
                                z15 = (z13 ? 1 : 0) | true;
                            }
                            this.f45520i.add(Integer.valueOf(eVar.s()));
                            z13 = z15;
                            z11 = true;
                            break;
                        case 18:
                            int j11 = eVar.j(eVar.A());
                            boolean z16 = (z13 ? 1 : 0) & true;
                            boolean z17 = z13;
                            if (!z16) {
                                z17 = z13;
                                if (eVar.e() > 0) {
                                    this.f45520i = new ArrayList();
                                    z17 = (z13 ? 1 : 0) | true;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f45520i.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j11);
                            z13 = z17;
                            z11 = true;
                            break;
                        case 24:
                            this.f45514c |= 2;
                            this.f45516e = eVar.s();
                            z13 = z13;
                            z11 = true;
                            break;
                        case 32:
                            this.f45514c |= 4;
                            this.f45517f = eVar.s();
                            z13 = z13;
                            z11 = true;
                            break;
                        case 42:
                            boolean z18 = (z13 ? 1 : 0) & true;
                            boolean z19 = z13;
                            if (!z18) {
                                this.f45518g = new ArrayList();
                                z19 = (z13 ? 1 : 0) | true;
                            }
                            this.f45518g.add(eVar.u(s.f45816n, fVar));
                            z13 = z19;
                            z11 = true;
                            break;
                        case 50:
                            boolean z21 = (z13 ? 1 : 0) & true;
                            boolean z22 = z13;
                            if (!z21) {
                                this.f45519h = new ArrayList();
                                z22 = (z13 ? 1 : 0) | true;
                            }
                            this.f45519h.add(eVar.u(q.f45743y, fVar));
                            z13 = z22;
                            z11 = true;
                            break;
                        case 56:
                            boolean z23 = (z13 ? 1 : 0) & true;
                            boolean z24 = z13;
                            if (!z23) {
                                this.f45522k = new ArrayList();
                                z24 = (z13 ? 1 : 0) | true;
                            }
                            this.f45522k.add(Integer.valueOf(eVar.s()));
                            z13 = z24;
                            z11 = true;
                            break;
                        case 58:
                            int j12 = eVar.j(eVar.A());
                            boolean z25 = (z13 ? 1 : 0) & true;
                            boolean z26 = z13;
                            if (!z25) {
                                z26 = z13;
                                if (eVar.e() > 0) {
                                    this.f45522k = new ArrayList();
                                    z26 = (z13 ? 1 : 0) | true;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f45522k.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j12);
                            z13 = z26;
                            z11 = true;
                            break;
                        case 66:
                            boolean z27 = (z13 ? 1 : 0) & true;
                            boolean z28 = z13;
                            if (!z27) {
                                this.f45524m = new ArrayList();
                                z28 = (z13 ? 1 : 0) | true;
                            }
                            this.f45524m.add(eVar.u(d.f45554j, fVar));
                            z13 = z28;
                            z11 = true;
                            break;
                        case 74:
                            boolean z29 = (z13 ? 1 : 0) & true;
                            boolean z31 = z13;
                            if (!z29) {
                                this.f45525n = new ArrayList();
                                z31 = (z13 ? 1 : 0) | true;
                            }
                            this.f45525n.add(eVar.u(i.f45620w, fVar));
                            z13 = z31;
                            z11 = true;
                            break;
                        case 82:
                            boolean z32 = (z13 ? 1 : 0) & true;
                            boolean z33 = z13;
                            if (!z32) {
                                this.f45526o = new ArrayList();
                                z33 = (z13 ? 1 : 0) | true;
                            }
                            this.f45526o.add(eVar.u(n.f45683w, fVar));
                            z13 = z33;
                            z11 = true;
                            break;
                        case 90:
                            boolean z34 = (z13 ? 1 : 0) & true;
                            boolean z35 = z13;
                            if (!z34) {
                                this.f45527p = new ArrayList();
                                z35 = (z13 ? 1 : 0) | true;
                            }
                            this.f45527p.add(eVar.u(r.f45791p, fVar));
                            z13 = z35;
                            z11 = true;
                            break;
                        case 106:
                            boolean z36 = (z13 ? 1 : 0) & true;
                            boolean z37 = z13;
                            if (!z36) {
                                this.f45528q = new ArrayList();
                                z37 = (z13 ? 1 : 0) | true;
                            }
                            this.f45528q.add(eVar.u(g.f45590h, fVar));
                            z13 = z37;
                            z11 = true;
                            break;
                        case 128:
                            boolean z38 = (z13 ? 1 : 0) & true;
                            boolean z39 = z13;
                            if (!z38) {
                                this.f45529t = new ArrayList();
                                z39 = (z13 ? 1 : 0) | true;
                            }
                            this.f45529t.add(Integer.valueOf(eVar.s()));
                            z13 = z39;
                            z11 = true;
                            break;
                        case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                            int j13 = eVar.j(eVar.A());
                            boolean z41 = (z13 ? 1 : 0) & true;
                            boolean z42 = z13;
                            if (!z41) {
                                z42 = z13;
                                if (eVar.e() > 0) {
                                    this.f45529t = new ArrayList();
                                    z42 = (z13 ? 1 : 0) | true;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f45529t.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j13);
                            z13 = z42;
                            z11 = true;
                            break;
                        case 136:
                            this.f45514c |= 8;
                            this.f45531x = eVar.s();
                            z13 = z13;
                            z11 = true;
                            break;
                        case 146:
                            q.c builder = (this.f45514c & 16) == 16 ? this.f45532y.toBuilder() : null;
                            q qVar = (q) eVar.u(q.f45743y, fVar);
                            this.f45532y = qVar;
                            if (builder != null) {
                                builder.f(qVar);
                                this.f45532y = builder.n();
                            }
                            this.f45514c |= 16;
                            z13 = z13;
                            z11 = true;
                            break;
                        case 152:
                            this.f45514c |= 32;
                            this.f45533z = eVar.s();
                            z13 = z13;
                            z11 = true;
                            break;
                        case 242:
                            t.b builder2 = (this.f45514c & 64) == 64 ? this.A.toBuilder() : null;
                            t tVar = (t) eVar.u(t.f45836h, fVar);
                            this.A = tVar;
                            if (builder2 != null) {
                                builder2.f(tVar);
                                this.A = builder2.j();
                            }
                            this.f45514c |= 64;
                            z13 = z13;
                            z11 = true;
                            break;
                        case 248:
                            boolean z43 = (z13 ? 1 : 0) & true;
                            boolean z44 = z13;
                            if (!z43) {
                                this.B = new ArrayList();
                                z44 = (z13 ? 1 : 0) | true;
                            }
                            this.B.add(Integer.valueOf(eVar.s()));
                            z13 = z44;
                            z11 = true;
                            break;
                        case l.f.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                            int j14 = eVar.j(eVar.A());
                            boolean z45 = (z13 ? 1 : 0) & true;
                            boolean z46 = z13;
                            if (!z45) {
                                z46 = z13;
                                if (eVar.e() > 0) {
                                    this.B = new ArrayList();
                                    z46 = (z13 ? 1 : 0) | true;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.B.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j14);
                            z13 = z46;
                            z11 = true;
                            break;
                        case 258:
                            w.b builder3 = (this.f45514c & 128) == 128 ? this.C.toBuilder() : null;
                            w wVar = (w) eVar.u(w.f45885f, fVar);
                            this.C = wVar;
                            if (builder3 != null) {
                                builder3.f(wVar);
                                this.C = builder3.j();
                            }
                            this.f45514c |= 128;
                            z13 = z13;
                            z11 = true;
                            break;
                        default:
                            z11 = true;
                            if (j(eVar, J, fVar, K)) {
                                break;
                            }
                            z12 = z11;
                            break;
                    }
                    z13 = z13;
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.i(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((z13 ? 1 : 0) & true) {
                    this.f45520i = Collections.unmodifiableList(this.f45520i);
                }
                if ((z13 ? 1 : 0) & true) {
                    this.f45518g = Collections.unmodifiableList(this.f45518g);
                }
                if ((z13 ? 1 : 0) & true) {
                    this.f45519h = Collections.unmodifiableList(this.f45519h);
                }
                if ((z13 ? 1 : 0) & true) {
                    this.f45522k = Collections.unmodifiableList(this.f45522k);
                }
                if ((z13 ? 1 : 0) & true) {
                    this.f45524m = Collections.unmodifiableList(this.f45524m);
                }
                if ((z13 ? 1 : 0) & true) {
                    this.f45525n = Collections.unmodifiableList(this.f45525n);
                }
                if ((z13 ? 1 : 0) & true) {
                    this.f45526o = Collections.unmodifiableList(this.f45526o);
                }
                if ((z13 ? 1 : 0) & true) {
                    this.f45527p = Collections.unmodifiableList(this.f45527p);
                }
                if ((z13 ? 1 : 0) & true) {
                    this.f45528q = Collections.unmodifiableList(this.f45528q);
                }
                if ((z13 ? 1 : 0) & true) {
                    this.f45529t = Collections.unmodifiableList(this.f45529t);
                }
                if ((z13 ? 1 : 0) & true) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45513b = q11.l();
                    throw th3;
                }
                this.f45513b = q11.l();
                g();
                throw th2;
            }
        }
        if ((z13 ? 1 : 0) & true) {
            this.f45520i = Collections.unmodifiableList(this.f45520i);
        }
        if ((z13 ? 1 : 0) & true) {
            this.f45518g = Collections.unmodifiableList(this.f45518g);
        }
        if ((z13 ? 1 : 0) & true) {
            this.f45519h = Collections.unmodifiableList(this.f45519h);
        }
        if ((z13 ? 1 : 0) & true) {
            this.f45522k = Collections.unmodifiableList(this.f45522k);
        }
        if ((z13 ? 1 : 0) & true) {
            this.f45524m = Collections.unmodifiableList(this.f45524m);
        }
        if ((z13 ? 1 : 0) & true) {
            this.f45525n = Collections.unmodifiableList(this.f45525n);
        }
        if ((z13 ? 1 : 0) & true) {
            this.f45526o = Collections.unmodifiableList(this.f45526o);
        }
        if ((z13 ? 1 : 0) & true) {
            this.f45527p = Collections.unmodifiableList(this.f45527p);
        }
        if ((z13 ? 1 : 0) & true) {
            this.f45528q = Collections.unmodifiableList(this.f45528q);
        }
        if ((z13 ? 1 : 0) & true) {
            this.f45529t = Collections.unmodifiableList(this.f45529t);
        }
        if ((z13 ? 1 : 0) & true) {
            this.B = Collections.unmodifiableList(this.B);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45513b = q11.l();
            throw th4;
        }
        this.f45513b = q11.l();
        g();
    }
}