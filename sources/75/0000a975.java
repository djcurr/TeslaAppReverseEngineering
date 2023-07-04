package p10;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes5.dex */
public final class p extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: e  reason: collision with root package name */
    private static final p f45734e;

    /* renamed from: f  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<p> f45735f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45736a;

    /* renamed from: b  reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.protobuf.m f45737b;

    /* renamed from: c  reason: collision with root package name */
    private byte f45738c;

    /* renamed from: d  reason: collision with root package name */
    private int f45739d;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<p> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public p c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new p(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.b<p, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: b  reason: collision with root package name */
        private int f45740b;

        /* renamed from: c  reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.m f45741c = kotlin.reflect.jvm.internal.impl.protobuf.l.f35028b;

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
            if ((this.f45740b & 1) != 1) {
                this.f45741c = new kotlin.reflect.jvm.internal.impl.protobuf.l(this.f45741c);
                this.f45740b |= 1;
            }
        }

        private void n() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: i */
        public p build() {
            p j11 = j();
            if (j11.isInitialized()) {
                return j11;
            }
            throw a.AbstractC0651a.c(j11);
        }

        public p j() {
            p pVar = new p(this);
            if ((this.f45740b & 1) == 1) {
                this.f45741c = this.f45741c.getUnmodifiableView();
                this.f45740b &= -2;
            }
            pVar.f45737b = this.f45741c;
            return pVar;
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
        public p10.p.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.p> r1 = p10.p.f45735f     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.p r3 = (p10.p) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.p r4 = (p10.p) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.p.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.p$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: p */
        public b f(p pVar) {
            if (pVar == p.o()) {
                return this;
            }
            if (!pVar.f45737b.isEmpty()) {
                if (this.f45741c.isEmpty()) {
                    this.f45741c = pVar.f45737b;
                    this.f45740b &= -2;
                } else {
                    m();
                    this.f45741c.addAll(pVar.f45737b);
                }
            }
            g(e().c(pVar.f45736a));
            return this;
        }
    }

    static {
        p pVar = new p(true);
        f45734e = pVar;
        pVar.r();
    }

    public static p o() {
        return f45734e;
    }

    private void r() {
        this.f45737b = kotlin.reflect.jvm.internal.impl.protobuf.l.f35028b;
    }

    public static b s() {
        return b.h();
    }

    public static b t(p pVar) {
        return s().f(pVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        for (int i11 = 0; i11 < this.f45737b.size(); i11++) {
            codedOutputStream.O(1, this.f45737b.getByteString(i11));
        }
        codedOutputStream.i0(this.f45736a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<p> getParserForType() {
        return f45735f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45739d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f45737b.size(); i13++) {
            i12 += CodedOutputStream.e(this.f45737b.getByteString(i13));
        }
        int size = 0 + i12 + (q().size() * 1) + this.f45736a.size();
        this.f45739d = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45738c;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        this.f45738c = (byte) 1;
        return true;
    }

    public String p(int i11) {
        return this.f45737b.get(i11);
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.r q() {
        return this.f45737b;
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

    private p(h.b bVar) {
        super(bVar);
        this.f45738c = (byte) -1;
        this.f45739d = -1;
        this.f45736a = bVar.e();
    }

    private p(boolean z11) {
        this.f45738c = (byte) -1;
        this.f45739d = -1;
        this.f45736a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    private p(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45738c = (byte) -1;
        this.f45739d = -1;
        r();
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
                            if (K != 10) {
                                if (!j(eVar, J, fVar, K)) {
                                }
                            } else {
                                kotlin.reflect.jvm.internal.impl.protobuf.d l11 = eVar.l();
                                if (!(z12 & true)) {
                                    this.f45737b = new kotlin.reflect.jvm.internal.impl.protobuf.l();
                                    z12 |= true;
                                }
                                this.f45737b.p0(l11);
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
                    this.f45737b = this.f45737b.getUnmodifiableView();
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45736a = q11.l();
                    throw th3;
                }
                this.f45736a = q11.l();
                g();
                throw th2;
            }
        }
        if (z12 & true) {
            this.f45737b = this.f45737b.getUnmodifiableView();
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45736a = q11.l();
            throw th4;
        }
        this.f45736a = q11.l();
        g();
    }
}