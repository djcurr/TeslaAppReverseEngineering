package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: a  reason: collision with root package name */
    protected Context f1340a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f1341b;

    /* renamed from: c  reason: collision with root package name */
    protected e f1342c;

    /* renamed from: d  reason: collision with root package name */
    protected LayoutInflater f1343d;

    /* renamed from: e  reason: collision with root package name */
    private j.a f1344e;

    /* renamed from: f  reason: collision with root package name */
    private int f1345f;

    /* renamed from: g  reason: collision with root package name */
    private int f1346g;

    /* renamed from: h  reason: collision with root package name */
    protected k f1347h;

    public a(Context context, int i11, int i12) {
        this.f1340a = context;
        this.f1343d = LayoutInflater.from(context);
        this.f1345f = i11;
        this.f1346g = i12;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z11) {
        j.a aVar = this.f1344e;
        if (aVar != null) {
            aVar.a(eVar, z11);
        }
    }

    protected void b(View view, int i11) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1347h).addView(view, i11);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1344e = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        j.a aVar = this.f1344e;
        m mVar2 = mVar;
        if (aVar != null) {
            if (mVar == null) {
                mVar2 = this.f1342c;
            }
            return aVar.b(mVar2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z11) {
        ViewGroup viewGroup = (ViewGroup) this.f1347h;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f1342c;
        int i11 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> E = this.f1342c.E();
            int size = E.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                g gVar = E.get(i13);
                if (q(i12, gVar)) {
                    View childAt = viewGroup.getChildAt(i12);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n11 = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n11.setPressed(false);
                        n11.jumpDrawablesToCurrentState();
                    }
                    if (n11 != childAt) {
                        b(n11, i12);
                    }
                    i12++;
                }
            }
            i11 = i12;
        }
        while (i11 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i11)) {
                i11++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        this.f1341b = context;
        LayoutInflater.from(context);
        this.f1342c = eVar;
    }

    public abstract void j(g gVar, k.a aVar);

    public k.a k(ViewGroup viewGroup) {
        return (k.a) this.f1343d.inflate(this.f1346g, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i11) {
        viewGroup.removeViewAt(i11);
        return true;
    }

    public j.a m() {
        return this.f1344e;
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a k11;
        if (view instanceof k.a) {
            k11 = (k.a) view;
        } else {
            k11 = k(viewGroup);
        }
        j(gVar, k11);
        return (View) k11;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f1347h == null) {
            k kVar = (k) this.f1343d.inflate(this.f1345f, viewGroup, false);
            this.f1347h = kVar;
            kVar.a(this.f1342c);
            f(true);
        }
        return this.f1347h;
    }

    public void p(int i11) {
    }

    public abstract boolean q(int i11, g gVar);
}