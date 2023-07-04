package aj;

import ak.k0;
import com.google.common.base.f;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import wi.d;
import wi.g;

/* loaded from: classes3.dex */
public final class a extends g {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f415c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    private final CharsetDecoder f416a = f.f15920c.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    private final CharsetDecoder f417b = f.f15919b.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            return this.f416a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f417b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f417b.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f416a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // wi.g
    protected wi.a b(d dVar, ByteBuffer byteBuffer) {
        String c11 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c11 == null) {
            return new wi.a(new c(bArr, null, null));
        }
        Matcher matcher = f415c.matcher(c11);
        String str2 = null;
        for (int i11 = 0; matcher.find(i11); i11 = matcher.end()) {
            String R0 = k0.R0(matcher.group(1));
            String group = matcher.group(2);
            if (R0 != null) {
                if (R0.equals("streamurl")) {
                    str2 = group;
                } else if (R0.equals("streamtitle")) {
                    str = group;
                }
            }
        }
        return new wi.a(new c(bArr, str, str2));
    }
}