package com.stripe.android.ui.core.elements;

import h00.a;
import h00.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import m00.c;
import m00.i;
import m00.l;
import s2.s;
import vz.b0;
import vz.r;
import wz.e0;
import wz.n0;
import wz.p;
import wz.x;
import zz.d;

/* loaded from: classes6.dex */
public final class OTPController implements Controller {
    private final e<String> fieldValue;
    private final List<u<String>> fieldValues;
    private final int keyboardType;
    private final int otpLength;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final c VALID_INPUT_RANGES = new c('0', '9');

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c getVALID_INPUT_RANGES() {
            return OTPController.VALID_INPUT_RANGES;
        }
    }

    public OTPController() {
        this(0, 1, null);
    }

    public OTPController(int i11) {
        i r11;
        int t11;
        List O0;
        this.otpLength = i11;
        this.keyboardType = s.f50139b.d();
        r11 = l.r(0, i11);
        t11 = x.t(r11, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            ((n0) it2).a();
            arrayList.add(j0.a(""));
        }
        this.fieldValues = arrayList;
        O0 = e0.O0(arrayList);
        Object[] array = O0.toArray(new e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final e[] eVarArr = (e[]) array;
        this.fieldValue = g.k(new e<String>() { // from class: com.stripe.android.ui.core.elements.OTPController$special$$inlined$combine$1

            /* renamed from: com.stripe.android.ui.core.elements.OTPController$special$$inlined$combine$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            static final class AnonymousClass2 extends kotlin.jvm.internal.u implements a<String[]> {
                final /* synthetic */ e[] $flowArray;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(e[] eVarArr) {
                    super(0);
                    this.$flowArray = eVarArr;
                }

                @Override // h00.a
                public final String[] invoke() {
                    return new String[this.$flowArray.length];
                }
            }

            @f(c = "com.stripe.android.ui.core.elements.OTPController$special$$inlined$combine$1$3", f = "OTPController.kt", l = {333}, m = "invokeSuspend")
            /* renamed from: com.stripe.android.ui.core.elements.OTPController$special$$inlined$combine$1$3  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.l implements q<kotlinx.coroutines.flow.f<? super String>, String[], d<? super b0>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(d dVar) {
                    super(3, dVar);
                }

                @Override // h00.q
                public final Object invoke(kotlinx.coroutines.flow.f<? super String> fVar, String[] strArr, d<? super b0> dVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
                    anonymousClass3.L$0 = fVar;
                    anonymousClass3.L$1 = strArr;
                    return anonymousClass3.invokeSuspend(b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    String Y;
                    d11 = a00.d.d();
                    int i11 = this.label;
                    if (i11 == 0) {
                        r.b(obj);
                        Y = p.Y((String[]) ((Object[]) this.L$1), "", null, null, 0, null, null, 62, null);
                        this.label = 1;
                        if (((kotlinx.coroutines.flow.f) this.L$0).emit(Y, this) == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        r.b(obj);
                    }
                    return b0.f54756a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super String> fVar, d dVar) {
                Object d11;
                e[] eVarArr2 = eVarArr;
                Object a11 = y20.i.a(fVar, eVarArr2, new AnonymousClass2(eVarArr2), new AnonymousClass3(null), dVar);
                d11 = a00.d.d();
                return a11 == d11 ? a11 : b0.f54756a;
            }
        });
    }

    private final String filter(String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (VALID_INPUT_RANGES.h(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
        return sb3;
    }

    public final e<String> getFieldValue() {
        return this.fieldValue;
    }

    public final List<u<String>> getFieldValues$payments_ui_core_release() {
        return this.fieldValues;
    }

    /* renamed from: getKeyboardType-PjHm6EE$payments_ui_core_release  reason: not valid java name */
    public final int m447getKeyboardTypePjHm6EE$payments_ui_core_release() {
        return this.keyboardType;
    }

    public final int getOtpLength() {
        return this.otpLength;
    }

    public final int onValueChanged(int i11, String text) {
        i r11;
        kotlin.jvm.internal.s.g(text, "text");
        if (kotlin.jvm.internal.s.c(text, this.fieldValues.get(i11).getValue())) {
            return 0;
        }
        if (text.length() == 0) {
            this.fieldValues.get(i11).setValue("");
            return 0;
        }
        String filter = filter(text);
        int length = filter.length();
        int i12 = this.otpLength;
        if (length == i12) {
            i11 = 0;
        }
        int min = Math.min(i12, filter.length());
        r11 = l.r(0, min);
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            int a11 = ((n0) it2).a();
            getFieldValues$payments_ui_core_release().get(i11 + a11).setValue(String.valueOf(filter.charAt(a11)));
        }
        return min;
    }

    public /* synthetic */ OTPController(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 6 : i11);
    }
}