package ic;

import java.io.IOException;
import java.util.HashMap;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class n0 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30337e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30337e = hashMap;
        hashMap.put(1, "Quality Mode");
        hashMap.put(2, "Version");
        hashMap.put(3, "White Balance");
        hashMap.put(7, "Focus Mode");
        hashMap.put(15, "AF Area Mode");
        hashMap.put(26, "Image Stabilization");
        hashMap.put(28, "Macro Mode");
        hashMap.put(31, "Record Mode");
        hashMap.put(32, "Audio");
        hashMap.put(37, "Internal Serial Number");
        hashMap.put(33, "Unknown Data Dump");
        hashMap.put(34, "Easy Mode");
        hashMap.put(35, "White Balance Bias");
        hashMap.put(36, "Flash Bias");
        hashMap.put(38, "Exif Version");
        hashMap.put(40, "Color Effect");
        hashMap.put(41, "Camera Uptime");
        hashMap.put(42, "Burst Mode");
        hashMap.put(43, "Sequence Number");
        hashMap.put(44, "Contrast Mode");
        hashMap.put(45, "Noise Reduction");
        hashMap.put(46, "Self Timer");
        hashMap.put(48, "Rotation");
        hashMap.put(49, "AF Assist Lamp");
        hashMap.put(50, "Color Mode");
        hashMap.put(51, "Baby Age");
        hashMap.put(52, "Optical Zoom Mode");
        hashMap.put(53, "Conversion Lens");
        hashMap.put(54, "Travel Day");
        hashMap.put(57, "Contrast");
        hashMap.put(58, "World Time Location");
        hashMap.put(59, "Text Stamp");
        hashMap.put(60, "Program ISO");
        hashMap.put(61, "Advanced Scene Mode");
        hashMap.put(3584, "Print Image Matching (PIM) Info");
        hashMap.put(63, "Number of Detected Faces");
        hashMap.put(64, "Saturation");
        hashMap.put(65, "Sharpness");
        hashMap.put(66, "Film Mode");
        hashMap.put(68, "Color Temp Kelvin");
        hashMap.put(69, "Bracket Settings");
        hashMap.put(70, "White Balance Adjust (AB)");
        hashMap.put(71, "White Balance Adjust (GM)");
        hashMap.put(72, "Flash Curtain");
        hashMap.put(73, "Long Exposure Noise Reduction");
        hashMap.put(75, "Panasonic Image Width");
        hashMap.put(76, "Panasonic Image Height");
        hashMap.put(77, "Af Point Position");
        hashMap.put(78, "Face Detection Info");
        hashMap.put(81, "Lens Type");
        hashMap.put(82, "Lens Serial Number");
        hashMap.put(83, "Accessory Type");
        hashMap.put(84, "Accessory Serial Number");
        hashMap.put(89, "Transform");
        hashMap.put(93, "Intelligent Exposure");
        hashMap.put(96, "Lens Firmware Version");
        hashMap.put(97, "Face Recognition Info");
        hashMap.put(98, "Flash Warning");
        hashMap.put(99, "Recognized Face Flags");
        hashMap.put(101, "Title");
        hashMap.put(102, "Baby Name");
        hashMap.put(103, "Location");
        hashMap.put(105, "Country");
        hashMap.put(107, "State");
        hashMap.put(109, "City");
        hashMap.put(111, "Landmark");
        hashMap.put(112, "Intelligent Resolution");
        hashMap.put(119, "Burst Speed");
        hashMap.put(121, "Intelligent D-Range");
        hashMap.put(124, "Clear Retouch");
        hashMap.put(128, "City 2");
        hashMap.put(137, "Photo Style");
        hashMap.put(138, "Shading Compensation");
        hashMap.put(140, "Accelerometer Z");
        hashMap.put(141, "Accelerometer X");
        hashMap.put(142, "Accelerometer Y");
        hashMap.put(143, "Camera Orientation");
        hashMap.put(144, "Roll Angle");
        hashMap.put(145, "Pitch Angle");
        hashMap.put(147, "Sweep Panorama Direction");
        hashMap.put(148, "Sweep Panorama Field Of View");
        hashMap.put(150, "Timer Recording");
        hashMap.put(157, "Internal ND Filter");
        hashMap.put(158, "HDR");
        hashMap.put(159, "Shutter Type");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384), "Clear Retouch Value");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384), "Touch AE");
        hashMap.put(32768, "Makernote Version");
        hashMap.put(32769, "Scene Mode");
        hashMap.put(32772, "White Balance (Red)");
        hashMap.put(32773, "White Balance (Green)");
        hashMap.put(32774, "White Balance (Blue)");
        hashMap.put(32775, "Flash Fired");
        hashMap.put(62, "Text Stamp 1");
        hashMap.put(32776, "Text Stamp 2");
        hashMap.put(32777, "Text Stamp 3");
        hashMap.put(32784, "Baby Age 1");
        hashMap.put(32786, "Transform 1");
    }

    public n0() {
        E(new m0(this));
    }

    public cc.a V(int i11) {
        String r11 = r(i11);
        if (r11 == null) {
            return null;
        }
        return cc.a.b(r11);
    }

    public cc.d[] W() {
        byte[] e11 = e(78);
        if (e11 == null) {
            return null;
        }
        bc.a aVar = new bc.a(e11);
        aVar.w(false);
        try {
            int s11 = aVar.s(0);
            if (s11 == 0) {
                return null;
            }
            cc.d[] dVarArr = new cc.d[s11];
            for (int i11 = 0; i11 < s11; i11++) {
                int i12 = (i11 * 8) + 2;
                dVarArr[i11] = new cc.d(aVar.s(i12), aVar.s(i12 + 2), aVar.s(i12 + 4), aVar.s(i12 + 6), null, null);
            }
            return dVarArr;
        } catch (IOException unused) {
            return null;
        }
    }

    public cc.d[] X() {
        byte[] e11 = e(97);
        if (e11 == null) {
            return null;
        }
        bc.a aVar = new bc.a(e11);
        aVar.w(false);
        try {
            int s11 = aVar.s(0);
            if (s11 == 0) {
                return null;
            }
            cc.d[] dVarArr = new cc.d[s11];
            for (int i11 = 0; i11 < s11; i11++) {
                int i12 = (i11 * 44) + 4;
                dVarArr[i11] = new cc.d(aVar.s(i12 + 20), aVar.s(i12 + 22), aVar.s(i12 + 24), aVar.s(i12 + 26), aVar.p(i12, 20, "ASCII").trim(), cc.a.b(aVar.p(i12 + 28, 20, "ASCII").trim()));
            }
            return dVarArr;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // cc.b
    public String n() {
        return "Panasonic Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30337e;
    }
}