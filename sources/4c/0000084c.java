package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RecyclerView.b0 b0Var, t tVar, View view, View view2, RecyclerView.p pVar, boolean z11) {
        if (pVar.getChildCount() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1;
        }
        return Math.min(tVar.n(), tVar.d(view2) - tVar.g(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(RecyclerView.b0 b0Var, t tVar, View view, View view2, RecyclerView.p pVar, boolean z11, boolean z12) {
        int max;
        if (pVar.getChildCount() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.getPosition(view), pVar.getPosition(view2));
        int max2 = Math.max(pVar.getPosition(view), pVar.getPosition(view2));
        if (z12) {
            max = Math.max(0, (b0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z11) {
            return Math.round((max * (Math.abs(tVar.d(view2) - tVar.g(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1))) + (tVar.m() - tVar.g(view)));
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(RecyclerView.b0 b0Var, t tVar, View view, View view2, RecyclerView.p pVar, boolean z11) {
        if (pVar.getChildCount() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return b0Var.b();
        }
        return (int) (((tVar.d(view2) - tVar.g(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1)) * b0Var.b());
    }
}