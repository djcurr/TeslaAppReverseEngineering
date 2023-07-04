package zv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pr.i;
import zv.j0;

/* loaded from: classes6.dex */
public final class v implements pr.i<j0.c.C1405c> {

    /* renamed from: f */
    public static final b f61224f = new b(null);

    /* renamed from: a */
    private final aw.b f61225a;

    /* renamed from: b */
    private final BottomSheetBehavior<NestedScrollView> f61226b;

    /* renamed from: c */
    private final RecyclerView f61227c;

    /* renamed from: d */
    private final String[] f61228d;

    /* renamed from: e */
    private final String[] f61229e;

    /* loaded from: classes6.dex */
    public static final class a extends BottomSheetBehavior.f {
        a() {
            v.this = r1;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onSlide(View bottomSheet, float f11) {
            kotlin.jvm.internal.s.g(bottomSheet, "bottomSheet");
            v.this.f61225a.f7062d.setAlpha(f11);
            v.this.f61225a.f7063e.setEnabled(false);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onStateChanged(View bottomSheet, int i11) {
            kotlin.jvm.internal.s.g(bottomSheet, "bottomSheet");
            if (i11 == 4) {
                v.this.f61225a.f7063e.setEnabled(true);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements pr.u<j0.c.C1405c> {

        /* renamed from: a */
        private final /* synthetic */ pr.u<j0.c.C1405c> f61231a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.q<LayoutInflater, ViewGroup, Boolean, aw.b> {

            /* renamed from: a */
            public static final a f61232a = new a();

            a() {
                super(3, aw.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/internal/databinding/InquiryCountrySelectBinding;", 0);
            }

            public final aw.b d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return aw.b.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ aw.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zv.v$b$b */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C1409b extends kotlin.jvm.internal.p implements h00.l<aw.b, v> {

            /* renamed from: a */
            public static final C1409b f61233a = new C1409b();

            C1409b() {
                super(1, v.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/internal/databinding/InquiryCountrySelectBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final v mo12invoke(aw.b p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new v(p02);
            }
        }

        private b() {
            i.a aVar = pr.i.f46871h1;
            this.f61231a = new pr.r(kotlin.jvm.internal.m0.b(j0.c.C1405c.class), a.f61232a, C1409b.f61233a);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(j0.c.C1405c initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f61231a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super j0.c.C1405c> getType() {
            return this.f61231a.getType();
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: b */
        final /* synthetic */ j0.c.C1405c f61235b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j0.c.C1405c c1405c) {
            super(0);
            v.this = r1;
            this.f61235b = c1405c;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            if (v.this.f61226b.g0() != 4) {
                v.this.f61226b.B0(4);
            } else {
                this.f61235b.c().mo11invoke();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ j0.c.C1405c f61236a;

        /* renamed from: b */
        final /* synthetic */ v f61237b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j0.c.C1405c c1405c, v vVar) {
            super(1);
            this.f61236a = c1405c;
            this.f61237b = vVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(String str) {
            invoke2(str);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String countryCode) {
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            this.f61236a.f().mo12invoke(countryCode);
            this.f61237b.f61226b.B0(4);
        }
    }

    public v(aw.b binding) {
        kotlin.jvm.internal.s.g(binding, "binding");
        this.f61225a = binding;
        BottomSheetBehavior<NestedScrollView> c02 = BottomSheetBehavior.c0(binding.f7064f);
        kotlin.jvm.internal.s.f(c02, "from(binding.listContent)");
        this.f61226b = c02;
        RecyclerView recyclerView = binding.f7065g;
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        vz.b0 b0Var = vz.b0.f54756a;
        kotlin.jvm.internal.s.f(recyclerView, "binding.recyclerviewInqu…nding.root.context)\n    }");
        this.f61227c = recyclerView;
        String[] stringArray = binding.getRoot().getResources().getStringArray(k0.f61147a);
        kotlin.jvm.internal.s.f(stringArray, "binding.root.resources.g…_countryselect_countries)");
        this.f61228d = stringArray;
        String[] stringArray2 = binding.getRoot().getResources().getStringArray(k0.f61148b);
        kotlin.jvm.internal.s.f(stringArray2, "binding.root.resources.g…untryselect_countrycodes)");
        this.f61229e = stringArray2;
        c02.S(new a());
        binding.f7069k.setOnClickListener(new View.OnClickListener() { // from class: zv.s
            {
                v.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.e(v.this, view);
            }
        });
    }

    public static /* synthetic */ void d(v vVar, View view) {
        j(vVar, view);
    }

    public static /* synthetic */ void e(v vVar, View view) {
        f(vVar, view);
    }

    public static final void f(v this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f61226b.B0(3);
    }

    public static final void j(v this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f61226b.B0(4);
    }

    public static final void k(j0.c.C1405c rendering, v this$0, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        rendering.f().mo12invoke(rendering.e());
        this$0.f61226b.B0(4);
    }

    public static final void l(j0.c.C1405c rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.d().mo11invoke();
    }

    @Override // pr.i
    /* renamed from: i */
    public void a(final j0.c.C1405c rendering, pr.s viewEnvironment) {
        int O;
        List H0;
        vz.p w11;
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        String[] strArr = this.f61228d;
        O = wz.p.O(this.f61229e, rendering.e());
        String str = strArr[O];
        this.f61225a.f7066h.setText(str);
        this.f61225a.f7060b.setOnClickListener(new View.OnClickListener() { // from class: zv.r
            {
                v.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.d(v.this, view);
            }
        });
        ConstraintLayout root = this.f61225a.getRoot();
        kotlin.jvm.internal.s.f(root, "binding.root");
        pr.c.c(root, new c(rendering));
        this.f61225a.f7061c.setText(str);
        this.f61225a.f7061c.setOnClickListener(new View.OnClickListener() { // from class: zv.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.k(j0.c.C1405c.this, this, view);
            }
        });
        H0 = wz.p.H0(this.f61229e, this.f61228d);
        ArrayList arrayList = new ArrayList();
        for (Object obj : H0) {
            if (rendering.b().isEmpty() || rendering.b().contains(((vz.p) obj).c())) {
                arrayList.add(obj);
            }
        }
        w11 = wz.x.w(arrayList);
        this.f61227c.setAdapter(new q((List) w11.b(), (List) w11.a(), new d(rendering, this)));
        this.f61225a.f7063e.setOnClickListener(new View.OnClickListener() { // from class: zv.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.l(j0.c.C1405c.this, view);
            }
        });
    }
}