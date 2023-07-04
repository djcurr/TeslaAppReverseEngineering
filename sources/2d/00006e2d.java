package fi;

import com.google.android.exoplayer2.decoder.DecoderException;

/* loaded from: classes3.dex */
public interface c<I, O, E extends DecoderException> {
    O b();

    void c(I i11);

    I d();

    void flush();

    void release();
}