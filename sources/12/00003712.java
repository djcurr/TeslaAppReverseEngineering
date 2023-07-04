package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class m extends h implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f15926a;

    /* loaded from: classes3.dex */
    private static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        final Matcher f15927a;

        a(Matcher matcher) {
            this.f15927a = (Matcher) u.o(matcher);
        }

        @Override // com.google.common.base.g
        public int a() {
            return this.f15927a.end();
        }

        @Override // com.google.common.base.g
        public boolean b(int i11) {
            return this.f15927a.find(i11);
        }

        @Override // com.google.common.base.g
        public boolean c() {
            return this.f15927a.matches();
        }

        @Override // com.google.common.base.g
        public int d() {
            return this.f15927a.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Pattern pattern) {
        this.f15926a = (Pattern) u.o(pattern);
    }

    @Override // com.google.common.base.h
    public g a(CharSequence charSequence) {
        return new a(this.f15926a.matcher(charSequence));
    }

    public String toString() {
        return this.f15926a.toString();
    }
}