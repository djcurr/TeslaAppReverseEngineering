package com.facebook.react.bridge;

import androidx.core.util.Pools$SimplePool;

/* loaded from: classes3.dex */
public class DynamicFromMap implements Dynamic {
    private static final ThreadLocal<Pools$SimplePool<DynamicFromMap>> sPool = new ThreadLocal<Pools$SimplePool<DynamicFromMap>>() { // from class: com.facebook.react.bridge.DynamicFromMap.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Pools$SimplePool<DynamicFromMap> initialValue() {
            return new Pools$SimplePool<>(10);
        }
    };
    private ReadableMap mMap;
    private String mName;

    private DynamicFromMap() {
    }

    public static DynamicFromMap create(ReadableMap readableMap, String str) {
        DynamicFromMap b11 = sPool.get().b();
        if (b11 == null) {
            b11 = new DynamicFromMap();
        }
        b11.mMap = readableMap;
        b11.mName = str;
        return b11;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableArray asArray() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getArray(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getBoolean(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getDouble(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getInt(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableMap asMap() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getMap(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public String asString() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getString(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getType(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.isNull(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.mMap = null;
        this.mName = null;
        sPool.get().a(this);
    }
}