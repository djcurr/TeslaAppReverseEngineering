package expo.modules.lineargradient;

import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {"Lexpo/modules/lineargradient/LinearGradientView;", "Lexpo/modules/lineargradient/ViewType;", "view", "Lvz/p;", "", "endPoint", "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
final class LinearGradientModule$definition$1$1$5 extends u implements p<LinearGradientView, vz.p<? extends Float, ? extends Float>, b0> {
    public static final LinearGradientModule$definition$1$1$5 INSTANCE = new LinearGradientModule$definition$1$1$5();

    LinearGradientModule$definition$1$1$5() {
        super(2);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(LinearGradientView linearGradientView, vz.p<? extends Float, ? extends Float> pVar) {
        invoke2(linearGradientView, (vz.p<Float, Float>) pVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinearGradientView view, vz.p<Float, Float> pVar) {
        Float d11;
        Float c11;
        s.g(view, "view");
        float f11 = 0.5f;
        if (pVar != null && (c11 = pVar.c()) != null) {
            f11 = c11.floatValue();
        }
        float f12 = 1.0f;
        if (pVar != null && (d11 = pVar.d()) != null) {
            f12 = d11.floatValue();
        }
        view.setEndPosition(f11, f12);
    }
}