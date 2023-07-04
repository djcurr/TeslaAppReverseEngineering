package j2;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.internal.s;
import s1.h;

/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* renamed from: a  reason: collision with root package name */
    private final c f33112a;

    public a(c callback) {
        s.g(callback, "callback");
        this.f33112a = callback;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f33112a.b(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f33112a.c(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f33112a.d();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        h a11 = this.f33112a.a();
        if (rect == null) {
            return;
        }
        rect.set((int) a11.i(), (int) a11.l(), (int) a11.j(), (int) a11.e());
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f33112a.e();
    }
}