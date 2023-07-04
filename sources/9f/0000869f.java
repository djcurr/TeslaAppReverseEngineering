package mg;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private volatile int f38491a = -1;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f38492b;

    private void c() {
        ViewParent viewParent = this.f38492b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f38492b = null;
        }
    }

    @Override // mg.b
    public boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i11 = this.f38491a;
        return (i11 == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i11) ? false : true;
    }

    public void b() {
        this.f38491a = -1;
        c();
    }

    public void d(int i11, ViewParent viewParent) {
        this.f38491a = i11;
        c();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f38492b = viewParent;
        }
    }
}