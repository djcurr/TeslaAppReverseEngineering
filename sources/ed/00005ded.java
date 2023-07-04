package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.Utils;

/* loaded from: classes6.dex */
public class JSCallNode extends Node {
    private final int[] mInputIDs;

    public JSCallNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
        super(i11, readableMap, nodesManager);
        this.mInputIDs = Utils.processIntArray(readableMap.getArray("input"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.Node
    public Double evaluate() {
        WritableArray createArray = Arguments.createArray();
        int i11 = 0;
        while (true) {
            int[] iArr = this.mInputIDs;
            if (i11 < iArr.length) {
                Node findNodeById = this.mNodesManager.findNodeById(iArr[i11], Node.class);
                if (findNodeById.value() == null) {
                    createArray.pushNull();
                } else {
                    Object value = findNodeById.value();
                    if (value instanceof String) {
                        createArray.pushString((String) value);
                    } else {
                        createArray.pushDouble(findNodeById.doubleValue().doubleValue());
                    }
                }
                i11++;
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", this.mNodeID);
                createMap.putArray("args", createArray);
                this.mNodesManager.sendEvent("onReanimatedCall", createMap);
                return Node.ZERO;
            }
        }
    }
}