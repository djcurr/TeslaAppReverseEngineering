package dw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import dw.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import pr.i;
import pr.r;
import pr.u;

/* loaded from: classes6.dex */
public final class b implements pr.i<m.c.a> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f24257b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final ew.a f24258a;

    /* loaded from: classes6.dex */
    public static final class a implements u<m.c.a> {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ u<m.c.a> f24259a;

        /* renamed from: dw.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        /* synthetic */ class C0464a extends kotlin.jvm.internal.p implements h00.q<LayoutInflater, ViewGroup, Boolean, ew.a> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0464a f24260a = new C0464a();

            C0464a() {
                super(3, ew.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/phone/databinding/PhoneNumberConfirmBinding;", 0);
            }

            public final ew.a d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                s.g(p02, "p0");
                return ew.a.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ ew.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* renamed from: dw.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        /* synthetic */ class C0465b extends kotlin.jvm.internal.p implements h00.l<ew.a, b> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0465b f24261a = new C0465b();

            C0465b() {
                super(1, b.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/phone/databinding/PhoneNumberConfirmBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final b invoke(ew.a p02) {
                s.g(p02, "p0");
                return new b(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f24259a = new r(m0.b(m.c.a.class), C0464a.f24260a, C0465b.f24261a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(m.c.a initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            s.g(initialRendering, "initialRendering");
            s.g(initialViewEnvironment, "initialViewEnvironment");
            s.g(contextForNewView, "contextForNewView");
            return this.f24259a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super m.c.a> getType() {
            return this.f24259a.getType();
        }
    }

    public b(ew.a binding) {
        s.g(binding, "binding");
        this.f24258a = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(m.c.a rendering, View view) {
        s.g(rendering, "$rendering");
        rendering.c().invoke();
    }

    @Override // pr.i
    /* renamed from: c */
    public void a(final m.c.a rendering, pr.s viewEnvironment) {
        s.g(rendering, "rendering");
        s.g(viewEnvironment, "viewEnvironment");
        ew.a aVar = this.f24258a;
        aVar.f25264c.getText().replace(0, aVar.f25264c.getText().length(), rendering.a());
        EditText confirmationCode = aVar.f25264c;
        s.f(confirmationCode, "confirmationCode");
        jw.d.a(confirmationCode, rendering.d());
        aVar.f25264c.setEnabled(!rendering.e());
        EditText confirmationCode2 = aVar.f25264c;
        s.f(confirmationCode2, "confirmationCode");
        f.b(confirmationCode2, rendering.c());
        if (rendering.b()) {
            aVar.f25264c.setError("Invalid confirmation code");
        } else {
            aVar.f25264c.setError(null);
        }
        aVar.f25263b.setEnabled(!rendering.e());
        aVar.f25263b.setOnClickListener(new View.OnClickListener() { // from class: dw.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.d(m.c.a.this, view);
            }
        });
    }
}