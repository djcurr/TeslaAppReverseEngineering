package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.u0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1320c = {16842964, 16843049};

    /* renamed from: a  reason: collision with root package name */
    private e f1321a;

    /* renamed from: b  reason: collision with root package name */
    private int f1322b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(e eVar) {
        this.f1321a = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean d(g gVar) {
        return this.f1321a.L(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.f1322b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        d((g) getAdapter().getItem(i11));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        u0 v11 = u0.v(context, attributeSet, f1320c, i11, 0);
        if (v11.s(0)) {
            setBackgroundDrawable(v11.g(0));
        }
        if (v11.s(1)) {
            setDivider(v11.g(1));
        }
        v11.w();
    }
}