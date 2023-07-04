package expo.modules.core.utilities;

import h00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a-\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00018\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u0004\u0018\u00010\u0005H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"T", "Lkotlin/Function0;", "block", "ifNull", "(Ljava/lang/Object;Lh00/a;)Ljava/lang/Object;", "", "takeIfInstanceOf", "(Ljava/lang/Object;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class KotlinUtilitiesKt {
    public static final <T> T ifNull(T t11, a<? extends T> block) {
        s.g(block, "block");
        return t11 == null ? block.invoke() : t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> T takeIfInstanceOf(Object obj) {
        s.m(3, "T");
        if (obj instanceof Object) {
            return obj;
        }
        return null;
    }
}