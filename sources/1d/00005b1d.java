package com.stripe.android.ui.core.elements;

import h00.a;
import h00.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.e;
import vz.b0;
import vz.r;
import wz.e0;
import wz.x;
import y20.i;
import zz.d;

/* loaded from: classes6.dex */
public final class SectionController implements Controller {
    public static final int $stable = 8;
    private final e<FieldError> error;
    private final Integer label;
    private final List<SectionFieldErrorController> sectionFieldErrorControllers;

    /* JADX WARN: Multi-variable type inference failed */
    public SectionController(Integer num, List<? extends SectionFieldErrorController> sectionFieldErrorControllers) {
        int t11;
        List O0;
        s.g(sectionFieldErrorControllers, "sectionFieldErrorControllers");
        this.label = num;
        this.sectionFieldErrorControllers = sectionFieldErrorControllers;
        t11 = x.t(sectionFieldErrorControllers, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (SectionFieldErrorController sectionFieldErrorController : sectionFieldErrorControllers) {
            arrayList.add(sectionFieldErrorController.getError());
        }
        O0 = e0.O0(arrayList);
        Object[] array = O0.toArray(new e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final e[] eVarArr = (e[]) array;
        this.error = new e<FieldError>() { // from class: com.stripe.android.ui.core.elements.SectionController$special$$inlined$combine$1

            /* renamed from: com.stripe.android.ui.core.elements.SectionController$special$$inlined$combine$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            static final class AnonymousClass2 extends u implements a<FieldError[]> {
                final /* synthetic */ e[] $flowArray;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(e[] eVarArr) {
                    super(0);
                    this.$flowArray = eVarArr;
                }

                @Override // h00.a
                public final FieldError[] invoke() {
                    return new FieldError[this.$flowArray.length];
                }
            }

            @f(c = "com.stripe.android.ui.core.elements.SectionController$special$$inlined$combine$1$3", f = "SectionController.kt", l = {333}, m = "invokeSuspend")
            /* renamed from: com.stripe.android.ui.core.elements.SectionController$special$$inlined$combine$1$3  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass3 extends l implements q<kotlinx.coroutines.flow.f<? super FieldError>, FieldError[], d<? super b0>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(d dVar) {
                    super(3, dVar);
                }

                @Override // h00.q
                public final Object invoke(kotlinx.coroutines.flow.f<? super FieldError> fVar, FieldError[] fieldErrorArr, d<? super b0> dVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
                    anonymousClass3.L$0 = fVar;
                    anonymousClass3.L$1 = fieldErrorArr;
                    return anonymousClass3.invokeSuspend(b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.label;
                    if (i11 == 0) {
                        r.b(obj);
                        Object H = wz.l.H((FieldError[]) ((Object[]) this.L$1));
                        this.label = 1;
                        if (((kotlinx.coroutines.flow.f) this.L$0).emit(H, this) == d11) {
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
            public Object collect(kotlinx.coroutines.flow.f<? super FieldError> fVar, d dVar) {
                Object d11;
                e[] eVarArr2 = eVarArr;
                Object a11 = i.a(fVar, eVarArr2, new AnonymousClass2(eVarArr2), new AnonymousClass3(null), dVar);
                d11 = a00.d.d();
                return a11 == d11 ? a11 : b0.f54756a;
            }
        };
    }

    public final e<FieldError> getError() {
        return this.error;
    }

    public final Integer getLabel() {
        return this.label;
    }

    public final List<SectionFieldErrorController> getSectionFieldErrorControllers() {
        return this.sectionFieldErrorControllers;
    }
}