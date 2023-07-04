package f8;

import android.graphics.PointF;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import g8.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g0 implements m0<c8.m> {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f26070a = new g0();

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f26071b = c.a.a(cg.c.f9084i, "v", IntegerTokenConverter.CONVERTER_KEY, "o");

    private g0() {
    }

    @Override // f8.m0
    /* renamed from: b */
    public c8.m a(g8.c cVar, float f11) {
        if (cVar.e0() == c.b.BEGIN_ARRAY) {
            cVar.g();
        }
        cVar.j();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z11 = false;
        while (cVar.p()) {
            int p02 = cVar.p0(f26071b);
            if (p02 == 0) {
                z11 = cVar.C();
            } else if (p02 == 1) {
                list = s.f(cVar, f11);
            } else if (p02 == 2) {
                list2 = s.f(cVar, f11);
            } else if (p02 != 3) {
                cVar.t0();
                cVar.u0();
            } else {
                list3 = s.f(cVar, f11);
            }
        }
        cVar.m();
        if (cVar.e0() == c.b.END_ARRAY) {
            cVar.l();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new c8.m(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 1; i11 < size; i11++) {
                PointF pointF2 = list.get(i11);
                int i12 = i11 - 1;
                arrayList.add(new a8.a(h8.g.a(list.get(i12), list3.get(i12)), h8.g.a(pointF2, list2.get(i11)), pointF2));
            }
            if (z11) {
                PointF pointF3 = list.get(0);
                int i13 = size - 1;
                arrayList.add(new a8.a(h8.g.a(list.get(i13), list3.get(i13)), h8.g.a(pointF3, list2.get(0)), pointF3));
            }
            return new c8.m(pointF, z11, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}