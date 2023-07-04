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
public final class e extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: e  reason: collision with root package name */
    private static final e f45566e;

    /* renamed from: f  reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<e> f45567f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45568a;

    /* renamed from: b  reason: collision with root package name */
    private List<f> f45569b;

    /* renamed from: c  reason: collision with root package name */
    private byte f45570c;

    /* renamed from: d  reason: collision with root package name */
    private int f45571d;

    /* loaded from: classes5.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<e> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m */
        public e c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new e(eVar, fVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends h.b<e, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: b  reason: collision with root package name */
        private int f45572b;

        /* renamed from: c  reason: collision with root package name */
        private List<f> f45573c = Collections.emptyList();

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
            if ((this.f45572b & 1) != 1) {
                this.f45573c = new ArrayList(this.f45573c);
                this.f45572b |= 1;
            }
        }

        private void n() {
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
            if ((this.f45572b & 1) == 1) {
                this.f45573c = Collections.unmodifiableList(this.f45573c);
                this.f45572b &= -2;
            }
            eVar.f45569b = this.f45573c;
            return eVar;
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
        public p10.e.b b(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<p10.e> r1 = p10.e.f45567f     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                p10.e r3 = (p10.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                p10.e r4 = (p10.e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: p10.e.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):p10.e$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: p */
        public b f(e eVar) {
            if (eVar == e.o()) {
                return this;
            }
            if (!eVar.f45569b.isEmpty()) {
                if (this.f45573c.isEmpty()) {
                    this.f45573c = eVar.f45569b;
                    this.f45572b &= -2;
                } else {
                    m();
                    this.f45573c.addAll(eVar.f45569b);
                }
            }
            g(e().c(eVar.f45568a));
            return this;
        }
    }

    static {
        e eVar = new e(true);
        f45566e = eVar;
        eVar.r();
    }

    public static e o() {
        return f45566e;
    }

    private void r() {
        this.f45569b = Collections.emptyList();
    }

    public static b s() {
        return b.h();
    }

    public static b t(e eVar) {
        return s().f(eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void a(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        for (int i11 = 0; i11 < this.f45569b.size(); i11++) {
            codedOutputStream.d0(1, this.f45569b.get(i11));
        }
        codedOutputStream.i0(this.f45568a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<e> getParserForType() {
        return f45567f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int getSerializedSize() {
        int i11 = this.f45571d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f45569b.size(); i13++) {
            i12 += CodedOutputStream.s(1, this.f45569b.get(i13));
        }
        int size = i12 + this.f45568a.size();
        this.f45571d = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b11 = this.f45570c;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < q(); i11++) {
            if (!p(i11).isInitialized()) {
                this.f45570c = (byte) 0;
                return false;
            }
        }
        this.f45570c = (byte) 1;
        return true;
    }

    public f p(int i11) {
        return this.f45569b.get(i11);
    }

    public int q() {
        return this.f45569b.size();
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

    private e(h.b bVar) {
        super(bVar);
        this.f45570c = (byte) -1;
        this.f45571d = -1;
        this.f45568a = bVar.e();
    }

    private e(boolean z11) {
        this.f45570c = (byte) -1;
        this.f45571d = -1;
        this.f45568a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45570c = (byte) -1;
        this.f45571d = -1;
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
                                this.f45569b = new ArrayList();
                                z12 |= true;
                            }
                            this.f45569b.add(eVar.u(f.f45575j, fVar));
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
                    this.f45569b = Collections.unmodifiableList(this.f45569b);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f45568a = q11.l();
                    throw th3;
                }
                this.f45568a = q11.l();
                g();
                throw th2;
            }
        }
        if (z12 & true) {
            this.f45569b = Collections.unmodifiableList(this.f45569b);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f45568a = q11.l();
            throw th4;
        }
        this.f45568a = q11.l();
        g();
    }
}