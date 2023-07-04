package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public class r extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    private final p f1916a;

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.G);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        Bitmap b11 = this.f1916a.b();
        if (b11 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b11.getWidth() * getNumStars(), i11, 0), getMeasuredHeight());
        }
    }

    public r(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p0.a(this, getContext());
        p pVar = new p(this);
        this.f1916a = pVar;
        pVar.c(attributeSet, i11);
    }
}