package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class c extends h {

    /* renamed from: c  reason: collision with root package name */
    final AlertController f1142c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f1143a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1144b;

        public a(Context context) {
            this(context, c.f(context, 0));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1143a;
            fVar.f1124w = listAdapter;
            fVar.f1125x = onClickListener;
            return this;
        }

        public a b(boolean z11) {
            this.f1143a.f1119r = z11;
            return this;
        }

        public a c(View view) {
            this.f1143a.f1108g = view;
            return this;
        }

        public c create() {
            c cVar = new c(this.f1143a.f1102a, this.f1144b);
            this.f1143a.a(cVar.f1142c);
            cVar.setCancelable(this.f1143a.f1119r);
            if (this.f1143a.f1119r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f1143a.f1120s);
            cVar.setOnDismissListener(this.f1143a.f1121t);
            DialogInterface.OnKeyListener onKeyListener = this.f1143a.f1122u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a d(Drawable drawable) {
            this.f1143a.f1105d = drawable;
            return this;
        }

        public a e(CharSequence charSequence) {
            this.f1143a.f1109h = charSequence;
            return this;
        }

        public a f(DialogInterface.OnCancelListener onCancelListener) {
            this.f1143a.f1120s = onCancelListener;
            return this;
        }

        public a g(DialogInterface.OnKeyListener onKeyListener) {
            this.f1143a.f1122u = onKeyListener;
            return this;
        }

        public Context getContext() {
            return this.f1143a.f1102a;
        }

        public a h(ListAdapter listAdapter, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1143a;
            fVar.f1124w = listAdapter;
            fVar.f1125x = onClickListener;
            fVar.I = i11;
            fVar.H = true;
            return this;
        }

        public a i(int i11) {
            AlertController.f fVar = this.f1143a;
            fVar.f1107f = fVar.f1102a.getText(i11);
            return this;
        }

        public a setNegativeButton(int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1143a;
            fVar.f1113l = fVar.f1102a.getText(i11);
            this.f1143a.f1115n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1143a;
            fVar.f1110i = fVar.f1102a.getText(i11);
            this.f1143a.f1112k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f1143a.f1107f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.f fVar = this.f1143a;
            fVar.f1127z = view;
            fVar.f1126y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i11) {
            this.f1143a = new AlertController.f(new ContextThemeWrapper(context, c.f(context, i11)));
            this.f1144b = i11;
        }
    }

    protected c(Context context, int i11) {
        super(context, f(context, i11));
        this.f1142c = new AlertController(getContext(), this, getWindow());
    }

    static int f(Context context, int i11) {
        if (((i11 >>> 24) & 255) >= 1) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(g.a.f27053o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f1142c.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1142c.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (this.f1142c.g(i11, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (this.f1142c.h(i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1142c.q(charSequence);
    }
}