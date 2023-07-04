package dw;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
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
public final class j implements pr.i<m.c.b> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f24275b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final ew.b f24276a;

    /* loaded from: classes6.dex */
    public static final class a implements u<m.c.b> {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ u<m.c.b> f24277a;

        /* renamed from: dw.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        /* synthetic */ class C0467a extends kotlin.jvm.internal.p implements h00.q<LayoutInflater, ViewGroup, Boolean, ew.b> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0467a f24278a = new C0467a();

            C0467a() {
                super(3, ew.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/phone/databinding/PhoneNumberEntryBinding;", 0);
            }

            public final ew.b d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                s.g(p02, "p0");
                return ew.b.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ ew.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* loaded from: classes6.dex */
        /* synthetic */ class b extends kotlin.jvm.internal.p implements h00.l<ew.b, j> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f24279a = new b();

            b() {
                super(1, j.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/phone/databinding/PhoneNumberEntryBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final j invoke(ew.b p02) {
                s.g(p02, "p0");
                return new j(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f24277a = new r(m0.b(m.c.b.class), C0467a.f24278a, b.f24279a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(m.c.b initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            s.g(initialRendering, "initialRendering");
            s.g(initialViewEnvironment, "initialViewEnvironment");
            s.g(contextForNewView, "contextForNewView");
            return this.f24277a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super m.c.b> getType() {
            return this.f24277a.getType();
        }
    }

    public j(ew.b binding) {
        s.g(binding, "binding");
        this.f24276a = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(m.c.b rendering, View view) {
        s.g(rendering, "$rendering");
        rendering.b().invoke();
    }

    @Override // pr.i
    /* renamed from: c */
    public void a(final m.c.b rendering, pr.s viewEnvironment) {
        s.g(rendering, "rendering");
        s.g(viewEnvironment, "viewEnvironment");
        ew.b bVar = this.f24276a;
        String formatNumber = PhoneNumberUtils.formatNumber(rendering.d(), "US");
        if (formatNumber == null) {
            formatNumber = rendering.d();
        }
        bVar.f25269c.getText().replace(0, bVar.f25269c.getText().length(), formatNumber);
        EditText phoneNumber = bVar.f25269c;
        s.f(phoneNumber, "phoneNumber");
        jw.d.a(phoneNumber, rendering.c());
        bVar.f25269c.setEnabled(!rendering.e());
        if (rendering.a()) {
            bVar.f25269c.setError("Invalid phone number");
        } else {
            bVar.f25269c.setError(null);
        }
        EditText phoneNumber2 = bVar.f25269c;
        s.f(phoneNumber2, "phoneNumber");
        f.b(phoneNumber2, rendering.b());
        bVar.f25268b.setEnabled(!rendering.e());
        bVar.f25268b.setOnClickListener(new View.OnClickListener() { // from class: dw.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.d(m.c.b.this, view);
            }
        });
    }
}