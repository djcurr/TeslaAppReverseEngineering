package d2;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f23345a = new i();

    private i() {
    }

    public final long a(MotionEvent motionEvent, int i11) {
        kotlin.jvm.internal.s.g(motionEvent, "motionEvent");
        return s1.g.a(motionEvent.getRawX(i11), motionEvent.getRawY(i11));
    }
}