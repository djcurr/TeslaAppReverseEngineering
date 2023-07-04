package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView.h f5476a;

    public b(RecyclerView.h hVar) {
        this.f5476a = hVar;
    }

    @Override // androidx.recyclerview.widget.r
    public void a(int i11, int i12) {
        this.f5476a.notifyItemRangeInserted(i11, i12);
    }

    @Override // androidx.recyclerview.widget.r
    public void b(int i11, int i12) {
        this.f5476a.notifyItemRangeRemoved(i11, i12);
    }

    @Override // androidx.recyclerview.widget.r
    public void c(int i11, int i12, Object obj) {
        this.f5476a.notifyItemRangeChanged(i11, i12, obj);
    }

    @Override // androidx.recyclerview.widget.r
    public void d(int i11, int i12) {
        this.f5476a.notifyItemMoved(i11, i12);
    }
}