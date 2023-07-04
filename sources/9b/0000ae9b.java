package qv;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import pr.u;
import pr.x;
import qv.j;
import qv.k;
import qv.l;
import qv.m;
import vz.b0;

/* loaded from: classes6.dex */
public final class d implements pr.i<m.c.a>, DatePickerDialog.OnDateSetListener {

    /* renamed from: i */
    public static final a f48501i = new a(null);

    /* renamed from: a */
    private final rv.c f48502a;

    /* renamed from: b */
    private rv.e f48503b;

    /* renamed from: c */
    private rv.a f48504c;

    /* renamed from: d */
    private rv.d f48505d;

    /* renamed from: e */
    private rv.f f48506e;

    /* renamed from: f */
    private rv.b f48507f;

    /* renamed from: g */
    private DatePickerDialog f48508g;

    /* renamed from: h */
    private h00.q<? super Integer, ? super Integer, ? super Integer, b0> f48509h;

    /* loaded from: classes6.dex */
    public static final class a implements u<m.c.a> {

        /* renamed from: a */
        private final /* synthetic */ pr.d<m.c.a> f48510a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qv.d$a$a */
        /* loaded from: classes6.dex */
        public static final class C1036a extends kotlin.jvm.internal.u implements h00.r<m.c.a, pr.s, Context, ViewGroup, View> {

            /* renamed from: a */
            public static final C1036a f48511a = new C1036a();

            /* renamed from: qv.d$a$a$a */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C1037a extends kotlin.jvm.internal.p implements h00.p<m.c.a, pr.s, b0> {
                C1037a(Object obj) {
                    super(2, obj, d.class, "showRendering", "showRendering(Lcom/withpersona/sdk/inquiry/database/DatabaseWorkflow$Screen$EntryScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void d(m.c.a p02, pr.s p12) {
                    kotlin.jvm.internal.s.g(p02, "p0");
                    kotlin.jvm.internal.s.g(p12, "p1");
                    ((d) this.receiver).a(p02, p12);
                }

                @Override // h00.p
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ b0 mo160invoke(m.c.a aVar, pr.s sVar) {
                    d(aVar, sVar);
                    return b0.f54756a;
                }
            }

            C1036a() {
                super(4);
            }

            @Override // h00.r
            /* renamed from: a */
            public final View invoke(m.c.a initialRendering, pr.s initialViewEnvironment, Context context, ViewGroup viewGroup) {
                Context context2;
                kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
                kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
                kotlin.jvm.internal.s.g(context, "context");
                if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
                    context2 = context;
                }
                LayoutInflater inflater = LayoutInflater.from(context2).cloneInContext(context);
                rv.c c11 = rv.c.c(inflater);
                NestedScrollView root = c11.getRoot();
                kotlin.jvm.internal.s.f(root, "root");
                kotlin.jvm.internal.s.f(c11, "this");
                kotlin.jvm.internal.s.f(inflater, "inflater");
                x.a(root, initialRendering, initialViewEnvironment, new C1037a(new d(c11, initialRendering, inflater)));
                NestedScrollView root2 = c11.getRoot();
                kotlin.jvm.internal.s.f(root2, "from(container?.context …         }.root\n        }");
                return root2;
            }
        }

