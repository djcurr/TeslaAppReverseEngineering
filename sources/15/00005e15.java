package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.r0;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.Utils;
import java.util.Map;

/* loaded from: classes6.dex */
public class PropsNode extends Node implements FinalNode {
    private int mConnectedViewTag;
    private final e0 mDiffMap;
    private final Map<String, Integer> mMapping;
    private final JavaOnlyMap mPropMap;
    private final r0 mUIImplementation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.swmansion.reanimated.nodes.PropsNode$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PropsNode(int i11, ReadableMap readableMap, NodesManager nodesManager, r0 r0Var) {
        super(i11, readableMap, nodesManager);
        this.mConnectedViewTag = -1;
        this.mMapping = Utils.processMapping(readableMap.getMap("props"));
        this.mUIImplementation = r0Var;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        this.mPropMap = javaOnlyMap;
        this.mDiffMap = new e0(javaOnlyMap);
    }

    private static void addProp(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
        } else if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
        } else if (obj instanceof WritableArray) {
            writableMap.putArray(str, (WritableArray) obj);
        } else if (obj instanceof WritableMap) {
            writableMap.putMap(str, (WritableMap) obj);
        } else {
            throw new IllegalStateException("Unknown type of animated value");
        }
    }

    public void connectToView(int i11) {
        this.mConnectedViewTag = i11;
        dangerouslyRescheduleEvaluate();
    }

    public void disconnectFromView(int i11) {
        this.mConnectedViewTag = -1;
    }

    @Override // com.swmansion.reanimated.nodes.FinalNode
    public void update() {
        if (this.mConnectedViewTag == -1) {
            return;
        }
        value();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.Node
    public Double evaluate() {
        boolean z11;
        boolean z12;
        boolean z13;
        WritableMap writableMap;
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        for (Map.Entry<String, Integer> entry : this.mMapping.entrySet()) {
            Node findNodeById = this.mNodesManager.findNodeById(entry.getValue().intValue(), Node.class);
            if (findNodeById instanceof StyleNode) {
                WritableMap writableMap2 = (WritableMap) findNodeById.value();
                ReadableMapKeySetIterator keySetIterator = writableMap2.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    if (this.mNodesManager.uiProps.contains(nextKey)) {
                        writableMap = this.mPropMap;
                        z12 = z16;
                        z11 = z15;
                        z13 = true;
                    } else if (this.mNodesManager.nativeProps.contains(nextKey)) {
                        z13 = z14;
                        z12 = z16;
                        z11 = true;
                        writableMap = createMap2;
                    } else {
                        z11 = z15;
                        z12 = true;
                        z13 = z14;
                        writableMap = createMap;
                    }
                    ReadableType type = writableMap2.getType(nextKey);
                    int i11 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[type.ordinal()];
                    if (i11 == 1) {
                        writableMap.putDouble(nextKey, writableMap2.getDouble(nextKey));
                    } else if (i11 == 2) {
                        writableMap.putString(nextKey, writableMap2.getString(nextKey));
                    } else if (i11 == 3) {
                        writableMap.putArray(nextKey, (WritableArray) writableMap2.getArray(nextKey));
                    } else {
                        throw new IllegalArgumentException("Unexpected type " + type);
                    }
                    z14 = z13;
                    z15 = z11;
                    z16 = z12;
                }
                continue;
            } else {
                String key = entry.getKey();
                Object value = findNodeById.value();
                if (this.mNodesManager.uiProps.contains(key)) {
                    addProp(this.mPropMap, key, value);
                    z14 = true;
                } else {
                    addProp(createMap2, key, value);
                    z15 = true;
                }
            }
        }
        int i12 = this.mConnectedViewTag;
        if (i12 != -1) {
            if (z14) {
                this.mUIImplementation.a0(i12, this.mDiffMap);
            }
            if (z15) {
                this.mNodesManager.enqueueUpdateViewOnNativeThread(this.mConnectedViewTag, createMap2, false);
            }
            if (z16) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putInt("viewTag", this.mConnectedViewTag);
                createMap3.putMap("props", createMap);
                this.mNodesManager.sendEvent("onReanimatedPropsChange", createMap3);
            }
        }
        return Node.ZERO;
    }
}