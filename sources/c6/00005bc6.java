package com.stripe.android.ui.core.forms.resources;

import com.stripe.android.ui.core.address.AddressFieldElementRepository;
import vz.b0;
import zz.d;

/* loaded from: classes6.dex */
public interface ResourceRepository {
    AddressFieldElementRepository getAddressRepository();

    LpmRepository getLpmRepository();

    boolean isLoaded();

    Object waitUntilLoaded(d<? super b0> dVar);
}