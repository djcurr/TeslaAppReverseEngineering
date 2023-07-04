package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.y;

/* loaded from: classes.dex */
class g0 {

    /* loaded from: classes.dex */
    private static class a extends AnimatorListenerAdapter implements y.g {

        /* renamed from: a  reason: collision with root package name */
        private final View f6140a;

        /* renamed from: b  reason: collision with root package name */
        private final View f6141b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6142c;

        /* renamed from: d  reason: collision with root package name */
        private final int f6143d;

        /* renamed from: e  reason: collision with root package name */
        private int[] f6144e;

        /* renamed from: f  reason: collision with root package name */
        private float f6145f;

        /* renamed from: g  reason: collision with root package name */
        private float f6146g;

        /* renamed from: h  reason: collision with root package name */
        private final float f6147h;

        /* renamed from: i  reason: collision with root package name */
        private final float f6148i;

        a(View view, View view2, int i11, int i12, float f11, float f12) {
            this.f6141b = view;
            this.f6140a = view2;
            this.f6142c = i11 - Math.round(view.getTranslationX());
            this.f6143d = i12 - Math.round(view.getTranslationY());
            this.f6147h = f11;
            this.f6148i = f12;
            int i13 = s.f6214h;
            int[] iArr = (int[]) view2.getTag(i13);
            this.f6144e = iArr;
            if (iArr != null) {
                view2.setTag(i13, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f6144e == null) {
                this.f6144e = new int[2];
            }
            this.f6144e[0] = Math.round(this.f6142c + this.f6141b.getTranslationX());
            this.f6144e[1] = Math.round(this.f6143d + this.f6141b.getTranslationY());
            this.f6140a.setTag(s.f6214h, this.f6144e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f6145f = this.f6141b.getTranslationX();
            this.f6146g = this.f6141b.getTranslationY();
            this.f6141b.setTranslationX(this.f6147h);
            this.f6141b.setTranslationY(this.f6148i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f6141b.setTranslationX(this.f6145f);
            this.f6141b.setTranslationY(this.f6146g);
        }

        @Override // androidx.transition.y.g
        public void onTransitionCancel(y yVar) {
        }

        @Override // androidx.transition.y.g
        public void onTransitionEnd(y yVar) {
            this.f6141b.setTranslationX(this.f6147h);
            this.f6141b.setTranslationY(this.f6148i);
            yVar.removeListener(this);
        }

        @Override // androidx.transition.y.g
        public void onTransitionPause(y yVar) {
        }

        @Override // androidx.transition.y.g
        public void onTransitionResume(y yVar) {
        }

        @Override // androidx.transition.y.g
        public void onTransitionStart(y yVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Animator a(View view, e0 e0Var, int i11, int i12, float f11, float f12, float f13, float f14, TimeInterpolator timeInterpolator, y yVar) {
        float f15;
        float f16;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) e0Var.f6130b.getTag(s.f6214h);
        if (iArr != null) {
            f15 = (iArr[0] - i11) + translationX;
            f16 = (iArr[1] - i12) + translationY;
        } else {
            f15 = f11;
            f16 = f12;
        }
        int round = i11 + Math.round(f15 - translationX);
        int round2 = i12 + Math.round(f16 - translationY);
        view.setTranslationX(f15);
        view.setTranslationY(f16);
        if (f15 == f13 && f16 == f14) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f15, f13), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f16, f14));
        a aVar = new a(view, e0Var.f6130b, round, round2, translationX, translationY);
        yVar.addListener(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        androidx.transition.a.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}