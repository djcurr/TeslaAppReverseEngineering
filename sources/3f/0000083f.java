package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class p extends RecyclerView.a0 {

    /* renamed from: k  reason: collision with root package name */
    protected PointF f5689k;

    /* renamed from: l  reason: collision with root package name */
    private final DisplayMetrics f5690l;

    /* renamed from: n  reason: collision with root package name */
    private float f5692n;

    /* renamed from: i  reason: collision with root package name */
    protected final LinearInterpolator f5687i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    protected final DecelerateInterpolator f5688j = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    private boolean f5691m = false;

    /* renamed from: o  reason: collision with root package name */
    protected int f5693o = 0;

    /* renamed from: p  reason: collision with root package name */
    protected int f5694p = 0;

    public p(Context context) {
        this.f5690l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f5691m) {
            this.f5692n = v(this.f5690l);
            this.f5691m = true;
        }
        return this.f5692n;
    }

    private int y(int i11, int i12) {
        int i13 = i11 - i12;
        if (i11 * i13 <= 0) {
            return 0;
        }
        return i13;
    }

    protected int B() {
        PointF pointF = this.f5689k;
        if (pointF != null) {
            float f11 = pointF.y;
            if (f11 != BitmapDescriptorFactory.HUE_RED) {
                return f11 > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(RecyclerView.a0.a aVar) {
        PointF a11 = a(f());
        if (a11 != null && (a11.x != BitmapDescriptorFactory.HUE_RED || a11.y != BitmapDescriptorFactory.HUE_RED)) {
            i(a11);
            this.f5689k = a11;
            this.f5693o = (int) (a11.x * 10000.0f);
            this.f5694p = (int) (a11.y * 10000.0f);
            aVar.d((int) (this.f5693o * 1.2f), (int) (this.f5694p * 1.2f), (int) (x(10000) * 1.2f), this.f5687i);
            return;
        }
        aVar.b(f());
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void l(int i11, int i12, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f5693o = y(this.f5693o, i11);
        int y11 = y(this.f5694p, i12);
        this.f5694p = y11;
        if (this.f5693o == 0 && y11 == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void n() {
        this.f5694p = 0;
        this.f5693o = 0;
        this.f5689k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        int t11 = t(view, z());
        int u11 = u(view, B());
        int w11 = w((int) Math.sqrt((t11 * t11) + (u11 * u11)));
        if (w11 > 0) {
            aVar.d(-t11, -u11, w11, this.f5688j);
        }
    }

    public int s(int i11, int i12, int i13, int i14, int i15) {
        if (i15 != -1) {
            if (i15 != 0) {
                if (i15 == 1) {
                    return i14 - i12;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i16 = i13 - i11;
            if (i16 > 0) {
                return i16;
            }
            int i17 = i14 - i12;
            if (i17 < 0) {
                return i17;
            }
            return 0;
        }
        return i13 - i11;
    }

    public int t(View view, int i11) {
        RecyclerView.p e11 = e();
        if (e11 == null || !e11.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e11.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, e11.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, e11.getPaddingLeft(), e11.getWidth() - e11.getPaddingRight(), i11);
    }

    public int u(View view, int i11) {
        RecyclerView.p e11 = e();
        if (e11 == null || !e11.canScrollVertically()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e11.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, e11.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, e11.getPaddingTop(), e11.getHeight() - e11.getPaddingBottom(), i11);
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int w(int i11) {
        return (int) Math.ceil(x(i11) / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int x(int i11) {
        return (int) Math.ceil(Math.abs(i11) * A());
    }

    protected int z() {
        PointF pointF = this.f5689k;
        if (pointF != null) {
            float f11 = pointF.x;
            if (f11 != BitmapDescriptorFactory.HUE_RED) {
                return f11 > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
            }
        }
        return 0;
    }
}