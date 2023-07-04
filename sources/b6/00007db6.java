package ka;

/* loaded from: classes.dex */
public final class i implements a<int[]> {
    @Override // ka.a
    public int a() {
        return 4;
    }

    @Override // ka.a
    /* renamed from: c */
    public int b(int[] iArr) {
        return iArr.length;
    }

    @Override // ka.a
    /* renamed from: d */
    public int[] newArray(int i11) {
        return new int[i11];
    }

    @Override // ka.a
    public String getTag() {
        return "IntegerArrayPool";
    }
}