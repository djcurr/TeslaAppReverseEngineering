package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.UpdateContext;
import com.swmansion.reanimated.Utils;

/* loaded from: classes6.dex */
public class CallFuncNode extends Node {
    private final int[] mArgs;
    private final int[] mParams;
    private String mPreviousCallID;
    private final int mWhatNodeID;

    public CallFuncNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
        super(i11, readableMap, nodesManager);
        this.mWhatNodeID = readableMap.getInt("what");
        this.mParams = Utils.processIntArray(readableMap.getArray("params"));
        this.mArgs = Utils.processIntArray(readableMap.getArray("args"));
    }

    private void beginContext() {
        UpdateContext updateContext = this.mNodesManager.updateContext;
        this.mPreviousCallID = updateContext.callID;
        updateContext.callID = this.mNodesManager.updateContext.callID + '/' + String.valueOf(this.mNodeID);
        int i11 = 0;
        while (true) {
            int[] iArr = this.mParams;
            if (i11 >= iArr.length) {
                return;
            }
            ((ParamNode) this.mNodesManager.findNodeById(iArr[i11], ParamNode.class)).beginContext(Integer.valueOf(this.mArgs[i11]), this.mPreviousCallID);
            i11++;
        }
    }

    private void endContext() {
        int i11 = 0;
        while (true) {
            int[] iArr = this.mParams;
            if (i11 < iArr.length) {
                ((ParamNode) this.mNodesManager.findNodeById(iArr[i11], ParamNode.class)).endContext();
                i11++;
            } else {
                this.mNodesManager.updateContext.callID = this.mPreviousCallID;
                return;
            }
        }
    }

    @Override // com.swmansion.reanimated.nodes.Node
    protected Object evaluate() {
        beginContext();
        Object value = this.mNodesManager.findNodeById(this.mWhatNodeID, Node.class).value();
        endContext();
        return value;
    }
}