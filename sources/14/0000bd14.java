package wo;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f56140h = new a(4201, 4096, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f56141i = new a(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f56142j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f56143k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f56144l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f56145m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f56146n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f56147o;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f56148a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f56149b;

    /* renamed from: c  reason: collision with root package name */
    private final b f56150c;

    /* renamed from: d  reason: collision with root package name */
    private final b f56151d;

    /* renamed from: e  reason: collision with root package name */
    private final int f56152e;

    /* renamed from: f  reason: collision with root package name */
    private final int f56153f;

    /* renamed from: g  reason: collision with root package name */
    private final int f56154g;

    static {
        a aVar = new a(67, 64, 1);
        f56142j = aVar;
        f56143k = new a(19, 16, 1);
        f56144l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f56145m = aVar2;
        f56146n = aVar2;
        f56147o = aVar;
    }

    public a(int i11, int i12, int i13) {
        this.f56153f = i11;
        this.f56152e = i12;
        this.f56154g = i13;
        this.f56148a = new int[i12];
        this.f56149b = new int[i12];
        int i14 = 1;
        for (int i15 = 0; i15 < i12; i15++) {
            this.f56148a[i15] = i14;
            i14 <<= 1;
            if (i14 >= i12) {
                i14 = (i14 ^ i11) & (i12 - 1);
            }
        }
        for (int i16 = 0; i16 < i12 - 1; i16++) {
            this.f56149b[this.f56148a[i16]] = i16;
        }
        this.f56150c = new b(this, new int[]{0});
        this.f56151d = new b(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i11, int i12) {
        return i11 ^ i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b b(int i11, int i12) {
        if (i11 >= 0) {
            if (i12 == 0) {
                return this.f56150c;
            }
            int[] iArr = new int[i11 + 1];
            iArr[0] = i12;
            return new b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i11) {
        return this.f56148a[i11];
    }

    public int d() {
        return this.f56154g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b e() {
        return this.f56151d;
    }

    public int f() {
        return this.f56152e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b g() {
        return this.f56150c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(int i11) {
        if (i11 != 0) {
            return this.f56148a[(this.f56152e - this.f56149b[i11]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(int i11) {
        if (i11 != 0) {
            return this.f56149b[i11];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(int i11, int i12) {
        if (i11 == 0 || i12 == 0) {
            return 0;
        }
        int[] iArr = this.f56148a;
        int[] iArr2 = this.f56149b;
        return iArr[(iArr2[i11] + iArr2[i12]) % (this.f56152e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f56153f) + CoreConstants.COMMA_CHAR + this.f56152e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}