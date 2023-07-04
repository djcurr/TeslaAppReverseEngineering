package ji;

import ak.k0;
import java.util.Arrays;
import ji.v;

/* loaded from: classes3.dex */
public final class c implements v {

    /* renamed from: a  reason: collision with root package name */
    public final int f33709a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f33710b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f33711c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f33712d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f33713e;

    /* renamed from: f  reason: collision with root package name */
    private final long f33714f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f33710b = iArr;
        this.f33711c = jArr;
        this.f33712d = jArr2;
        this.f33713e = jArr3;
        int length = iArr.length;
        this.f33709a = length;
        if (length > 0) {
            this.f33714f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f33714f = 0L;
        }
    }

    public int a(long j11) {
        return k0.i(this.f33713e, j11, true, true);
    }

    @Override // ji.v
    public v.a f(long j11) {
        int a11 = a(j11);
        w wVar = new w(this.f33713e[a11], this.f33711c[a11]);
        if (wVar.f33776a < j11 && a11 != this.f33709a - 1) {
            int i11 = a11 + 1;
            return new v.a(wVar, new w(this.f33713e[i11], this.f33711c[i11]));
        }
        return new v.a(wVar);
    }

    @Override // ji.v
    public boolean h() {
        return true;
    }

    @Override // ji.v
    public long i() {
        return this.f33714f;
    }

    public String toString() {
        int i11 = this.f33709a;
        String arrays = Arrays.toString(this.f33710b);
        String arrays2 = Arrays.toString(this.f33711c);
        String arrays3 = Arrays.toString(this.f33713e);
        String arrays4 = Arrays.toString(this.f33712d);
        StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + 71 + String.valueOf(arrays2).length() + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb2.append("ChunkIndex(length=");
        sb2.append(i11);
        sb2.append(", sizes=");
        sb2.append(arrays);
        sb2.append(", offsets=");
        sb2.append(arrays2);
        sb2.append(", timeUs=");
        sb2.append(arrays3);
        sb2.append(", durationsUs=");
        sb2.append(arrays4);
        sb2.append(")");
        return sb2.toString();
    }
}