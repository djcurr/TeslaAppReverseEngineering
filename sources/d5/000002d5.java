package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* loaded from: classes.dex */
class y0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2024a;

    /* renamed from: b  reason: collision with root package name */
    private final View f2025b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f2026c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f2027d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f2028e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f2029f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f2030g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2027d = layoutParams;
        this.f2028e = new Rect();
        this.f2029f = new int[2];
        this.f2030g = new int[2];
        this.f2024a = context;
        View inflate = LayoutInflater.from(context).inflate(g.g.f27159s, (ViewGroup) null);
        this.f2025b = inflate;
        this.f2026c = (TextView) inflate.findViewById(g.f.f27133s);
        layoutParams.setTitle(y0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = g.i.f27175a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i11, int i12, boolean z11, WindowManager.LayoutParams layoutParams) {
        int height;
        int i13;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2024a.getResources().getDimensionPixelOffset(g.d.f27086m);
        if (view.getWidth() < dimensionPixelOffset) {
            i11 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2024a.getResources().getDimensionPixelOffset(g.d.f27085l);
            height = i12 + dimensionPixelOffset2;
            i13 = i12 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i13 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f2024a.getResources().getDimensionPixelOffset(z11 ? g.d.f27088o : g.d.f27087n);
        View b11 = b(view);
        if (b11 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b11.getWindowVisibleDisplayFrame(this.f2028e);
        Rect rect = this.f2028e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f2024a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f2028e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b11.getLocationOnScreen(this.f2030g);
        view.getLocationOnScreen(this.f2029f);
        int[] iArr = this.f2029f;
        int i14 = iArr[0];
        int[] iArr2 = this.f2030g;
        iArr[0] = i14 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i11) - (b11.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f2025b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f2025b.getMeasuredHeight();
        int[] iArr3 = this.f2029f;
        int i15 = ((iArr3[1] + i13) - dimensionPixelOffset3) - measuredHeight;
        int i16 = iArr3[1] + height + dimensionPixelOffset3;
        if (z11) {
            if (i15 >= 0) {
                layoutParams.y = i15;
            } else {
                layoutParams.y = i16;
            }
        } else if (measuredHeight + i16 <= this.f2028e.height()) {
            layoutParams.y = i16;
        } else {
            layoutParams.y = i15;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f2024a.getSystemService("window")).removeView(this.f2025b);
        }
    }

    boolean d() {
        return this.f2025b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i11, int i12, boolean z11, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f2026c.setText(charSequence);
        a(view, i11, i12, z11, this.f2027d);
        ((WindowManager) this.f2024a.getSystemService("window")).addView(this.f2025b, this.f2027d);
    }
}