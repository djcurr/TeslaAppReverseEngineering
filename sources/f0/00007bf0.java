package jj;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final yi.a[] f33829a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f33830b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33831c;

    /* renamed from: d  reason: collision with root package name */
    public final String f33832d;

    public e(String str, String str2, long j11, long[] jArr, yi.a[] aVarArr) {
        this.f33831c = str;
        this.f33832d = str2;
        this.f33830b = jArr;
        this.f33829a = aVarArr;
    }

    public String a() {
        String str = this.f33831c;
        String str2 = this.f33832d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        return sb2.toString();
    }
}