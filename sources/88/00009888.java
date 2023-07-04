package org.spongycastle.asn1.eac;

import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes6.dex */
public class Flags {
    int value;

    /* loaded from: classes6.dex */
    private class StringJoiner {
        boolean First = true;

        /* renamed from: b  reason: collision with root package name */
        StringBuffer f43378b = new StringBuffer();
        String mSeparator;

        public StringJoiner(String str) {
            this.mSeparator = str;
        }

        public void add(String str) {
            if (this.First) {
                this.First = false;
            } else {
                this.f43378b.append(this.mSeparator);
            }
            this.f43378b.append(str);
        }

        public String toString() {
            return this.f43378b.toString();
        }
    }

    public Flags() {
        this.value = 0;
    }

    String decode(Hashtable hashtable) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            if (isSet(num.intValue())) {
                stringJoiner.add((String) hashtable.get(num));
            }
        }
        return stringJoiner.toString();
    }

    public int getFlags() {
        return this.value;
    }

    public boolean isSet(int i11) {
        return (i11 & this.value) != 0;
    }

    public void set(int i11) {
        this.value = i11 | this.value;
    }

    public Flags(int i11) {
        this.value = 0;
        this.value = i11;
    }
}