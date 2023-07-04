package com.plaid.link;

import com.plaid.internal.b9;
import com.plaid.internal.d4;
import com.plaid.internal.z2;
import h00.p;
import h00.q;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v20.k;
import v20.o0;
import v20.t1;
import vz.b0;
import vz.v;
import wz.r0;
import zz.d;

/* loaded from: classes2.dex */
public final class Plaid$setPlogLevel$1 extends u implements q<Integer, String, String, b0> {
    public static final Plaid$setPlogLevel$1 INSTANCE = new Plaid$setPlogLevel$1();

    @f(c = "com.plaid.link.Plaid$setPlogLevel$1$1", f = "Plaid.kt", l = {213}, m = "invokeSuspend")
    /* renamed from: com.plaid.link.Plaid$setPlogLevel$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        public final /* synthetic */ String $message;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$message = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$message, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object mo160invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00d8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                Method dump skipped, instructions count: 220
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.link.Plaid$setPlogLevel$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public Plaid$setPlogLevel$1() {
        super(3);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(Integer num, String str, String str2) {
        invoke(num.intValue(), str, str2);
        return b0.f54756a;
    }

    public final void invoke(int i11, String str, String message) {
        Map f11;
        s.g(message, "message");
        b9 i12 = ((z2) Plaid.getComponent$link_sdk_release()).i();
        if (str == null) {
            str = "";
        }
        f11 = r0.f(v.a("tag", str));
        i12.a(new d4(message, f11, i11));
        if (i11 == 6) {
            k.d(t1.f54002a, null, null, new AnonymousClass1(message, null), 3, null);
        }
    }
}