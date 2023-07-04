package pv;

import android.content.Context;
import android.util.Size;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.c0;
import androidx.camera.core.o;
import androidx.camera.core.r0;
import androidx.camera.view.PreviewView;
import java.io.File;
import java.util.Objects;
import v20.e1;
import v20.s1;
import vz.q;
import z.e;
import z.r;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private z.b f46953a;

    /* renamed from: b  reason: collision with root package name */
    private c0 f46954b;

    /* loaded from: classes2.dex */
    public enum a {
        FRONT,
        BACK
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.camera.CameraPreview", f = "CameraPreview.kt", l = {117}, m = "takePicture-gIAlu-s")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f46955a;

        /* renamed from: b  reason: collision with root package name */
        Object f46956b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f46957c;

        /* renamed from: e  reason: collision with root package name */
        int f46959e;

        b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            this.f46957c = obj;
            this.f46959e |= Integer.MIN_VALUE;
            Object h11 = i.this.h(null, this);
            d11 = a00.d.d();
            return h11 == d11 ? h11 : vz.q.a(h11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements c0.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ zz.d<vz.q<? extends File>> f46960a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f46961b;

        /* JADX WARN: Multi-variable type inference failed */
        c(zz.d<? super vz.q<? extends File>> dVar, File file) {
            this.f46960a = dVar;
            this.f46961b = file;
        }

        @Override // androidx.camera.core.c0.r
        public void a(c0.t outputFileResults) {
            kotlin.jvm.internal.s.g(outputFileResults, "outputFileResults");
            zz.d<vz.q<? extends File>> dVar = this.f46960a;
            q.a aVar = vz.q.f54772b;
            dVar.resumeWith(vz.q.b(vz.q.a(vz.q.b(this.f46961b))));
        }

        @Override // androidx.camera.core.c0.r
        public void b(ImageCaptureException exception) {
            kotlin.jvm.internal.s.g(exception, "exception");
            zz.d<vz.q<? extends File>> dVar = this.f46960a;
            q.a aVar = vz.q.f54772b;
            dVar.resumeWith(vz.q.b(vz.q.a(vz.q.b(vz.r.a(exception)))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final PreviewView previewView, final i this$0, final o.a imageAnalyzer, final z.e cameraSelector) {
        kotlin.jvm.internal.s.g(previewView, "$previewView");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(imageAnalyzer, "$imageAnalyzer");
        kotlin.jvm.internal.s.g(cameraSelector, "$cameraSelector");
        Context context = previewView.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.a supportActionBar = ((androidx.appcompat.app.d) context).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.l();
        }
        final int rotation = previewView.getDisplay().getRotation();
        final com.google.common.util.concurrent.c<androidx.camera.lifecycle.c> d11 = androidx.camera.lifecycle.c.d(previewView.getContext());
        kotlin.jvm.internal.s.f(d11, "getInstance(previewView.context)");
        d11.a(new Runnable() { // from class: pv.h
            @Override // java.lang.Runnable
            public final void run() {
                i.g(com.google.common.util.concurrent.c.this, rotation, this$0, imageAnalyzer, previewView, cameraSelector);
            }
        }, androidx.core.content.b.getMainExecutor(previewView.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(com.google.common.util.concurrent.c cameraProviderFuture, int i11, i this$0, o.a imageAnalyzer, PreviewView previewView, z.e cameraSelector) {
        kotlin.jvm.internal.s.g(cameraProviderFuture, "$cameraProviderFuture");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(imageAnalyzer, "$imageAnalyzer");
        kotlin.jvm.internal.s.g(previewView, "$previewView");
        kotlin.jvm.internal.s.g(cameraSelector, "$cameraSelector");
        androidx.camera.lifecycle.c cVar = (androidx.camera.lifecycle.c) cameraProviderFuture.get();
        r0 c11 = new r0.b().j(i11).c();
        kotlin.jvm.internal.s.f(c11, "Builder()\n            .s…ion)\n            .build()");
        this$0.f46954b = new c0.j().f(1).k(i11).c();
        androidx.camera.core.o c12 = new o.c().g(0).m(new Size(2000, 2000)).n(i11).c();
        kotlin.jvm.internal.s.f(c12, "Builder()\n            .s…ion)\n            .build()");
        c12.Q(s1.a(e1.a()), imageAnalyzer);
        cVar.g();
        Context context = previewView.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this$0.f46953a = cVar.c((androidx.appcompat.app.d) context, cameraSelector, c11, this$0.f46954b, c12);
        c11.R(previewView.getSurfaceProvider());
    }

    public final void c(boolean z11) {
        CameraControl a11;
        z.b bVar = this.f46953a;
        if (bVar == null || (a11 = bVar.a()) == null) {
            return;
        }
        a11.d(z11);
    }

    public final void d(PreviewView previewView) {
        kotlin.jvm.internal.s.g(previewView, "previewView");
        z.b bVar = this.f46953a;
        if (bVar == null) {
            return;
        }
        bVar.a().i(new r.a(new z.p(previewView.getDisplay(), bVar.b(), previewView.getWidth(), previewView.getHeight()).b(previewView.getWidth() / 2.0f, previewView.getHeight() / 2.0f), 1).b());
    }

    public final void e(final PreviewView previewView, a cameraDirection, final o.a imageAnalyzer) {
        kotlin.jvm.internal.s.g(previewView, "previewView");
        kotlin.jvm.internal.s.g(cameraDirection, "cameraDirection");
        kotlin.jvm.internal.s.g(imageAnalyzer, "imageAnalyzer");
        final z.e b11 = new e.a().d(cameraDirection == a.FRONT ? 0 : 1).b();
        kotlin.jvm.internal.s.f(b11, "Builder()\n      .require…        }\n      ).build()");
        previewView.post(new Runnable() { // from class: pv.g
            @Override // java.lang.Runnable
            public final void run() {
                i.f(PreviewView.this, this, imageAnalyzer, b11);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(android.content.Context r7, zz.d<? super vz.q<? extends java.io.File>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pv.i.b
            if (r0 == 0) goto L13
            r0 = r8
            pv.i$b r0 = (pv.i.b) r0
            int r1 = r0.f46959e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46959e = r1
            goto L18
        L13:
            pv.i$b r0 = new pv.i$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f46957c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f46959e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f46956b
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r7 = r0.f46955a
            pv.i r7 = (pv.i) r7
            vz.r.b(r8)
            goto La5
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            vz.r.b(r8)
            r0.f46955a = r6
            r0.f46956b = r7
            r0.f46959e = r3
            zz.i r8 = new zz.i
            zz.d r2 = a00.b.c(r0)
            r8.<init>(r2)
            java.io.File r2 = new java.io.File
            java.io.File r7 = r7.getCacheDir()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "persona_camera_"
            r3.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            java.lang.String r4 = ".jpg"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r7, r3)
            androidx.camera.core.c0$s$a r7 = new androidx.camera.core.c0$s$a
            r7.<init>(r2)
            androidx.camera.core.c0$s r7 = r7.a()
            java.lang.String r3 = "Builder(file).build()"
            kotlin.jvm.internal.s.f(r7, r3)
            androidx.camera.core.c0 r3 = r6.f46954b
            if (r3 != 0) goto L81
            goto L95
        L81:
            v20.l2 r4 = v20.e1.c()
            v20.l2 r4 = r4.R0()
            java.util.concurrent.Executor r4 = v20.s1.a(r4)
            pv.i$c r5 = new pv.i$c
            r5.<init>(r8, r2)
            r3.E0(r7, r4, r5)
        L95:
            java.lang.Object r8 = r8.b()
            java.lang.Object r7 = a00.b.d()
            if (r8 != r7) goto La2
            kotlin.coroutines.jvm.internal.h.c(r0)
        La2:
            if (r8 != r1) goto La5
            return r1
        La5:
            vz.q r8 = (vz.q) r8
            java.lang.Object r7 = r8.j()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.i.h(android.content.Context, zz.d):java.lang.Object");
    }
}