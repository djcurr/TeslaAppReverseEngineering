package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class GestureDetectorCompat {

    /* renamed from: a  reason: collision with root package name */
    private final a f4435a;

    /* loaded from: classes.dex */
    interface a {
        boolean b(MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
    static class b implements a {

        /* renamed from: v  reason: collision with root package name */
        private static final int f4436v = ViewConfiguration.getTapTimeout();

        /* renamed from: w  reason: collision with root package name */
        private static final int f4437w = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a  reason: collision with root package name */
        private int f4438a;

        /* renamed from: b  reason: collision with root package name */
        private int f4439b;

        /* renamed from: c  reason: collision with root package name */
        private int f4440c;

        /* renamed from: d  reason: collision with root package name */
        private int f4441d;

        /* renamed from: e  reason: collision with root package name */
        private final Handler f4442e;

        /* renamed from: f  reason: collision with root package name */
        final GestureDetector.OnGestureListener f4443f;

        /* renamed from: g  reason: collision with root package name */
        GestureDetector.OnDoubleTapListener f4444g;

        /* renamed from: h  reason: collision with root package name */
        boolean f4445h;

        /* renamed from: i  reason: collision with root package name */
        boolean f4446i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f4447j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f4448k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f4449l;

        /* renamed from: m  reason: collision with root package name */
        MotionEvent f4450m;

        /* renamed from: n  reason: collision with root package name */
        private MotionEvent f4451n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f4452o;

        /* renamed from: p  reason: collision with root package name */
        private float f4453p;

        /* renamed from: q  reason: collision with root package name */
        private float f4454q;

        /* renamed from: r  reason: collision with root package name */
        private float f4455r;

        /* renamed from: s  reason: collision with root package name */
        private float f4456s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f4457t;

        /* renamed from: u  reason: collision with root package name */
        private VelocityTracker f4458u;

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f4442e = new a(handler);
            } else {
                this.f4442e = new a();
            }
            this.f4443f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                g((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            e(context);
        }

        private void a() {
            this.f4442e.removeMessages(1);
            this.f4442e.removeMessages(2);
            this.f4442e.removeMessages(3);
            this.f4458u.recycle();
            this.f4458u = null;
            this.f4452o = false;
            this.f4445h = false;
            this.f4448k = false;
            this.f4449l = false;
            this.f4446i = false;
            if (this.f4447j) {
                this.f4447j = false;
            }
        }

        private void c() {
            this.f4442e.removeMessages(1);
            this.f4442e.removeMessages(2);
            this.f4442e.removeMessages(3);
            this.f4452o = false;
            this.f4448k = false;
            this.f4449l = false;
            this.f4446i = false;
            if (this.f4447j) {
                this.f4447j = false;
            }
        }

        private void e(Context context) {
            if (context != null) {
                if (this.f4443f != null) {
                    this.f4457t = true;
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                    int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                    int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                    this.f4440c = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f4441d = viewConfiguration.getScaledMaximumFlingVelocity();
                    this.f4438a = scaledTouchSlop * scaledTouchSlop;
                    this.f4439b = scaledDoubleTapSlop * scaledDoubleTapSlop;
                    return;
                }
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            throw new IllegalArgumentException("Context must not be null");
        }

        private boolean f(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (this.f4449l && motionEvent3.getEventTime() - motionEvent2.getEventTime() <= f4437w) {
                int x11 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
                int y11 = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
                return (x11 * x11) + (y11 * y11) < this.f4439b;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
        @Override // androidx.core.view.GestureDetectorCompat.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b(android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 589
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.GestureDetectorCompat.b.b(android.view.MotionEvent):boolean");
        }

        void d() {
            this.f4442e.removeMessages(3);
            this.f4446i = false;
            this.f4447j = true;
            this.f4443f.onLongPress(this.f4450m);
        }

        public void g(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f4444g = onDoubleTapListener;
        }

        /* loaded from: classes.dex */
        private class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i11 = message.what;
                if (i11 == 1) {
                    b bVar = b.this;
                    bVar.f4443f.onShowPress(bVar.f4450m);
                } else if (i11 == 2) {
                    b.this.d();
                } else if (i11 == 3) {
                    b bVar2 = b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f4444g;
                    if (onDoubleTapListener != null) {
                        if (!bVar2.f4445h) {
                            onDoubleTapListener.onSingleTapConfirmed(bVar2.f4450m);
                        } else {
                            bVar2.f4446i = true;
                        }
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }

            a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* loaded from: classes.dex */
    static class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final GestureDetector f4460a;

        c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f4460a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.GestureDetectorCompat.a
        public boolean b(MotionEvent motionEvent) {
            return this.f4460a.onTouchEvent(motionEvent);
        }
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f4435a.b(motionEvent);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f4435a = new c(context, onGestureListener, handler);
        } else {
            this.f4435a = new b(context, onGestureListener, handler);
        }
    }
}