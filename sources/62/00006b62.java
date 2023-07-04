package expo.modules.lineargradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes5.dex */
public class LinearGradientView extends View {
    private float[] mBorderRadii;
    private int[] mColors;
    private float[] mEndPos;
    private float[] mLocations;
    private final Paint mPaint;
    private Path mPathForBorderRadius;
    private int[] mSize;
    private float[] mStartPos;
    private RectF mTempRectForBorderRadius;

    public LinearGradientView(Context context) {
        super(context);
        this.mPaint = new Paint(1);
        this.mStartPos = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.mEndPos = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
        this.mSize = new int[]{0, 0};
        this.mBorderRadii = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    }

    private void drawGradient() {
        int[] iArr = this.mColors;
        if (iArr != null) {
            float[] fArr = this.mLocations;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.mStartPos;
                float f11 = fArr2[0];
                int[] iArr2 = this.mSize;
                float f12 = fArr2[1] * iArr2[1];
                float[] fArr3 = this.mEndPos;
                this.mPaint.setShader(new LinearGradient(f11 * iArr2[0], f12, fArr3[0] * iArr2[0], fArr3[1] * iArr2[1], this.mColors, this.mLocations, Shader.TileMode.CLAMP));
                invalidate();
            }
        }
    }

    private float toPixelFromDIP(float f11) {
        return TypedValue.applyDimension(1, f11, getContext().getResources().getDisplayMetrics());
    }

    private void updatePath() {
        if (this.mPathForBorderRadius == null) {
            this.mPathForBorderRadius = new Path();
            this.mTempRectForBorderRadius = new RectF();
        }
        this.mPathForBorderRadius.reset();
        RectF rectF = this.mTempRectForBorderRadius;
        int[] iArr = this.mSize;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, iArr[0], iArr[1]);
        this.mPathForBorderRadius.addRoundRect(this.mTempRectForBorderRadius, this.mBorderRadii, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.mPathForBorderRadius;
        if (path == null) {
            canvas.drawPaint(this.mPaint);
        } else {
            canvas.drawPath(path, this.mPaint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        this.mSize = new int[]{i11, i12};
        updatePath();
        drawGradient();
    }

    public void setBorderRadii(float[] fArr) {
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr[i11] = toPixelFromDIP(fArr[i11]);
        }
        this.mBorderRadii = fArr;
        updatePath();
        drawGradient();
    }

    public void setColors(int[] iArr) {
        this.mColors = iArr;
        drawGradient();
    }

    public void setEndPosition(float f11, float f12) {
        this.mEndPos = new float[]{f11, f12};
        drawGradient();
    }

    public void setLocations(float[] fArr) {
        this.mLocations = fArr;
        drawGradient();
    }

    public void setStartPosition(float f11, float f12) {
        this.mStartPos = new float[]{f11, f12};
        drawGradient();
    }
}