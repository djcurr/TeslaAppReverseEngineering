package expo.modules.kotlin.modules;

import h00.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.u;
import wz.s0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n"}, d2 = {"", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
final class ModuleDefinitionBuilder$Constants$1 extends u implements a<Map<String, ? extends Object>> {
    final /* synthetic */ Pair<String, Object>[] $constants;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDefinitionBuilder$Constants$1(Pair<String, ? extends Object>[] pairArr) {
        super(0);
        this.$constants = pairArr;
    }

    @Override // h00.a
    public final Map<String, ? extends Object> invoke() {
        Map<String, ? extends Object> w11;
        w11 = s0.w(this.$constants);
        return w11;
    }
}