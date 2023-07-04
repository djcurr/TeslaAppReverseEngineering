package wv;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.withpersona.sdk.inquiry.governmentid.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import pr.i;

/* loaded from: classes6.dex */
public final class m implements pr.i<b.d.C0423b> {

    /* renamed from: e */
    public static final a f56358e = new a(null);

    /* renamed from: a */
    private final View f56359a;

    /* renamed from: b */
    private final Button f56360b;

    /* renamed from: c */
    private final TextView f56361c;

    /* renamed from: d */
    private final ImageView f56362d;

    /* loaded from: classes6.dex */
    public static final class a implements pr.u<b.d.C0423b> {

        /* renamed from: a */
        private final /* synthetic */ pr.u<b.d.C0423b> f56363a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: wv.m$a$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C1278a extends kotlin.jvm.internal.p implements h00.l<View, m> {

            /* renamed from: a */
            public static final C1278a f56364a = new C1278a();

            C1278a() {
                super(1, m.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final m invoke(View p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new m(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f56363a = new pr.k(m0.b(b.d.C0423b.class), i0.f56315c, C1278a.f56364a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(b.d.C0423b initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f56363a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super b.d.C0423b> getType() {
            return this.f56363a.getType();
        }
    }

    public m(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        this.f56359a = view;
        View findViewById = view.findViewById(h0.f56284e);
        kotlin.jvm.internal.s.f(findViewById, "view.findViewById(R.id.button_governmentid_retry)");
        this.f56360b = (Button) findViewById;
        View findViewById2 = view.findViewById(h0.f56301v);
        kotlin.jvm.internal.s.f(findViewById2, "view.findViewById(R.id.t…governmentid_failed_body)");
        this.f56361c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(h0.f56293n);
        kotlin.jvm.internal.s.f(findViewById3, "view.findViewById(R.id.i…view_governmentid_failed)");
        this.f56362d = (ImageView) findViewById3;
    }

    public static /* synthetic */ void b(b.d.C0423b c0423b, View view) {
        d(c0423b, view);
    }

    public static final void d(b.d.C0423b rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.b().invoke();
    }

    @Override // pr.i
    /* renamed from: c */
    public void a(final b.d.C0423b rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        this.f56360b.setOnClickListener(new View.OnClickListener() { // from class: wv.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.b(b.d.C0423b.this, view);
            }
        });
        this.f56361c.setText(rendering.a());
        Context context = this.f56359a.getContext();
        kotlin.jvm.internal.s.f(context, "context");
        TypedValue a11 = y.a(context, "personaInquiryFailImage");
        if (a11.type != 0) {
            this.f56362d.setImageResource(a11.resourceId);
            this.f56362d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
    }
}