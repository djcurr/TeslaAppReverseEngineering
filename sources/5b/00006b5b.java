package expo.modules.lineargradient;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/lineargradient/LinearGradientView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
final class LinearGradientModule$definition$1$1$1 extends u implements l<Context, LinearGradientView> {
    public static final LinearGradientModule$definition$1$1$1 INSTANCE = new LinearGradientModule$definition$1$1$1();

    LinearGradientModule$definition$1$1$1() {
        super(1);
    }

    @Override // h00.l
    public final LinearGradientView invoke(Context context) {
        s.g(context, "context");
        return new LinearGradientView(context);
    }
}