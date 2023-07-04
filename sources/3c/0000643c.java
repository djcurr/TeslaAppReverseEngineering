package cp;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j extends k {

    /* renamed from: a  reason: collision with root package name */
    private final p[] f23035a;

    public j(Map<com.google.zxing.d, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(com.google.zxing.d.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(com.google.zxing.a.EAN_13)) {
                arrayList.add(new e());
            } else if (collection.contains(com.google.zxing.a.UPC_A)) {
                arrayList.add(new l());
            }
            if (collection.contains(com.google.zxing.a.EAN_8)) {
                arrayList.add(new f());
            }
            if (collection.contains(com.google.zxing.a.UPC_E)) {
                arrayList.add(new q());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new e());
            arrayList.add(new f());
            arrayList.add(new q());
        }
        this.f23035a = (p[]) arrayList.toArray(new p[arrayList.size()]);
    }

    @Override // cp.k
    public com.google.zxing.j b(int i11, uo.a aVar, Map<com.google.zxing.d, ?> map) {
        boolean z11;
        int[] o11 = p.o(aVar);
        for (p pVar : this.f23035a) {
            try {
                com.google.zxing.j l11 = pVar.l(i11, aVar, o11, map);
                boolean z12 = l11.b() == com.google.zxing.a.EAN_13 && l11.f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(com.google.zxing.d.POSSIBLE_FORMATS);
                if (collection != null && !collection.contains(com.google.zxing.a.UPC_A)) {
                    z11 = false;
                    if (z12 || !z11) {
                        return l11;
                    }
                    com.google.zxing.j jVar = new com.google.zxing.j(l11.f().substring(1), l11.c(), l11.e(), com.google.zxing.a.UPC_A);
                    jVar.g(l11.d());
                    return jVar;
                }
                z11 = true;
                if (z12) {
                }
                return l11;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.a();
    }

    @Override // cp.k, com.google.zxing.i
    public void reset() {
        for (p pVar : this.f23035a) {
            pVar.reset();
        }
    }
}