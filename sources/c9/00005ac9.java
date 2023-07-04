package com.stripe.android.ui.core.elements;

import c1.i;
import c1.n1;
import c1.o0;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h00.l;
import h00.p;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import l2.o;
import n2.y;
import n2.z;
import o1.f;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p0.e0;
import r1.b;
import r1.c;
import r1.g;
import r1.s;
import r1.v;
import s2.a0;
import t1.a0;
import vz.b0;
import w0.t;
import w2.d;
import wz.n0;
import y0.i1;
import y0.k1;
import y0.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class OTPElementUIKt$OTPElementUI$1$1$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ OTPElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ g $focusManager;
    final /* synthetic */ s $focusRequester;
    final /* synthetic */ o0<Integer> $focusedElementIndex$delegate;
    final /* synthetic */ int $index;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.OTPElementUIKt$OTPElementUI$1$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements l<t, b0> {
        final /* synthetic */ g $focusManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(g gVar) {
            super(1);
            this.$focusManager = gVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(t tVar) {
            invoke2(tVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(t $receiver) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
            this.$focusManager.b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.OTPElementUIKt$OTPElementUI$1$1$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements l<t, b0> {
        final /* synthetic */ g $focusManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(g gVar) {
            super(1);
            this.$focusManager = gVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(t tVar) {
            invoke2(tVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(t $receiver) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
            this.$focusManager.a(c.f48976b.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.OTPElementUIKt$OTPElementUI$1$1$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends u implements l<a0, b0> {
        final /* synthetic */ OTPElement $element;
        final /* synthetic */ g $focusManager;
        final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(OTPElement oTPElement, int i11, g gVar) {
            super(1);
            this.$element = oTPElement;
            this.$index = i11;
            this.$focusManager = gVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(a0 a0Var) {
            invoke2(a0Var);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(a0 it2) {
            m00.i r11;
            kotlin.jvm.internal.s.g(it2, "it");
            r11 = m00.l.r(0, this.$element.getController().onValueChanged(this.$index, it2.h()));
            g gVar = this.$focusManager;
            Iterator<Integer> it3 = r11.iterator();
            while (it3.hasNext()) {
                ((n0) it3).a();
                gVar.a(c.f48976b.d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.OTPElementUIKt$OTPElementUI$1$1$1$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends u implements p<i, Integer, b0> {
        final /* synthetic */ o0<Integer> $focusedElementIndex$delegate;
        final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(int i11, o0<Integer> o0Var) {
            super(2);
            this.$index = i11;
            this.$focusedElementIndex$delegate = o0Var;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            int m448OTPElementUI$lambda5$lambda2;
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            f n11 = e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null);
            m448OTPElementUI$lambda5$lambda2 = OTPElementUIKt.m448OTPElementUI$lambda5$lambda2(this.$focusedElementIndex$delegate);
            o1.b(m448OTPElementUI$lambda5$lambda2 != this.$index ? "●" : "", n11, 0L, 0L, null, null, null, 0L, null, d.g(d.f55400b.a()), 0L, 0, false, 0, null, null, iVar, 48, 0, 65020);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPElementUI$1$1$1(OTPElement oTPElement, int i11, o0<Integer> o0Var, s sVar, boolean z11, int i12, g gVar) {
        super(2);
        this.$element = oTPElement;
        this.$index = i11;
        this.$focusedElementIndex$delegate = o0Var;
        this.$focusRequester = sVar;
        this.$enabled = z11;
        this.$$dirty = i12;
        this.$focusManager = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final String m453invoke$lambda0(v1<String> v1Var) {
        return v1Var.getValue();
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        int m448OTPElementUI$lambda5$lambda2;
        long a11;
        n2.a0 b11;
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        v1 a12 = n1.a(this.$element.getController().getFieldValues$payments_ui_core_release().get(this.$index), "", null, iVar, 56, 2);
        f h11 = p0.u.h(f.f42062f1, x2.g.f(0));
        o0<Integer> o0Var = this.$focusedElementIndex$delegate;
        Integer valueOf = Integer.valueOf(this.$index);
        int i12 = this.$index;
        o0<Integer> o0Var2 = this.$focusedElementIndex$delegate;
        iVar.x(-3686552);
        boolean O = iVar.O(o0Var) | iVar.O(valueOf);
        Object y11 = iVar.y();
        if (O || y11 == i.f8486a.a()) {
            y11 = new OTPElementUIKt$OTPElementUI$1$1$1$textFieldModifier$1$1(i12, o0Var2);
            iVar.p(y11);
        }
        iVar.N();
        f b12 = b2.f.b(b.a(h11, (l) y11), new OTPElementUIKt$OTPElementUI$1$1$1$textFieldModifier$2(this.$index, this.$focusManager, this.$element, a12));
        Integer valueOf2 = Integer.valueOf(this.$index);
        int i13 = this.$index;
        iVar.x(-3686930);
        boolean O2 = iVar.O(valueOf2);
        Object y12 = iVar.y();
        if (O2 || y12 == i.f8486a.a()) {
            y12 = new OTPElementUIKt$OTPElementUI$1$1$1$textFieldModifier$3$1(i13);
            iVar.p(y12);
        }
        iVar.N();
        f b13 = o.b(b12, false, (l) y12, 1, null);
        if (this.$index == 0) {
            b13 = v.a(b13, this.$focusRequester);
        }
        f fVar = b13;
        String m453invoke$lambda0 = m453invoke$lambda0(a12);
        m448OTPElementUI$lambda5$lambda2 = OTPElementUIKt.m448OTPElementUI$lambda5$lambda2(this.$focusedElementIndex$delegate);
        if (m448OTPElementUI$lambda5$lambda2 == this.$index) {
            a11 = z.a(m453invoke$lambda0(a12).length());
        } else {
            a11 = y.f40417b.a();
        }
        a0 a0Var = new a0(m453invoke$lambda0, a11, (y) null, 4, (DefaultConstructorMarker) null);
        b11 = r12.b((r44 & 1) != 0 ? r12.f() : 0L, (r44 & 2) != 0 ? r12.i() : 0L, (r44 & 4) != 0 ? r12.f40266c : null, (r44 & 8) != 0 ? r12.j() : null, (r44 & 16) != 0 ? r12.k() : null, (r44 & 32) != 0 ? r12.f40269f : null, (r44 & 64) != 0 ? r12.f40270g : null, (r44 & 128) != 0 ? r12.m() : 0L, (r44 & 256) != 0 ? r12.e() : null, (r44 & 512) != 0 ? r12.f40273j : null, (r44 & 1024) != 0 ? r12.f40274k : null, (r44 & 2048) != 0 ? r12.d() : 0L, (r44 & 4096) != 0 ? r12.f40276m : null, (r44 & PKIFailureInfo.certRevoked) != 0 ? r12.f40277n : null, (r44 & 16384) != 0 ? r12.q() : d.g(d.f55400b.a()), (r44 & 32768) != 0 ? r12.s() : null, (r44 & 65536) != 0 ? r12.n() : 0L, (r44 & 131072) != 0 ? ((n2.a0) iVar.A(o1.c())).f40281r : null);
        w0.v vVar = new w0.v(0, false, this.$element.getController().m447getKeyboardTypePjHm6EE$payments_ui_core_release(), 0, 11, null);
        w0.u uVar = new w0.u(new AnonymousClass1(this.$focusManager), null, new AnonymousClass2(this.$focusManager), null, null, null, 58, null);
        i1 i1Var = i1.f58144a;
        a0.a aVar = t1.a0.f51365b;
        k1.c(a0Var, new AnonymousClass3(this.$element, this.$index, this.$focusManager), fVar, this.$enabled, false, b11, null, j1.c.b(iVar, -819891239, true, new AnonymousClass4(this.$index, this.$focusedElementIndex$delegate)), null, null, false, null, vVar, uVar, true, 0, null, null, i1Var.c(0L, 0L, aVar.e(), ((t1.a0) iVar.A(y0.p.a())).v(), 0L, aVar.e(), aVar.e(), aVar.e(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, iVar, 14352768, 0, 64, 2096915), iVar, ((this.$$dirty << 9) & 7168) | 12582912, (w0.u.f55221h << 9) | 24576, 233296);
    }
}