        private a() {
            this.f48510a = new pr.d<>(m0.b(m.c.a.class), C1036a.f48511a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(m.c.a initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f48510a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super m.c.a> getType() {
            return this.f48510a.getType();
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48512a;

        static {
            int[] iArr = new int[l.c.b.values().length];
            iArr[l.c.b.SSN_FULL.ordinal()] = 1;
            iArr[l.c.b.SSN_LAST_4.ordinal()] = 2;
            f48512a = iArr;
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ j.b.c.C1044c f48513a;

        /* renamed from: b */
        final /* synthetic */ m.c.a f48514b;

        /* renamed from: c */
        final /* synthetic */ EditText f48515c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j.b.c.C1044c c1044c, m.c.a aVar, EditText editText) {
            super(1);
            this.f48513a = c1044c;
            this.f48514b = aVar;
            this.f48515c = editText;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            String b11 = l.c.f48577a.b(it2, this.f48513a.e());
            if (!kotlin.jvm.internal.s.c(b11, this.f48513a.d())) {
                this.f48514b.d().mo12invoke(new m.c.a.AbstractC1053a.d(b11));
            } else if (kotlin.jvm.internal.s.c(b11, it2)) {
            } else {
                this.f48515c.getText().replace(0, this.f48515c.getText().length(), b11);
            }
        }
    }

    /* renamed from: qv.d$d */
    /* loaded from: classes6.dex */
    public static final class C1038d extends kotlin.jvm.internal.u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ m.c.a f48516a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1038d(m.c.a aVar) {
            super(1);
            this.f48516a = aVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            h00.l<m.c.a.AbstractC1053a, b0> d11 = this.f48516a.d();
            String normalizeNumber = PhoneNumberUtils.normalizeNumber(it2);
            kotlin.jvm.internal.s.f(normalizeNumber, "normalizeNumber(it)");
            d11.mo12invoke(new m.c.a.AbstractC1053a.f(normalizeNumber));
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ m.c.a f48517a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(m.c.a aVar) {
            super(1);
            this.f48517a = aVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f48517a.d().mo12invoke(new m.c.a.AbstractC1053a.C1055c(it2));
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ m.c.a f48518a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m.c.a aVar) {
            super(1);
            this.f48518a = aVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f48518a.d().mo12invoke(new m.c.a.AbstractC1053a.e(it2));
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ m.c.a f48519a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m.c.a aVar) {
            super(1);
            this.f48519a = aVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f48519a.d().mo12invoke(new m.c.a.AbstractC1053a.h(it2));
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ m.c.a f48520a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(m.c.a aVar) {
            super(1);
            this.f48520a = aVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f48520a.d().mo12invoke(new m.c.a.AbstractC1053a.i(it2));
        }
    }

    /* loaded from: classes6.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ m.c.a f48521a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(m.c.a aVar) {
            super(1);
            this.f48521a = aVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f48521a.d().mo12invoke(new m.c.a.AbstractC1053a.b(it2));
        }
    }

    /* loaded from: classes6.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ m.c.a f48522a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(m.c.a aVar) {
            super(1);
            this.f48522a = aVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f48522a.d().mo12invoke(new m.c.a.AbstractC1053a.g(it2));
        }
    }

    /* loaded from: classes6.dex */
    public static final class k extends kotlin.jvm.internal.u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ m.c.a f48523a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(m.c.a aVar) {
            super(1);
            this.f48523a = aVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f48523a.d().mo12invoke(new m.c.a.AbstractC1053a.j(it2));
        }
    }

    /* loaded from: classes6.dex */
    public static final class l extends kotlin.jvm.internal.u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ m.c.a f48524a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(m.c.a aVar) {
            super(1);
            this.f48524a = aVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f48524a.d().mo12invoke(new m.c.a.AbstractC1053a.C1054a(l.b.f48568a.d(it2)));
        }
    }

    /* loaded from: classes6.dex */
    public static final class m extends kotlin.jvm.internal.u implements h00.q<Integer, Integer, Integer, b0> {

        /* renamed from: a */
        final /* synthetic */ m.c.a f48525a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(m.c.a aVar) {
            super(3);
            this.f48525a = aVar;
        }

        public final void a(int i11, int i12, int i13) {
            h00.l<m.c.a.AbstractC1053a, b0> d11 = this.f48525a.d();
            l.b.a aVar = l.b.f48568a;
            Calendar calendar = Calendar.getInstance();
            calendar.set(i11, i12, i13);
            b0 b0Var = b0.f54756a;
            Date time = calendar.getTime();
            kotlin.jvm.internal.s.f(time, "getInstance().apply {\n  …nth)\n              }.time");
            d11.mo12invoke(new m.c.a.AbstractC1053a.C1054a(aVar.c(time)));
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2.intValue(), num3.intValue());
            return b0.f54756a;
        }
    }

    public d(rv.c binding, m.c.a initialRendering, LayoutInflater layoutInflater) {
        int i11;
        kotlin.jvm.internal.s.g(binding, "binding");
        kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
        kotlin.jvm.internal.s.g(layoutInflater, "layoutInflater");
        this.f48502a = binding;
        for (j.b.c cVar : initialRendering.e().c()) {
            if (cVar instanceof j.b.c.d) {
                rv.e c11 = rv.e.c(layoutInflater);
                this.f48502a.f49687c.addView(c11.getRoot());
                b0 b0Var = b0.f54756a;
                this.f48503b = c11;
            } else if (cVar instanceof j.b.c.a) {
                rv.a c12 = rv.a.c(layoutInflater);
                Spinner spinner = c12.f49680g;
                Context context = layoutInflater.getContext();
                kotlin.jvm.internal.s.f(context, "layoutInflater.context");
                spinner.setAdapter((SpinnerAdapter) new qv.k(context, initialRendering.e().f(), null, 4, null));
                b0 b0Var2 = b0.f54756a;
                this.f48502a.f49687c.addView(c12.getRoot());
                this.f48504c = c12;
            } else if (cVar instanceof j.b.c.C1043b) {
                rv.b c13 = rv.b.c(layoutInflater);
                this.f48508g = new DatePickerDialog(this.f48502a.getRoot().getContext(), this, 2000, 1, 1);
                c13.f49684d.setOnClickListener(new View.OnClickListener() { // from class: qv.a
                    {
                        d.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.b(d.this, view);
                    }
                });
                b0 b0Var3 = b0.f54756a;
                this.f48502a.f49687c.addView(c13.getRoot());
                this.f48507f = c13;
            } else if (cVar instanceof j.b.c.C1044c) {
                rv.d c14 = rv.d.c(layoutInflater);
                TextView textView = c14.f49692c;
                Context context2 = layoutInflater.getContext();
                j.b.c.C1044c c1044c = (j.b.c.C1044c) cVar;
                int i12 = b.f48512a[c1044c.e().ordinal()];
                if (i12 == 1) {
                    i11 = t.f48681b;
                } else if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    i11 = t.f48682c;
                }
                textView.setText(context2.getText(i11));
                c14.f49691b.setHint(c1044c.e().getFormat());
                b0 b0Var4 = b0.f54756a;
                this.f48502a.f49687c.addView(c14.getRoot());
                this.f48505d = c14;
            } else if (cVar instanceof j.b.c.e) {
                rv.f c15 = rv.f.c(layoutInflater);
                this.f48502a.f49687c.addView(c15.getRoot());
                b0 b0Var5 = b0.f54756a;
                this.f48506e = c15;
            }
        }
    }

