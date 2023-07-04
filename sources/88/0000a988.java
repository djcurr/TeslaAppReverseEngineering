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
public final class t extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: g  reason: collision with root package name */
    private static final t f45835g;

    /* renamed from: h  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<t> f45836h = new a();

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45837a;

    /* renamed from: b  reason: collision with root package name */
    private int f45838b;

    /* renamed from: c  reason: collision with root package name */
    private List<q> f45839c;

    /* renamed from: d  reason: collision with root package name */
    private int f45840d;

    /* renamed from: e  reason: collision with root package name */
    private byte f45841e;

    /* renamed from: f  reason: collision with root package name */
    private int f45842f;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<t> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public t c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new t(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.b<t, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: b  reason: collision with root package name */
        private int f45843b;

        /* renamed from: c  reason: collision with root package name */
        private List<q> f45844c = Collections.emptyList();

        /* renamed from: d  reason: collision with root package name */
        private int f45845d = -1;

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
            if ((this.f45843b & 1) != 1) {
                this.f45844c = new ArrayList(this.f45844c);
                this.f45843b |= 1;
            }
        }

        private void n() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: i */
        public t build() {
            t j11 = j();
            if (j11.isInitialized()) {
                return j11;
            }
            throw a.AbstractC0651a.c(j11);
        }

        public t j() {
            t tVar = new t(this);
            int i11 = this.f45843b;
            if ((i11 & 1) == 1) {
                this.f45844c = Collections.unmodifiableList(this.f45844c);
                this.f45843b &= -2;
            }
            tVar.f45839c = this.f45844c;
            int i12 = (i11 & 2) != 2 ? 0 : 1;
            tVar.f45840d = this.f45845d;
            tVar.f45838b = i12;
            return tVar;
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
        public p10.t.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.t> r1 = p10.t.f45836h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.t r3 = (p10.t) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.t r4 = (p10.t) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.t.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.t$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: p */
        public b f(t tVar) {
            if (tVar == t.q()) {
                return this;
            }
            if (!tVar.f45839c.isEmpty()) {
                if (this.f45844c.isEmpty()) {
                    this.f45844c = tVar.f45839c;
                    this.f45843b &= -2;
                } else {
                    m();
                    this.f45844c.addAll(tVar.f45839c);
                }
            }
            if (tVar.v()) {
                q(tVar.r());
            }
            g(e().c(tVar.f45837a));
            return this;
        }

        public b q(int i11) {
            this.f45843b |= 2;
            this.f45845d = i11;
            return this;
        }
    }

    static {
        t tVar = new t(true);
        f45835g = tVar;
        tVar.w();
    }

    public static t q() {
        return f45835g;
    }

    private void w() {
        this.f45839c = Collections.emptyList();
        this.f45840d = -1;
    }

    public static b x() {
        return b.h();
    }

    public static b y(t tVar) {
        return x().f(tVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: A */
    public b toBuilder() {
        return y(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        for (int i11 = 0; i11 < this.f45839c.size(); i11++) {
            codedOutputStream.d0(1, this.f45839c.get(i11));
        }
        if ((this.f45838b & 1) == 1) {
            codedOutputStream.a0(2, this.f45840d);
        }
        codedOutputStream.i0(this.f45837a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<t> getParserForType() {
        return f45836h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45842f;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f45839c.size(); i13++) {
            i12 += CodedOutputStream.s(1, this.f45839c.get(i13));
        }
        if ((this.f45838b & 1) == 1) {
            i12 += CodedOutputStream.o(2, this.f45840d);
        }
        int size = i12 + this.f45837a.size();
        this.f45842f = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45841e;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < t(); i11++) {
            if (!s(i11).isInitialized()) {
                this.f45841e = (byte) 0;
                return false;
            }
        }
        this.f45841e = (byte) 1;
        return true;
    }

    public int r() {
        return this.f45840d;
    }

    public q s(int i11) {
        return this.f45839c.get(i11);
    }

    public int t() {
        return this.f45839c.size();
    }

    public List<q> u() {
        return this.f45839c;
    }

    public boolean v() {
        return (this.f45838b & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: z */
    public b newBuilderForType() {
        return x();
    }

    private t(h.b bVar) {
        super(bVar);
        this.f45841e = (byte) -1;
        this.f45842f = -1;
        this.f45837a = bVar.e();
    }

    private t(boolean z11) {
        this.f45841e = (byte) -1;
        this.f45842f = -1;
        this.f45837a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private t(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45841e = (byte) -1;
        this.f45842f = -1;
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
                        if (K == 10) {
                            if (!(z12 & true)) {
                                this.f45839c = new ArrayList();
                                z12 |= true;
                            }
                            this.f45839c.add(eVar.u(q.f45743y, fVar));
                        } else if (K != 16) {
                            if (!j(eVar, J, fVar, K)) {
                            }
                        } else {
                            this.f45838b |= 1;
                            this.f45840d = eVar.s();
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
                    this.f45839c = Collections.unmodifiableList(this.f45839c);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45837a = q11.l();
                    throw th3;
                }
                this.f45837a = q11.l();
                g();
                throw th2;
            }
        }
        if (z12 & true) {
            this.f45839c = Collections.unmodifiableList(this.f45839c);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45837a = q11.l();
            throw th4;
        }
        this.f45837a = q11.l();
        g();
    }
}