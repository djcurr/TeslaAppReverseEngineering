package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    Context f1379a;

    /* renamed from: b  reason: collision with root package name */
    LayoutInflater f1380b;

    /* renamed from: c  reason: collision with root package name */
    e f1381c;

    /* renamed from: d  reason: collision with root package name */
    ExpandedMenuView f1382d;

    /* renamed from: e  reason: collision with root package name */
    int f1383e;

    /* renamed from: f  reason: collision with root package name */
    int f1384f;

    /* renamed from: g  reason: collision with root package name */
    int f1385g;

    /* renamed from: h  reason: collision with root package name */
    private j.a f1386h;

    /* renamed from: i  reason: collision with root package name */
    a f1387i;

    /* loaded from: classes.dex */
    private class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private int f1388a = -1;

        public a() {
            a();
        }

        void a() {
            g v11 = c.this.f1381c.v();
            if (v11 != null) {
                ArrayList<g> z11 = c.this.f1381c.z();
                int size = z11.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (z11.get(i11) == v11) {
                        this.f1388a = i11;
                        return;
                    }
                }
            }
            this.f1388a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public g getItem(int i11) {
            ArrayList<g> z11 = c.this.f1381c.z();
            int i12 = i11 + c.this.f1383e;
            int i13 = this.f1388a;
            if (i13 >= 0 && i12 >= i13) {
                i12++;
            }
            return z11.get(i12);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f1381c.z().size() - c.this.f1383e;
            return this.f1388a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f1380b.inflate(cVar.f1385g, viewGroup, false);
            }
            ((k.a) view).c(getItem(i11), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i11) {
        this(i11, 0);
        this.f1379a = context;
        this.f1380b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z11) {
        j.a aVar = this.f1386h;
        if (aVar != null) {
            aVar.a(eVar, z11);
        }
    }

    public ListAdapter b() {
        if (this.f1387i == null) {
            this.f1387i = new a();
        }
        return this.f1387i;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1386h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            new f(mVar).d(null);
            j.a aVar = this.f1386h;
            if (aVar != null) {
                aVar.b(mVar);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z11) {
        a aVar = this.f1387i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        if (this.f1384f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1384f);
            this.f1379a = contextThemeWrapper;
            this.f1380b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1379a != null) {
            this.f1379a = context;
            if (this.f1380b == null) {
                this.f1380b = LayoutInflater.from(context);
            }
        }
        this.f1381c = eVar;
        a aVar = this.f1387i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public k j(ViewGroup viewGroup) {
        if (this.f1382d == null) {
            this.f1382d = (ExpandedMenuView) this.f1380b.inflate(g.g.f27147g, viewGroup, false);
            if (this.f1387i == null) {
                this.f1387i = new a();
            }
            this.f1382d.setAdapter((ListAdapter) this.f1387i);
            this.f1382d.setOnItemClickListener(this);
        }
        return this.f1382d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        this.f1381c.M(this.f1387i.getItem(i11), this, 0);
    }

    public c(int i11, int i12) {
        this.f1385g = i11;
        this.f1384f = i12;
    }
}