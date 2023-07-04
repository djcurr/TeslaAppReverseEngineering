package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e0 {

    /* loaded from: classes.dex */
    public static final class a implements u20.h<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f4505a;

        a(ViewGroup viewGroup) {
            this.f4505a = viewGroup;
        }

        @Override // u20.h
        public Iterator<View> iterator() {
            return e0.b(this.f4505a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Iterator<View>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private int f4506a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f4507b;

        b(ViewGroup viewGroup) {
            this.f4507b = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.f4507b;
            int i11 = this.f4506a;
            this.f4506a = i11 + 1;
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4506a < this.f4507b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f4507b;
            int i11 = this.f4506a - 1;
            this.f4506a = i11;
            viewGroup.removeViewAt(i11);
        }
    }

    public static final u20.h<View> a(ViewGroup viewGroup) {
        kotlin.jvm.internal.s.g(viewGroup, "<this>");
        return new a(viewGroup);
    }

    public static final Iterator<View> b(ViewGroup viewGroup) {
        kotlin.jvm.internal.s.g(viewGroup, "<this>");
        return new b(viewGroup);
    }
}