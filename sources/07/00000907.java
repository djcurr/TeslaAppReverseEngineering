package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h0 extends m0 implements j0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h0 g(ViewGroup viewGroup) {
        return (h0) m0.e(viewGroup);
    }

    @Override // androidx.transition.j0
    public void c(View view) {
        this.f6187a.b(view);
    }

    @Override // androidx.transition.j0
    public void d(View view) {
        this.f6187a.g(view);
    }
}