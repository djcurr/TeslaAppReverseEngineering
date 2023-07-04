package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import fk.f;
import gk.h;
import gk.i;
import gk.j;
import ik.d;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f15813c;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f15814d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f15815e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f15816f;

    /* renamed from: g  reason: collision with root package name */
    private float f15817g;

    /* renamed from: h  reason: collision with root package name */
    private float f15818h;

    /* loaded from: classes3.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f15819a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f15820b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f15821c;

        a(FabTransformationBehavior fabTransformationBehavior, boolean z11, View view, View view2) {
            this.f15819a = z11;
            this.f15820b = view;
            this.f15821c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f15819a) {
                return;
            }
            this.f15820b.setVisibility(4);
            this.f15821c.setAlpha(1.0f);
            this.f15821c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f15819a) {
                this.f15820b.setVisibility(0);
                this.f15821c.setAlpha(BitmapDescriptorFactory.HUE_RED);
                this.f15821c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f15822a;

        b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f15822a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f15822a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ik.d f15823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f15824b;

        c(FabTransformationBehavior fabTransformationBehavior, ik.d dVar, Drawable drawable) {
            this.f15823a = dVar;
            this.f15824b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f15823a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f15823a.setCircularRevealOverlayDrawable(this.f15824b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ik.d f15825a;

        d(FabTransformationBehavior fabTransformationBehavior, ik.d dVar) {
            this.f15825a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f15825a.getRevealInfo();
            revealInfo.f30454c = Float.MAX_VALUE;
            this.f15825a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public h f15826a;

        /* renamed from: b  reason: collision with root package name */
        public j f15827b;
    }

    public FabTransformationBehavior() {
        this.f15813c = new Rect();
        this.f15814d = new RectF();
        this.f15815e = new RectF();
        this.f15816f = new int[2];
    }

    private ViewGroup K(View view) {
        View findViewById = view.findViewById(f.C);
        if (findViewById != null) {
            return f0(findViewById);
        }
        if (!(view instanceof zk.b) && !(view instanceof zk.a)) {
            return f0(view);
        }
        return f0(((ViewGroup) view).getChildAt(0));
    }

    private void L(View view, e eVar, i iVar, i iVar2, float f11, float f12, float f13, float f14, RectF rectF) {
        float S = S(eVar, iVar, f11, f13);
        float S2 = S(eVar, iVar2, f12, f14);
        Rect rect = this.f15813c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f15814d;
        rectF2.set(rect);
        RectF rectF3 = this.f15815e;
        T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.f15817g, this.f15818h);
    }

    private Pair<i, i> N(float f11, float f12, boolean z11, e eVar) {
        i e11;
        i e12;
        int i11;
        if (f11 == BitmapDescriptorFactory.HUE_RED || f12 == BitmapDescriptorFactory.HUE_RED) {
            e11 = eVar.f15826a.e("translationXLinear");
            e12 = eVar.f15826a.e("translationYLinear");
        } else if ((z11 && f12 < BitmapDescriptorFactory.HUE_RED) || (!z11 && i11 > 0)) {
            e11 = eVar.f15826a.e("translationXCurveUpwards");
            e12 = eVar.f15826a.e("translationYCurveUpwards");
        } else {
            e11 = eVar.f15826a.e("translationXCurveDownwards");
            e12 = eVar.f15826a.e("translationYCurveDownwards");
        }
        return new Pair<>(e11, e12);
    }

    private float O(View view, View view2, j jVar) {
        RectF rectF = this.f15814d;
        RectF rectF2 = this.f15815e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, jVar), BitmapDescriptorFactory.HUE_RED);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, j jVar) {
        RectF rectF = this.f15814d;
        RectF rectF2 = this.f15815e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(BitmapDescriptorFactory.HUE_RED, -R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, j jVar) {
        float centerX;
        float centerX2;
        float f11;
        RectF rectF = this.f15814d;
        RectF rectF2 = this.f15815e;
        M(view, rectF);
        T(view2, rectF2);
        int i11 = jVar.f28013a & 7;
        if (i11 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i11 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i11 == 5) {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
            return f11 + jVar.f28014b;
        }
        f11 = centerX - centerX2;
        return f11 + jVar.f28014b;
    }

    private float R(View view, View view2, j jVar) {
        float centerY;
        float centerY2;
        float f11;
        RectF rectF = this.f15814d;
        RectF rectF2 = this.f15815e;
        M(view, rectF);
        T(view2, rectF2);
        int i11 = jVar.f28013a & 112;
        if (i11 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i11 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i11 == 80) {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
            return f11 + jVar.f28015c;
        }
        f11 = centerY - centerY2;
        return f11 + jVar.f28015c;
    }

    private float S(e eVar, i iVar, float f11, float f12) {
        long c11 = iVar.c();
        long d11 = iVar.d();
        i e11 = eVar.f15826a.e("expansion");
        return gk.a.a(f11, f12, iVar.e().getInterpolation(((float) (((e11.c() + e11.d()) + 17) - c11)) / ((float) d11)));
    }

    private void T(View view, RectF rectF) {
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        int[] iArr = this.f15816f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void U(View view, View view2, boolean z11, boolean z12, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof ik.d) && ik.c.f30447a == 0) || (K = K(view2)) == null) {
                return;
            }
            if (z11) {
                if (!z12) {
                    gk.d.f27999a.set(K, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
                }
                ofFloat = ObjectAnimator.ofFloat(K, gk.d.f27999a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(K, gk.d.f27999a, BitmapDescriptorFactory.HUE_RED);
            }
            eVar.f15826a.e("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    private void V(View view, View view2, boolean z11, boolean z12, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof ik.d) {
            ik.d dVar = (ik.d) view2;
            int d02 = d0(view);
            int i11 = 16777215 & d02;
            if (z11) {
                if (!z12) {
                    dVar.setCircularRevealScrimColor(d02);
                }
                ofInt = ObjectAnimator.ofInt(dVar, d.C0582d.f30451a, i11);
            } else {
                ofInt = ObjectAnimator.ofInt(dVar, d.C0582d.f30451a, d02);
            }
            ofInt.setEvaluator(gk.c.b());
            eVar.f15826a.e("color").a(ofInt);
            list.add(ofInt);
        }
    }

    private void W(View view, View view2, boolean z11, e eVar, List<Animator> list) {
        float Q = Q(view, view2, eVar.f15827b);
        float R = R(view, view2, eVar.f15827b);
        Pair<i, i> N = N(Q, R, z11, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z11) {
            Q = this.f15817g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z11) {
            R = this.f15818h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private void X(View view, View view2, boolean z11, boolean z12, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float z13 = a0.z(view2) - a0.z(view);
        if (z11) {
            if (!z12) {
                view2.setTranslationZ(-z13);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, BitmapDescriptorFactory.HUE_RED);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -z13);
        }
        eVar.f15826a.e("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    private void Y(View view, View view2, boolean z11, boolean z12, e eVar, float f11, float f12, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof ik.d) {
            ik.d dVar = (ik.d) view2;
            float O = O(view, view2, eVar.f15827b);
            float P = P(view, view2, eVar.f15827b);
            ((FloatingActionButton) view).i(this.f15813c);
            float width = this.f15813c.width() / 2.0f;
            i e11 = eVar.f15826a.e("expansion");
            if (z11) {
                if (!z12) {
                    dVar.setRevealInfo(new d.e(O, P, width));
                }
                if (z12) {
                    width = dVar.getRevealInfo().f30454c;
                }
                animator = ik.a.a(dVar, O, P, pk.a.b(O, P, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f11, f12));
                animator.addListener(new d(this, dVar));
                b0(view2, e11.c(), (int) O, (int) P, width, list);
            } else {
                float f13 = dVar.getRevealInfo().f30454c;
                Animator a11 = ik.a.a(dVar, O, P, width);
                int i11 = (int) O;
                int i12 = (int) P;
                b0(view2, e11.c(), i11, i12, f13, list);
                a0(view2, e11.c(), e11.d(), eVar.f15826a.f(), i11, i12, width, list);
                animator = a11;
            }
            e11.a(animator);
            list.add(animator);
            list2.add(ik.a.b(dVar));
        }
    }

    private void Z(View view, View view2, boolean z11, boolean z12, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof ik.d) && (view instanceof ImageView)) {
            ik.d dVar = (ik.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z11) {
                if (!z12) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, gk.e.f28000b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, gk.e.f28000b, 255);
            }
            ofInt.addUpdateListener(new b(this, view2));
            eVar.f15826a.e("iconFade").a(ofInt);
            list.add(ofInt);
            list2.add(new c(this, dVar, drawable));
        }
    }

    private void a0(View view, long j11, long j12, long j13, int i11, int i12, float f11, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j14 = j11 + j12;
            if (j14 < j13) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i11, i12, f11, f11);
                createCircularReveal.setStartDelay(j14);
                createCircularReveal.setDuration(j13 - j14);
                list.add(createCircularReveal);
            }
        }
    }

    private void b0(View view, long j11, int i11, int i12, float f11, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j11 <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i11, i12, f11, f11);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j11);
        list.add(createCircularReveal);
    }

    private void c0(View view, View view2, boolean z11, boolean z12, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float Q = Q(view, view2, eVar.f15827b);
        float R = R(view, view2, eVar.f15827b);
        Pair<i, i> N = N(Q, R, z11, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        if (z11) {
            if (!z12) {
                view2.setTranslationX(-Q);
                view2.setTranslationY(-R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, BitmapDescriptorFactory.HUE_RED);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, BitmapDescriptorFactory.HUE_RED);
            L(view2, eVar, iVar, iVar2, -Q, -R, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -R);
        }
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private int d0(View view) {
        ColorStateList v11 = a0.v(view);
        if (v11 != null) {
            return v11.getColorForState(view.getDrawableState(), v11.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet J(View view, View view2, boolean z11, boolean z12) {
        e e02 = e0(view2.getContext(), z11);
        if (z11) {
            this.f15817g = view.getTranslationX();
            this.f15818h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            X(view, view2, z11, z12, e02, arrayList, arrayList2);
        }
        RectF rectF = this.f15814d;
        c0(view, view2, z11, z12, e02, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        W(view, view2, z11, e02, arrayList);
        Z(view, view2, z11, z12, e02, arrayList, arrayList2);
        Y(view, view2, z11, z12, e02, width, height, arrayList, arrayList2);
        V(view, view2, z11, z12, e02, arrayList, arrayList2);
        U(view, view2, z11, z12, e02, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        gk.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z11, view2, view));
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            animatorSet.addListener(arrayList2.get(i11));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    protected abstract e e0(Context context, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f4238h == 0) {
            fVar.f4238h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15813c = new Rect();
        this.f15814d = new RectF();
        this.f15815e = new RectF();
        this.f15816f = new int[2];
    }
}