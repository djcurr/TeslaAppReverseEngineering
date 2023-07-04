package com.adyen.threeds2.internal.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.h;
import atd.d.n;
import atd.d.o;
import atd.d.q;
import atd.q0.e;
import atd.q0.f;
import atd.q0.g;
import com.adyen.threeds2.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f9690e;

    /* renamed from: a  reason: collision with root package name */
    private final h f9691a;

    /* renamed from: b  reason: collision with root package name */
    private final atd.p0.a f9692b;

    /* renamed from: d  reason: collision with root package name */
    private final c f9694d = c.a();

    /* renamed from: c  reason: collision with root package name */
    private final Queue<AnimatorSet> f9693c = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adyen.threeds2.internal.ui.activity.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0186a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f9695a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f9696b;

        C0186a(View view, View view2) {
            this.f9695a = view;
            this.f9696b = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            animator.removeAllListeners();
            a.this.b(this.f9695a);
            a.this.h();
            if (!a.this.f9693c.isEmpty() || (this.f9696b instanceof atd.q0.c)) {
                return;
            }
            a.this.f9692b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9698a;

        static {
            int[] iArr = new int[atd.e.b.values().length];
            f9698a = iArr;
            try {
                iArr[atd.e.b.SINGLE_TEXT_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9698a[atd.e.b.SINGLE_SELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9698a[atd.e.b.MULTI_SELECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9698a[atd.e.b.OUT_OF_BAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9698a[atd.e.b.HTML_UI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        atd.s0.a.a(-841979757652544L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(h hVar, atd.p0.a aVar) {
        this.f9691a = hVar;
        this.f9692b = aVar;
    }

    private ViewGroup d() {
        return (ViewGroup) this.f9691a.findViewById(16908290);
    }

    private View e() {
        ViewGroup d11 = d();
        int childCount = d11.getChildCount();
        return d11.getChildAt(childCount > 0 ? childCount - 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g() {
        return f9690e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        AnimatorSet peek;
        this.f9693c.poll();
        if (this.f9693c.isEmpty() || (peek = this.f9693c.peek()) == null) {
            return;
        }
        peek.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            a(false);
            if (this.f9694d.isAdded()) {
                this.f9694d.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        if (g()) {
            return;
        }
        a(true);
        if (this.f9694d.isAdded()) {
            return;
        }
        this.f9694d.show(this.f9691a.getSupportFragmentManager(), atd.s0.a.a(-842190211050048L));
    }

    private void c(View view) {
        View e11 = e();
        if (e11 == null) {
            this.f9691a.setContentView(view);
            if (view instanceof atd.q0.c) {
                return;
            }
            this.f9692b.c();
        } else if (e11.equals(view)) {
        } else {
            a(e11, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(atd.d.a aVar) {
        f();
        int i11 = b.f9698a[aVar.a().ordinal()];
        if (i11 == 1) {
            g gVar = new g(this.f9691a);
            c(gVar);
            gVar.a((g) ((q) aVar));
        } else if (i11 == 2 || i11 == 3) {
            f fVar = new f(this.f9691a);
            c(fVar);
            fVar.a((f) ((o) aVar));
        } else if (i11 == 4) {
            e eVar = new e(this.f9691a);
            c(eVar);
            eVar.a((e) ((n) aVar));
        } else if (i11 == 5) {
            atd.q0.b bVar = new atd.q0.b(this.f9691a);
            c(bVar);
            bVar.a((atd.d.f) aVar);
        } else {
            throw atd.y.c.CHALLENGE_PRESENTATION_FAILURE.a();
        }
    }

    private static void a(boolean z11) {
        f9690e = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(atd.d.a aVar) {
        atd.q0.a c11 = c();
        if (c11 == null || (c11 instanceof atd.q0.c)) {
            return;
        }
        int i11 = b.f9698a[aVar.a().ordinal()];
        if (i11 == 4) {
            ((e) c11).b2((n) aVar);
        } else if (i11 != 5) {
        } else {
            ((atd.q0.b) c11).b((atd.d.f) aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public atd.q0.a c() {
        View b11 = b();
        if (b11 instanceof atd.q0.a) {
            return (atd.q0.a) b11;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        while (!this.f9693c.isEmpty()) {
            AnimatorSet poll = this.f9693c.poll();
            if (poll != null) {
                poll.cancel();
                poll.removeAllListeners();
            }
        }
    }

    private void a(View view, View view2) {
        int i11 = R.id.scrollView_content;
        View findViewById = view.findViewById(i11);
        View findViewById2 = view2.findViewById(i11);
        findViewById2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        a(view2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, View.ALPHA, 1.0f, BitmapDescriptorFactory.HUE_RED);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById2, View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new C0186a(view, view2));
        a(animatorSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) {
        d().removeView(view);
    }

    private View b() {
        return d().getChildAt(0);
    }

    private void a(View view) {
        ViewGroup d11 = d();
        if (view instanceof atd.q0.c) {
            d11.addView(view, d11.getChildCount());
        } else {
            d11.addView(view, 0);
        }
    }

    private void a(AnimatorSet animatorSet) {
        if (this.f9693c.isEmpty()) {
            this.f9693c.add(animatorSet);
            animatorSet.start();
            return;
        }
        this.f9693c.add(animatorSet);
    }
}