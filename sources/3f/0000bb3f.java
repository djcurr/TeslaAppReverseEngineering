package w0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class n0 {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<h00.a<? extends s1.f>, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55142a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w0.n0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1251a extends kotlin.jvm.internal.u implements h00.l<x2.d, s1.f> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.a<s1.f> f55143a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1251a(h00.a<s1.f> aVar) {
                super(1);
                this.f55143a = aVar;
            }

            public final long a(x2.d magnifier) {
                kotlin.jvm.internal.s.g(magnifier, "$this$magnifier");
                return this.f55143a.invoke().t();
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ s1.f invoke(x2.d dVar) {
                return s1.f.d(a(dVar));
            }
        }

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final o1.f invoke(h00.a<s1.f> center) {
            kotlin.jvm.internal.s.g(center, "center");
            return m0.t.e(o1.f.f42062f1, new C1251a(center), null, BitmapDescriptorFactory.HUE_RED, m0.u.f38111g.b(), 6, null);
        }
    }

    public static final o1.f a(o1.f fVar, x0.t manager) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(manager, "manager");
        if (!m0.u.f38111g.b().i()) {
            return o1.f.f42062f1;
        }
        return m0.k(fVar, manager, a.f55142a, false, 4, null);
    }
}