package com.withpersona.sdk.inquiry.selfie.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gw.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001f\u0010\u000b\u001a\u0004\u0018\u00010\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk/inquiry/selfie/view/SelfieOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/camera/view/PreviewView;", "previewView", "Lvz/b0;", "setPreviewView", "Landroid/graphics/drawable/Drawable;", "drawableLeft$delegate", "Lvz/k;", "getDrawableLeft", "()Landroid/graphics/drawable/Drawable;", "drawableLeft", "drawableRight$delegate", "getDrawableRight", "drawableRight", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "selfie_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SelfieOverlayView extends ConstraintLayout {

    /* renamed from: a */
    private final hw.e f22928a;

    /* renamed from: b */
    private final k f22929b;

    /* renamed from: c */
    private final k f22930c;

    /* renamed from: d */
    private PreviewView f22931d;

    /* loaded from: classes6.dex */
    public enum a {
        CLEAR,
        CENTER,
        LOOK_LEFT,
        LOOK_RIGHT,
        COMPLETE
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22932a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.CLEAR.ordinal()] = 1;
            iArr[a.CENTER.ordinal()] = 2;
            iArr[a.LOOK_LEFT.ordinal()] = 3;
            iArr[a.LOOK_RIGHT.ordinal()] = 4;
            iArr[a.COMPLETE.ordinal()] = 5;
            f22932a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class c extends u implements h00.a<Drawable> {

        /* renamed from: a */
        final /* synthetic */ Context f22933a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f22933a = context;
        }

        @Override // h00.a
        /* renamed from: a */
        public final Drawable invoke() {
            return androidx.core.content.b.getDrawable(this.f22933a, i.f28401a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class d extends u implements h00.a<Drawable> {

        /* renamed from: a */
        final /* synthetic */ Context f22934a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.f22934a = context;
        }

        @Override // h00.a
        /* renamed from: a */
        public final Drawable invoke() {
            return androidx.core.content.b.getDrawable(this.f22934a, i.f28402b);
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ImageView f22935a;

        e(ImageView imageView) {
            this.f22935a = imageView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f22935a.setImageDrawable(null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ SelfieOverlayView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(SelfieOverlayView selfieOverlayView, a aVar, h00.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar2 = null;
        }
        selfieOverlayView.c(aVar, aVar2);
    }

    private final void e(ImageView imageView, Drawable drawable) {
        if (s.c(imageView.getDrawable(), drawable)) {
            return;
        }
        if (drawable == null) {
            ViewPropertyAnimator animate = imageView.animate();
            animate.alpha(1.0f);
            animate.setDuration(200L);
            animate.setListener(new e(imageView));
            animate.start();
            return;
        }
        imageView.setImageDrawable(drawable);
        imageView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        ViewPropertyAnimator animate2 = imageView.animate();
        animate2.alpha(1.0f);
        animate2.setDuration(200L);
        animate2.start();
    }

    private final Drawable getDrawableLeft() {
        return (Drawable) this.f22929b.getValue();
    }

    private final Drawable getDrawableRight() {
        return (Drawable) this.f22930c.getValue();
    }

    public final void c(a viewState, h00.a<b0> aVar) {
        s.g(viewState, "viewState");
        hw.e eVar = this.f22928a;
        int i11 = b.f22932a[viewState.ordinal()];
        if (i11 == 1) {
            eVar.f29465d.f();
            eVar.f29463b.e();
            eVar.f29466e.c(BitmapDescriptorFactory.HUE_RED, aVar);
            eVar.f29464c.setImageDrawable(null);
        } else if (i11 == 2) {
            eVar.f29465d.f();
            CircleMaskView circleMask = eVar.f29463b;
            s.f(circleMask, "circleMask");
            CircleMaskView.d(circleMask, false, 1, null);
            eVar.f29466e.c(BitmapDescriptorFactory.HUE_RED, aVar);
            eVar.f29464c.setImageDrawable(null);
        } else if (i11 == 3) {
            PreviewBlurView previewBlurView = eVar.f29465d;
            PreviewView previewView = this.f22931d;
            if (previewView == null) {
                s.x("previewView");
                previewView = null;
            }
            previewBlurView.e(previewView);
            CircleMaskView circleMask2 = eVar.f29463b;
            s.f(circleMask2, "circleMask");
            CircleMaskView.d(circleMask2, false, 1, null);
            eVar.f29466e.c(BitmapDescriptorFactory.HUE_RED, aVar);
            ImageView hintImage = eVar.f29464c;
            s.f(hintImage, "hintImage");
            e(hintImage, getDrawableLeft());
        } else if (i11 == 4) {
            PreviewBlurView previewBlurView2 = eVar.f29465d;
            PreviewView previewView2 = this.f22931d;
            if (previewView2 == null) {
                s.x("previewView");
                previewView2 = null;
            }
            previewBlurView2.e(previewView2);
            CircleMaskView circleMask3 = eVar.f29463b;
            s.f(circleMask3, "circleMask");
            CircleMaskView.d(circleMask3, false, 1, null);
            eVar.f29466e.c(50.0f, aVar);
            ImageView hintImage2 = eVar.f29464c;
            s.f(hintImage2, "hintImage");
            e(hintImage2, getDrawableRight());
        } else if (i11 != 5) {
        } else {
            PreviewBlurView previewBlurView3 = eVar.f29465d;
            PreviewView previewView3 = this.f22931d;
            if (previewView3 == null) {
                s.x("previewView");
                previewView3 = null;
            }
            previewBlurView3.e(previewView3);
            CircleMaskView circleMask4 = eVar.f29463b;
            s.f(circleMask4, "circleMask");
            CircleMaskView.d(circleMask4, false, 1, null);
            eVar.f29466e.c(100.0f, aVar);
            ImageView hintImage3 = eVar.f29464c;
            s.f(hintImage3, "hintImage");
            e(hintImage3, null);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setPreviewView(PreviewView previewView) {
        s.g(previewView, "previewView");
        this.f22931d = previewView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        k a11;
        k a12;
        s.g(context, "context");
        hw.e b11 = hw.e.b(LayoutInflater.from(context), this);
        s.f(b11, "inflate(LayoutInflater.from(context), this)");
        this.f22928a = b11;
        a11 = m.a(new c(context));
        this.f22929b = a11;
        a12 = m.a(new d(context));
        this.f22930c = a12;
    }
}