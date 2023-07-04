package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.j0;
import java.util.Map;

/* loaded from: classes3.dex */
class m0 implements l0 {
    private static <K, V> int a(int i11, Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        j0 j0Var = (j0) obj2;
        int i12 = 0;
        if (k0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : k0Var.entrySet()) {
            i12 += j0Var.a(i11, entry.getKey(), entry.getValue());
        }
        return i12;
    }

    private static <K, V> k0<K, V> b(Object obj, Object obj2) {
        k0<K, V> k0Var = (k0) obj;
        k0<K, V> k0Var2 = (k0) obj2;
        if (!k0Var2.isEmpty()) {
            if (!k0Var.j()) {
                k0Var = k0Var.m();
            }
            k0Var.l(k0Var2);
        }
        return k0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l0
    public Map<?, ?> forMapData(Object obj) {
        return (k0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l0
    public j0.a<?, ?> forMapMetadata(Object obj) {
        return ((j0) obj).c();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l0
    public Map<?, ?> forMutableMapData(Object obj) {
        return (k0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l0
    public int getSerializedSize(int i11, Object obj, Object obj2) {
        return a(i11, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l0
    public boolean isImmutable(Object obj) {
        return !((k0) obj).j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l0
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l0
    public Object newMapField(Object obj) {
        return k0.e().m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l0
    public Object toImmutable(Object obj) {
        ((k0) obj).k();
        return obj;
    }
}