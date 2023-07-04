package ic;

import java.util.HashMap;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class d extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30321e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30321e = hashMap;
        hashMap.put(7, "Firmware Version");
        hashMap.put(8, "Image Number");
        hashMap.put(6, "Image Type");
        hashMap.put(9, "Owner Name");
        hashMap.put(12, "Camera Serial Number");
        hashMap.put(13, "Camera Info Array");
        hashMap.put(14, "File Length");
        hashMap.put(15, "Custom Functions");
        hashMap.put(16, "Canon Model ID");
        hashMap.put(17, "Movie Info Array");
        hashMap.put(49427, "AF Point Selected");
        hashMap.put(49413, "Continuous Drive Mode");
        hashMap.put(49421, "Contrast");
        hashMap.put(49419, "Easy Shooting Mode");
        hashMap.put(49428, "Exposure Mode");
        hashMap.put(49437, "Flash Details");
        hashMap.put(49412, "Flash Mode");
        hashMap.put(49433, "Focal Units per mm");
        hashMap.put(49415, "Focus Mode");
        hashMap.put(49440, "Focus Mode");
        hashMap.put(49418, "Image Size");
        hashMap.put(49424, "Iso");
        hashMap.put(49431, "Long Focal Length");
        hashMap.put(49409, "Macro Mode");
        hashMap.put(49425, "Metering Mode");
        hashMap.put(49422, "Saturation");
        hashMap.put(49410, "Self Timer Delay");
        hashMap.put(49423, "Sharpness");
        hashMap.put(49432, "Short Focal Length");
        hashMap.put(49411, "Quality");
        hashMap.put(49414, "Unknown Camera Setting 2");
        hashMap.put(49416, "Unknown Camera Setting 3");
        hashMap.put(49417, "Record Mode");
        hashMap.put(49420, "Digital Zoom");
        hashMap.put(49426, "Focus Type");
        hashMap.put(49429, "Unknown Camera Setting 7");
        hashMap.put(49430, "Lens Type");
        hashMap.put(49434, "Max Aperture");
        hashMap.put(49435, "Min Aperture");
        hashMap.put(49436, "Flash Activity");
        hashMap.put(49438, "Focus Continuous");
        hashMap.put(49439, "AE Setting");
        hashMap.put(49441, "Display Aperture");
        hashMap.put(49442, "Zoom Source Width");
        hashMap.put(49443, "Zoom Target Width");
        hashMap.put(49445, "Spot Metering Mode");
        hashMap.put(49446, "Photo Effect");
        hashMap.put(49447, "Manual Flash Output");
        hashMap.put(49449, "Color Tone");
        hashMap.put(49453, "SRAW Quality");
        hashMap.put(49671, "White Balance");
        hashMap.put(49673, "Sequence Number");
        hashMap.put(49678, "AF Point Used");
        hashMap.put(49679, "Flash Bias");
        hashMap.put(49680, "Auto Exposure Bracketing");
        hashMap.put(49681, "AEB Bracket Value");
        hashMap.put(49683, "Subject Distance");
        hashMap.put(50177, "Auto ISO");
        hashMap.put(50178, "Base ISO");
        hashMap.put(50179, "Measured EV");
        hashMap.put(50180, "Target Aperture");
        hashMap.put(50181, "Target Exposure Time");
        hashMap.put(50182, "Exposure Compensation");
        hashMap.put(50183, "White Balance");
        hashMap.put(50184, "Slow Shutter");
        hashMap.put(50185, "Sequence Number");
        hashMap.put(50186, "Optical Zoom Code");
        hashMap.put(50188, "Camera Temperature");
        hashMap.put(50189, "Flash Guide Number");
        hashMap.put(50190, "AF Points in Focus");
        hashMap.put(50191, "Flash Exposure Compensation");
        hashMap.put(50192, "Auto Exposure Bracketing");
        hashMap.put(50193, "AEB Bracket Value");
        hashMap.put(50194, "Control Mode");
        hashMap.put(50195, "Focus Distance Upper");
        hashMap.put(50196, "Focus Distance Lower");
        hashMap.put(50197, "F Number");
        hashMap.put(50198, "Exposure Time");
        hashMap.put(50199, "Measured EV 2");
        hashMap.put(50200, "Bulb Duration");
        hashMap.put(50202, "Camera Type");
        hashMap.put(50203, "Auto Rotate");
        hashMap.put(50204, "ND Filter");
        hashMap.put(50205, "Self Timer 2");
        hashMap.put(50209, "Flash Output");
        hashMap.put(50434, "Panorama Frame Number");
        hashMap.put(50437, "Panorama Direction");
        hashMap.put(53760, "AF Point Count");
        hashMap.put(53761, "Valid AF Point Count");
        hashMap.put(53762, "Image Width");
        hashMap.put(53763, "Image Height");
        hashMap.put(53764, "AF Image Width");
        hashMap.put(53765, "AF Image Height");
        hashMap.put(53766, "AF Area Width");
        hashMap.put(53767, "AF Area Height");
        hashMap.put(53768, "AF Area X Positions");
        hashMap.put(53769, "AF Area Y Positions");
        hashMap.put(53770, "AF Points in Focus");
        hashMap.put(53771, "Primary AF Point 1");
        hashMap.put(53772, "Primary AF Point 2");
        hashMap.put(19, "Thumbnail Image Valid Area");
        hashMap.put(21, "Serial Number Format");
        hashMap.put(26, "Super Macro");
        hashMap.put(28, "Date Stamp Mode");
        hashMap.put(29, "My Colors");
        hashMap.put(30, "Firmware Revision");
        hashMap.put(35, "Categories");
        hashMap.put(36, "Face Detect Array 1");
        hashMap.put(37, "Face Detect Array 2");
        hashMap.put(38, "AF Info Array 2");
        hashMap.put(40, "Image Unique ID");
        hashMap.put(Integer.valueOf((int) com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE), "Raw Data Offset");
        hashMap.put(Integer.valueOf((int) com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE), "Original Decision Data Offset");
        hashMap.put(144, "Custom Functions (1D) Array");
        hashMap.put(145, "Personal Functions Array");
        hashMap.put(146, "Personal Function Values Array");
        hashMap.put(147, "File Info Array");
        hashMap.put(148, "AF Points in Focus (1D)");
        hashMap.put(149, "Lens Model");
        hashMap.put(150, "Serial Info Array");
        hashMap.put(151, "Dust Removal Data");
        hashMap.put(152, "Crop Info");
        hashMap.put(153, "Custom Functions Array 2");
        hashMap.put(154, "Aspect Information Array");
        hashMap.put(160, "Processing Information Array");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384), "Tone Curve Table");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256), "Sharpness Table");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384), "Sharpness Frequency Table");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256), "White Balance Table");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384), "Color Balance Array");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256), "Measured Color Array");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256), "Color Temperature");
        hashMap.put(176, "Canon Flags Array");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_PSK_WITH_NULL_SHA384), "Modified Information Array");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256), "Tone Curve Matching");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384), "White Balance Matching");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256), "Color Space");
        hashMap.put(Integer.valueOf((int) CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256), "Preview Image Info Array");
        hashMap.put(208, "VRD Offset");
        hashMap.put(224, "Sensor Information Array");
        hashMap.put(16385, "Color Data Array 1");
        hashMap.put(16386, "CRW Parameters");
        hashMap.put(16387, "Color Data Array 2");
        hashMap.put(16392, "Black Level");
        hashMap.put(16400, "Custom Picture Style File Name");
        hashMap.put(16403, "Color Info Array");
        hashMap.put(16405, "Vignetting Correction Array 1");
        hashMap.put(16406, "Vignetting Correction Array 2");
        hashMap.put(16408, "Lighting Optimizer Array");
        hashMap.put(16409, "Lens Info Array");
        hashMap.put(16416, "Ambiance Info Array");
        hashMap.put(16420, "Filter Info Array");
    }

    public d() {
        E(new c(this));
    }

    @Override // cc.b
    public void N(int i11, Object obj) {
        if (!(obj instanceof int[])) {
            super.N(i11, obj);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            int[] iArr = (int[]) obj;
            while (i12 < iArr.length) {
                J(49408 + i12, iArr[i12]);
                i12++;
            }
        } else if (i11 == 2) {
            int[] iArr2 = (int[]) obj;
            while (i12 < iArr2.length) {
                J(49664 + i12, iArr2[i12]);
                i12++;
            }
        } else if (i11 == 4) {
            int[] iArr3 = (int[]) obj;
            while (i12 < iArr3.length) {
                J(50176 + i12, iArr3[i12]);
                i12++;
            }
        } else if (i11 == 5) {
            int[] iArr4 = (int[]) obj;
            while (i12 < iArr4.length) {
                J(50432 + i12, iArr4[i12]);
                i12++;
            }
        } else if (i11 != 18) {
            super.N(i11, obj);
        } else {
            int[] iArr5 = (int[]) obj;
            int i13 = iArr5[0];
            int i14 = 0;
            int i15 = 0;
            while (i14 < iArr5.length) {
                int i16 = 53760 + i15;
                if (i16 == 53768 || i16 == 53769) {
                    if (iArr5.length - 1 >= i14 + i13) {
                        short[] sArr = new short[i13];
                        for (int i17 = 0; i17 < i13; i17++) {
                            sArr[i17] = (short) iArr5[i14 + i17];
                        }
                        super.N(i16, sArr);
                    }
                    i14 += i13 - 1;
                } else if (i16 == 53770) {
                    int i18 = (i13 + 15) / 16;
                    short[] sArr2 = new short[i18];
                    if (iArr5.length - 1 >= i14 + i18) {
                        for (int i19 = 0; i19 < i18; i19++) {
                            sArr2[i19] = (short) iArr5[i14 + i19];
                        }
                        super.N(i16, sArr2);
                    }
                    i14 += i18 - 1;
                } else {
                    super.N(i16, Integer.valueOf(iArr5[i14]));
                }
                i15++;
                i14++;
            }
        }
    }

    @Override // cc.b
    public String n() {
        return "Canon Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30321e;
    }
}