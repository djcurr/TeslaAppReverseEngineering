package yw;

import ezvcard.parameter.KeyType;
import ezvcard.property.Key;

/* loaded from: classes5.dex */
public class y extends d<Key, KeyType> {
    public y() {
        super(Key.class, "KEY");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: s */
    public KeyType i(String str) {
        return KeyType.f(null, null, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: t */
    public KeyType j(String str) {
        return KeyType.g(null, str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: u */
    public KeyType k(String str) {
        return KeyType.g(str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: v */
    public Key l(String str, KeyType keyType) {
        return new Key(str, keyType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: w */
    public Key m(byte[] bArr, KeyType keyType) {
        return new Key(bArr, keyType);
    }
}