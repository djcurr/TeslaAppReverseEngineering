package com.nimbusds.jose.jwk;

import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public enum a {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");
    
    private final String identifier;

    a(String str) {
        if (str != null) {
            this.identifier = str;
            return;
        }
        throw new IllegalArgumentException("The key operation identifier must not be null");
    }

    public static Set<a> parse(List<String> list) {
        a aVar;
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : list) {
            if (str != null) {
                a[] values = values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i11];
                    if (str.equals(aVar.identifier())) {
                        break;
                    }
                    i11++;
                }
                if (aVar != null) {
                    linkedHashSet.add(aVar);
                } else {
                    throw new ParseException("Invalid JWK operation: " + str, 0);
                }
            }
        }
        return linkedHashSet;
    }

    public String identifier() {
        return this.identifier;
    }

    @Override // java.lang.Enum
    public String toString() {
        return identifier();
    }
}