package zo;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.NotFoundException;
import com.google.zxing.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import uo.g;
import uo.i;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final uo.b f60560a;

    /* renamed from: b  reason: collision with root package name */
    private final vo.b f60561b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final l f60562a;

        /* renamed from: b  reason: collision with root package name */
        private final l f60563b;

        /* renamed from: c  reason: collision with root package name */
        private final int f60564c;

        l a() {
            return this.f60562a;
        }

        l b() {
            return this.f60563b;
        }

        int c() {
            return this.f60564c;
        }

        public String toString() {
            return this.f60562a + "/" + this.f60563b + '/' + this.f60564c;
        }

        private b(l lVar, l lVar2, int i11) {
            this.f60562a = lVar;
            this.f60563b = lVar2;
            this.f60564c = i11;
        }
    }

    /* loaded from: classes2.dex */
    private static final class c implements Serializable, Comparator<b> {
        private c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar.c() - bVar2.c();
        }
    }

    public a(uo.b bVar) {
        this.f60560a = bVar;
        this.f60561b = new vo.b(bVar);
    }

    private l a(l lVar, l lVar2, l lVar3, l lVar4, int i11) {
        float f11 = i11;
        float d11 = d(lVar, lVar2) / f11;
        float d12 = d(lVar3, lVar4);
        l lVar5 = new l(lVar4.c() + (((lVar4.c() - lVar3.c()) / d12) * d11), lVar4.d() + (d11 * ((lVar4.d() - lVar3.d()) / d12)));
        float d13 = d(lVar, lVar3) / f11;
        float d14 = d(lVar2, lVar4);
        l lVar6 = new l(lVar4.c() + (((lVar4.c() - lVar2.c()) / d14) * d13), lVar4.d() + (d13 * ((lVar4.d() - lVar2.d()) / d14)));
        if (f(lVar5)) {
            return (f(lVar6) && Math.abs(h(lVar3, lVar5).c() - h(lVar2, lVar5).c()) > Math.abs(h(lVar3, lVar6).c() - h(lVar2, lVar6).c())) ? lVar6 : lVar5;
        } else if (f(lVar6)) {
            return lVar6;
        } else {
            return null;
        }
    }

    private l b(l lVar, l lVar2, l lVar3, l lVar4, int i11, int i12) {
        float d11 = d(lVar, lVar2) / i11;
        float d12 = d(lVar3, lVar4);
        l lVar5 = new l(lVar4.c() + (((lVar4.c() - lVar3.c()) / d12) * d11), lVar4.d() + (d11 * ((lVar4.d() - lVar3.d()) / d12)));
        float d13 = d(lVar, lVar3) / i12;
        float d14 = d(lVar2, lVar4);
        l lVar6 = new l(lVar4.c() + (((lVar4.c() - lVar2.c()) / d14) * d13), lVar4.d() + (d13 * ((lVar4.d() - lVar2.d()) / d14)));
        if (f(lVar5)) {
            return (f(lVar6) && Math.abs(i11 - h(lVar3, lVar5).c()) + Math.abs(i12 - h(lVar2, lVar5).c()) > Math.abs(i11 - h(lVar3, lVar6).c()) + Math.abs(i12 - h(lVar2, lVar6).c())) ? lVar6 : lVar5;
        } else if (f(lVar6)) {
            return lVar6;
        } else {
            return null;
        }
    }

    private static int d(l lVar, l lVar2) {
        return vo.a.c(l.b(lVar, lVar2));
    }

    private static void e(Map<l, Integer> map, l lVar) {
        Integer num = map.get(lVar);
        map.put(lVar, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    private boolean f(l lVar) {
        return lVar.c() >= BitmapDescriptorFactory.HUE_RED && lVar.c() < ((float) this.f60560a.j()) && lVar.d() > BitmapDescriptorFactory.HUE_RED && lVar.d() < ((float) this.f60560a.g());
    }

    private static uo.b g(uo.b bVar, l lVar, l lVar2, l lVar3, l lVar4, int i11, int i12) {
        float f11 = i11 - 0.5f;
        float f12 = i12 - 0.5f;
        return i.b().c(bVar, i11, i12, 0.5f, 0.5f, f11, 0.5f, f11, f12, 0.5f, f12, lVar.c(), lVar.d(), lVar4.c(), lVar4.d(), lVar3.c(), lVar3.d(), lVar2.c(), lVar2.d());
    }

    private b h(l lVar, l lVar2) {
        int c11 = (int) lVar.c();
        int d11 = (int) lVar.d();
        int c12 = (int) lVar2.c();
        int d12 = (int) lVar2.d();
        int i11 = 0;
        boolean z11 = Math.abs(d12 - d11) > Math.abs(c12 - c11);
        if (z11) {
            d11 = c11;
            c11 = d11;
            d12 = c12;
            c12 = d12;
        }
        int abs = Math.abs(c12 - c11);
        int abs2 = Math.abs(d12 - d11);
        int i12 = (-abs) / 2;
        int i13 = d11 < d12 ? 1 : -1;
        int i14 = c11 >= c12 ? -1 : 1;
        boolean d13 = this.f60560a.d(z11 ? d11 : c11, z11 ? c11 : d11);
        while (c11 != c12) {
            boolean d14 = this.f60560a.d(z11 ? d11 : c11, z11 ? c11 : d11);
            if (d14 != d13) {
                i11++;
                d13 = d14;
            }
            i12 += abs2;
            if (i12 > 0) {
                if (d11 == d12) {
                    break;
                }
                d11 += i13;
                i12 -= abs;
            }
            c11 += i14;
        }
        return new b(lVar, lVar2, i11);
    }

    public g c() {
        l lVar;
        l lVar2;
        uo.b g11;
        l[] c11 = this.f60561b.c();
        l lVar3 = c11[0];
        l lVar4 = c11[1];
        l lVar5 = c11[2];
        l lVar6 = c11[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(h(lVar3, lVar4));
        arrayList.add(h(lVar3, lVar5));
        arrayList.add(h(lVar4, lVar6));
        arrayList.add(h(lVar5, lVar6));
        l lVar7 = null;
        Collections.sort(arrayList, new c());
        b bVar = (b) arrayList.get(0);
        b bVar2 = (b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        e(hashMap, bVar.a());
        e(hashMap, bVar.b());
        e(hashMap, bVar2.a());
        e(hashMap, bVar2.b());
        l lVar8 = null;
        l lVar9 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            l lVar10 = (l) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                lVar8 = lVar10;
            } else if (lVar7 == null) {
                lVar7 = lVar10;
            } else {
                lVar9 = lVar10;
            }
        }
        if (lVar7 != null && lVar8 != null && lVar9 != null) {
            l[] lVarArr = {lVar7, lVar8, lVar9};
            l.e(lVarArr);
            l lVar11 = lVarArr[0];
            l lVar12 = lVarArr[1];
            l lVar13 = lVarArr[2];
            if (!hashMap.containsKey(lVar3)) {
                lVar = lVar3;
            } else if (hashMap.containsKey(lVar4)) {
                lVar = !hashMap.containsKey(lVar5) ? lVar5 : lVar6;
            } else {
                lVar = lVar4;
            }
            int c12 = h(lVar13, lVar).c();
            int c13 = h(lVar11, lVar).c();
            if ((c12 & 1) == 1) {
                c12++;
            }
            int i11 = c12 + 2;
            if ((c13 & 1) == 1) {
                c13++;
            }
            int i12 = c13 + 2;
            if (i11 * 4 < i12 * 7 && i12 * 4 < i11 * 7) {
                l a11 = a(lVar12, lVar11, lVar13, lVar, Math.min(i12, i11));
                if (a11 != null) {
                    lVar = a11;
                }
                int max = Math.max(h(lVar13, lVar).c(), h(lVar11, lVar).c()) + 1;
                if ((max & 1) == 1) {
                    max++;
                }
                int i13 = max;
                g11 = g(this.f60560a, lVar13, lVar12, lVar11, lVar, i13, i13);
                lVar2 = lVar13;
            } else {
                lVar2 = lVar13;
                l b11 = b(lVar12, lVar11, lVar13, lVar, i11, i12);
                if (b11 != null) {
                    lVar = b11;
                }
                int c14 = h(lVar2, lVar).c();
                int c15 = h(lVar11, lVar).c();
                if ((c14 & 1) == 1) {
                    c14++;
                }
                int i14 = c14;
                if ((c15 & 1) == 1) {
                    c15++;
                }
                g11 = g(this.f60560a, lVar2, lVar12, lVar11, lVar, i14, c15);
            }
            return new g(g11, new l[]{lVar2, lVar12, lVar11, lVar});
        }
        throw NotFoundException.a();
    }
}