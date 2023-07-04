package com.facebook.react.modules.network;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final CharsetDecoder f12065a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f12066b = null;

    public k(Charset charset) {
        this.f12065a = charset.newDecoder();
    }

    public String a(byte[] bArr, int i11) {
        byte[] bArr2 = this.f12066b;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i11];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.f12066b.length, i11);
            i11 += this.f12066b.length;
            bArr = bArr3;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i11);
        boolean z11 = true;
        boolean z12 = false;
        int i12 = 0;
        CharBuffer charBuffer = null;
        while (!z12 && i12 < 4) {
            try {
                charBuffer = this.f12065a.decode(wrap);
                z12 = true;
            } catch (CharacterCodingException unused) {
                i12++;
                wrap = ByteBuffer.wrap(bArr, 0, i11 - i12);
            }
        }
        if (!z12 || i12 <= 0) {
            z11 = false;
        }
        if (z11) {
            byte[] bArr4 = new byte[i12];
            this.f12066b = bArr4;
            System.arraycopy(bArr, i11 - i12, bArr4, 0, i12);
        } else {
            this.f12066b = null;
        }
        if (!z12) {
            nd.a.G("ReactNative", "failed to decode string from byte array");
            return "";
        }
        return new String(charBuffer.array(), 0, charBuffer.length());
    }
}