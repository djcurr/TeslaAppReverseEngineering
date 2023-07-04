package fp;

import com.google.zxing.FormatException;

/* loaded from: classes2.dex */
final class p extends q {

    /* renamed from: b  reason: collision with root package name */
    private final int f26705b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26706c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(int i11, int i12, int i13) {
        super(i11);
        if (i12 >= 0 && i12 <= 10 && i13 >= 0 && i13 <= 10) {
            this.f26705b = i12;
            this.f26706c = i13;
            return;
        }
        throw FormatException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f26705b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f26706c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f26705b == 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f26706c == 10;
    }
}