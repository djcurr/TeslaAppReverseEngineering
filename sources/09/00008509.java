package m0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import t1.c1;
import t1.w0;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ long f37831a;

        /* renamed from: b */
        final /* synthetic */ c1 f37832b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, c1 c1Var) {
            super(1);
            this.f37831a = j11;
            this.f37832b = c1Var;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b(AppStateModule.APP_STATE_BACKGROUND);
            y0Var.c(t1.a0.h(this.f37831a));
            y0Var.a().b("color", t1.a0.h(this.f37831a));
            y0Var.a().b("shape", this.f37832b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    public static final o1.f a(o1.f background, long j11, c1 shape) {
        kotlin.jvm.internal.s.g(background, "$this$background");
        kotlin.jvm.internal.s.g(shape, "shape");
        return background.g0(new m0.a(t1.a0.h(j11), null, BitmapDescriptorFactory.HUE_RED, shape, x0.c() ? new a(j11, shape) : x0.a(), 6, null));
    }

    public static /* synthetic */ o1.f b(o1.f fVar, long j11, c1 c1Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c1Var = w0.a();
        }
        return a(fVar, j11, c1Var);
    }
}