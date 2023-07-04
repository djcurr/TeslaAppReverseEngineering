package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class x extends RecyclerView.m {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.e0 e0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateAppearance(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i11;
        int i12;
        if (cVar != null && ((i11 = cVar.f5373a) != (i12 = cVar2.f5373a) || cVar.f5374b != cVar2.f5374b)) {
            return animateMove(e0Var, i11, cVar.f5374b, i12, cVar2.f5374b);
        }
        return animateAdd(e0Var);
    }

    public abstract boolean animateChange(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i11, int i12, int i13, int i14);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateChange(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i11;
        int i12;
        int i13 = cVar.f5373a;
        int i14 = cVar.f5374b;
        if (e0Var2.shouldIgnore()) {
            int i15 = cVar.f5373a;
            i12 = cVar.f5374b;
            i11 = i15;
        } else {
            i11 = cVar2.f5373a;
            i12 = cVar2.f5374b;
        }
        return animateChange(e0Var, e0Var2, i13, i14, i11, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateDisappearance(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i11 = cVar.f5373a;
        int i12 = cVar.f5374b;
        View view = e0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f5373a;
        int top = cVar2 == null ? view.getTop() : cVar2.f5374b;
        if (!e0Var.isRemoved() && (i11 != left || i12 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return animateMove(e0Var, i11, i12, left, top);
        }
        return animateRemove(e0Var);
    }

    public abstract boolean animateMove(RecyclerView.e0 e0Var, int i11, int i12, int i13, int i14);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animatePersistence(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i11 = cVar.f5373a;
        int i12 = cVar2.f5373a;
        if (i11 == i12 && cVar.f5374b == cVar2.f5374b) {
            dispatchMoveFinished(e0Var);
            return false;
        }
        return animateMove(e0Var, i11, cVar.f5374b, i12, cVar2.f5374b);
    }

    public abstract boolean animateRemove(RecyclerView.e0 e0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canReuseUpdatedViewHolder(RecyclerView.e0 e0Var) {
        return !this.mSupportsChangeAnimations || e0Var.isInvalid();
    }

    public final void dispatchAddFinished(RecyclerView.e0 e0Var) {
        onAddFinished(e0Var);
        dispatchAnimationFinished(e0Var);
    }

    public final void dispatchAddStarting(RecyclerView.e0 e0Var) {
        onAddStarting(e0Var);
    }

    public final void dispatchChangeFinished(RecyclerView.e0 e0Var, boolean z11) {
        onChangeFinished(e0Var, z11);
        dispatchAnimationFinished(e0Var);
    }

    public final void dispatchChangeStarting(RecyclerView.e0 e0Var, boolean z11) {
        onChangeStarting(e0Var, z11);
    }

    public final void dispatchMoveFinished(RecyclerView.e0 e0Var) {
        onMoveFinished(e0Var);
        dispatchAnimationFinished(e0Var);
    }

    public final void dispatchMoveStarting(RecyclerView.e0 e0Var) {
        onMoveStarting(e0Var);
    }

    public final void dispatchRemoveFinished(RecyclerView.e0 e0Var) {
        onRemoveFinished(e0Var);
        dispatchAnimationFinished(e0Var);
    }

    public final void dispatchRemoveStarting(RecyclerView.e0 e0Var) {
        onRemoveStarting(e0Var);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void onAddFinished(RecyclerView.e0 e0Var) {
    }

    public void onAddStarting(RecyclerView.e0 e0Var) {
    }

    public void onChangeFinished(RecyclerView.e0 e0Var, boolean z11) {
    }

    public void onChangeStarting(RecyclerView.e0 e0Var, boolean z11) {
    }

    public void onMoveFinished(RecyclerView.e0 e0Var) {
    }

    public void onMoveStarting(RecyclerView.e0 e0Var) {
    }

    public void onRemoveFinished(RecyclerView.e0 e0Var) {
    }

    public void onRemoveStarting(RecyclerView.e0 e0Var) {
    }

    public void setSupportsChangeAnimations(boolean z11) {
        this.mSupportsChangeAnimations = z11;
    }
}