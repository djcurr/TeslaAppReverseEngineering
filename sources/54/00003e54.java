package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.j;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.lang.reflect.Array;
import java.util.Locale;

/* loaded from: classes2.dex */
class RenderableViewManager extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final double EPSILON = 1.0E-5d;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private final String mClassName;
    private final e svgClass;
    private static final c sMatrixDecompositionContext = new c();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* loaded from: classes2.dex */
    static class CircleViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public CircleViewManager() {
            super(e.RNSVGCircle, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, View view) {
            super.addEventEmitters(n0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.c0 createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ View createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
            return super.createViewInstance(n0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @ng.a(name = "cx")
        public void setCx(com.horcrux.svg.b bVar, Dynamic dynamic) {
            bVar.setCx(dynamic);
        }

        @ng.a(name = "cy")
        public void setCy(com.horcrux.svg.b bVar, Dynamic dynamic) {
            bVar.setCy(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ng.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @ng.a(name = "r")
        public void setR(com.horcrux.svg.b bVar, Dynamic dynamic) {
            bVar.setR(dynamic);
        }
    }

    /* loaded from: classes2.dex */
    static class ClipPathViewManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ClipPathViewManager() {
            super(e.RNSVGClipPath);
        }
    }

    /* loaded from: classes2.dex */
    static class DefsViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public DefsViewManager() {
            super(e.RNSVGDefs, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, View view) {
            super.addEventEmitters(n0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.c0 createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ View createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
            return super.createViewInstance(n0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ng.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }
    }

    /* loaded from: classes2.dex */
    static class EllipseViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public EllipseViewManager() {
            super(e.RNSVGEllipse, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, View view) {
            super.addEventEmitters(n0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.c0 createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ View createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
            return super.createViewInstance(n0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @ng.a(name = "cx")
        public void setCx(g gVar, Dynamic dynamic) {
            gVar.setCx(dynamic);
        }

        @ng.a(name = "cy")
        public void setCy(g gVar, Dynamic dynamic) {
            gVar.setCy(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ng.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @ng.a(name = "rx")
        public void setRx(g gVar, Dynamic dynamic) {
            gVar.setRx(dynamic);
        }

        @ng.a(name = "ry")
        public void setRy(g gVar, Dynamic dynamic) {
            gVar.setRy(dynamic);
        }
    }

    /* loaded from: classes2.dex */
    static class ForeignObjectManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ForeignObjectManager() {
            super(e.RNSVGForeignObject);
        }

        @ng.a(name = Snapshot.HEIGHT)
        public void setHeight(i iVar, Dynamic dynamic) {
            iVar.setHeight(dynamic);
        }

        @ng.a(name = Snapshot.WIDTH)
        public void setWidth(i iVar, Dynamic dynamic) {
            iVar.setWidth(dynamic);
        }

        @ng.a(name = "x")
        public void setX(i iVar, Dynamic dynamic) {
            iVar.setX(dynamic);
        }

        @ng.a(name = "y")
        public void setY(i iVar, Dynamic dynamic) {
            iVar.setY(dynamic);
        }
    }

    /* loaded from: classes2.dex */
    static class GroupViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public GroupViewManager() {
            super(e.RNSVGGroup, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, View view) {
            super.addEventEmitters(n0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.c0 createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ View createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
            return super.createViewInstance(n0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @ng.a(name = PaymentSheetEvent.FIELD_FONT)
        public void setFont(l lVar, ReadableMap readableMap) {
            lVar.setFont(readableMap);
        }

        @ng.a(name = "fontSize")
        public void setFontSize(l lVar, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i11 = b.f17520a[dynamic.getType().ordinal()];
            if (i11 == 1) {
                javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
            } else if (i11 != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontSize", dynamic.asString());
            }
            lVar.setFont(javaOnlyMap);
        }

        @ng.a(name = "fontWeight")
        public void setFontWeight(l lVar, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i11 = b.f17520a[dynamic.getType().ordinal()];
            if (i11 == 1) {
                javaOnlyMap.putDouble("fontWeight", dynamic.asDouble());
            } else if (i11 != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontWeight", dynamic.asString());
            }
            lVar.setFont(javaOnlyMap);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ng.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        GroupViewManager(e eVar) {
            super(eVar, null);
        }
    }

    /* loaded from: classes2.dex */
    static class ImageViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ImageViewManager() {
            super(e.RNSVGImage, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, View view) {
            super.addEventEmitters(n0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.c0 createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ View createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
            return super.createViewInstance(n0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @ng.a(name = "align")
        public void setAlign(m mVar, String str) {
            mVar.setAlign(str);
        }

        @ng.a(name = Snapshot.HEIGHT)
        public void setHeight(m mVar, Dynamic dynamic) {
            mVar.setHeight(dynamic);
        }

        @ng.a(name = "meetOrSlice")
        public void setMeetOrSlice(m mVar, int i11) {
            mVar.setMeetOrSlice(i11);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ng.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @ng.a(name = "src")
        public void setSrc(m mVar, ReadableMap readableMap) {
            mVar.setSrc(readableMap);
        }

        @ng.a(name = Snapshot.WIDTH)
        public void setWidth(m mVar, Dynamic dynamic) {
            mVar.setWidth(dynamic);
        }

        @ng.a(name = "x")
        public void setX(m mVar, Dynamic dynamic) {
            mVar.setX(dynamic);
        }

        @ng.a(name = "y")
        public void setY(m mVar, Dynamic dynamic) {
            mVar.setY(dynamic);
        }
    }

    /* loaded from: classes2.dex */
    static class LineViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public LineViewManager() {
            super(e.RNSVGLine, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, View view) {
            super.addEventEmitters(n0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.c0 createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ View createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
            return super.createViewInstance(n0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ng.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @ng.a(name = "x1")
        public void setX1(n nVar, Dynamic dynamic) {
            nVar.setX1(dynamic);
        }

        @ng.a(name = "x2")
        public void setX2(n nVar, Dynamic dynamic) {
            nVar.setX2(dynamic);
        }

        @ng.a(name = "y1")
        public void setY1(n nVar, Dynamic dynamic) {
            nVar.setY1(dynamic);
        }

        @ng.a(name = "y2")
        public void setY2(n nVar, Dynamic dynamic) {
            nVar.setY2(dynamic);
        }
    }

    /* loaded from: classes2.dex */
    static class LinearGradientManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public LinearGradientManager() {
            super(e.RNSVGLinearGradient, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, View view) {
            super.addEventEmitters(n0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.c0 createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ View createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
            return super.createViewInstance(n0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @ng.a(name = "gradient")
        public void setGradient(o oVar, ReadableArray readableArray) {
            oVar.setGradient(readableArray);
        }

        @ng.a(name = "gradientTransform")
        public void setGradientTransform(o oVar, ReadableArray readableArray) {
            oVar.setGradientTransform(readableArray);
        }

        @ng.a(name = "gradientUnits")
        public void setGradientUnits(o oVar, int i11) {
            oVar.setGradientUnits(i11);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ng.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @ng.a(name = "x1")
        public void setX1(o oVar, Dynamic dynamic) {
            oVar.setX1(dynamic);
        }

        @ng.a(name = "x2")
        public void setX2(o oVar, Dynamic dynamic) {
            oVar.setX2(dynamic);
        }

        @ng.a(name = "y1")
        public void setY1(o oVar, Dynamic dynamic) {
            oVar.setY1(dynamic);
        }

        @ng.a(name = "y2")
        public void setY2(o oVar, Dynamic dynamic) {
            oVar.setY2(dynamic);
        }
    }

    /* loaded from: classes2.dex */
    static class MarkerManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public MarkerManager() {
            super(e.RNSVGMarker);
        }

        @ng.a(name = "align")
        public void setAlign(p pVar, String str) {
            pVar.setAlign(str);
        }

        @ng.a(name = "markerHeight")
        public void setMarkerHeight(p pVar, Dynamic dynamic) {
            pVar.setMarkerHeight(dynamic);
        }

        @ng.a(name = "markerUnits")
        public void setMarkerUnits(p pVar, String str) {
            pVar.setMarkerUnits(str);
        }

        @ng.a(name = "markerWidth")
        public void setMarkerWidth(p pVar, Dynamic dynamic) {
            pVar.setMarkerWidth(dynamic);
        }

        @ng.a(name = "meetOrSlice")
        public void setMeetOrSlice(p pVar, int i11) {
            pVar.setMeetOrSlice(i11);
        }

        @ng.a(name = "minX")
        public void setMinX(p pVar, float f11) {
            pVar.setMinX(f11);
        }

        @ng.a(name = "minY")
        public void setMinY(p pVar, float f11) {
            pVar.setMinY(f11);
        }

        @ng.a(name = "orient")
        public void setOrient(p pVar, String str) {
            pVar.setOrient(str);
        }

        @ng.a(name = "refX")
        public void setRefX(p pVar, Dynamic dynamic) {
            pVar.setRefX(dynamic);
        }

        @ng.a(name = "refY")
        public void setRefY(p pVar, Dynamic dynamic) {
            pVar.setRefY(dynamic);
        }

        @ng.a(name = "vbHeight")
        public void setVbHeight(p pVar, float f11) {
            pVar.setVbHeight(f11);
        }

        @ng.a(name = "vbWidth")
        public void setVbWidth(p pVar, float f11) {
            pVar.setVbWidth(f11);
        }
    }

    /* loaded from: classes2.dex */
    static class MaskManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public MaskManager() {
            super(e.RNSVGMask);
        }

        @ng.a(name = Snapshot.HEIGHT)
        public void setHeight(q qVar, Dynamic dynamic) {
            qVar.setHeight(dynamic);
        }

        @ng.a(name = "maskContentUnits")
        public void setMaskContentUnits(q qVar, int i11) {
            qVar.setMaskContentUnits(i11);
        }

        @ng.a(name = "maskTransform")
        public void setMaskTransform(q qVar, ReadableArray readableArray) {
            qVar.setMaskTransform(readableArray);
        }

        @ng.a(name = "maskUnits")
        public void setMaskUnits(q qVar, int i11) {
            qVar.setMaskUnits(i11);
        }

        @ng.a(name = Snapshot.WIDTH)
        public void setWidth(q qVar, Dynamic dynamic) {
            qVar.setWidth(dynamic);
        }

        @ng.a(name = "x")
        public void setX(q qVar, Dynamic dynamic) {
            qVar.setX(dynamic);
        }

        @ng.a(name = "y")
        public void setY(q qVar, Dynamic dynamic) {
            qVar.setY(dynamic);
        }
    }

    /* loaded from: classes2.dex */
    static class PathViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public PathViewManager() {
            super(e.RNSVGPath, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, View view) {
            super.addEventEmitters(n0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.c0 createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ View createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
            return super.createViewInstance(n0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @ng.a(name = "d")
        public void setD(u uVar, String str) {
            uVar.setD(str);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ng.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }
    }

    /* loaded from: classes2.dex */
    static class PatternManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public PatternManager() {
            super(e.RNSVGPattern);
        }

        @ng.a(name = "align")
        public void setAlign(v vVar, String str) {
            vVar.setAlign(str);
        }

        @ng.a(name = Snapshot.HEIGHT)
        public void setHeight(v vVar, Dynamic dynamic) {
            vVar.setHeight(dynamic);
        }

        @ng.a(name = "meetOrSlice")
        public void setMeetOrSlice(v vVar, int i11) {
            vVar.setMeetOrSlice(i11);
        }

        @ng.a(name = "minX")
        public void setMinX(v vVar, float f11) {
            vVar.setMinX(f11);
        }

        @ng.a(name = "minY")
        public void setMinY(v vVar, float f11) {
            vVar.setMinY(f11);
        }

        @ng.a(name = "patternContentUnits")
        public void setPatternContentUnits(v vVar, int i11) {
            vVar.setPatternContentUnits(i11);
        }

        @ng.a(name = "patternTransform")
        public void setPatternTransform(v vVar, ReadableArray readableArray) {
            vVar.setPatternTransform(readableArray);
        }

        @ng.a(name = "patternUnits")
        public void setPatternUnits(v vVar, int i11) {
            vVar.setPatternUnits(i11);
        }

        @ng.a(name = "vbHeight")
        public void setVbHeight(v vVar, float f11) {
            vVar.setVbHeight(f11);
        }

        @ng.a(name = "vbWidth")
        public void setVbWidth(v vVar, float f11) {
            vVar.setVbWidth(f11);
        }

        @ng.a(name = Snapshot.WIDTH)
        public void setWidth(v vVar, Dynamic dynamic) {
            vVar.setWidth(dynamic);
        }

        @ng.a(name = "x")
        public void setX(v vVar, Dynamic dynamic) {
            vVar.setX(dynamic);
        }

        @ng.a(name = "y")
        public void setY(v vVar, Dynamic dynamic) {
            vVar.setY(dynamic);
        }
    }

    /* loaded from: classes2.dex */
    static class RadialGradientManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public RadialGradientManager() {
            super(e.RNSVGRadialGradient, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, View view) {
            super.addEventEmitters(n0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.c0 createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ View createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
            return super.createViewInstance(n0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @ng.a(name = "cx")
        public void setCx(a0 a0Var, Dynamic dynamic) {
            a0Var.setCx(dynamic);
        }

        @ng.a(name = "cy")
        public void setCy(a0 a0Var, Dynamic dynamic) {
            a0Var.setCy(dynamic);
        }

        @ng.a(name = "fx")
        public void setFx(a0 a0Var, Dynamic dynamic) {
            a0Var.setFx(dynamic);
        }

        @ng.a(name = "fy")
        public void setFy(a0 a0Var, Dynamic dynamic) {
            a0Var.setFy(dynamic);
        }

        @ng.a(name = "gradient")
        public void setGradient(a0 a0Var, ReadableArray readableArray) {
            a0Var.setGradient(readableArray);
        }

        @ng.a(name = "gradientTransform")
        public void setGradientTransform(a0 a0Var, ReadableArray readableArray) {
            a0Var.setGradientTransform(readableArray);
        }

        @ng.a(name = "gradientUnits")
        public void setGradientUnits(a0 a0Var, int i11) {
            a0Var.setGradientUnits(i11);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ng.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @ng.a(name = "rx")
        public void setRx(a0 a0Var, Dynamic dynamic) {
            a0Var.setRx(dynamic);
        }

        @ng.a(name = "ry")
        public void setRy(a0 a0Var, Dynamic dynamic) {
            a0Var.setRy(dynamic);
        }
    }

    /* loaded from: classes2.dex */
    static class RectViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public RectViewManager() {
            super(e.RNSVGRect, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, View view) {
            super.addEventEmitters(n0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.c0 createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ View createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
            return super.createViewInstance(n0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @ng.a(name = Snapshot.HEIGHT)
        public void setHeight(b0 b0Var, Dynamic dynamic) {
            b0Var.setHeight(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ng.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @ng.a(name = "rx")
        public void setRx(b0 b0Var, Dynamic dynamic) {
            b0Var.setRx(dynamic);
        }

        @ng.a(name = "ry")
        public void setRy(b0 b0Var, Dynamic dynamic) {
            b0Var.setRy(dynamic);
        }

        @ng.a(name = Snapshot.WIDTH)
        public void setWidth(b0 b0Var, Dynamic dynamic) {
            b0Var.setWidth(dynamic);
        }

        @ng.a(name = "x")
        public void setX(b0 b0Var, Dynamic dynamic) {
            b0Var.setX(dynamic);
        }

        @ng.a(name = "y")
        public void setY(b0 b0Var, Dynamic dynamic) {
            b0Var.setY(dynamic);
        }
    }

    /* loaded from: classes2.dex */
    static class SymbolManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public SymbolManager() {
            super(e.RNSVGSymbol);
        }

        @ng.a(name = "align")
        public void setAlign(d0 d0Var, String str) {
            d0Var.setAlign(str);
        }

        @ng.a(name = "meetOrSlice")
        public void setMeetOrSlice(d0 d0Var, int i11) {
            d0Var.setMeetOrSlice(i11);
        }

        @ng.a(name = "minX")
        public void setMinX(d0 d0Var, float f11) {
            d0Var.setMinX(f11);
        }

        @ng.a(name = "minY")
        public void setMinY(d0 d0Var, float f11) {
            d0Var.setMinY(f11);
        }

        @ng.a(name = "vbHeight")
        public void setVbHeight(d0 d0Var, float f11) {
            d0Var.setVbHeight(f11);
        }

        @ng.a(name = "vbWidth")
        public void setVbWidth(d0 d0Var, float f11) {
            d0Var.setVbWidth(f11);
        }
    }

    /* loaded from: classes2.dex */
    static class TSpanViewManager extends TextViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public TSpanViewManager() {
            super(e.RNSVGTSpan);
        }

        @ng.a(name = "content")
        public void setContent(e0 e0Var, String str) {
            e0Var.setContent(str);
        }
    }

    /* loaded from: classes2.dex */
    static class TextPathViewManager extends TextViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public TextPathViewManager() {
            super(e.RNSVGTextPath);
        }

        @ng.a(name = "href")
        public void setHref(f0 f0Var, String str) {
            f0Var.setHref(str);
        }

        @ng.a(name = "method")
        public void setMethod(f0 f0Var, String str) {
            f0Var.setMethod(str);
        }

        @ng.a(name = "midLine")
        public void setSharp(f0 f0Var, String str) {
            f0Var.setSharp(str);
        }

        @ng.a(name = "side")
        public void setSide(f0 f0Var, String str) {
            f0Var.setSide(str);
        }

        @ng.a(name = "spacing")
        public void setSpacing(f0 f0Var, String str) {
            f0Var.setSpacing(str);
        }

        @ng.a(name = "startOffset")
        public void setStartOffset(f0 f0Var, Dynamic dynamic) {
            f0Var.setStartOffset(dynamic);
        }
    }

    /* loaded from: classes2.dex */
    static class TextViewManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public TextViewManager() {
            super(e.RNSVGText);
        }

        @ng.a(name = "baselineShift")
        public void setBaselineShift(r0 r0Var, Dynamic dynamic) {
            r0Var.setBaselineShift(dynamic);
        }

        @ng.a(name = "dx")
        public void setDeltaX(r0 r0Var, Dynamic dynamic) {
            r0Var.setDeltaX(dynamic);
        }

        @ng.a(name = "dy")
        public void setDeltaY(r0 r0Var, Dynamic dynamic) {
            r0Var.setDeltaY(dynamic);
        }

        @ng.a(name = PaymentSheetEvent.FIELD_FONT)
        public void setFont(r0 r0Var, ReadableMap readableMap) {
            r0Var.setFont(readableMap);
        }

        @ng.a(name = "inlineSize")
        public void setInlineSize(r0 r0Var, Dynamic dynamic) {
            r0Var.setInlineSize(dynamic);
        }

        @ng.a(name = "lengthAdjust")
        public void setLengthAdjust(r0 r0Var, String str) {
            r0Var.setLengthAdjust(str);
        }

        @ng.a(name = "alignmentBaseline")
        public void setMethod(r0 r0Var, String str) {
            r0Var.setMethod(str);
        }

        @ng.a(name = "rotate")
        public void setRotate(r0 r0Var, Dynamic dynamic) {
            r0Var.setRotate(dynamic);
        }

        @ng.a(name = "textLength")
        public void setTextLength(r0 r0Var, Dynamic dynamic) {
            r0Var.setTextLength(dynamic);
        }

        @ng.a(name = "verticalAlign")
        public void setVerticalAlign(r0 r0Var, String str) {
            r0Var.setVerticalAlign(str);
        }

        @ng.a(name = "x")
        public void setX(r0 r0Var, Dynamic dynamic) {
            r0Var.setPositionX(dynamic);
        }

        @ng.a(name = "y")
        public void setY(r0 r0Var, Dynamic dynamic) {
            r0Var.setPositionY(dynamic);
        }

        TextViewManager(e eVar) {
            super(eVar);
        }
    }

    /* loaded from: classes2.dex */
    static class UseViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public UseViewManager() {
            super(e.RNSVGUse, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, View view) {
            super.addEventEmitters(n0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.c0 createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ View createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
            return super.createViewInstance(n0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @ng.a(name = Snapshot.HEIGHT)
        public void setHeight(s0 s0Var, Dynamic dynamic) {
            s0Var.setHeight(dynamic);
        }

        @ng.a(name = "href")
        public void setHref(s0 s0Var, String str) {
            s0Var.setHref(str);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ng.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @ng.a(name = Snapshot.WIDTH)
        public void setWidth(s0 s0Var, Dynamic dynamic) {
            s0Var.setWidth(dynamic);
        }

        @ng.a(name = "x")
        public void setX(s0 s0Var, Dynamic dynamic) {
            s0Var.setX(dynamic);
        }

        @ng.a(name = "y")
        public void setY(s0 s0Var, Dynamic dynamic) {
            s0Var.setY(dynamic);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ViewGroup.OnHierarchyChangeListener {
        a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view instanceof VirtualView) {
                RenderableViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view instanceof VirtualView) {
                RenderableViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17520a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f17521b;

        static {
            int[] iArr = new int[e.values().length];
            f17521b = iArr;
            try {
                iArr[e.RNSVGGroup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17521b[e.RNSVGPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17521b[e.RNSVGCircle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17521b[e.RNSVGEllipse.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17521b[e.RNSVGLine.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17521b[e.RNSVGRect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17521b[e.RNSVGText.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17521b[e.RNSVGTSpan.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17521b[e.RNSVGTextPath.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17521b[e.RNSVGImage.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17521b[e.RNSVGClipPath.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17521b[e.RNSVGDefs.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17521b[e.RNSVGUse.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17521b[e.RNSVGSymbol.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17521b[e.RNSVGLinearGradient.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f17521b[e.RNSVGRadialGradient.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f17521b[e.RNSVGPattern.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f17521b[e.RNSVGMask.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f17521b[e.RNSVGMarker.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f17521b[e.RNSVGForeignObject.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr2 = new int[ReadableType.values().length];
            f17520a = iArr2;
            try {
                iArr2[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f17520a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c extends j.a {

        /* renamed from: f  reason: collision with root package name */
        final double[] f17522f = new double[4];

        /* renamed from: g  reason: collision with root package name */
        final double[] f17523g = new double[3];

        /* renamed from: h  reason: collision with root package name */
        final double[] f17524h = new double[3];

        /* renamed from: i  reason: collision with root package name */
        final double[] f17525i = new double[3];

        /* renamed from: j  reason: collision with root package name */
        final double[] f17526j = new double[3];

        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends com.facebook.react.uimanager.i {
        d(RenderableViewManager renderableViewManager) {
        }

        @ng.b(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", Snapshot.WIDTH, Snapshot.HEIGHT, "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
        public void ignoreLayoutProps(int i11, Dynamic dynamic) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum e {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGMarker,
        RNSVGForeignObject
    }

    /* synthetic */ RenderableViewManager(e eVar, a aVar) {
        this(eVar);
    }

    private static void decomposeMatrix() {
        c cVar = sMatrixDecompositionContext;
        double[] dArr = cVar.f17522f;
        double[] dArr2 = cVar.f17523g;
        double[] dArr3 = cVar.f17524h;
        double[] dArr4 = cVar.f17525i;
        double[] dArr5 = cVar.f17526j;
        if (isZero(sTransformDecompositionArray[15])) {
            return;
        }
        double[][] dArr6 = (double[][]) Array.newInstance(double.class, 4, 4);
        double[] dArr7 = new double[16];
        for (int i11 = 0; i11 < 4; i11++) {
            for (int i12 = 0; i12 < 4; i12++) {
                double[] dArr8 = sTransformDecompositionArray;
                int i13 = (i11 * 4) + i12;
                double d11 = dArr8[i13] / dArr8[15];
                dArr6[i11][i12] = d11;
                if (i12 == 3) {
                    d11 = 0.0d;
                }
                dArr7[i13] = d11;
            }
        }
        dArr7[15] = 1.0d;
        if (isZero(com.facebook.react.uimanager.j.m(dArr7))) {
            return;
        }
        if (isZero(dArr6[0][3]) && isZero(dArr6[1][3]) && isZero(dArr6[2][3])) {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[3] = 1.0d;
        } else {
            com.facebook.react.uimanager.j.q(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, com.facebook.react.uimanager.j.t(com.facebook.react.uimanager.j.n(dArr7)), dArr);
        }
        System.arraycopy(dArr6[3], 0, dArr4, 0, 3);
        double[][] dArr9 = (double[][]) Array.newInstance(double.class, 3, 3);
        for (int i14 = 0; i14 < 3; i14++) {
            dArr9[i14][0] = dArr6[i14][0];
            dArr9[i14][1] = dArr6[i14][1];
            dArr9[i14][2] = dArr6[i14][2];
        }
        dArr2[0] = com.facebook.react.uimanager.j.x(dArr9[0]);
        dArr9[0] = com.facebook.react.uimanager.j.y(dArr9[0], dArr2[0]);
        dArr3[0] = com.facebook.react.uimanager.j.w(dArr9[0], dArr9[1]);
        dArr9[1] = com.facebook.react.uimanager.j.u(dArr9[1], dArr9[0], 1.0d, -dArr3[0]);
        dArr3[0] = com.facebook.react.uimanager.j.w(dArr9[0], dArr9[1]);
        dArr9[1] = com.facebook.react.uimanager.j.u(dArr9[1], dArr9[0], 1.0d, -dArr3[0]);
        dArr2[1] = com.facebook.react.uimanager.j.x(dArr9[1]);
        dArr9[1] = com.facebook.react.uimanager.j.y(dArr9[1], dArr2[1]);
        dArr3[0] = dArr3[0] / dArr2[1];
        dArr3[1] = com.facebook.react.uimanager.j.w(dArr9[0], dArr9[2]);
        dArr9[2] = com.facebook.react.uimanager.j.u(dArr9[2], dArr9[0], 1.0d, -dArr3[1]);
        dArr3[2] = com.facebook.react.uimanager.j.w(dArr9[1], dArr9[2]);
        dArr9[2] = com.facebook.react.uimanager.j.u(dArr9[2], dArr9[1], 1.0d, -dArr3[2]);
        dArr2[2] = com.facebook.react.uimanager.j.x(dArr9[2]);
        dArr9[2] = com.facebook.react.uimanager.j.y(dArr9[2], dArr2[2]);
        dArr3[1] = dArr3[1] / dArr2[2];
        dArr3[2] = dArr3[2] / dArr2[2];
        if (com.facebook.react.uimanager.j.w(dArr9[0], com.facebook.react.uimanager.j.v(dArr9[1], dArr9[2])) < 0.0d) {
            for (int i15 = 0; i15 < 3; i15++) {
                dArr2[i15] = dArr2[i15] * (-1.0d);
                double[] dArr10 = dArr9[i15];
                dArr10[0] = dArr10[0] * (-1.0d);
                double[] dArr11 = dArr9[i15];
                dArr11[1] = dArr11[1] * (-1.0d);
                double[] dArr12 = dArr9[i15];
                dArr12[2] = dArr12[2] * (-1.0d);
            }
        }
        dArr5[0] = com.facebook.react.uimanager.j.s((-Math.atan2(dArr9[2][1], dArr9[2][2])) * 57.29577951308232d);
        dArr5[1] = com.facebook.react.uimanager.j.s((-Math.atan2(-dArr9[2][0], Math.sqrt((dArr9[2][1] * dArr9[2][1]) + (dArr9[2][2] * dArr9[2][2])))) * 57.29577951308232d);
        dArr5[2] = com.facebook.react.uimanager.j.s((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RenderableView getRenderableViewByTag(int i11) {
        return mTagToRenderableView.get(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(VirtualView virtualView) {
        SvgView svgView = virtualView.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (virtualView instanceof r0) {
            ((r0) virtualView).r().clearChildCache();
        }
    }

    private static boolean isZero(double d11) {
        return !Double.isNaN(d11) && Math.abs(d11) < EPSILON;
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        view.setRotation(BitmapDescriptorFactory.HUE_RED);
        view.setRotationX(BitmapDescriptorFactory.HUE_RED);
        view.setRotationY(BitmapDescriptorFactory.HUE_RED);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(BitmapDescriptorFactory.HUE_RED);
    }

    static void runWhenViewIsAvailable(int i11, Runnable runnable) {
        mTagToRunnable.put(i11, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setRenderableView(int i11, RenderableView renderableView) {
        mTagToRenderableView.put(i11, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i11);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i11);
        }
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        com.facebook.react.uimanager.p0.b(readableArray, sTransformDecompositionArray);
        decomposeMatrix();
        c cVar = sMatrixDecompositionContext;
        view.setTranslationX(com.facebook.react.uimanager.p.c((float) cVar.f17525i[0]));
        view.setTranslationY(com.facebook.react.uimanager.p.c((float) cVar.f17525i[1]));
        view.setRotation((float) cVar.f17526j[2]);
        view.setRotationX((float) cVar.f17526j[0]);
        view.setRotationY((float) cVar.f17526j[1]);
        view.setScaleX((float) cVar.f17523g[0]);
        view.setScaleY((float) cVar.f17523g[1]);
        double[] dArr = cVar.f17522f;
        if (dArr.length > 2) {
            float f11 = (float) dArr[2];
            if (f11 == BitmapDescriptorFactory.HUE_RED) {
                f11 = 7.8125E-4f;
            }
            float f12 = (-1.0f) / f11;
            float f13 = com.facebook.react.uimanager.c.c().density;
            view.setCameraDistance(f13 * f13 * f12 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<d> getShadowNodeClass() {
        return d.class;
    }

    @ng.a(name = "clipPath")
    public void setClipPath(VirtualView virtualView, String str) {
        virtualView.setClipPath(str);
    }

    @ng.a(name = "clipRule")
    public void setClipRule(VirtualView virtualView, int i11) {
        virtualView.setClipRule(i11);
    }

    @ng.a(name = "display")
    public void setDisplay(VirtualView virtualView, String str) {
        virtualView.setDisplay(str);
    }

    @ng.a(name = "fill")
    public void setFill(RenderableView renderableView, Dynamic dynamic) {
        renderableView.setFill(dynamic);
    }

    @ng.a(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(RenderableView renderableView, float f11) {
        renderableView.setFillOpacity(f11);
    }

    @ng.a(defaultInt = 1, name = "fillRule")
    public void setFillRule(RenderableView renderableView, int i11) {
        renderableView.setFillRule(i11);
    }

    @ng.a(name = "markerEnd")
    public void setMarkerEnd(VirtualView virtualView, String str) {
        virtualView.setMarkerEnd(str);
    }

    @ng.a(name = "markerMid")
    public void setMarkerMid(VirtualView virtualView, String str) {
        virtualView.setMarkerMid(str);
    }

    @ng.a(name = "markerStart")
    public void setMarkerStart(VirtualView virtualView, String str) {
        virtualView.setMarkerStart(str);
    }

    @ng.a(name = "mask")
    public void setMask(VirtualView virtualView, String str) {
        virtualView.setMask(str);
    }

    @ng.a(name = "matrix")
    public void setMatrix(VirtualView virtualView, Dynamic dynamic) {
        virtualView.setMatrix(dynamic);
    }

    @ng.a(name = "name")
    public void setName(VirtualView virtualView, String str) {
        virtualView.setName(str);
    }

    @ng.a(name = "onLayout")
    public void setOnLayout(VirtualView virtualView, boolean z11) {
        virtualView.setOnLayout(z11);
    }

    @ng.a(name = "pointerEvents")
    public void setPointerEvents(VirtualView virtualView, String str) {
        if (str == null) {
            virtualView.setPointerEvents(com.facebook.react.uimanager.q.AUTO);
        } else {
            virtualView.setPointerEvents(com.facebook.react.uimanager.q.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
        }
    }

    @ng.a(name = "propList")
    public void setPropList(RenderableView renderableView, ReadableArray readableArray) {
        renderableView.setPropList(readableArray);
    }

    @ng.a(name = "responsible")
    public void setResponsible(VirtualView virtualView, boolean z11) {
        virtualView.setResponsible(z11);
    }

    @ng.a(name = "stroke")
    public void setStroke(RenderableView renderableView, Dynamic dynamic) {
        renderableView.setStroke(dynamic);
    }

    @ng.a(name = "strokeDasharray")
    public void setStrokeDasharray(RenderableView renderableView, ReadableArray readableArray) {
        renderableView.setStrokeDasharray(readableArray);
    }

    @ng.a(name = "strokeDashoffset")
    public void setStrokeDashoffset(RenderableView renderableView, float f11) {
        renderableView.setStrokeDashoffset(f11);
    }

    @ng.a(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(RenderableView renderableView, int i11) {
        renderableView.setStrokeLinecap(i11);
    }

    @ng.a(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(RenderableView renderableView, int i11) {
        renderableView.setStrokeLinejoin(i11);
    }

    @ng.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(RenderableView renderableView, float f11) {
        renderableView.setStrokeMiterlimit(f11);
    }

    @ng.a(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(RenderableView renderableView, float f11) {
        renderableView.setStrokeOpacity(f11);
    }

    @ng.a(name = "strokeWidth")
    public void setStrokeWidth(RenderableView renderableView, Dynamic dynamic) {
        renderableView.setStrokeWidth(dynamic);
    }

    @ng.a(name = "transform")
    public void setTransform(VirtualView virtualView, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        ReadableArray asArray = dynamic.asArray();
        if (asArray == null) {
            resetTransformProperty(virtualView);
        } else {
            setTransformProperty(virtualView, asArray);
        }
        Matrix matrix = virtualView.getMatrix();
        virtualView.mTransform = matrix;
        virtualView.mTransformInvertible = matrix.invert(virtualView.mInvTransform);
    }

    @ng.a(name = "vectorEffect")
    public void setVectorEffect(RenderableView renderableView, int i11) {
        renderableView.setVectorEffect(i11);
    }

    private RenderableViewManager(e eVar) {
        this.svgClass = eVar;
        this.mClassName = eVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(com.facebook.react.uimanager.n0 n0Var, VirtualView virtualView) {
        super.addEventEmitters(n0Var, (com.facebook.react.uimanager.n0) virtualView);
        virtualView.setOnHierarchyChangeListener(new a());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.i createShadowNodeInstance() {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public VirtualView createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
        switch (b.f17521b[this.svgClass.ordinal()]) {
            case 1:
                return new l(n0Var);
            case 2:
                return new u(n0Var);
            case 3:
                return new com.horcrux.svg.b(n0Var);
            case 4:
                return new g(n0Var);
            case 5:
                return new n(n0Var);
            case 6:
                return new b0(n0Var);
            case 7:
                return new r0(n0Var);
            case 8:
                return new e0(n0Var);
            case 9:
                return new f0(n0Var);
            case 10:
                return new m(n0Var);
            case 11:
                return new com.horcrux.svg.c(n0Var);
            case 12:
                return new com.horcrux.svg.e(n0Var);
            case 13:
                return new s0(n0Var);
            case 14:
                return new d0(n0Var);
            case 15:
                return new o(n0Var);
            case 16:
                return new a0(n0Var);
            case 17:
                return new v(n0Var);
            case 18:
                return new q(n0Var);
            case 19:
                return new p(n0Var);
            case 20:
                return new i(n0Var);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction((RenderableViewManager) virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(VirtualView virtualView) {
        super.onDropViewInstance((RenderableViewManager) virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(VirtualView virtualView, float f11) {
        virtualView.setOpacity(f11);
    }
}