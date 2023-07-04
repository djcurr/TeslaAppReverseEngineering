package com.swmansion.reanimated.nodes;

import android.graphics.PointF;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.MapUtils;
import com.swmansion.reanimated.NodesManager;

/* loaded from: classes6.dex */
public class BezierNode extends Node {
    private final int mInputID;
    private final CubicBezierInterpolator mInterpolator;

    public BezierNode(int i11, ReadableMap readableMap, NodesManager nodesManager) {
        super(i11, readableMap, nodesManager);
        this.mInputID = MapUtils.getInt(readableMap, "input", "Reanimated: Argument passed to bezier node is either of wrong type or is missing.");
        this.mInterpolator = new CubicBezierInterpolator((float) readableMap.getDouble("mX1"), (float) readableMap.getDouble("mY1"), (float) readableMap.getDouble("mX2"), (float) readableMap.getDouble("mY2"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.Node
    public Double evaluate() {
        return Double.valueOf(this.mInterpolator.getInterpolation(((Double) this.mNodesManager.getNodeValue(this.mInputID)).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class CubicBezierInterpolator {

        /* renamed from: a  reason: collision with root package name */
        protected PointF f21218a;

        /* renamed from: b  reason: collision with root package name */
        protected PointF f21219b;

        /* renamed from: c  reason: collision with root package name */
        protected PointF f21220c;
        protected PointF end;
        protected PointF start;

        public CubicBezierInterpolator(PointF pointF, PointF pointF2) {
            this.f21218a = new PointF();
            this.f21219b = new PointF();
            this.f21220c = new PointF();
            this.start = pointF;
            this.end = pointF2;
        }

        private float getBezierCoordinateX(float f11) {
            PointF pointF = this.f21220c;
            PointF pointF2 = this.start;
            float f12 = pointF2.x * 3.0f;
            pointF.x = f12;
            PointF pointF3 = this.f21219b;
            float f13 = ((this.end.x - pointF2.x) * 3.0f) - f12;
            pointF3.x = f13;
            PointF pointF4 = this.f21218a;
            float f14 = (1.0f - pointF.x) - f13;
            pointF4.x = f14;
            return f11 * (pointF.x + ((pointF3.x + (f14 * f11)) * f11));
        }

        private float getXDerivate(float f11) {
            return this.f21220c.x + (f11 * ((this.f21219b.x * 2.0f) + (this.f21218a.x * 3.0f * f11)));
        }

        protected float getBezierCoordinateY(float f11) {
            PointF pointF = this.f21220c;
            PointF pointF2 = this.start;
            float f12 = pointF2.y * 3.0f;
            pointF.y = f12;
            PointF pointF3 = this.f21219b;
            float f13 = ((this.end.y - pointF2.y) * 3.0f) - f12;
            pointF3.y = f13;
            PointF pointF4 = this.f21218a;
            float f14 = (1.0f - pointF.y) - f13;
            pointF4.y = f14;
            return f11 * (pointF.y + ((pointF3.y + (f14 * f11)) * f11));
        }

        public float getInterpolation(float f11) {
            return getBezierCoordinateY(getXForTime(f11));
        }

        protected float getXForTime(float f11) {
            float f12 = f11;
            for (int i11 = 1; i11 < 14; i11++) {
                float bezierCoordinateX = getBezierCoordinateX(f12) - f11;
                if (Math.abs(bezierCoordinateX) < 0.001d) {
                    break;
                }
                f12 -= bezierCoordinateX / getXDerivate(f12);
            }
            return f12;
        }

        public CubicBezierInterpolator(float f11, float f12, float f13, float f14) {
            this(new PointF(f11, f12), new PointF(f13, f14));
        }
    }
}