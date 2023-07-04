package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i {
    private static int a(Fragment fragment, boolean z11, boolean z12) {
        if (z12) {
            if (z11) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z11) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(Context context, Fragment fragment, boolean z11, boolean z12) {
        int nextTransition = fragment.getNextTransition();
        int a11 = a(fragment, z11, z12);
        boolean z13 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i11 = g4.b.f27702c;
            if (viewGroup.getTag(i11) != null) {
                fragment.mContainer.setTag(i11, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z11, a11);
            if (onCreateAnimation != null) {
                return new a(onCreateAnimation);
            }
            Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z11, a11);
            if (onCreateAnimator != null) {
                return new a(onCreateAnimator);
            }
            if (a11 == 0 && nextTransition != 0) {
                a11 = d(context, nextTransition, z11);
            }
            if (a11 != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(a11));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, a11);
                        if (loadAnimation != null) {
                            return new a(loadAnimation);
                        }
                        z13 = true;
                    } catch (Resources.NotFoundException e11) {
                        throw e11;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z13) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, a11);
                        if (loadAnimator != null) {
                            return new a(loadAnimator);
                        }
                    } catch (RuntimeException e12) {
                        if (!equals) {
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a11);
                            if (loadAnimation2 != null) {
                                return new a(loadAnimation2);
                            }
                        } else {
                            throw e12;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    private static int c(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i11});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i11, boolean z11) {
        if (i11 == 4097) {
            return z11 ? g4.a.f27698e : g4.a.f27699f;
        } else if (i11 == 8194) {
            return z11 ? g4.a.f27694a : g4.a.f27695b;
        } else if (i11 == 8197) {
            if (z11) {
                return c(context, 16842938);
            }
            return c(context, 16842939);
        } else if (i11 == 4099) {
            return z11 ? g4.a.f27696c : g4.a.f27697d;
        } else if (i11 != 4100) {
            return -1;
        } else {
            if (z11) {
                return c(context, 16842936);
            }
            return c(context, 16842937);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f4884a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f4885b;

        a(Animation animation) {
            this.f4884a = animation;
            this.f4885b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f4884a = null;
            this.f4885b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f4886a;

        /* renamed from: b  reason: collision with root package name */
        private final View f4887b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4888c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4889d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4890e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4890e = true;
            this.f4886a = viewGroup;
            this.f4887b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j11, Transformation transformation) {
            this.f4890e = true;
            if (this.f4888c) {
                return !this.f4889d;
            }
            if (!super.getTransformation(j11, transformation)) {
                this.f4888c = true;
                androidx.core.view.x.a(this.f4886a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f4888c && this.f4890e) {
                this.f4890e = false;
                this.f4886a.post(this);
                return;
            }
            this.f4886a.endViewTransition(this.f4887b);
            this.f4889d = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j11, Transformation transformation, float f11) {
            this.f4890e = true;
            if (this.f4888c) {
                return !this.f4889d;
            }
            if (!super.getTransformation(j11, transformation, f11)) {
                this.f4888c = true;
                androidx.core.view.x.a(this.f4886a, this);
            }
            return true;
        }
    }
}