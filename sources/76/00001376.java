package com.adyen.threeds2.internal.ui.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.d;
import androidx.core.view.g;
import com.adyen.threeds2.customization.UiCustomization;
import com.adyen.threeds2.internal.h;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
abstract class b extends d {
    private atd.n0.b a(h hVar) {
        UiCustomization a11 = hVar.a();
        if (a11 != null) {
            return new atd.n0.b(getWindow(), new atd.n0.a(a11));
        }
        return null;
    }

    private void f() {
        getWindow().setFlags(PKIFailureInfo.certRevoked, PKIFailureInfo.certRevoked);
    }

    abstract h e();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        atd.n0.b a11 = a(e());
        if (a11 != null) {
            a(a11);
        }
        super.onCreate(bundle);
        f();
    }

    private void a(atd.n0.b bVar) {
        LayoutInflater from = LayoutInflater.from(this);
        if (from.getFactory() == null) {
            g.b(from, bVar);
        }
    }
}