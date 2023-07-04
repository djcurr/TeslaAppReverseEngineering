package kb;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final bc.c<com.drew.imaging.a> f34549a;

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, com.drew.imaging.a> f34550b;

    static {
        bc.c<com.drew.imaging.a> cVar = new bc.c<>();
        f34549a = cVar;
        cVar.d(com.drew.imaging.a.Unknown);
        cVar.a(com.drew.imaging.a.Jpeg, new byte[]{-1, -40});
        com.drew.imaging.a aVar = com.drew.imaging.a.Tiff;
        cVar.a(aVar, "II".getBytes(), new byte[]{42, 0});
        cVar.a(aVar, "MM".getBytes(), new byte[]{0, 42});
        cVar.a(com.drew.imaging.a.Psd, "8BPS".getBytes());
        cVar.a(com.drew.imaging.a.Png, new byte[]{-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82});
        com.drew.imaging.a aVar2 = com.drew.imaging.a.Bmp;
        cVar.a(aVar2, "BM".getBytes());
        cVar.a(aVar2, "BA".getBytes());
        cVar.a(aVar2, "CI".getBytes());
        cVar.a(aVar2, "CP".getBytes());
        cVar.a(aVar2, "IC".getBytes());
        cVar.a(aVar2, "PT".getBytes());
        com.drew.imaging.a aVar3 = com.drew.imaging.a.Gif;
        cVar.a(aVar3, "GIF87a".getBytes());
        cVar.a(aVar3, "GIF89a".getBytes());
        cVar.a(com.drew.imaging.a.Ico, new byte[]{0, 0, 1, 0});
        com.drew.imaging.a aVar4 = com.drew.imaging.a.Pcx;
        cVar.a(aVar4, new byte[]{10, 0, 1});
        cVar.a(aVar4, new byte[]{10, 2, 1});
        cVar.a(aVar4, new byte[]{10, 3, 1});
        cVar.a(aVar4, new byte[]{10, 5, 1});
        cVar.a(com.drew.imaging.a.Riff, "RIFF".getBytes());
        cVar.a(com.drew.imaging.a.Arw, "II".getBytes(), new byte[]{42, 0, 8, 0});
        cVar.a(com.drew.imaging.a.Crw, "II".getBytes(), new byte[]{26, 0, 0, 0}, "HEAPCCDR".getBytes());
        cVar.a(com.drew.imaging.a.Cr2, "II".getBytes(), new byte[]{42, 0, Tnaf.POW_2_WIDTH, 0, 0, 0, 67, 82});
        com.drew.imaging.a aVar5 = com.drew.imaging.a.Orf;
        cVar.a(aVar5, "IIRO".getBytes(), new byte[]{8, 0});
        cVar.a(aVar5, "MMOR".getBytes(), new byte[]{0, 0});
        cVar.a(aVar5, "IIRS".getBytes(), new byte[]{8, 0});
        cVar.a(com.drew.imaging.a.Raf, "FUJIFILMCCD-RAW".getBytes());
        cVar.a(com.drew.imaging.a.Rw2, "II".getBytes(), new byte[]{85, 0});
        com.drew.imaging.a aVar6 = com.drew.imaging.a.Eps;
        cVar.a(aVar6, "%!PS".getBytes());
        cVar.a(aVar6, new byte[]{-59, -48, -45, -58});
        HashMap<String, com.drew.imaging.a> hashMap = new HashMap<>();
        f34550b = hashMap;
        com.drew.imaging.a aVar7 = com.drew.imaging.a.Mov;
        hashMap.put("ftypmoov", aVar7);
        hashMap.put("ftypwide", aVar7);
        hashMap.put("ftypmdat", aVar7);
        hashMap.put("ftypfree", aVar7);
        hashMap.put("ftypqt  ", aVar7);
        com.drew.imaging.a aVar8 = com.drew.imaging.a.Mp4;
        hashMap.put("ftypavc1", aVar8);
        hashMap.put("ftypiso2", aVar8);
        hashMap.put("ftypisom", aVar8);
        hashMap.put("ftypM4A ", aVar8);
        hashMap.put("ftypM4B ", aVar8);
        hashMap.put("ftypM4P ", aVar8);
        hashMap.put("ftypM4V ", aVar8);
        hashMap.put("ftypM4VH", aVar8);
        hashMap.put("ftypM4VP", aVar8);
        hashMap.put("ftypmmp4", aVar8);
        hashMap.put("ftypmp41", aVar8);
        hashMap.put("ftypmp42", aVar8);
        hashMap.put("ftypmp71", aVar8);
        hashMap.put("ftypMSNV", aVar8);
        hashMap.put("ftypNDAS", aVar8);
        hashMap.put("ftypNDSC", aVar8);
        hashMap.put("ftypNDSH", aVar8);
        hashMap.put("ftypNDSM", aVar8);
        hashMap.put("ftypNDSP", aVar8);
        hashMap.put("ftypNDSS", aVar8);
        hashMap.put("ftypNDXC", aVar8);
        hashMap.put("ftypNDXH", aVar8);
        hashMap.put("ftypNDXM", aVar8);
        hashMap.put("ftypNDXP", aVar8);
        hashMap.put("ftypNDXS", aVar8);
        com.drew.imaging.a aVar9 = com.drew.imaging.a.Heif;
        hashMap.put("ftypmif1", aVar9);
        hashMap.put("ftypmsf1", aVar9);
        hashMap.put("ftypheic", aVar9);
        hashMap.put("ftypheix", aVar9);
        hashMap.put("ftyphevc", aVar9);
        hashMap.put("ftyphevx", aVar9);
        com.drew.imaging.a aVar10 = com.drew.imaging.a.Aac;
        cVar.a(aVar10, new byte[]{-1, -15});
        cVar.a(aVar10, new byte[]{-1, -7});
        cVar.a(com.drew.imaging.a.Asf, new byte[]{48, 38, -78, 117, -114, 102, -49, 17, -90, -39, 0, -86, 0, 98, -50, 108});
        cVar.a(com.drew.imaging.a.Cfbf, new byte[]{-48, -49, 17, -32, -95, -79, 26, -31, 0});
        cVar.a(com.drew.imaging.a.Flv, new byte[]{70, 76, 86});
        cVar.a(com.drew.imaging.a.Indd, new byte[]{6, 6, -19, -11, -40, 29, 70, -27, -67, 49, -17, -25, -2, 116, -73, 29});
        cVar.a(com.drew.imaging.a.Mxf, new byte[]{6, 14, 43, 52, 2, 5, 1, 1, 13, 1, 2, 1, 1, 2});
        com.drew.imaging.a aVar11 = com.drew.imaging.a.Qxp;
        cVar.a(aVar11, new byte[]{0, 0, 73, 73, 88, 80, 82, 51});
        cVar.a(aVar11, new byte[]{0, 0, 77, 77, 88, 80, 82, 51});
        cVar.a(com.drew.imaging.a.Ram, new byte[]{114, 116, 115, 112, 58, 47, 47});
        cVar.a(com.drew.imaging.a.Rtf, new byte[]{123, 92, 114, 116, 102, 49});
        com.drew.imaging.a aVar12 = com.drew.imaging.a.Sit;
        cVar.a(aVar12, new byte[]{83, 73, 84, 33, 0});
        cVar.a(aVar12, new byte[]{83, 116, 117, 102, 102, 73, 116, 32, 40, 99, 41, 49, 57, 57, 55, 45});
        cVar.a(com.drew.imaging.a.Sitx, new byte[]{83, 116, 117, 102, 102, 73, 116, 33});
        com.drew.imaging.a aVar13 = com.drew.imaging.a.Swf;
        cVar.a(aVar13, "CWS".getBytes());
        cVar.a(aVar13, "FWS".getBytes());
        cVar.a(aVar13, "ZWS".getBytes());
        cVar.a(com.drew.imaging.a.Vob, new byte[]{0, 0, 1, -70});
        cVar.a(com.drew.imaging.a.Zip, "PK".getBytes());
    }

    public static com.drew.imaging.a a(BufferedInputStream bufferedInputStream) {
        if (bufferedInputStream.markSupported()) {
            bc.c<com.drew.imaging.a> cVar = f34549a;
            int max = Math.max(16, cVar.c());
            bufferedInputStream.mark(max);
            byte[] bArr = new byte[max];
            if (bufferedInputStream.read(bArr) != -1) {
                bufferedInputStream.reset();
                com.drew.imaging.a b11 = cVar.b(bArr);
                if (b11 == com.drew.imaging.a.Unknown) {
                    com.drew.imaging.a aVar = f34550b.get(new String(bArr, 4, 8));
                    return aVar != null ? aVar : b11;
                } else if (b11 == com.drew.imaging.a.Riff) {
                    String str = new String(bArr, 8, 4);
                    if (str.equals("WAVE")) {
                        return com.drew.imaging.a.Wav;
                    }
                    if (str.equals("AVI ")) {
                        return com.drew.imaging.a.Avi;
                    }
                    return str.equals("WEBP") ? com.drew.imaging.a.WebP : b11;
                } else {
                    return b11;
                }
            }
            throw new IOException("Stream ended before file's magic number could be determined.");
        }
        throw new IOException("Stream must support mark/reset");
    }
}