package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class u extends y {

    /* renamed from: c  reason: collision with root package name */
    private t f5700c;

    /* renamed from: d  reason: collision with root package name */
    private t f5701d;

    /* loaded from: classes.dex */
    class a extends p {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.p, androidx.recyclerview.widget.RecyclerView.a0
        protected void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            u uVar = u.this;
            int[] c11 = uVar.c(uVar.f5707a.getLayoutManager(), view);
            int i11 = c11[0];
            int i12 = c11[1];
            int w11 = w(Math.max(Math.abs(i11), Math.abs(i12)));
            if (w11 > 0) {
                aVar.d(i11, i12, w11, this.f5688j);
            }
        }

        @Override // androidx.recyclerview.widget.p
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.p
        protected int x(int i11) {
            return Math.min(100, super.x(i11));
        }
    }

    private int k(View view, t tVar) {
        return (tVar.g(view) + (tVar.e(view) / 2)) - (tVar.m() + (tVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, t tVar) {
        int childCount = pVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int m11 = tVar.m() + (tVar.n() / 2);
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = pVar.getChildAt(i12);
            int abs = Math.abs((tVar.g(childAt) + (tVar.e(childAt) / 2)) - m11);
            if (abs < i11) {
                view = childAt;
                i11 = abs;
            }
        }
        return view;
    }

    private t m(RecyclerView.p pVar) {
        t tVar = this.f5701d;
        if (tVar == null || tVar.f5697a != pVar) {
            this.f5701d = t.a(pVar);
        }
        return this.f5701d;
    }

    private t n(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return o(pVar);
        }
        if (pVar.canScrollHorizontally()) {
            return m(pVar);
        }
        return null;
    }

    private t o(RecyclerView.p pVar) {
        t tVar = this.f5700c;
        if (tVar == null || tVar.f5697a != pVar) {
            this.f5700c = t.c(pVar);
        }
        return this.f5700c;
    }

    private boolean p(RecyclerView.p pVar, int i11, int i12) {
        return pVar.canScrollHorizontally() ? i11 > 0 : i12 > 0;
    }

    private boolean q(RecyclerView.p pVar) {
        PointF computeScrollVectorForPosition;
        int itemCount = pVar.getItemCount();
        if (!(pVar instanceof RecyclerView.a0.b) || (computeScrollVectorForPosition = ((RecyclerView.a0.b) pVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < BitmapDescriptorFactory.HUE_RED || computeScrollVectorForPosition.y < BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.recyclerview.widget.y
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.canScrollHorizontally()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.canScrollVertically()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.y
    protected RecyclerView.a0 d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new a(this.f5707a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.y
    public View f(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return l(pVar, o(pVar));
        }
        if (pVar.canScrollHorizontally()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.y
    public int g(RecyclerView.p pVar, int i11, int i12) {
        t n11;
        int itemCount = pVar.getItemCount();
        if (itemCount == 0 || (n11 = n(pVar)) == null) {
            return -1;
        }
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        int childCount = pVar.getChildCount();
        View view = null;
        View view2 = null;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = pVar.getChildAt(i15);
            if (childAt != null) {
                int k11 = k(childAt, n11);
                if (k11 <= 0 && k11 > i13) {
                    view2 = childAt;
                    i13 = k11;
                }
                if (k11 >= 0 && k11 < i14) {
                    view = childAt;
                    i14 = k11;
                }
            }
        }
        boolean p11 = p(pVar, i11, i12);
        if (!p11 || view == null) {
            if (p11 || view2 == null) {
                if (p11) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int position = pVar.getPosition(view) + (q(pVar) == p11 ? -1 : 1);
                if (position < 0 || position >= itemCount) {
                    return -1;
                }
                return position;
            }
            return pVar.getPosition(view2);
        }
        return pVar.getPosition(view);
    }
}