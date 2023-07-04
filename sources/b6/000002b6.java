package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class t extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    private final u f1926a;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.I);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1926a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1926a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1926a.g(canvas);
    }

    public t(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p0.a(this, getContext());
        u uVar = new u(this);
        this.f1926a = uVar;
        uVar.c(attributeSet, i11);
    }
}