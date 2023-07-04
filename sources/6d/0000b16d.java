package s0;

import f2.m0;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final int f49895a;

    /* renamed from: b  reason: collision with root package name */
    private final r0.j[] f49896b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f49897c;

    /* renamed from: d  reason: collision with root package name */
    private final a.b f49898d;

    /* renamed from: e  reason: collision with root package name */
    private final a.c f49899e;

    /* renamed from: f  reason: collision with root package name */
    private final x2.q f49900f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f49901g;

    /* renamed from: h  reason: collision with root package name */
    private final int f49902h;

    /* renamed from: i  reason: collision with root package name */
    private final int f49903i;

    /* renamed from: j  reason: collision with root package name */
    private final i f49904j;

    /* renamed from: k  reason: collision with root package name */
    private final int f49905k;

    /* renamed from: l  reason: collision with root package name */
    private final long f49906l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f49907m;

    /* renamed from: n  reason: collision with root package name */
    private final int f49908n;

    /* renamed from: o  reason: collision with root package name */
    private final int f49909o;

    /* renamed from: p  reason: collision with root package name */
    private final int f49910p;

    private u(int i11, r0.j[] jVarArr, boolean z11, a.b bVar, a.c cVar, x2.q qVar, boolean z12, int i12, int i13, i iVar, int i14, long j11, Object obj) {
        this.f49895a = i11;
        this.f49896b = jVarArr;
        this.f49897c = z11;
        this.f49898d = bVar;
        this.f49899e = cVar;
        this.f49900f = qVar;
        this.f49901g = z12;
        this.f49902h = i12;
        this.f49903i = i13;
        this.f49904j = iVar;
        this.f49905k = i14;
        this.f49906l = j11;
        this.f49907m = obj;
        int length = jVarArr.length;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < length) {
            r0.j jVar = jVarArr[i15];
            i15++;
            m0 b11 = jVar.b();
            i16 += this.f49897c ? b11.w0() : b11.B0();
            i17 = Math.max(i17, !this.f49897c ? b11.w0() : b11.B0());
        }
        this.f49908n = i16;
        this.f49909o = i16 + this.f49905k;
        this.f49910p = i17;
    }

    public /* synthetic */ u(int i11, r0.j[] jVarArr, boolean z11, a.b bVar, a.c cVar, x2.q qVar, boolean z12, int i12, int i13, i iVar, int i14, long j11, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, jVarArr, z11, bVar, cVar, qVar, z12, i12, i13, iVar, i14, j11, obj);
    }

    public final int a() {
        return this.f49910p;
    }

    public final int b() {
        return this.f49895a;
    }

    public final Object c() {
        return this.f49907m;
    }

    public final int d() {
        return this.f49908n;
    }

    public final int e() {
        return this.f49909o;
    }

    public final r f(int i11, int i12, int i13) {
        long a11;
        ArrayList arrayList = new ArrayList();
        int i14 = this.f49897c ? i13 : i12;
        boolean z11 = this.f49901g;
        int i15 = z11 ? (i14 - i11) - this.f49908n : i11;
        int L = z11 ? wz.p.L(this.f49896b) : 0;
        while (true) {
            boolean z12 = this.f49901g;
            boolean z13 = true;
            if (!z12 ? L >= this.f49896b.length : L < 0) {
                z13 = false;
            }
            if (z13) {
                m0 b11 = this.f49896b[L].b();
                int size = this.f49901g ? 0 : arrayList.size();
                if (this.f49897c) {
                    a.b bVar = this.f49898d;
                    if (bVar != null) {
                        a11 = x2.l.a(bVar.a(b11.B0(), i12, this.f49900f), i15);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    a.c cVar = this.f49899e;
                    if (cVar != null) {
                        a11 = x2.l.a(i15, cVar.a(b11.w0(), i13));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                long j11 = a11;
                i15 += this.f49897c ? b11.w0() : b11.B0();
                arrayList.add(size, new q(j11, b11, this.f49896b[L].a(), null));
                L = this.f49901g ? L - 1 : L + 1;
            } else {
                return new r(i11, this.f49895a, this.f49907m, this.f49908n, this.f49909o, -(!z12 ? this.f49902h : this.f49903i), i14 + (!z12 ? this.f49903i : this.f49902h), this.f49897c, arrayList, this.f49904j, this.f49906l, null);
            }
        }
    }
}