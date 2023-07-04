package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.address.AddressFieldElementRepository;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import vz.b0;

/* loaded from: classes6.dex */
public final class CardBillingAddressElement extends AddressElement {
    public static final int $stable = 8;
    private final e<List<IdentifierSpec>> hiddenIdentifiers;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CardBillingAddressElement(com.stripe.android.ui.core.elements.IdentifierSpec r11, java.util.Map r12, com.stripe.android.ui.core.address.AddressFieldElementRepository r13, java.util.Set r14, com.stripe.android.ui.core.elements.DropdownFieldController r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r10 = this;
            r0 = r16 & 2
            if (r0 == 0) goto La
            java.util.Map r0 = wz.p0.i()
            r3 = r0
            goto Lb
        La:
            r3 = r12
        Lb:
            r0 = r16 & 8
            if (r0 == 0) goto L14
            java.util.Set r0 = wz.v0.d()
            goto L15
        L14:
            r0 = r14
        L15:
            r1 = r16 & 16
            if (r1 == 0) goto L37
            com.stripe.android.ui.core.elements.DropdownFieldController r1 = new com.stripe.android.ui.core.elements.DropdownFieldController
            com.stripe.android.ui.core.elements.CountryConfig r2 = new com.stripe.android.ui.core.elements.CountryConfig
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r2
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            com.stripe.android.ui.core.elements.IdentifierSpec$Companion r4 = com.stripe.android.ui.core.elements.IdentifierSpec.Companion
            com.stripe.android.ui.core.elements.IdentifierSpec r4 = r4.getCountry()
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r1.<init>(r2, r4)
            r6 = r1
            goto L38
        L37:
            r6 = r15
        L38:
            r1 = r10
            r2 = r11
            r4 = r13
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CardBillingAddressElement.<init>(com.stripe.android.ui.core.elements.IdentifierSpec, java.util.Map, com.stripe.android.ui.core.address.AddressFieldElementRepository, java.util.Set, com.stripe.android.ui.core.elements.DropdownFieldController, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final e<List<IdentifierSpec>> getHiddenIdentifiers() {
        return this.hiddenIdentifiers;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBillingAddressElement(IdentifierSpec identifier, Map<IdentifierSpec, String> rawValuesMap, AddressFieldElementRepository addressFieldRepository, Set<String> countryCodes, DropdownFieldController countryDropdownFieldController) {
        super(identifier, addressFieldRepository, rawValuesMap, countryCodes, countryDropdownFieldController);
        s.g(identifier, "identifier");
        s.g(rawValuesMap, "rawValuesMap");
        s.g(addressFieldRepository, "addressFieldRepository");
        s.g(countryCodes, "countryCodes");
        s.g(countryDropdownFieldController, "countryDropdownFieldController");
        final e<String> rawFieldValue = countryDropdownFieldController.getRawFieldValue();
        this.hiddenIdentifiers = new e<List<? extends IdentifierSpec>>() { // from class: com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1$2", f = "CardBillingAddressElement.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(zz.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r10, zz.d r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        vz.r.b(r11)
                        goto Lcc
                    L2a:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L32:
                        vz.r.b(r11)
                        kotlinx.coroutines.flow.f r11 = r9.$this_unsafeFlow
                        java.lang.String r10 = (java.lang.String) r10
                        r2 = 0
                        if (r10 == 0) goto La9
                        int r4 = r10.hashCode()
                        r5 = 2142(0x85e, float:3.002E-42)
                        if (r4 == r5) goto L5f
                        r5 = 2267(0x8db, float:3.177E-42)
                        if (r4 == r5) goto L56
                        r5 = 2718(0xa9e, float:3.809E-42)
                        if (r4 == r5) goto L4d
                        goto La9
                    L4d:
                        java.lang.String r4 = "US"
                        boolean r10 = r10.equals(r4)
                        if (r10 != 0) goto L68
                        goto La9
                    L56:
                        java.lang.String r4 = "GB"
                        boolean r10 = r10.equals(r4)
                        if (r10 != 0) goto L68
                        goto La9
                    L5f:
                        java.lang.String r4 = "CA"
                        boolean r10 = r10.equals(r4)
                        if (r10 != 0) goto L68
                        goto La9
                    L68:
                        com.stripe.android.ui.core.address.FieldType[] r10 = com.stripe.android.ui.core.address.FieldType.values()
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        int r5 = r10.length
                        r6 = r2
                    L73:
                        if (r6 >= r5) goto L86
                        r7 = r10[r6]
                        com.stripe.android.ui.core.address.FieldType r8 = com.stripe.android.ui.core.address.FieldType.PostalCode
                        if (r7 != r8) goto L7d
                        r8 = r3
                        goto L7e
                    L7d:
                        r8 = r2
                    L7e:
                        if (r8 != 0) goto L83
                        r4.add(r7)
                    L83:
                        int r6 = r6 + 1
                        goto L73
                    L86:
                        java.util.ArrayList r10 = new java.util.ArrayList
                        r2 = 10
                        int r2 = wz.u.t(r4, r2)
                        r10.<init>(r2)
                        java.util.Iterator r2 = r4.iterator()
                    L95:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto Lc3
                        java.lang.Object r4 = r2.next()
                        com.stripe.android.ui.core.address.FieldType r4 = (com.stripe.android.ui.core.address.FieldType) r4
                        com.stripe.android.ui.core.elements.IdentifierSpec r4 = r4.getIdentifierSpec()
                        r10.add(r4)
                        goto L95
                    La9:
                        com.stripe.android.ui.core.address.FieldType[] r10 = com.stripe.android.ui.core.address.FieldType.values()
                        java.util.ArrayList r4 = new java.util.ArrayList
                        int r5 = r10.length
                        r4.<init>(r5)
                        int r5 = r10.length
                    Lb4:
                        if (r2 >= r5) goto Lc2
                        r6 = r10[r2]
                        com.stripe.android.ui.core.elements.IdentifierSpec r6 = r6.getIdentifierSpec()
                        r4.add(r6)
                        int r2 = r2 + 1
                        goto Lb4
                    Lc2:
                        r10 = r4
                    Lc3:
                        r0.label = r3
                        java.lang.Object r10 = r11.emit(r10, r0)
                        if (r10 != r1) goto Lcc
                        return r1
                    Lcc:
                        vz.b0 r10 = vz.b0.f54756a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super List<? extends IdentifierSpec>> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
    }
}