package com.stripe.android.ui.core.address;

import c30.b;
import g30.f1;
import g30.q1;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;
import wz.w;

@a
/* loaded from: classes6.dex */
public final class FieldSchema {
    public static final Companion Companion = new Companion(null);
    private final List<String> examples;
    private final boolean isNumeric;
    private final NameType nameType;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<FieldSchema> serializer() {
            return FieldSchema$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FieldSchema(int i11, boolean z11, List list, NameType nameType, q1 q1Var) {
        List<String> i12;
        if (4 != (i11 & 4)) {
            f1.a(i11, 4, FieldSchema$$serializer.INSTANCE.getDescriptor());
        }
        this.isNumeric = (i11 & 1) == 0 ? false : z11;
        if ((i11 & 2) == 0) {
            i12 = w.i();
            this.examples = i12;
        } else {
            this.examples = list;
        }
        this.nameType = nameType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (kotlin.jvm.internal.s.c(r1, r3) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.stripe.android.ui.core.address.FieldSchema r4, f30.d r5, e30.f r6) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.s.g(r4, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.s.g(r6, r0)
            r0 = 0
            boolean r1 = r5.k(r6, r0)
            r2 = 1
            if (r1 == 0) goto L19
        L17:
            r1 = r2
            goto L1f
        L19:
            boolean r1 = r4.isNumeric
            if (r1 == 0) goto L1e
            goto L17
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L26
            boolean r1 = r4.isNumeric
            r5.C(r6, r0, r1)
        L26:
            boolean r1 = r5.k(r6, r2)
            if (r1 == 0) goto L2e
        L2c:
            r0 = r2
            goto L3b
        L2e:
            java.util.List<java.lang.String> r1 = r4.examples
            java.util.List r3 = wz.u.i()
            boolean r1 = kotlin.jvm.internal.s.c(r1, r3)
            if (r1 != 0) goto L3b
            goto L2c
        L3b:
            if (r0 == 0) goto L49
            g30.f r0 = new g30.f
            g30.u1 r1 = g30.u1.f27647a
            r0.<init>(r1)
            java.util.List<java.lang.String> r1 = r4.examples
            r5.q(r6, r2, r0, r1)
        L49:
            r0 = 2
            g30.x r1 = new g30.x
            com.stripe.android.ui.core.address.NameType[] r2 = com.stripe.android.ui.core.address.NameType.values()
            java.lang.String r3 = "com.stripe.android.ui.core.address.NameType"
            r1.<init>(r3, r2)
            com.stripe.android.ui.core.address.NameType r4 = r4.nameType
            r5.q(r6, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.address.FieldSchema.write$Self(com.stripe.android.ui.core.address.FieldSchema, f30.d, e30.f):void");
    }

    public final List<String> getExamples() {
        return this.examples;
    }

    public final NameType getNameType() {
        return this.nameType;
    }

    public final boolean isNumeric() {
        return this.isNumeric;
    }

    public FieldSchema(boolean z11, List<String> examples, NameType nameType) {
        s.g(examples, "examples");
        s.g(nameType, "nameType");
        this.isNumeric = z11;
        this.examples = examples;
        this.nameType = nameType;
    }

    public /* synthetic */ FieldSchema(boolean z11, List list, NameType nameType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? w.i() : list, nameType);
    }
}