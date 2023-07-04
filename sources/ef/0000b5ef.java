package tv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import h00.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import pr.i;
import pr.r;
import pr.u;
import tv.j;

/* loaded from: classes6.dex */
public final class d implements pr.i<j.c.b> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f52563b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final uv.a f52564a;

    /* loaded from: classes6.dex */
    public static final class a implements u<j.c.b> {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ u<j.c.b> f52565a;

        /* renamed from: tv.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        /* synthetic */ class C1164a extends p implements q<LayoutInflater, ViewGroup, Boolean, uv.a> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1164a f52566a = new C1164a();

            C1164a() {
                super(3, uv.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/document/databinding/DocumentInstructionsBinding;", 0);
            }

            public final uv.a d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                s.g(p02, "p0");
                return uv.a.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ uv.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* loaded from: classes6.dex */
        /* synthetic */ class b extends p implements h00.l<uv.a, d> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f52567a = new b();

            b() {
                super(1, d.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/document/databinding/DocumentInstructionsBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final d invoke(uv.a p02) {
                s.g(p02, "p0");
                return new d(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f52565a = new r(m0.b(j.c.b.class), C1164a.f52566a, b.f52567a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(j.c.b initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            s.g(initialRendering, "initialRendering");
            s.g(initialViewEnvironment, "initialViewEnvironment");
            s.g(contextForNewView, "contextForNewView");
            return this.f52565a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super j.c.b> getType() {
            return this.f52565a.getType();
        }
    }

    public d(uv.a binding) {
        s.g(binding, "binding");
        this.f52564a = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(j.c.b rendering, View view) {
        s.g(rendering, "$rendering");
        rendering.b().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(j.c.b rendering, View view) {
        s.g(rendering, "$rendering");
        rendering.a().invoke();
    }

    @Override // pr.i
    /* renamed from: d */
    public void a(final j.c.b rendering, pr.s viewEnvironment) {
        s.g(rendering, "rendering");
        s.g(viewEnvironment, "viewEnvironment");
        uv.a aVar = this.f52564a;
        aVar.f53725d.setText(rendering.d());
        aVar.f53723b.setText(rendering.c());
        aVar.f53724c.setOnClickListener(new View.OnClickListener() { // from class: tv.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.e(j.c.b.this, view);
            }
        });
        aVar.f53726e.setOnClickListener(new View.OnClickListener() { // from class: tv.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.f(j.c.b.this, view);
            }
        });
    }
}