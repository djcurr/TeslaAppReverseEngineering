package expo.modules.kotlin;

import com.facebook.react.bridge.Dynamic;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"T", "Lcom/facebook/react/bridge/Dynamic;", "Lkotlin/Function1;", "block", "recycle", "(Lcom/facebook/react/bridge/Dynamic;Lh00/l;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class DynamicExtenstionsKt {
    public static final <T> T recycle(Dynamic dynamic, l<? super Dynamic, ? extends T> block) {
        s.g(dynamic, "<this>");
        s.g(block, "block");
        try {
            return block.invoke(dynamic);
        } finally {
            q.b(1);
            dynamic.recycle();
            q.a(1);
        }
    }
}