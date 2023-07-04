package expo.modules.crypto;

import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "byte", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
final class CryptoModule$digestStringAsync$output$1 extends u implements l<Byte, CharSequence> {
    public static final CryptoModule$digestStringAsync$output$1 INSTANCE = new CryptoModule$digestStringAsync$output$1();

    CryptoModule$digestStringAsync$output$1() {
        super(1);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b11) {
        return invoke(b11.byteValue());
    }

    public final CharSequence invoke(byte b11) {
        int a11;
        a11 = b.a(16);
        String num = Integer.toString((b11 & 255) + 256, a11);
        s.f(num, "toString(this, checkRadix(radix))");
        String substring = num.substring(1);
        s.f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }
}