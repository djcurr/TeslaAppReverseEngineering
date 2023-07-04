package com.facebook.react.animated;

import com.adyen.checkout.components.model.payments.request.Address;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class p extends s {

    /* renamed from: i  reason: collision with root package name */
    private final l f11800i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f11801j;

    public p(ReadableMap readableMap, l lVar) {
        this.f11800i = lVar;
        ReadableArray array = readableMap.getArray("input");
        this.f11801j = new int[array.size()];
        int i11 = 0;
        while (true) {
            int[] iArr = this.f11801j;
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
        sb2.append("SubtractionAnimatedNode[");
        sb2.append(this.f11718d);
        sb2.append("]: input nodes: ");
        int[] iArr = this.f11801j;
        sb2.append(iArr != null ? iArr.toString() : Address.ADDRESS_NULL_PLACEHOLDER);
        sb2.append(" - super: ");
        sb2.append(super.d());
        return sb2.toString();
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f11801j;
            if (i11 >= iArr.length) {
                return;
            }
            b n11 = this.f11800i.n(iArr[i11]);
            if (n11 == null || !(n11 instanceof s)) {
                break;
            }
            double k11 = ((s) n11).k();
            if (i11 == 0) {
                this.f11813f = k11;
            } else {
                this.f11813f -= k11;
            }
            i11++;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
    }
}