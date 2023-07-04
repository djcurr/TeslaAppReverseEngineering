package com.stripe.android.core.model;

import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class Country {
    private final CountryCode code;
    private final String name;

    public Country(CountryCode code, String name) {
        s.g(code, "code");
        s.g(name, "name");
        this.code = code;
        this.name = name;
    }

    public static /* synthetic */ Country copy$default(Country country, CountryCode countryCode, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            countryCode = country.code;
        }
        if ((i11 & 2) != 0) {
            str = country.name;
        }
        return country.copy(countryCode, str);
    }

    public final CountryCode component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final Country copy(CountryCode code, String name) {
        s.g(code, "code");
        s.g(name, "name");
        return new Country(code, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Country) {
            Country country = (Country) obj;
            return s.c(this.code, country.code) && s.c(this.name, country.name);
        }
        return false;
    }

    public final CountryCode getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Country(String code, String name) {
        this(CountryCode.Companion.create(code), name);
        s.g(code, "code");
        s.g(name, "name");
    }
}