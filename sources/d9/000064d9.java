package d2;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Map<t, u> f23309a;

    /* renamed from: b  reason: collision with root package name */
    private final w f23310b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f23311c;

    public g(Map<t, u> changes, w pointerInputEvent) {
        kotlin.jvm.internal.s.g(changes, "changes");
        kotlin.jvm.internal.s.g(pointerInputEvent, "pointerInputEvent");
        this.f23309a = changes;
        this.f23310b = pointerInputEvent;
    }

    public final Map<t, u> a() {
        return this.f23309a;
    }

    public final MotionEvent b() {
        return this.f23310b.a();
    }

    public final boolean c() {
        return this.f23311c;
    }

    public final boolean d(long j11) {
        x xVar;
        List<x> b11 = this.f23310b.b();
        int size = b11.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                xVar = null;
                break;
            }
            int i12 = i11 + 1;
            xVar = b11.get(i11);
            if (t.d(xVar.c(), j11)) {
                break;
            }
            i11 = i12;
        }
        x xVar2 = xVar;
        if (xVar2 == null) {
            return false;
        }
        return xVar2.d();
    }
}