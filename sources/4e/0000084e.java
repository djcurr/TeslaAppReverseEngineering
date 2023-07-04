package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class y extends RecyclerView.s {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f5707a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView.u f5708b = new a();

    /* loaded from: classes.dex */
    class a extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        boolean f5709a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            super.onScrollStateChanged(recyclerView, i11);
            if (i11 == 0 && this.f5709a) {
                this.f5709a = false;
                y.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            if (i11 == 0 && i12 == 0) {
                return;
            }
            this.f5709a = true;
        }
    }

    private void e() {
        this.f5707a.removeOnScrollListener(this.f5708b);
        this.f5707a.setOnFlingListener(null);
    }

    private void h() {
        if (this.f5707a.getOnFlingListener() == null) {
            this.f5707a.addOnScrollListener(this.f5708b);
            this.f5707a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean i(RecyclerView.p pVar, int i11, int i12) {
        RecyclerView.a0 d11;
        int g11;
        if (!(pVar instanceof RecyclerView.a0.b) || (d11 = d(pVar)) == null || (g11 = g(pVar, i11, i12)) == -1) {
            return false;
        }
        d11.p(g11);
        pVar.startSmoothScroll(d11);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i11, int i12) {
        RecyclerView.p layoutManager = this.f5707a.getLayoutManager();
        if (layoutManager == null || this.f5707a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f5707a.getMinFlingVelocity();
        return (Math.abs(i12) > minFlingVelocity || Math.abs(i11) > minFlingVelocity) && i(layoutManager, i11, i12);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5707a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f5707a = recyclerView;
        if (recyclerView != null) {
            h();
            new Scroller(this.f5707a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.a0 d(RecyclerView.p pVar);

    public abstract View f(RecyclerView.p pVar);

    public abstract int g(RecyclerView.p pVar, int i11, int i12);

    void j() {
        RecyclerView.p layoutManager;
        View f11;
        RecyclerView recyclerView = this.f5707a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f11 = f(layoutManager)) == null) {
            return;
        }
        int[] c11 = c(layoutManager, f11);
        if (c11[0] == 0 && c11[1] == 0) {
            return;
        }
        this.f5707a.smoothScrollBy(c11[0], c11[1]);
    }
}