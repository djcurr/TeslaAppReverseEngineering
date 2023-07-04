package r0;

import android.view.View;
import androidx.compose.ui.platform.z;
import c1.e1;
import f2.u0;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes.dex */
public final class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f48909a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f48910b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f48911c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u0 f48912d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f48913e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, p pVar, c cVar, u0 u0Var, int i11) {
            super(2);
            this.f48909a = lVar;
            this.f48910b = pVar;
            this.f48911c = cVar;
            this.f48912d = u0Var;
            this.f48913e = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            o.a(this.f48909a, this.f48910b, this.f48911c, this.f48912d, iVar, this.f48913e | 1);
        }
    }

    public static final void a(l prefetchPolicy, p state, c itemContentFactory, u0 subcomposeLayoutState, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(prefetchPolicy, "prefetchPolicy");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(itemContentFactory, "itemContentFactory");
        kotlin.jvm.internal.s.g(subcomposeLayoutState, "subcomposeLayoutState");
        c1.i h11 = iVar.h(-649386156);
        View view = (View) h11.A(z.k());
        int i12 = u0.f25621n;
        h11.x(-3686095);
        boolean O = h11.O(subcomposeLayoutState) | h11.O(prefetchPolicy) | h11.O(view);
        Object y11 = h11.y();
        if (O || y11 == c1.i.f8486a.a()) {
            h11.p(new n(prefetchPolicy, state, subcomposeLayoutState, itemContentFactory, view));
        }
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new a(prefetchPolicy, state, itemContentFactory, subcomposeLayoutState, i11));
    }
}