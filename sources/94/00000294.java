package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j0 extends h0 implements i0 {
    private static Method T;
    private i0 R;

    /* loaded from: classes.dex */
    public static class a extends d0 {

        /* renamed from: o  reason: collision with root package name */
        final int f1834o;

        /* renamed from: p  reason: collision with root package name */
        final int f1835p;

        /* renamed from: q  reason: collision with root package name */
        private i0 f1836q;

        /* renamed from: t  reason: collision with root package name */
        private MenuItem f1837t;

        public a(Context context, boolean z11) {
            super(context, z11);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.f1834o = 21;
                this.f1835p = 22;
                return;
            }
            this.f1834o = 22;
            this.f1835p = 21;
        }

        @Override // androidx.appcompat.widget.d0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i11;
            androidx.appcompat.view.menu.d dVar;
            int pointToPosition;
            int i12;
            if (this.f1836q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i11 = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i11 = 0;
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                }
                androidx.appcompat.view.menu.g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i12 = pointToPosition - i11) >= 0 && i12 < dVar.getCount()) {
                    gVar = dVar.getItem(i12);
                }
                MenuItem menuItem = this.f1837t;
                if (menuItem != gVar) {
                    androidx.appcompat.view.menu.e b11 = dVar.b();
                    if (menuItem != null) {
                        this.f1836q.n(b11, menuItem);
                    }
                    this.f1837t = gVar;
                    if (gVar != null) {
                        this.f1836q.d(b11, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i11, KeyEvent keyEvent) {
            androidx.appcompat.view.menu.d dVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i11 == this.f1834o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i11 == this.f1835p) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    dVar = (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                }
                dVar.b().e(false);
                return true;
            } else {
                return super.onKeyDown(i11, keyEvent);
            }
        }

        public void setHoverListener(i0 i0Var) {
            this.f1836q = i0Var;
        }

        @Override // androidx.appcompat.widget.d0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                T = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
    }

    public void Q(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.L.setEnterTransition((Transition) obj);
        }
    }

    public void R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.L.setExitTransition((Transition) obj);
        }
    }

    public void S(i0 i0Var) {
        this.R = i0Var;
    }

    public void T(boolean z11) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = T;
            if (method != null) {
                try {
                    method.invoke(this.L, Boolean.valueOf(z11));
                    return;
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.L.setTouchModal(z11);
    }

    @Override // androidx.appcompat.widget.i0
    public void d(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        i0 i0Var = this.R;
        if (i0Var != null) {
            i0Var.d(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.i0
    public void n(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        i0 i0Var = this.R;
        if (i0Var != null) {
            i0Var.n(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.h0
    d0 r(Context context, boolean z11) {
        a aVar = new a(context, z11);
        aVar.setHoverListener(this);
        return aVar;
    }
}