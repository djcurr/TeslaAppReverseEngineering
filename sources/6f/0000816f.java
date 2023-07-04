package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h1 {

    /* loaded from: classes.dex */
    public static final class a implements r {

        /* renamed from: a */
        private final List<f0> f36153a;

        /* renamed from: b */
        final /* synthetic */ p f36154b;

        /* renamed from: c */
        final /* synthetic */ float f36155c;

        /* renamed from: d */
        final /* synthetic */ float f36156d;

        a(p pVar, float f11, float f12) {
            m00.i r11;
            int t11;
            this.f36154b = pVar;
            this.f36155c = f11;
            this.f36156d = f12;
            r11 = m00.l.r(0, pVar.b());
            t11 = wz.x.t(r11, 10);
            ArrayList arrayList = new ArrayList(t11);
            Iterator<Integer> it2 = r11.iterator();
            while (it2.hasNext()) {
                arrayList.add(new f0(f11, f12, pVar.a(((wz.n0) it2).a())));
            }
            this.f36153a = arrayList;
        }

        @Override // l0.r
        /* renamed from: a */
        public f0 get(int i11) {
            return this.f36153a.get(i11);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements r {

        /* renamed from: a */
        private final f0 f36157a;

        /* renamed from: b */
        final /* synthetic */ float f36158b;

        /* renamed from: c */
        final /* synthetic */ float f36159c;

        b(float f11, float f12) {
            this.f36158b = f11;
            this.f36159c = f12;
            this.f36157a = new f0(f11, f12, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // l0.r
        /* renamed from: a */
        public f0 get(int i11) {
            return this.f36157a;
        }
    }

    public static final /* synthetic */ r b(p pVar, float f11, float f12) {
        return d(pVar, f11, f12);
    }

    public static final long c(j1<?> j1Var, long j11) {
        long n11;
        n11 = m00.l.n(j11 - j1Var.c(), 0L, j1Var.e());
        return n11;
    }

    public static final <V extends p> r d(V v11, float f11, float f12) {
        if (v11 != null) {
            return new a(v11, f11, f12);
        }
        return new b(f11, f12);
    }

    public static final <V extends p> V e(g1<V> g1Var, long j11, V start, V end, V startVelocity) {
        kotlin.jvm.internal.s.g(g1Var, "<this>");
        kotlin.jvm.internal.s.g(start, "start");
        kotlin.jvm.internal.s.g(end, "end");
        kotlin.jvm.internal.s.g(startVelocity, "startVelocity");
        return g1Var.b(j11 * 1000000, start, end, startVelocity);
    }
}