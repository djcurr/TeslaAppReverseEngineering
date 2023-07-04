package expo.modules.interfaces.barcodescanner;

import java.util.List;

/* loaded from: classes5.dex */
public class BarCodeScannerResult {
    private List<Integer> mCornerPoints;
    private int mReferenceImageHeight;
    private int mReferenceImageWidth;
    private int mType;
    private String mValue;

    public BarCodeScannerResult(int i11, String str, List<Integer> list, int i12, int i13) {
        this.mType = i11;
        this.mValue = str;
        this.mCornerPoints = list;
        this.mReferenceImageHeight = i12;
        this.mReferenceImageWidth = i13;
    }

    public List<Integer> getCornerPoints() {
        return this.mCornerPoints;
    }

    public int getReferenceImageHeight() {
        return this.mReferenceImageHeight;
    }

    public int getReferenceImageWidth() {
        return this.mReferenceImageWidth;
    }

    public int getType() {
        return this.mType;
    }

    public String getValue() {
        return this.mValue;
    }

    public void setCornerPoints(List<Integer> list) {
        this.mCornerPoints = list;
    }

    public void setReferenceImageHeight(int i11) {
        this.mReferenceImageHeight = i11;
    }

    public void setReferenceImageWidth(int i11) {
        this.mReferenceImageWidth = i11;
    }
}