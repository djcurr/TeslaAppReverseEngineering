package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class i extends RecyclerView.o {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f5576d = {16843284};

    /* renamed from: a  reason: collision with root package name */
    private Drawable f5577a;

    /* renamed from: b  reason: collision with root package name */
    private int f5578b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f5579c = new Rect();

    public i(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f5576d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f5577a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        i(i11);
    }

    private void f(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i11 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i11, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i11 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f5579c);
            int round = this.f5579c.right + Math.round(childAt.getTranslationX());
            this.f5577a.setBounds(round - this.f5577a.getIntrinsicWidth(), i11, round, height);
            this.f5577a.draw(canvas);
        }
        canvas.restore();
    }

    private void g(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i11 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i11, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i11 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f5579c);
            int round = this.f5579c.bottom + Math.round(childAt.getTranslationY());
            this.f5577a.setBounds(i11, round - this.f5577a.getIntrinsicHeight(), width, round);
            this.f5577a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        Drawable drawable = this.f5577a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f5578b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    public void h(Drawable drawable) {
        if (drawable != null) {
            this.f5577a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public void i(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f5578b = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (recyclerView.getLayoutManager() == null || this.f5577a == null) {
            return;
        }
        if (this.f5578b == 1) {
            g(canvas, recyclerView);
        } else {
            f(canvas, recyclerView);
        }
    }
}