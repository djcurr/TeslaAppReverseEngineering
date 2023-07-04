package q1;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    public static final class a extends u implements h00.l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w1.b f47316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f47317b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.a f47318c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f2.d f47319d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f47320e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t1.b0 f47321f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w1.b bVar, boolean z11, o1.a aVar, f2.d dVar, float f11, t1.b0 b0Var) {
            super(1);
            this.f47316a = bVar;
            this.f47317b = z11;
            this.f47318c = aVar;
            this.f47319d = dVar;
            this.f47320e = f11;
            this.f47321f = b0Var;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("paint");
            y0Var.a().b(PlaceTypes.PAINTER, this.f47316a);
            y0Var.a().b("sizeToIntrinsics", Boolean.valueOf(this.f47317b));
            y0Var.a().b("alignment", this.f47318c);
            y0Var.a().b("contentScale", this.f47319d);
            y0Var.a().b("alpha", Float.valueOf(this.f47320e));
            y0Var.a().b("colorFilter", this.f47321f);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    public static final o1.f a(o1.f fVar, w1.b painter, boolean z11, o1.a alignment, f2.d contentScale, float f11, t1.b0 b0Var) {
        s.g(fVar, "<this>");
        s.g(painter, "painter");
        s.g(alignment, "alignment");
        s.g(contentScale, "contentScale");
        return fVar.g0(new m(painter, z11, alignment, contentScale, f11, b0Var, x0.c() ? new a(painter, z11, alignment, contentScale, f11, b0Var) : x0.a()));
    }

    public static /* synthetic */ o1.f b(o1.f fVar, w1.b bVar, boolean z11, o1.a aVar, f2.d dVar, float f11, t1.b0 b0Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            aVar = o1.a.f42039a.d();
        }
        o1.a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            dVar = f2.d.f25565a.b();
        }
        f2.d dVar2 = dVar;
        if ((i11 & 16) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i11 & 32) != 0) {
            b0Var = null;
        }
        return a(fVar, bVar, z12, aVar2, dVar2, f12, b0Var);
    }
}