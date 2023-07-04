package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import gk.h;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface c {
    void a();

    void b(h hVar);

    void c();

    h d();

    boolean e();

    void f();

    AnimatorSet g();

    List<Animator.AnimatorListener> h();

    void i(ExtendedFloatingActionButton.f fVar);

    void onAnimationStart(Animator animator);
}