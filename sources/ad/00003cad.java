package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.Map;

/* loaded from: classes2.dex */
class MapFieldSchemaFull implements MapFieldSchema {
    MapFieldSchemaFull() {
    }

    private static <K, V> int getSerializedSizeFull(int i11, Object obj, Object obj2) {
        int i12 = 0;
        if (obj == null) {
            return 0;
        }
        Map<K, V> map = ((MapField) obj).getMap();
        MapEntry mapEntry = (MapEntry) obj2;
        if (map.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i12 += CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(MapEntryLite.computeSerializedSize(mapEntry.getMetadata(), entry.getKey(), entry.getValue()));
        }
        return i12;
    }

    private static <K, V> Object mergeFromFull(Object obj, Object obj2) {
        MapField mapField = (MapField) obj;
        MapField<K, V> mapField2 = (MapField) obj2;
        if (!mapField.isMutable()) {
            mapField.copy();
        }
        mapField.mergeFrom(mapField2);
        return mapField;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public Map<?, ?> forMapData(Object obj) {
        return ((MapField) obj).getMap();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public MapEntryLite.Metadata<?, ?> forMapMetadata(Object obj) {
        return ((MapEntry) obj).getMetadata();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public Map<?, ?> forMutableMapData(Object obj) {
        return ((MapField) obj).getMutableMap();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public int getSerializedSize(int i11, Object obj, Object obj2) {
        return getSerializedSizeFull(i11, obj, obj2);
    }

    @Override // com.google.protobuf.MapFieldSchema
    public boolean isImmutable(Object obj) {
        return !((MapField) obj).isMutable();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public Object mergeFrom(Object obj, Object obj2) {
        return mergeFromFull(obj, obj2);
    }

    @Override // com.google.protobuf.MapFieldSchema
    public Object newMapField(Object obj) {
        return MapField.newMapField((MapEntry) obj);
    }

    @Override // com.google.protobuf.MapFieldSchema
    public Object toImmutable(Object obj) {
        ((MapField) obj).makeImmutable();
        return obj;
    }
}