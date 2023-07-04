package com.facebook.react.animated;

import com.adyen.checkout.components.model.payments.request.Address;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class o extends b {

    /* renamed from: e  reason: collision with root package name */
    private final l f11798e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Integer> f11799f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(ReadableMap readableMap, l lVar) {
        ReadableMap map = readableMap.getMap("style");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.f11799f = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f11799f.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f11798e = lVar;
    }

    @Override // com.facebook.react.animated.b
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StyleAnimatedNode[");
        sb2.append(this.f11718d);
        sb2.append("] mPropMapping: ");
        Map<String, Integer> map = this.f11799f;
        sb2.append(map != null ? map.toString() : Address.ADDRESS_NULL_PLACEHOLDER);
        return sb2.toString();
    }

    public void h(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry<String, Integer> entry : this.f11799f.entrySet()) {
            b n11 = this.f11798e.n(entry.getValue().intValue());
            if (n11 != null) {
                if (n11 instanceof r) {
                    ((r) n11).h(javaOnlyMap);
                } else if (n11 instanceof s) {
                    javaOnlyMap.putDouble(entry.getKey(), ((s) n11).k());
                } else {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + n11.getClass());
                }
            } else {
                throw new IllegalArgumentException("Mapped style node does not exists");
            }
        }
    }
}