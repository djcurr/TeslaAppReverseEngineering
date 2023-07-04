package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;

/* loaded from: classes3.dex */
public interface j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f13707a = new j() { // from class: vi.d
        @Override // com.google.android.exoplayer2.mediacodec.j
        public final List a(String str, boolean z11, boolean z12) {
            return MediaCodecUtil.r(str, z11, z12);
        }
    };

    List<i> a(String str, boolean z11, boolean z12);
}