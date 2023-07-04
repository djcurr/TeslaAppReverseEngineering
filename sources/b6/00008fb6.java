package okio;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f42701a;

    /* renamed from: b  reason: collision with root package name */
    public int f42702b;

    /* renamed from: c  reason: collision with root package name */
    public int f42703c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42704d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42705e;

    /* renamed from: f  reason: collision with root package name */
    public z f42706f;

    /* renamed from: g  reason: collision with root package name */
    public z f42707g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public z() {
        this.f42701a = new byte[PKIFailureInfo.certRevoked];
        this.f42705e = true;
        this.f42704d = false;
    }

    public final void a() {
        z zVar = this.f42707g;
        int i11 = 0;
        if (zVar != this) {
            kotlin.jvm.internal.s.e(zVar);
            if (zVar.f42705e) {
                int i12 = this.f42703c - this.f42702b;
                z zVar2 = this.f42707g;
                kotlin.jvm.internal.s.e(zVar2);
                int i13 = 8192 - zVar2.f42703c;
                z zVar3 = this.f42707g;
                kotlin.jvm.internal.s.e(zVar3);
                if (!zVar3.f42704d) {
                    z zVar4 = this.f42707g;
                    kotlin.jvm.internal.s.e(zVar4);
                    i11 = zVar4.f42702b;
                }
                if (i12 > i13 + i11) {
                    return;
                }
                z zVar5 = this.f42707g;
                kotlin.jvm.internal.s.e(zVar5);
                g(zVar5, i12);
                b();
                a0.b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final z b() {
        z zVar = this.f42706f;
        if (zVar == this) {
            zVar = null;
        }
        z zVar2 = this.f42707g;
        kotlin.jvm.internal.s.e(zVar2);
        zVar2.f42706f = this.f42706f;
        z zVar3 = this.f42706f;
        kotlin.jvm.internal.s.e(zVar3);
        zVar3.f42707g = this.f42707g;
        this.f42706f = null;
        this.f42707g = null;
        return zVar;
    }

    public final z c(z segment) {
        kotlin.jvm.internal.s.g(segment, "segment");
        segment.f42707g = this;
        segment.f42706f = this.f42706f;
        z zVar = this.f42706f;
        kotlin.jvm.internal.s.e(zVar);
        zVar.f42707g = segment;
        this.f42706f = segment;
        return segment;
    }

    public final z d() {
        this.f42704d = true;
        return new z(this.f42701a, this.f42702b, this.f42703c, true, false);
    }

    public final z e(int i11) {
        z c11;
        if (i11 > 0 && i11 <= this.f42703c - this.f42702b) {
            if (i11 >= 1024) {
                c11 = d();
            } else {
                c11 = a0.c();
                byte[] bArr = this.f42701a;
                byte[] bArr2 = c11.f42701a;
                int i12 = this.f42702b;
                wz.o.l(bArr, bArr2, 0, i12, i12 + i11, 2, null);
            }
            c11.f42703c = c11.f42702b + i11;
            this.f42702b += i11;
            z zVar = this.f42707g;
            kotlin.jvm.internal.s.e(zVar);
            zVar.c(c11);
            return c11;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final z f() {
        byte[] bArr = this.f42701a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.s.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new z(copyOf, this.f42702b, this.f42703c, false, true);
    }

    public final void g(z sink, int i11) {
        kotlin.jvm.internal.s.g(sink, "sink");
        if (sink.f42705e) {
            int i12 = sink.f42703c;
            if (i12 + i11 > 8192) {
                if (!sink.f42704d) {
                    int i13 = sink.f42702b;
                    if ((i12 + i11) - i13 <= 8192) {
                        byte[] bArr = sink.f42701a;
                        wz.o.l(bArr, bArr, 0, i13, i12, 2, null);
                        sink.f42703c -= sink.f42702b;
                        sink.f42702b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f42701a;
            byte[] bArr3 = sink.f42701a;
            int i14 = sink.f42703c;
            int i15 = this.f42702b;
            wz.o.f(bArr2, bArr3, i14, i15, i15 + i11);
            sink.f42703c += i11;
            this.f42702b += i11;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public z(byte[] data, int i11, int i12, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(data, "data");
        this.f42701a = data;
        this.f42702b = i11;
        this.f42703c = i12;
        this.f42704d = z11;
        this.f42705e = z12;
    }
}