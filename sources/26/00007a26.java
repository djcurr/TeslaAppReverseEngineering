package ip;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final b f32739f = new b(929, 3);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f32740a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f32741b;

    /* renamed from: c  reason: collision with root package name */
    private final c f32742c;

    /* renamed from: d  reason: collision with root package name */
    private final c f32743d;

    /* renamed from: e  reason: collision with root package name */
    private final int f32744e;

    private b(int i11, int i12) {
        this.f32744e = i11;
        this.f32740a = new int[i11];
        this.f32741b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f32740a[i14] = i13;
            i13 = (i13 * i12) % i11;
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f32741b[this.f32740a[i15]] = i15;
        }
        this.f32742c = new c(this, new int[]{0});
        this.f32743d = new c(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i11, int i12) {
        return (i11 + i12) % this.f32744e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c b(int i11, int i12) {
        if (i11 >= 0) {
            if (i12 == 0) {
                return this.f32742c;
            }
            int[] iArr = new int[i11 + 1];
            iArr[0] = i12;
            return new c(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i11) {
        return this.f32740a[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c d() {
        return this.f32743d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f32744e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c f() {
        return this.f32742c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(int i11) {
        if (i11 != 0) {
            return this.f32740a[(this.f32744e - this.f32741b[i11]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(int i11) {
        if (i11 != 0) {
            return this.f32741b[i11];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(int i11, int i12) {
        if (i11 == 0 || i12 == 0) {
            return 0;
        }
        int[] iArr = this.f32740a;
        int[] iArr2 = this.f32741b;
        return iArr[(iArr2[i11] + iArr2[i12]) % (this.f32744e - 1)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(int i11, int i12) {
        int i13 = this.f32744e;
        return ((i11 + i13) - i12) % i13;
    }
}