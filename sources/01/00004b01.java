package com.squareup.workflow1.ui.backstack;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.savedstate.c;
import androidx.transition.c0;
import androidx.transition.w;
import ch.qos.logback.core.CoreConstants;
import h00.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.p;
import pr.a0;
import pr.d;
import pr.l;
import pr.s;
import pr.u;
import pr.x;
import qr.b;
import rr.e;
import rr.h;
import vz.b0;
import vz.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B1\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer;", "Landroid/widget/FrameLayout;", "", "getStateRegistryKey", "Landroid/view/View;", "getCurrentView", "()Landroid/view/View;", "currentView", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "d", "a", "wf1-container-android"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class BackStackContainer extends FrameLayout {

    /* renamed from: d */
    public static final a f20868d = new a(null);

    /* renamed from: a */
    private final h f20869a;

    /* renamed from: b */
    private rr.b<l<?>> f20870b;

    /* renamed from: c */
    private String f20871c;

    /* loaded from: classes2.dex */
    public static final class a implements u<rr.b<?>> {

        /* renamed from: a */
        private final /* synthetic */ d<rr.b<?>> f20872a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a$a */
        /* loaded from: classes2.dex */
        public static final class C0367a extends kotlin.jvm.internal.u implements r<rr.b<?>, s, Context, ViewGroup, View> {

            /* renamed from: a */
            public static final C0367a f20873a = new C0367a();

            /* renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a$a$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C0368a extends p implements h00.p<rr.b<?>, s, b0> {
                C0368a(BackStackContainer backStackContainer) {
                    super(2, backStackContainer, BackStackContainer.class, "update", "update(Lcom/squareup/workflow1/ui/backstack/BackStackScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void d(rr.b<?> p02, s p12) {
                    kotlin.jvm.internal.s.g(p02, "p0");
                    kotlin.jvm.internal.s.g(p12, "p1");
                    ((BackStackContainer) this.receiver).c(p02, p12);
                }

                @Override // h00.p
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ b0 mo160invoke(rr.b<?> bVar, s sVar) {
                    d(bVar, sVar);
                    return b0.f54756a;
                }
            }

            C0367a() {
                super(4);
            }

            @Override // h00.r
            /* renamed from: a */
            public final View invoke(rr.b<?> initialRendering, s initialEnv, Context context, ViewGroup viewGroup) {
                kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
                kotlin.jvm.internal.s.g(initialEnv, "initialEnv");
                kotlin.jvm.internal.s.g(context, "context");
                BackStackContainer backStackContainer = new BackStackContainer(context, null, 0, 0, 14, null);
                backStackContainer.setId(sr.a.f50520b);
                backStackContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                x.a(backStackContainer, initialRendering, initialEnv, new C0368a(backStackContainer));
                return backStackContainer;
            }
        }

        private a() {
            this.f20872a = new d<>(m0.b(rr.b.class), C0367a.f20873a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(rr.b<?> initialRendering, s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f20872a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super rr.b<?>> getType() {
            return this.f20872a.getType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<Object, l<?>> {

        /* renamed from: a */
        public static final b f20874a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final l<?> mo12invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return new l<>(it2, "backstack");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ BackStackContainer(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public static /* synthetic */ void a(View view, h00.a aVar) {
        d(view, aVar);
    }

    public static final void d(View view, h00.a doStart) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(doStart, "doStart");
        b.a.e(qr.b.f48435i1, view, null, 2, null);
        doStart.mo11invoke();
    }

    private final void e(s sVar) {
        String p11 = getId() == -1 ? "" : kotlin.jvm.internal.s.p("-", Integer.valueOf(getId()));
        String str = e.a(sVar) + ((Object) BackStackContainer.class.getName()) + p11;
        String str2 = this.f20871c;
        if (str2 != null && !kotlin.jvm.internal.s.c(str2, str)) {
            Log.wtf("workflow1", "BackStackContainer state registry key changed – view state may be lost: from " + ((Object) this.f20871c) + " to " + str);
        }
        this.f20871c = str;
    }

    private final View getCurrentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    private final String getStateRegistryKey() {
        String p11;
        a0<?> d11 = pr.b0.d(this);
        Object c11 = d11 == null ? null : d11.c();
        if (c11 == null) {
            c11 = null;
        }
        l lVar = c11 instanceof l ? (l) c11 : null;
        String a11 = lVar != null ? lVar.a() : null;
        if (a11 == null || (p11 = kotlin.jvm.internal.s.p("-", a11)) == null) {
            p11 = "";
        }
        return BackStackContainer.class.getName() + p11 + (getId() != -1 ? kotlin.jvm.internal.s.p("-", Integer.valueOf(getId())) : "");
    }

    protected void b(View view, View newView, boolean z11) {
        vz.p a11;
        kotlin.jvm.internal.s.g(newView, "newView");
        if (view == null) {
            addView(newView);
            return;
        }
        int i11 = sr.a.f50519a;
        View findViewById = view.findViewById(i11);
        View findViewById2 = newView.findViewById(i11);
        if (findViewById == null || findViewById2 == null) {
            findViewById2 = newView;
        } else {
            view = findViewById;
        }
        if (!z11) {
            a11 = v.a(8388611, 8388613);
        } else if (z11) {
            a11 = v.a(8388613, 8388611);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        c0 interpolator = new c0().f(new w(((Number) a11.a()).intValue()).addTarget(view)).f(new w(((Number) a11.b()).intValue()).addTarget(findViewById2)).setInterpolator(new AccelerateDecelerateInterpolator());
        kotlin.jvm.internal.s.f(interpolator, "TransitionSet()\n          .addTransition(Slide(outEdge).addTarget(oldTarget))\n          .addTransition(Slide(inEdge).addTarget(newTarget))\n          .setInterpolator(AccelerateDecelerateInterpolator())");
        androidx.transition.a0.d(new androidx.transition.u(this, newView), interpolator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x009d, code lost:
        if (r1 == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void c(rr.b<?> r8, pr.s r9) {
        /*
            r7 = this;
            java.lang.String r0 = "newRendering"
            kotlin.jvm.internal.s.g(r8, r0)
            java.lang.String r0 = "newViewEnvironment"
            kotlin.jvm.internal.s.g(r9, r0)
            r7.e(r9)
            java.util.List r0 = r8.a()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            com.squareup.workflow1.ui.backstack.a r0 = com.squareup.workflow1.ui.backstack.a.First
            goto L1c
        L1a:
            com.squareup.workflow1.ui.backstack.a r0 = com.squareup.workflow1.ui.backstack.a.Other
        L1c:
            com.squareup.workflow1.ui.backstack.a$a r1 = com.squareup.workflow1.ui.backstack.a.Companion
            vz.p r0 = vz.v.a(r1, r0)
            pr.s r3 = r9.c(r0)
            com.squareup.workflow1.ui.backstack.BackStackContainer$b r9 = com.squareup.workflow1.ui.backstack.BackStackContainer.b.f20874a
            rr.b r8 = r8.d(r9)
            android.view.View r9 = r7.getCurrentView()
            if (r9 != 0) goto L33
            goto L42
        L33:
            java.lang.Object r0 = r8.c()
            boolean r0 = pr.x.b(r9, r0)
            if (r0 == 0) goto L3f
            r0 = r9
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 != 0) goto Lb4
        L42:
            pr.v$a r0 = pr.v.f46897a
            java.lang.Object r0 = r3.a(r0)
            r1 = r0
            pr.v r1 = (pr.v) r1
            java.lang.Object r2 = r8.c()
            android.content.Context r4 = r7.getContext()
            java.lang.String r0 = "this.context"
            kotlin.jvm.internal.s.f(r4, r0)
            rr.a r6 = new pr.y() { // from class: rr.a
                static {
                    /*
                        rr.a r0 = new rr.a
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:rr.a) rr.a.a rr.a
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: rr.a.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: rr.a.<init>():void");
                }

                @Override // pr.y
                public final void a(android.view.View r1, h00.a r2) {
                    /*
                        r0 = this;
                        com.squareup.workflow1.ui.backstack.BackStackContainer.a(r1, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: rr.a.a(android.view.View, h00.a):void");
                }
            }
            r5 = r7
            android.view.View r0 = pr.w.c(r1, r2, r3, r4, r5, r6)
            pr.x.h(r0)
            rr.h r1 = r7.f20869a
            java.util.List r2 = r8.a()
            r1.h(r2, r9, r0)
            rr.b<pr.l<?>> r1 = r7.f20870b
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L73
        L71:
            r2 = r3
            goto L9f
        L73:
            java.util.List r1 = r1.a()
            if (r1 != 0) goto L7a
            goto L71
        L7a:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L82
        L80:
            r1 = r3
            goto L9d
        L82:
            java.util.Iterator r1 = r1.iterator()
        L86:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L80
            java.lang.Object r4 = r1.next()
            pr.l r4 = (pr.l) r4
            java.lang.Object r5 = r8.c()
            boolean r4 = pr.f.a(r4, r5)
            if (r4 == 0) goto L86
            r1 = r2
        L9d:
            if (r1 != r2) goto L71
        L9f:
            r7.b(r9, r0, r2)
            if (r9 != 0) goto La5
            goto Lb1
        La5:
            qr.b$a r0 = qr.b.f48435i1
            qr.b r9 = r0.c(r9)
            if (r9 != 0) goto Lae
            goto Lb1
        Lae:
            r9.j()
        Lb1:
            r7.f20870b = r8
            return
        Lb4:
            rr.h r9 = r7.f20869a
            java.util.List r1 = r8.b()
            r9.e(r1)
            java.lang.Object r8 = r8.c()
            pr.x.g(r0, r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.workflow1.ui.backstack.BackStackContainer.c(rr.b, pr.s):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        c c11 = qr.a.f48434a.c(this);
        kotlin.jvm.internal.s.e(c11);
        String str = this.f20871c;
        if (str != null) {
            this.f20869a.b(str, c11);
            return;
        }
        throw new IllegalStateException(kotlin.jvm.internal.s.p("Expected stateRegistryKey to have been set – the view seems to be getting attached before its first update: ", this).toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f20869a.c();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        kotlin.jvm.internal.s.g(state, "state");
        b0 b0Var = null;
        h.b bVar = state instanceof h.b ? (h.b) state : null;
        if (bVar != null) {
            this.f20869a.g(bVar.a());
            super.onRestoreInstanceState(((h.b) state).getSuperState());
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new h.b(super.onSaveInstanceState(), this.f20869a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        kotlin.jvm.internal.s.g(context, "context");
        this.f20869a = new h();
    }
}