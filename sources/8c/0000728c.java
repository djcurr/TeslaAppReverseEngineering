package h30;

import ch.qos.logback.core.CoreConstants;
import kotlin.KotlinNothingValueException;

/* loaded from: classes5.dex */
public final class m extends f30.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f28852a;

    /* renamed from: b  reason: collision with root package name */
    private final i30.c f28853b;

    public m(a lexer, kotlinx.serialization.json.a json) {
        kotlin.jvm.internal.s.g(lexer, "lexer");
        kotlin.jvm.internal.s.g(json, "json");
        this.f28852a = lexer;
        this.f28853b = json.a();
    }

    @Override // f30.a, f30.e
    public byte F() {
        a aVar = this.f28852a;
        String r11 = aVar.r();
        try {
            return kotlin.text.z.a(r11);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UByte' for input '" + r11 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // f30.c
    public i30.c a() {
        return this.f28853b;
    }

    @Override // f30.a, f30.e
    public int g() {
        a aVar = this.f28852a;
        String r11 = aVar.r();
        try {
            return kotlin.text.z.d(r11);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UInt' for input '" + r11 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // f30.a, f30.e
    public long k() {
        a aVar = this.f28852a;
        String r11 = aVar.r();
        try {
            return kotlin.text.z.g(r11);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'ULong' for input '" + r11 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // f30.c
    public int p(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // f30.a, f30.e
    public short s() {
        a aVar = this.f28852a;
        String r11 = aVar.r();
        try {
            return kotlin.text.z.j(r11);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UShort' for input '" + r11 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}