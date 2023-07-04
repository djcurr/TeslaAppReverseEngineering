package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.UpdateContext;
import java.util.Stack;

/* loaded from: classes6.dex */
public class ParamNode extends ValueNode {
    private final Stack<Integer> mArgsStack;
    private String mPrevCallID;

    public ParamNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
        super(i11, readableMap, nodesManager);
        this.mArgsStack = new Stack<>();
    }

    public void beginContext(Integer num, String str) {
        this.mPrevCallID = str;
        this.mArgsStack.push(num);
    }

    public void endContext() {
        this.mArgsStack.pop();
    }

    @Override // com.swmansion.reanimated.nodes.ValueNode, com.swmansion.reanimated.nodes.Node
    protected Object evaluate() {
        UpdateContext updateContext = this.mUpdateContext;
        String str = updateContext.callID;
        updateContext.callID = this.mPrevCallID;
        Object value = this.mNodesManager.findNodeById(this.mArgsStack.peek().intValue(), Node.class).value();
        this.mUpdateContext.callID = str;
        return value;
    }

    public boolean isRunning() {
        Node findNodeById = this.mNodesManager.findNodeById(this.mArgsStack.peek().intValue(), Node.class);
        if (findNodeById instanceof ParamNode) {
            return ((ParamNode) findNodeById).isRunning();
        }
        return ((ClockNode) findNodeById).isRunning;
    }

    @Override // com.swmansion.reanimated.nodes.ValueNode
    public void setValue(Object obj) {
        Node findNodeById = this.mNodesManager.findNodeById(this.mArgsStack.peek().intValue(), Node.class);
        UpdateContext updateContext = this.mUpdateContext;
        String str = updateContext.callID;
        updateContext.callID = this.mPrevCallID;
        ((ValueNode) findNodeById).setValue(obj);
        this.mUpdateContext.callID = str;
        forceUpdateMemoizedValue(obj);
    }

    public void start() {
        Node findNodeById = this.mNodesManager.findNodeById(this.mArgsStack.peek().intValue(), Node.class);
        if (findNodeById instanceof ParamNode) {
            ((ParamNode) findNodeById).start();
        } else {
            ((ClockNode) findNodeById).start();
        }
    }

    public void stop() {
        Node findNodeById = this.mNodesManager.findNodeById(this.mArgsStack.peek().intValue(), Node.class);
        if (findNodeById instanceof ParamNode) {
            ((ParamNode) findNodeById).stop();
        } else {
            ((ClockNode) findNodeById).stop();
        }
    }
}