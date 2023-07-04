package expo.modules.lineargradient;

import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"Lexpo/modules/lineargradient/LinearGradientView;", "Lexpo/modules/lineargradient/ViewType;", "view", "", "colors", "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
final class LinearGradientModule$definition$1$1$2 extends u implements p<LinearGradientView, int[], b0> {
    public static final LinearGradientModule$definition$1$1$2 INSTANCE = new LinearGradientModule$definition$1$1$2();

    LinearGradientModule$definition$1$1$2() {
        super(2);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(LinearGradientView linearGradientView, int[] iArr) {
        invoke2(linearGradientView, iArr);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinearGradientView view, int[] colors) {
        s.g(view, "view");
        s.g(colors, "colors");
        view.setColors(colors);
    }
}