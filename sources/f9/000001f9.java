package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f;
import l.b;

/* loaded from: classes.dex */
public class h extends Dialog implements e {

    /* renamed from: a */
    private f f1229a;

    /* renamed from: b */
    private final f.a f1230b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements f.a {
        a() {
            h.this = r1;
        }

        @Override // androidx.core.view.f.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.c(keyEvent);
        }
    }

    public h(Context context, int i11) {
        super(context, b(context, i11));
        this.f1230b = new a();
        f a11 = a();
        a11.F(b(context, i11));
        a11.r(null);
    }

    private static int b(Context context, int i11) {
        if (i11 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(g.a.f27063y, typedValue, true);
            return typedValue.resourceId;
        }
        return i11;
    }

    public f a() {
        if (this.f1229a == null) {
            this.f1229a = f.h(this, this);
        }
        return this.f1229a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i11) {
        return a().A(i11);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.f.e(this.f1230b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i11) {
        return (T) a().i(i11);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().p();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().o();
        super.onCreate(bundle);
        a().r(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().x();
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(l.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(l.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public l.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i11) {
        a().B(i11);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().G(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().C(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().D(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i11) {
        super.setTitle(i11);
        a().G(getContext().getString(i11));
    }
}