package io.grpc.okhttp.internal;

import java.io.IOException;

/* loaded from: classes5.dex */
public enum i {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    private final String protocol;

    i(String str) {
        this.protocol = str;
    }

    public static i get(String str) {
        i iVar = HTTP_1_0;
        if (str.equals(iVar.protocol)) {
            return iVar;
        }
        i iVar2 = HTTP_1_1;
        if (str.equals(iVar2.protocol)) {
            return iVar2;
        }
        i iVar3 = HTTP_2;
        if (str.equals(iVar3.protocol)) {
            return iVar3;
        }
        i iVar4 = SPDY_3;
        if (str.equals(iVar4.protocol)) {
            return iVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}