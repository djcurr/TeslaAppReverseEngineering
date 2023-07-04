package com.stripe.android.financialconnections.model;

import c30.b;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.tesla.TeslaV4.BuildConfig;
import d30.a;
import e30.f;
import expo.modules.contacts.EXColumns;
import expo.modules.interfaces.permissions.PermissionsResponse;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.i;
import g30.k0;
import g30.q1;
import g30.u1;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class FinancialConnectionsAccount$$serializer implements b0<FinancialConnectionsAccount> {
    public static final FinancialConnectionsAccount$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        FinancialConnectionsAccount$$serializer financialConnectionsAccount$$serializer = new FinancialConnectionsAccount$$serializer();
        INSTANCE = financialConnectionsAccount$$serializer;
        g1 g1Var = new g1("com.stripe.android.financialconnections.model.FinancialConnectionsAccount", financialConnectionsAccount$$serializer, 15);
        g1Var.k("category", true);
        g1Var.k("created", false);
        g1Var.k("id", false);
        g1Var.k("institution_name", false);
        g1Var.k("livemode", false);
        g1Var.k(PermissionsResponse.STATUS_KEY, true);
        g1Var.k("subcategory", true);
        g1Var.k("supported_payment_method_types", false);
        g1Var.k("balance", true);
        g1Var.k("balance_refresh", true);
        g1Var.k(EXColumns.DISPLAY_NAME, true);
        g1Var.k("last4", true);
        g1Var.k(BuildConfig.AUTH_OPENID_CLIENT_ID, true);
        g1Var.k("ownership_refresh", true);
        g1Var.k("permissions", true);
        descriptor = g1Var;
    }

    private FinancialConnectionsAccount$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        u1 u1Var = u1.f27647a;
        return new b[]{FinancialConnectionsAccount$Category$$serializer.INSTANCE, k0.f27606a, u1Var, u1Var, i.f27597a, FinancialConnectionsAccount$Status$$serializer.INSTANCE, FinancialConnectionsAccount$Subcategory$$serializer.INSTANCE, new g30.f(FinancialConnectionsAccount$SupportedPaymentMethodTypes$$serializer.INSTANCE), a.o(Balance$$serializer.INSTANCE), a.o(BalanceRefresh$$serializer.INSTANCE), a.o(u1Var), a.o(u1Var), a.o(u1Var), a.o(OwnershipRefresh$$serializer.INSTANCE), a.o(new g30.f(FinancialConnectionsAccount$Permissions$$serializer.INSTANCE))};
    }

    @Override // c30.a
    public FinancialConnectionsAccount deserialize(e decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String str;
        String str2;
        boolean z11;
        int i11;
        Object obj8;
        int i12;
        Object obj9;
        Object obj10;
        Object obj11;
        int i13;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            Object e11 = b11.e(descriptor2, 0, FinancialConnectionsAccount$Category$$serializer.INSTANCE, null);
            int C = b11.C(descriptor2, 1);
            String i14 = b11.i(descriptor2, 2);
            String i15 = b11.i(descriptor2, 3);
            boolean o11 = b11.o(descriptor2, 4);
            obj8 = b11.e(descriptor2, 5, FinancialConnectionsAccount$Status$$serializer.INSTANCE, null);
            Object e12 = b11.e(descriptor2, 6, FinancialConnectionsAccount$Subcategory$$serializer.INSTANCE, null);
            obj10 = b11.e(descriptor2, 7, new g30.f(FinancialConnectionsAccount$SupportedPaymentMethodTypes$$serializer.INSTANCE), null);
            obj11 = b11.A(descriptor2, 8, Balance$$serializer.INSTANCE, null);
            obj6 = b11.A(descriptor2, 9, BalanceRefresh$$serializer.INSTANCE, null);
            u1 u1Var = u1.f27647a;
            Object A = b11.A(descriptor2, 10, u1Var, null);
            Object A2 = b11.A(descriptor2, 11, u1Var, null);
            obj7 = b11.A(descriptor2, 12, u1Var, null);
            obj5 = b11.A(descriptor2, 13, OwnershipRefresh$$serializer.INSTANCE, null);
            i11 = C;
            str = i14;
            i12 = 32767;
            str2 = i15;
            z11 = o11;
            obj9 = A2;
            obj3 = e12;
            obj2 = A;
            obj = b11.A(descriptor2, 14, new g30.f(FinancialConnectionsAccount$Permissions$$serializer.INSTANCE), null);
            obj4 = e11;
        } else {
            boolean z12 = true;
            int i16 = 0;
            boolean z13 = false;
            Object obj12 = null;
            obj = null;
            Object obj13 = null;
            Object obj14 = null;
            obj2 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            obj3 = null;
            String str3 = null;
            String str4 = null;
            Object obj19 = null;
            int i17 = 0;
            while (z12) {
                int p11 = b11.p(descriptor2);
                switch (p11) {
                    case -1:
                        i13 = i17;
                        z12 = false;
                        i17 = i13;
                        break;
                    case 0:
                        i13 = i17;
                        obj19 = b11.e(descriptor2, 0, FinancialConnectionsAccount$Category$$serializer.INSTANCE, obj19);
                        i16 |= 1;
                        i17 = i13;
                        break;
                    case 1:
                        i16 |= 2;
                        i17 = b11.C(descriptor2, 1);
                        break;
                    case 2:
                        i13 = i17;
                        str3 = b11.i(descriptor2, 2);
                        i16 |= 4;
                        i17 = i13;
                        break;
                    case 3:
                        i13 = i17;
                        str4 = b11.i(descriptor2, 3);
                        i16 |= 8;
                        i17 = i13;
                        break;
                    case 4:
                        i13 = i17;
                        z13 = b11.o(descriptor2, 4);
                        i16 |= 16;
                        i17 = i13;
                        break;
                    case 5:
                        i13 = i17;
                        obj12 = b11.e(descriptor2, 5, FinancialConnectionsAccount$Status$$serializer.INSTANCE, obj12);
                        i16 |= 32;
                        i17 = i13;
                        break;
                    case 6:
                        i13 = i17;
                        obj3 = b11.e(descriptor2, 6, FinancialConnectionsAccount$Subcategory$$serializer.INSTANCE, obj3);
                        i16 |= 64;
                        i17 = i13;
                        break;
                    case 7:
                        i13 = i17;
                        obj16 = b11.e(descriptor2, 7, new g30.f(FinancialConnectionsAccount$SupportedPaymentMethodTypes$$serializer.INSTANCE), obj16);
                        i16 |= 128;
                        i17 = i13;
                        break;
                    case 8:
                        i13 = i17;
                        obj18 = b11.A(descriptor2, 8, Balance$$serializer.INSTANCE, obj18);
                        i16 |= 256;
                        i17 = i13;
                        break;
                    case 9:
                        i13 = i17;
                        obj15 = b11.A(descriptor2, 9, BalanceRefresh$$serializer.INSTANCE, obj15);
                        i16 |= 512;
                        i17 = i13;
                        break;
                    case 10:
                        i13 = i17;
                        obj2 = b11.A(descriptor2, 10, u1.f27647a, obj2);
                        i16 |= 1024;
                        i17 = i13;
                        break;
                    case 11:
                        i13 = i17;
                        obj14 = b11.A(descriptor2, 11, u1.f27647a, obj14);
                        i16 |= 2048;
                        i17 = i13;
                        break;
                    case 12:
                        i13 = i17;
                        obj17 = b11.A(descriptor2, 12, u1.f27647a, obj17);
                        i16 |= 4096;
                        i17 = i13;
                        break;
                    case 13:
                        i13 = i17;
                        obj13 = b11.A(descriptor2, 13, OwnershipRefresh$$serializer.INSTANCE, obj13);
                        i16 |= PKIFailureInfo.certRevoked;
                        i17 = i13;
                        break;
                    case 14:
                        obj = b11.A(descriptor2, 14, new g30.f(FinancialConnectionsAccount$Permissions$$serializer.INSTANCE), obj);
                        i16 |= 16384;
                        i17 = i17;
                        continue;
                    default:
                        throw new UnknownFieldException(p11);
                }
            }
            obj4 = obj19;
            obj5 = obj13;
            obj6 = obj15;
            obj7 = obj17;
            str = str3;
            str2 = str4;
            z11 = z13;
            i11 = i17;
            obj8 = obj12;
            i12 = i16;
            obj9 = obj14;
            obj10 = obj16;
            obj11 = obj18;
        }
        b11.d(descriptor2);
        return new FinancialConnectionsAccount(i12, (FinancialConnectionsAccount.Category) obj4, i11, str, str2, z11, (FinancialConnectionsAccount.Status) obj8, (FinancialConnectionsAccount.Subcategory) obj3, (List) obj10, (Balance) obj11, (BalanceRefresh) obj6, (String) obj2, (String) obj9, (String) obj7, (OwnershipRefresh) obj5, (List) obj, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, FinancialConnectionsAccount value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        FinancialConnectionsAccount.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}