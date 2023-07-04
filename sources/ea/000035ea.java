package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.a0;
import androidx.fragment.app.z;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class i<S> extends androidx.fragment.app.e {

    /* renamed from: t  reason: collision with root package name */
    static final Object f15220t = "CONFIRM_BUTTON_TAG";

    /* renamed from: w  reason: collision with root package name */
    static final Object f15221w = "CANCEL_BUTTON_TAG";

    /* renamed from: x  reason: collision with root package name */
    static final Object f15222x = "TOGGLE_BUTTON_TAG";

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<j<? super S>> f15223a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f15224b = new LinkedHashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f15225c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f15226d = new LinkedHashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private int f15227e;

    /* renamed from: f  reason: collision with root package name */
    private com.google.android.material.datepicker.d<S> f15228f;

    /* renamed from: g  reason: collision with root package name */
    private p<S> f15229g;

    /* renamed from: h  reason: collision with root package name */
    private com.google.android.material.datepicker.a f15230h;

    /* renamed from: i  reason: collision with root package name */
    private h<S> f15231i;

    /* renamed from: j  reason: collision with root package name */
    private int f15232j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f15233k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f15234l;

    /* renamed from: m  reason: collision with root package name */
    private int f15235m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f15236n;

    /* renamed from: o  reason: collision with root package name */
    private CheckableImageButton f15237o;

    /* renamed from: p  reason: collision with root package name */
    private wk.g f15238p;

    /* renamed from: q  reason: collision with root package name */
    private Button f15239q;

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it2 = i.this.f15223a.iterator();
            while (it2.hasNext()) {
                ((j) it2.next()).a(i.this.n());
            }
            i.this.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it2 = i.this.f15224b.iterator();
            while (it2.hasNext()) {
                ((View.OnClickListener) it2.next()).onClick(view);
            }
            i.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends o<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s11) {
            i.this.u();
            i.this.f15239q.setEnabled(i.this.k().p1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.f15239q.setEnabled(i.this.k().p1());
            i.this.f15237o.toggle();
            i iVar = i.this;
            iVar.v(iVar.f15237o);
            i.this.t();
        }
    }

    private static Drawable i(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, h.a.d(context, fk.e.f26424b));
        stateListDrawable.addState(new int[0], h.a.d(context, fk.e.f26425c));
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.datepicker.d<S> k() {
        if (this.f15228f == null) {
            this.f15228f = (com.google.android.material.datepicker.d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f15228f;
    }

    private static int m(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(fk.d.A);
        int i11 = l.d().f15251d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(fk.d.C) * i11) + ((i11 - 1) * resources.getDimensionPixelOffset(fk.d.F));
    }

    private int o(Context context) {
        int i11 = this.f15227e;
        return i11 != 0 ? i11 : k().a0(context);
    }

    private void p(Context context) {
        this.f15237o.setTag(f15222x);
        this.f15237o.setImageDrawable(i(context));
        this.f15237o.setChecked(this.f15235m != 0);
        a0.w0(this.f15237o, null);
        v(this.f15237o);
        this.f15237o.setOnClickListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(Context context) {
        return s(context, 16843277);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(Context context) {
        return s(context, fk.b.D);
    }

    static boolean s(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(tk.b.d(context, fk.b.f26388x, h.class.getCanonicalName()), new int[]{i11});
        boolean z11 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        int o11 = o(requireContext());
        this.f15231i = h.w(k(), o11, this.f15230h);
        this.f15229g = this.f15237o.isChecked() ? k.f(k(), o11, this.f15230h) : this.f15231i;
        u();
        z m11 = getChildFragmentManager().m();
        m11.p(fk.f.f26453x, this.f15229g);
        m11.j();
        this.f15229g.a(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        String l11 = l();
        this.f15236n.setContentDescription(String.format(getString(fk.i.f26489i), l11));
        this.f15236n.setText(l11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f15237o.isChecked()) {
            string = checkableImageButton.getContext().getString(fk.i.f26492l);
        } else {
            string = checkableImageButton.getContext().getString(fk.i.f26494n);
        }
        this.f15237o.setContentDescription(string);
    }

    public String l() {
        return k().C0(getContext());
    }

    public final S n() {
        return k().y1();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it2 = this.f15225c.iterator();
        while (it2.hasNext()) {
            it2.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f15227e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f15228f = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f15230h = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f15232j = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f15233k = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f15235m = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.e
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), o(requireContext()));
        Context context = dialog.getContext();
        this.f15234l = q(context);
        int d11 = tk.b.d(context, fk.b.f26378n, i.class.getCanonicalName());
        wk.g gVar = new wk.g(context, null, fk.b.f26388x, fk.j.f26514r);
        this.f15238p = gVar;
        gVar.O(context);
        this.f15238p.Y(ColorStateList.valueOf(d11));
        this.f15238p.X(a0.z(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f15234l ? fk.h.f26480v : fk.h.f26479u, viewGroup);
        Context context = inflate.getContext();
        if (this.f15234l) {
            inflate.findViewById(fk.f.f26453x).setLayoutParams(new LinearLayout.LayoutParams(m(context), -2));
        } else {
            inflate.findViewById(fk.f.f26454y).setLayoutParams(new LinearLayout.LayoutParams(m(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(fk.f.E);
        this.f15236n = textView;
        a0.y0(textView, 1);
        this.f15237o = (CheckableImageButton) inflate.findViewById(fk.f.F);
        TextView textView2 = (TextView) inflate.findViewById(fk.f.G);
        CharSequence charSequence = this.f15233k;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f15232j);
        }
        p(context);
        this.f15239q = (Button) inflate.findViewById(fk.f.f26432c);
        if (k().p1()) {
            this.f15239q.setEnabled(true);
        } else {
            this.f15239q.setEnabled(false);
        }
        this.f15239q.setTag(f15220t);
        this.f15239q.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(fk.f.f26430a);
        button.setTag(f15221w);
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it2 = this.f15226d.iterator();
        while (it2.hasNext()) {
            it2.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f15227e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f15228f);
        a.b bVar = new a.b(this.f15230h);
        if (this.f15231i.r() != null) {
            bVar.b(this.f15231i.r().f15253f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f15232j);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f15233k);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f15234l) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f15238p);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(fk.d.E);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f15238p, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new lk.a(requireDialog(), rect));
        }
        t();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStop() {
        this.f15229g.e();
        super.onStop();
    }
}