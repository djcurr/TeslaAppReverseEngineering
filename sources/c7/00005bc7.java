package com.stripe.android.ui.core.forms.resources;

import com.stripe.android.ui.core.address.AddressFieldElementRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import zz.d;

/* loaded from: classes6.dex */
public final class StaticResourceRepository implements ResourceRepository {
    public static final int $stable = 8;
    private final AddressFieldElementRepository addressRepository;
    private final LpmRepository lpmRepository;

    public StaticResourceRepository(AddressFieldElementRepository addressRepository, LpmRepository lpmRepository) {
        s.g(addressRepository, "addressRepository");
        s.g(lpmRepository, "lpmRepository");
        this.addressRepository = addressRepository;
        this.lpmRepository = lpmRepository;
    }

    @Override // com.stripe.android.ui.core.forms.resources.ResourceRepository
    public AddressFieldElementRepository getAddressRepository() {
        return this.addressRepository;
    }

    @Override // com.stripe.android.ui.core.forms.resources.ResourceRepository
    public LpmRepository getLpmRepository() {
        return this.lpmRepository;
    }

    @Override // com.stripe.android.ui.core.forms.resources.ResourceRepository
    public boolean isLoaded() {
        return true;
    }

    @Override // com.stripe.android.ui.core.forms.resources.ResourceRepository
    public Object waitUntilLoaded(d<? super b0> dVar) {
        return b0.f54756a;
    }

    public /* synthetic */ StaticResourceRepository(AddressFieldElementRepository addressFieldElementRepository, LpmRepository lpmRepository, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(addressFieldElementRepository, (i11 & 2) != 0 ? new LpmRepository() : lpmRepository);
    }
}