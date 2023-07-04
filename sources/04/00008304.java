package le;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    InterfaceC0701a f37158a;

    /* renamed from: b  reason: collision with root package name */
    final float f37159b;

    /* renamed from: c  reason: collision with root package name */
    boolean f37160c;

    /* renamed from: d  reason: collision with root package name */
    boolean f37161d;

    /* renamed from: e  reason: collision with root package name */
    long f37162e;

    /* renamed from: f  reason: collision with root package name */
    float f37163f;

    /* renamed from: g  reason: collision with root package name */
    float f37164g;

    /* renamed from: le.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0701a {
        boolean c();
    }

    public a(Context context) {
        this.f37159b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a c(Context context) {
        return new a(context);
    }

    public void a() {
        this.f37158a = null;
        e();
    }

    public boolean b() {
        return this.f37160c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0701a interfaceC0701a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f37160c = true;
            this.f37161d = true;
            this.f37162e = motionEvent.getEventTime();
            this.f37163f = motionEvent.getX();
            this.f37164g = motionEvent.getY();
        } else if (action == 1) {
            this.f37160c = false;
            if (Math.abs(motionEvent.getX() - this.f37163f) > this.f37159b || Math.abs(motionEvent.getY() - this.f37164g) > this.f37159b) {
                this.f37161d = false;
            }
            if (this.f37161d && motionEvent.getEventTime() - this.f37162e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0701a = this.f37158a) != null) {
                interfaceC0701a.c();
            }
            this.f37161d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f37160c = false;
                this.f37161d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f37163f) > this.f37159b || Math.abs(motionEvent.getY() - this.f37164g) > this.f37159b) {
            this.f37161d = false;
        }
        return true;
    }

    public void e() {
        this.f37160c = false;
        this.f37161d = false;
    }

    public void f(InterfaceC0701a interfaceC0701a) {
        this.f37158a = interfaceC0701a;
    }
}