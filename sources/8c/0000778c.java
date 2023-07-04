package io.grpc.okhttp.internal;

import java.net.ProtocolException;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final i f31567a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31568b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31569c;

    public j(i iVar, int i11, String str) {
        this.f31567a = iVar;
        this.f31568b = i11;
        this.f31569c = str;
    }

    public static j a(String str) {
        i iVar;
        String str2;
        int i11 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    iVar = i.HTTP_1_0;
                } else if (charAt == 1) {
                    iVar = i.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            iVar = i.HTTP_1_0;
            i11 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i12 = i11 + 3;
        if (str.length() >= i12) {
            try {
                int parseInt = Integer.parseInt(str.substring(i11, i12));
                if (str.length() <= i12) {
                    str2 = "";
                } else if (str.charAt(i12) == ' ') {
                    str2 = str.substring(i11 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new j(iVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
        throw new ProtocolException("Unexpected status line: " + str);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31567a == i.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f31568b);
        if (this.f31569c != null) {
            sb2.append(' ');
            sb2.append(this.f31569c);
        }
        return sb2.toString();
    }
}