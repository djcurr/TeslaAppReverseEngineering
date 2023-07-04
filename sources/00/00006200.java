package com.teslamotors.plugins.ble.beacon;

import androidx.annotation.Keep;
import com.teslamotors.plugins.ble.card.OemWalletProvider;
import java.util.List;
import kotlin.Metadata;
import wz.w;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0007"}, d2 = {"Lcom/teslamotors/plugins/ble/beacon/OemWalletInjector;", "", "", "Lcom/teslamotors/plugins/ble/card/OemWalletProvider;", "inject", "<init>", "()V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class OemWalletInjector {
    public static final OemWalletInjector INSTANCE = new OemWalletInjector();

    private OemWalletInjector() {
    }

    public final List<OemWalletProvider> inject() {
        List<OemWalletProvider> i11;
        i11 = w.i();
        return i11;
    }
}