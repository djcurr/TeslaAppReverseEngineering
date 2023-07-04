package lk;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final Dialog f37208a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37209b;

    /* renamed from: c  reason: collision with root package name */
    private final int f37210c;

    /* renamed from: d  reason: collision with root package name */
    private final int f37211d;

    public a(Dialog dialog, Rect rect) {
        this.f37208a = dialog;
        this.f37209b = rect.left;
        this.f37210c = rect.top;
        this.f37211d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f37209b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f37210c + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i11 = this.f37211d;
            obtain.setLocation((-i11) - 1, (-i11) - 1);
        }
        view.performClick();
        return this.f37208a.onTouchEvent(obtain);
    }
}