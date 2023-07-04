package cp;

import com.google.zxing.FormatException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l extends p {

    /* renamed from: h  reason: collision with root package name */
    private final p f23036h = new e();

    private static com.google.zxing.j r(com.google.zxing.j jVar) {
        String f11 = jVar.f();
        if (f11.charAt(0) == '0') {
            com.google.zxing.j jVar2 = new com.google.zxing.j(f11.substring(1), null, jVar.e(), com.google.zxing.a.UPC_A);
            if (jVar.d() != null) {
                jVar2.g(jVar.d());
            }
            return jVar2;
        }
        throw FormatException.a();
    }

    @Override // cp.k, com.google.zxing.i
    public com.google.zxing.j a(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map) {
        return r(this.f23036h.a(cVar, map));
    }

    @Override // cp.p, cp.k
    public com.google.zxing.j b(int i11, uo.a aVar, Map<com.google.zxing.d, ?> map) {
        return r(this.f23036h.b(i11, aVar, map));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cp.p
    public int k(uo.a aVar, int[] iArr, StringBuilder sb2) {
        return this.f23036h.k(aVar, iArr, sb2);
    }

    @Override // cp.p
    public com.google.zxing.j l(int i11, uo.a aVar, int[] iArr, Map<com.google.zxing.d, ?> map) {
        return r(this.f23036h.l(i11, aVar, iArr, map));
    }

    @Override // cp.p
    com.google.zxing.a p() {
        return com.google.zxing.a.UPC_A;
    }
}