package com.stripe.android.ui.core.elements;

import h00.a;
import h00.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import vz.b0;
import vz.r;
import wz.e0;
import wz.p;
import wz.x;
import y20.i;
import zz.d;

@f(c = "com.stripe.android.ui.core.elements.AddressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1", f = "AddressElement.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AddressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1 extends l implements q<kotlinx.coroutines.flow.f<? super List<? extends IdentifierSpec>>, List<? extends SectionFieldElement>, d<? super b0>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public AddressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1(d dVar) {
        super(3, dVar);
    }

    @Override // h00.q
    public final Object invoke(kotlinx.coroutines.flow.f<? super List<? extends IdentifierSpec>> fVar, List<? extends SectionFieldElement> list, d<? super b0> dVar) {
        AddressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1 addressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1 = new AddressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1(dVar);
        addressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1.L$0 = fVar;
        addressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1.L$1 = list;
        return addressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        int t11;
        List O0;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            kotlinx.coroutines.flow.f fVar = (kotlinx.coroutines.flow.f) this.L$0;
            List<SectionFieldElement> list = (List) this.L$1;
            t11 = x.t(list, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (SectionFieldElement sectionFieldElement : list) {
                arrayList.add(sectionFieldElement.getTextFieldIdentifiers());
            }
            O0 = e0.O0(arrayList);
            Object[] array = O0.toArray(new e[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            final e[] eVarArr = (e[]) array;
            e<List<? extends IdentifierSpec>> eVar = new e<List<? extends IdentifierSpec>>() { // from class: com.stripe.android.ui.core.elements.AddressElement$getTextFieldIdentifiers$lambda-9$$inlined$combine$1

                /* renamed from: com.stripe.android.ui.core.elements.AddressElement$getTextFieldIdentifiers$lambda-9$$inlined$combine$1$2  reason: invalid class name */
                /* loaded from: classes6.dex */
                static final class AnonymousClass2 extends u implements a<List<? extends IdentifierSpec>[]> {
                    final /* synthetic */ e[] $flowArray;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(e[] eVarArr) {
                        super(0);
                        this.$flowArray = eVarArr;
                    }

                    @Override // h00.a
                    public final List<? extends IdentifierSpec>[] invoke() {
                        return new List[this.$flowArray.length];
                    }
                }

                @f(c = "com.stripe.android.ui.core.elements.AddressElement$getTextFieldIdentifiers$lambda-9$$inlined$combine$1$3", f = "AddressElement.kt", l = {333}, m = "invokeSuspend")
                /* renamed from: com.stripe.android.ui.core.elements.AddressElement$getTextFieldIdentifiers$lambda-9$$inlined$combine$1$3  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass3 extends l implements q<kotlinx.coroutines.flow.f<? super List<? extends IdentifierSpec>>, List<? extends IdentifierSpec>[], d<? super b0>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public AnonymousClass3(d dVar) {
                        super(3, dVar);
                    }

                    @Override // h00.q
                    public final Object invoke(kotlinx.coroutines.flow.f<? super List<? extends IdentifierSpec>> fVar, List<? extends IdentifierSpec>[] listArr, d<? super b0> dVar) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
                        anonymousClass3.L$0 = fVar;
                        anonymousClass3.L$1 = listArr;
                        return anonymousClass3.invokeSuspend(b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        List s02;
                        List v11;
                        d11 = a00.d.d();
                        int i11 = this.label;
                        if (i11 == 0) {
                            r.b(obj);
                            s02 = p.s0((List[]) ((Object[]) this.L$1));
                            v11 = x.v(s02);
                            this.label = 1;
                            if (((kotlinx.coroutines.flow.f) this.L$0).emit(v11, this) == d11) {
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
                public Object collect(kotlinx.coroutines.flow.f<? super List<? extends IdentifierSpec>> fVar2, d dVar) {
                    Object d12;
                    e[] eVarArr2 = eVarArr;
                    Object a11 = i.a(fVar2, eVarArr2, new AnonymousClass2(eVarArr2), new AnonymousClass3(null), dVar);
                    d12 = a00.d.d();
                    return a11 == d12 ? a11 : b0.f54756a;
                }
            };
            this.label = 1;
            if (g.m(fVar, eVar, this) == d11) {
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