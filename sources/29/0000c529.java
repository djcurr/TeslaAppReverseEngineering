package zs;

import java.util.Arrays;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f60702a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f60703b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f60704c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f60705d;

    /* renamed from: e  reason: collision with root package name */
    private final String f60706e;

    public e(boolean z11, byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        this.f60702a = z11;
        this.f60703b = bArr;
        this.f60704c = bArr2;
        this.f60705d = bArr3;
        this.f60706e = str;
    }

    public final boolean a() {
        return this.f60702a;
    }

    public final byte[] b() {
        return this.f60703b;
    }

    public final byte[] c() {
        return this.f60704c;
    }

    public final byte[] d() {
        return this.f60705d;
    }

    public final String e() {
        return this.f60706e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f60702a == eVar.f60702a && s.c(this.f60703b, eVar.f60703b) && s.c(this.f60704c, eVar.f60704c) && s.c(this.f60705d, eVar.f60705d) && s.c(this.f60706e, eVar.f60706e);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z11 = this.f60702a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        byte[] bArr = this.f60703b;
        int hashCode = (i11 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        byte[] bArr2 = this.f60704c;
        int hashCode2 = (hashCode + (bArr2 == null ? 0 : Arrays.hashCode(bArr2))) * 31;
        byte[] bArr3 = this.f60705d;
        int hashCode3 = (hashCode2 + (bArr3 == null ? 0 : Arrays.hashCode(bArr3))) * 31;
        String str = this.f60706e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        boolean z11 = this.f60702a;
        String arrays = Arrays.toString(this.f60703b);
        String arrays2 = Arrays.toString(this.f60704c);
        String arrays3 = Arrays.toString(this.f60705d);
        String str = this.f60706e;
        return "SignedMessageResponse(success=" + z11 + ", signedMessage=" + arrays + ", nonce=" + arrays2 + ", tag=" + arrays3 + ", error=" + str + ")";
    }
}