package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n implements m {

    /* renamed from: a  reason: collision with root package name */
    static final m f5677a = new n();

    n() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f11 = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            if (childAt != view) {
                float z11 = androidx.core.view.a0.z(childAt);
                if (z11 > f11) {
                    f11 = z11;
                }
            }
        }
        return f11;
    }

    @Override // androidx.recyclerview.widget.m
    public void a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            int i11 = s4.c.f50246a;
            Object tag = view.getTag(i11);
            if (tag instanceof Float) {
                androidx.core.view.a0.D0(view, ((Float) tag).floatValue());
            }
            view.setTag(i11, null);
        }
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.recyclerview.widget.m
    public void b(View view) {
    }

    @Override // androidx.recyclerview.widget.m
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f11, float f12, int i11, boolean z11) {
        if (Build.VERSION.SDK_INT >= 21 && z11) {
            int i12 = s4.c.f50246a;
            if (view.getTag(i12) == null) {
                Float valueOf = Float.valueOf(androidx.core.view.a0.z(view));
                androidx.core.view.a0.D0(view, e(recyclerView, view) + 1.0f);
                view.setTag(i12, valueOf);
            }
        }
        view.setTranslationX(f11);
        view.setTranslationY(f12);
    }

    @Override // androidx.recyclerview.widget.m
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f11, float f12, int i11, boolean z11) {
    }
}