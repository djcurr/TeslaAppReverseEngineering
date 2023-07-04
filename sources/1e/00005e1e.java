package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.swmansion.reanimated.NodesManager;

/* loaded from: classes6.dex */
public class ValueNode extends Node {
    private Object mValue;

    public ValueNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
        super(i11, readableMap, nodesManager);
        if (readableMap != null && readableMap.hasKey("value")) {
            ReadableType type = readableMap.getType("value");
            if (type == ReadableType.String) {
                this.mValue = readableMap.getString("value");
                return;
            } else if (type == ReadableType.Number) {
                this.mValue = Double.valueOf(readableMap.getDouble("value"));
                return;
            } else if (type == ReadableType.Null) {
                this.mValue = null;
                return;
            } else {
                throw new IllegalStateException("Not supported value type. Must be boolean, number or string");
            }
        }
        this.mValue = null;
    }

    @Override // com.swmansion.reanimated.nodes.Node
    protected Object evaluate() {
        return this.mValue;
    }

    public void setValue(Object obj) {
        this.mValue = obj;
        forceUpdateMemoizedValue(obj);
    }
}