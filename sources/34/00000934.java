package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.a;
import androidx.transition.y;

/* loaded from: classes.dex */
public abstract class w0 extends y {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f6239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f6240b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6241c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f6239a = viewGroup;
            this.f6240b = view;
            this.f6241c = view2;
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionEnd(y yVar) {
            this.f6241c.setTag(s.f6211e, null);
            k0.b(this.f6239a).d(this.f6240b);
            yVar.removeListener(this);
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionPause(y yVar) {
            k0.b(this.f6239a).d(this.f6240b);
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionResume(y yVar) {
            if (this.f6240b.getParent() == null) {
                k0.b(this.f6239a).c(this.f6240b);
            } else {
                w0.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements y.g, a.InterfaceC0105a {

        /* renamed from: a  reason: collision with root package name */
        private final View f6243a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6244b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f6245c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f6246d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f6247e;

        /* renamed from: f  reason: collision with root package name */
        boolean f6248f = false;

        b(View view, int i11, boolean z11) {
            this.f6243a = view;
            this.f6244b = i11;
            this.f6245c = (ViewGroup) view.getParent();
            this.f6246d = z11;
            b(true);
        }

        private void a() {
            if (!this.f6248f) {
                p0.i(this.f6243a, this.f6244b);
                ViewGroup viewGroup = this.f6245c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        private void b(boolean z11) {
            ViewGroup viewGroup;
            if (!this.f6246d || this.f6247e == z11 || (viewGroup = this.f6245c) == null) {
                return;
            }
            this.f6247e = z11;
            k0.d(viewGroup, z11);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6248f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0105a
        public void onAnimationPause(Animator animator) {
            if (this.f6248f) {
                return;
            }
            p0.i(this.f6243a, this.f6244b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0105a
        public void onAnimationResume(Animator animator) {
            if (this.f6248f) {
                return;
            }
            p0.i(this.f6243a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.y.g
        public void onTransitionCancel(y yVar) {
        }

        @Override // androidx.transition.y.g
        public void onTransitionEnd(y yVar) {
            a();
            yVar.removeListener(this);
        }

        @Override // androidx.transition.y.g
        public void onTransitionPause(y yVar) {
            b(false);
        }

        @Override // androidx.transition.y.g
        public void onTransitionResume(y yVar) {
            b(true);
        }

        @Override // androidx.transition.y.g
        public void onTransitionStart(y yVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f6249a;

        /* renamed from: b  reason: collision with root package name */
        boolean f6250b;

        /* renamed from: c  reason: collision with root package name */
        int f6251c;

        /* renamed from: d  reason: collision with root package name */
        int f6252d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f6253e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f6254f;

        c() {
        }
    }

    public w0() {
        this.mMode = 3;
    }

    private void captureValues(e0 e0Var) {
        e0Var.f6129a.put(PROPNAME_VISIBILITY, Integer.valueOf(e0Var.f6130b.getVisibility()));
        e0Var.f6129a.put(PROPNAME_PARENT, e0Var.f6130b.getParent());
        int[] iArr = new int[2];
        e0Var.f6130b.getLocationOnScreen(iArr);
        e0Var.f6129a.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    private c getVisibilityChangeInfo(e0 e0Var, e0 e0Var2) {
        c cVar = new c();
        cVar.f6249a = false;
        cVar.f6250b = false;
        if (e0Var != null && e0Var.f6129a.containsKey(PROPNAME_VISIBILITY)) {
            cVar.f6251c = ((Integer) e0Var.f6129a.get(PROPNAME_VISIBILITY)).intValue();
            cVar.f6253e = (ViewGroup) e0Var.f6129a.get(PROPNAME_PARENT);
        } else {
            cVar.f6251c = -1;
            cVar.f6253e = null;
        }
        if (e0Var2 != null && e0Var2.f6129a.containsKey(PROPNAME_VISIBILITY)) {
            cVar.f6252d = ((Integer) e0Var2.f6129a.get(PROPNAME_VISIBILITY)).intValue();
            cVar.f6254f = (ViewGroup) e0Var2.f6129a.get(PROPNAME_PARENT);
        } else {
            cVar.f6252d = -1;
            cVar.f6254f = null;
        }
        if (e0Var != null && e0Var2 != null) {
            int i11 = cVar.f6251c;
            int i12 = cVar.f6252d;
            if (i11 == i12 && cVar.f6253e == cVar.f6254f) {
                return cVar;
            }
            if (i11 != i12) {
                if (i11 == 0) {
                    cVar.f6250b = false;
                    cVar.f6249a = true;
                } else if (i12 == 0) {
                    cVar.f6250b = true;
                    cVar.f6249a = true;
                }
            } else if (cVar.f6254f == null) {
                cVar.f6250b = false;
                cVar.f6249a = true;
            } else if (cVar.f6253e == null) {
                cVar.f6250b = true;
                cVar.f6249a = true;
            }
        } else if (e0Var == null && cVar.f6252d == 0) {
            cVar.f6250b = true;
            cVar.f6249a = true;
        } else if (e0Var2 == null && cVar.f6251c == 0) {
            cVar.f6250b = false;
            cVar.f6249a = true;
        }
        return cVar;
    }

    @Override // androidx.transition.y
    public void captureEndValues(e0 e0Var) {
        captureValues(e0Var);
    }

    @Override // androidx.transition.y
    public void captureStartValues(e0 e0Var) {
        captureValues(e0Var);
    }

    @Override // androidx.transition.y
    public Animator createAnimator(ViewGroup viewGroup, e0 e0Var, e0 e0Var2) {
        c visibilityChangeInfo = getVisibilityChangeInfo(e0Var, e0Var2);
        if (visibilityChangeInfo.f6249a) {
            if (visibilityChangeInfo.f6253e == null && visibilityChangeInfo.f6254f == null) {
                return null;
            }
            if (visibilityChangeInfo.f6250b) {
                return onAppear(viewGroup, e0Var, visibilityChangeInfo.f6251c, e0Var2, visibilityChangeInfo.f6252d);
            }
            return onDisappear(viewGroup, e0Var, visibilityChangeInfo.f6251c, e0Var2, visibilityChangeInfo.f6252d);
        }
        return null;
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.y
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.y
    public boolean isTransitionRequired(e0 e0Var, e0 e0Var2) {
        if (e0Var == null && e0Var2 == null) {
            return false;
        }
        if (e0Var == null || e0Var2 == null || e0Var2.f6129a.containsKey(PROPNAME_VISIBILITY) == e0Var.f6129a.containsKey(PROPNAME_VISIBILITY)) {
            c visibilityChangeInfo = getVisibilityChangeInfo(e0Var, e0Var2);
            if (visibilityChangeInfo.f6249a) {
                return visibilityChangeInfo.f6251c == 0 || visibilityChangeInfo.f6252d == 0;
            }
            return false;
        }
        return false;
    }

    public boolean isVisible(e0 e0Var) {
        if (e0Var == null) {
            return false;
        }
        return ((Integer) e0Var.f6129a.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) e0Var.f6129a.get(PROPNAME_PARENT)) != null;
    }

    public abstract Animator onAppear(ViewGroup viewGroup, View view, e0 e0Var, e0 e0Var2);

    public Animator onAppear(ViewGroup viewGroup, e0 e0Var, int i11, e0 e0Var2, int i12) {
        if ((this.mMode & 1) != 1 || e0Var2 == null) {
            return null;
        }
        if (e0Var == null) {
            View view = (View) e0Var2.f6130b.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f6249a) {
                return null;
            }
        }
        return onAppear(viewGroup, e0Var2.f6130b, e0Var, e0Var2);
    }

    public abstract Animator onDisappear(ViewGroup viewGroup, View view, e0 e0Var, e0 e0Var2);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r17.mCanRemoveViews != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r18, androidx.transition.e0 r19, int r20, androidx.transition.e0 r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.w0.onDisappear(android.view.ViewGroup, androidx.transition.e0, int, androidx.transition.e0, int):android.animation.Animator");
    }

    public void setMode(int i11) {
        if ((i11 & (-4)) == 0) {
            this.mMode = i11;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public w0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.f6256b);
        int g11 = l3.i.g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (g11 != 0) {
            setMode(g11);
        }
    }
}