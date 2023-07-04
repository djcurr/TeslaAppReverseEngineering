package com.facebook.react.animated;

import com.adyen.checkout.components.model.payments.request.Address;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
class g extends s {

    /* renamed from: i  reason: collision with root package name */
    private final l f11735i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f11736j;

    public g(ReadableMap readableMap, l lVar) {
        this.f11735i = lVar;
        ReadableArray array = readableMap.getArray("input");
        this.f11736j = new int[array.size()];
        int i11 = 0;
        while (true) {
            int[] iArr = this.f11736j;
            if (i11 >= iArr.length) {
                return;
            }
            iArr[i11] = array.getInt(i11);
            i11++;
        }
    }

    @Override // com.facebook.react.animated.s, com.facebook.react.animated.b
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DivisionAnimatedNode[");
        sb2.append(this.f11718d);
        sb2.append("]: input nodes: ");
        int[] iArr = this.f11736j;
        sb2.append(iArr != null ? iArr.toString() : Address.ADDRESS_NULL_PLACEHOLDER);
        sb2.append(" - super: ");
        sb2.append(super.d());
        return sb2.toString();
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f11736j;
            if (i11 >= iArr.length) {
                return;
            }
            b n11 = this.f11735i.n(iArr[i11]);
            if (n11 == null || !(n11 instanceof s)) {
                break;
            }
            double k11 = ((s) n11).k();
            if (i11 == 0) {
                this.f11813f = k11;
            } else if (k11 != 0.0d) {
                this.f11813f /= k11;
            } else {
                throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node with Animated ID " + this.f11718d);
            }
            i11++;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node with Animated ID " + this.f11718d);
    }
}