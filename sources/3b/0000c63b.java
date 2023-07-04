package zv;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pr.i;
import zv.j0;

/* loaded from: classes6.dex */
public final class o implements pr.i<j0.c.b> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f61189e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Button f61190a;

    /* renamed from: b  reason: collision with root package name */
    private final EditText f61191b;

    /* renamed from: c  reason: collision with root package name */
    private final EditText f61192c;

    /* renamed from: d  reason: collision with root package name */
    private final EditText f61193d;

    /* loaded from: classes6.dex */
    public static final class a implements pr.u<j0.c.b> {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ pr.u<j0.c.b> f61194a;

        /* renamed from: zv.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        /* synthetic */ class C1407a extends kotlin.jvm.internal.p implements h00.l<View, o> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1407a f61195a = new C1407a();

            C1407a() {
                super(1, o.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final o invoke(View p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new o(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f61194a = new pr.k(kotlin.jvm.internal.m0.b(j0.c.b.class), n0.f61183b, C1407a.f61195a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(j0.c.b initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f61194a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super j0.c.b> getType() {
            return this.f61194a.getType();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j0.c.b f61197b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0.c.b bVar) {
            super(1);
            this.f61197b = bVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(String str) {
            invoke2(str);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            o.this.f(this.f61197b.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j0.c.b f61199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j0.c.b bVar) {
            super(1);
            this.f61199b = bVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(String str) {
            invoke2(str);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            o.this.f(this.f61199b.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j0.c.b f61201b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j0.c.b bVar) {
            super(1);
            this.f61201b = bVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(String str) {
            invoke2(str);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            o.this.f(this.f61201b.b());
        }
    }

    public o(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        View findViewById = view.findViewById(m0.f61160d);
        kotlin.jvm.internal.s.f(findViewById, "view.findViewById(R.id.b…n_contact_support_select)");
        this.f61190a = (Button) findViewById;
        View findViewById2 = view.findViewById(m0.f61168l);
        kotlin.jvm.internal.s.f(findViewById2, "view.findViewById(R.id.e…ext_contact_support_name)");
        this.f61191b = (EditText) findViewById2;
        View findViewById3 = view.findViewById(m0.f61167k);
        kotlin.jvm.internal.s.f(findViewById3, "view.findViewById(R.id.e…xt_contact_support_email)");
        this.f61192c = (EditText) findViewById3;
        View findViewById4 = view.findViewById(m0.f61166j);
        kotlin.jvm.internal.s.f(findViewById4, "view.findViewById(R.id.e…_contact_support_comment)");
        this.f61193d = (EditText) findViewById4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(j0.c.b rendering, o this$0, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        rendering.c().invoke(this$0.f61191b.getText().toString(), this$0.f61192c.getText().toString(), this$0.f61193d.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
        if ((!r4) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r4) {
        /*
            r3 = this;
            android.widget.Button r0 = r3.f61190a
            r1 = 1
            if (r4 == 0) goto L4e
            android.widget.EditText r4 = r3.f61191b
            android.text.Editable r4 = r4.getText()
            java.lang.String r2 = "nameEditText.text"
            kotlin.jvm.internal.s.f(r4, r2)
            boolean r4 = kotlin.text.m.w(r4)
            r4 = r4 ^ r1
            if (r4 == 0) goto L4e
            android.widget.EditText r4 = r3.f61192c
            android.text.Editable r4 = r4.getText()
            java.lang.String r2 = "emailEditText.text"
            kotlin.jvm.internal.s.f(r4, r2)
            boolean r4 = kotlin.text.m.w(r4)
            r4 = r4 ^ r1
            if (r4 == 0) goto L4e
            java.util.regex.Pattern r4 = android.util.Patterns.EMAIL_ADDRESS
            android.widget.EditText r2 = r3.f61192c
            android.text.Editable r2 = r2.getText()
            java.util.regex.Matcher r4 = r4.matcher(r2)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L4e
            android.widget.EditText r4 = r3.f61193d
            android.text.Editable r4 = r4.getText()
            java.lang.String r2 = "messageEditText.text"
            kotlin.jvm.internal.s.f(r4, r2)
            boolean r4 = kotlin.text.m.w(r4)
            r4 = r4 ^ r1
            if (r4 == 0) goto L4e
            goto L4f
        L4e:
            r1 = 0
        L4f:
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.o.f(boolean):void");
    }

    @Override // pr.i
    /* renamed from: d */
    public void a(final j0.c.b rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        this.f61191b.setEnabled(rendering.b());
        this.f61192c.setEnabled(rendering.b());
        this.f61193d.setEnabled(rendering.b());
        this.f61190a.setOnClickListener(new View.OnClickListener() { // from class: zv.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.e(j0.c.b.this, this, view);
            }
        });
        f(rendering.b());
        jw.d.a(this.f61191b, new b(rendering));
        jw.d.a(this.f61192c, new c(rendering));
        jw.d.a(this.f61193d, new d(rendering));
    }
}