package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.MapUtils;
import com.swmansion.reanimated.NodesManager;

/* loaded from: classes6.dex */
public abstract class ClockOpNode extends Node {
    private int clockID;

    /* loaded from: classes6.dex */
    public static class ClockStartNode extends ClockOpNode {
        public ClockStartNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
            super(i11, readableMap, nodesManager);
        }

        @Override // com.swmansion.reanimated.nodes.ClockOpNode
        protected Double eval(Node node) {
            if (node instanceof ParamNode) {
                ((ParamNode) node).start();
            } else {
                ((ClockNode) node).start();
            }
            return Node.ZERO;
        }

        @Override // com.swmansion.reanimated.nodes.ClockOpNode, com.swmansion.reanimated.nodes.Node
        protected /* bridge */ /* synthetic */ Object evaluate() {
            return super.evaluate();
        }
    }

    /* loaded from: classes6.dex */
    public static class ClockStopNode extends ClockOpNode {
        public ClockStopNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
            super(i11, readableMap, nodesManager);
        }

        @Override // com.swmansion.reanimated.nodes.ClockOpNode
        protected Double eval(Node node) {
            if (node instanceof ParamNode) {
                ((ParamNode) node).stop();
            } else {
                ((ClockNode) node).stop();
            }
            return Node.ZERO;
        }

        @Override // com.swmansion.reanimated.nodes.ClockOpNode, com.swmansion.reanimated.nodes.Node
        protected /* bridge */ /* synthetic */ Object evaluate() {
            return super.evaluate();
        }
    }

    /* loaded from: classes6.dex */
    public static class ClockTestNode extends ClockOpNode {
        public ClockTestNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
            super(i11, readableMap, nodesManager);
        }

        @Override // com.swmansion.reanimated.nodes.ClockOpNode
        protected Double eval(Node node) {
            if (node instanceof ParamNode) {
                return Double.valueOf(((ParamNode) node).isRunning() ? 1.0d : 0.0d);
            }
            return Double.valueOf(((ClockNode) node).isRunning ? 1.0d : 0.0d);
        }

        @Override // com.swmansion.reanimated.nodes.ClockOpNode, com.swmansion.reanimated.nodes.Node
        protected /* bridge */ /* synthetic */ Object evaluate() {
            return super.evaluate();
        }
    }

    public ClockOpNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
        super(i11, readableMap, nodesManager);
        this.clockID = MapUtils.getInt(readableMap, "clock", "Reanimated: Argument passed to clock node is either of wrong type or is missing.");
    }

    protected abstract Double eval(Node node);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.Node
    public Double evaluate() {
        return eval(this.mNodesManager.findNodeById(this.clockID, Node.class));
    }
}