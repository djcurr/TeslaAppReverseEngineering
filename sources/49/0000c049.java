package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import o1.f;
import t1.b0;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final o1.f f57966a = p0.e0.v(o1.f.f42062f1, x2.g.f(24));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x1.c f57967a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f57968b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f57969c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f57970d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f57971e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f57972f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x1.c cVar, String str, o1.f fVar, long j11, int i11, int i12) {
            super(2);
            this.f57967a = cVar;
            this.f57968b = str;
            this.f57969c = fVar;
            this.f57970d = j11;
            this.f57971e = i11;
            this.f57972f = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            d0.b(this.f57967a, this.f57968b, this.f57969c, this.f57970d, iVar, this.f57971e | 1, this.f57972f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w1.b f57973a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f57974b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f57975c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f57976d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f57977e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f57978f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w1.b bVar, String str, o1.f fVar, long j11, int i11, int i12) {
            super(2);
            this.f57973a = bVar;
            this.f57974b = str;
            this.f57975c = fVar;
            this.f57976d = j11;
            this.f57977e = i11;
            this.f57978f = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            d0.a(this.f57973a, this.f57974b, this.f57975c, this.f57976d, iVar, this.f57977e | 1, this.f57978f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f57979a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f57979a = str;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(l2.v vVar) {
            invoke2(vVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(l2.v semantics) {
            kotlin.jvm.internal.s.g(semantics, "$this$semantics");
            l2.t.F(semantics, this.f57979a);
            l2.t.L(semantics, l2.h.f36408b.c());
        }
    }

    public static final void a(w1.b painter, String str, o1.f fVar, long j11, c1.i iVar, int i11, int i12) {
        o1.f fVar2;
        kotlin.jvm.internal.s.g(painter, "painter");
        c1.i h11 = iVar.h(1547384967);
        f.a aVar = (i12 & 4) != 0 ? o1.f.f42062f1 : fVar;
        long l11 = (i12 & 8) != 0 ? t1.a0.l(((t1.a0) h11.A(p.a())).v(), ((Number) h11.A(o.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j11;
        t1.b0 b11 = t1.a0.n(l11, t1.a0.f51365b.f()) ? null : b0.a.b(t1.b0.f51384b, l11, 0, 2, null);
        h11.x(1547385320);
        if (str != null) {
            f.a aVar2 = o1.f.f42062f1;
            h11.x(-3686930);
            boolean O = h11.O(str);
            Object y11 = h11.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new c(str);
                h11.p(y11);
            }
            h11.N();
            fVar2 = l2.o.b(aVar2, false, (h00.l) y11, 1, null);
        } else {
            fVar2 = o1.f.f42062f1;
        }
        h11.N();
        p0.c.a(q1.n.b(c(t1.f0.d(aVar), painter), painter, false, null, f2.d.f25565a.a(), BitmapDescriptorFactory.HUE_RED, b11, 22, null).g0(fVar2), h11, 0);
        c1.e1 l12 = h11.l();
        if (l12 == null) {
            return;
        }
        l12.a(new b(painter, str, aVar, l11, i11, i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(x1.c r17, java.lang.String r18, o1.f r19, long r20, c1.i r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d0.b(x1.c, java.lang.String, o1.f, long, c1.i, int, int):void");
    }

    private static final o1.f c(o1.f fVar, w1.b bVar) {
        o1.f fVar2;
        if (!s1.l.f(bVar.h(), s1.l.f49969b.a()) && !d(bVar.h())) {
            fVar2 = o1.f.f42062f1;
        } else {
            fVar2 = f57966a;
        }
        return fVar.g0(fVar2);
    }

    private static final boolean d(long j11) {
        return Float.isInfinite(s1.l.i(j11)) && Float.isInfinite(s1.l.g(j11));
    }
}