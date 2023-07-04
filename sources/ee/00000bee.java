package b2;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static final class a extends u implements l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f7352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar) {
            super(1);
            this.f7352a = lVar;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("onKeyEvent");
            y0Var.a().b("onKeyEvent", this.f7352a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u implements l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f7353a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar) {
            super(1);
            this.f7353a = lVar;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("onPreviewKeyEvent");
            y0Var.a().b("onPreviewKeyEvent", this.f7353a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    public static final o1.f a(o1.f fVar, l<? super b2.b, Boolean> onKeyEvent) {
        s.g(fVar, "<this>");
        s.g(onKeyEvent, "onKeyEvent");
        l aVar = x0.c() ? new a(onKeyEvent) : x0.a();
        f.a aVar2 = o1.f.f42062f1;
        return x0.b(fVar, aVar, new e(onKeyEvent, null));
    }

    public static final o1.f b(o1.f fVar, l<? super b2.b, Boolean> onPreviewKeyEvent) {
        s.g(fVar, "<this>");
        s.g(onPreviewKeyEvent, "onPreviewKeyEvent");
        l bVar = x0.c() ? new b(onPreviewKeyEvent) : x0.a();
        f.a aVar = o1.f.f42062f1;
        return x0.b(fVar, bVar, new e(null, onPreviewKeyEvent));
    }
}