package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.e0;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private e0.a f1569a;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        e0.a aVar = this.f1569a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.e0
    public void setOnFitSystemWindowsListener(e0.a aVar) {
        this.f1569a = aVar;
    }
}