package wv;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk.inquiry.governmentid.b;
import com.withpersona.sdk.inquiry.governmentid.network.Id;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import pr.i;

/* loaded from: classes6.dex */
public final class n implements pr.i<b.d.c> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56365b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView f56366a;

    /* loaded from: classes6.dex */
    public static final class a implements pr.u<b.d.c> {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ pr.u<b.d.c> f56367a;

        /* renamed from: wv.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        /* synthetic */ class C1279a extends kotlin.jvm.internal.p implements h00.l<View, n> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1279a f56368a = new C1279a();

            C1279a() {
                super(1, n.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final n invoke(View p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new n(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f56367a = new pr.k(m0.b(b.d.c.class), i0.f56317e, C1279a.f56368a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(b.d.c initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f56367a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super b.d.c> getType() {
            return this.f56367a.getType();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<Id, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.d.c f56369a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b.d.c cVar) {
            super(1);
            this.f56369a = cVar;
        }

        public final void a(Id idClass) {
            kotlin.jvm.internal.s.g(idClass, "idClass");
            this.f56369a.b().invoke(idClass);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Id id2) {
            a(id2);
            return vz.b0.f54756a;
        }
    }

    public n(View view) {
        boolean w11;
        kotlin.jvm.internal.s.g(view, "view");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(h0.f56298s);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(view.getContext(), 1));
        vz.b0 b0Var = vz.b0.f54756a;
        this.f56366a = recyclerView;
        TextView textView = (TextView) view.findViewById(h0.f56302w);
        CharSequence text = textView.getText();
        kotlin.jvm.internal.s.f(text, "instructionsTextView.text");
        w11 = kotlin.text.v.w(text);
        if (w11) {
            textView.setVisibility(8);
        }
    }

    @Override // pr.i
    /* renamed from: b */
    public void a(b.d.c rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        this.f56366a.setAdapter(new p(rendering.a(), new b(rendering)));
    }
}