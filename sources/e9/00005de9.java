package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.NodesManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class EventNode extends Node implements RCTEventEmitter {
    private final List<EventMap> mMapping;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class EventMap {
        private final int nodeID;
        private final String[] path;

        public EventMap(ReadableArray readableArray) {
            int size = readableArray.size() - 1;
            this.path = new String[size];
            for (int i11 = 0; i11 < size; i11++) {
                this.path[i11] = readableArray.getString(i11);
            }
            this.nodeID = readableArray.getInt(size);
        }

        public Double lookupValue(ReadableMap readableMap) {
            int i11 = 0;
            while (readableMap != null) {
                String[] strArr = this.path;
                if (i11 >= strArr.length - 1) {
                    break;
                }
                String str = strArr[i11];
                readableMap = readableMap.hasKey(str) ? readableMap.getMap(str) : null;
                i11++;
            }
            if (readableMap != null) {
                String[] strArr2 = this.path;
                String str2 = strArr2[strArr2.length - 1];
                if (readableMap.hasKey(str2)) {
                    return Double.valueOf(readableMap.getDouble(str2));
                }
                return null;
            }
            return null;
        }
    }

    public EventNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
        super(i11, readableMap, nodesManager);
        this.mMapping = processMapping(readableMap.getArray("argMapping"));
    }

    private static List<EventMap> processMapping(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new EventMap(readableArray.getArray(i11)));
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i11, String str, WritableMap writableMap) {
        if (writableMap != null) {
            for (int i12 = 0; i12 < this.mMapping.size(); i12++) {
                EventMap eventMap = this.mMapping.get(i12);
                Double lookupValue = eventMap.lookupValue(writableMap);
                if (lookupValue != null) {
                    ((ValueNode) this.mNodesManager.findNodeById(eventMap.nodeID, ValueNode.class)).setValue(lookupValue);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Animated events must have event data.");
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by animated events");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.Node
    public Double evaluate() {
        return Node.ZERO;
    }
}