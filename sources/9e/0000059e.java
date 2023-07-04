package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.classic.spi.CallerData;
import f3.e;

/* loaded from: classes.dex */
public class g extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f3923a;

    /* renamed from: b  reason: collision with root package name */
    private View f3924b;

    /* renamed from: c  reason: collision with root package name */
    private int f3925c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f3924b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f3924b.getLayoutParams();
        bVar2.f3756r0.i1(0);
        e.b y11 = bVar.f3756r0.y();
        e.b bVar3 = e.b.FIXED;
        if (y11 != bVar3) {
            bVar.f3756r0.j1(bVar2.f3756r0.W());
        }
        if (bVar.f3756r0.T() != bVar3) {
            bVar.f3756r0.K0(bVar2.f3756r0.v());
        }
        bVar2.f3756r0.i1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f3923a == -1 && !isInEditMode()) {
            setVisibility(this.f3925c);
        }
        View findViewById = constraintLayout.findViewById(this.f3923a);
        this.f3924b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f3732f0 = true;
            this.f3924b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f3924b;
    }

    public int getEmptyVisibility() {
        return this.f3925c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(CallerData.NA, 0, 1, rect);
            canvas.drawText(CallerData.NA, ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i11) {
        View findViewById;
        if (this.f3923a == i11) {
            return;
        }
        View view = this.f3924b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f3924b.getLayoutParams()).f3732f0 = false;
            this.f3924b = null;
        }
        this.f3923a = i11;
        if (i11 == -1 || (findViewById = ((View) getParent()).findViewById(i11)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i11) {
        this.f3925c = i11;
    }
}