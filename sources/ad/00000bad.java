package b1;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.u;
import wz.w;

/* loaded from: classes.dex */
public final class i extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final int f7240a;

    /* renamed from: b  reason: collision with root package name */
    private final List<l> f7241b;

    /* renamed from: c  reason: collision with root package name */
    private final List<l> f7242c;

    /* renamed from: d  reason: collision with root package name */
    private final j f7243d;

    /* renamed from: e  reason: collision with root package name */
    private int f7244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        s.g(context, "context");
        this.f7240a = 5;
        ArrayList arrayList = new ArrayList();
        this.f7241b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f7242c = arrayList2;
        this.f7243d = new j();
        setClipChildren(false);
        l lVar = new l(context);
        addView(lVar);
        arrayList.add(lVar);
        arrayList2.add(lVar);
        this.f7244e = 1;
        setTag(o1.g.I, Boolean.TRUE);
    }

    public final void a(a aVar) {
        s.g(aVar, "<this>");
        aVar.n();
        l b11 = this.f7243d.b(aVar);
        if (b11 != null) {
            b11.d();
            this.f7243d.c(aVar);
            this.f7242c.add(b11);
        }
    }

    public final l b(a aVar) {
        int k11;
        s.g(aVar, "<this>");
        l b11 = this.f7243d.b(aVar);
        if (b11 != null) {
            return b11;
        }
        l lVar = (l) u.G(this.f7242c);
        if (lVar == null) {
            int i11 = this.f7244e;
            k11 = w.k(this.f7241b);
            if (i11 > k11) {
                Context context = getContext();
                s.f(context, "context");
                lVar = new l(context);
                addView(lVar);
                this.f7241b.add(lVar);
            } else {
                lVar = this.f7241b.get(this.f7244e);
                a a11 = this.f7243d.a(lVar);
                if (a11 != null) {
                    a11.n();
                    this.f7243d.c(a11);
                    lVar.d();
                }
            }
            int i12 = this.f7244e;
            if (i12 < this.f7240a - 1) {
                this.f7244e = i12 + 1;
            } else {
                this.f7244e = 0;
            }
        }
        this.f7243d.d(aVar, lVar);
        return lVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }
}