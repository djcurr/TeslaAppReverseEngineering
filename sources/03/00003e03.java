package com.google.zxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    private Map<d, ?> f17424a;

    /* renamed from: b  reason: collision with root package name */
    private i[] f17425b;

    private j b(c cVar) {
        i[] iVarArr = this.f17425b;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                try {
                    return iVar.a(cVar, this.f17424a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.i
    public j a(c cVar, Map<d, ?> map) {
        d(map);
        return b(cVar);
    }

    public j c(c cVar) {
        if (this.f17425b == null) {
            d(null);
        }
        return b(cVar);
    }

    public void d(Map<d, ?> map) {
        this.f17424a = map;
        boolean z11 = true;
        boolean z12 = map != null && map.containsKey(d.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(d.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(a.UPC_A) && !collection.contains(a.UPC_E) && !collection.contains(a.EAN_13) && !collection.contains(a.EAN_8) && !collection.contains(a.CODABAR) && !collection.contains(a.CODE_39) && !collection.contains(a.CODE_93) && !collection.contains(a.CODE_128) && !collection.contains(a.ITF) && !collection.contains(a.RSS_14) && !collection.contains(a.RSS_EXPANDED)) {
                z11 = false;
            }
            if (z11 && !z12) {
                arrayList.add(new cp.i(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new kp.a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new xo.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new ro.b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new gp.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new ap.a());
            }
            if (z11 && z12) {
                arrayList.add(new cp.i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z12) {
                arrayList.add(new cp.i(map));
            }
            arrayList.add(new kp.a());
            arrayList.add(new xo.a());
            arrayList.add(new ro.b());
            arrayList.add(new gp.b());
            arrayList.add(new ap.a());
            if (z12) {
                arrayList.add(new cp.i(map));
            }
        }
        this.f17425b = (i[]) arrayList.toArray(new i[arrayList.size()]);
    }

    @Override // com.google.zxing.i
    public void reset() {
        i[] iVarArr = this.f17425b;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                iVar.reset();
            }
        }
    }
}