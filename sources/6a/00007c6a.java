package jz;

import android.content.Context;
import android.view.MotionEvent;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.g3;
import io.sentry.x3;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class h extends k {

    /* renamed from: b  reason: collision with root package name */
    private final Window.Callback f34038b;

    /* renamed from: c  reason: collision with root package name */
    private final g f34039c;

    /* renamed from: d  reason: collision with root package name */
    private final GestureDetectorCompat f34040d;

    /* renamed from: e  reason: collision with root package name */
    private final g3 f34041e;

    /* renamed from: f  reason: collision with root package name */
    private final b f34042f;

    /* loaded from: classes5.dex */
    class a implements b {
        a() {
        }
    }

    /* loaded from: classes5.dex */
    interface b {
        default MotionEvent a(MotionEvent motionEvent) {
            return MotionEvent.obtain(motionEvent);
        }
    }

    public h(Window.Callback callback, Context context, g gVar, g3 g3Var) {
        this(callback, new GestureDetectorCompat(context, gVar), gVar, g3Var, new a());
    }

    private void b(MotionEvent motionEvent) {
        this.f34040d.a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f34039c.q(motionEvent);
        }
    }

    public Window.Callback a() {
        return this.f34038b;
    }

    public void c() {
        this.f34039c.s(x3.CANCELLED);
    }

    @Override // jz.k, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                b(this.f34042f.a(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    h(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, g gVar, g3 g3Var, b bVar) {
        super(callback);
        this.f34038b = callback;
        this.f34039c = gVar;
        this.f34041e = g3Var;
        this.f34040d = gestureDetectorCompat;
        this.f34042f = bVar;
    }
}