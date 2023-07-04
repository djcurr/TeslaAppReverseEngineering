package ji;

import java.util.Arrays;

/* loaded from: classes3.dex */
public interface x {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f33778a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f33779b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33780c;

        /* renamed from: d  reason: collision with root package name */
        public final int f33781d;

        public a(int i11, byte[] bArr, int i12, int i13) {
            this.f33778a = i11;
            this.f33779b = bArr;
            this.f33780c = i12;
            this.f33781d = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f33778a == aVar.f33778a && this.f33780c == aVar.f33780c && this.f33781d == aVar.f33781d && Arrays.equals(this.f33779b, aVar.f33779b);
        }

        public int hashCode() {
            return (((((this.f33778a * 31) + Arrays.hashCode(this.f33779b)) * 31) + this.f33780c) * 31) + this.f33781d;
        }
    }

    default int a(zj.f fVar, int i11, boolean z11) {
        return b(fVar, i11, z11, 0);
    }

    int b(zj.f fVar, int i11, boolean z11, int i12);

    void c(ak.v vVar, int i11, int i12);

    void d(ci.i iVar);

    default void e(ak.v vVar, int i11) {
        c(vVar, i11, 0);
    }

    void f(long j11, int i11, int i12, int i13, a aVar);
}