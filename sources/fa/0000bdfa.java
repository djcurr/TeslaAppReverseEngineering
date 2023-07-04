package x0;

import androidx.compose.ui.platform.y1;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final y1 f56559a;

    /* renamed from: b  reason: collision with root package name */
    private int f56560b;

    /* renamed from: c  reason: collision with root package name */
    private d2.u f56561c;

    public c(y1 viewConfiguration) {
        kotlin.jvm.internal.s.g(viewConfiguration, "viewConfiguration");
        this.f56559a = viewConfiguration;
    }

    public final int a() {
        return this.f56560b;
    }

    public final boolean b(d2.u prevClick, d2.u newClick) {
        kotlin.jvm.internal.s.g(prevClick, "prevClick");
        kotlin.jvm.internal.s.g(newClick, "newClick");
        return ((double) s1.f.k(s1.f.p(newClick.h(), prevClick.h()))) < 100.0d;
    }

    public final boolean c(d2.u prevClick, d2.u newClick) {
        kotlin.jvm.internal.s.g(prevClick, "prevClick");
        kotlin.jvm.internal.s.g(newClick, "newClick");
        return newClick.n() - prevClick.n() < this.f56559a.a();
    }

    public final void d(d2.m event) {
        kotlin.jvm.internal.s.g(event, "event");
        d2.u uVar = this.f56561c;
        d2.u uVar2 = event.b().get(0);
        if (uVar != null && c(uVar, uVar2) && b(uVar, uVar2)) {
            this.f56560b++;
        } else {
            this.f56560b = 1;
        }
        this.f56561c = uVar2;
    }
}