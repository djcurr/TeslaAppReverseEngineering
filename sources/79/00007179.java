package gw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import gw.g0;
import gw.p;
import kotlin.jvm.internal.m0;
import pr.i;
import pv.i;

/* loaded from: classes6.dex */
public final class p implements pr.u<g0.d.a> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ pr.u<g0.d.a> f28459a;

    /* loaded from: classes6.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.q<LayoutInflater, ViewGroup, Boolean, hw.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28460a = new a();

        a() {
            super(3, hw.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/selfie/databinding/SelfieCameraBinding;", 0);
        }

        public final hw.a d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return hw.a.c(p02, viewGroup, z11);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ hw.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* loaded from: classes6.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<hw.a, pr.i<g0.d.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ pv.i f28461a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ pv.x f28462b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(pv.i iVar, pv.x xVar) {
            super(1);
            this.f28461a = iVar;
            this.f28462b = xVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(pv.i cameraPreview, hw.a binding, pv.x selfieDirectionFeed) {
            kotlin.jvm.internal.s.g(cameraPreview, "$cameraPreview");
            kotlin.jvm.internal.s.g(binding, "$binding");
            kotlin.jvm.internal.s.g(selfieDirectionFeed, "$selfieDirectionFeed");
            PreviewView previewView = binding.f29446g;
            kotlin.jvm.internal.s.f(previewView, "binding.previewviewSelfieCamera");
            cameraPreview.e(previewView, i.a.FRONT, selfieDirectionFeed);
        }

        @Override // h00.l
        /* renamed from: b */
        public final pr.i<g0.d.a> invoke(final hw.a binding) {
            kotlin.jvm.internal.s.g(binding, "binding");
            PreviewView previewView = binding.f29446g;
            final pv.i iVar = this.f28461a;
            final pv.x xVar = this.f28462b;
            previewView.post(new Runnable() { // from class: gw.q
                @Override // java.lang.Runnable
                public final void run() {
                    p.b.c(pv.i.this, binding, xVar);
                }
            });
            return new d(binding, this.f28461a);
        }
    }

    public p(pv.i cameraPreview, pv.x selfieDirectionFeed) {
        kotlin.jvm.internal.s.g(cameraPreview, "cameraPreview");
        kotlin.jvm.internal.s.g(selfieDirectionFeed, "selfieDirectionFeed");
        i.a aVar = pr.i.f46871h1;
        this.f28459a = new pr.r(m0.b(g0.d.a.class), a.f28460a, new b(cameraPreview, selfieDirectionFeed));
    }

    @Override // pr.u
    /* renamed from: b */
    public View a(g0.d.a initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
        kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
        kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
        kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
        return this.f28459a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
    }

    @Override // pr.u
    public n00.d<? super g0.d.a> getType() {
        return this.f28459a.getType();
    }
}