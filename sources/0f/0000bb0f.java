package w0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n2.a;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f55056a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w0.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1247a extends kotlin.jvm.internal.u implements h00.l<List<? extends s2.d>, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s2.f f55057a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.l<s2.a0, vz.b0> f55058b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1247a(s2.f fVar, h00.l<? super s2.a0, vz.b0> lVar) {
                super(1);
                this.f55057a = fVar;
                this.f55058b = lVar;
            }

            public final void a(List<? extends s2.d> it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                g0.f55056a.g(it2, this.f55057a, this.f55058b);
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(List<? extends s2.d> list) {
                a(list);
                return vz.b0.f54756a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(List<? extends s2.d> list, s2.f fVar, h00.l<? super s2.a0, vz.b0> lVar) {
            lVar.mo12invoke(fVar.a(list));
        }

        public final s2.i0 b(long j11, s2.i0 transformed) {
            kotlin.jvm.internal.s.g(transformed, "transformed");
            a.C0787a c0787a = new a.C0787a(transformed.b());
            c0787a.c(new n2.s(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, w2.e.f55408b.d(), null, 12287, null), transformed.a().originalToTransformed(n2.y.n(j11)), transformed.a().originalToTransformed(n2.y.i(j11)));
            return new s2.i0(c0787a.h(), transformed.a());
        }

        public final void c(t1.u canvas, s2.a0 value, s2.t offsetMapping, n2.w textLayoutResult, t1.o0 selectionPaint) {
            int originalToTransformed;
            int originalToTransformed2;
            kotlin.jvm.internal.s.g(canvas, "canvas");
            kotlin.jvm.internal.s.g(value, "value");
            kotlin.jvm.internal.s.g(offsetMapping, "offsetMapping");
            kotlin.jvm.internal.s.g(textLayoutResult, "textLayoutResult");
            kotlin.jvm.internal.s.g(selectionPaint, "selectionPaint");
            if (!n2.y.h(value.g()) && (originalToTransformed = offsetMapping.originalToTransformed(n2.y.l(value.g()))) != (originalToTransformed2 = offsetMapping.originalToTransformed(n2.y.k(value.g())))) {
                canvas.t(textLayoutResult.y(originalToTransformed, originalToTransformed2), selectionPaint);
            }
            n2.x.f40416a.a(canvas, textLayoutResult);
        }

        public final vz.u<Integer, Integer, n2.w> d(d0 textDelegate, long j11, x2.q layoutDirection, n2.w wVar) {
            kotlin.jvm.internal.s.g(textDelegate, "textDelegate");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            n2.w l11 = textDelegate.l(j11, layoutDirection, wVar);
            return new vz.u<>(Integer.valueOf(x2.o.g(l11.A())), Integer.valueOf(x2.o.f(l11.A())), l11);
        }

        public final void e(s2.a0 value, d0 textDelegate, n2.w textLayoutResult, f2.o layoutCoordinates, s2.h0 textInputSession, boolean z11, s2.t offsetMapping) {
            s1.h hVar;
            kotlin.jvm.internal.s.g(value, "value");
            kotlin.jvm.internal.s.g(textDelegate, "textDelegate");
            kotlin.jvm.internal.s.g(textLayoutResult, "textLayoutResult");
            kotlin.jvm.internal.s.g(layoutCoordinates, "layoutCoordinates");
            kotlin.jvm.internal.s.g(textInputSession, "textInputSession");
            kotlin.jvm.internal.s.g(offsetMapping, "offsetMapping");
            if (z11) {
                int originalToTransformed = offsetMapping.originalToTransformed(n2.y.k(value.g()));
                if (originalToTransformed < textLayoutResult.k().l().length()) {
                    hVar = textLayoutResult.c(originalToTransformed);
                } else if (originalToTransformed != 0) {
                    hVar = textLayoutResult.c(originalToTransformed - 1);
                } else {
                    hVar = new s1.h(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, x2.o.f(h0.b(textDelegate.j(), textDelegate.a(), textDelegate.h(), null, 0, 24, null)));
                }
                long q02 = layoutCoordinates.q0(s1.g.a(hVar.i(), hVar.l()));
                textInputSession.d(s1.i.b(s1.g.a(s1.f.l(q02), s1.f.m(q02)), s1.m.a(hVar.n(), hVar.h())));
            }
        }

        public final void f(s2.h0 textInputSession, s2.f editProcessor, h00.l<? super s2.a0, vz.b0> onValueChange) {
            kotlin.jvm.internal.s.g(textInputSession, "textInputSession");
            kotlin.jvm.internal.s.g(editProcessor, "editProcessor");
            kotlin.jvm.internal.s.g(onValueChange, "onValueChange");
            onValueChange.mo12invoke(s2.a0.d(editProcessor.d(), null, 0L, null, 3, null));
            textInputSession.b();
            textInputSession.a();
        }

        public final s2.h0 h(s2.c0 textInputService, s2.a0 value, s2.f editProcessor, s2.m imeOptions, h00.l<? super s2.a0, vz.b0> onValueChange, h00.l<? super s2.l, vz.b0> onImeActionPerformed) {
            kotlin.jvm.internal.s.g(textInputService, "textInputService");
            kotlin.jvm.internal.s.g(value, "value");
            kotlin.jvm.internal.s.g(editProcessor, "editProcessor");
            kotlin.jvm.internal.s.g(imeOptions, "imeOptions");
            kotlin.jvm.internal.s.g(onValueChange, "onValueChange");
            kotlin.jvm.internal.s.g(onImeActionPerformed, "onImeActionPerformed");
            s2.h0 i11 = i(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
            i11.e();
            return i11;
        }

        public final s2.h0 i(s2.c0 textInputService, s2.a0 value, s2.f editProcessor, s2.m imeOptions, h00.l<? super s2.a0, vz.b0> onValueChange, h00.l<? super s2.l, vz.b0> onImeActionPerformed) {
            kotlin.jvm.internal.s.g(textInputService, "textInputService");
            kotlin.jvm.internal.s.g(value, "value");
            kotlin.jvm.internal.s.g(editProcessor, "editProcessor");
            kotlin.jvm.internal.s.g(imeOptions, "imeOptions");
            kotlin.jvm.internal.s.g(onValueChange, "onValueChange");
            kotlin.jvm.internal.s.g(onImeActionPerformed, "onImeActionPerformed");
            return textInputService.d(s2.a0.d(value, null, 0L, null, 7, null), imeOptions, new C1247a(editProcessor, onValueChange), onImeActionPerformed);
        }

        public final void j(long j11, v0 textLayoutResult, s2.f editProcessor, s2.t offsetMapping, h00.l<? super s2.a0, vz.b0> onValueChange) {
            kotlin.jvm.internal.s.g(textLayoutResult, "textLayoutResult");
            kotlin.jvm.internal.s.g(editProcessor, "editProcessor");
            kotlin.jvm.internal.s.g(offsetMapping, "offsetMapping");
            kotlin.jvm.internal.s.g(onValueChange, "onValueChange");
            onValueChange.mo12invoke(s2.a0.d(editProcessor.d(), null, n2.z.a(offsetMapping.transformedToOriginal(v0.h(textLayoutResult, j11, false, 2, null))), null, 5, null));
        }
    }
}