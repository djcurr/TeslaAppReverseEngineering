package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f15431a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f15432b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f15433c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f15434d = new a();

    /* loaded from: classes3.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            if (fVar.f15433c == animator) {
                fVar.f15433c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f15436a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f15437b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f15436a = iArr;
            this.f15437b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f15433c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15433c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f15437b;
        this.f15433c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f15434d);
        this.f15431a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f15433c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f15433c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f15431a.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f15431a.get(i11);
            if (StateSet.stateSetMatches(bVar.f15436a, iArr)) {
                break;
            }
            i11++;
        }
        b bVar2 = this.f15432b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f15432b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}