package i20;

import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class n extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j20.n storageManager, h00.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> compute) {
        super(storageManager, compute);
        s.g(storageManager, "storageManager");
        s.g(compute, "compute");
    }

    @Override // i20.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return false;
    }
}