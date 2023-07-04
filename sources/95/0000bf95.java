package xj;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f57570a;

    /* renamed from: b  reason: collision with root package name */
    private final j[] f57571b;

    /* renamed from: c  reason: collision with root package name */
    private int f57572c;

    public k(j... jVarArr) {
        this.f57571b = jVarArr;
        this.f57570a = jVarArr.length;
    }

    public j a(int i11) {
        return this.f57571b[i11];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f57571b, ((k) obj).f57571b);
    }

    public int hashCode() {
        if (this.f57572c == 0) {
            this.f57572c = 527 + Arrays.hashCode(this.f57571b);
        }
        return this.f57572c;
    }
}