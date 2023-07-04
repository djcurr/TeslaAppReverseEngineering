package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.Utils;

/* loaded from: classes6.dex */
public class OperatorNode extends Node {
    private final int[] mInputIDs;
    private final Node[] mInputNodes;
    private final Operator mOperator;
    private static final Operator ADD = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.1
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d11, Double d12) {
            return d11.doubleValue() + d12.doubleValue();
        }
    };
    private static final Operator SUB = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.2
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d11, Double d12) {
            return d11.doubleValue() - d12.doubleValue();
        }
    };
    private static final Operator MULTIPLY = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.3
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d11, Double d12) {
            return d11.doubleValue() * d12.doubleValue();
        }
    };
    private static final Operator DIVIDE = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.4
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d11, Double d12) {
            return d11.doubleValue() / d12.doubleValue();
        }
    };
    private static final Operator POW = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.5
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d11, Double d12) {
            return Math.pow(d11.doubleValue(), d12.doubleValue());
        }
    };
    private static final Operator MODULO = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.6
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d11, Double d12) {
            return ((d11.doubleValue() % d12.doubleValue()) + d12.doubleValue()) % d12.doubleValue();
        }
    };
    private static final Operator SQRT = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.7
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.sqrt(d11.doubleValue());
        }
    };
    private static final Operator LOG = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.8
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.log(d11.doubleValue());
        }
    };
    private static final Operator SIN = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.9
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.sin(d11.doubleValue());
        }
    };
    private static final Operator COS = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.10
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.cos(d11.doubleValue());
        }
    };
    private static final Operator TAN = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.11
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.tan(d11.doubleValue());
        }
    };
    private static final Operator ACOS = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.12
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.acos(d11.doubleValue());
        }
    };
    private static final Operator ASIN = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.13
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.asin(d11.doubleValue());
        }
    };
    private static final Operator ATAN = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.14
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.atan(d11.doubleValue());
        }
    };
    private static final Operator EXP = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.15
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.exp(d11.doubleValue());
        }
    };
    private static final Operator ROUND = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.16
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.round(d11.doubleValue());
        }
    };
    private static final Operator ABS = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.17
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.abs(d11.doubleValue());
        }
    };
    private static final Operator FLOOR = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.18
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.floor(d11.doubleValue());
        }
    };
    private static final Operator CEIL = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.19
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d11) {
            return Math.ceil(d11.doubleValue());
        }
    };
    private static final Operator MIN = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.20
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d11, Double d12) {
            return Math.min(d11.doubleValue(), d12.doubleValue());
        }
    };
    private static final Operator MAX = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.21
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d11, Double d12) {
            return Math.max(d11.doubleValue(), d12.doubleValue());
        }
    };
    private static final Operator AND = new Operator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.22
        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            boolean truthy = OperatorNode.truthy(nodeArr[0].value());
            for (int i11 = 1; i11 < nodeArr.length && truthy; i11++) {
                truthy = truthy && OperatorNode.truthy(nodeArr[i11].value());
            }
            return truthy ? 1.0d : 0.0d;
        }
    };
    private static final Operator OR = new Operator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.23
        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            boolean truthy = OperatorNode.truthy(nodeArr[0].value());
            for (int i11 = 1; i11 < nodeArr.length && !truthy; i11++) {
                truthy = truthy || OperatorNode.truthy(nodeArr[i11].value());
            }
            return truthy ? 1.0d : 0.0d;
        }
    };
    private static final Operator NOT = new Operator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.24
        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            return OperatorNode.truthy(nodeArr[0].value()) ? 0.0d : 1.0d;
        }
    };
    private static final Operator DEFINED = new Operator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.25
        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            Object value = nodeArr[0].value();
            return (value == null || ((value instanceof Double) && ((Double) value).isNaN())) ? 0.0d : 1.0d;
        }
    };
    private static final Operator LESS_THAN = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.26
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d11, Double d12) {
            return (d11 == null || d12 == null || d11.doubleValue() >= d12.doubleValue()) ? false : true;
        }
    };
    private static final Operator EQ = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.27
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d11, Double d12) {
            return (d11 == null || d12 == null) ? d11 == d12 : d11.doubleValue() == d12.doubleValue();
        }
    };
    private static final Operator GREATER_THAN = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.28
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d11, Double d12) {
            return (d11 == null || d12 == null || d11.doubleValue() <= d12.doubleValue()) ? false : true;
        }
    };
    private static final Operator LESS_OR_EQ = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.29
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d11, Double d12) {
            return d11.doubleValue() <= d12.doubleValue();
        }
    };
    private static final Operator GREATER_OR_EQ = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.30
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d11, Double d12) {
            return d11.doubleValue() >= d12.doubleValue();
        }
    };
    private static final Operator NEQ = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.31
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d11, Double d12) {
            return (d11 == null || d12 == null) ? d11 == d12 : d11.doubleValue() != d12.doubleValue();
        }
    };

    /* loaded from: classes6.dex */
    private static abstract class CompOperator implements Operator {
        private CompOperator() {
        }

        public abstract boolean eval(Double d11, Double d12);

        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            return eval((Double) nodeArr[0].value(), (Double) nodeArr[1].value()) ? 1.0d : 0.0d;
        }
    }

    /* loaded from: classes6.dex */
    private interface Operator {
        double evaluate(Node[] nodeArr);
    }

    /* loaded from: classes6.dex */
    private static abstract class ReduceOperator implements Operator {
        private ReduceOperator() {
        }

        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            double doubleValue = nodeArr[0].doubleValue().doubleValue();
            for (int i11 = 1; i11 < nodeArr.length; i11++) {
                doubleValue = reduce(Double.valueOf(doubleValue), nodeArr[i11].doubleValue());
            }
            return doubleValue;
        }

        public abstract double reduce(Double d11, Double d12);
    }

    /* loaded from: classes6.dex */
    private static abstract class SingleOperator implements Operator {
        private SingleOperator() {
        }

        public abstract double eval(Double d11);

        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            return eval((Double) nodeArr[0].value());
        }
    }

    public OperatorNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
        super(i11, readableMap, nodesManager);
        int[] processIntArray = Utils.processIntArray(readableMap.getArray("input"));
        this.mInputIDs = processIntArray;
        this.mInputNodes = new Node[processIntArray.length];
        String string = readableMap.getString("op");
        if ("add".equals(string)) {
            this.mOperator = ADD;
        } else if ("sub".equals(string)) {
            this.mOperator = SUB;
        } else if ("multiply".equals(string)) {
            this.mOperator = MULTIPLY;
        } else if ("divide".equals(string)) {
            this.mOperator = DIVIDE;
        } else if ("pow".equals(string)) {
            this.mOperator = POW;
        } else if ("modulo".equals(string)) {
            this.mOperator = MODULO;
        } else if ("sqrt".equals(string)) {
            this.mOperator = SQRT;
        } else if ("log".equals(string)) {
            this.mOperator = LOG;
        } else if ("sin".equals(string)) {
            this.mOperator = SIN;
        } else if ("cos".equals(string)) {
            this.mOperator = COS;
        } else if ("tan".equals(string)) {
            this.mOperator = TAN;
        } else if ("acos".equals(string)) {
            this.mOperator = ACOS;
        } else if ("asin".equals(string)) {
            this.mOperator = ASIN;
        } else if ("atan".equals(string)) {
            this.mOperator = ATAN;
        } else if ("exp".equals(string)) {
            this.mOperator = EXP;
        } else if ("round".equals(string)) {
            this.mOperator = ROUND;
        } else if ("and".equals(string)) {
            this.mOperator = AND;
        } else if ("or".equals(string)) {
            this.mOperator = OR;
        } else if ("not".equals(string)) {
            this.mOperator = NOT;
        } else if ("defined".equals(string)) {
            this.mOperator = DEFINED;
        } else if ("lessThan".equals(string)) {
            this.mOperator = LESS_THAN;
        } else if ("eq".equals(string)) {
            this.mOperator = EQ;
        } else if ("greaterThan".equals(string)) {
            this.mOperator = GREATER_THAN;
        } else if ("lessOrEq".equals(string)) {
            this.mOperator = LESS_OR_EQ;
        } else if ("greaterOrEq".equals(string)) {
            this.mOperator = GREATER_OR_EQ;
        } else if ("neq".equals(string)) {
            this.mOperator = NEQ;
        } else if ("abs".equals(string)) {
            this.mOperator = ABS;
        } else if (PlaceTypes.FLOOR.equals(string)) {
            this.mOperator = FLOOR;
        } else if ("ceil".equals(string)) {
            this.mOperator = CEIL;
        } else if ("max".equals(string)) {
            this.mOperator = MAX;
        } else if ("min".equals(string)) {
            this.mOperator = MIN;
        } else {
            throw new JSApplicationIllegalArgumentException("Unrecognized operator " + string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean truthy(Object obj) {
        return (obj == null || obj.equals(Double.valueOf(0.0d))) ? false : true;
    }

    @Override // com.swmansion.reanimated.nodes.Node
    protected Object evaluate() {
        int i11 = 0;
        while (true) {
            int[] iArr = this.mInputIDs;
            if (i11 < iArr.length) {
                this.mInputNodes[i11] = this.mNodesManager.findNodeById(iArr[i11], Node.class);
                i11++;
            } else {
                return Double.valueOf(this.mOperator.evaluate(this.mInputNodes));
            }
        }
    }
}