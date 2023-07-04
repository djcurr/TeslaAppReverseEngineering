package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private final p f3711a;

    /* renamed from: c  reason: collision with root package name */
    private HashSet<View> f3713c;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<u.b> f3715e;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<u> f3712b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private String f3714d = "ViewTransitionController";

    /* renamed from: f  reason: collision with root package name */
    ArrayList<u.b> f3716f = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements j.a {
        a(v vVar, u uVar, int i11, boolean z11, int i12) {
        }
    }

    public v(p pVar) {
        this.f3711a = pVar;
    }

    private void e(u uVar, boolean z11) {
        ConstraintLayout.getSharedValues().a(uVar.h(), new a(this, uVar, uVar.h(), z11, uVar.g()));
    }

    private void i(u uVar, View... viewArr) {
        int currentState = this.f3711a.getCurrentState();
        if (uVar.f3679e == 2) {
            uVar.c(this, this.f3711a, currentState, null, viewArr);
        } else if (currentState == -1) {
            String str = this.f3714d;
            Log.w(str, "No support for ViewTransition within transition yet. Currently: " + this.f3711a.toString());
        } else {
            androidx.constraintlayout.widget.d t11 = this.f3711a.t(currentState);
            if (t11 == null) {
                return;
            }
            uVar.c(this, this.f3711a, currentState, t11, viewArr);
        }
    }

    public void a(u uVar) {
        this.f3712b.add(uVar);
        this.f3713c = null;
        if (uVar.i() == 4) {
            e(uVar, true);
        } else if (uVar.i() == 5) {
            e(uVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(u.b bVar) {
        if (this.f3715e == null) {
            this.f3715e = new ArrayList<>();
        }
        this.f3715e.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        ArrayList<u.b> arrayList = this.f3715e;
        if (arrayList == null) {
            return;
        }
        Iterator<u.b> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.f3715e.removeAll(this.f3716f);
        this.f3716f.clear();
        if (this.f3715e.isEmpty()) {
            this.f3715e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f3711a.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(u.b bVar) {
        this.f3716f.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(MotionEvent motionEvent) {
        u uVar;
        int currentState = this.f3711a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f3713c == null) {
            this.f3713c = new HashSet<>();
            Iterator<u> it2 = this.f3712b.iterator();
            while (it2.hasNext()) {
                u next = it2.next();
                int childCount = this.f3711a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = this.f3711a.getChildAt(i11);
                    if (next.k(childAt)) {
                        childAt.getId();
                        this.f3713c.add(childAt);
                    }
                }
            }
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<u.b> arrayList = this.f3715e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<u.b> it3 = this.f3715e.iterator();
            while (it3.hasNext()) {
                it3.next().d(action, x11, y11);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.d t11 = this.f3711a.t(currentState);
            Iterator<u> it4 = this.f3712b.iterator();
            while (it4.hasNext()) {
                u next2 = it4.next();
                if (next2.m(action)) {
                    Iterator<View> it5 = this.f3713c.iterator();
                    while (it5.hasNext()) {
                        View next3 = it5.next();
                        if (next2.k(next3)) {
                            next3.getHitRect(rect);
                            if (rect.contains((int) x11, (int) y11)) {
                                uVar = next2;
                                next2.c(this, this.f3711a, currentState, t11, next3);
                            } else {
                                uVar = next2;
                            }
                            next2 = uVar;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(int i11, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<u> it2 = this.f3712b.iterator();
        u uVar = null;
        while (it2.hasNext()) {
            u next = it2.next();
            if (next.e() == i11) {
                for (View view : viewArr) {
                    if (next.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    i(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                uVar = next;
            }
        }
        if (uVar == null) {
            Log.e(this.f3714d, " Could not find ViewTransition");
        }
    }
}