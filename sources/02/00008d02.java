package numan.dev.videocompressor;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class VideoController {

    /* renamed from: c */
    private static volatile VideoController f41886c;

    /* renamed from: a */
    public String f41887a;

    /* renamed from: b */
    private boolean f41888b = true;

    private void b(boolean z11, boolean z12) {
        if (this.f41888b) {
            this.f41888b = false;
        }
    }

    public static VideoController c() {
        VideoController videoController = f41886c;
        if (videoController == null) {
            synchronized (VideoController.class) {
                videoController = f41886c;
                if (videoController == null) {
                    videoController = new VideoController();
                    f41886c = videoController;
                }
            }
        }
        return videoController;
    }

    public static native int convertVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i11, int i12, int i13, int i14, int i15);

    private static boolean d(int i11) {
        if (i11 == 39 || i11 == 2130706688) {
            return true;
        }
        switch (i11) {
            case 19:
            case 20:
            case 21:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x007b, code lost:
        if (r10 == (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long e(android.media.MediaExtractor r22, o30.b r23, android.media.MediaCodec.BufferInfo r24, long r25, long r27, java.io.File r29, boolean r30) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r5 = r21
            r6 = r30
            int r7 = r5.h(r0, r6)
            r8 = -1
            if (r7 < 0) goto L8c
            r0.selectTrack(r7)
            android.media.MediaFormat r10 = r0.getTrackFormat(r7)
            int r11 = r1.a(r10, r6)
            java.lang.String r12 = "max-input-size"
            int r10 = r10.getInteger(r12)
            r12 = 0
            int r14 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            r15 = 0
            if (r14 <= 0) goto L30
            r0.seekTo(r3, r15)
            goto L33
        L30:
            r0.seekTo(r12, r15)
        L33:
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r10)
            r16 = r8
            r4 = r15
        L3a:
            if (r4 != 0) goto L88
            int r10 = r22.getSampleTrackIndex()
            r18 = 1
            if (r10 != r7) goto L78
            int r10 = r0.readSampleData(r3, r15)
            r2.size = r10
            if (r10 >= 0) goto L51
            r2.size = r15
            r19 = r12
            goto L7d
        L51:
            long r12 = r22.getSampleTime()
            r2.presentationTimeUs = r12
            if (r14 <= 0) goto L5f
            int r10 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r10 != 0) goto L5f
            r16 = r12
        L5f:
            r19 = 0
            int r10 = (r27 > r19 ? 1 : (r27 == r19 ? 0 : -1))
            if (r10 < 0) goto L69
            int r10 = (r12 > r27 ? 1 : (r12 == r27 ? 0 : -1))
            if (r10 >= 0) goto L7d
        L69:
            r2.offset = r15
            int r10 = r22.getSampleFlags()
            r2.flags = r10
            r1.q(r11, r3, r2, r6)
            r22.advance()
            goto L80
        L78:
            r19 = r12
            r12 = -1
            if (r10 != r12) goto L80
        L7d:
            r10 = r18
            goto L81
        L80:
            r10 = r15
        L81:
            if (r10 == 0) goto L85
            r4 = r18
        L85:
            r12 = r19
            goto L3a
        L88:
            r0.unselectTrack(r7)
            return r16
        L8c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: numan.dev.videocompressor.VideoController.e(android.media.MediaExtractor, o30.b, android.media.MediaCodec$BufferInfo, long, long, java.io.File, boolean):long");
    }

    public static MediaCodecInfo f(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        MediaCodecInfo mediaCodecInfo = null;
        for (int i11 = 0; i11 < codecCount; i11++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        if (!codecInfoAt.getName().equals("OMX.SEC.avc.enc") || codecInfoAt.getName().equals("OMX.SEC.AVC.Encoder")) {
                            return codecInfoAt;
                        }
                        mediaCodecInfo = codecInfoAt;
                    }
                }
                continue;
            }
        }
        return mediaCodecInfo;
    }

    public static int g(MediaCodecInfo mediaCodecInfo, String str) {
        int i11;
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i12 >= iArr.length) {
                return i13;
            }
            i11 = iArr[i12];
            if (d(i11)) {
                if (!mediaCodecInfo.getName().equals("OMX.SEC.AVC.Encoder") || i11 != 19) {
                    break;
                }
                i13 = i11;
            }
            i12++;
        }
        return i11;
    }

    private int h(MediaExtractor mediaExtractor, boolean z11) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i11 = 0; i11 < trackCount; i11++) {
            String string = mediaExtractor.getTrackFormat(i11).getString("mime");
            if (z11) {
                if (string.startsWith("audio/")) {
                    return i11;
                }
            } else if (string.startsWith("video/")) {
                return i11;
            }
        }
        return -5;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:15|16|17|18|(3:19|20|21)|(1:(1:24)(12:552|553|554|555|(1:557)|558|(3:31|32|33)(1:75)|34|(3:36|37|38)|42|43|44))(1:564)|25|26|(45:76|77|78|(3:508|509|(3:511|(3:513|(1:522)(1:519)|520)(2:523|(1:525)(2:526|(1:528)(2:529|(1:531)(2:532|(1:534)(1:535)))))|521)(2:536|537))(1:80)|81|82|83|84|(3:86|(2:88|89)|487)(3:488|(2:490|(1:492))(2:493|(2:500|89))|487)|90|91|92|93|94|95|96|(2:473|474)|98|99|100|101|102|(4:457|458|459|460)(1:104)|105|106|107|(2:109|110)(2:448|449)|112|113|114|115|116|117|118|(3:434|435|(10:437|122|(5:124|(4:126|(4:128|(6:130|(1:132)(1:421)|133|134|135|(3:137|138|139)(1:417))|422|139)(2:423|(2:425|(4:144|145|146|(1:(7:151|152|153|154|(1:156)(3:299|(3:407|408|(1:410))(2:301|(3:303|304|(3:307|308|309))(1:(4:317|318|(1:320)(1:403)|(9:322|323|(5:337|338|339|(4:341|342|343|(1:345))(2:350|(9:352|(3:356|(2:362|(5:364|365|366|367|368)(1:386))|387)|392|369|370|(1:373)|374|375|376))|346)(1:325)|326|327|(1:329)(1:336)|330|331|332)(3:400|401|402))(3:404|405|406)))|306)|(3:296|297|298)(9:158|159|160|161|162|(1:164)(3:169|(1:171)(2:173|(5:277|278|279|280|281)(2:175|(11:177|178|179|(3:181|(1:183)(1:255)|184)(3:256|(4:258|259|260|(1:262))(1:264)|263)|185|(4:198|199|200|(7:202|203|(7:205|206|207|208|209|(6:211|212|213|214|215|216)(1:241)|217)(2:247|(1:249)(1:250))|188|(3:190|(1:192)(2:194|(1:196))|193)(1:197)|166|167))|187|188|(0)(0)|166|167)(3:274|275|276)))|172)|165|166|167)|168)))))|140|(5:142|144|145|146|(8:(0)|151|152|153|154|(0)(0)|(0)(0)|168)))|431|146|(8:(0)|151|152|153|154|(0)(0)|(0)(0)|168))|432|433|222|(1:224)|(1:226)|(1:228)|(1:230))(1:438))(1:120)|121|122|(0)|432|433|222|(0)|(0)|(0)|(0))(1:28)|29|(0)(0)|34|(0)|42|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:1085:0x0858, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1086:0x0859, code lost:
        r14 = r9;
        r2 = "time = ";
        r11 = "tmessages";
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1087:0x085f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1088:0x0860, code lost:
        r14 = r9;
        r2 = "time = ";
        r11 = "tmessages";
        r1 = r15;
        r13 = r7;
        r12 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1091:0x086d, code lost:
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1094:0x087c, code lost:
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x03ce, code lost:
        r0 = r6;
        r8 = r7;
        r43 = r14;
        r7 = r44;
     */
    /* JADX WARN: Removed duplicated region for block: B:1054:0x07c3 A[Catch: all -> 0x07dc, Exception -> 0x07e7, TryCatch #10 {Exception -> 0x07e7, blocks: (B:1051:0x07b3, B:1052:0x07be, B:1054:0x07c3, B:1056:0x07c8, B:1058:0x07cd, B:1060:0x07d5), top: B:1144:0x07b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1056:0x07c8 A[Catch: all -> 0x07dc, Exception -> 0x07e7, TryCatch #10 {Exception -> 0x07e7, blocks: (B:1051:0x07b3, B:1052:0x07be, B:1054:0x07c3, B:1056:0x07c8, B:1058:0x07cd, B:1060:0x07d5), top: B:1144:0x07b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1058:0x07cd A[Catch: all -> 0x07dc, Exception -> 0x07e7, TryCatch #10 {Exception -> 0x07e7, blocks: (B:1051:0x07b3, B:1052:0x07be, B:1054:0x07c3, B:1056:0x07c8, B:1058:0x07cd, B:1060:0x07d5), top: B:1144:0x07b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1060:0x07d5 A[Catch: all -> 0x07dc, Exception -> 0x07e7, TRY_LEAVE, TryCatch #10 {Exception -> 0x07e7, blocks: (B:1051:0x07b3, B:1052:0x07be, B:1054:0x07c3, B:1056:0x07c8, B:1058:0x07cd, B:1060:0x07d5), top: B:1144:0x07b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1069:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:1076:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:1079:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:1108:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:1120:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:1166:0x08b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1170:0x0931 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1219:0x052b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1221:0x0519 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:778:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:813:0x03cb A[ADDED_TO_REGION, EDGE_INSN: B:813:0x03cb->B:1220:0x03ce ?: BREAK  ] */
    /* JADX WARN: Removed duplicated region for block: B:820:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:987:0x065b A[Catch: Exception -> 0x0716, all -> 0x07dc, TryCatch #14 {Exception -> 0x0716, blocks: (B:973:0x05ed, B:977:0x05fd, B:985:0x0655, B:987:0x065b, B:989:0x0666, B:990:0x066a, B:992:0x0672, B:980:0x0605, B:982:0x0618, B:983:0x0644, B:1000:0x06a8, B:1001:0x06c2, B:1007:0x06d3, B:1008:0x06f6, B:1009:0x06f7, B:1010:0x0715), top: B:1152:0x05ed }] */
    /* JADX WARN: Removed duplicated region for block: B:994:0x0683  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r51, java.lang.String r52, int r53, int r54, int r55, p30.a r56) {
        /*
            Method dump skipped, instructions count: 2398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: numan.dev.videocompressor.VideoController.a(java.lang.String, java.lang.String, int, int, int, p30.a):boolean");
    }
}