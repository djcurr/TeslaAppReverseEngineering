package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    e f1390a;

    /* renamed from: b  reason: collision with root package name */
    private int f1391b = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1392c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1393d;

    /* renamed from: e  reason: collision with root package name */
    private final LayoutInflater f1394e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1395f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z11, int i11) {
        this.f1393d = z11;
        this.f1394e = layoutInflater;
        this.f1390a = eVar;
        this.f1395f = i11;
        a();
    }

    void a() {
        g v11 = this.f1390a.v();
        if (v11 != null) {
            ArrayList<g> z11 = this.f1390a.z();
            int size = z11.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (z11.get(i11) == v11) {
                    this.f1391b = i11;
                    return;
                }
            }
        }
        this.f1391b = -1;
    }

    public e b() {
        return this.f1390a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public g getItem(int i11) {
        ArrayList<g> z11 = this.f1393d ? this.f1390a.z() : this.f1390a.E();
        int i12 = this.f1391b;
        if (i12 >= 0 && i11 >= i12) {
            i11++;
        }
        return z11.get(i11);
    }

    public void d(boolean z11) {
        this.f1392c = z11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> z11 = this.f1393d ? this.f1390a.z() : this.f1390a.E();
        if (this.f1391b < 0) {
            return z11.size();
        }
        return z11.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1394e.inflate(this.f1395f, viewGroup, false);
        }
        int groupId = getItem(i11).getGroupId();
        int i12 = i11 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1390a.F() && groupId != (i12 >= 0 ? getItem(i12).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f1392c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i11), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}