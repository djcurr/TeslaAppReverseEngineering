package u00;

import j20.n;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.v;
import wz.w;

/* loaded from: classes5.dex */
public final class d extends d20.e {

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52886a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.Function.ordinal()] = 1;
            iArr[c.SuspendFunction.ordinal()] = 2;
            f52886a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n storageManager, b containingClass) {
        super(storageManager, containingClass);
        s.g(storageManager, "storageManager");
        s.g(containingClass, "containingClass");
    }

    @Override // d20.e
    protected List<kotlin.reflect.jvm.internal.impl.descriptors.e> i() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.e> d11;
        List<kotlin.reflect.jvm.internal.impl.descriptors.e> d12;
        List<kotlin.reflect.jvm.internal.impl.descriptors.e> i11;
        int i12 = a.f52886a[((b) l()).Q0().ordinal()];
        if (i12 == 1) {
            d11 = v.d(e.K.a((b) l(), false));
            return d11;
        } else if (i12 != 2) {
            i11 = w.i();
            return i11;
        } else {
            d12 = v.d(e.K.a((b) l(), true));
            return d12;
        }
    }
}