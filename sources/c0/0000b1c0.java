package s2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private int f50107a;

    /* renamed from: b  reason: collision with root package name */
    private char[] f50108b;

    /* renamed from: c  reason: collision with root package name */
    private int f50109c;

    /* renamed from: d  reason: collision with root package name */
    private int f50110d;

    public j(char[] initBuffer, int i11, int i12) {
        kotlin.jvm.internal.s.g(initBuffer, "initBuffer");
        this.f50107a = initBuffer.length;
        this.f50108b = initBuffer;
        this.f50109c = i11;
        this.f50110d = i12;
    }

    private final void b(int i11, int i12) {
        int i13 = this.f50109c;
        if (i11 < i13 && i12 <= i13) {
            int i14 = i13 - i12;
            char[] cArr = this.f50108b;
            wz.o.g(cArr, cArr, this.f50110d - i14, i12, i13);
            this.f50109c = i11;
            this.f50110d -= i14;
        } else if (i11 < i13 && i12 >= i13) {
            this.f50110d = i12 + c();
            this.f50109c = i11;
        } else {
            int c11 = i11 + c();
            int c12 = i12 + c();
            int i15 = this.f50110d;
            int i16 = c11 - i15;
            char[] cArr2 = this.f50108b;
            wz.o.g(cArr2, cArr2, this.f50109c, i15, c11);
            this.f50109c += i16;
            this.f50110d = c12;
        }
    }

    private final int c() {
        return this.f50110d - this.f50109c;
    }

    private final void f(int i11) {
        if (i11 <= c()) {
            return;
        }
        int c11 = i11 - c();
        int i12 = this.f50107a;
        do {
            i12 *= 2;
        } while (i12 - this.f50107a < c11);
        char[] cArr = new char[i12];
        wz.o.g(this.f50108b, cArr, 0, 0, this.f50109c);
        int i13 = this.f50107a;
        int i14 = this.f50110d;
        int i15 = i13 - i14;
        int i16 = i12 - i15;
        wz.o.g(this.f50108b, cArr, i16, i14, i15 + i14);
        this.f50108b = cArr;
        this.f50107a = i12;
        this.f50110d = i16;
    }

    public final void a(StringBuilder builder) {
        kotlin.jvm.internal.s.g(builder, "builder");
        builder.append(this.f50108b, 0, this.f50109c);
        char[] cArr = this.f50108b;
        int i11 = this.f50110d;
        builder.append(cArr, i11, this.f50107a - i11);
    }

    public final char d(int i11) {
        int i12 = this.f50109c;
        if (i11 < i12) {
            return this.f50108b[i11];
        }
        return this.f50108b[(i11 - i12) + this.f50110d];
    }

    public final int e() {
        return this.f50107a - c();
    }

    public final void g(int i11, int i12, String text) {
        kotlin.jvm.internal.s.g(text, "text");
        f(text.length() - (i12 - i11));
        b(i11, i12);
        k.c(text, this.f50108b, this.f50109c, 0, 0, 12, null);
        this.f50109c += text.length();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply { append(this) }.toString()");
        return sb3;
    }
}