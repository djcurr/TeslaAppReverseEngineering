package wv;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.camera.view.PreviewView;
import com.withpersona.sdk.inquiry.governmentid.b;
import java.io.File;
import v20.e1;
import v20.o0;
import v20.p0;

/* loaded from: classes6.dex */
public final class f implements pr.i<b.d.a> {

    /* renamed from: a */
    private final xv.b f56238a;

    /* renamed from: b */
    private final pv.i f56239b;

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56240a;

        static {
            int[] iArr = new int[b.d.a.EnumC0419b.values().length];
            iArr[b.d.a.EnumC0419b.Disabled.ordinal()] = 1;
            iArr[b.d.a.EnumC0419b.Enabled.ordinal()] = 2;
            iArr[b.d.a.EnumC0419b.Hidden.ordinal()] = 3;
            f56240a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.governmentid.CameraScreenRunner$showRendering$1$4$1", f = "CameraScreenRunner.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a */
        int f56241a;

        /* renamed from: c */
        final /* synthetic */ xv.b f56243c;

        /* renamed from: d */
        final /* synthetic */ b.d.a f56244d;

        /* renamed from: e */
        final /* synthetic */ View f56245e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xv.b bVar, b.d.a aVar, View view, zz.d<? super b> dVar) {
            super(2, dVar);
            f.this = r1;
            this.f56243c = bVar;
            this.f56244d = aVar;
            this.f56245e = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f56243c, this.f56244d, this.f56245e, dVar);
        }

        @Override // h00.p
        public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object h11;
            d11 = a00.d.d();
            int i11 = this.f56241a;
            if (i11 == 0) {
                vz.r.b(obj);
                pv.i iVar = f.this.f56239b;
                Context context = this.f56243c.f57744c.getContext();
                kotlin.jvm.internal.s.f(context, "button.context");
                this.f56241a = 1;
                h11 = iVar.h(context, this);
                if (h11 == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
                h11 = ((vz.q) obj).j();
            }
            b.d.a aVar = this.f56244d;
            View view = this.f56245e;
            if (vz.q.e(h11) == null) {
                h00.l<String, vz.b0> f11 = aVar.f();
                String absolutePath = ((File) h11).getAbsolutePath();
                kotlin.jvm.internal.s.f(absolutePath, "file.absolutePath");
                f11.mo12invoke(absolutePath);
            } else {
                view.setEnabled(true);
            }
            return vz.b0.f54756a;
        }
    }

    public f(xv.b binding, pv.i cameraPreview) {
        kotlin.jvm.internal.s.g(binding, "binding");
        kotlin.jvm.internal.s.g(cameraPreview, "cameraPreview");
        this.f56238a = binding;
        this.f56239b = cameraPreview;
    }

    public static /* synthetic */ void b(f fVar, xv.b bVar, View view) {
        m(fVar, bVar, view);
    }

    public static /* synthetic */ void c(f fVar, CompoundButton compoundButton, boolean z11) {
        k(fVar, compoundButton, z11);
    }

    public static /* synthetic */ void e(b.d.a aVar, View view) {
        i(aVar, view);
    }

    public static /* synthetic */ void f(b.d.a aVar, View view) {
        j(aVar, view);
    }

    public static final void i(b.d.a rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.d().mo11invoke();
    }

    public static final void j(b.d.a rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.b().mo11invoke();
    }

    public static final void k(f this$0, CompoundButton compoundButton, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f56239b.c(z11);
    }

    public static final void l(f this$0, xv.b this_apply, b.d.a rendering, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(this_apply, "$this_apply");
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        view.setEnabled(false);
        v20.k.d(p0.a(e1.c()), null, null, new b(this_apply, rendering, view, null), 3, null);
    }

    public static final void m(f this$0, xv.b this_apply, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(this_apply, "$this_apply");
        pv.i iVar = this$0.f56239b;
        PreviewView previewView = this_apply.f57751j;
        kotlin.jvm.internal.s.f(previewView, "previewView");
        iVar.d(previewView);
    }

    @Override // pr.i
    /* renamed from: h */
    public void a(final b.d.a rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        final xv.b bVar = this.f56238a;
        Context context = bVar.getRoot().getContext();
        bVar.f57748g.setText(context.getString(rendering.i(), context.getString(rendering.e())));
        bVar.f57747f.setText(context.getString(rendering.g()));
        bVar.f57745d.setOnClickListener(new View.OnClickListener() { // from class: wv.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.e(b.d.a.this, view);
            }
        });
        bVar.f57743b.setOnClickListener(new View.OnClickListener() { // from class: wv.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.f(b.d.a.this, view);
            }
        });
        int i11 = a.f56240a[rendering.c().ordinal()];
        if (i11 == 1) {
            bVar.f57744c.setEnabled(false);
        } else if (i11 == 2) {
            bVar.f57744c.setVisibility(0);
            bVar.f57744c.setEnabled(true);
        } else if (i11 == 3) {
            bVar.f57744c.setVisibility(4);
        }
        b.d.a.c h11 = rendering.h();
        if (h11 instanceof b.d.a.c.C0422c) {
            bVar.f57749h.setVisibility(0);
            bVar.f57749h.setText(context.getString(((b.d.a.c.C0422c) h11).a(), context.getString(rendering.e())));
            bVar.f57750i.setImageLevel(0);
        } else if (kotlin.jvm.internal.s.c(h11, b.d.a.c.C0421b.f22430a)) {
            bVar.f57749h.setVisibility(4);
            bVar.f57750i.setImageLevel(1);
        } else if (kotlin.jvm.internal.s.c(h11, b.d.a.c.C0420a.f22429a)) {
            bVar.f57749h.setVisibility(4);
            bVar.f57750i.setImageLevel(2);
        }
        bVar.f57746e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wv.e
            {
                f.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                f.c(f.this, compoundButton, z11);
            }
        });
        bVar.f57744c.setOnClickListener(new View.OnClickListener() { // from class: wv.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.l(f.this, bVar, rendering, view);
            }
        });
        bVar.f57751j.setOnClickListener(new View.OnClickListener() { // from class: wv.c
            {
                f.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.b(f.this, bVar, view);
            }
        });
    }
}