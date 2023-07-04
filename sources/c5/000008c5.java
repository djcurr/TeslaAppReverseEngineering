package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
class a extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Animation.AnimationListener f5967a;

    /* renamed from: b  reason: collision with root package name */
    private int f5968b;

    /* renamed from: c  reason: collision with root package name */
    private int f5969c;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0102a extends OvalShape {

        /* renamed from: a  reason: collision with root package name */
        private Paint f5970a = new Paint();

        /* renamed from: b  reason: collision with root package name */
        private int f5971b;

        /* renamed from: c  reason: collision with root package name */
        private a f5972c;

        C0102a(a aVar, int i11) {
            this.f5972c = aVar;
            this.f5971b = i11;
            a((int) rect().width());
        }

        private void a(int i11) {
            float f11 = i11 / 2;
            this.f5970a.setShader(new RadialGradient(f11, f11, this.f5971b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = this.f5972c.getWidth() / 2;
            float height = this.f5972c.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f5970a);
            canvas.drawCircle(width2, height, width - this.f5971b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f11, float f12) {
            super.onResize(f11, f12);
            a((int) f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f11 = getContext().getResources().getDisplayMetrics().density;
        int i11 = (int) (1.75f * f11);
        int i12 = (int) (BitmapDescriptorFactory.HUE_RED * f11);
        this.f5968b = (int) (3.5f * f11);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(y4.a.f59083a);
        this.f5969c = obtainStyledAttributes.getColor(y4.a.f59084b, -328966);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            a0.D0(this, f11 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0102a(this, this.f5968b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f5968b, i12, i11, 503316480);
            int i13 = this.f5968b;
            setPadding(i13, i13, i13, i13);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f5969c);
        a0.z0(this, shapeDrawable);
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f5967a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f5967a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f5967a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f5968b * 2), getMeasuredHeight() + (this.f5968b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i11);
            this.f5969c = i11;
        }
    }
}