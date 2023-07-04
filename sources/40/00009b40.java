package org.spongycastle.crypto;

/* loaded from: classes4.dex */
public interface CharToByteConverter {
    byte[] convert(char[] cArr);

    String getType();
}