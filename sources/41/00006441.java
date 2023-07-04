package cp;

import com.google.zxing.ReaderException;

/* loaded from: classes2.dex */
final class o {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f23042c = {1, 1, 2};

    /* renamed from: a  reason: collision with root package name */
    private final m f23043a = new m();

    /* renamed from: b  reason: collision with root package name */
    private final n f23044b = new n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.zxing.j a(int i11, uo.a aVar, int i12) {
        int[] m11 = p.m(aVar, i12, false, f23042c);
        try {
            return this.f23044b.b(i11, aVar, m11);
        } catch (ReaderException unused) {
            return this.f23043a.b(i11, aVar, m11);
        }
    }
}