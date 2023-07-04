package yf;

/* loaded from: classes3.dex */
public class a<T> implements v3.f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f59477a;

    /* renamed from: b  reason: collision with root package name */
    private int f59478b = 0;

    public a(int i11) {
        this.f59477a = new Object[i11];
    }

    @Override // v3.f
    public synchronized boolean a(T t11) {
        int i11 = this.f59478b;
        Object[] objArr = this.f59477a;
        if (i11 == objArr.length) {
            return false;
        }
        objArr[i11] = t11;
        this.f59478b = i11 + 1;
        return true;
    }

    @Override // v3.f
    public synchronized T b() {
        int i11 = this.f59478b;
        if (i11 == 0) {
            return null;
        }
        int i12 = i11 - 1;
        this.f59478b = i12;
        Object[] objArr = this.f59477a;
        T t11 = (T) objArr[i12];
        objArr[i12] = null;
        return t11;
    }

    public synchronized void c() {
        for (int i11 = 0; i11 < this.f59478b; i11++) {
            this.f59477a[i11] = null;
        }
        this.f59478b = 0;
    }
}