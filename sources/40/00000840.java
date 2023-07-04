package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q<T, VH extends RecyclerView.e0> extends RecyclerView.h<VH> {
    final d<T> mDiffer;
    private final d.b<T> mListener;

    /* loaded from: classes.dex */
    class a implements d.b<Object> {
        a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void a(List<Object> list, List<Object> list2) {
            q.this.onCurrentListChanged(list, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(h.f<T> fVar) {
        a aVar = new a();
        this.mListener = aVar;
        d<T> dVar = new d<>(new b(this), new c.a(fVar).a());
        this.mDiffer = dVar;
        dVar.a(aVar);
    }

    public List<T> getCurrentList() {
        return this.mDiffer.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T getItem(int i11) {
        return this.mDiffer.b().get(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.mDiffer.b().size();
    }

    public void onCurrentListChanged(List<T> list, List<T> list2) {
    }

    public void submitList(List<T> list) {
        this.mDiffer.e(list);
    }

    public void submitList(List<T> list, Runnable runnable) {
        this.mDiffer.f(list, runnable);
    }

    protected q(c<T> cVar) {
        a aVar = new a();
        this.mListener = aVar;
        d<T> dVar = new d<>(new b(this), cVar);
        this.mDiffer = dVar;
        dVar.a(aVar);
    }
}