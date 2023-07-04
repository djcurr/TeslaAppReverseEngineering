package com.facebook.react.animated;

import com.adyen.checkout.components.model.payments.request.Address;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m extends b {

    /* renamed from: e  reason: collision with root package name */
    private int f11775e = -1;

    /* renamed from: f  reason: collision with root package name */
    private final l f11776f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Integer> f11777g;

    /* renamed from: h  reason: collision with root package name */
    private final JavaOnlyMap f11778h;

    /* renamed from: i  reason: collision with root package name */
    private UIManager f11779i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(ReadableMap readableMap, l lVar) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.f11777g = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f11777g.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f11778h = new JavaOnlyMap();
        this.f11776f = lVar;
    }

    @Override // com.facebook.react.animated.b
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PropsAnimatedNode[");
        sb2.append(this.f11718d);
        sb2.append("] connectedViewTag: ");
        sb2.append(this.f11775e);
        sb2.append(" mPropNodeMapping: ");
        Map<String, Integer> map = this.f11777g;
        String str = Address.ADDRESS_NULL_PLACEHOLDER;
        sb2.append(map != null ? map.toString() : Address.ADDRESS_NULL_PLACEHOLDER);
        sb2.append(" mPropMap: ");
        JavaOnlyMap javaOnlyMap = this.f11778h;
        if (javaOnlyMap != null) {
            str = javaOnlyMap.toString();
        }
        sb2.append(str);
        return sb2.toString();
    }

    public void h(int i11, UIManager uIManager) {
        if (this.f11775e == -1) {
            this.f11775e = i11;
            this.f11779i = uIManager;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.f11718d + " is already attached to a view: " + this.f11775e);
    }

    public void i(int i11) {
        int i12 = this.f11775e;
        if (i12 != i11 && i12 != -1) {
            throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node: " + i11 + " but is connected to view " + this.f11775e);
        }
        this.f11775e = -1;
    }

    public void j() {
        int i11 = this.f11775e;
        if (i11 == -1 || og.a.a(i11) == 2) {
            return;
        }
        ReadableMapKeySetIterator keySetIterator = this.f11778h.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            this.f11778h.putNull(keySetIterator.nextKey());
        }
        this.f11779i.synchronouslyUpdateViewOnUIThread(this.f11775e, this.f11778h);
    }

    public final void k() {
        if (this.f11775e == -1) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.f11777g.entrySet()) {
            b n11 = this.f11776f.n(entry.getValue().intValue());
            if (n11 != null) {
                if (n11 instanceof o) {
                    ((o) n11).h(this.f11778h);
                } else if (n11 instanceof s) {
                    s sVar = (s) n11;
                    Object j11 = sVar.j();
                    if (j11 instanceof String) {
                        this.f11778h.putString(entry.getKey(), (String) j11);
                    } else {
                        this.f11778h.putDouble(entry.getKey(), sVar.k());
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + n11.getClass());
                }
            } else {
                throw new IllegalArgumentException("Mapped property node does not exists");
            }
        }
        this.f11779i.synchronouslyUpdateViewOnUIThread(this.f11775e, this.f11778h);
    }
}