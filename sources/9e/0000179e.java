package com.facebook.react.animated;

import com.adyen.checkout.components.model.payments.request.Address;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class r extends com.facebook.react.animated.b {

    /* renamed from: e  reason: collision with root package name */
    private final l f11807e;

    /* renamed from: f  reason: collision with root package name */
    private final List<d> f11808f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b extends d {

        /* renamed from: b  reason: collision with root package name */
        public int f11809b;

        private b(r rVar) {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c extends d {

        /* renamed from: b  reason: collision with root package name */
        public double f11810b;

        private c(r rVar) {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public String f11811a;

        private d(r rVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(ReadableMap readableMap, l lVar) {
        ReadableArray array = readableMap.getArray("transforms");
        this.f11808f = new ArrayList(array.size());
        for (int i11 = 0; i11 < array.size(); i11++) {
            ReadableMap map = array.getMap(i11);
            String string = map.getString("property");
            if (map.getString("type").equals("animated")) {
                b bVar = new b();
                bVar.f11811a = string;
                bVar.f11809b = map.getInt("nodeTag");
                this.f11808f.add(bVar);
            } else {
                c cVar = new c();
                cVar.f11811a = string;
                cVar.f11810b = map.getDouble("value");
                this.f11808f.add(cVar);
            }
        }
        this.f11807e = lVar;
    }

    @Override // com.facebook.react.animated.b
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TransformAnimatedNode[");
        sb2.append(this.f11718d);
        sb2.append("]: mTransformConfigs: ");
        List<d> list = this.f11808f;
        sb2.append(list != null ? list.toString() : Address.ADDRESS_NULL_PLACEHOLDER);
        return sb2.toString();
    }

    public void h(JavaOnlyMap javaOnlyMap) {
        double d11;
        ArrayList arrayList = new ArrayList(this.f11808f.size());
        for (d dVar : this.f11808f) {
            if (dVar instanceof b) {
                com.facebook.react.animated.b n11 = this.f11807e.n(((b) dVar).f11809b);
                if (n11 != null) {
                    if (n11 instanceof s) {
                        d11 = ((s) n11).k();
                    } else {
                        throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + n11.getClass());
                    }
                } else {
                    throw new IllegalArgumentException("Mapped style node does not exists");
                }
            } else {
                d11 = ((c) dVar).f11810b;
            }
            arrayList.add(JavaOnlyMap.of(dVar.f11811a, Double.valueOf(d11)));
        }
        javaOnlyMap.putArray("transform", JavaOnlyArray.from(arrayList));
    }
}