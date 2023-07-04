package tv;

import android.content.Context;
import android.util.TypedValue;
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
public final class f implements pr.i<j.c.a> {

    /* renamed from: b */
    public static final a f52569b = new a(null);

    /* renamed from: a */
    private final uv.b f52570a;

    /* loaded from: classes6.dex */
    public static final class a implements u<j.c.a> {

        /* renamed from: a */
        private final /* synthetic */ u<j.c.a> f52571a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: tv.f$a$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C1165a extends p implements q<LayoutInflater, ViewGroup, Boolean, uv.b> {

            /* renamed from: a */
            public static final C1165a f52572a = new C1165a();

            C1165a() {
                super(3, uv.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/document/databinding/DocumentLoadingBinding;", 0);
            }

            public final uv.b d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                s.g(p02, "p0");
                return uv.b.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ uv.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public /* synthetic */ class b extends p implements h00.l<uv.b, f> {

            /* renamed from: a */
            public static final b f52573a = new b();

            b() {
                super(1, f.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/document/databinding/DocumentLoadingBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final f invoke(uv.b p02) {
                s.g(p02, "p0");
                return new f(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f52571a = new r(m0.b(j.c.a.class), C1165a.f52572a, b.f52573a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(j.c.a initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            s.g(initialRendering, "initialRendering");
            s.g(initialViewEnvironment, "initialViewEnvironment");
            s.g(contextForNewView, "contextForNewView");
            return this.f52571a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super j.c.a> getType() {
            return this.f52571a.getType();
        }
    }

    public f(uv.b binding) {
        s.g(binding, "binding");
        this.f52570a = binding;
        binding.f53728b.i(new a8.e("**"), v7.j.f54281b, new i8.e() { // from class: tv.e
            {
                f.this = this;
            }

            @Override // i8.e
            public final Object a(i8.b bVar) {
                return f.b(f.this, bVar);
            }
        });
    }

    public static /* synthetic */ Integer b(f fVar, i8.b bVar) {
        return c(fVar, bVar);
    }

    public static final Integer c(f this$0, i8.b bVar) {
        s.g(this$0, "this$0");
        Context context = this$0.f52570a.getRoot().getContext();
        s.f(context, "binding.root.context");
        return Integer.valueOf(e(this$0, context, k.f52621a, null, false, 6, null));
    }

    private final int d(Context context, int i11, TypedValue typedValue, boolean z11) {
        context.getTheme().resolveAttribute(i11, typedValue, z11);
        return typedValue.data;
    }

    static /* synthetic */ int e(f fVar, Context context, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return fVar.d(context, i11, typedValue, z11);
    }

    @Override // pr.i
    /* renamed from: f */
    public void a(j.c.a rendering, pr.s viewEnvironment) {
        s.g(rendering, "rendering");
        s.g(viewEnvironment, "viewEnvironment");
    }
}