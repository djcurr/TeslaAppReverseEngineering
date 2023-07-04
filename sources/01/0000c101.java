package y0;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import v1.e;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f58688a = x2.g.f(24);

    /* renamed from: b  reason: collision with root package name */
    private static final float f58689b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f58690c;

    /* renamed from: d  reason: collision with root package name */
    private static final float f58691d;

    /* renamed from: e  reason: collision with root package name */
    private static final float f58692e;

    /* renamed from: f  reason: collision with root package name */
    private static final float f58693f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<v1.e, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1<t1.a0> f58694a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v1<x2.g> f58695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v1<t1.a0> v1Var, v1<x2.g> v1Var2) {
            super(1);
            this.f58694a = v1Var;
            this.f58695b = v1Var2;
        }

        public final void a(v1.e Canvas) {
            kotlin.jvm.internal.s.g(Canvas, "$this$Canvas");
            float i02 = Canvas.i0(v0.f58693f);
            float f11 = i02 / 2;
            e.b.b(Canvas, this.f58694a.getValue().v(), Canvas.i0(v0.f58691d) - f11, 0L, BitmapDescriptorFactory.HUE_RED, new v1.j(i02, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), null, 0, 108, null);
            if (x2.g.e(this.f58695b.getValue().l(), x2.g.f(0)) > 0) {
                e.b.b(Canvas, this.f58694a.getValue().v(), Canvas.i0(this.f58695b.getValue().l()) - f11, 0L, BitmapDescriptorFactory.HUE_RED, v1.i.f53871a, null, 0, 108, null);
            }
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.e eVar) {
            a(eVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f58696a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f58697b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f58698c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f58699d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o0.m f58700e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t0 f58701f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f58702g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f58703h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, h00.a<vz.b0> aVar, o1.f fVar, boolean z12, o0.m mVar, t0 t0Var, int i11, int i12) {
            super(2);
            this.f58696a = z11;
            this.f58697b = aVar;
            this.f58698c = fVar;
            this.f58699d = z12;
            this.f58700e = mVar;
            this.f58701f = t0Var;
            this.f58702g = i11;
            this.f58703h = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            v0.a(this.f58696a, this.f58697b, this.f58698c, this.f58699d, this.f58700e, this.f58701f, iVar, this.f58702g | 1, this.f58703h);
        }
    }

    static {
        float f11 = 2;
        f58689b = x2.g.f(f11);
        float f12 = x2.g.f(20);
        f58690c = f12;
        f58691d = x2.g.f(f12 / f11);
        f58692e = x2.g.f(12);
        f58693f = x2.g.f(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0136  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r22, h00.a<vz.b0> r23, o1.f r24, boolean r25, o0.m r26, y0.t0 r27, c1.i r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.v0.a(boolean, h00.a, o1.f, boolean, o0.m, y0.t0, c1.i, int, int):void");
    }
}