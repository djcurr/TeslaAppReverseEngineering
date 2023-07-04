package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a  reason: collision with root package name */
    private e f1422a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.appcompat.app.c f1423b;

    /* renamed from: c  reason: collision with root package name */
    c f1424c;

    /* renamed from: d  reason: collision with root package name */
    private j.a f1425d;

    public f(e eVar) {
        this.f1422a = eVar;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void a(e eVar, boolean z11) {
        if (z11 || eVar == this.f1422a) {
            c();
        }
        j.a aVar = this.f1425d;
        if (aVar != null) {
            aVar.a(eVar, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean b(e eVar) {
        j.a aVar = this.f1425d;
        if (aVar != null) {
            return aVar.b(eVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.c cVar = this.f1423b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        e eVar = this.f1422a;
        c.a aVar = new c.a(eVar.u());
        c cVar = new c(aVar.getContext(), g.g.f27150j);
        this.f1424c = cVar;
        cVar.d(this);
        this.f1422a.b(this.f1424c);
        aVar.a(this.f1424c.b(), this);
        View y11 = eVar.y();
        if (y11 != null) {
            aVar.c(y11);
        } else {
            aVar.d(eVar.w()).setTitle(eVar.x());
        }
        aVar.g(this);
        androidx.appcompat.app.c create = aVar.create();
        this.f1423b = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1423b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1423b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i11) {
        this.f1422a.L((g) this.f1424c.b().getItem(i11), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1424c.a(this.f1422a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i11 == 82 || i11 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1423b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1423b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1422a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1422a.performShortcut(i11, keyEvent, 0);
    }
}