package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
class c implements e {

    /* renamed from: a  reason: collision with root package name */
    final RectF f2678a = new RectF();

    /* loaded from: classes.dex */
    class a implements g.a {
        a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f11, Paint paint) {
            float f12 = 2.0f * f11;
            float width = (rectF.width() - f12) - 1.0f;
            float height = (rectF.height() - f12) - 1.0f;
            if (f11 >= 1.0f) {
                float f13 = f11 + 0.5f;
                float f14 = -f13;
                c.this.f2678a.set(f14, f14, f13, f13);
                int save = canvas.save();
                canvas.translate(rectF.left + f13, rectF.top + f13);
                canvas.drawArc(c.this.f2678a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f2678a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, BitmapDescriptorFactory.HUE_RED);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f2678a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f2678a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f15 = rectF.top;
                canvas.drawRect((rectF.left + f13) - 1.0f, f15, (rectF.right - f13) + 1.0f, f15 + f13, paint);
                float f16 = rectF.bottom;
                canvas.drawRect((rectF.left + f13) - 1.0f, f16 - f13, (rectF.right - f13) + 1.0f, f16, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f11, rectF.right, rectF.bottom - f11, paint);
        }
    }

    private g p(Context context, ColorStateList colorStateList, float f11, float f12, float f13) {
        return new g(context.getResources(), colorStateList, f11, f12, f13);
    }

    private g q(d dVar) {
        return (g) dVar.e();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, float f11) {
        q(dVar).p(f11);
        k(dVar);
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return q(dVar).g();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar, float f11) {
        q(dVar).r(f11);
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return q(dVar).i();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList e(d dVar) {
        return q(dVar).f();
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return q(dVar).j();
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar) {
        q(dVar).m(dVar.g());
        k(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, Context context, ColorStateList colorStateList, float f11, float f12, float f13) {
        g p11 = p(context, colorStateList, f11, f12, f13);
        p11.m(dVar.g());
        dVar.c(p11);
        k(dVar);
    }

    @Override // androidx.cardview.widget.e
    public float i(d dVar) {
        return q(dVar).l();
    }

    @Override // androidx.cardview.widget.e
    public void j(d dVar) {
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar) {
        Rect rect = new Rect();
        q(dVar).h(rect);
        dVar.f((int) Math.ceil(m(dVar)), (int) Math.ceil(f(dVar)));
        dVar.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.e
    public void l() {
        g.f2692r = new a();
    }

    @Override // androidx.cardview.widget.e
    public float m(d dVar) {
        return q(dVar).k();
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, ColorStateList colorStateList) {
        q(dVar).o(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f11) {
        q(dVar).q(f11);
        k(dVar);
    }
}