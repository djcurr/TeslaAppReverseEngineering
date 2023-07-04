package z1;

import android.view.View;
import kotlin.jvm.internal.s;
import z1.b;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final View f60042a;

    public c(View view) {
        s.g(view, "view");
        this.f60042a = view;
    }

    @Override // z1.a
    public void a(int i11) {
        b.a aVar = b.f60041a;
        if (b.b(i11, aVar.a())) {
            this.f60042a.performHapticFeedback(0);
        } else if (b.b(i11, aVar.b())) {
            this.f60042a.performHapticFeedback(9);
        }
    }
}