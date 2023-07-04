package a3;

/* loaded from: classes.dex */
class g<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f190a;

    /* renamed from: b  reason: collision with root package name */
    private int f191b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i11) {
        if (i11 > 0) {
            this.f190a = new Object[i11];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // a3.f
    public boolean a(T t11) {
        int i11 = this.f191b;
        Object[] objArr = this.f190a;
        if (i11 < objArr.length) {
            objArr[i11] = t11;
            this.f191b = i11 + 1;
            return true;
        }
        return false;
    }

    @Override // a3.f
    public T b() {
        int i11 = this.f191b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            Object[] objArr = this.f190a;
            T t11 = (T) objArr[i12];
            objArr[i12] = null;
            this.f191b = i11 - 1;
            return t11;
        }
        return null;
    }

    @Override // a3.f
    public void c(T[] tArr, int i11) {
        if (i11 > tArr.length) {
            i11 = tArr.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            T t11 = tArr[i12];
            int i13 = this.f191b;
            Object[] objArr = this.f190a;
            if (i13 < objArr.length) {
                objArr[i13] = t11;
                this.f191b = i13 + 1;
            }
        }
    }
}