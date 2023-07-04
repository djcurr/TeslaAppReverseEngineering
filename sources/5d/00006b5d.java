package expo.modules.lineargradient;

import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"Lexpo/modules/lineargradient/LinearGradientView;", "Lexpo/modules/lineargradient/ViewType;", "view", "", "locations", "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
final class LinearGradientModule$definition$1$1$3 extends u implements p<LinearGradientView, float[], b0> {
    public static final LinearGradientModule$definition$1$1$3 INSTANCE = new LinearGradientModule$definition$1$1$3();

    LinearGradientModule$definition$1$1$3() {
        super(2);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(LinearGradientView linearGradientView, float[] fArr) {
        invoke2(linearGradientView, fArr);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinearGradientView view, float[] fArr) {
        s.g(view, "view");
        if (fArr == null) {
            return;
        }
        view.setLocations(fArr);
    }
}