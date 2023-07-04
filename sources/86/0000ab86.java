package pr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.workflow1.ui.ViewFactory;
import java.util.Arrays;
import kotlin.jvm.internal.m0;

/* loaded from: classes2.dex */
public final class w {

    /* loaded from: classes2.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<View, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f46899a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<View, vz.b0> f46900b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: pr.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1003a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.l<View, vz.b0> f46901a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f46902b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1003a(h00.l<? super View, vz.b0> lVar, View view) {
                super(0);
                this.f46901a = lVar;
                this.f46902b = view;
            }

            @Override // h00.a
            public /* bridge */ /* synthetic */ vz.b0 invoke() {
                invoke2();
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f46901a.invoke(this.f46902b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(y yVar, h00.l<? super View, vz.b0> lVar) {
            super(1);
            this.f46899a = yVar;
            this.f46900b = lVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(View view) {
            invoke2(view);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View newView) {
            kotlin.jvm.internal.s.g(newView, "newView");
            this.f46899a.a(newView, new C1003a(this.f46900b, newView));
        }
    }

    public static final v a() {
        return new q((ViewFactory<?>[]) new u[0]);
    }

    public static final v b(ViewFactory<?>... bindings) {
        kotlin.jvm.internal.s.g(bindings, "bindings");
        return new q((ViewFactory<?>[]) ((u[]) Arrays.copyOf(bindings, bindings.length)));
    }

    public static final <RenderingT> View c(v vVar, RenderingT initialRendering, s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup, y yVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
        kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
        kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
        View a11 = d(vVar, initialRendering).a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        if (b0.d(a11) != null) {
            if (yVar != null) {
                x.f(a11, new a(yVar, x.e(a11)));
            }
            return a11;
        }
        throw new IllegalStateException(("View.bindShowRendering should have been called for " + a11 + ", typically by the " + ((Object) u.class.getName()) + " that created it.").toString());
    }

    public static final <RenderingT> u<RenderingT> d(v vVar, RenderingT rendering) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(rendering, "rendering");
        u<RenderingT> a11 = vVar.a(m0.b(rendering.getClass()));
        if (a11 == null) {
            b bVar = rendering instanceof b ? (b) rendering : null;
            a11 = bVar == null ? null : bVar.a();
            if (!(a11 instanceof u)) {
                a11 = null;
            }
            if (a11 == null) {
                a11 = (rendering instanceof l ? (l) rendering : null) == null ? null : m.f46880b;
                if (a11 == null) {
                    throw new IllegalArgumentException("A " + ((Object) m0.b(u.class).n()) + " should have been registered to display " + ((Object) m0.b(rendering.getClass()).n()) + " instances, or that class should implement " + ((Object) m0.b(b.class).o()) + '<' + ((Object) m0.b(rendering.getClass()).o()) + ">.");
                }
            }
        }
        return a11;
    }
}