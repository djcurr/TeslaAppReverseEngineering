package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes4.dex */
public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.RendererCommon$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[ScalingType.values().length];
            $SwitchMap$org$webrtc$RendererCommon$ScalingType = iArr;
            try {
                iArr[ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface GlDrawer {
        void drawOes(int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17);

        void drawRgb(int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17);

        void drawYuv(int[] iArr, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16);

        void release();
    }

    /* loaded from: classes4.dex */
    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i11, int i12, int i13);
    }

    /* loaded from: classes4.dex */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* loaded from: classes4.dex */
    public static class VideoLayoutMeasure {
        private float visibleFractionMatchOrientation;
        private float visibleFractionMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
        }

        public Point measure(int i11, int i12, int i13, int i14) {
            float f11;
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i11);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i12);
            if (i13 != 0 && i14 != 0 && defaultSize != 0 && defaultSize2 != 0) {
                float f12 = i13 / i14;
                if ((f12 > 1.0f) == (((float) defaultSize) / ((float) defaultSize2) > 1.0f)) {
                    f11 = this.visibleFractionMatchOrientation;
                } else {
                    f11 = this.visibleFractionMismatchOrientation;
                }
                Point displaySize = RendererCommon.getDisplaySize(f11, f12, defaultSize, defaultSize2);
                if (View.MeasureSpec.getMode(i11) == 1073741824) {
                    displaySize.x = defaultSize;
                }
                if (View.MeasureSpec.getMode(i12) == 1073741824) {
                    displaySize.y = defaultSize2;
                }
                return displaySize;
            }
            return new Point(defaultSize, defaultSize2);
        }

        public void setScalingType(ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }

        public void setVisibleFraction(float f11, float f12) {
            this.visibleFractionMatchOrientation = f11;
            this.visibleFractionMismatchOrientation = f12;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType2);
        }
    }

    private static void adjustOrigin(float[] fArr) {
        fArr[12] = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[13] = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[12] = fArr[12] + 0.5f;
        fArr[13] = fArr[13] + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], BitmapDescriptorFactory.HUE_RED, fArr[6], fArr[1], fArr[4], BitmapDescriptorFactory.HUE_RED, fArr[7], BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, fArr[2], fArr[5], BitmapDescriptorFactory.HUE_RED, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int i11 = AnonymousClass1.$SwitchMap$org$webrtc$RendererCommon$ScalingType[scalingType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return BALANCED_VISIBLE_FRACTION;
                }
                throw new IllegalArgumentException();
            }
            return BitmapDescriptorFactory.HUE_RED;
        }
        return 1.0f;
    }

    public static Point getDisplaySize(ScalingType scalingType, float f11, int i11, int i12) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f11, i11, i12);
    }

    public static float[] getLayoutMatrix(boolean z11, float f11, float f12) {
        float f13;
        float f14;
        if (f12 > f11) {
            f14 = f11 / f12;
            f13 = 1.0f;
        } else {
            f13 = f12 / f11;
            f14 = 1.0f;
        }
        if (z11) {
            f13 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f13, f14, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(float f11, float f12, int i11, int i12) {
        if (f11 != BitmapDescriptorFactory.HUE_RED && f12 != BitmapDescriptorFactory.HUE_RED) {
            return new Point(Math.min(i11, Math.round((i12 / f11) * f12)), Math.min(i12, Math.round((i11 / f11) / f12)));
        }
        return new Point(i11, i12);
    }
}