    public static /* synthetic */ void b(d dVar, View view) {
        f(dVar, view);
    }

    private final void e(EditText editText, String str, h00.l<? super String, b0> lVar) {
        Editable text = editText.getText();
        int length = editText.getText().length();
        if (str == null) {
            str = "";
        }
        text.replace(0, length, str);
        jw.d.a(editText, lVar);
    }

    public static final void f(d this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        DatePickerDialog datePickerDialog = this$0.f48508g;
        if (datePickerDialog == null) {
            return;
        }
        datePickerDialog.show();
    }

    private final void h(rv.c cVar, final m.c.a aVar) {
        boolean z11;
        cVar.f49686b.setOnClickListener(new View.OnClickListener() { // from class: qv.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.i(d.this, aVar, view);
            }
        });
        Button button = cVar.f49686b;
        boolean z12 = false;
        if (!aVar.f()) {
            List<j.b.c> c11 = aVar.e().c();
            if (!(c11 instanceof Collection) || !c11.isEmpty()) {
                for (j.b.c cVar2 : c11) {
                    if (!cVar2.a()) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (z11) {
                z12 = true;
            }
        }
        button.setEnabled(z12);
    }

    public static final void i(d this$0, m.c.a rendering, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        NestedScrollView root = this$0.f48502a.getRoot();
        if (!(Build.VERSION.SDK_INT < 23)) {
            root = null;
        }
        if (root != null) {
            Object systemService = root.getContext().getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(root.getWindowToken(), 0);
        }
        rendering.c().mo11invoke();
    }

    private final void j(rv.a aVar, j.b.c.a aVar2, m.c.a aVar3) {
        EditText addressStreet1 = aVar.f49678e;
        kotlin.jvm.internal.s.f(addressStreet1, "addressStreet1");
        e(addressStreet1, aVar2.f(), new g(aVar3));
        EditText addressStreet2 = aVar.f49679f;
        kotlin.jvm.internal.s.f(addressStreet2, "addressStreet2");
        e(addressStreet2, aVar2.g(), new h(aVar3));
        EditText addressCity = aVar.f49675b;
        kotlin.jvm.internal.s.f(addressCity, "addressCity");
        e(addressCity, aVar2.d(), new i(aVar3));
        EditText addressPostalCode = aVar.f49677d;
        kotlin.jvm.internal.s.f(addressPostalCode, "addressPostalCode");
        e(addressPostalCode, aVar2.e(), new j(aVar3));
        if (!kotlin.jvm.internal.s.c(aVar3.e().f(), "US")) {
            aVar.f49680g.setVisibility(8);
            return;
        }
        aVar.f49680g.setVisibility(0);
        k.a aVar4 = qv.k.f48560e;
        Spinner addressSubdivision = aVar.f49680g;
        kotlin.jvm.internal.s.f(addressSubdivision, "addressSubdivision");
        aVar4.b(addressSubdivision, aVar2.h(), new k(aVar3));
    }

    private final void k(rv.b bVar, j.b.c.C1043b c1043b, m.c.a aVar) {
        DatePicker datePicker;
        EditText editText = bVar.f49682b;
        editText.getText().replace(0, editText.getText().length(), c1043b.c());
        kotlin.jvm.internal.s.f(editText, "");
        jw.d.a(editText, new l(aVar));
        DatePickerDialog datePickerDialog = this.f48508g;
        if (datePickerDialog == null || (datePicker = datePickerDialog.getDatePicker()) == null) {
            return;
        }
        l.b.a aVar2 = l.b.f48568a;
        datePicker.setMinDate(aVar2.a().getTime());
        datePicker.setMaxDate(aVar2.f().getTime());
        this.f48509h = null;
        Calendar b11 = aVar2.b(c1043b.c());
        datePicker.updateDate(b11.get(1), b11.get(2), b11.get(5));
        this.f48509h = new m(aVar);
    }

    private final void l(final rv.d dVar, j.b.c.C1044c c1044c, final m.c.a aVar) {
        String a11;
        Drawable drawable;
        EditText editText = dVar.f49691b;
        if (aVar.e().i()) {
            editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            a11 = c1044c.d();
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            a11 = l.c.f48577a.a(c1044c.d(), c1044c.e());
        }
        kotlin.jvm.internal.s.f(editText, "");
        e(editText, a11, new c(c1044c, aVar, editText));
        Button button = dVar.f49693d;
        if (aVar.e().i()) {
            drawable = androidx.core.content.b.getDrawable(button.getContext(), q.f48644a);
        } else {
            drawable = androidx.core.content.b.getDrawable(button.getContext(), q.f48645b);
        }
        button.setBackground(drawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: qv.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.o(m.c.a.this, dVar, view);
            }
        });
    }

