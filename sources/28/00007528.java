package ic;

import java.util.HashMap;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class h extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30329e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30329e = hashMap;
        hashMap.put(2, "Thumbnail Dimensions");
        hashMap.put(3, "Thumbnail Size");
        hashMap.put(4, "Thumbnail Offset");
        hashMap.put(8, "Quality Mode");
        hashMap.put(9, "Image Size");
        hashMap.put(13, "Focus Mode");
        hashMap.put(20, "ISO Sensitivity");
        hashMap.put(25, "White Balance");
        hashMap.put(29, "Focal Length");
        hashMap.put(31, "Saturation");
        hashMap.put(32, "Contrast");
        hashMap.put(33, "Sharpness");
        hashMap.put(3584, "Print Image Matching (PIM) Info");
        hashMap.put(Integer.valueOf((int) PKIFailureInfo.certRevoked), "Casio Preview Thumbnail");
        hashMap.put(8209, "White Balance Bias");
        hashMap.put(8210, "White Balance");
        hashMap.put(8226, "Object Distance");
        hashMap.put(8244, "Flash Distance");
        hashMap.put(12288, "Record Mode");
        hashMap.put(12289, "Self Timer");
        hashMap.put(12290, "Quality");
        hashMap.put(12291, "Focus Mode");
        hashMap.put(12294, "Time Zone");
        hashMap.put(12295, "BestShot Mode");
        hashMap.put(12308, "CCD ISO Sensitivity");
        hashMap.put(12309, "Colour Mode");
        hashMap.put(12310, "Enhancement");
        hashMap.put(12311, "Filter");
    }

    public h() {
        E(new g(this));
    }

    @Override // cc.b
    public String n() {
        return "Casio Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30329e;
    }
}