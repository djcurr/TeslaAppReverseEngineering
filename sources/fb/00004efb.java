package com.stripe.android.link.account;

import h00.l;
import java.util.Arrays;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class CookieStore$sha256$1 extends u implements l<Byte, CharSequence> {
    public static final CookieStore$sha256$1 INSTANCE = new CookieStore$sha256$1();

    CookieStore$sha256$1() {
        super(1);
    }

    public final CharSequence invoke(byte b11) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
        s.f(format, "format(this, *args)");
        return format;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b11) {
        return invoke(b11.byteValue());
    }
}