package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import w00.i;
import w00.q;
import w00.u;

/* loaded from: classes5.dex */
public interface b extends kotlin.reflect.jvm.internal.impl.descriptors.a, u {

    /* loaded from: classes5.dex */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, w00.i
    b a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    Collection<? extends b> d();

    a getKind();

    void y0(Collection<? extends b> collection);

    b z0(i iVar, f fVar, q qVar, a aVar, boolean z11);
}