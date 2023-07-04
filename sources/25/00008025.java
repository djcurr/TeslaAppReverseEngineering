package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import v20.l2;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f35525a = true;

    private static final y a(Throwable th2, String str) {
        if (f35525a) {
            return new y(th2, str);
        }
        if (th2 == null) {
            d();
            throw new KotlinNothingValueException();
        }
        throw th2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ y b(Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(l2 l2Var) {
        return l2Var.R0() instanceof y;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final l2 e(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th2) {
            return a(th2, mainDispatcherFactory.hintOnError());
        }
    }
}