package xj;

import ak.k0;
import android.os.SystemClock;
import fj.u;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class c implements g {

    /* renamed from: a */
    protected final u f57473a;

    /* renamed from: b */
    protected final int f57474b;

    /* renamed from: c */
    protected final int[] f57475c;

    /* renamed from: d */
    private final ci.i[] f57476d;

    /* renamed from: e */
    private final long[] f57477e;

    /* renamed from: f */
    private int f57478f;

    public c(u uVar, int... iArr) {
        int i11 = 0;
        ak.a.f(iArr.length > 0);
        this.f57473a = (u) ak.a.e(uVar);
        int length = iArr.length;
        this.f57474b = length;
        this.f57476d = new ci.i[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f57476d[i12] = uVar.a(iArr[i12]);
        }
        Arrays.sort(this.f57476d, new Comparator() { // from class: xj.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.s((ci.i) obj, (ci.i) obj2);
            }
        });
        this.f57475c = new int[this.f57474b];
        while (true) {
            int i13 = this.f57474b;
            if (i11 < i13) {
                this.f57475c[i11] = uVar.b(this.f57476d[i11]);
                i11++;
            } else {
                this.f57477e = new long[i13];
                return;
            }
        }
    }

    public static /* synthetic */ int s(ci.i iVar, ci.i iVar2) {
        return u(iVar, iVar2);
    }

    public static /* synthetic */ int u(ci.i iVar, ci.i iVar2) {
        return iVar2.f9201h - iVar.f9201h;
    }

    @Override // xj.j
    public final int b(ci.i iVar) {
        for (int i11 = 0; i11 < this.f57474b; i11++) {
            if (this.f57476d[i11] == iVar) {
                return i11;
            }
        }
        return -1;
    }

    @Override // xj.g
    public final boolean c(int i11, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean t11 = t(i11, elapsedRealtime);
        int i12 = 0;
        while (i12 < this.f57474b && !t11) {
            t11 = (i12 == i11 || t(i12, elapsedRealtime)) ? false : true;
            i12++;
        }
        if (t11) {
            long[] jArr = this.f57477e;
            jArr[i11] = Math.max(jArr[i11], k0.b(elapsedRealtime, j11, Long.MAX_VALUE));
            return true;
        }
        return false;
    }

    @Override // xj.j
    public final ci.i d(int i11) {
        return this.f57476d[i11];
    }

    @Override // xj.g
    public void disable() {
    }

    @Override // xj.j
    public final int e(int i11) {
        return this.f57475c[i11];
    }

    @Override // xj.g
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f57473a == cVar.f57473a && Arrays.equals(this.f57475c, cVar.f57475c);
    }

    @Override // xj.g
    public void f(float f11) {
    }

    public int hashCode() {
        if (this.f57478f == 0) {
            this.f57478f = (System.identityHashCode(this.f57473a) * 31) + Arrays.hashCode(this.f57475c);
        }
        return this.f57478f;
    }

    @Override // xj.j
    public final int i(int i11) {
        for (int i12 = 0; i12 < this.f57474b; i12++) {
            if (this.f57475c[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // xj.j
    public final u j() {
        return this.f57473a;
    }

    @Override // xj.j
    public final int length() {
        return this.f57475c.length;
    }

    @Override // xj.g
    public int m(long j11, List<? extends hj.m> list) {
        return list.size();
    }

    @Override // xj.g
    public final int o() {
        return this.f57475c[a()];
    }

    @Override // xj.g
    public final ci.i p() {
        return this.f57476d[a()];
    }

    public final boolean t(int i11, long j11) {
        return this.f57477e[i11] > j11;
    }
}