package m0;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import v1.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l implements p {

    /* renamed from: a  reason: collision with root package name */
    public static final l f37994a = new l();

    /* loaded from: classes.dex */
    private static final class a implements q {

        /* renamed from: a  reason: collision with root package name */
        private final v1<Boolean> f37995a;

        /* renamed from: b  reason: collision with root package name */
        private final v1<Boolean> f37996b;

        /* renamed from: c  reason: collision with root package name */
        private final v1<Boolean> f37997c;

        public a(v1<Boolean> isPressed, v1<Boolean> isHovered, v1<Boolean> isFocused) {
            kotlin.jvm.internal.s.g(isPressed, "isPressed");
            kotlin.jvm.internal.s.g(isHovered, "isHovered");
            kotlin.jvm.internal.s.g(isFocused, "isFocused");
            this.f37995a = isPressed;
            this.f37996b = isHovered;
            this.f37997c = isFocused;
        }

        @Override // m0.q
        public void a(v1.c cVar) {
            kotlin.jvm.internal.s.g(cVar, "<this>");
            cVar.s0();
            if (this.f37995a.getValue().booleanValue()) {
                e.b.j(cVar, t1.a0.l(t1.a0.f51365b.a(), 0.3f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, cVar.c(), BitmapDescriptorFactory.HUE_RED, null, null, 0, 122, null);
            } else if (this.f37996b.getValue().booleanValue() || this.f37997c.getValue().booleanValue()) {
                e.b.j(cVar, t1.a0.l(t1.a0.f51365b.a(), 0.1f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, cVar.c(), BitmapDescriptorFactory.HUE_RED, null, null, 0, 122, null);
            }
        }
    }

    private l() {
    }

    @Override // m0.p
    public q a(o0.k interactionSource, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(interactionSource, "interactionSource");
        iVar.x(1543446324);
        int i12 = i11 & 14;
        v1<Boolean> a11 = o0.r.a(interactionSource, iVar, i12);
        v1<Boolean> a12 = o0.i.a(interactionSource, iVar, i12);
        v1<Boolean> a13 = o0.f.a(interactionSource, iVar, i12);
        iVar.x(-3686930);
        boolean O = iVar.O(interactionSource);
        Object y11 = iVar.y();
        if (O || y11 == c1.i.f8486a.a()) {
            y11 = new a(a11, a12, a13);
            iVar.p(y11);
        }
        iVar.N();
        a aVar = (a) y11;
        iVar.N();
        return aVar;
    }
}