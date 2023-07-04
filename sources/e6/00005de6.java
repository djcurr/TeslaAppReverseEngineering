package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.Utils;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes6.dex */
public class ConcatNode extends Node {
    private static final NumberFormat sFormatter;
    private final int[] mInputIDs;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
        sFormatter = numberFormat;
        numberFormat.setMinimumFractionDigits(0);
        numberFormat.setGroupingUsed(false);
    }

    public ConcatNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
        super(i11, readableMap, nodesManager);
        this.mInputIDs = Utils.processIntArray(readableMap.getArray("input"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.Node
    public String evaluate() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int[] iArr = this.mInputIDs;
            if (i11 < iArr.length) {
                Object value = this.mNodesManager.findNodeById(iArr[i11], Node.class).value();
                if (value instanceof Double) {
                    value = sFormatter.format((Double) value);
                }
                sb2.append(value);
                i11++;
            } else {
                return sb2.toString();
            }
        }
    }
}