    private final void m(rv.e eVar, j.b.c.d dVar, m.c.a aVar) {
        EditText firstName = eVar.f49695b;
        kotlin.jvm.internal.s.f(firstName, "firstName");
        e(firstName, dVar.d(), new e(aVar));
        eVar.f49695b.setEnabled(!aVar.f());
        EditText lastName = eVar.f49696c;
        kotlin.jvm.internal.s.f(lastName, "lastName");
        e(lastName, dVar.e(), new f(aVar));
        eVar.f49696c.setEnabled(!aVar.f());
    }

    private final void n(rv.f fVar, j.b.c.e eVar, m.c.a aVar) {
        EditText phoneNumberField = fVar.f49699b;
        kotlin.jvm.internal.s.f(phoneNumberField, "phoneNumberField");
        String formatNumber = PhoneNumberUtils.formatNumber(eVar.c(), aVar.e().f());
        if (formatNumber == null) {
            formatNumber = eVar.c();
        }
        e(phoneNumberField, formatNumber, new C1038d(aVar));
    }

    public static final void o(m.c.a rendering, rv.d this_updateForm, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        kotlin.jvm.internal.s.g(this_updateForm, "$this_updateForm");
        rendering.b().mo11invoke();
        EditText editText = this_updateForm.f49691b;
        editText.setSelection(editText.getText().length());
    }

    @Override // pr.i
    /* renamed from: g */
    public void a(m.c.a rendering, pr.s viewEnvironment) {
        rv.f fVar;
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        h(this.f48502a, rendering);
        for (j.b.c cVar : rendering.e().c()) {
            if (cVar instanceof j.b.c.d) {
                rv.e eVar = this.f48503b;
                if (eVar != null) {
                    m(eVar, (j.b.c.d) cVar, rendering);
                }
            } else if (cVar instanceof j.b.c.a) {
                rv.a aVar = this.f48504c;
                if (aVar != null) {
                    j(aVar, (j.b.c.a) cVar, rendering);
                }
            } else if (cVar instanceof j.b.c.C1043b) {
                rv.b bVar = this.f48507f;
                if (bVar != null) {
                    k(bVar, (j.b.c.C1043b) cVar, rendering);
                }
            } else if (cVar instanceof j.b.c.C1044c) {
                rv.d dVar = this.f48505d;
                if (dVar != null) {
                    l(dVar, (j.b.c.C1044c) cVar, rendering);
                }
            } else if ((cVar instanceof j.b.c.e) && (fVar = this.f48506e) != null) {
                n(fVar, (j.b.c.e) cVar, rendering);
            }
        }
        if (rendering.a()) {
            this.f48502a.f49686b.setError("Error");
        } else {
            this.f48502a.f49686b.setError(null);
        }
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i11, int i12, int i13) {
        h00.q<? super Integer, ? super Integer, ? super Integer, b0> qVar = this.f48509h;
        if (qVar == null) {
            return;
        }
        qVar.invoke(Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }
}