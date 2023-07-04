package androidx.viewpager2.widget;

import androidx.viewpager2.widget.f;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* loaded from: classes.dex */
final class b extends f.i {

    /* renamed from: a  reason: collision with root package name */
    private final List<f.i> f6398a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i11) {
        this.f6398a = new ArrayList(i11);
    }

    private void e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.f.i
    public void a(int i11) {
        try {
            for (f.i iVar : this.f6398a) {
                iVar.a(i11);
            }
        } catch (ConcurrentModificationException e11) {
            e(e11);
        }
    }

    @Override // androidx.viewpager2.widget.f.i
    public void b(int i11, float f11, int i12) {
        try {
            for (f.i iVar : this.f6398a) {
                iVar.b(i11, f11, i12);
            }
        } catch (ConcurrentModificationException e11) {
            e(e11);
        }
    }

    @Override // androidx.viewpager2.widget.f.i
    public void c(int i11) {
        try {
            for (f.i iVar : this.f6398a) {
                iVar.c(i11);
            }
        } catch (ConcurrentModificationException e11) {
            e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(f.i iVar) {
        this.f6398a.add(iVar);
    }
}