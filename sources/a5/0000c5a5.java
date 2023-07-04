package zv;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pr.i;
import zv.j0;

/* loaded from: classes6.dex */
public final class h0 implements pr.i<j0.c.f> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f60894c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Button f60895a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f60896b;

    /* loaded from: classes6.dex */
    public static final class a implements pr.u<j0.c.f> {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ pr.u<j0.c.f> f60897a;

        /* renamed from: zv.h0$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        /* synthetic */ class C1400a extends kotlin.jvm.internal.p implements h00.l<View, h0> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1400a f60898a = new C1400a();

            C1400a() {
                super(1, h0.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final h0 invoke(View p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new h0(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f60897a = new pr.k(kotlin.jvm.internal.m0.b(j0.c.f.class), n0.f61188g, C1400a.f60898a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(j0.c.f initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f60897a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super j0.c.f> getType() {
            return this.f60897a.getType();
        }
    }

    public h0(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        View findViewById = view.findViewById(m0.f61161e);
        kotlin.jvm.internal.s.f(findViewById, "view.findViewById(R.id.button_inquiry_start)");
        this.f60895a = (Button) findViewById;
        View findViewById2 = view.findViewById(m0.f61177u);
        kotlin.jvm.internal.s.f(findViewById2, "view.findViewById(R.id.t…iry_start_privacy_policy)");
        TextView textView = (TextView) findViewById2;
        this.f60896b = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(j0.c.f rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.c().invoke();
    }

    @Override // pr.i
    /* renamed from: c */
    public void a(final j0.c.f rendering, pr.s viewEnvironment) {
        int i11;
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        this.f60895a.setOnClickListener(new View.OnClickListener() { // from class: zv.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h0.d(j0.c.f.this, view);
            }
        });
        this.f60895a.setEnabled(rendering.b());
        TextView textView = this.f60896b;
        if (rendering.d()) {
            i11 = o0.f61202a;
        } else {
            i11 = o0.f61203b;
        }
        textView.setText(i11);
    }
}