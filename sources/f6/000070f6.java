package gw;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import com.withpersona.sdk.inquiry.selfie.view.SelfieOverlayView;
import gw.g0;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import v20.e1;
import v20.o0;
import v20.p0;

/* loaded from: classes6.dex */
public final class d implements pr.i<g0.d.a> {

    /* renamed from: a  reason: collision with root package name */
    private final hw.a f28244a;

    /* renamed from: b  reason: collision with root package name */
    private final pv.i f28245b;

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28246a;

        static {
            int[] iArr = new int[g0.d.a.b.values().length];
            iArr[g0.d.a.b.CLEAR.ordinal()] = 1;
            iArr[g0.d.a.b.CENTER.ordinal()] = 2;
            iArr[g0.d.a.b.LOOK_LEFT.ordinal()] = 3;
            iArr[g0.d.a.b.LOOK_RIGHT.ordinal()] = 4;
            iArr[g0.d.a.b.COMPLETE.ordinal()] = 5;
            f28246a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.selfie.CameraScreenRunner$showRendering$1$3$1", f = "CameraScreenRunner.kt", l = {78}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28247a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ hw.a f28249c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g0.d.a.AbstractC0541a f28250d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(hw.a aVar, g0.d.a.AbstractC0541a abstractC0541a, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f28249c = aVar;
            this.f28250d = abstractC0541a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f28249c, this.f28250d, dVar);
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
            int i11 = this.f28247a;
            if (i11 == 0) {
                vz.r.b(obj);
                pv.i iVar = d.this.f28245b;
                Context context = this.f28249c.f29441b.getContext();
                kotlin.jvm.internal.s.f(context, "button.context");
                this.f28247a = 1;
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
            g0.d.a.AbstractC0541a abstractC0541a = this.f28250d;
            hw.a aVar = this.f28249c;
            if (vz.q.e(h11) == null) {
                h00.l<String, vz.b0> b11 = ((g0.d.a.AbstractC0541a.c) abstractC0541a).b();
                String absolutePath = ((File) h11).getAbsolutePath();
                kotlin.jvm.internal.s.f(absolutePath, "file.absolutePath");
                b11.mo12invoke(absolutePath);
            } else {
                aVar.f29441b.setEnabled(true);
            }
            return vz.b0.f54756a;
        }
    }

    public d(hw.a binding, pv.i cameraPreview) {
        kotlin.jvm.internal.s.g(binding, "binding");
        kotlin.jvm.internal.s.g(cameraPreview, "cameraPreview");
        this.f28244a = binding;
        this.f28245b = cameraPreview;
        SelfieOverlayView selfieOverlayView = binding.f29447h;
        PreviewView previewView = binding.f29446g;
        kotlin.jvm.internal.s.f(previewView, "binding.previewviewSelfieCamera");
        selfieOverlayView.setPreviewView(previewView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(hw.a this_apply, g0.d.a.AbstractC0541a mode, View view) {
        kotlin.jvm.internal.s.g(this_apply, "$this_apply");
        kotlin.jvm.internal.s.g(mode, "$mode");
        this_apply.f29441b.setEnabled(false);
        ((g0.d.a.AbstractC0541a.C0543d) mode).b().mo11invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(hw.a this_apply, d this$0, g0.d.a.AbstractC0541a mode, View view) {
        kotlin.jvm.internal.s.g(this_apply, "$this_apply");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(mode, "$mode");
        this_apply.f29441b.setEnabled(false);
        v20.k.d(p0.a(e1.c().R0()), null, null, new b(this_apply, mode, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(g0.d.a rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.a().mo11invoke();
    }

    private final SelfieOverlayView.a j(g0.d.a.b bVar) {
        int i11 = a.f28246a[bVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return SelfieOverlayView.a.COMPLETE;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return SelfieOverlayView.a.LOOK_RIGHT;
                }
                return SelfieOverlayView.a.LOOK_LEFT;
            }
            return SelfieOverlayView.a.CENTER;
        }
        return SelfieOverlayView.a.CLEAR;
    }

    @Override // pr.i
    /* renamed from: f */
    public void a(final g0.d.a rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        final hw.a aVar = this.f28244a;
        TextView textView = aVar.f29445f;
        Integer b11 = rendering.b();
        String str = "";
        if (b11 != null) {
            String string = aVar.f29445f.getContext().getResources().getString(b11.intValue());
            if (string != null) {
                str = string;
            }
        }
        textView.setText(str);
        aVar.f29441b.setEnabled(true);
        aVar.f29443d.setVisibility(8);
        aVar.f29444e.setVisibility(8);
        final g0.d.a.AbstractC0541a c11 = rendering.c();
        if (c11 instanceof g0.d.a.AbstractC0541a.C0543d) {
            aVar.f29441b.setVisibility(0);
            aVar.f29441b.setOnClickListener(new View.OnClickListener() { // from class: gw.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.g(hw.a.this, c11, view);
                }
            });
            SelfieOverlayView selfieWindow = aVar.f29447h;
            kotlin.jvm.internal.s.f(selfieWindow, "selfieWindow");
            SelfieOverlayView.d(selfieWindow, j(c11.a()), null, 2, null);
        } else if (c11 instanceof g0.d.a.AbstractC0541a.b) {
            aVar.f29441b.setVisibility(4);
            aVar.f29443d.setVisibility(0);
            aVar.f29443d.setText(String.valueOf(((g0.d.a.AbstractC0541a.b) c11).b()));
            SelfieOverlayView selfieWindow2 = aVar.f29447h;
            kotlin.jvm.internal.s.f(selfieWindow2, "selfieWindow");
            SelfieOverlayView.d(selfieWindow2, j(c11.a()), null, 2, null);
        } else if (c11 instanceof g0.d.a.AbstractC0541a.e) {
            aVar.f29441b.setEnabled(false);
            aVar.f29447h.c(j(c11.a()), ((g0.d.a.AbstractC0541a.e) c11).b());
        } else if (c11 instanceof g0.d.a.AbstractC0541a.c) {
            aVar.f29441b.setVisibility(0);
            aVar.f29441b.setOnClickListener(new View.OnClickListener() { // from class: gw.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.h(hw.a.this, this, c11, view);
                }
            });
            SelfieOverlayView selfieWindow3 = aVar.f29447h;
            kotlin.jvm.internal.s.f(selfieWindow3, "selfieWindow");
            SelfieOverlayView.d(selfieWindow3, j(c11.a()), null, 2, null);
        } else if (c11 instanceof g0.d.a.AbstractC0541a.C0542a) {
            aVar.f29441b.setVisibility(4);
            SelfieOverlayView selfieWindow4 = aVar.f29447h;
            kotlin.jvm.internal.s.f(selfieWindow4, "selfieWindow");
            SelfieOverlayView.d(selfieWindow4, j(c11.a()), null, 2, null);
        }
        aVar.f29442c.setOnClickListener(new View.OnClickListener() { // from class: gw.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.i(g0.d.a.this, view);
            }
        });
    }
}