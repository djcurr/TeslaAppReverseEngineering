package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.f;
import java.util.Locale;

/* loaded from: classes.dex */
final class d extends f.i {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayoutManager f6400a;

    /* renamed from: b  reason: collision with root package name */
    private f.k f6401b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(LinearLayoutManager linearLayoutManager) {
        this.f6400a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.f.i
    public void a(int i11) {
    }

    @Override // androidx.viewpager2.widget.f.i
    public void b(int i11, float f11, int i12) {
        if (this.f6401b == null) {
            return;
        }
        float f12 = -f11;
        for (int i13 = 0; i13 < this.f6400a.getChildCount(); i13++) {
            View childAt = this.f6400a.getChildAt(i13);
            if (childAt != null) {
                this.f6401b.a(childAt, (this.f6400a.getPosition(childAt) - i11) + f12);
            } else {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i13), Integer.valueOf(this.f6400a.getChildCount())));
            }
        }
    }

    @Override // androidx.viewpager2.widget.f.i
    public void c(int i11) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f.k d() {
        return this.f6401b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(f.k kVar) {
        this.f6401b = kVar;
    }
}