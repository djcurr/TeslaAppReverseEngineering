package zq;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f60682a;

    /* renamed from: b  reason: collision with root package name */
    private String f60683b;

    /* renamed from: c  reason: collision with root package name */
    private MediaCodec.BufferInfo f60684c;

    /* renamed from: d  reason: collision with root package name */
    private MediaMuxer f60685d;

    /* renamed from: e  reason: collision with root package name */
    private MediaCodec f60686e;

    /* renamed from: f  reason: collision with root package name */
    private MediaCodec f60687f;

    /* renamed from: g  reason: collision with root package name */
    private int f60688g;

    /* renamed from: h  reason: collision with root package name */
    private int f60689h = -1;

    private boolean b(String str, String str2, int i11) {
        return i11 <= 0;
    }

    private void c(MediaFormat mediaFormat) {
        this.f60684c = new MediaCodec.BufferInfo();
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.f60689h, 1);
        Log.d("AudioCompressor", "format: " + createAudioFormat);
        createAudioFormat.setInteger("sample-rate", mediaFormat.getInteger("sample-rate"));
        createAudioFormat.setInteger("bitrate", mediaFormat.getInteger("bitrate"));
        createAudioFormat.setInteger("channel-count", mediaFormat.getInteger("channel-count"));
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setString("mime", "audio/mp4a-latm");
        createAudioFormat.setInteger("max-input-size", 10240);
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f60686e = createEncoderByType;
            createEncoderByType.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f60686e.start();
            Log.d("AudioCompressor", "prepareEncoder...");
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        try {
            this.f60687f = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
        } catch (IOException e12) {
            e12.printStackTrace();
        }
        this.f60687f.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
        this.f60687f.start();
    }

    private void d() {
        Log.d("AudioCompressor", "releasing encoder objects");
        MediaCodec mediaCodec = this.f60686e;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f60686e.release();
            this.f60686e = null;
        }
        MediaCodec mediaCodec2 = this.f60687f;
        if (mediaCodec2 != null) {
            mediaCodec2.stop();
            this.f60687f.release();
            this.f60687f = null;
        }
        MediaMuxer mediaMuxer = this.f60685d;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.f60685d.release();
            this.f60685d = null;
        }
    }

    private int e(MediaExtractor mediaExtractor, boolean z11) {
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
        return -233;
    }

    private long f(MediaExtractor mediaExtractor, MediaMuxer mediaMuxer, MediaCodec.BufferInfo bufferInfo, File file, int i11) {
        int e11 = e(mediaExtractor, true);
        if (e11 < 0) {
            return -1L;
        }
        mediaExtractor.getTrackFormat(e11);
        ByteBuffer allocate = ByteBuffer.allocate(bufferInfo.size);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        mediaExtractor.selectTrack(this.f60688g);
        while (true) {
            int readSampleData = mediaExtractor.readSampleData(allocate, 0);
            if (readSampleData < 0) {
                mediaExtractor.unselectTrack(this.f60688g);
                return -1L;
            }
            long sampleTime = mediaExtractor.getSampleTime();
            bufferInfo2.size = readSampleData;
            long j11 = sampleTime + 0;
            bufferInfo2.presentationTimeUs = j11;
            if (j11 > 0) {
                mediaExtractor.unselectTrack(e11);
                return -1L;
            }
            bufferInfo2.offset = 0;
            bufferInfo2.flags = mediaExtractor.getSampleFlags();
            mediaMuxer.writeSampleData(e11, allocate, bufferInfo2);
            mediaExtractor.advance();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x014a, code lost:
        r18 = r4;
        r5 = r19;
        r11 = r21;
        r10 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027d A[Catch: all -> 0x0324, Exception -> 0x0326, TryCatch #18 {Exception -> 0x0326, all -> 0x0324, blocks: (B:55:0x0120, B:57:0x0126, B:68:0x0154, B:123:0x027d, B:131:0x0298, B:134:0x02b7, B:138:0x02c0, B:140:0x02cd, B:142:0x02da, B:143:0x02f0, B:72:0x0171, B:74:0x0177, B:78:0x0188, B:80:0x0192, B:82:0x01a2, B:84:0x01a8, B:87:0x01b3, B:89:0x01ba, B:91:0x01c0, B:94:0x01cb, B:98:0x01e8, B:100:0x01ec, B:102:0x01f2, B:104:0x01f8, B:106:0x01fe, B:109:0x0237, B:112:0x0244, B:113:0x024e, B:115:0x025e, B:119:0x0269, B:107:0x0225, B:144:0x02f1, B:145:0x030c, B:85:0x01ab, B:146:0x030d, B:147:0x0323), top: B:225:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x042f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0431 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a A[Catch: all -> 0x013b, Exception -> 0x013e, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x013e, all -> 0x013b, blocks: (B:31:0x00c2, B:53:0x011a), top: B:231:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016f  */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r36, java.lang.String r37, int r38) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.a(java.lang.String, java.lang.String, int):boolean");
    }
}