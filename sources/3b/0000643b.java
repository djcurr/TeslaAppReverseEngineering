package cp;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k[] f23034a;

    public i(Map<com.google.zxing.d, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(com.google.zxing.d.POSSIBLE_FORMATS);
        boolean z11 = (map == null || map.get(com.google.zxing.d.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(com.google.zxing.a.EAN_13) || collection.contains(com.google.zxing.a.UPC_A) || collection.contains(com.google.zxing.a.EAN_8) || collection.contains(com.google.zxing.a.UPC_E)) {
                arrayList.add(new j(map));
            }
            if (collection.contains(com.google.zxing.a.CODE_39)) {
                arrayList.add(new c(z11));
            }
            if (collection.contains(com.google.zxing.a.CODE_93)) {
                arrayList.add(new d());
            }
            if (collection.contains(com.google.zxing.a.CODE_128)) {
                arrayList.add(new b());
            }
            if (collection.contains(com.google.zxing.a.ITF)) {
                arrayList.add(new h());
            }
            if (collection.contains(com.google.zxing.a.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(com.google.zxing.a.RSS_14)) {
                arrayList.add(new dp.e());
            }
            if (collection.contains(com.google.zxing.a.RSS_EXPANDED)) {
                arrayList.add(new ep.d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new j(map));
            arrayList.add(new c());
            arrayList.add(new a());
            arrayList.add(new d());
            arrayList.add(new b());
            arrayList.add(new h());
            arrayList.add(new dp.e());
            arrayList.add(new ep.d());
        }
        this.f23034a = (k[]) arrayList.toArray(new k[arrayList.size()]);
    }

    @Override // cp.k
    public com.google.zxing.j b(int i11, uo.a aVar, Map<com.google.zxing.d, ?> map) {
        for (k kVar : this.f23034a) {
            try {
                return kVar.b(i11, aVar, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.a();
    }

    @Override // cp.k, com.google.zxing.i
    public void reset() {
        for (k kVar : this.f23034a) {
            kVar.reset();
        }
    }
}