package vg;

import java.util.List;
import jf.h;
import jf.l;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: vg.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C1227b {

        /* renamed from: a  reason: collision with root package name */
        private final vg.a f54486a;

        /* renamed from: b  reason: collision with root package name */
        private final vg.a f54487b;

        public vg.a a() {
            return this.f54486a;
        }

        public vg.a b() {
            return this.f54487b;
        }

        private C1227b(vg.a aVar, vg.a aVar2) {
            this.f54486a = aVar;
            this.f54487b = aVar2;
        }
    }

    public static C1227b a(int i11, int i12, List<vg.a> list) {
        return b(i11, i12, list, 1.0d);
    }

    public static C1227b b(int i11, int i12, List<vg.a> list, double d11) {
        if (list.isEmpty()) {
            return new C1227b(null, null);
        }
        if (list.size() == 1) {
            return new C1227b(list.get(0), null);
        }
        if (i11 > 0 && i12 > 0) {
            h j11 = l.l().j();
            double d12 = i11 * i12 * d11;
            double d13 = Double.MAX_VALUE;
            double d14 = Double.MAX_VALUE;
            vg.a aVar = null;
            vg.a aVar2 = null;
            for (vg.a aVar3 : list) {
                double abs = Math.abs(1.0d - (aVar3.getSize() / d12));
                if (abs < d13) {
                    aVar2 = aVar3;
                    d13 = abs;
                }
                if (abs < d14 && (j11.m(aVar3.getUri()) || j11.o(aVar3.getUri()))) {
                    aVar = aVar3;
                    d14 = abs;
                }
            }
            if (aVar != null && aVar2 != null && aVar.getSource().equals(aVar2.getSource())) {
                aVar = null;
            }
            return new C1227b(aVar2, aVar);
        }
        return new C1227b(null, null);
    }
}