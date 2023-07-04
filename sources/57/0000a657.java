package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

/* loaded from: classes4.dex */
public class VideoFrameDrawer {
    public static final String TAG = "VideoFrameDrawer";
    static final float[] srcPoints = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private int renderWidth;
    private final float[] dstPoints = new float[6];
    private final Point renderSize = new Point();
    private final YuvUploader yuvUploader = new YuvUploader();
    private final Matrix renderMatrix = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.VideoFrameDrawer$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class YuvUploader {
        private ByteBuffer copyBuffer;
        private int[] yuvTextures;

        private YuvUploader() {
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i11, int i12, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i13 = i11 / 2;
            int[] iArr2 = {i11, i13, i13};
            int i14 = i12 / 2;
            int[] iArr3 = {i12, i14, i14};
            int i15 = 0;
            for (int i16 = 0; i16 < 3; i16++) {
                if (iArr[i16] > iArr2[i16]) {
                    i15 = Math.max(i15, iArr2[i16] * iArr3[i16]);
                }
            }
            if (i15 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i15)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i15);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i17 = 0; i17 < 3; i17++) {
                    this.yuvTextures[i17] = GlUtil.generateTexture(3553);
                }
            }
            for (int i18 = 0; i18 < 3; i18++) {
                GLES20.glActiveTexture(33984 + i18);
                GLES20.glBindTexture(3553, this.yuvTextures[i18]);
                if (iArr[i18] == iArr2[i18]) {
                    byteBuffer = byteBufferArr[i18];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i18], iArr[i18], this.copyBuffer, iArr2[i18], iArr2[i18], iArr3[i18]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i18], iArr3[i18], 0, 6409, 5121, byteBuffer);
            }
            return this.yuvTextures;
        }
    }

    private void calculateTransformedRenderSize(int i11, int i12, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i11;
            this.renderHeight = i12;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i13 = 0; i13 < 3; i13++) {
            float[] fArr = this.dstPoints;
            int i14 = i13 * 2;
            int i15 = i14 + 0;
            fArr[i15] = fArr[i15] * i11;
            int i16 = i14 + 1;
            fArr[i16] = fArr[i16] * i12;
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f11, float f12, float f13, float f14) {
        return (int) Math.round(Math.hypot(f13 - f11, f14 - f12));
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i11, int i12, int i13, int i14, int i15, int i16) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i17 = AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i17 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i11, i12, i13, i14, i15, i16);
        } else if (i17 == 2) {
            glDrawer.drawRgb(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i11, i12, i13, i14, i15, i16);
        } else {
            throw new RuntimeException("Unknown texture type.");
        }
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    public VideoFrame.Buffer prepareBufferForViewportSize(VideoFrame.Buffer buffer, int i11, int i12) {
        buffer.retain();
        return buffer;
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i11, int i12, int i13, int i14) {
        calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
        int i15 = this.renderWidth;
        if (i15 > 0 && this.renderHeight > 0) {
            boolean z11 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!z11) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate(videoFrame.getRotation());
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (z11) {
                this.lastI420Frame = null;
                drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i11, i12, i13, i14);
                return;
            }
            if (videoFrame != this.lastI420Frame) {
                this.lastI420Frame = videoFrame;
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                this.yuvUploader.uploadFromBuffer(i420);
                i420.release();
            }
            glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i11, i12, i13, i14);
            return;
        }
        int i16 = this.renderHeight;
        Logging.w(TAG, "Illegal frame size: " + i15 + "x" + i16);
    }
}