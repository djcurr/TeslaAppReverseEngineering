package com.withpersona.sdk.inquiry.selfie.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.renderscript.RenderScript;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.d;
import com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView;
import j00.c;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.a2;
import v20.e1;
import v20.k;
import v20.o0;
import v20.p0;
import vz.b0;
import vz.r;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk/inquiry/selfie/view/PreviewBlurView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "Companion", "a", "selfie_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class PreviewBlurView extends View {

    /* renamed from: b */
    public static final Companion f22901b = new Companion(null);

    /* renamed from: c */
    private static RenderScript f22902c;

    /* renamed from: a */
    private a f22903a;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RenderScript b(Context context) {
            if (PreviewBlurView.f22902c == null) {
                PreviewBlurView.f22902c = RenderScript.create(context);
                ((v) context).getLifecycle().a(new u() { // from class: com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView$Companion$getRenderScript$1$1
                    @h0(p.b.ON_DESTROY)
                    public final void cleanup() {
                        RenderScript b11 = PreviewBlurView.b();
                        if (b11 != null) {
                            b11.destroy();
                        }
                        PreviewBlurView.Companion companion = PreviewBlurView.f22901b;
                        PreviewBlurView.c(null);
                    }
                });
            }
            RenderScript renderScript = PreviewBlurView.f22902c;
            s.e(renderScript);
            return renderScript;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewBlurView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ PreviewBlurView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static final /* synthetic */ RenderScript b() {
        return f22902c;
    }

    public static final /* synthetic */ void c(RenderScript renderScript) {
        f22902c = renderScript;
    }

    public final boolean d() {
        return isAttachedToWindow() && getVisibility() == 0 && this.f22903a != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0027, code lost:
        if ((kotlin.jvm.internal.s.c(r0.n(), r12) && r0.o()) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.camera.view.PreviewView r12) {
        /*
            r11 = this;
            java.lang.String r0 = "previewView"
            kotlin.jvm.internal.s.g(r12, r0)
            boolean r0 = r11.isAttachedToWindow()
            if (r0 != 0) goto Lc
            return
        Lc:
            com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView$a r0 = r11.f22903a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
        L12:
            r1 = r2
            goto L29
        L14:
            androidx.camera.view.PreviewView r3 = r0.n()
            boolean r3 = kotlin.jvm.internal.s.c(r3, r12)
            if (r3 == 0) goto L26
            boolean r0 = r0.o()
            if (r0 == 0) goto L26
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            if (r0 != r1) goto L12
        L29:
            if (r1 == 0) goto L2c
            return
        L2c:
            com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView$a r0 = r11.f22903a
            if (r0 != 0) goto L31
            goto L34
        L31:
            r0.q()
        L34:
            com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView$a r0 = new com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView$a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 28
            r10 = 0
            r3 = r0
            r4 = r12
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.p()
            vz.b0 r12 = vz.b0.f54756a
            r11.f22903a = r0
            r11.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView.e(androidx.camera.view.PreviewView):void");
    }

    public final void f() {
        a aVar = this.f22903a;
        if (aVar != null) {
            aVar.q();
        }
        this.f22903a = null;
        setVisibility(4);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.g(canvas, "canvas");
        a aVar = this.f22903a;
        if (aVar == null) {
            return;
        }
        aVar.l(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewBlurView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        setWillNotDraw(false);
    }

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a */
        private final PreviewView f22904a;

        /* renamed from: b */
        private final PreviewBlurView f22905b;

        /* renamed from: c */
        private final float f22906c;

        /* renamed from: d */
        private final float f22907d;

        /* renamed from: e */
        private Paint f22908e;

        /* renamed from: f */
        private final RenderScript f22909f;

        /* renamed from: g */
        private final long f22910g;

        /* renamed from: h */
        private final Matrix f22911h;

        /* renamed from: i */
        private final Matrix f22912i;

        /* renamed from: j */
        private final Bitmap[] f22913j;

        /* renamed from: k */
        private int f22914k;

        /* renamed from: l */
        private int f22915l;

        /* renamed from: m */
        private long f22916m;

        /* renamed from: n */
        private a2 f22917n;

        @f(c = "com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView$FrameGrabber$start$1", f = "PreviewBlurView.kt", l = {d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 138}, m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView$a$a */
        /* loaded from: classes6.dex */
        public static final class C0435a extends l implements h00.p<o0, zz.d<? super b0>, Object> {

            /* renamed from: a */
            long f22918a;

            /* renamed from: b */
            int f22919b;

            @f(c = "com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView$FrameGrabber$start$1$bitmap$1", f = "PreviewBlurView.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView$a$a$a */
            /* loaded from: classes6.dex */
            public static final class C0436a extends l implements h00.p<o0, zz.d<? super Bitmap>, Object> {

                /* renamed from: a */
                int f22921a;

                /* renamed from: b */
                final /* synthetic */ a f22922b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0436a(a aVar, zz.d<? super C0436a> dVar) {
                    super(2, dVar);
                    this.f22922b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                    return new C0436a(this.f22922b, dVar);
                }

                @Override // h00.p
                public final Object invoke(o0 o0Var, zz.d<? super Bitmap> dVar) {
                    return ((C0436a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    a00.d.d();
                    if (this.f22921a == 0) {
                        r.b(obj);
                        return this.f22922b.n().getBitmap();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0435a(zz.d<? super C0435a> dVar) {
                super(2, dVar);
                a.this = r1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new C0435a(dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
                return ((C0435a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x008b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0081 -> B:60:0x0085). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 308
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView.a.C0435a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(PreviewView previewView, PreviewBlurView previewBlurView, float f11, float f12, int i11) {
            int c11;
            int c12;
            int c13;
            int c14;
            s.g(previewView, "previewView");
            s.g(previewBlurView, "previewBlurView");
            this.f22904a = previewView;
            this.f22905b = previewBlurView;
            this.f22906c = f11;
            this.f22907d = f12;
            this.f22908e = new Paint(7);
            Companion companion = PreviewBlurView.f22901b;
            Context context = previewBlurView.getContext();
            s.f(context, "previewBlurView.context");
            this.f22909f = companion.b(context);
            this.f22910g = 1000 / i11;
            Matrix matrix = new Matrix();
            float x11 = n().getX();
            ViewParent parent = m().getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            float y11 = n().getY();
            ViewParent parent2 = m().getParent();
            Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.view.View");
            matrix.preScale(f11, f11);
            matrix.postTranslate((x11 - ((View) parent).getX()) * f11, (y11 - ((View) parent2).getY()) * f11);
            b0 b0Var = b0.f54756a;
            this.f22911h = matrix;
            Matrix matrix2 = new Matrix();
            matrix2.preScale(1.0f / f11, 1.0f / f11);
            this.f22912i = matrix2;
            c11 = c.c(previewBlurView.getWidth() * f11);
            c12 = c.c(previewBlurView.getHeight() * f11);
            Bitmap createBitmap = Bitmap.createBitmap(c11, c12, Bitmap.Config.ARGB_8888);
            s.f(createBitmap, "createBitmap(\n        (p….Config.ARGB_8888\n      )");
            c13 = c.c(previewBlurView.getWidth() * f11);
            c14 = c.c(previewBlurView.getHeight() * f11);
            Bitmap createBitmap2 = Bitmap.createBitmap(c13, c14, Bitmap.Config.ARGB_8888);
            s.f(createBitmap2, "createBitmap(\n        (p….Config.ARGB_8888\n      )");
            this.f22913j = new Bitmap[]{createBitmap, createBitmap2};
            this.f22914k = -1;
            this.f22915l = -1;
        }

        public final void l(Canvas canvas) {
            s.g(canvas, "canvas");
            int i11 = this.f22914k;
            this.f22915l = i11;
            if (i11 >= 0) {
                canvas.drawBitmap(this.f22913j[i11], this.f22912i, this.f22908e);
            }
        }

        public final PreviewBlurView m() {
            return this.f22905b;
        }

        public final PreviewView n() {
            return this.f22904a;
        }

        public final boolean o() {
            a2 a2Var = this.f22917n;
            if (a2Var == null) {
                return false;
            }
            return a2Var.a();
        }

        public final void p() {
            a2 d11;
            d11 = k.d(p0.a(e1.a()), null, null, new C0435a(null), 3, null);
            this.f22917n = d11;
        }

        public final void q() {
            a2 a2Var = this.f22917n;
            if (a2Var == null) {
                return;
            }
            a2.a.a(a2Var, null, 1, null);
        }

        public /* synthetic */ a(PreviewView previewView, PreviewBlurView previewBlurView, float f11, float f12, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(previewView, previewBlurView, (i12 & 4) != 0 ? 0.125f : f11, (i12 & 8) != 0 ? 5.0f : f12, (i12 & 16) != 0 ? 30 : i11);
        }
    }
}