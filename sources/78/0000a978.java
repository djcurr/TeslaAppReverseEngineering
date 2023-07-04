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
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class q extends h.d<q> {

    /* renamed from: x  reason: collision with root package name */
    private static final q f45742x;

    /* renamed from: y  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<q> f45743y = new a();

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45744b;

    /* renamed from: c  reason: collision with root package name */
    private int f45745c;

    /* renamed from: d  reason: collision with root package name */
    private List<b> f45746d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f45747e;

    /* renamed from: f  reason: collision with root package name */
    private int f45748f;

    /* renamed from: g  reason: collision with root package name */
    private q f45749g;

    /* renamed from: h  reason: collision with root package name */
    private int f45750h;

    /* renamed from: i  reason: collision with root package name */
    private int f45751i;

    /* renamed from: j  reason: collision with root package name */
    private int f45752j;

    /* renamed from: k  reason: collision with root package name */
    private int f45753k;

    /* renamed from: l  reason: collision with root package name */
    private int f45754l;

    /* renamed from: m  reason: collision with root package name */
    private q f45755m;

    /* renamed from: n  reason: collision with root package name */
    private int f45756n;

    /* renamed from: o  reason: collision with root package name */
    private q f45757o;

    /* renamed from: p  reason: collision with root package name */
    private int f45758p;

    /* renamed from: q  reason: collision with root package name */
    private int f45759q;

    /* renamed from: t  reason: collision with root package name */
    private byte f45760t;

    /* renamed from: w  reason: collision with root package name */
    private int f45761w;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<q> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public q c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new q(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends h.c<q, c> {

        /* renamed from: d  reason: collision with root package name */
        private int f45775d;

        /* renamed from: f  reason: collision with root package name */
        private boolean f45777f;

        /* renamed from: g  reason: collision with root package name */
        private int f45778g;

        /* renamed from: i  reason: collision with root package name */
        private int f45780i;

        /* renamed from: j  reason: collision with root package name */
        private int f45781j;

        /* renamed from: k  reason: collision with root package name */
        private int f45782k;

        /* renamed from: l  reason: collision with root package name */
        private int f45783l;

        /* renamed from: m  reason: collision with root package name */
        private int f45784m;

        /* renamed from: o  reason: collision with root package name */
        private int f45786o;

        /* renamed from: q  reason: collision with root package name */
        private int f45788q;

        /* renamed from: t  reason: collision with root package name */
        private int f45789t;

        /* renamed from: e  reason: collision with root package name */
        private List<b> f45776e = Collections.emptyList();

        /* renamed from: h  reason: collision with root package name */
        private q f45779h = q.S();

        /* renamed from: n  reason: collision with root package name */
        private q f45785n = q.S();

        /* renamed from: p  reason: collision with root package name */
        private q f45787p = q.S();

        private c() {
            r();
        }

        static /* synthetic */ c l() {
            return p();
        }

        private static c p() {
            return new c();
        }

        private void q() {
            if ((this.f45775d & 1) != 1) {
                this.f45776e = new ArrayList(this.f45776e);
                this.f45775d |= 1;
            }
        }

        private void r() {
        }

        public c A(int i11) {
            this.f45775d |= 4;
            this.f45778g = i11;
            return this;
        }

        public c B(int i11) {
            this.f45775d |= 16;
            this.f45780i = i11;
            return this;
        }

        public c C(boolean z11) {
            this.f45775d |= 2;
            this.f45777f = z11;
            return this;
        }

        public c E(int i11) {
            this.f45775d |= 1024;
            this.f45786o = i11;
            return this;
        }

        public c F(int i11) {
            this.f45775d |= 256;
            this.f45784m = i11;
            return this;
        }

        public c G(int i11) {
            this.f45775d |= 64;
            this.f45782k = i11;
            return this;
        }

        public c H(int i11) {
            this.f45775d |= 128;
            this.f45783l = i11;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: m */
        public q build() {
            q n11 = n();
            if (n11.isInitialized()) {
                return n11;
            }
            throw a.AbstractC0651a.c(n11);
        }

        public q n() {
            q qVar = new q(this);
            int i11 = this.f45775d;
            if ((i11 & 1) == 1) {
                this.f45776e = Collections.unmodifiableList(this.f45776e);
                this.f45775d &= -2;
            }
            qVar.f45746d = this.f45776e;
            int i12 = (i11 & 2) != 2 ? 0 : 1;
            qVar.f45747e = this.f45777f;
            if ((i11 & 4) == 4) {
                i12 |= 2;
            }
            qVar.f45748f = this.f45778g;
            if ((i11 & 8) == 8) {
                i12 |= 4;
            }
            qVar.f45749g = this.f45779h;
            if ((i11 & 16) == 16) {
                i12 |= 8;
            }
            qVar.f45750h = this.f45780i;
            if ((i11 & 32) == 32) {
                i12 |= 16;
            }
            qVar.f45751i = this.f45781j;
            if ((i11 & 64) == 64) {
                i12 |= 32;
            }
            qVar.f45752j = this.f45782k;
            if ((i11 & 128) == 128) {
                i12 |= 64;
            }
            qVar.f45753k = this.f45783l;
            if ((i11 & 256) == 256) {
                i12 |= 128;
            }
            qVar.f45754l = this.f45784m;
            if ((i11 & 512) == 512) {
                i12 |= 256;
            }
            qVar.f45755m = this.f45785n;
            if ((i11 & 1024) == 1024) {
                i12 |= 512;
            }
            qVar.f45756n = this.f45786o;
            if ((i11 & 2048) == 2048) {
                i12 |= 1024;
            }
            qVar.f45757o = this.f45787p;
            if ((i11 & 4096) == 4096) {
                i12 |= 2048;
            }
            qVar.f45758p = this.f45788q;
            if ((i11 & PKIFailureInfo.certRevoked) == 8192) {
                i12 |= 4096;
            }
            qVar.f45759q = this.f45789t;
            qVar.f45745c = i12;
            return qVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: o */
        public c d() {
            return p().f(n());
        }

        public c s(q qVar) {
            if ((this.f45775d & 2048) == 2048 && this.f45787p != q.S()) {
                this.f45787p = q.t0(this.f45787p).f(qVar).n();
            } else {
                this.f45787p = qVar;
            }
            this.f45775d |= 2048;
            return this;
        }

        public c t(q qVar) {
            if ((this.f45775d & 8) == 8 && this.f45779h != q.S()) {
                this.f45779h = q.t0(this.f45779h).f(qVar).n();
            } else {
                this.f45779h = qVar;
            }
            this.f45775d |= 8;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
        /* renamed from: u */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p10.q.c b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.q> r1 = p10.q.f45743y     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.q r3 = (p10.q) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.q r4 = (p10.q) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.q.c.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.q$c");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v */
        public c f(q qVar) {
            if (qVar == q.S()) {
                return this;
            }
            if (!qVar.f45746d.isEmpty()) {
                if (this.f45776e.isEmpty()) {
                    this.f45776e = qVar.f45746d;
                    this.f45775d &= -2;
                } else {
                    q();
                    this.f45776e.addAll(qVar.f45746d);
                }
            }
            if (qVar.l0()) {
                C(qVar.Y());
            }
            if (qVar.i0()) {
                A(qVar.V());
            }
            if (qVar.j0()) {
                t(qVar.W());
            }
            if (qVar.k0()) {
                B(qVar.X());
            }
            if (qVar.g0()) {
                y(qVar.R());
            }
            if (qVar.p0()) {
                G(qVar.c0());
            }
            if (qVar.q0()) {
                H(qVar.d0());
            }
            if (qVar.o0()) {
                F(qVar.b0());
            }
            if (qVar.m0()) {
                w(qVar.Z());
            }
            if (qVar.n0()) {
                E(qVar.a0());
            }
            if (qVar.e0()) {
                s(qVar.M());
            }
            if (qVar.f0()) {
                x(qVar.N());
            }
            if (qVar.h0()) {
                z(qVar.U());
            }
            k(qVar);
            g(e().c(qVar.f45744b));
            return this;
        }

        public c w(q qVar) {
            if ((this.f45775d & 512) == 512 && this.f45785n != q.S()) {
                this.f45785n = q.t0(this.f45785n).f(qVar).n();
            } else {
                this.f45785n = qVar;
            }
            this.f45775d |= 512;
            return this;
        }

        public c x(int i11) {
            this.f45775d |= 4096;
            this.f45788q = i11;
            return this;
        }

        public c y(int i11) {
            this.f45775d |= 32;
            this.f45781j = i11;
            return this;
        }

        public c z(int i11) {
            this.f45775d |= PKIFailureInfo.certRevoked;
            this.f45789t = i11;
            return this;
        }
    }

    static {
        q qVar = new q(true);
        f45742x = qVar;
        qVar.r0();
    }

    public static q S() {
        return f45742x;
    }

    private void r0() {
        this.f45746d = Collections.emptyList();
        this.f45747e = false;
        this.f45748f = 0;
        this.f45749g = S();
        this.f45750h = 0;
        this.f45751i = 0;
        this.f45752j = 0;
        this.f45753k = 0;
        this.f45754l = 0;
        this.f45755m = S();
        this.f45756n = 0;
        this.f45757o = S();
        this.f45758p = 0;
        this.f45759q = 0;
    }

    public static c s0() {
        return c.l();
    }

    public static c t0(q qVar) {
        return s0().f(qVar);
    }

    public q M() {
        return this.f45757o;
    }

    public int N() {
        return this.f45758p;
    }

    public b O(int i11) {
        return this.f45746d.get(i11);
    }

    public int P() {
        return this.f45746d.size();
    }

    public List<b> Q() {
        return this.f45746d;
    }

    public int R() {
        return this.f45751i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: T */
    public q getDefaultInstanceForType() {
        return f45742x;
    }

    public int U() {
        return this.f45759q;
    }

    public int V() {
        return this.f45748f;
    }

    public q W() {
        return this.f45749g;
    }

    public int X() {
        return this.f45750h;
    }

    public boolean Y() {
        return this.f45747e;
    }

    public q Z() {
        return this.f45755m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        h.d<MessageType>.a s11 = s();
        if ((this.f45745c & 4096) == 4096) {
            codedOutputStream.a0(1, this.f45759q);
        }
        for (int i11 = 0; i11 < this.f45746d.size(); i11++) {
            codedOutputStream.d0(2, this.f45746d.get(i11));
        }
        if ((this.f45745c & 1) == 1) {
            codedOutputStream.L(3, this.f45747e);
        }
        if ((this.f45745c & 2) == 2) {
            codedOutputStream.a0(4, this.f45748f);
        }
        if ((this.f45745c & 4) == 4) {
            codedOutputStream.d0(5, this.f45749g);
        }
        if ((this.f45745c & 16) == 16) {
            codedOutputStream.a0(6, this.f45751i);
        }
        if ((this.f45745c & 32) == 32) {
            codedOutputStream.a0(7, this.f45752j);
        }
        if ((this.f45745c & 8) == 8) {
            codedOutputStream.a0(8, this.f45750h);
        }
        if ((this.f45745c & 64) == 64) {
            codedOutputStream.a0(9, this.f45753k);
        }
        if ((this.f45745c & 256) == 256) {
            codedOutputStream.d0(10, this.f45755m);
        }
        if ((this.f45745c & 512) == 512) {
            codedOutputStream.a0(11, this.f45756n);
        }
        if ((this.f45745c & 128) == 128) {
            codedOutputStream.a0(12, this.f45754l);
        }
        if ((this.f45745c & 1024) == 1024) {
            codedOutputStream.d0(13, this.f45757o);
        }
        if ((this.f45745c & 2048) == 2048) {
            codedOutputStream.a0(14, this.f45758p);
        }
        s11.a(200, codedOutputStream);
        codedOutputStream.i0(this.f45744b);
    }

    public int a0() {
        return this.f45756n;
    }

    public int b0() {
        return this.f45754l;
    }

    public int c0() {
        return this.f45752j;
    }

    public int d0() {
        return this.f45753k;
    }

    public boolean e0() {
        return (this.f45745c & 1024) == 1024;
    }

    public boolean f0() {
        return (this.f45745c & 2048) == 2048;
    }

    public boolean g0() {
        return (this.f45745c & 16) == 16;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<q> getParserForType() {
        return f45743y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45761w;
        if (i11 != -1) {
            return i11;
        }
        int o11 = (this.f45745c & 4096) == 4096 ? CodedOutputStream.o(1, this.f45759q) + 0 : 0;
        for (int i12 = 0; i12 < this.f45746d.size(); i12++) {
            o11 += CodedOutputStream.s(2, this.f45746d.get(i12));
        }
        if ((this.f45745c & 1) == 1) {
            o11 += CodedOutputStream.a(3, this.f45747e);
        }
        if ((this.f45745c & 2) == 2) {
            o11 += CodedOutputStream.o(4, this.f45748f);
        }
        if ((this.f45745c & 4) == 4) {
            o11 += CodedOutputStream.s(5, this.f45749g);
        }
        if ((this.f45745c & 16) == 16) {
            o11 += CodedOutputStream.o(6, this.f45751i);
        }
        if ((this.f45745c & 32) == 32) {
            o11 += CodedOutputStream.o(7, this.f45752j);
        }
        if ((this.f45745c & 8) == 8) {
            o11 += CodedOutputStream.o(8, this.f45750h);
        }
        if ((this.f45745c & 64) == 64) {
            o11 += CodedOutputStream.o(9, this.f45753k);
        }
        if ((this.f45745c & 256) == 256) {
            o11 += CodedOutputStream.s(10, this.f45755m);
        }
        if ((this.f45745c & 512) == 512) {
            o11 += CodedOutputStream.o(11, this.f45756n);
        }
        if ((this.f45745c & 128) == 128) {
            o11 += CodedOutputStream.o(12, this.f45754l);
        }
        if ((this.f45745c & 1024) == 1024) {
            o11 += CodedOutputStream.s(13, this.f45757o);
        }
        if ((this.f45745c & 2048) == 2048) {
            o11 += CodedOutputStream.o(14, this.f45758p);
        }
        int n11 = o11 + n() + this.f45744b.size();
        this.f45761w = n11;
        return n11;
    }

    public boolean h0() {
        return (this.f45745c & 4096) == 4096;
    }

    public boolean i0() {
        return (this.f45745c & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45760t;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < P(); i11++) {
            if (!O(i11).isInitialized()) {
                this.f45760t = (byte) 0;
                return false;
            }
        }
        if (j0() && !W().isInitialized()) {
            this.f45760t = (byte) 0;
            return false;
        } else if (m0() && !Z().isInitialized()) {
            this.f45760t = (byte) 0;
            return false;
        } else if (e0() && !M().isInitialized()) {
            this.f45760t = (byte) 0;
            return false;
        } else if (!m()) {
            this.f45760t = (byte) 0;
            return false;
        } else {
            this.f45760t = (byte) 1;
            return true;
        }
    }

    public boolean j0() {
        return (this.f45745c & 4) == 4;
    }

    public boolean k0() {
        return (this.f45745c & 8) == 8;
    }

    public boolean l0() {
        return (this.f45745c & 1) == 1;
    }

    public boolean m0() {
        return (this.f45745c & 256) == 256;
    }

    public boolean n0() {
        return (this.f45745c & 512) == 512;
    }

    public boolean o0() {
        return (this.f45745c & 128) == 128;
    }

    public boolean p0() {
        return (this.f45745c & 32) == 32;
    }

    public boolean q0() {
        return (this.f45745c & 64) == 64;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: u0 */
    public c newBuilderForType() {
        return s0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: v0 */
    public c toBuilder() {
        return t0(this);
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: h  reason: collision with root package name */
        private static final b f45762h;

        /* renamed from: i  reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<b> f45763i = new a();

        /* renamed from: a  reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f45764a;

        /* renamed from: b  reason: collision with root package name */
        private int f45765b;

        /* renamed from: c  reason: collision with root package name */
        private c f45766c;

        /* renamed from: d  reason: collision with root package name */
        private q f45767d;

        /* renamed from: e  reason: collision with root package name */
        private int f45768e;

        /* renamed from: f  reason: collision with root package name */
        private byte f45769f;

        /* renamed from: g  reason: collision with root package name */
        private int f45770g;

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

        /* renamed from: p10.q$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0976b extends h.b<b, C0976b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

            /* renamed from: b  reason: collision with root package name */
            private int f45771b;

            /* renamed from: c  reason: collision with root package name */
            private c f45772c = c.INV;

            /* renamed from: d  reason: collision with root package name */
            private q f45773d = q.S();

            /* renamed from: e  reason: collision with root package name */
            private int f45774e;

            private C0976b() {
                m();
            }

            static /* synthetic */ C0976b h() {
                return l();
            }

            private static C0976b l() {
                return new C0976b();
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
                int i11 = this.f45771b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                bVar.f45766c = this.f45772c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                bVar.f45767d = this.f45773d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                bVar.f45768e = this.f45774e;
                bVar.f45765b = i12;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: k */
            public C0976b d() {
                return l().f(j());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0651a
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p10.q.b.C0976b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<p10.q$b> r1 = p10.q.b.f45763i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    p10.q$b r3 = (p10.q.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    p10.q$b r4 = (p10.q.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: p10.q.b.C0976b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.q$b$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: o */
            public C0976b f(b bVar) {
                if (bVar == b.q()) {
                    return this;
                }
                if (bVar.u()) {
                    q(bVar.r());
                }
                if (bVar.v()) {
                    p(bVar.s());
                }
                if (bVar.w()) {
                    r(bVar.t());
                }
                g(e().c(bVar.f45764a));
                return this;
            }

            public C0976b p(q qVar) {
                if ((this.f45771b & 2) == 2 && this.f45773d != q.S()) {
                    this.f45773d = q.t0(this.f45773d).f(qVar).n();
                } else {
                    this.f45773d = qVar;
                }
                this.f45771b |= 2;
                return this;
            }

            public C0976b q(c cVar) {
                Objects.requireNonNull(cVar);
                this.f45771b |= 1;
                this.f45772c = cVar;
                return this;
            }

            public C0976b r(int i11) {
                this.f45771b |= 4;
                this.f45774e = i11;
                return this;
            }
        }

        /* loaded from: classes5.dex */
        public enum c implements i.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            
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
                            if (i11 != 3) {
                                return null;
                            }
                            return STAR;
                        }
                        return INV;
                    }
                    return OUT;
                }
                return IN;
            }
        }

        static {
            b bVar = new b(true);
            f45762h = bVar;
            bVar.x();
        }

        public static b q() {
            return f45762h;
        }

        private void x() {
            this.f45766c = c.INV;
            this.f45767d = q.S();
            this.f45768e = 0;
        }

        public static C0976b y() {
            return C0976b.h();
        }

        public static C0976b z(b bVar) {
            return y().f(bVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: A */
        public C0976b newBuilderForType() {
            return y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: B */
        public C0976b toBuilder() {
            return z(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f45765b & 1) == 1) {
                codedOutputStream.S(1, this.f45766c.getNumber());
            }
            if ((this.f45765b & 2) == 2) {
                codedOutputStream.d0(2, this.f45767d);
            }
            if ((this.f45765b & 4) == 4) {
                codedOutputStream.a0(3, this.f45768e);
            }
            codedOutputStream.i0(this.f45764a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<b> getParserForType() {
            return f45763i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int getSerializedSize() {
            int i11 = this.f45770g;
            if (i11 != -1) {
                return i11;
            }
            int h11 = (this.f45765b & 1) == 1 ? 0 + CodedOutputStream.h(1, this.f45766c.getNumber()) : 0;
            if ((this.f45765b & 2) == 2) {
                h11 += CodedOutputStream.s(2, this.f45767d);
            }
            if ((this.f45765b & 4) == 4) {
                h11 += CodedOutputStream.o(3, this.f45768e);
            }
            int size = h11 + this.f45764a.size();
            this.f45770g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b11 = this.f45769f;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (v() && !s().isInitialized()) {
                this.f45769f = (byte) 0;
                return false;
            }
            this.f45769f = (byte) 1;
            return true;
        }

        public c r() {
            return this.f45766c;
        }

        public q s() {
            return this.f45767d;
        }

        public int t() {
            return this.f45768e;
        }

        public boolean u() {
            return (this.f45765b & 1) == 1;
        }

        public boolean v() {
            return (this.f45765b & 2) == 2;
        }

        public boolean w() {
            return (this.f45765b & 4) == 4;
        }

        private b(h.b bVar) {
            super(bVar);
            this.f45769f = (byte) -1;
            this.f45770g = -1;
            this.f45764a = bVar.e();
        }

        private b(boolean z11) {
            this.f45769f = (byte) -1;
            this.f45770g = -1;
            this.f45764a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
        }

        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            this.f45769f = (byte) -1;
            this.f45770g = -1;
            x();
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
                                    int n11 = eVar.n();
                                    c valueOf = c.valueOf(n11);
                                    if (valueOf == null) {
                                        J.o0(K);
                                        J.o0(n11);
                                    } else {
                                        this.f45765b |= 1;
                                        this.f45766c = valueOf;
                                    }
                                } else if (K == 18) {
                                    c builder = (this.f45765b & 2) == 2 ? this.f45767d.toBuilder() : null;
                                    q qVar = (q) eVar.u(q.f45743y, fVar);
                                    this.f45767d = qVar;
                                    if (builder != null) {
                                        builder.f(qVar);
                                        this.f45767d = builder.n();
                                    }
                                    this.f45765b |= 2;
                                } else if (K != 24) {
                                    if (!j(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    this.f45765b |= 4;
                                    this.f45768e = eVar.s();
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
                        this.f45764a = q11.l();
                        throw th3;
                    }
                    this.f45764a = q11.l();
                    g();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f45764a = q11.l();
                throw th4;
            }
            this.f45764a = q11.l();
            g();
        }
    }

    private q(h.c<q, ?> cVar) {
        super(cVar);
        this.f45760t = (byte) -1;
        this.f45761w = -1;
        this.f45744b = cVar.e();
    }

    private q(boolean z11) {
        this.f45760t = (byte) -1;
        this.f45761w = -1;
        this.f45744b = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        c builder;
        this.f45760t = (byte) -1;
        this.f45761w = -1;
        r0();
        d.b q11 = kotlin.reflect.jvm.internal.impl.protobuf.d.q();
        CodedOutputStream J = CodedOutputStream.J(q11, 1);
        boolean z11 = false;
        boolean z12 = false;
        while (!z11) {
            try {
                try {
                    int K = eVar.K();
                    switch (K) {
                        case 0:
                            break;
                        case 8:
                            this.f45745c |= 4096;
                            this.f45759q = eVar.s();
                            continue;
                        case 18:
                            if (!(z12 & true)) {
                                this.f45746d = new ArrayList();
                                z12 |= true;
                            }
                            this.f45746d.add(eVar.u(b.f45763i, fVar));
                            continue;
                        case 24:
                            this.f45745c |= 1;
                            this.f45747e = eVar.k();
                            continue;
                        case 32:
                            this.f45745c |= 2;
                            this.f45748f = eVar.s();
                            continue;
                        case 42:
                            builder = (this.f45745c & 4) == 4 ? this.f45749g.toBuilder() : null;
                            q qVar = (q) eVar.u(f45743y, fVar);
                            this.f45749g = qVar;
                            if (builder != null) {
                                builder.f(qVar);
                                this.f45749g = builder.n();
                            }
                            this.f45745c |= 4;
                            continue;
                        case 48:
                            this.f45745c |= 16;
                            this.f45751i = eVar.s();
                            continue;
                        case 56:
                            this.f45745c |= 32;
                            this.f45752j = eVar.s();
                            continue;
                        case 64:
                            this.f45745c |= 8;
                            this.f45750h = eVar.s();
                            continue;
                        case 72:
                            this.f45745c |= 64;
                            this.f45753k = eVar.s();
                            continue;
                        case 82:
                            builder = (this.f45745c & 256) == 256 ? this.f45755m.toBuilder() : null;
                            q qVar2 = (q) eVar.u(f45743y, fVar);
                            this.f45755m = qVar2;
                            if (builder != null) {
                                builder.f(qVar2);
                                this.f45755m = builder.n();
                            }
                            this.f45745c |= 256;
                            continue;
                        case 88:
                            this.f45745c |= 512;
                            this.f45756n = eVar.s();
                            continue;
                        case 96:
                            this.f45745c |= 128;
                            this.f45754l = eVar.s();
                            continue;
                        case 106:
                            builder = (this.f45745c & 1024) == 1024 ? this.f45757o.toBuilder() : null;
                            q qVar3 = (q) eVar.u(f45743y, fVar);
                            this.f45757o = qVar3;
                            if (builder != null) {
                                builder.f(qVar3);
                                this.f45757o = builder.n();
                            }
                            this.f45745c |= 1024;
                            continue;
                        case 112:
                            this.f45745c |= 2048;
                            this.f45758p = eVar.s();
                            continue;
                        default:
                            if (!j(eVar, J, fVar, K)) {
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
                if (z12 & true) {
                    this.f45746d = Collections.unmodifiableList(this.f45746d);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45744b = q11.l();
                    throw th3;
                }
                this.f45744b = q11.l();
                g();
                throw th2;
            }
        }
        if (z12 & true) {
            this.f45746d = Collections.unmodifiableList(this.f45746d);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45744b = q11.l();
            throw th4;
        }
        this.f45744b = q11.l();
        g();
    }
}