package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u extends BitmapDrawable {

    /* renamed from: h  reason: collision with root package name */
    private static final Paint f20766h = new Paint();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f20767a;

    /* renamed from: b  reason: collision with root package name */
    private final float f20768b;

    /* renamed from: c  reason: collision with root package name */
    private final t.e f20769c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f20770d;

    /* renamed from: e  reason: collision with root package name */
    long f20771e;

    /* renamed from: f  reason: collision with root package name */
    boolean f20772f;

    /* renamed from: g  reason: collision with root package name */
    int f20773g;

    u(Context context, Bitmap bitmap, Drawable drawable, t.e eVar, boolean z11, boolean z12) {
        super(context.getResources(), bitmap);
        this.f20773g = 255;
        this.f20767a = z12;
        this.f20768b = context.getResources().getDisplayMetrics().density;
        this.f20769c = eVar;
        if ((eVar == t.e.MEMORY || z11) ? false : true) {
            this.f20770d = drawable;
            this.f20772f = true;
            this.f20771e = SystemClock.uptimeMillis();
        }
    }

    private void a(Canvas canvas) {
        Paint paint = f20766h;
        paint.setColor(-1);
        canvas.drawPath(b(0, 0, (int) (this.f20768b * 16.0f)), paint);
        paint.setColor(this.f20769c.debugColor);
        canvas.drawPath(b(0, 0, (int) (this.f20768b * 15.0f)), paint);
    }

    private static Path b(int i11, int i12, int i13) {
        Path path = new Path();
        float f11 = i11;
        float f12 = i12;
        path.moveTo(f11, f12);
        path.lineTo(i11 + i13, f12);
        path.lineTo(f11, i12 + i13);
        return path;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ImageView imageView, Context context, Bitmap bitmap, t.e eVar, boolean z11, boolean z12) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new u(context, bitmap, drawable, eVar, z11, z12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.f20772f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f20771e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f20772f = false;
                this.f20770d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f20770d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f20773g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f20773g);
            }
        }
        if (this.f20767a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20770d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f20773g = i11;
        Drawable drawable = this.f20770d;
        if (drawable != null) {
            drawable.setAlpha(i11);
        }
        super.setAlpha(i11);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f20770d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}